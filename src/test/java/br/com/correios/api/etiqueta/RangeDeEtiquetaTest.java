package br.com.correios.api.etiqueta;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class RangeDeEtiquetaTest {

	@Test
	public void deveriaRetornarONumeroDaPrimeiraEtiquetaDoRange() throws Exception {
		List<String> offsetDeEtiquetas = asList("DW83589539 BR", "DW83589542 BR");

		RangeDeEtiqueta rangeDeEtiquetas = RangeDeEtiqueta.extraiInformacoesDa(offsetDeEtiquetas);

		assertThat(rangeDeEtiquetas.getNumeroDaPrimeiraEtiqueta()).isEqualTo(83589539);
	}

	@Test
	public void deveriaRetornarONumeroDaUltimaEtiquetaDoRange() throws Exception {
		List<String> offsetDeEtiquetas = asList("DW83589539 BR", "DW83589542 BR");

		RangeDeEtiqueta rangeDeEtiquetas = RangeDeEtiqueta.extraiInformacoesDa(offsetDeEtiquetas);

		assertThat(rangeDeEtiquetas.getNumeroDaUltimaEtiqueta()).isEqualTo(83589542);
	}

	@Test
	public void deveriaRetornarOPrefixoUsadoNasEtiquetasDoRange() throws Exception {
		List<String> offsetDeEtiquetas = asList("DW83589539 BR", "DW83589542 BR");

		RangeDeEtiqueta rangeDeEtiquetas = RangeDeEtiqueta.extraiInformacoesDa(offsetDeEtiquetas);

		assertThat(rangeDeEtiquetas.getPrefixo()).isEqualTo("DW");
	}

	@Test
	public void deveriaRetornarOSufixoUsadoNasEtiquetasDoRange() throws Exception {
		List<String> offsetDeEtiquetas = asList("DW83589539 BR", "DW83589542 BR");

		RangeDeEtiqueta rangeDeEtiquetas = RangeDeEtiqueta.extraiInformacoesDa(offsetDeEtiquetas);

		assertThat(rangeDeEtiquetas.getSufixo()).isEqualTo("BR");
	}

	@Test
	public void deveriaRetornarAQuantidadeDeEtiquetasDoRange() throws Exception {
		List<String> offsetDeEtiquetas = asList("DW83589539 BR", "DW83589542 BR");

		RangeDeEtiqueta rangeDeEtiquetas = RangeDeEtiqueta.extraiInformacoesDa(offsetDeEtiquetas);

		assertThat(rangeDeEtiquetas.getQuantidadeDeEtiquetasSolicitadas()).isEqualTo(4);
	}

	@Test
	public void deveriaAdicionarOsAfixosEmUmaDeterminadaEtiqueta() throws Exception {
		List<String> offsetDeEtiquetas = asList("DW83589539 BR", "DW83589542 BR");

		RangeDeEtiqueta rangeDeEtiquetas = RangeDeEtiqueta.extraiInformacoesDa(offsetDeEtiquetas);

		assertThat(rangeDeEtiquetas.adicionaAfixosPara(83589539L)).isEqualTo("DW83589539 BR");
	}

}
