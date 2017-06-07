package br.com.correios.api.estimativa;

import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.estimativa.CResultadoToEstimativasConverter;
import br.com.correios.estimativa.CServicoToEstimativaComPrazoConverter;
import br.com.correios.estimativa.CServicoToEstimativaComPrecoEPrazoConverter;
import br.com.correios.estimativa.EstimativaComPrazo;
import br.com.correios.estimativa.EstimativaComPrecoEPrazo;
import br.com.correios.webservice.estimativa.CalcPrecoPrazoWS;

/**
 * Responsavel por chamar a API de estimativa do Correios para calcular
 * precos e prazos
 *
 * @since 0.0.17-BETA
 */
public class CorreiosEstimativaAPI {

	private CorreiosServicoEstimativaAPI correiosServicoEstimativaAPI;

	public CorreiosEstimativaAPI(CorreiosCredenciais correiosCredenciais) {
		CResultadoToEstimativasConverter<EstimativaComPrecoEPrazo> precoEPrazoConverter = new CResultadoToEstimativasConverter<>(new CServicoToEstimativaComPrecoEPrazoConverter());
		CResultadoToEstimativasConverter<EstimativaComPrazo> prazoConverter = new CResultadoToEstimativasConverter<>(new CServicoToEstimativaComPrazoConverter());

		this.correiosServicoEstimativaAPI = new SoapCorreiosServicoEstimativaAPI(new CalcPrecoPrazoWS(), correiosCredenciais, precoEPrazoConverter, prazoConverter);
	}

	/**
	 * @return Um builder para montar a requisicao para calcular preco e prazo
	 */
	public RequisicaoEstimativaDePrecoEPrazoBuilder estimaPrecoEPrazo() {
		return new RequisicaoEstimativaDePrecoEPrazoBuilder(correiosServicoEstimativaAPI);
	}

	/**
	 * @return Um builder para montar a requisicao para calcular somente prazo
	 */
	public RequisicaoEstimativaDePrazoBuilder estimaPrazo() {
		return new RequisicaoEstimativaDePrazoBuilder(correiosServicoEstimativaAPI);
	}

}
