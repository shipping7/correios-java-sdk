package br.com.correios.api;

import static br.com.correios.api.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;

import br.com.correios.credentials.CorreiosCredentials;
import br.com.correios.webservice.resource.Rastro;
import br.com.correios.webservice.resource.Service;
import br.com.correios.webservice.resource.Sroxml;

/**
 * 
 * @author Alexandre Gama
 *
 */
class SoapCorreiosTrackingServiceApi implements CorreiosTrackingServiceApi {

	private CorreiosCredentials credentials;

	public SoapCorreiosTrackingServiceApi(CorreiosCredentials credentials) {
		this.credentials = credentials;
	}
	
	@Override
	public PacoteTracker buscaPacoteTracker(String trackingCode, CorreiosIdioma idioma, CorreiosEscopoResultado resultado,
			CorreiosTipoIdentificador tipoIdentificador) {
		Service serviceApi = new Rastro().getServicePort();

		Sroxml eventos = serviceApi.buscaEventos(credentials.getUsuario(), credentials.getSenha(),
				LISTA_DE_OBJETOS.getCodigoInternoDosCorreios(), 
				resultado.getCodigoInternoDosCorreios(),
				idioma.getCodigoInternoDosCorreio(), 
				trackingCode);

		EventosFromCorreiosToPackageTrackerConverter converter = new EventosFromCorreiosToPackageTrackerConverter();
		PacoteTracker pacoteTracker = converter.from(eventos);

		return pacoteTracker;
	}

}
