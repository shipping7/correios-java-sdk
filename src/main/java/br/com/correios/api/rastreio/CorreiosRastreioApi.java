package br.com.correios.api.rastreio;

import br.com.correios.api.converter.EventosDosCorreiosToPacoteRastreadoDetalhesConverter;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.rastreio.Rastro;

/**
 * Responsavel por chamar a API de rastreio dos Correios
 *
 * @since 0.0.1-BETA
 */
public class CorreiosRastreioApi {

	private CorreiosServicoRastreioApi correiosServicoRastreioApi;

	public CorreiosRastreioApi(CorreiosCredenciais credentials) {
		this.correiosServicoRastreioApi = new SoapCorreiosServicoRastreioApi(credentials, new Rastro().getServicePort(), new EventosDosCorreiosToPacoteRastreadoDetalhesConverter());
	}

	public CorreiosBuscaRastreioApiBuilder buscaRastreio() {
		return new CorreiosBuscaRastreioApiBuilder(correiosServicoRastreioApi);
	}

}
