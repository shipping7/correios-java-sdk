package br.com.correios.api;

public interface CorreiosTrackingServiceApi {

	PacoteTracker buscaPacoteTracker(String trackingCode, CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador);
	
}
