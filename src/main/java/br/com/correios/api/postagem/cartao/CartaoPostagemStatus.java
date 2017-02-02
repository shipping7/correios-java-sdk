package br.com.correios.api.postagem.cartao;

public class CartaoPostagemStatus {

	private String descricaoStatusCartao;

    private String statusCodigo;

	public String getDescricaoStatusCartao() {
		return descricaoStatusCartao;
	}

	public String getStatusCodigo() {
		return statusCodigo;
	}

	public static CartaoPostagemStatusBuilder novo() {
		return new CartaoPostagemStatusBuilder();
	}

	public static class CartaoPostagemStatusBuilder {

		private CartaoPostagemStatus cartaoPostagem;

		public CartaoPostagemStatusBuilder() {
			this.cartaoPostagem = new CartaoPostagemStatus();
		}

		public CartaoPostagemStatusBuilder comCodigo(String codigo) {
			this.cartaoPostagem.statusCodigo = codigo;
			return this;
		}

		public CartaoPostagemStatusBuilder comDescricao(String descricao) {
			this.cartaoPostagem.descricaoStatusCartao = descricao;
			return this;
		}

		public CartaoPostagemStatus build() {
			return this.cartaoPostagem;
		}

	}

}
