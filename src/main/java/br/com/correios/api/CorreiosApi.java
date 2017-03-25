package br.com.correios.api;

import br.com.correios.api.etiqueta.CorrreiosEtiquetaApi;
import br.com.correios.api.postagem.CorreiosPostagemApi;
import br.com.correios.api.rastreio.service.CorreiosRastreioApi;
import br.com.correios.credentials.CorreiosCredenciais;

/**
 * Responsavel por ser uma ponte para todas as API's disponiveis pelo SDK.
 *
 * @author Alexandre Gama
 * @since 0.0.13-BETA
 */
public class CorreiosApi {

	/**
	 * API de rastreio de pacotes pelos seus respectivos codigos de rastreio.
	 */
	public CorreiosRastreioApi rastreios(CorreiosCredenciais credenciais) {
		return new CorreiosRastreioApi(credenciais);
	}
	
	/**
	 * API de solicitacao de etiquetas.
	 */
	public CorrreiosEtiquetaApi etiquetas(CorreiosCredenciais credenciais) {
		return new CorrreiosEtiquetaApi(credenciais);
	}
	
	/**
	 * API de detalhes de uma postagem(PLP).
	 */
	public CorreiosPostagemApi postagens(CorreiosCredenciais credenciais) {
		return new CorreiosPostagemApi(credenciais);
	}

}
