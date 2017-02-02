package br.com.correios.api.postagem.plp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.com.correios.api.postagem.xml.Nacional;
import br.com.correios.api.postagem.xml.ObjetoPostal;

public class ObjetoToDadosDeEntregaConverterTest {

	@Test
	public void deveriaConverterOsDadosDoObjetoDosCorreiosNoObjetoContendoDadosDeEntrega() throws Exception {
		Nacional nacional = new Nacional();
		nacional.setBairroDestinatario("Vila Sao Jose");
		nacional.setCidadeDestinatario("Sao Paulo");
		nacional.setUfDestinatario("SP");
		nacional.setCepDestinatario("04675125");

		nacional.setNumeroNotaFiscal("123456");
		nacional.setSerieNotaFiscal("111111111");
		nacional.setValorNotaFiscal("10.2");
		nacional.setNaturezaNotaFiscal("");

		nacional.setCodigoUsuarioPostal("2222222");
		nacional.setCentroCustoCliente("3333333");
		nacional.setDescricaoObjeto("Objeto raro");
		nacional.setValorACobrar("100");

		ObjetoPostal objetoPostal = new ObjetoPostal();
		objetoPostal.setNacional(nacional);

		ObjetoToDadosDeEntregaConverter converter = new ObjetoToDadosDeEntregaConverter();
		DadosDeEntrega dadosDeEntrega = converter.convert(objetoPostal);

		assertThat(dadosDeEntrega.getEndereco().getBairro()).isEqualTo("Vila Sao Jose");
		assertThat(dadosDeEntrega.getEndereco().getCidade()).isEqualTo("Sao Paulo");
		assertThat(dadosDeEntrega.getEndereco().getUf()).isEqualTo("SP");
		assertThat(dadosDeEntrega.getEndereco().getCep()).isEqualTo("04675125");

		assertThat(dadosDeEntrega.getNotaFiscal().getNumeroNotaFiscal()).isEqualTo("123456");
		assertThat(dadosDeEntrega.getNotaFiscal().getSerieNotaFiscal()).isEqualTo("111111111");
		assertThat(dadosDeEntrega.getNotaFiscal().getValorNotaFiscal()).isEqualTo("10.2");
		assertThat(dadosDeEntrega.getNotaFiscal().getNaturezaNotaFiscal()).isEqualTo("");

		assertThat(dadosDeEntrega.getCodigoDoUsuarioPostal()).isEqualTo("2222222");
		assertThat(dadosDeEntrega.getCentroDeCustoDoCliente()).isEqualTo("3333333");
		assertThat(dadosDeEntrega.getDescricaoDoObjeto()).isEqualTo("Objeto raro");
		assertThat(dadosDeEntrega.getValorACobrarDoDestinatario()).isEqualTo("100");
	}

}
