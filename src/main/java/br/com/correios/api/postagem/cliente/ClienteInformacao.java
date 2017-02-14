package br.com.correios.api.postagem.cliente;

import static com.google.common.base.MoreObjects.toStringHelper;

public class ClienteInformacao {

	private String contrato;

	private String cartaoDePostagem;

	public ClienteInformacao(String contrato, String cartaoDePostagem) {
		this.contrato = contrato;
		this.cartaoDePostagem = cartaoDePostagem;
	}

	public String getContrato() {
		return contrato;
	}

	public String getCartaoDePostagem() {
		return cartaoDePostagem;
	}

	@Override
	public String toString() {
		return toStringHelper(this)
				.add("contrato", this.contrato)
				.add("cartaoDePostagem", this.cartaoDePostagem)
				.toString();
	}
}
