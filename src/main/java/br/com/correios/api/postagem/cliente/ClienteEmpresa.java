package br.com.correios.api.postagem.cliente;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.Calendar;
import java.util.List;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.adicional.ServicoCorreio;
import br.com.correios.api.postagem.cartao.StatusDoCartaoDaPostagem;
import br.com.correios.api.postagem.contrato.Contrato;
import br.com.correios.api.postagem.gerente.GerenteDeConta;

public class ClienteEmpresa {

	private long id;

	private String nome;

	private String cnpj;

	private List<Contrato> contratos;

	private Calendar dataAtualizacao;

	private StatusDoCartaoDaPostagem status;

	private List<GerenteDeConta> gerentesDeConta;

	private InscricaoEstadual inscricaoEstadual;

	public ClienteEmpresa(long id, String nome, String cnpj, List<Contrato> contratos, Calendar dataAtualizacao,
			StatusDoCartaoDaPostagem status, List<GerenteDeConta> gerenteConta, InscricaoEstadual inscricaoEstadual) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.contratos = contratos;
		this.dataAtualizacao = dataAtualizacao;
		this.status = status;
		this.gerentesDeConta = gerenteConta;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	private ClienteEmpresa() {}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	public StatusDoCartaoDaPostagem getStatus() {
		return status;
	}

	public List<GerenteDeConta> getGerentesDeConta() {
		return gerentesDeConta;
	}

	public InscricaoEstadual getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public static ClienteEmpresaBuilder novoCliente() {
		return new ClienteEmpresaBuilder();
	}

	public static class ClienteEmpresaBuilder {

		private ClienteEmpresa cliente;

		public ClienteEmpresaBuilder() {
			this.cliente = new ClienteEmpresa();
		}

		public ClienteEmpresaBuilder comId(long id) {
			cliente.id = id;
			return this;
		}

		public ClienteEmpresaBuilder comNome(String nome) {
			cliente.nome = nome;
			return this;
		}

		public ClienteEmpresaBuilder comCnpj(String cnpj) {
			cliente.cnpj = cnpj;
			return this;
		}

		public ClienteEmpresaBuilder possuindoOsContratos(List<Contrato> contratos) {
			cliente.contratos = contratos;
			return this;
		}

		public ClienteEmpresaBuilder atualizadoNaData(Calendar data) {
			this.cliente.dataAtualizacao = data;
			return this;
		}

		public ClienteEmpresaBuilder comStatus(StatusDoCartaoDaPostagem status) {
			this.cliente.status = status;
			return this;
		}

		public ClienteEmpresaBuilder pertencendoAosGerentes(List<GerenteDeConta> gerentes) {
			this.cliente.gerentesDeConta = gerentes;
			return this;
		}

		public ClienteEmpresaBuilder comInscricaoEstadual(String inscricaoEstadual) {
			this.cliente.inscricaoEstadual = new InscricaoEstadual(inscricaoEstadual);
			return this;
		}

		public ClienteEmpresa build() {
			return this.cliente;
		}
	}

	public Optional<ServicoCorreio> getServicoPeloId(Long idDoDestinatario) {
		for (Contrato contrato: contratos) {
			Optional<ServicoCorreio> servico = contrato.retornaServicoPelo(idDoDestinatario);
			if (servico.isPresent()) {
				return servico;
			}
		}
		return Optional.absent();
	}

	@Override
	public String toString() {
		return toStringHelper(this)
			.add("id", this.id)
			.add("nome", this.nome)
			.add("cnpj", this.cnpj)
			.toString();
	}

}
