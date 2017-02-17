package br.com.correios.api.etiqueta;

import java.util.List;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.CorreiosPostagemApi;
import br.com.correios.api.postagem.TipoServicoDeEntrega;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ClienteInformacao;
import br.com.correios.api.postagem.exception.CorreiosEtiquetaException;
import br.com.correios.api.postagem.exception.CorreiosPostagemDadosInvalidosException;
import br.com.correios.api.postagem.webservice.CorreiosClienteApi;
import br.com.correios.api.postagem.webservice.CorreiosClienteWebService;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosEtiquetaApi implements EtiquetaApi {

	private CorreiosCredenciais credenciais;

	private CorreiosClienteApi clienteApi;

	public CorreiosEtiquetaApi(CorreiosCredenciais credenciais) {
		this.credenciais = credenciais;
		this.clienteApi = new CorreiosClienteWebService();
	}

	public CorreiosEtiquetaApi(CorreiosCredenciais credenciais, CorreiosClienteApi clienteApi) {
		this.credenciais = credenciais;
		this.clienteApi = clienteApi;
	}

	@Override
	public List<Etiqueta> solicitaEtiquetas(ClienteInformacao informacoesDeCadastro, TipoDestinatario destinatario,
			TipoServicoDeEntrega tipoDeEntrega, String cnpj, Integer quantidadeDesejadaDeEtiquetas) {
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

	private Optional<ClienteEmpresa> buscaCliente(ClienteInformacao informacoesDeCadastro) {
		CorreiosPostagemApi correiosPostagemApi = new CorreiosPostagemApi(credenciais);

		Optional<ClienteEmpresa> empresa = correiosPostagemApi.buscaCliente(informacoesDeCadastro);

		return empresa;
	}

}
