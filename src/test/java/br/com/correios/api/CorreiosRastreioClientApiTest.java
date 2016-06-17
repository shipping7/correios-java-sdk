package br.com.correios.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.correios.api.service.CorreiosRastreioClientApi;
import br.com.correios.api.service.PacoteTracker;
import br.com.correios.credentials.CorreiosCredentials;

public class CorreiosRastreioClientApiTest {

	@Test
	public void deveriaRetornarOsEventosAPartirDeUmTrackingCode() throws Exception {
		CorreiosCredentials credentials = new CorreiosCredentials("12345", "12345");
		
		CorreiosRastreioClientApi correiosApi = new CorreiosRastreioClientApi(credentials);

		PacoteTracker pacoteTracker = correiosApi.buscaPacoteTrackerUsandoOCodigo("DU500853237BR").emPortugues().comTodosOsEventos().getPacoteTracker();
		
		System.out.println(pacoteTracker);
	}
	
	@Test
	public void deveriaRetornarOsEventosAPartirDeUmaListaDeTrackingCodes() throws Exception {
		CorreiosCredentials credentials = new CorreiosCredentials("12345", "12345");
		
		CorreiosRastreioClientApi correiosApi = new CorreiosRastreioClientApi(credentials);
		
		List<String> trackingCodes = new ArrayList<>();
		trackingCodes.add("DU500853237BR");
		trackingCodes.add("DU496842125BR");
		
		List<PacoteTracker> listaDeEventos = correiosApi.buscaPacoteTrackerPelaListaDeTrackings(trackingCodes).emPortugues().comTodosOsEventos().getListaDePacotesTracker();
		
		System.out.println(listaDeEventos);
	}
	
}
