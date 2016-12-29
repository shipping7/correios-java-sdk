package br.com.correios.api.rastreio.service;

import br.com.correios.api.rastreio.model.CorreiosEscopoResultado;
import br.com.correios.api.rastreio.model.CorreiosIdioma;
import br.com.correios.api.rastreio.model.CorreiosTipoIdentificador;

public interface CorreiosServicoRastreioApi {

	PacoteRastreadoDetalhes buscaPacoteRastreadoDetalhes(String codigoDeRastreio, CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador);
	
}
