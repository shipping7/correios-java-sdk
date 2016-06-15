package br.com.correios.api;

import org.junit.Test;

public class CorreiosRastreioClientApiTest {

	@Test
	public void deveriaRetornarOsEventos() throws Exception {
		CorreiosRastreioClientApi correiosApi = new CorreiosRastreioClientApi();
		
		PacoteTracker pacoteTracker = correiosApi.getPacoteTrackerFrom("DU500853237BR");
		
		System.out.println(pacoteTracker);
	}
	
}
