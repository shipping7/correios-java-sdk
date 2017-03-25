package br.com.correios.api.rastreio.service;

import static br.com.correios.api.rastreio.model.CorreiosEscopoResultado.TODOS_OS_EVENTOS;
import static br.com.correios.api.rastreio.model.CorreiosEscopoResultado.ULTIMO_EVENTO;
import static br.com.correios.api.rastreio.model.CorreiosIdioma.INGLES;
import static br.com.correios.api.rastreio.model.CorreiosIdioma.PORTUGUES;
import static br.com.correios.api.rastreio.model.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.api.exception.CorreiosCodigoRastreioInvalidoException;
import br.com.correios.api.rastreio.model.CorreiosEscopoResultado;
import br.com.correios.api.rastreio.model.CorreiosIdioma;
import br.com.correios.api.rastreio.model.DetalhesRastreio;
import br.com.correios.api.rastreio.model.ObjetoRastreio;
import br.com.correios.credentials.CorreiosCredenciais;

/**
 * Responsavel por chamar a API de rastreio dos Correios
 *
 * @author Alexandre Gama
 * @since 0.0.1-BETA
 */
public class CorreiosRastreioApi {

	private CorreiosCredenciais credentials;
	private CorreiosIdioma idioma;
	private CorreiosEscopoResultado resultado;
	private String codigoDeRastreio;
	private List<String> codigosDeRastreio;

	public CorreiosRastreioApi(CorreiosCredenciais credentials) {
		this.credentials = credentials;
	}
	
	public CorreiosRastreioComIdioma buscaPacoteRastreadoUsandoOCodigo(String codigoDeRastreio) {
		this.codigoDeRastreio = codigoDeRastreio;
		return new CorreiosRastreioComIdioma();
	}
	
	public CorreiosRastreioComIdioma buscaPacotesRastreadosPelaListaDeTrackings(List<String> codigosDeRastreio) {
		this.codigosDeRastreio = codigosDeRastreio;
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
			 * @return todos os eventos associados a um Pacote rastreado.
			 */
			public CorreiosRastreioComEventos comTodosOsEventos() {
				resultado = TODOS_OS_EVENTOS;
				return new CorreiosRastreioComEventos();
			}

			/**
			 * Neste caso passamos para o correios um parametro diferenciado indicando que sera retornado somente o ultimo evento
			 * Note tambem que neste caso a lista de eventos sera preenchida com somente 1 evento.
			 * Para retornar somente o ultimo evento do Pacote rastreado basta usar o metodo {@link ObjetoRastreio#getUltimoEvento()}
			 *
			 * @see {@link ObjetoRastreio#getUltimoEvento()}
			 * @return somente o ultimo evento de um Pacote Rastreado.
			 */
			public CorreiosRastreioComEventos somenteUltimoEvento() {
				resultado = ULTIMO_EVENTO;
				return new CorreiosRastreioComEventos();
			}

			public class CorreiosRastreioComEventos {

				public DetalhesRastreio getDetalhesRastreio() {
					if (codigosDeRastreio != null && !codigosDeRastreio.isEmpty()) {
						return new SoapCorreiosServicoRastreioApi(credentials).buscaDetalhesRastreio(codigosDeRastreio, idioma, resultado, LISTA_DE_OBJETOS);
					} else if (StringUtils.isNotEmpty(codigoDeRastreio)) {
						return new SoapCorreiosServicoRastreioApi(credentials).buscaDetalhesRastreio(codigoDeRastreio, idioma, resultado, LISTA_DE_OBJETOS);
					} else {
						throw new CorreiosCodigoRastreioInvalidoException("É necessário buscar os detalhes por pelo menos um código de rastreio");
					}
				}

			}
		}

	}

}
