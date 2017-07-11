package br.com.correios.api.converter;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;

public class ConversorPrecoTest {

	@Test
	public void deveriaRetornarPrecoComoBigDecimal() {
		assertEquals(new BigDecimal("17.20"), ConversorPreco.obterPrecoComoBigDecimalDe("17.20").get());
		assertEquals(new BigDecimal("117.20"), ConversorPreco.obterPrecoComoBigDecimalDe("117,20").get());
		assertEquals(new BigDecimal("1117.20"), ConversorPreco.obterPrecoComoBigDecimalDe("  1117,20   ").get());
		assertEquals(new BigDecimal("1117.20"), ConversorPreco.obterPrecoComoBigDecimalDe("R$ 1117,20 ").get());
		assertEquals(new BigDecimal("1117.20"), ConversorPreco.obterPrecoComoBigDecimalDe("R$ 1.117,20 ").get());
		assertEquals(new BigDecimal("1117.20"), ConversorPreco.obterPrecoComoBigDecimalDe("$ 1,117.20 ").get());
		assertEquals(new BigDecimal("1117.00"), ConversorPreco.obterPrecoComoBigDecimalDe("$ 1117 ").get());
		assertEquals(new BigDecimal("1117.10"), ConversorPreco.obterPrecoComoBigDecimalDe("1117,1").get());
	}

	@Test
	public void deveriaRetornarOptionalEmptyParaPrecoContendoApenasStringVaziaOuEspacos() {
		assertEquals(Optional.empty(), ConversorPreco.obterPrecoComoBigDecimalDe(" "));
		assertEquals(Optional.empty(), ConversorPreco.obterPrecoComoBigDecimalDe(""));
	}

	@Test(expected=NumberFormatException.class)
	public void deveriaRetornarExcecaoParaPrecoComFormatoNumeroInvalidoComPonto() {
		ConversorPreco.obterPrecoComoBigDecimalDe("17.200");
	}

	@Test(expected=NumberFormatException.class)
	public void deveriaRetornarExcecaoParaPrecoComFormatoNumeroInvalidoComVirgula() {
		ConversorPreco.obterPrecoComoBigDecimalDe("17,200");
	}
}
