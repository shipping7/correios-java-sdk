package br.com.correios.api.postagem.destinatario;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.com.correios.api.postagem.xml.Destinatario;

public class DestinatarioDosCorreiosToDestinatarioConverterTest {

	@Test
	public void deveriaConverterODestinatarioDosCorreiosParaODestinatarioDoSdk() throws Exception {
		Destinatario destinatarioDosCorreios = new Destinatario();
		destinatarioDosCorreios.setNomeDestinatario("Antonio");
		destinatarioDosCorreios.setEmailDestinatario("email@gmail.com");
		destinatarioDosCorreios.setTelefoneDestinatario("01211125589");
		destinatarioDosCorreios.setCelularDestinatario("011995875580");
		destinatarioDosCorreios.setLogradouroDestinatario("Rua Gregorio");
		destinatarioDosCorreios.setComplementoDestinatario("Vila Sao Pedro");
		destinatarioDosCorreios.setNumeroEndDestinatario("60");

		DestinatarioDosCorreiosToDestinatarioConverter converter = new DestinatarioDosCorreiosToDestinatarioConverter();
		DestinatarioDoObjeto destinatario = converter.convert(destinatarioDosCorreios);

		assertThat(destinatario.getNome()).isEqualTo("Antonio");
		assertThat(destinatario.getDadosDeContato().getEmail()).isEqualTo("email@gmail.com");
		assertThat(destinatario.getDadosDeContato().getTelefone()).isEqualTo("01211125589");
		assertThat(destinatario.getDadosDeContato().getCelular()).isEqualTo("011995875580");
		assertThat(destinatario.getEndereco().getLogradouro()).isEqualTo("Rua Gregorio");
		assertThat(destinatario.getEndereco().getComplemento()).isEqualTo("Vila Sao Pedro");
		assertThat(destinatario.getEndereco().getNumero()).isEqualTo("60");
	}

}
