package br.com.correios.api.rastreio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import br.com.correios.api.exception.CorreiosCodigoRastreioInvalidoException;
import br.com.correios.api.rastreio.model.DetalhesRastreio;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosRastreioApiTest {

	private CorreiosRastreioApi correiosApi;

	@Before
	public void setup() {
		CorreiosCredenciais credentials = new CorreiosCredenciais("12345", "12345");
		correiosApi = new CorreiosRastreioApi(credentials);
	}

	@Test(expected=CorreiosCodigoRastreioInvalidoException.class)
	public void deveriaLancarExcecaoQuandoNaoPassarCodigoDeRastreio() {
		correiosApi.buscaRastreio().peloCodigoDeRastreio("").comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();
	}

	@Test(expected=CorreiosCodigoRastreioInvalidoException.class)
	public void deveriaLancarExcecaoQuandoNaoPassarCodigosDeRastreio() {
		correiosApi.buscaRastreio().peloCodigoDeRastreio(null).comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();
	}

	@Test(expected=CorreiosCodigoRastreioInvalidoException.class)
	public void deveriaLancarExcecaoQuandoPassarListaDeCodigosDeRastreioVazia() {
		correiosApi.buscaRastreio().pelosCodigosDeRastreio(Collections.emptyList()).comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();
	}

	@Test
	public void deveriaRetornarOsEventosAPartirDeUmTrackingCode() {
		DetalhesRastreio pacoteTracker = correiosApi.buscaRastreio().peloCodigoDeRastreio("PN601598269BR").comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();

		System.out.println(pacoteTracker);
	}

	@Test
	public void deveriaRetornarSomenteOUltimoEventoAPartirDeUmTrackingCode() {
		DetalhesRastreio detalhesRastreio = correiosApi.buscaRastreio().peloCodigoDeRastreio("DU500853237BR").comRetornoEmPortugues().somenteComUltimoEvento().getDetalhesRastreio();

		System.out.println(detalhesRastreio);
	}

	@Test
	public void deveriaRetornarOsEventosAPartirDeUmaListaDeTrackingCodes() {
		List<String> trackingCodes = new ArrayList<>();
		trackingCodes.add("DU500853237BR");
		trackingCodes.add("DU496842125BR");

		DetalhesRastreio detalhesRastreio = correiosApi.buscaRastreio().pelosCodigosDeRastreio(trackingCodes).comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();

		System.out.println(detalhesRastreio);
	}

	@Test
	public void deveriaUsarOCodigoDeRastreioPassadoENaoUsarDeOutrasChamadas() {
		correiosApi.buscaRastreio().pelosCodigosDeRastreio(Arrays.asList("PO885187892BR","PN210491273BR","DU698173525BR")).comRetornoEmPortugues().somenteComUltimoEvento().getDetalhesRastreio();

		DetalhesRastreio detalhesRastreio2 = correiosApi.buscaRastreio().peloCodigoDeRastreio("PO895327210BR").comRetornoEmPortugues().somenteComUltimoEvento().getDetalhesRastreio();

		Assertions.assertThat(detalhesRastreio2.getObjetosRastreio()).hasSize(1);
		Assertions.assertThat(detalhesRastreio2.getObjetosRastreio().get(0).getNumero()).isEqualTo("PO895327210BR");
	}

}
