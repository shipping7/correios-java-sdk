package br.com.correios.api.estimativa;

import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.estimativa.CResultadoToEstimativasConverter;
import br.com.correios.estimativa.CServicoToEstimativaComPrazoConverter;
import br.com.correios.estimativa.CServicoToEstimativaComPrecoEPrazoConverter;
import br.com.correios.estimativa.EstimativaComPrazo;
import br.com.correios.estimativa.EstimativaComPrecoEPrazo;
import br.com.correios.webservice.estimativa.CalcPrecoPrazoWS;

public class CorreiosEstimativaAPI {

	private CorreiosServicoEstimativaAPI correiosServicoEstimativaAPI;

	public CorreiosEstimativaAPI(CorreiosCredenciais correiosCredenciais) {
		CResultadoToEstimativasConverter<EstimativaComPrecoEPrazo> precoEPrazoConverter = new CResultadoToEstimativasConverter<>(new CServicoToEstimativaComPrecoEPrazoConverter());
		CResultadoToEstimativasConverter<EstimativaComPrazo> prazoConverter = new CResultadoToEstimativasConverter<>(new CServicoToEstimativaComPrazoConverter());

		this.correiosServicoEstimativaAPI = new SoapCorreiosServicoEstimativaAPI(new CalcPrecoPrazoWS(), correiosCredenciais, precoEPrazoConverter, prazoConverter);
	}

	public RequisicaoEstimativaDePrecoEPrazoBuilder estimaPrecoEPrazo() {
		return new RequisicaoEstimativaDePrecoEPrazoBuilder(correiosServicoEstimativaAPI);
	}

	public RequisicaoEstimativaDePrazoBuilder estimaPrazo() {
		return new RequisicaoEstimativaDePrazoBuilder(correiosServicoEstimativaAPI);
	}

}
