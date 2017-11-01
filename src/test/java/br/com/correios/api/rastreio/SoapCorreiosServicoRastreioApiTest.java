package br.com.correios.api.rastreio;

import static br.com.correios.api.rastreio.model.CorreiosEscopoResultado.ULTIMO_EVENTO;
import static br.com.correios.api.rastreio.model.CorreiosIdioma.PORTUGUES;
import static br.com.correios.api.rastreio.model.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.endsWith;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.correios.api.converter.EventosDosCorreiosToPacoteRastreadoDetalhesConverter;
import br.com.correios.api.exception.CorreiosEventosConverterException;
import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.rastreio.model.DetalhesRastreio;
import br.com.correios.api.rastreio.model.ObjetoRastreio;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.rastreio.EventosDosCorreios;
import br.com.correios.webservice.rastreio.Service;

@RunWith(MockitoJUnitRunner.class)
public class SoapCorreiosServicoRastreioApiTest {

	@Mock
	private Service servicoApi;
	@Mock
	private EventosDosCorreiosToPacoteRastreadoDetalhesConverter converter;
	@Mock
	private EventosDosCorreios eventosDosCorreios;

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private SoapCorreiosServicoRastreioApi soapApi;
	private DetalhesRastreio detalhesRastreioConvertido;
	private ObjetoRastreio objetoRastreio;

	@Before
	public void setup() {
		objetoRastreio = new ObjetoRastreio();
		detalhesRastreioConvertido = new DetalhesRastreio();
		detalhesRastreioConvertido.adicionaObjetoRastreio(objetoRastreio);
		when(servicoApi.buscaEventosLista(anyString(), anyString(), anyString(), anyString(), anyString(), anyListOf(String.class))).thenReturn(eventosDosCorreios);
		when(converter.convert(eventosDosCorreios)).thenReturn(detalhesRastreioConvertido);

		CorreiosCredenciais credenciais = new CorreiosCredenciais("usario", "senha");
		soapApi = new SoapCorreiosServicoRastreioApi(credenciais, servicoApi, converter);
	}

	@Test
	public void deveriaBuscarDetalhesRastreioDeUmCodigoDeRastreio() {
		DetalhesRastreio detalhesRastreio = soapApi.buscaDetalhesRastreio(asList("DW123456BR"), PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);

		assertEquals(detalhesRastreioConvertido, detalhesRastreio);
	}

	@Test
	public void deveriaBuscarDetalhesRastreioDeMaisDeUmCodigoDeRastreio() {
		DetalhesRastreio detalhesRastreio = soapApi.buscaDetalhesRastreio(asList("DW123456BR", "DW456789BR"), PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);

		assertEquals(detalhesRastreioConvertido, detalhesRastreio);
	}

	@Test(expected=CorreiosServicoSoapException.class)
	@SuppressWarnings("unchecked")
	public void deveriaLancarExcecaoQuandoApiLancarExcecao() {
		when(servicoApi.buscaEventosLista(anyString(), anyString(), anyString(), anyString(), anyString(), anyListOf(String.class))).thenThrow(RuntimeException.class);
		soapApi.buscaDetalhesRastreio(asList("DW123456BR"), PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);
	}

	@Test(expected=CorreiosEventosConverterException.class)
	@SuppressWarnings("unchecked")
	public void deveriaLancarExcecaoQuandoHouverAlgumProblemaParaConverter() {
		when(converter.convert(eventosDosCorreios)).thenThrow(RuntimeException.class);
		soapApi.buscaDetalhesRastreio(asList("DW123456BR"), PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);
	}

	@Test
	public void deveriaMostrarOErroDeCadaObjeto() {
		ObjetoRastreio objetoRastreio1 = new ObjetoRastreio();
		ObjetoRastreio objetoRastreio2 = new ObjetoRastreio();
		ObjetoRastreio objetoRastreio3 = new ObjetoRastreio();

		objetoRastreio2.setDescricaoErro("Erro maroto");

		detalhesRastreioConvertido = new DetalhesRastreio();
		detalhesRastreioConvertido.adicionaObjetoRastreio(objetoRastreio1);
		detalhesRastreioConvertido.adicionaObjetoRastreio(objetoRastreio2);
		detalhesRastreioConvertido.adicionaObjetoRastreio(objetoRastreio3);

		when(servicoApi.buscaEventosLista(anyString(), anyString(), anyString(), anyString(), anyString(), anyListOf(String.class))).thenReturn(eventosDosCorreios);
		when(converter.convert(eventosDosCorreios)).thenReturn(detalhesRastreioConvertido);

		DetalhesRastreio detalhesRastreio = soapApi.buscaDetalhesRastreio(Arrays.asList("DW123456BR", "DW456789BR", "DW123789BR"), PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);

		assertThat(detalhesRastreio.getObjetosRastreio().get(0).getDescricaoErro().isPresent()).isFalse();
		assertThat(detalhesRastreio.getObjetosRastreio().get(1).getDescricaoErro().get()).isEqualTo("Erro maroto");
		assertThat(detalhesRastreio.getObjetosRastreio().get(2).getDescricaoErro().isPresent()).isFalse();
	}

	@Test
	public void naoDeveriaLancarExcecaoQuandoSoTiverUmObjetoComErroEspecifico() {
		objetoRastreio.setNumero("DW123456BR");
		objetoRastreio.setDescricaoErro("Objeto nao encontrado");

		DetalhesRastreio detalhesRastreio = soapApi.buscaDetalhesRastreio(Arrays.asList("DW123456BR"), PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);

		assertThat(detalhesRastreio.getObjetosRastreio().get(0).getNumero()).isEqualTo("DW123456BR");
		assertThat(detalhesRastreio.getObjetosRastreio().get(0).getDescricaoErro().get()).isEqualTo("Objeto nao encontrado");
	}

	@Test
	public void deveriaLancarExcecaoQuandoAcontecerAlgumErroGenerico() {
		objetoRastreio.setNumero("Erro");
		objetoRastreio.setDescricaoErro("Usuario e/ou senha invalidos.");

		expectedException.expect(CorreiosServicoSoapException.class);
		expectedException.expectMessage(endsWith("Usuario e/ou senha invalidos."));

		soapApi.buscaDetalhesRastreio(Arrays.asList("DW123456BR", "DW456789BR", "DW123789BR"), PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);
	}

}
