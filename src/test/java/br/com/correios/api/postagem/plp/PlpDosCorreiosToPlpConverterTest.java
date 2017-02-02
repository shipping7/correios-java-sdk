package br.com.correios.api.postagem.plp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.com.correios.api.postagem.xml.DadosPlp;

public class PlpDosCorreiosToPlpConverterTest {

	@Test
	public void deveriaConverterAsInformacoesEspecificasDeUmaPlpDosCorreiosParaObjetoDoSdk() throws Exception {
		DadosPlp informacoesEspecificasDaPlp = new DadosPlp();
		informacoesEspecificasDaPlp.setIdPlp("321654");
		informacoesEspecificasDaPlp.setCartaoPostagem("123456");
		informacoesEspecificasDaPlp.setMcuUnidadePostagem("1111");
		informacoesEspecificasDaPlp.setNomeUnidadePostagem("Santo Amaro");
		informacoesEspecificasDaPlp.setValorGlobal("150");

		PlpDosCorreiosToPlpConverter converter = new PlpDosCorreiosToPlpConverter();
		InformacoesPlp plp = converter.convert(informacoesEspecificasDaPlp);

		assertThat(plp.getId()).isEqualTo("321654");
		assertThat(plp.getNumeroDoCartaoDePostagem()).isEqualTo("123456");
		assertThat(plp.getUnidadeDePostagem()).isEqualTo("1111");
		assertThat(plp.getNomeUnidadePostagem()).isEqualTo("Santo Amaro");
		assertThat(plp.getValorTotalDaTarifacao()).isEqualTo("150");
	}

}
