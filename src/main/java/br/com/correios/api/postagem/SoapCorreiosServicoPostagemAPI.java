package br.com.correios.api.postagem;

import static java.lang.String.format;

import com.google.common.base.Optional;

import br.com.correios.api.converter.Converter;
import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.exception.CorreiosPostagemAutenticacaoException;
import br.com.correios.api.postagem.plp.DocumentoPlp;
import br.com.correios.api.postagem.webservice.CorreiosClienteApi;
import br.com.correios.api.postagem.xml.Correioslog;
import br.com.correios.api.postagem.xml.XmlPlpParser;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.postagem.AutenticacaoException;
import br.com.correios.webservice.postagem.ClienteERP;
import br.com.correios.webservice.postagem.Exception_Exception;
import br.com.correios.webservice.postagem.SigepClienteException;

import java.util.List;

class SoapCorreiosServicoPostagemAPI implements CorreiosServicoPostagemAPI {

	private final CorreiosClienteApi clienteApi;
	private final CorreiosCredenciais credenciais;
	private final Converter<ClienteERP, ClienteEmpresa> clienteEmpresaConverter;
	private final XmlPlpParser xmlPlpParser;
	private final Converter<Correioslog, Optional<DocumentoPlp>> documentoPlpConverter;

	SoapCorreiosServicoPostagemAPI(CorreiosCredenciais credenciais,
									CorreiosClienteApi clienteApi,
									Converter<ClienteERP, ClienteEmpresa> clienteEmpresaConverter,
									XmlPlpParser xmlPlpParser,
									Converter<Correioslog, Optional<DocumentoPlp>> documentoPlpConverter) {

		this.credenciais = credenciais;
		this.clienteApi = clienteApi;
		this.clienteEmpresaConverter = clienteEmpresaConverter;
		this.xmlPlpParser = xmlPlpParser;
		this.documentoPlpConverter = documentoPlpConverter;
	}

	@Override
	public Optional<ClienteEmpresa> buscaCliente(ContratoEmpresa contratoEmpresa) {
		try {
			ClienteERP clienteRetornadoDosCorreios = clienteApi.getCorreiosWebService().buscaCliente(contratoEmpresa.getContrato(), contratoEmpresa.getCartaoDePostagem(), credenciais.getUsuario(), credenciais.getSenha());

			return Optional.fromNullable(clienteRetornadoDosCorreios)
						   .transform(clienteEmpresaConverter::convert)
						   .transform(Optional::of)
						   .or(Optional.<ClienteEmpresa>absent());

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

			boolean xmlPlpDosCorreiosEstaValido = xmlPlp != null && !xmlPlp.isEmpty();

			if (xmlPlpDosCorreiosEstaValido) {
				return xmlPlpParser.convert(xmlPlp)
								   .transform(documentoPlpConverter::convert)
								   .or(Optional.<DocumentoPlp>absent());
			}
		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o servico com o PLP de id %d", plpId), e);
		}

		return Optional.absent();
	}

	@Override
	public Optional<DocumentoPlp> buscaDocumentoPlp(Long plpId, String etiqueta) {
		try {
			String xmlPlp = clienteApi.getCorreiosWebService().solicitaPLP(plpId, etiqueta, credenciais.getUsuario(), credenciais.getSenha());

			boolean xmlPlpDosCorreiosEstaValido = xmlPlp != null && !xmlPlp.isEmpty();

			if (xmlPlpDosCorreiosEstaValido) {
				//para corrigir xml prolog inconsistente do Correios
				xmlPlp = xmlPlp.replaceFirst("<\\?xml.*?\\?>", "").trim();

				return xmlPlpParser.convert(xmlPlp)
								   .transform(documentoPlpConverter::convert)
								   .or(Optional.<DocumentoPlp>absent());
			}
		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o servico com o PLP de id %d", plpId), e);
		}

		return Optional.absent();
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

	@Override
	public Long fechaPlpVariosServicos(String xml, Long plpId, String cartaoPostagem, List<String> listaEtiquetas) {
		try {
			return clienteApi.getCorreiosWebService().fechaPlpVariosServicos(xml, plpId, cartaoPostagem, listaEtiquetas, credenciais.getUsuario(), credenciais.getSenha());
		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o servico com o PLP de id %d", plpId), e);
		}
	}

}
