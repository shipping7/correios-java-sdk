package br.com.correios.api.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CorreiosStatusFinalTest {

	@Test
	public void deveriaRetornarTrueQuandoOStatusETipoSaoFinais() {
		String tipo = "BDE";
		String status = "01";

		assertTrue(CorreiosStatusFinal.isFinal(tipo, status));
	}

	@Test
	public void deveriaRetornarFalseQuandoOStatusETipoNaoSaoFinais() {
		String tipo = "OEC";
		String status = "03";

		assertFalse(CorreiosStatusFinal.isFinal(tipo, status));
	}

}
