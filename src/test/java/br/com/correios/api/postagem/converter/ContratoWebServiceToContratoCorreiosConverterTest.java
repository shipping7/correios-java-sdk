package br.com.correios.api.postagem.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

import br.com.correios.api.postagem.contrato.Contrato;
import br.com.correios.api.postagem.contrato.ContratoWebServiceToContratoCorreiosConverter;
import br.com.correios.webservice.postagem.CartaoPostagemERP;
import br.com.correios.webservice.postagem.ContratoERP;

public class ContratoWebServiceToContratoCorreiosConverterTest {

	@Test
	public void deveriaConverterUmContratoVindoDoWebServiceParaUmContratoDoSdk() throws Exception {
		ContratoWebServiceToContratoCorreiosConverter converter = new ContratoWebServiceToContratoCorreiosConverter();

		CartaoPostagemERP cartaoDePostagem = new CartaoPostagemERP();
		cartaoDePostagem.setCodigoAdministrativo("123456");

		GregorianCalendar data = new GregorianCalendar();
		XMLGregorianCalendar dataXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(data);

		ContratoERP contratoWebService = new ContratoERP();
		contratoWebService.setCodigoCliente(12);
		contratoWebService.setCodigoDiretoria("115");
		contratoWebService.setDataAtualizacao(dataXml);
		contratoWebService.setDataVigenciaInicio(dataXml);
		contratoWebService.setDataVigenciaFim(dataXml);
		contratoWebService.setDescricaoDiretoriaRegional("Descricao Diretoria");
		contratoWebService.setStatusCodigo("1");
		contratoWebService.getCartoesPostagem().add(cartaoDePostagem);

		Contrato contrato = converter.convert(contratoWebService);

		assertThat(contrato.getCodigoCliente()).isEqualTo(12L);
		assertThat(contrato.getContratoDiretoria().getCodigo()).isEqualTo("115");
		assertThat(contrato.getDataAtualizacao().compareTo(data)).isEqualTo(0);
		assertThat(contrato.getDataDeVigencia().getDataDoInicioDaVigencia().compareTo(data)).isEqualTo(0);
		assertThat(contrato.getDataDeVigencia().getDataDoFimDaVigencia().compareTo(data)).isEqualTo(0);
		assertThat(contrato.getDescricaoDiretoriaRegional()).isEqualTo("Descricao Diretoria");
		assertThat(contrato.getStatus().getCodigo()).isEqualTo("1");
		assertThat(contrato.getCartoesPostagem().size()).isEqualTo(1);
		assertThat(contrato.getCartoesPostagem().get(0).getCodigoAdministrativo()).isEqualTo("123456");
	}

}
