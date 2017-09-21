package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;

public class MedidasDoObjetoPostado {

	/**
	 * Cubagem do Objeto
	 *
	 * Preenchimento não obrigatório.
	 */
	private BigDecimal cubagem;

	/**
	 * Peso do objeto (em gramas)
	 *
	 * Preenchimento obrigatório
	 */
	private BigDecimal peso;

	public MedidasDoObjetoPostado(BigDecimal cubagem, BigDecimal peso) {
		this.cubagem = cubagem;
		this.peso = peso;
	}

	public BigDecimal getCubagem() {
		return cubagem;
	}

	public BigDecimal getPeso() {
		return peso;
	}

}
