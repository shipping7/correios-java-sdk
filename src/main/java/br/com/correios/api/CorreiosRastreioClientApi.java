package br.com.correios.api;

import static br.com.correios.api.CorreiosEscopoResultado.TODOS_OS_EVENTOS;
import static br.com.correios.api.CorreiosEscopoResultado.ULTIMO_EVENTO;
import static br.com.correios.api.CorreiosIdioma.INGLES;
import static br.com.correios.api.CorreiosIdioma.PORTUGUES;
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
		}

	}

}
