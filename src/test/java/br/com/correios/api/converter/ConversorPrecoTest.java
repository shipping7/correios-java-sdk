package br.com.correios.api.converter;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.correios.api.exception.FormatacaoNumericaIncorretaException;

public class ConversorPrecoTest {

	@Test
	public void deveriaRetornarPrecoComoBigDecimal() {
		assertEquals(new BigDecimal("17.20"), ConversorPreco.converterDe("17.20"));
		assertEquals(new BigDecimal("117.20"), ConversorPreco.converterDe("117,20"));
		assertEquals(new BigDecimal("1117.20"), ConversorPreco.converterDe("  1117,20   "));
		assertEquals(new BigDecimal("1117.20"), ConversorPreco.converterDe("R$ 1117,20 "));
		assertEquals(new BigDecimal("1117.20"), ConversorPreco.converterDe("R$ 1.117,20 "));
		assertEquals(new BigDecimal("1117.20"), ConversorPreco.converterDe("$ 1,117.20 "));
		assertEquals(new BigDecimal("1117.00"), ConversorPreco.converterDe("$ 1117 "));
		assertEquals(new BigDecimal("1117.10"), ConversorPreco.converterDe("1117,1"));
	}

	@Test(expected=FormatacaoNumericaIncorretaException.class)
	public void deveriaRetornarExcecaoParaPrecoContendoApenasStringVazia() {
		ConversorPreco.converterDe("");
	}

	@Test(expected=FormatacaoNumericaIncorretaException.class)
	public void deveriaRetornarExcecaoParaPrecoContendoApenasStringSoComEspacos() {
		ConversorPreco.converterDe("");
	}

	@Test(expected=FormatacaoNumericaIncorretaException.class)
	public void deveriaRetornarExcecaoParaPrecoComFormatoNumeroInvalidoComPonto() {
		ConversorPreco.converterDe("17.200");
	}

	@Test(expected=FormatacaoNumericaIncorretaException.class)
	public void deveriaRetornarExcecaoParaPrecoComFormatoNumeroInvalidoComVirgula() {
		ConversorPreco.converterDe("17,200");
	}
}
