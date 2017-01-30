package br.com.correios.api.postagem.converter;

import static br.com.correios.api.postagem.gerente.GerenteDeConta.StatusDeAtivacao.ATIVO;
import static br.com.correios.api.postagem.gerente.GerenteDeConta.TipoContaGerenciada.CONTA_SIMPLES;
import static br.com.correios.webservice.postagem.TipoGerente.GERENTE_CONTA;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

import br.com.correios.api.postagem.gerente.GerenteDeConta;
import br.com.correios.api.postagem.gerente.GerenteDeContaWebServiceToGerenteDeContaConverter;
import br.com.correios.webservice.postagem.GerenteConta;
import br.com.correios.webservice.postagem.StatusGerente;

public class GerenteDeContaWebServiceToGerenteDeContaConverterTest {

	@Test
	public void deveriaConverterUmGerenteDeContasDoWebServiceParaUmGerenteDeContasDoSdk() throws Exception {
		GerenteDeContaWebServiceToGerenteDeContaConverter converter = new GerenteDeContaWebServiceToGerenteDeContaConverter();

		GregorianCalendar dataAtualizacao = new GregorianCalendar();
		XMLGregorianCalendar xmlData = DatatypeFactory.newInstance().newXMLGregorianCalendar(dataAtualizacao);

		GerenteConta gerenteContaWebService = new GerenteConta();
		gerenteContaWebService.setDataAtualizacao(xmlData);
		gerenteContaWebService.setDataInclusao(xmlData);
		gerenteContaWebService.setDataSenha(xmlData);
		gerenteContaWebService.setLogin("Login");
		gerenteContaWebService.setSenha("Senha");
		gerenteContaWebService.setMatricula("1234567890");
		gerenteContaWebService.setTipoGerente(GERENTE_CONTA);
		gerenteContaWebService.setStatus(StatusGerente.ATIVO);
		gerenteContaWebService.setValidade("Anual");

		GerenteDeConta gerenteDeConta = converter.convert(gerenteContaWebService);

		assertThat(gerenteDeConta.getDataAtualizacao().compareTo(dataAtualizacao)).isEqualTo(0);
		assertThat(gerenteDeConta.getDataInclusao().compareTo(dataAtualizacao)).isEqualTo(0);
		assertThat(gerenteDeConta.getDataSenha().compareTo(dataAtualizacao)).isEqualTo(0);
		assertThat(gerenteDeConta.getLogin()).isEqualTo("Login");
		assertThat(gerenteDeConta.getSenha()).isEqualTo("Senha");
		assertThat(gerenteDeConta.getMatricula()).isEqualTo("1234567890");
		assertThat(gerenteDeConta.getTipoDeContaGerenciada()).isEqualTo(CONTA_SIMPLES);
		assertThat(gerenteDeConta.getStatus()).isEqualTo(ATIVO);
		assertThat(gerenteDeConta.getValidade()).isEqualTo("Anual");

	}

}
