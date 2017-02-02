package br.com.correios.api.postagem.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

import br.com.correios.api.postagem.cartao.CartaoDePostagemWebServiceToCartaoDePostagemCorreiosConverter;
import br.com.correios.api.postagem.cartao.CartaoPostagem;
import br.com.correios.webservice.postagem.CartaoPostagemERP;

public class CartaoDePostagemWebServiceToCartaoDePostagemCorreiosConverterTest {

	@Test
	public void deveriaConverterUmCartaoDePostagemVindoDoWebServiceParaUmCartaoDePostagemDoSDK() throws Exception {
		CartaoDePostagemWebServiceToCartaoDePostagemCorreiosConverter converter = new CartaoDePostagemWebServiceToCartaoDePostagemCorreiosConverter();

		GregorianCalendar data = new GregorianCalendar();
		XMLGregorianCalendar xmlData = DatatypeFactory.newInstance().newXMLGregorianCalendar(data);

		CartaoPostagemERP cartaoPostagemWebService = new CartaoPostagemERP();
		cartaoPostagemWebService.setDataAtualizacao(xmlData);
		cartaoPostagemWebService.setDataVigenciaInicio(xmlData);
		cartaoPostagemWebService.setDataVigenciaFim(xmlData);
		cartaoPostagemWebService.setCodigoAdministrativo("12345");
		cartaoPostagemWebService.setDescricaoUnidadePostagemGenerica("Descricao generica");
		cartaoPostagemWebService.setNumero("123123");
		cartaoPostagemWebService.setDescricaoStatusCartao("Ativo");
		cartaoPostagemWebService.setStatusCodigo("1");
		cartaoPostagemWebService.setStatusCartaoPostagem("111222");
		cartaoPostagemWebService.setUnidadeGenerica("Unidade");

		CartaoPostagem cartaoDePostagem = converter.convert(cartaoPostagemWebService);

		assertThat(cartaoDePostagem.getDataAtualizacao().compareTo(data)).isEqualTo(0);
		assertThat(cartaoDePostagem.getDataDaVigencia().getDataDoInicioDaVigencia().compareTo(data)).isEqualTo(0);
		assertThat(cartaoDePostagem.getDataDaVigencia().getDataDoFimDaVigencia().compareTo(data)).isEqualTo(0);
		assertThat(cartaoDePostagem.getCodigoAdministrativo()).isEqualTo("12345");
		assertThat(cartaoDePostagem.getDescricaoUnidadePostagemGenerica()).isEqualTo("Descricao generica");
		assertThat(cartaoDePostagem.getNumero()).isEqualTo("123123");
		assertThat(cartaoDePostagem.getStatus().getCodigo()).isEqualTo("1");
		assertThat(cartaoDePostagem.getStatus().getDescricao()).isEqualTo("Ativo");
		assertThat(cartaoDePostagem.getStatusCartaoPostagem()).isEqualTo("111222");
		assertThat(cartaoDePostagem.getUnidadeGenerica()).isEqualTo("Unidade");
	}

}
