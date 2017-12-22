package br.com.correios.api.postagem;

import static java.lang.String.format;

import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Optional;

import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ClienteRetornadoDosCorreiosToClienteConverter;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.exception.CorreiosPostagemAutenticacaoException;
import br.com.correios.api.postagem.plp.CorreiosLogToDocumentoPlpConverter;
import br.com.correios.api.postagem.plp.DocumentoPlp;
import br.com.correios.api.postagem.plp.NovaPlp;
import br.com.correios.api.postagem.plp.NovaPlpToCorreiosLogConverter;
import br.com.correios.api.postagem.plp.ObjetoPlp;
import br.com.correios.api.postagem.plp.Plp;
import br.com.correios.api.postagem.plp.PlpNaoFechadaException;
import br.com.correios.api.postagem.webservice.CorreiosClienteApi;
import br.com.correios.api.postagem.xml.Correioslog;
import br.com.correios.api.postagem.xml.XmlPlpParser;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.postagem.AutenticacaoException;
import br.com.correios.webservice.postagem.ClienteERP;
import br.com.correios.webservice.postagem.Exception_Exception;
import br.com.correios.webservice.postagem.SigepClienteException;

class SoapCorreiosServicoPostagemAPI implements CorreiosServicoPostagemAPI {

	private final CorreiosClienteApi clienteApi;
	private final CorreiosCredenciais credenciais;
	private final ClienteRetornadoDosCorreiosToClienteConverter clienteEmpresaConverter;
	private final XmlPlpParser xmlPlpParser;
	private final CorreiosLogToDocumentoPlpConverter documentoPlpConverter;
	private final NovaPlpToCorreiosLogConverter correiosPlpConverter;

	SoapCorreiosServicoPostagemAPI(CorreiosCredenciais credenciais, CorreiosClienteApi clienteApi,
			ClienteRetornadoDosCorreiosToClienteConverter clienteEmpresaConverter, XmlPlpParser xmlPlpParser,
			CorreiosLogToDocumentoPlpConverter documentoPlpConverter,
			NovaPlpToCorreiosLogConverter correiosPlpConverter) {

		this.credenciais = credenciais;
		this.clienteApi = clienteApi;
		this.clienteEmpresaConverter = clienteEmpresaConverter;
		this.xmlPlpParser = xmlPlpParser;
		this.documentoPlpConverter = documentoPlpConverter;
		this.correiosPlpConverter = correiosPlpConverter;
	}

	@Override
	public Optional<ClienteEmpresa> buscaCliente(ContratoEmpresa contratoEmpresa) {
		try {
			ClienteERP clienteRetornadoDosCorreios = clienteApi.getCorreiosWebService().buscaCliente(contratoEmpresa.getContrato(), contratoEmpresa.getCartaoDePostagem(), credenciais.getUsuario(), credenciais.getSenha());

			return Optional.fromNullable(clienteRetornadoDosCorreios).transform(clienteEmpresaConverter::convert)
						   .transform(Optional::of).or(Optional.<ClienteEmpresa>absent());

		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o servico com as informacoes de cliente %s", contratoEmpresa), e);
		}
	}

	@Override
	public Optional<DocumentoPlp> buscaDocumentoPlp(Long plpId) {
		try {
			String xmlPlp = clienteApi.getCorreiosWebService().solicitaXmlPlp(plpId, credenciais.getUsuario(), credenciais.getSenha());

			return getDocumentoPlpValidadoAPartirDo(xmlPlp);

		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o servico com o PLP de id %d", plpId), e);
		}
	}

	@Override
	public Optional<DocumentoPlp> buscaDocumentoPlp(Long plpId, String etiqueta) {
		try {
			String xmlPlp = clienteApi.getCorreiosWebService().solicitaPLP(plpId, etiqueta, credenciais.getUsuario(), credenciais.getSenha());

			return getDocumentoPlpValidadoAPartirDo(xmlPlp);

		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o servico com o PLP de id %d", plpId), e);
		}
	}

	@Override
	public boolean cancelaObjetoDaPlp(Long plpId, String numeroEtiqueta) {
		try {
			return clienteApi.getCorreiosWebService().cancelarObjeto(plpId, numeroEtiqueta, credenciais.getUsuario(), credenciais.getSenha());
		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (Exception_Exception | SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o servico com o PLP de id %d, etiqueta %s", plpId, numeroEtiqueta), e);
		}
	}

	private Optional<DocumentoPlp> getDocumentoPlpValidadoAPartirDo(String xmlPlp) {
		boolean xmlPlpDosCorreiosEstaValido = xmlPlp != null && !xmlPlp.isEmpty();

		if (xmlPlpDosCorreiosEstaValido) {
			Optional<Correioslog> correiosLog = xmlPlpParser.getObjectFrom(xmlPlp);

			if (correiosLog.isPresent() && correiosLog.get().getPlp() != null) {
				return Optional.of(documentoPlpConverter.convert(correiosLog.get()));
			}
		}

		return Optional.absent();
	}

	@Override
	public Plp fechaPlp(String cartaoDePostagem, Long codigoPlpCliente, NovaPlp novaPlp) {
		try {
			Correioslog correiosLog = correiosPlpConverter.convert(novaPlp);

			List<String> etiquetasSemDigitoVerificador = new LinkedList<>();

			for (ObjetoPlp objetoPlp : novaPlp.getObjetosPlp()) {
				etiquetasSemDigitoVerificador.add(objetoPlp.getNumeroDaEtiquetaSemDigitoVerificador());
			}

			String xmlFrom = xmlPlpParser.getXmlFrom(correiosLog);

			Long plpId = clienteApi.getCorreiosWebService()
					  		 	   .fechaPlpVariosServicos(xmlFrom, codigoPlpCliente, cartaoDePostagem, etiquetasSemDigitoVerificador, credenciais.getUsuario(), credenciais.getSenha());

			return new Plp(plpId);
		} catch (Exception e) {
			throw new PlpNaoFechadaException(e);
		}
	}

}
