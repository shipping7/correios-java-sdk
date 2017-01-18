package br.com.correios.api.postagem;

import java.util.Calendar;
import java.util.List;

public class CartaoPostagem {

	private String codigoAdministrativo;

	// TODO Um Contrato ja possui uma lista de CartaoPostagem, provavelmente
	// podemos remover esse aqui
	private List<Contrato> contratos;

	private Calendar dataAtualizacao;

	private DataVigencia dataDaVigencia;

	private String descricaoUnidadePostagemGenerica;

	private String numero;

	private List<ServicoCorreio> servicos;

	private String statusCartaoPostagem;

	private Status status;

	private String unidadeGenerica;

	private List<UnidadePostagem> unidadesPostagem;

	private CartaoPostagem() {
	}

	public Status getStatus() {
		return status;
	}

	public String getCodigoAdministrativo() {
		return codigoAdministrativo;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	public DataVigencia getDataDaVigencia() {
		return dataDaVigencia;
	}

	public String getDescricaoUnidadePostagemGenerica() {
		return descricaoUnidadePostagemGenerica;
	}

	public String getNumero() {
		return numero;
	}

	public List<ServicoCorreio> getServicos() {
		return servicos;
	}

	public String getStatusCartaoPostagem() {
		return statusCartaoPostagem;
	}

	public String getUnidadeGenerica() {
		return unidadeGenerica;
	}

	public List<UnidadePostagem> getUnidadesPostagem() {
		return unidadesPostagem;
	}

	public static CartaoPostagemBuilder novoCartao() {
		return new CartaoPostagemBuilder();
	}

	public static class CartaoPostagemBuilder {

		private CartaoPostagem cartao;

		public CartaoPostagemBuilder() {
			this.cartao = new CartaoPostagem();
		}

		public CartaoPostagem build() {
			return this.cartao;
		}

		public CartaoPostagemBuilder comCodigoAdministrativo(String codigoAdministrativo) {
			this.cartao.codigoAdministrativo = codigoAdministrativo;
			return this;
		}

		public CartaoPostagemBuilder comStatusCartaoPostagem(String statusCartaoPostagem) {
			this.cartao.statusCartaoPostagem = statusCartaoPostagem;
			return this;
		}

		public CartaoPostagemBuilder comUnidadeGenerica(String unidadeGenerica) {
			this.cartao.unidadeGenerica = unidadeGenerica;
			return this;
		}

		public CartaoPostagemBuilder atualizadoNaData(Calendar dataDeAtualizacao) {
			this.cartao.dataAtualizacao = dataDeAtualizacao;
			return this;
		}

		public CartaoPostagemBuilder comVigencia(DataVigencia vigencia) {
			this.cartao.dataDaVigencia = vigencia;
			return this;
		}

		public CartaoPostagemBuilder comStatus(Status status) {
			this.cartao.status = status;
			return this;
		}

		public CartaoPostagemBuilder comDescricaoGenericaDeUnidadeDePostagem(String descricao) {
			this.cartao.descricaoUnidadePostagemGenerica = descricao;
			return this;
		}

		public CartaoPostagemBuilder deNumero(String numero) {
			this.cartao.numero = numero;
			return this;
		}
	}

}
