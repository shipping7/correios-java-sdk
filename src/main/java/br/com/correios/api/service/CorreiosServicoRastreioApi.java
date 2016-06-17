package br.com.correios.api.service;

import br.com.correios.api.CorreiosEscopoResultado;
import br.com.correios.api.CorreiosIdioma;
import br.com.correios.api.CorreiosTipoIdentificador;

public interface CorreiosServicoRastreioApi {

	PacoteRastreadoDetalhes buscaPacoteRastreadoDetalhes(String codigoDeRastreio, CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador);
	
}
