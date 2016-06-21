package br.com.correios.api.service;

import br.com.correios.api.model.CorreiosEscopoResultado;
import br.com.correios.api.model.CorreiosIdioma;
import br.com.correios.api.model.CorreiosTipoIdentificador;

public interface CorreiosServicoRastreioApi {

	PacoteRastreadoDetalhes buscaPacoteRastreadoDetalhes(String codigoDeRastreio, CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador);
	
}
