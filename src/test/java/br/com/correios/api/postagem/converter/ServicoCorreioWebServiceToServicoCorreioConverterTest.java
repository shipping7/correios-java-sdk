package br.com.correios.api.postagem.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

import br.com.correios.api.postagem.ServicoCorreio;
import br.com.correios.webservice.postagem.ServicoERP;
import br.com.correios.webservice.postagem.VigenciaERP;

public class ServicoCorreioWebServiceToServicoCorreioConverterTest {

	@Test
	public void deveriaConverterUmServicoCorreioDoWebServiceEmUmServicoCorreioDoSDK() throws Exception {
		ServicoCorreioWebServiceToServicoCorreioConverter converter = new ServicoCorreioWebServiceToServicoCorreioConverter();

		GregorianCalendar data = new GregorianCalendar();
		XMLGregorianCalendar xmlData = DatatypeFactory.newInstance().newXMLGregorianCalendar(data);

		VigenciaERP vigencia = new VigenciaERP();
		vigencia.setDataInicial(xmlData);
		vigencia.setDataFinal(xmlData);

		ServicoERP servicoWebService = new ServicoERP();
		servicoWebService.setId(10);
		servicoWebService.setCodigo("12345");
		servicoWebService.setDataAtualizacao(xmlData);
		servicoWebService.setDescricao("Servico com descricao");
		servicoWebService.setTipo1Codigo("Tipo1 codigo");
		servicoWebService.setTipo1Descricao("Tipo1 descricao");
		servicoWebService.setTipo2Codigo("Tipo2 codigo");
		servicoWebService.setTipo2Descricao("Tipo2 descricao");
		servicoWebService.setVigencia(vigencia);

		ServicoCorreio servicoCorreio = converter.convert(servicoWebService);

		assertThat(servicoCorreio.getId()).isEqualTo(10);
		assertThat(servicoCorreio.getCodigo()).isEqualTo("12345");
		assertThat(servicoCorreio.getDataAtualizacao().compareTo(data)).isEqualTo(0);
		assertThat(servicoCorreio.getDescricao()).isEqualTo("Servico com descricao");
		assertThat(servicoCorreio.getTipo1().getCodigo()).isEqualTo("Tipo1 codigo");
		assertThat(servicoCorreio.getTipo1().getDescricao()).isEqualTo("Tipo1 descricao");
		assertThat(servicoCorreio.getTipo2().getCodigo()).isEqualTo("Tipo2 codigo");
		assertThat(servicoCorreio.getTipo2().getDescricao()).isEqualTo("Tipo2 descricao");
		assertThat(servicoCorreio.getVigencia().getDataDoInicioDaVigencia().compareTo(data)).isEqualTo(0);
		assertThat(servicoCorreio.getVigencia().getDataDoFimDaVigencia().compareTo(data)).isEqualTo(0);
	}

}
