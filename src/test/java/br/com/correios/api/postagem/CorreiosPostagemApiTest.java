package br.com.correios.api.postagem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ClienteInformacao;
import br.com.correios.api.postagem.plp.DocumentoPlp;

public class CorreiosPostagemApiTest {

	private CorreiosPostagemDadosAutenticacao credenciais;

	@Before
	public void startUp() {
		credenciais = new CorreiosPostagemDadosAutenticacao("seu usuario", "sua senha");
	}

	@Test
	public void deveriaBuscarOClienteDosCorreiosAPartirDasInformacoesDoCadastroDoCliente() throws Exception {
		PostagemApi postagemApi = new CorreiosPostagemApi(credenciais);

		ClienteInformacao informacoesDeCadastro = new ClienteInformacao("9912319865", "0066253438");

		Optional<ClienteEmpresa> cliente = postagemApi.buscaCliente(informacoesDeCadastro);

		assertThat(cliente.isPresent()).isTrue();
	}

	@Test
	public void deveriaBuscarOsDadosDaPlpViaPlpId() throws Exception {
		PostagemApi postagemApi = new CorreiosPostagemApi(credenciais);

		Optional<DocumentoPlp> cliente = postagemApi.buscaInformacoesDaPlp(67488374L);

		System.out.println(cliente.get().getObjetoPostado().get(0).getNumeroEtiqueta());

		assertThat(cliente.isPresent()).isTrue();
	}

}
