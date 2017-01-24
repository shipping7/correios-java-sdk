package br.com.correios.api.postagem;

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

}
