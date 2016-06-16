package br.com.correios.api;

import org.junit.Test;

import br.com.correios.credentials.CorreiosCredentials;

public class CorreiosRastreioClientApiTest {

	@Test
	public void deveriaRetornarOsEventos() throws Exception {
		CorreiosCredentials credentials = new CorreiosCredentials("058457", "yhe8sa12");
		
		CorreiosRastreioClientApi correiosApi = new CorreiosRastreioClientApi(credentials);

		PacoteTracker pacoteTracker = correiosApi.buscaPacoteTrackerUsando("DU500853238BR").emPortugues().comTodosOsEventos().build();
		
		System.out.println(pacoteTracker);
	}
	
}
