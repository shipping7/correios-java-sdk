package br.com.correios.api;

import org.junit.Test;

import br.com.correios.credentials.CorreiosCredentials;

public class CorreiosRastreioClientApiTest {

	@Test
	public void deveriaRetornarOsEventos() throws Exception {
		CorreiosCredentials credentials = new CorreiosCredentials("123456", "123132");
		
		CorreiosRastreioClientApi correiosApi = new CorreiosRastreioClientApi(credentials);
		
		PacoteTracker pacoteTracker = correiosApi.getPacoteTrackerFrom("DU500853237BR");
		
		System.out.println(pacoteTracker);
	}
	
}
