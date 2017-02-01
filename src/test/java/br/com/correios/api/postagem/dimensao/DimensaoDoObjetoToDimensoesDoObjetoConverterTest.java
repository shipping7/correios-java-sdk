package br.com.correios.api.postagem.dimensao;

import static br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado.ENVELOPE;
import static br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado.PACOTE_OU_CAIXA;
import static br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado.ROLO_OU_CILINDRO;
import static java.lang.Short.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado;
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
		dimensaoObjeto.setTipoObjeto(valueOf("001"));

		DimensoesDoObjeto dimensao = converter.convert(dimensaoObjeto);

		assertThat(dimensao.getAltura()).isEqualTo("10");
		assertThat(dimensao.getComprimento()).isEqualTo("15");
		assertThat(dimensao.getDiametro()).isEqualTo(5);
		assertThat(dimensao.getLargura()).isEqualTo("20");
		assertThat(dimensao.getTipo()).isEqualTo(ENVELOPE);
	}

	@Test
	public void deveriaConverterOCodigoDoTipoDoObjetoSendoEnviadoParaEtiqueta() throws Exception {
		TipoDoObjetoSendoEnviado tipo = TipoDoObjetoSendoEnviado.getTipoDoObjetoAPartirDoCodigo("1");

		assertThat(tipo).isEqualTo(ENVELOPE);
	}

	@Test
	public void deveriaConverterOCodigoDoTipoDoObjetoSendoEnviadoParaPacoteOuCaixa() throws Exception {
		TipoDoObjetoSendoEnviado tipo = TipoDoObjetoSendoEnviado.getTipoDoObjetoAPartirDoCodigo("2");

		assertThat(tipo).isEqualTo(PACOTE_OU_CAIXA);
	}

	@Test
	public void deveriaConverterOCodigoDoTipoDoObjetoSendoEnviadoParaRoloOuCilindro() throws Exception {
		TipoDoObjetoSendoEnviado tipo = TipoDoObjetoSendoEnviado.getTipoDoObjetoAPartirDoCodigo("3");

		assertThat(tipo).isEqualTo(ROLO_OU_CILINDRO);
	}

}
