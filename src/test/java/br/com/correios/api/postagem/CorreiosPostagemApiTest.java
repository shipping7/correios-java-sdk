package br.com.correios.api.postagem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ClienteInformacao;
import br.com.correios.api.postagem.plp.DocumentoPlp;
import br.com.correios.api.postagem.plp.ObjetoPostado;

public class CorreiosPostagemApiTest {

	private CorreiosPostagemDadosAutenticacao credenciais;

	@Before
	public void startUp() {
		credenciais = new CorreiosPostagemDadosAutenticacao("CARLOS.CURIONI", "a6923l");
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

		Optional<DocumentoPlp> cliente = postagemApi.buscaDocumentoPlp(67488374L);

		System.out.println(cliente.get().getObjetoPostado().get(0).getNumeroEtiqueta());

		assertThat(cliente.isPresent()).isTrue();
	}

	@Test
	public void deveriaRetornasOsDadosDeUmaEtiquetaEspecificaDadaUmaPlp() throws Exception {
		PostagemApi postagemApi = new CorreiosPostagemApi(credenciais);

		Optional<DocumentoPlp> plp = postagemApi.buscaDocumentoPlp(67488374L);

		Optional<ObjetoPostado> objetoPostado = plp.get().getObjetoPostadoComEtiqueta("PN578673520BR");

		assertThat(objetoPostado.isPresent()).isTrue();
	}

	@Test
	public void deveriaRetornasOsDadosDeUmaEtiquetaEspecificaDadaUmaPlp2() throws Exception {
		PostagemApi postagemApi = new CorreiosPostagemApi(credenciais);

		long plpIdInextistente = 250045L;
		Optional<DocumentoPlp> plp = postagemApi.buscaDocumentoPlp(plpIdInextistente);

		assertThat(plp.isPresent()).isFalse();
	}

}
