package br.com.correios.api.etiqueta;

import static br.com.correios.api.etiqueta.TipoDestinatario.CLIENTE;

import java.util.List;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.CorreiosPostagemApi;
import br.com.correios.api.postagem.TipoServicoDeEntrega;
import br.com.correios.api.postagem.adicional.ServicoCorreio;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.exception.CorreiosEtiquetaDadosInvalidosException;
import br.com.correios.api.postagem.exception.CorreiosEtiquetaException;
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
	public EtiquetaBuilder solicita() {
		return new EtiquetaBuilder();
	}

	public class EtiquetaBuilder {

		private Integer quantidade;

		public EtiquetaBuilderComServico retornando(Integer quantideDesejadaDeEtiquetas) {
			this.quantidade = quantideDesejadaDeEtiquetas;
			return new EtiquetaBuilderComServico(quantidade);
		}

	}

	public class EtiquetaBuilderComServico {

		private Integer quantidade;

		public EtiquetaBuilderComServico(Integer quantidadeDeEtiquetas) {
			this.quantidade = quantidadeDeEtiquetas;
		}

		public EtiquetaBuilderComIdentificador usandoServicoDeEntrega(TipoServicoDeEntrega servicoDeEntrega) {
			return new EtiquetaBuilderComIdentificador(quantidade, servicoDeEntrega);
		}

	}

	public class EtiquetaBuilderComIdentificador {

		private Integer quantidade;
		private TipoServicoDeEntrega servicoDeEntrega;

		public EtiquetaBuilderComIdentificador(Integer quantidade, TipoServicoDeEntrega servicoDeEntrega) {
			this.quantidade = quantidade;
			this.servicoDeEntrega = servicoDeEntrega;
		}

		public List<Etiqueta> comContrato(ContratoEmpresa contrato) {
			try {
				Optional<ClienteEmpresa> clienteOptional = buscaClienteCom(contrato);
				if (!clienteOptional.isPresent()) {
					throw new CorreiosEtiquetaDadosInvalidosException("As informações enviadas de Contrato não retornaram um cliente dos Correios");
				}
				Optional<ServicoCorreio> servicoOptional = clienteOptional.get().getServicoPeloCodigo(servicoDeEntrega.getCodigoDoContrato());
				if (!servicoOptional.isPresent()) {
					throw new CorreiosEtiquetaDadosInvalidosException("As informações enviadas de Contrato não retornaram um servico válido dos Correios");
				}

				String offsetDosCorreios = clienteApi
					.getCorreiosWebService()
					.solicitaEtiquetas(CLIENTE.getCodigoDoDestinatario(), contrato.getCnpj(), servicoOptional.get().getId(), quantidade, credenciais.getUsuario(), credenciais.getSenha());

				List<Etiqueta> etiquetas = EtiquetaGenerator.geraEtiquetasDo(offsetDosCorreios);

				return etiquetas;
			} catch (Exception e) {
				throw new CorreiosEtiquetaException("Ocorreu um erro ao solicitar Etiquetas para os Correios", e);
			}
		}

	}

	private Optional<ClienteEmpresa> buscaClienteCom(ContratoEmpresa informacoesDeCadastro) {
		CorreiosPostagemApi correiosPostagemApi = new CorreiosPostagemApi(credenciais);

		Optional<ClienteEmpresa> empresa = correiosPostagemApi.buscaCliente(informacoesDeCadastro);

		return empresa;
	}

}
