package br.com.correios.api.postagem.etiqueta;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class RangeDeEtiquetaTest {

	@Test
	public void deveriaRetornarAsEtiquetas() throws Exception {
		String offsetDeEtiquetasRetornadoDosCorreios = "DW83589539 BR,DW83589542 BR";

		RangeDeEtiqueta rangeDeEtiqueta = new RangeDeEtiqueta(offsetDeEtiquetasRetornadoDosCorreios);

		List<Etiqueta> etiquetas = rangeDeEtiqueta.getEtiquetas();

		assertThat(etiquetas.size()).isEqualTo(4);

		assertThat(etiquetas.get(0).getComDigitoVerificador()).isEqualTo("DW835895394BR");
		assertThat(etiquetas.get(0).getSemDigitoVerificador()).isEqualTo("DW83589539 BR".replaceAll(" ", StringUtils.EMPTY));

		assertThat(etiquetas.get(1).getComDigitoVerificador()).isEqualTo("DW835895403BR");
		assertThat(etiquetas.get(1).getSemDigitoVerificador()).isEqualTo("DW83589540 BR".replaceAll(" ", StringUtils.EMPTY));

		assertThat(etiquetas.get(2).getComDigitoVerificador()).isEqualTo("DW835895417BR");
		assertThat(etiquetas.get(2).getSemDigitoVerificador()).isEqualTo("DW83589541 BR".replaceAll(" ", StringUtils.EMPTY));

		assertThat(etiquetas.get(3).getComDigitoVerificador()).isEqualTo("DW835895425BR");
		assertThat(etiquetas.get(3).getSemDigitoVerificador()).isEqualTo("DW83589542 BR".replaceAll(" ", StringUtils.EMPTY));
	}

}
