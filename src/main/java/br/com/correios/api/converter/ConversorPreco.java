package br.com.correios.api.converter;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.api.exception.FormatacaoNumericaIncorretaException;

public class ConversorPreco {

	public static BigDecimal converterDe(String valor) {

		if (StringUtils.isBlank(valor)) {
			throw new FormatacaoNumericaIncorretaException("O valor " + valor + " nao pode ser vazio");
		}

		BigDecimal divisorDecimal = BigDecimal.ONE;

		if (valor.matches(".*[\\.,][0-9]{2}\\s*$")) {
			divisorDecimal = new BigDecimal("100");

		} else if (valor.matches(".*[\\.,][0-9]{1}\\s*$")) {
			divisorDecimal = BigDecimal.TEN;

		} else if (valor.matches(".*[\\.,].*")) {
			throw new FormatacaoNumericaIncorretaException("Preco " + valor + " invalido");
		}

		return new BigDecimal(valor.replaceAll("[^0-9]", "")).divide(divisorDecimal).setScale(2);
	}
}
