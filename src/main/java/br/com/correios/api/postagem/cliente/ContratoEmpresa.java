package br.com.correios.api.postagem.cliente;

import static com.google.common.base.MoreObjects.toStringHelper;

public class ContratoEmpresa {

	private String contrato;

	private String cartaoDePostagem;

	private String cnpj;

	public ContratoEmpresa(String cnpj, String contrato, String cartaoDePostagem) {
		this.cnpj = cnpj;
		this.contrato = contrato;
		this.cartaoDePostagem = cartaoDePostagem;
	}

	public String getContrato() {
		return contrato;
	}

	public String getCartaoDePostagem() {
		return cartaoDePostagem;
	}

	public String getCnpj() {
		return cnpj;
	}

	@Override
	public String toString() {
		return toStringHelper(this)
				.add("contrato", this.contrato)
				.add("cartaoDePostagem", this.cartaoDePostagem)
				.add("cnpj", this.cnpj)
				.toString();
	}
}
