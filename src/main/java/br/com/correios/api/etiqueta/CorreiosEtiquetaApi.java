package br.com.correios.api.etiqueta;

import br.com.correios.api.postagem.CorreiosPostagemApi;
import br.com.correios.api.postagem.adicional.ServicoCorreio;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.exception.CorreiosEtiquetaDadosInvalidosException;
import br.com.correios.api.postagem.exception.CorreiosEtiquetaException;
import br.com.correios.api.postagem.webservice.CorreiosClienteApi;
import br.com.correios.api.postagem.webservice.CorreiosClienteWebService;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.postagem.AutenticacaoException;
import br.com.correios.webservice.postagem.SigepClienteException;
import com.google.common.base.Optional;

import java.util.ArrayList;
import java.util.List;

import static br.com.correios.api.etiqueta.TipoDestinatario.CLIENTE;

/**
 * Classe que deve ser usada para as chamadas a API de etiqueta dos Correios
 *
 * @since 0.0.13-BETA
 */
public class CorreiosEtiquetaApi {

	private final CorreiosCredenciais credenciais;
	private final CorreiosClienteApi clienteApi;

	public CorreiosEtiquetaApi(CorreiosCredenciais credenciais) {
		this(credenciais, new CorreiosClienteWebService());
	}

	public CorreiosEtiquetaApi(CorreiosCredenciais credenciais, CorreiosClienteApi clienteApi) {
		this.credenciais = credenciais;
		this.clienteApi = clienteApi;
	}

	public SolicitaEtiquetaBuilder solicita(int quantidadeDeEtiquetas) {
		return new SolicitaEtiquetaBuilder(quantidadeDeEtiquetas);
	}

	public class SolicitaEtiquetaBuilder {

		private final int quantidadeDeEtiquetas;

		public SolicitaEtiquetaBuilder(int quantidadeDeEtiquetas) {
			this.quantidadeDeEtiquetas = quantidadeDeEtiquetas;
		}

		public SolicitaEtiquetaBuilderComIdentificador usandoIdDoServicoDeEntrega(Long idDoServicoDeEntrega) {
			return new SolicitaEtiquetaBuilderComIdentificador(quantidadeDeEtiquetas, idDoServicoDeEntrega);
		}

	}

	public class SolicitaEtiquetaBuilderComIdentificador {

		private final Integer quantidade;
		private final Long idDoServicoDeEntrega;

		private SolicitaEtiquetaBuilderComIdentificador(Integer quantidade, Long idDoServicoDeEntrega) {
			this.quantidade = quantidade;
			this.idDoServicoDeEntrega = idDoServicoDeEntrega;
		}

		public List<Etiqueta> comContrato(ContratoEmpresa contrato) {
			List<Etiqueta> etiquetas;
			String offsetDosCorreios;

			Optional<ClienteEmpresa> clienteOptional = buscaClienteCom(contrato);
			if (!clienteOptional.isPresent()) {
				throw new CorreiosEtiquetaDadosInvalidosException("As informações enviadas de Contrato não retornaram um cliente dos Correios");
			}
			Optional<ServicoCorreio> servicoOptional = clienteOptional.get().getServicoPeloId(idDoServicoDeEntrega);
			if (!servicoOptional.isPresent()) {
				throw new CorreiosEtiquetaDadosInvalidosException("As informações enviadas de Contrato não retornaram um servico válido dos Correios");
			}

			try {
				offsetDosCorreios = clienteApi
						.getCorreiosWebService()
						.solicitaEtiquetas(CLIENTE.getCodigoDoDestinatario(), contrato.getCnpj(), servicoOptional.get().getId(), quantidade, credenciais.getUsuario(), credenciais.getSenha());
			} catch(AutenticacaoException e) {
				throw new CorreiosEtiquetaException(e.getFaultInfo(), e);
			} catch(SigepClienteException e) {
				throw new CorreiosEtiquetaException(e.getFaultInfo(), e);
			}

			try {
				etiquetas = EtiquetaGenerator.geraEtiquetasDo(offsetDosCorreios);
			} catch (Exception e) {
				throw new CorreiosEtiquetaException("Ocorreu um erro ao gerar Etiquetas para os Correios", e);
			}

			return etiquetas;
		}

	}

	private Optional<ClienteEmpresa> buscaClienteCom(ContratoEmpresa informacoesDeCadastro) {
		CorreiosPostagemApi correiosPostagemApi = new CorreiosPostagemApi(credenciais);

		return correiosPostagemApi.buscaCliente(informacoesDeCadastro);
	}

}
