package br.com.correios.api.postagem;

import static java.lang.String.format;

import java.util.List;

import com.google.common.base.Optional;

import br.com.correios.api.etiqueta.Etiqueta;
import br.com.correios.api.etiqueta.RangeDeEtiqueta;
import br.com.correios.api.etiqueta.TipoDestinatario;
import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ClienteInformacao;
import br.com.correios.api.postagem.cliente.ClienteRetornadoDosCorreiosToClienteConverter;
import br.com.correios.api.postagem.exception.CorreiosEtiquetaException;
import br.com.correios.api.postagem.exception.CorreiosPostagemAutenticacaoException;
import br.com.correios.api.postagem.exception.CorreiosPostagemDadosInvalidosException;
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

public class CorreiosPostagemApi implements PostagemApi {

	private CorreiosCredenciais credenciais;

	private CorreiosClienteApi clienteApi;

	public CorreiosPostagemApi(CorreiosCredenciais credenciais) {
		this.credenciais = credenciais;
		this.clienteApi = new CorreiosClienteWebService();
	}

	public CorreiosPostagemApi(CorreiosCredenciais credenciais, CorreiosClienteApi clienteApi) {
		this.credenciais = credenciais;
		this.clienteApi = clienteApi;
	}

	@Override
	public Optional<ClienteEmpresa> buscaCliente(ClienteInformacao informacao) {
		try {
			ClienteERP clienteRetornadoDosCorreios = clienteApi
					.getCorreiosWebService()
					.buscaCliente(informacao.getContrato(), informacao.getCartaoDePostagem(), credenciais.getUsuario(), credenciais.getSenha());

			if (clienteRetornadoDosCorreios != null) {
 				ClienteEmpresa cliente = new ClienteRetornadoDosCorreiosToClienteConverter().convert(clienteRetornadoDosCorreios);
				return Optional.of(cliente);
			}
		} catch (AutenticacaoException e) {
			throw new CorreiosPostagemAutenticacaoException(format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: %s", credenciais));
		} catch (SigepClienteException e) {
			throw new CorreiosServicoSoapException(format("Ocorreu um erro ao chamar o servi�o com as informa��es de cliente %s", informacao), e);
		} catch (Exception e) {
			return Optional.absent();
		}
		return Optional.absent();
	}

	@Override
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

	@Override
	public List<Etiqueta> solicitaEtiquetas(ClienteInformacao informacoesDeCadastro, TipoDestinatario destinatario, TipoServicoDeEntrega tipoDeEntrega, String cnpj, Integer quantidadeDesejadaDeEtiquetas) {
		try {
			Optional<ClienteEmpresa> clienteOptional = buscaCliente(informacoesDeCadastro);
			if (!clienteOptional.isPresent()) {
				throw new CorreiosPostagemDadosInvalidosException("As informacoes enviadas de Contrato e Cartão de Postagem não retornaram um cliente");
			}
			Optional<Long> servicoIdOptional = clienteOptional.get().getServicoIdPeloCodigo(tipoDeEntrega.getCodigoDoContrato());
			if (!servicoIdOptional.isPresent()) {
				throw new CorreiosPostagemDadosInvalidosException("As informacoes enviadas de Contrato e Cartão de Postagem não retornaram um servico válido");
			}

			String offsetDosCorreios = clienteApi
				.getCorreiosWebService()
				.solicitaEtiquetas(destinatario.getCodigoDoDestinatario(), cnpj, servicoIdOptional.get(), quantidadeDesejadaDeEtiquetas, credenciais.getUsuario(), credenciais.getSenha());

			RangeDeEtiqueta rangeDeEtiqueta = new RangeDeEtiqueta(offsetDosCorreios);
			List<Etiqueta> etiquetas = rangeDeEtiqueta.getEtiquetas();

			return etiquetas;
		} catch (Exception e) {
			throw new CorreiosEtiquetaException("Ocorreu um erro ao solicitar Etiquetas para os Correios", e);
		}
	}

}
