package br.com.correios.api.service;

import static br.com.correios.api.CorreiosEscopoResultado.TODOS_OS_EVENTOS;
import static br.com.correios.api.CorreiosEscopoResultado.ULTIMO_EVENTO;
import static br.com.correios.api.CorreiosIdioma.INGLES;
import static br.com.correios.api.CorreiosIdioma.PORTUGUES;
import static br.com.correios.api.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;

import java.util.ArrayList;
import java.util.List;

import br.com.correios.api.CorreiosEscopoResultado;
import br.com.correios.api.CorreiosIdioma;
import br.com.correios.api.CorreiosUnexpectedTrackingCodeException;
import br.com.correios.credentials.CorreiosCredentials;

/**
 * @author Alexandre Gama
 * 
 * Classe que deve ser usada para as chamadas a API dos Correios
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

	public CorreiosRastreioComIdioma buscaPacoteTrackerUsandoOCodigo(String trackingCode) {
		this.trackingCode = trackingCode;
		return new CorreiosRastreioComIdioma();
	}
	
	public CorreiosRastreioComIdioma buscaPacoteTrackerPelaListaDeTrackings(List<String> trackingCodes) {
		this.trackingCodes = trackingCodes;
		return new CorreiosRastreioComIdioma();
	}

	public class CorreiosRastreioComIdioma {

		public CorreiosRastreioComTipoDeIdentificador emPortugues() {
			idioma = PORTUGUES;
			return new CorreiosRastreioComTipoDeIdentificador();
		}

		public CorreiosRastreioComTipoDeIdentificador emIngles() {
			idioma = INGLES;
			return new CorreiosRastreioComTipoDeIdentificador();
		}

		public class CorreiosRastreioComTipoDeIdentificador {

			public CorreiosRastreioTracker comTodosOsEventos() {
				resultado = TODOS_OS_EVENTOS;
				return new CorreiosRastreioTracker();
			}

			public CorreiosRastreioTracker somenteUltimoEvento() {
				resultado = ULTIMO_EVENTO;
				return new CorreiosRastreioTracker();
			}

			public class CorreiosRastreioTracker {

				public PacoteTracker getPacoteTracker() {
					boolean usuarioEnviouListaDeTrackingCodes = trackingCodes != null && !trackingCodes.isEmpty();
					if (usuarioEnviouListaDeTrackingCodes) {
						throw new CorreiosUnexpectedTrackingCodeException("Voce deve fazer a chamada do metodo getPacoteTracker passando somente 1 tracking code e nao uma lista. Caso seja necessario uma lista, voce podera usar o metodo getListaDePacotesTracker");
					}
					
					boolean trackingCodeVazio = trackingCode == null || trackingCode.isEmpty();
					if (trackingCodeVazio) {
						throw new CorreiosUnexpectedTrackingCodeException("O Tracking code do objeto nao pode ser vazio");
					}
					
					SoapCorreiosTrackingServiceApi serviceApi = new SoapCorreiosTrackingServiceApi(credentials);
					
					PacoteTracker pacoteTrackerEncontrado = serviceApi.buscaPacoteTracker(trackingCode, idioma, resultado, LISTA_DE_OBJETOS);
					
					return pacoteTrackerEncontrado;
				}
				
				public List<PacoteTracker> getListaDePacotesTracker() {
					boolean listaDeTrackingCodesEstaVazia = trackingCodes == null || trackingCodes.isEmpty();
					if (listaDeTrackingCodesEstaVazia) {
						throw new CorreiosUnexpectedTrackingCodeException("A lista de Tracking Codes nao pode ser nula ou vazia");
					}
					
					boolean existeSomenteUmTrackingCode = trackingCode != null && !trackingCode.isEmpty();
					if (existeSomenteUmTrackingCode) {
						throw new CorreiosUnexpectedTrackingCodeException("Voce deve fazer a chamada do metodo getListaDePacotesTracker passando uma lista de tracking codes. Caso seja necessario, utilize o metodo getPacoteTracker para somente 1 tracking code");
					}
					
					SoapCorreiosTrackingServiceApi serviceApi = new SoapCorreiosTrackingServiceApi(credentials);
					
					List<PacoteTracker> pacotesEncontrados = new ArrayList<PacoteTracker>();
					for (String trackingCode : trackingCodes) {
						PacoteTracker pacoteTrackerEncontrado = serviceApi.buscaPacoteTracker(trackingCode, idioma, resultado, LISTA_DE_OBJETOS);
						pacotesEncontrados.add(pacoteTrackerEncontrado);
					}
					
					return pacotesEncontrados;
				}

			}
		}

	}

}
