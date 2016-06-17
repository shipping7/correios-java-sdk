package br.com.correios.api.service;

import static br.com.correios.api.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;

import br.com.correios.api.CorreiosEscopoResultado;
import br.com.correios.api.CorreiosIdioma;
import br.com.correios.api.CorreiosTipoIdentificador;
import br.com.correios.api.converter.EventosFromCorreiosToPackageTrackerConverter;
import br.com.correios.credentials.CorreiosCredentials;
import br.com.correios.webservice.resource.Rastro;
import br.com.correios.webservice.resource.Service;
import br.com.correios.webservice.resource.EventosDosCorreios;

/**
 * @author Alexandre Gama
 * 
 * Classe que encapsula a chamada SOAP para os correios atraves do WSDL dos Correios
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
		
		EventosDosCorreios eventos = null; 
		try {
			eventos = serviceApi.buscaEventos(credentials.getUsuario(), credentials.getSenha(),
					LISTA_DE_OBJETOS.getCodigoInternoDosCorreios(), 
					resultado.getCodigoInternoDosCorreios(),
					idioma.getCodigoInternoDosCorreio(), 
					trackingCode);
		} catch (Exception e) {
			throw new CorreiosSoapServiceException("Ocorreu um erro ao fazer a chamada SOAP para os correios. Verifique se voce passou corretamente os dados desejados", e);
		}

		try {
			EventosFromCorreiosToPackageTrackerConverter converter = new EventosFromCorreiosToPackageTrackerConverter();
			PacoteTracker pacoteTracker = converter.from(eventos);
			return pacoteTracker;
		} catch (Exception e) {
			throw new CorreiosEventosConverterException("Ocorreu um erro ao tentar converter o Evento vindo dos correios", e);
		}
	}

}
