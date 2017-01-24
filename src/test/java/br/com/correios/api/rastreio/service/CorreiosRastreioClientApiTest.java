package br.com.correios.api.rastreio.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosRastreioClientApiTest {

	@Test
	public void deveriaRetornarOsEventosAPartirDeUmTrackingCode() {
		CorreiosCredenciais credentials = new CorreiosCredenciais("12345", "12345");

		CorreiosRastreioApi correiosApi = new CorreiosRastreioApi(credentials);

		PacoteRastreadoDetalhes pacoteTracker = correiosApi.buscaPacoteRastreadoUsandoOCodigo("PN560740569BR").comRetornoEmPortugues().comTodosOsEventos().getPacoteRastreado();

		System.out.println(pacoteTracker);
	}

	@Test
	public void deveriaRetornarSomenteOUltimoEventoAPartirDeUmTrackingCode() {
		CorreiosCredenciais credentials = new CorreiosCredenciais("12345", "12345");

		CorreiosRastreioApi correiosApi = new CorreiosRastreioApi(credentials);

		PacoteRastreadoDetalhes pacoteTracker = correiosApi.buscaPacoteRastreadoUsandoOCodigo("DU500853237BR").comRetornoEmPortugues().somenteUltimoEvento().getPacoteRastreado();

		System.out.println(pacoteTracker);
	}

	@Test
	public void deveriaRetornarOsEventosAPartirDeUmaListaDeTrackingCodes() {
		CorreiosCredenciais credentials = new CorreiosCredenciais("12345", "12345");

		CorreiosRastreioApi correiosApi = new CorreiosRastreioApi(credentials);

		List<String> trackingCodes = new ArrayList<>();
		trackingCodes.add("DU500853237BR");
		trackingCodes.add("DU496842125BR");

		List<PacoteRastreadoDetalhes> listaDeEventos = correiosApi.buscaPacoteTrackerPelaListaDeTrackings(trackingCodes).comRetornoEmPortugues().comTodosOsEventos().getListaDePacotesRastreados();

		System.out.println(listaDeEventos);
	}

}
