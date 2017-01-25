package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;

public class MedidasDoObjetoPostado {

	/**
	 * Cubagem do Objeto
	 *
	 * Preenchimento não obrigatório.
	 */
	private String cubagem;

	/**
	 * Peso do objeto (em gramas)
	 *
	 * Preenchimento obrigatório
	 */
	private BigDecimal peso;

	public MedidasDoObjetoPostado(String cubagem, BigDecimal peso) {
		this.cubagem = cubagem;
		this.peso = peso;
	}

	public String getCubagem() {
		return cubagem;
	}

	public BigDecimal getPeso() {
		return peso;
	}

}
