package br.com.correios.api;

import br.com.correios.credentials.CorreiosCredentials;
import br.com.correios.webservice.resource.Rastro;
import br.com.correios.webservice.resource.Service;
import br.com.correios.webservice.resource.Sroxml;

/**
 * 
 * @author Alexandre Gama
 *
 */
public class CorreiosRastreioClientApi {

	private CorreiosCredentials credentials;

	public CorreiosRastreioClientApi(CorreiosCredentials credentials) {
		this.credentials = credentials;
	}

	public PacoteTracker getPacoteTrackerFrom(String trackingCode) {
		Service serviceApi = new Rastro().getServicePort();
		
		Sroxml eventos = serviceApi.buscaEventos(credentials.getUsuario(), credentials.getSenha(), "L", "T", "101", trackingCode);
		
		EventosFromCorreiosToPackageTrackerConverter converter = new EventosFromCorreiosToPackageTrackerConverter();
		PacoteTracker pacoteTracker = converter.from(eventos);
		
		return pacoteTracker;
	}
	
}
