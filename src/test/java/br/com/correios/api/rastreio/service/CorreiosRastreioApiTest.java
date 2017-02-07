package br.com.correios.api.rastreio.service;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import br.com.correios.api.exception.CorreiosCodigoRastreioInvalidoException;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosRastreioApiTest {

	private CorreiosRastreioApi correiosApi;

	@Before
	public void setup() {
		CorreiosCredenciais credentials = new CorreiosCredenciais("12345", "12345");
		correiosApi = new CorreiosRastreioApi(credentials);
	}

	@Test(expected=CorreiosCodigoRastreioInvalidoException.class)
	public void deveriaLancarExcecaoQuandoNaoPassarCodigoDeRastreio() {
		correiosApi.buscaPacoteRastreadoUsandoOCodigo("").comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();
	}

	@Test(expected=CorreiosCodigoRastreioInvalidoException.class)
	public void deveriaLancarExcecaoQuandoNaoPassarCodigosDeRastreio() {
		correiosApi.buscaPacotesRastreadosPelaListaDeTrackings(null).comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();
	}

	@Test(expected=CorreiosCodigoRastreioInvalidoException.class)
	public void deveriaLancarExcecaoQuandoPassarListaDeCodigosDeRastreioVazia() {
		correiosApi.buscaPacotesRastreadosPelaListaDeTrackings(Collections.emptyList()).comRetornoEmPortugues().comTodosOsEventos().getDetalhesRastreio();
	}
}
