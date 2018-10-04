package br.com.correios.api.rastreio;

import static br.com.correios.api.rastreio.model.CorreiosEscopoResultado.TODOS_OS_EVENTOS;
import static br.com.correios.api.rastreio.model.CorreiosEscopoResultado.ULTIMO_EVENTO;
import static br.com.correios.api.rastreio.model.CorreiosIdioma.INGLES;
import static br.com.correios.api.rastreio.model.CorreiosIdioma.PORTUGUES;
import static br.com.correios.api.rastreio.model.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.api.exception.CorreiosCodigoRastreioInvalidoException;
import br.com.correios.api.rastreio.model.CorreiosEscopoResultado;
import br.com.correios.api.rastreio.model.CorreiosIdioma;
import br.com.correios.api.rastreio.model.DetalhesRastreio;
import br.com.correios.api.rastreio.model.ObjetoRastreio;

public class CorreiosBuscaRastreioApiBuilder {

	private CorreiosServicoRastreioApi correiosServicoRastreioApi;
	private List<String> codigosDeRastreio;
	private CorreiosIdioma idioma;
	private CorreiosEscopoResultado escopoResultado;

	CorreiosBuscaRastreioApiBuilder(CorreiosServicoRastreioApi correiosServicoRastreioApi) {
		this.correiosServicoRastreioApi = correiosServicoRastreioApi;
	}

	public CorreiosRastreioApiBuilderComCodigoDeRastreio peloCodigoDeRastreio(String codigoDeRastreio) {
		this.codigosDeRastreio = new LinkedList<>();
		this.codigosDeRastreio.add(codigoDeRastreio);
		return new CorreiosRastreioApiBuilderComCodigoDeRastreio(this);
	}

	public CorreiosRastreioApiBuilderComCodigoDeRastreio pelosCodigosDeRastreio(List<String> codigosDeRastreio) {
		this.codigosDeRastreio = codigosDeRastreio;
		return new CorreiosRastreioApiBuilderComCodigoDeRastreio(this);
	}

	public class CorreiosRastreioApiBuilderComCodigoDeRastreio {

		private CorreiosBuscaRastreioApiBuilder builder;

		private CorreiosRastreioApiBuilderComCodigoDeRastreio(CorreiosBuscaRastreioApiBuilder builder) {
			this.builder = builder;
		}

		public CorreiosRastreioApiBuilderComIdioma comRetornoEmPortugues() {
			builder.idioma = PORTUGUES;
			return new CorreiosRastreioApiBuilderComIdioma(builder);
		}

		public CorreiosRastreioApiBuilderComIdioma comRetornoEmIngles() {
			builder.idioma = INGLES;
			return new CorreiosRastreioApiBuilderComIdioma(builder);
		}
	}

	public class CorreiosRastreioApiBuilderComIdioma {

		private CorreiosBuscaRastreioApiBuilder builder;

		private CorreiosRastreioApiBuilderComIdioma(CorreiosBuscaRastreioApiBuilder builder) {
			this.builder = builder;
		}

		/**
		 * Neste caso passamos para o correios um parametro diferenciado indicando que sera retornado somente o ultimo evento
		 * Note tambem que neste caso a lista de eventos sera preenchida com somente 1 evento.
		 * Para retornar somente o ultimo evento do Pacote rastreado basta usar o metodo {@link ObjetoRastreio#getUltimoEvento()}
		 *
		 * @see {@link ObjetoRastreio#getUltimoEvento()}
		 * @return somente o ultimo evento de um Pacote Rastreado.
		 */
		public CorreiosRastreioApiBuilderComEscopoResultado somenteComUltimoEvento() {
			builder.escopoResultado = ULTIMO_EVENTO;
			return new CorreiosRastreioApiBuilderComEscopoResultado(builder);
		}

		/**
		 * @return todos os eventos associados a um Pacote rastreado.
		 */
		public CorreiosRastreioApiBuilderComEscopoResultado comTodosOsEventos() {
			builder.escopoResultado = TODOS_OS_EVENTOS;
			return new CorreiosRastreioApiBuilderComEscopoResultado(builder);
		}
	}

	public class CorreiosRastreioApiBuilderComEscopoResultado {

		private CorreiosBuscaRastreioApiBuilder builder;

		private CorreiosRastreioApiBuilderComEscopoResultado(CorreiosBuscaRastreioApiBuilder builder) {
			this.builder = builder;
		}

		public DetalhesRastreio getDetalhesRastreio() {
			if (builder.codigosDeRastreio != null && !builder.codigosDeRastreio.isEmpty() && todosOsCodigosEstaoPreenchidos(builder.codigosDeRastreio)) {
				return correiosServicoRastreioApi.buscaDetalhesRastreio(builder.codigosDeRastreio, builder.idioma, builder.escopoResultado, LISTA_DE_OBJETOS);
			}
			throw new CorreiosCodigoRastreioInvalidoException("É necessário buscar os detalhes por pelo menos um código de rastreio");
		}

		private boolean todosOsCodigosEstaoPreenchidos(List<String> codigosDeRastreio) {
			String[] arrayDeCodigosDeRastreio = codigosDeRastreio.toArray(new String[codigosDeRastreio.size()]);

			return StringUtils.isNoneBlank(arrayDeCodigosDeRastreio);
		}
	}

}
