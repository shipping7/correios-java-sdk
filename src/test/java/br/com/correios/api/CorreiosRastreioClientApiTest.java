package br.com.correios.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.correios.api.service.CorreiosRastreioApi;
import br.com.correios.api.service.PacoteRastreadoDetalhes;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosRastreioClientApiTest {

	@Test
	public void deveriaRetornarOsEventosAPartirDeUmTrackingCode() throws Exception {
		CorreiosCredenciais credentials = new CorreiosCredenciais("12345", "12345");
		
		CorreiosRastreioApi correiosApi = new CorreiosRastreioApi(credentials);

		PacoteRastreadoDetalhes pacoteTracker = correiosApi.buscaPacoteTrackerUsandoOCodigo("DU500853237BR").emPortugues().comTodosOsEventos().getPacoteTracker();
		
		System.out.println(pacoteTracker);
	}
	
	@Test
	public void deveriaRetornarOsEventosAPartirDeUmaListaDeTrackingCodes() throws Exception {
		CorreiosCredenciais credentials = new CorreiosCredenciais("12345", "12345");
		
		CorreiosRastreioApi correiosApi = new CorreiosRastreioApi(credentials);
		
		List<String> trackingCodes = new ArrayList<>();
		trackingCodes.add("DU500853237BR");
		trackingCodes.add("DU496842125BR");
		
		List<PacoteRastreadoDetalhes> listaDeEventos = correiosApi.buscaPacoteTrackerPelaListaDeTrackings(trackingCodes).emPortugues().comTodosOsEventos().getListaDePacotesTracker();
		
		System.out.println(listaDeEventos);
	}
	
}
