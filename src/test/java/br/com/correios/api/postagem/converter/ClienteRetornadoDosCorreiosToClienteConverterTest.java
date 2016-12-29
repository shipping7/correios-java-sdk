package br.com.correios.api.postagem.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

import br.com.correios.api.postagem.ClienteEmpresa;
import br.com.correios.webservice.postagem.ClienteERP;

public class ClienteRetornadoDosCorreiosToClienteConverterTest {

	@Test
	public void deveriaConverterUmClienteVindoDoWebServiceParaUmClienteDoSdk() throws Exception {
		ClienteRetornadoDosCorreiosToClienteConverter converter = new ClienteRetornadoDosCorreiosToClienteConverter();

		GregorianCalendar dataDeAtualizacao = new GregorianCalendar();
		XMLGregorianCalendar xmlDataDeAtualizacao = DatatypeFactory.newInstance().newXMLGregorianCalendar(dataDeAtualizacao);

		ClienteERP clienteWebService = new ClienteERP();
		clienteWebService.setCnpj("123456789");
		clienteWebService.setDataAtualizacao(xmlDataDeAtualizacao);
		clienteWebService.setDescricaoStatusCliente("Ativo");
		clienteWebService.setId(10);
		clienteWebService.setInscricaoEstadual("SP");
		clienteWebService.setNome("Nome da empresa legal");
		clienteWebService.setStatusCodigo("1");

		ClienteEmpresa cliente = converter.convert(clienteWebService);

		assertThat(cliente.getCnpj()).isEqualTo("123456789");
		assertThat(cliente.getDataAtualizacao().compareTo(dataDeAtualizacao)).isEqualTo(0);
		assertThat(cliente.getStatus().getDescricao()).isEqualTo("Ativo");
		assertThat(cliente.getStatus().getCodigo()).isEqualTo("1");
		assertThat(cliente.getInscricaoEstadual().getDescricao()).isEqualTo("SP");
		assertThat(cliente.getNome()).isEqualTo("Nome da empresa legal");
		assertThat(cliente.getId()).isEqualTo(10);
	}

}
