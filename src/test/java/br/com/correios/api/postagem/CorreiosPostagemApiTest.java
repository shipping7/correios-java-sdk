package br.com.correios.api.postagem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;

import br.com.correios.Cep;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.plp.DestinatarioDoObjetoPlp;
import br.com.correios.api.postagem.plp.DestinatarioDoObjetoPlpBuilder;
import br.com.correios.api.postagem.plp.DimensoesDoObjetoPlp;
import br.com.correios.api.postagem.plp.DimensoesDoObjetoPlpBuilder;
import br.com.correios.api.postagem.plp.DocumentoPlp;
import br.com.correios.api.postagem.plp.Endereco;
import br.com.correios.api.postagem.plp.EnderecoBuilder;
import br.com.correios.api.postagem.plp.ObjetoPlp;
import br.com.correios.api.postagem.plp.ObjetoPlpBuilder;
import br.com.correios.api.postagem.plp.ObjetoPostado;
import br.com.correios.api.postagem.plp.PesoDoObjetoPlp;
import br.com.correios.api.postagem.plp.Plp;
import br.com.correios.api.postagem.plp.RemetentePlp;
import br.com.correios.api.postagem.plp.RemetentePlpBuilder;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosPostagemApiTest {

	private CorreiosCredenciais credenciais;
	private CorreiosPostagemApi postagemApi;

	@Before
	public void startUp() {
		credenciais = new CorreiosCredenciais("usuario", "senha");
		postagemApi = new CorreiosPostagemApi(credenciais);
	}

	@Test
	public void deveriaBuscarOClienteDosCorreiosAPartirDasInformacoesDoCadastroDoCliente() {
		String cnpj = "123456878";
		ContratoEmpresa informacoesDeCadastro = new ContratoEmpresa(cnpj, "123456878", "123456878");

		Optional<ClienteEmpresa> cliente = postagemApi.buscaCliente(informacoesDeCadastro);

		assertThat(cliente.isPresent()).isTrue();
	}

	@Test
	public void deveriaBuscarOsDadosDaPlpViaPlpId() {
		Optional<DocumentoPlp> cliente = postagemApi.buscaDocumentoPlp(67488374L);

		assertThat(cliente.isPresent()).isTrue();
	}

	@Test
	public void deveriaRetornarOsDadosDeUmaEtiquetaEspecificaDadaUmaPlp() {
		Optional<DocumentoPlp> plp = postagemApi.buscaDocumentoPlp(48925409L);

		Optional<ObjetoPostado> objetoPostado = plp.get().getObjetoPostadoComEtiqueta("PJ938918208BR");

		assertThat(objetoPostado.isPresent()).isTrue();
	}

	@Test
	public void deveriaRetornarUmaPlpInexistenteDadoOsDadosDeUmaEtiquetaInvalida() {
		long plpIdInextistente = 250045L;
		Optional<DocumentoPlp> plp = postagemApi.buscaDocumentoPlp(plpIdInextistente);

		assertThat(plp.isPresent()).isFalse();
	}

	@Test
	public void deveriaCancelarUmObjetoDePlp() {
		postagemApi.cancelaObjetoDaPlp(48925409L, "PJ938918208BR");
	}

	@Test
	public void deveriaCriarUmaNovaPlp() {
		Endereco endereco = new EnderecoBuilder()
			.cep(new Cep("11045530"))
			.logradouro("Rua Pindorama")
			.numero(15)
			.complemento("apto 31")
			.bairro("Boqueirao")
			.cidade("Santos")
			.uf("SP")
			.build();

		RemetentePlp remetente = new RemetentePlpBuilder()
			.comNome("gabriel")
			.comEmail("gabriel.lima.ads@gmail.com")
			.comNumeroDeContrato("123")
			.comNumeroDeDiretoria("72")
			.comCodigoAdministrativo("")
			.comEndereco(endereco)
			.build();

		DestinatarioDoObjetoPlp destinatario = new DestinatarioDoObjetoPlpBuilder()
			.comNome("Greg")
			.comEndereco(endereco)
			.build();

		PesoDoObjetoPlp peso = PesoDoObjetoPlp.emGramas(BigDecimal.valueOf(1000));

		DimensoesDoObjetoPlp dimensoes = new DimensoesDoObjetoPlpBuilder()
			.doTipoEnvelope()
			.build();

		ObjetoPlp objetoPlp = new ObjetoPlpBuilder()
			.comDimensoes(dimensoes)
			.comPeso(peso)
			.usandoCodigoDeServico("04162")
			.comNumeroDaEtiqueta("etiquetaNaoFechadaAinda")
			.paraDestinatario(destinatario)
			.build();

		Plp plp = postagemApi.novaPlp()
					.comCartaoDePostagem("numeroDoCartaoDePostagem")
					.deRemetente(remetente)
					.adicionandoObjeto(objetoPlp)
					.fechaPlp();

		assertNotNull(plp.getPlpId());
	}

}
