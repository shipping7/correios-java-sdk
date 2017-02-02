package br.com.correios.api.postagem.remetente;

import static java.lang.Byte.parseByte;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.com.correios.api.postagem.xml.Remetente;

public class RemetenteDosCorreiosToRemetenteConverterTest {

	@Test
	public void deveriaConverterORementeEnviadoPelosCorreiosParaORemetenteDoSdk() throws Exception {
		RemetenteDosCorreiosToRemetenteConverter converter = new RemetenteDosCorreiosToRemetenteConverter();

		Remetente remetenteDosCorreios = new Remetente();
		remetenteDosCorreios.setNumeroContrato("123456");
		remetenteDosCorreios.setNumeroDiretoria(parseByte("1"));
		remetenteDosCorreios.setCodigoAdministrativo("11111111");
		remetenteDosCorreios.setNomeRemetente("Antonio Jose");

		remetenteDosCorreios.setTelefoneRemetente("01144558978");
		remetenteDosCorreios.setFaxRemetente("01122334454");
		remetenteDosCorreios.setEmailRemetente("email@gmail.com");

		remetenteDosCorreios.setLogradouroRemetente("Rua Gregorio");
		remetenteDosCorreios.setNumeroRemetente("1");
		remetenteDosCorreios.setComplementoRemetente("Apto 12");
		remetenteDosCorreios.setBairroRemetente("Vila Sao Jose");
		remetenteDosCorreios.setCepRemetente("04689558");
		remetenteDosCorreios.setCidadeRemetente("Sao Paulo");
		remetenteDosCorreios.setUfRemetente("SP");

		RemetenteDaPostagem remetente = converter.convert(remetenteDosCorreios);

		assertThat(remetente.getNumeroDoContrato()).isEqualTo("123456");
		assertThat(remetente.getNumeroDaDiretoriaRegional()).isEqualTo(1);
		assertThat(remetente.getCodigoAdministrativo()).isEqualTo("11111111");
		assertThat(remetente.getNome()).isEqualTo("Antonio Jose");

		assertThat(remetente.getDadosDeContato().getTelefone()).isEqualTo("01144558978");
		assertThat(remetente.getDadosDeContato().getFax()).isEqualTo("01122334454");
		assertThat(remetente.getDadosDeContato().getEmail()).isEqualTo("email@gmail.com");

		assertThat(remetente.getEndereco().getLogradouro()).isEqualTo("Rua Gregorio");
		assertThat(remetente.getEndereco().getNumero()).isEqualTo("1");
		assertThat(remetente.getEndereco().getComplemento()).isEqualTo("Apto 12");
		assertThat(remetente.getEndereco().getBairro()).isEqualTo("Vila Sao Jose");
		assertThat(remetente.getEndereco().getCep()).isEqualTo("04689558");
		assertThat(remetente.getEndereco().getCidade()).isEqualTo("Sao Paulo");
		assertThat(remetente.getEndereco().getEstado()).isEqualTo("SP");
	}
}
