package br.com.correios.api.rastreio.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.correios.api.rastreio.model.DetalhesRastreio;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosRastreioClientApiTest {

	private CorreiosRastreioApi correiosApi;

	@Before
	public void setup() {
		CorreiosCredenciais credentials = new CorreiosCredenciais("12345", "12345");
		correiosApi = new CorreiosRastreioApi(credentials);
	}

	@Test
	public void deveriaRetornarOsEventosAPartirDeUmTrackingCode() {
		DetalhesRastreio pacoteTracker = correiosApi.buscaPacoteRastreadoUsandoOCodigo("PN601598269BR").comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();

		System.out.println(pacoteTracker);
	}

	@Test
	public void deveriaRetornarSomenteOUltimoEventoAPartirDeUmTrackingCode() {
		DetalhesRastreio detalhesRastreio = correiosApi.buscaPacoteRastreadoUsandoOCodigo("DU500853237BR").comRetornoEmPortugues().somenteUltimoEvento().getDetalhesRastreio();

		System.out.println(detalhesRastreio);
	}

	@Test
	public void deveriaRetornarOsEventosAPartirDeUmaListaDeTrackingCodes() {
		List<String> trackingCodes = new ArrayList<>();
		trackingCodes.add("DU500853237BR");
		trackingCodes.add("DU496842125BR");

		DetalhesRastreio detalhesRastreio = correiosApi.buscaPacotesRastreadosPelaListaDeTrackings(trackingCodes).comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();

		System.out.println(detalhesRastreio);
	}

}
