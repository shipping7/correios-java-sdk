package br.com.correios.api.etiqueta;

import br.com.correios.api.etiqueta.CorreiosEtiquetaApi.EtiquetaBuilder;

public interface EtiquetaApi {

	EtiquetaBuilder solicita(int quantidadeDeEtiquetas);

}
