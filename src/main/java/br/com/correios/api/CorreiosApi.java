package br.com.correios.api;

import br.com.correios.api.estimativa.CorreiosEstimativaAPI;
import br.com.correios.api.etiqueta.CorreiosEtiquetaApi;
import br.com.correios.api.postagem.CorreiosPostagemApi;
import br.com.correios.api.rastreio.service.CorreiosRastreioApi;
import br.com.correios.credentials.CorreiosCredenciais;

/**
 * Responsavel por ser uma ponte para todas as API's disponiveis pelo SDK.
 *
 * @since 0.0.13-BETA
 */
public class CorreiosApi {

	/**
	 * @return API de rastreio de pacotes pelos seus respectivos codigos de rastreio.
	 */
	public CorreiosRastreioApi rastreios(CorreiosCredenciais credenciais) {
		return new CorreiosRastreioApi(credenciais);
	}

	/**
	 * @return API de solicitacao de etiquetas.
	 */
	public CorreiosEtiquetaApi etiquetas(CorreiosCredenciais credenciais) {
		return new CorreiosEtiquetaApi(credenciais);
	}

	/**
	 * @return API de detalhes de uma postagem(PLP).
	 */
	public CorreiosPostagemApi postagens(CorreiosCredenciais credenciais) {
		return new CorreiosPostagemApi(credenciais);
	}

	/**
	 * @return API de calculo de estimativas contendo precos e prazos
	 */
	public CorreiosEstimativaAPI estimativas(CorreiosCredenciais credenciais) {
		return new CorreiosEstimativaAPI(credenciais);
	}

}
