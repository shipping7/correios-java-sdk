package br.com.correios.api.postagem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;

public class CorreiosPostagemApiTest {

	private CorreiosPostagemDadosAutenticacao credenciais;

	@Before
	public void startUp() {
		credenciais = new CorreiosPostagemDadosAutenticacao("CARLOS.CURIONI", "123456");
	}

	@Test
	public void deveriaBuscarOClienteDosCorreiosAPartirDasInformacoesDoCadastroDoCliente() throws Exception {
		CorreiosPostagemApi postagemApi = new CorreiosPostagemApi(credenciais);

		ClienteInformacao informacoesDeCadastro = new ClienteInformacao("9912319865", "0066253438");

		Optional<ClienteEmpresa> cliente = postagemApi.buscaCliente(informacoesDeCadastro);

		assertThat(cliente.isPresent()).isTrue();
	}

}
