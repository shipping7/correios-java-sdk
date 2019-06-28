package br.com.correios.api.postagem;

import static java.util.Collections.EMPTY_LIST;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.plp.DocumentoPlp;
import br.com.correios.api.postagem.plp.ObjetoPostado;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosPostagemApiTest {

	private CorreiosCredenciais credenciais;
	private CorreiosPostagemApi postagemApi;

	@Before
	public void startUp() {
		credenciais = new CorreiosCredenciais("seu-usuario", "sua-senha");
		postagemApi = new CorreiosPostagemApi(credenciais);
	}

	@Test
	public void deveriaBuscarOClienteDosCorreiosAPartirDasInformacoesDoCadastroDoCliente() throws Exception {
		String cnpj = "123456878";
		ContratoEmpresa informacoesDeCadastro = new ContratoEmpresa(cnpj, "123456878", "123456878");

		Optional<ClienteEmpresa> cliente = postagemApi.buscaCliente(informacoesDeCadastro);

		assertThat(cliente.isPresent()).isTrue();
	}

	@Test
	public void deveriaBuscarOsDadosDaPlpViaPlpId() throws Exception {
		Optional<DocumentoPlp> cliente = postagemApi.buscaDocumentoPlp(67488374L);

		assertThat(cliente.isPresent()).isTrue();
	}

	@Test
	public void deveriaRetornasOsDadosDeUmaEtiquetaEspecificaDadaUmaPlp() throws Exception {
		Optional<DocumentoPlp> plp = postagemApi.buscaDocumentoPlp(48925409L);

		Optional<ObjetoPostado> objetoPostado = plp.get().getObjetoPostadoComEtiqueta("PJ938918208BR");

		assertThat(objetoPostado.isPresent()).isTrue();
	}

	@Test
	public void deveriaRetornasOsDadosDeUmaEtiquetaEspecificaDadaUmaPlp2() throws Exception {
		long plpIdInextistente = 250045L;
		Optional<DocumentoPlp> plp = postagemApi.buscaDocumentoPlp(plpIdInextistente);

		assertThat(plp.isPresent()).isFalse();
	}

	@Test
	public void deveriaCancelarUmObjetoDePlp() {
		postagemApi.cancelaObjetoDaPlp(48925409L, "PJ938918208BR");
	}

}
