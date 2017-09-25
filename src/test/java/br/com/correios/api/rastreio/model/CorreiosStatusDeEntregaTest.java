package br.com.correios.api.rastreio.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CorreiosStatusDeEntregaTest {

	@Test
	public void deveriaRetornarTrueQuandoOStatusETipoSaoDeEntregaRealizada() {
		String tipo = "BDE";
		String status = "01";

		assertTrue(CorreiosStatusDeEntrega.isEntregaRealizada(tipo, status));
	}

	@Test
	public void deveriaRetornarFalseQuandoOStatusETipoNaoSaoDeEntregaRealizada() {
		String tipo = "BDI";
		String status = "15";

		assertFalse(CorreiosStatusDeEntrega.isEntregaRealizada(tipo, status));
	}

}
