package br.com.correios.api;

import br.com.correios.webservice.resource.Rastro;
import br.com.correios.webservice.resource.Service;
import br.com.correios.webservice.resource.Sroxml;

/**
 * 
 * @author Alexandre Gama
 *
 */
public class CorreiosRastreioClientApi {

	public PacoteTracker getPacoteTrackerFrom(String trackingCode) {
		Service serviceApi = new Rastro().getServicePort();
		
		Sroxml eventos = serviceApi.buscaEventos("123456", "123456", "L", "T", "101", trackingCode);
		
		EventosFromCorreiosToPackageTrackerConverter converter = new EventosFromCorreiosToPackageTrackerConverter();
		PacoteTracker pacoteTracker = converter.from(eventos);
		
		return pacoteTracker;
	}
	
}
