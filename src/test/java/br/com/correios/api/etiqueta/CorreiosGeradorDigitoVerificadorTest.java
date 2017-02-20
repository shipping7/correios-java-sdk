package br.com.correios.api.etiqueta;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CorreiosGeradorDigitoVerificadorTest {

	@Test
	public void deveriaGerarODigitoVerificador() throws Exception {
		String etiquetaComDigitoVerificador = CorreiosDigitoVerificador.adicionaDigitoPara("DW83589542 BR");

		assertThat(etiquetaComDigitoVerificador).isEqualTo("DW835895425BR");
	}

	@Test
	public void deveriaGerarODigitoVerificador2() throws Exception {
		String etiquetaComDigitoVerificador = CorreiosDigitoVerificador.adicionaDigitoPara("DL74668653 BR");

		assertThat(etiquetaComDigitoVerificador).isEqualTo("DL746686536BR");
	}

}
