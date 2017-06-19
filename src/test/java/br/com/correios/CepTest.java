package br.com.correios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CepTest {

	@Test
	public void deveriaConseguirCriarUmCepEPegarSeuValor() {
		assertEquals("00123789", new Cep("00123789").value());
	}

	@Test(expected=IllegalArgumentException.class)
	public void deveriaLancarExcecaoQuandoHouverMenosNumeros() {
		new Cep("123456");
	}

	@Test(expected=IllegalArgumentException.class)
	public void deveriaLancarExcecaoQuandoHouverLetras() {
		new Cep("abcde123");
	}

}
