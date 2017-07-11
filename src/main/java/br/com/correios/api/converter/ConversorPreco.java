package br.com.correios.api.converter;

import java.math.BigDecimal;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

public class ConversorPreco{

	public static Optional<BigDecimal> obterPrecoComoBigDecimalDe(String valor) {
		if(StringUtils.isBlank(valor)){
			return Optional.empty();
		}

		BigDecimal divisorDecimal = BigDecimal.ONE;

		if(valor.matches(".*[\\.,][0-9]{2}\\s*$")){
			divisorDecimal = new BigDecimal("100");

		}else if(valor.matches(".*[\\.,][0-9]{1}\\s*$")){
			divisorDecimal = BigDecimal.TEN;

		}else if(valor.matches(".*[\\.,].*")){
			throw new NumberFormatException("Preco invalido -> " + valor);
		}

		return Optional.of(new BigDecimal(valor.replaceAll("[^0-9]", "")).divide(divisorDecimal).setScale(2));
	}
}
