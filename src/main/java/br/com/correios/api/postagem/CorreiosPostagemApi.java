package br.com.correios.api.postagem;

import com.google.common.base.Optional;

import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ClienteRetornadoDosCorreiosToClienteConverter;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.exception.ObjetoPlpFoiPostadoException;
import br.com.correios.api.postagem.exception.ObjetoPlpJaFoiCanceladoException;
import br.com.correios.api.postagem.plp.CorreiosLogToPlpDocumentoConverter;
import br.com.correios.api.postagem.plp.DocumentoPlp;
import br.com.correios.api.postagem.plp.ObjetoPostado;
import br.com.correios.api.postagem.webservice.CorreiosClienteWebService;
import br.com.correios.api.postagem.xml.XmlPlpParser;
import br.com.correios.credentials.CorreiosCredenciais;

/**
 * Responsavel por chamar a API de postagem dos Correios
 *
 * @since 0.0.13-BETA
 */
public class CorreiosPostagemApi {

	private final CorreiosServicoPostagemAPI correiosServicoPostagemAPI;

	public CorreiosPostagemApi(CorreiosCredenciais credenciais) {
		this.correiosServicoPostagemAPI = new SoapCorreiosServicoPostagemAPI(credenciais, new CorreiosClienteWebService(), new ClienteRetornadoDosCorreiosToClienteConverter(), new XmlPlpParser(), new CorreiosLogToPlpDocumentoConverter());
	}

	/**
	 * @return os serviços disponíveis no contrato para um determinado {@link ContratoEmpresa} caso haja.
	 */
	public Optional<ClienteEmpresa> buscaCliente(ContratoEmpresa informacoesDeCadastro) {
		return correiosServicoPostagemAPI.buscaCliente(informacoesDeCadastro);
	}

	public Optional<DocumentoPlp> buscaDocumentoPlp(Long plpId) {
		return correiosServicoPostagemAPI.buscaDocumentoPlp(plpId);
	}

	/**
	 * Cancela um objeto de uma PLP atraves do ID do PLP e o numero da etiqueta
	 * do objeto
	 * @param plpId da PLP que possui o objeto a ser cancelado
	 * @param numeroEtiqueta relacionada ao objeto a ser cancelado
	 * @throws ObjetoPlpFoiPostadoException se o objeto foi postado, por isso o mesmo nao pode ser cancelado
	 * @throws ObjetoPlpJaFoiCanceladoException se o objeto ja foi cancelado
	 */
	public void cancelaObjetoDaPlp(Long plpId, String numeroEtiqueta) throws ObjetoPlpFoiPostadoException, ObjetoPlpJaFoiCanceladoException {
		try {
			correiosServicoPostagemAPI.cancelaObjetoDaPlp(plpId, numeroEtiqueta);
		} catch (CorreiosServicoSoapException exceptionCancelamento) {

			try {
				Optional<ObjetoPostado> objeto = correiosServicoPostagemAPI.buscaDocumentoPlp(plpId)
									  .transform(documentoPlp -> documentoPlp.getObjetoPostadoComEtiqueta(numeroEtiqueta))
									  .or(Optional.<ObjetoPostado>absent());

				if (objeto.isPresent() && objeto.get().isPostado()) {
					throw new ObjetoPlpFoiPostadoException(String.format("objeto com etiqueta %s da PLP %d nao pode ser cancelado porque este foi postado", numeroEtiqueta, plpId), exceptionCancelamento);
				}
				throw exceptionCancelamento;

			} catch (CorreiosServicoSoapException exceptionBusca) {
				throw new ObjetoPlpJaFoiCanceladoException(String.format("objeto com etiqueta %s da PLP %d ja foi cancelado", numeroEtiqueta, plpId), exceptionCancelamento);
			}
		}
	}

}
