package br.com.correios.api.rastreio;

import java.util.List;

import br.com.correios.api.rastreio.model.CorreiosEscopoResultado;
import br.com.correios.api.rastreio.model.CorreiosIdioma;
import br.com.correios.api.rastreio.model.CorreiosTipoIdentificador;
import br.com.correios.api.rastreio.model.DetalhesRastreio;

public interface CorreiosServicoRastreioApi {

	DetalhesRastreio buscaDetalhesRastreio(List<String> codigosDeRastreio, CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador);
}
