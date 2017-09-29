package br.com.correios.api.rastreio.service;

import static br.com.correios.api.rastreio.model.CorreiosEscopoResultado.ULTIMO_EVENTO;
import static br.com.correios.api.rastreio.model.CorreiosIdioma.PORTUGUES;
import static br.com.correios.api.rastreio.model.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
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
		DetalhesRastreio detalhesRastreio = soapApi.buscaDetalhesRastreio("DW123456BR", PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);

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
		soapApi.buscaDetalhesRastreio("DW123456BR", PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);
	}

	@Test(expected=CorreiosEventosConverterException.class)
	@SuppressWarnings("unchecked")
	public void deveriaLancarExcecaoQuandoHouverAlgumProblemaParaConverter() {
		when(converter.convert(eventosDosCorreios)).thenThrow(RuntimeException.class);
		soapApi.buscaDetalhesRastreio("DW123456BR", PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);
	}

	@Test
	public void deveriaLancarExcecaoQuandoServicoRetornarUmaDescricaoDeErro() {
		objetoRastreio.setDescricaoErro("Erro maroto");

		try {
			soapApi.buscaDetalhesRastreio("DW123456BR", PORTUGUES, ULTIMO_EVENTO,  LISTA_DE_OBJETOS);

			Assert.fail();
		} catch (CorreiosServicoSoapException e) {
			assertTrue(e.getMessage().contains("Erro maroto"));
		}
	}

}
