package br.com.correios.api.etiqueta;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import br.com.correios.api.postagem.exception.CorreiosEtiquetaException;

public class EtiquetaGeneratorTest {

	@Test
	public void deveriaRetornarEtiquetasFormatadasAPartirDoOffsetDeEtiquetasEnviadoPelosCorreios() throws Exception {
		String offsetDeEtiquetasRetornadoDosCorreios = "DW83589539 BR,DW83589542 BR";

		List<Etiqueta> etiquetas = EtiquetaGenerator.geraEtiquetasDo(offsetDeEtiquetasRetornadoDosCorreios);

		assertThat(etiquetas.size()).isEqualTo(4);

		Etiqueta primeiraEtiqueta = etiquetas.get(0);
		assertThat(primeiraEtiqueta.getComDigitoVerificador()).isEqualTo("DW835895394BR");
		assertThat(primeiraEtiqueta.getSemDigitoVerificador()).isEqualTo("DW83589539 BR".replaceAll(" ", StringUtils.EMPTY));

		Etiqueta segundaEtiqueta = etiquetas.get(1);
		assertThat(segundaEtiqueta.getComDigitoVerificador()).isEqualTo("DW835895403BR");
		assertThat(segundaEtiqueta.getSemDigitoVerificador()).isEqualTo("DW83589540 BR".replaceAll(" ", StringUtils.EMPTY));

		Etiqueta terceiraEtiqueta = etiquetas.get(2);
		assertThat(terceiraEtiqueta.getComDigitoVerificador()).isEqualTo("DW835895417BR");
		assertThat(terceiraEtiqueta.getSemDigitoVerificador()).isEqualTo("DW83589541 BR".replaceAll(" ", StringUtils.EMPTY));

		Etiqueta quartaEtiqueta = etiquetas.get(3);
		assertThat(quartaEtiqueta.getComDigitoVerificador()).isEqualTo("DW835895425BR");
		assertThat(quartaEtiqueta.getSemDigitoVerificador()).isEqualTo("DW83589542 BR".replaceAll(" ", StringUtils.EMPTY));
	}

	@Test(expected = CorreiosEtiquetaException.class)
	public void deveriaLancarExcecaoQuandoOffsetEstaVazio() throws Exception {
		String offsetDeEtiquetasRetornadoDosCorreios = "";
		EtiquetaGenerator.geraEtiquetasDo(offsetDeEtiquetasRetornadoDosCorreios);
	}

	@Test(expected = CorreiosEtiquetaException.class)
	public void deveriaLancarExcecaoQuandoOffsetEstaNulo() throws Exception {
		String offsetDeEtiquetasRetornadoDosCorreios = null;
		EtiquetaGenerator.geraEtiquetasDo(offsetDeEtiquetasRetornadoDosCorreios);
	}

}
