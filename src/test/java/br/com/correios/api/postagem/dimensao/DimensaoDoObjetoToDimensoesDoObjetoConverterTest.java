package br.com.correios.api.postagem.dimensao;

import static java.lang.Short.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.com.correios.api.postagem.xml.DimensaoObjeto;

public class DimensaoDoObjetoToDimensoesDoObjetoConverterTest {

	@Test
	public void deveriaConverterADimensaoEnviadaPelosCorreiosParaADimensaoDoObjetoDoSdk() throws Exception {
		DimensaoDoObjetoToDimensoesDoObjetoConverter converter = new DimensaoDoObjetoToDimensoesDoObjetoConverter();

		DimensaoObjeto dimensaoObjeto = new DimensaoObjeto();
		dimensaoObjeto.setDimensaoAltura("10");
		dimensaoObjeto.setDimensaoComprimento("15");
		dimensaoObjeto.setDimensaoDiametro(5);
		dimensaoObjeto.setDimensaoLargura("20");
		dimensaoObjeto.setTipoObjeto(valueOf("1"));

		DimensoesDoObjeto dimensao = converter.convert(dimensaoObjeto);

		assertThat(dimensao.getAltura()).isEqualTo("10");
		assertThat(dimensao.getComprimento()).isEqualTo("15");
		assertThat(dimensao.getDiametro()).isEqualTo(5);
		assertThat(dimensao.getLargura()).isEqualTo("20");
		assertThat(dimensao.getTipo()).isEqualTo("1");
	}

}
