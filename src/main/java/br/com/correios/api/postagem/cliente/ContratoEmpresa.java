package br.com.correios.api.postagem.cliente;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * Esta classe representa o contrato da empresa que será utilizado para as variadas funções dos Correios
 * Para o contrato da empresa, existem 2 números fornecidos pelos Correios:
 * - O número do Contrato
 * - O número do Cartão de Postagem
 * Para diversos serviços essas informações devem ser fornecidas para a API, como a solicitação de etiquetas por exemplo
 */
public class ContratoEmpresa {

	/**
	 * Número do contrato.
	 * É do tipo String(10) nos Correios
	 */
	private String contrato;

	/**
	 * Cartão de postagem vinculado ao contrato
	 * É do tipo String(10) nos Correios
	 */
	private String cartaoDePostagem;

	/**
	 * CNPJ da empresa cadastrado no contrato dos Correios
	 */
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
