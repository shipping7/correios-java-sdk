package br.com.correios.api;

import static br.com.correios.api.CorreiosEscopoResultado.TODOS_OS_EVENTOS;
import static br.com.correios.api.CorreiosEscopoResultado.ULTIMO_EVENTO;
import static br.com.correios.api.CorreiosIdioma.INGLES;
import static br.com.correios.api.CorreiosIdioma.PORTUGUES;
import static br.com.correios.api.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;

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

	public CorreiosRastreioClientApi(CorreiosCredentials credentials) {
		this.credentials = credentials;
	}

	public CorreiosRastreioIdioma buscaPacoteTrackerUsando(String trackingCode) {
		this.trackingCode = trackingCode;
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

				public PacoteTracker build() {
					SoapCorreiosTrackingServiceApi serviceApi = new SoapCorreiosTrackingServiceApi(credentials);
					
					PacoteTracker pacoteTrackerEncontrado = serviceApi.buscaPacoteTracker(trackingCode, idioma, resultado, LISTA_DE_OBJETOS);
					
					return pacoteTrackerEncontrado;
				}

			}
		}

	}

}
