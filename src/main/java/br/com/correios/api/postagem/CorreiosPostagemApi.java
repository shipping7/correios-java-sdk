package br.com.correios.api.postagem;

import static java.lang.String.format;

import com.google.common.base.Optional;

import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ClienteRetornadoDosCorreiosToClienteConverter;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.exception.CorreiosPostagemAutenticacaoException;
import br.com.correios.api.postagem.plp.CorreiosLogToPlpDocumentoConverter;
import br.com.correios.api.postagem.plp.DocumentoPlp;
import br.com.correios.api.postagem.webservice.CorreiosClienteApi;
import br.com.correios.api.postagem.webservice.CorreiosClienteWebService;
import br.com.correios.api.postagem.xml.Correioslog;
import br.com.correios.api.postagem.xml.XmlPlpParser;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.postagem.AutenticacaoException;
import br.com.correios.webservice.postagem.ClienteERP;
import br.com.correios.webservice.postagem.SigepClienteException;

/**
 * Responsavel por chamar a API de postagem dos Correios
 *
 * @since 0.0.13-BETA
 */
public class CorreiosPostagemApi {

	private final CorreiosCredenciais credenciais;
	private final CorreiosClienteApi clienteApi;

	public CorreiosPostagemApi(CorreiosCredenciais credenciais) {
		this(credenciais, new CorreiosClienteWebService());
	}

	public CorreiosPostagemApi(CorreiosCredenciais credenciais, CorreiosClienteApi clienteApi) {
		this.credenciais = credenciais;
		this.clienteApi = clienteApi;
	}

	/**
	 * @return os serviços disponíveis no contrato para um determinado {@link ContratoEmpresa} caso haja.
	 */
	public Optional<ClienteEmpresa> buscaCliente(ContratoEmpresa informacoesDeCadastro) {
		try {
			ClienteERP clienteRetornadoDosCorreios = clienteApi
					.getCorreiosWebService()
					.buscaCliente(informacoesDeCadastro.getContrato(), informacoesDeCadastro.getCartaoDePostagem(), credenciais.getUsuario(), credenciais.getSenha());

			if (clienteRetornadoDosCorreios != null) {
 				ClienteEmpresa cliente = new ClienteRetornadoDosCorreiosToClienteConverter().convert(clienteRetornadoDosCorreios);
				return Optional.of(cliente);
			}
		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o serviço com as informações de cliente %s", informacoesDeCadastro), e);
		} catch (Exception e) {
			return Optional.absent();
		}
		return Optional.absent();
	}

	public Optional<DocumentoPlp> buscaDocumentoPlp(Long plpId) {
		try {
			String xmlPlp = clienteApi
				.getCorreiosWebService()
				.solicitaXmlPlp(plpId, credenciais.getUsuario(), credenciais.getSenha());

			boolean xmlPlpDosCorreiosEstaValido = xmlPlp != null && !xmlPlp.isEmpty();

			if (xmlPlpDosCorreiosEstaValido) {
				Optional<Correioslog> correiosPlp = new XmlPlpParser().convert(xmlPlp);

				if (correiosPlp.isPresent()) {
					return new CorreiosLogToPlpDocumentoConverter().convert(correiosPlp.get());
				}
			}
		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o serviço com o PLP de id %d", plpId), e);
		} catch (Exception e) {
			return Optional.absent();
		}
		return Optional.absent();
	}

}
