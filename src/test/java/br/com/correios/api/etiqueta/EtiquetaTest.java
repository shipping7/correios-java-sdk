package br.com.correios.api.etiqueta;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class EtiquetaTest {

	@Test
	public void deveriaRetornarOPrefixoDaEtiqueta() throws Exception {
		Etiqueta etiqueta = new Etiqueta("DW", "BR", 83589539L);

		assertThat(etiqueta.getPrefixo()).isEqualTo("DW");
	}

	@Test
	public void deveriaRetornarOSufixoDaEtiqueta() throws Exception {
		Etiqueta etiqueta = new Etiqueta("DW", "BR", 83589539L);

		assertThat(etiqueta.getSufixo()).isEqualTo("BR");
	}

	@Test
	public void deveriaRetornarONumeroDaEtiqueta() throws Exception {
		Etiqueta etiqueta = new Etiqueta("DW", "BR", 83589539L);

		assertThat(etiqueta.getNumeroDaEtiqueta()).isEqualTo(83589539L);
	}

	@Test
	public void deveriaRetornarAEtiquetaCompleteSemDigitoVerificador() throws Exception {
		Etiqueta etiqueta = new Etiqueta("DW", "BR", 83589539L);

		String etiquetaComEspacoVazio = "DW83589539 BR".replace(" ", StringUtils.EMPTY);

		assertThat(etiqueta.getNumeroDaEtiquetaSemDigitoVerificador()).isEqualTo(etiquetaComEspacoVazio);
	}

	@Test
	public void deveriaRetornarAEtiquetaCompleteComDigitoVerificador() throws Exception {
		Etiqueta etiqueta = new Etiqueta("DW", "BR", 83589539L);

		assertThat(etiqueta.getNumeroDaEtiquetaComDigitoVerificador()).isEqualTo("DW835895394BR");
	}

}
