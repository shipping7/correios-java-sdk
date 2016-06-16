package br.com.correios.api;

import static br.com.correios.api.CorreiosEscopoResultado.TODOS_OS_EVENTOS;
import static br.com.correios.api.CorreiosEscopoResultado.ULTIMO_EVENTO;
import static br.com.correios.api.CorreiosIdioma.INGLES;
import static br.com.correios.api.CorreiosIdioma.PORTUGUES;
import static br.com.correios.api.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;

import java.util.ArrayList;
import java.util.List;

import br.com.correios.credentials.CorreiosCredentials;

/**
 * 
 * @author Alexandre Gama
 *
 */
public class CorreiosRastreioClientApi {

	private CorreiosCredentials credentials;
	private String trackingCode;
	private CorreiosIdioma idioma;
	private CorreiosEscopoResultado resultado;
	private List<String> trackingCodes;

	public CorreiosRastreioClientApi(CorreiosCredentials credentials) {
		this.credentials = credentials;
	}

	public CorreiosRastreioIdioma buscaPacoteTrackerUsando(String trackingCode) {
		this.trackingCode = trackingCode;
		return new CorreiosRastreioIdioma();
	}
	
	public CorreiosRastreioIdioma buscaPacoteTrackerPelaListaDeTrackings(List<String> trackingCodes) {
		this.trackingCodes = trackingCodes;
		return new CorreiosRastreioIdioma();
	}

	public class CorreiosRastreioIdioma {

		public CorreiosRastreioTipoDeIdentificador emPortugues() {
			idioma = PORTUGUES;
			return new CorreiosRastreioTipoDeIdentificador();
		}

		public CorreiosRastreioTipoDeIdentificador emIngles() {
			idioma = INGLES;
			return new CorreiosRastreioTipoDeIdentificador();
		}

		public class CorreiosRastreioTipoDeIdentificador {

			public CorreiosRastreioBuilder comTodosOsEventos() {
				resultado = TODOS_OS_EVENTOS;
				return new CorreiosRastreioBuilder();
			}

			public CorreiosRastreioBuilder somenteUltimoEvento() {
				resultado = ULTIMO_EVENTO;
				return new CorreiosRastreioBuilder();
			}

			public class CorreiosRastreioBuilder {

				public PacoteTracker getPacoteTracker() {
					if (trackingCodes != null && !trackingCodes.isEmpty()) {
						throw new CorreiosUnexpectedTrackingCodeException("Voce deve fazer a chamada do metodo getPacoteTracker passando somente 1 tracking code e nao uma lista. Caso seja necessario uma lista, voce podera usar o metodo getListaDePacotesTracker");
					}
					if (trackingCode == null || trackingCode.isEmpty()) {
						throw new CorreiosUnexpectedTrackingCodeException("O Tracking code nao pode ser vazio");
					}
					SoapCorreiosTrackingServiceApi serviceApi = new SoapCorreiosTrackingServiceApi(credentials);
					
					PacoteTracker pacoteTrackerEncontrado = serviceApi.buscaPacoteTracker(trackingCode, idioma, resultado, LISTA_DE_OBJETOS);
					
					return pacoteTrackerEncontrado;
				}
				
				public List<PacoteTracker> getListaDePacotesTracker() {
					if (trackingCodes == null || trackingCodes.isEmpty()) {
						throw new CorreiosUnexpectedTrackingCodeException("A lista de Tracking Codes nao pode ser nula ou vazia");
					}
					if (trackingCode != null && !trackingCode.isEmpty()) {
						throw new CorreiosUnexpectedTrackingCodeException("Voce deve fazer a chamada do metodo getListaDePacotesTracker passando uma lista de tracking codes. Caso seja necessario, utilize o metodo getPacoteTracker para somente 1 tracking code");
					}
					SoapCorreiosTrackingServiceApi serviceApi = new SoapCorreiosTrackingServiceApi(credentials);
					
					List<PacoteTracker> pacotesEncontrados = new ArrayList<>();
					trackingCodes.forEach(trackingCode -> {
						PacoteTracker pacoteTrackerEncontrado = serviceApi.buscaPacoteTracker(trackingCode, idioma, resultado, LISTA_DE_OBJETOS);
						pacotesEncontrados.add(pacoteTrackerEncontrado);
					});
					
					return pacotesEncontrados;
				}

			}
		}

	}

}
