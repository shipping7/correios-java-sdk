package br.com.correios.api.rastreio.service;

import static br.com.correios.api.rastreio.model.CorreiosEscopoResultado.TODOS_OS_EVENTOS;
import static br.com.correios.api.rastreio.model.CorreiosEscopoResultado.ULTIMO_EVENTO;
import static br.com.correios.api.rastreio.model.CorreiosIdioma.INGLES;
import static br.com.correios.api.rastreio.model.CorreiosIdioma.PORTUGUES;
import static br.com.correios.api.rastreio.model.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;

import java.util.List;

import br.com.correios.api.exception.CorreiosCodigoRastreioInvalidoException;
import br.com.correios.api.rastreio.model.CorreiosEscopoResultado;
import br.com.correios.api.rastreio.model.CorreiosIdioma;
import br.com.correios.api.rastreio.model.DetalhesRastreio;
import br.com.correios.api.rastreio.model.ObjetoRastreio;
import br.com.correios.credentials.CorreiosCredenciais;

/**
 * @author Alexandre Gama
 *
 * @description Classe que deve ser usada para as chamadas a API dos Correios
 *
 * @since 0.0.1-BETA
 */
public class CorreiosRastreioApi {

	private CorreiosCredenciais credentials;
	private String trackingCode;
	private CorreiosIdioma idioma;
	private CorreiosEscopoResultado resultado;
	private List<String> trackingCodes;

	public CorreiosRastreioApi(CorreiosCredenciais credentials) {
		this.credentials = credentials;
	}

	public CorreiosRastreioComIdioma buscaPacoteRastreadoUsandoOCodigo(String trackingCode) {
		this.trackingCode = trackingCode;
		return new CorreiosRastreioComIdioma();
	}

	public CorreiosRastreioComIdioma buscaPacoteTrackerPelaListaDeTrackings(List<String> trackingCodes) {
		this.trackingCodes = trackingCodes;
		return new CorreiosRastreioComIdioma();
	}

	public class CorreiosRastreioComIdioma {

		public CorreiosRastreioComTipoDeIdentificador comRetornoEmPortugues() {
			idioma = PORTUGUES;
			return new CorreiosRastreioComTipoDeIdentificador();
		}

		public CorreiosRastreioComTipoDeIdentificador comRetornoEmIngles() {
			idioma = INGLES;
			return new CorreiosRastreioComTipoDeIdentificador();
		}

		public class CorreiosRastreioComTipoDeIdentificador {

			/**
			 * Metodo para retornar todos os eventos associados a um Pacote Rastreado.
			 * @return CorreiosRastreioTracker
			 */
			public CorreiosRastreioTracker comTodosOsEventos() {
				resultado = TODOS_OS_EVENTOS;
				return new CorreiosRastreioTracker();
			}

			/**
			 * Metodo para retornar somente o ultimo evento de um Pacote Rastreado.
			 * Note que neste caso passamos para o correios um parametro diferenciado indicando que sera retornado somente o ultimo evento
			 * Note tambem que neste caso a lista de eventos sera preenchida com somente 1 evento.
			 * Para retornar somente o ultimo evento do Pacote rastreado basta usar o metodo {@link ObjetoRastreio#getUltimoEvento()}
			 *
			 * @return CorreiosRastreioTracker
			 */
			public CorreiosRastreioTracker somenteUltimoEvento() {
				resultado = ULTIMO_EVENTO;
				return new CorreiosRastreioTracker();
			}

			public class CorreiosRastreioTracker {

				public DetalhesRastreio getPacoteRastreado() {
					boolean usuarioEnviouListaDeTrackingCodes = trackingCodes != null && !trackingCodes.isEmpty();
					if (usuarioEnviouListaDeTrackingCodes) {
						throw new CorreiosCodigoRastreioInvalidoException("Voce deve fazer a chamada do metodo getPacoteTracker passando somente 1 tracking code e nao uma lista. Caso seja necessario uma lista, voce podera usar o metodo getListaDePacotesTracker");
					}

					boolean trackingCodeVazio = trackingCode == null || trackingCode.isEmpty();
					if (trackingCodeVazio) {
						throw new CorreiosCodigoRastreioInvalidoException("O Tracking code do objeto nao pode ser vazio");
					}

					SoapCorreiosServicoRastreioApi serviceApi = new SoapCorreiosServicoRastreioApi(credentials);

					return serviceApi.buscaDetalhesRastreio(trackingCode, idioma, resultado, LISTA_DE_OBJETOS);
				}

				public DetalhesRastreio getListaDePacotesRastreados() {
					boolean listaDeTrackingCodesEstaVazia = trackingCodes == null || trackingCodes.isEmpty();
					if (listaDeTrackingCodesEstaVazia) {
						throw new CorreiosCodigoRastreioInvalidoException("A lista de Tracking Codes nao pode ser nula ou vazia");
					}

					boolean existeSomenteUmTrackingCode = trackingCode != null && !trackingCode.isEmpty();
					if (existeSomenteUmTrackingCode) {
						throw new CorreiosCodigoRastreioInvalidoException("Voce deve fazer a chamada do metodo getListaDePacotesTracker passando uma lista de tracking codes. Caso seja necessario, utilize o metodo getPacoteTracker para somente 1 tracking code");
					}

					SoapCorreiosServicoRastreioApi serviceApi = new SoapCorreiosServicoRastreioApi(credentials);

					return serviceApi.buscaDetalhesRastreio(trackingCodes, idioma, resultado, LISTA_DE_OBJETOS);
				}

			}
		}

	}

}
