package br.com.correios.api.estimativa;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.BooleanStringfier;
import br.com.correios.BooleanStringfier.TipoBooleanStringfier;
import br.com.correios.Cep;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.estimativa.CResultadoToEstimativasConverter;
import br.com.correios.estimativa.DimensoesPacoteEstimado;
import br.com.correios.estimativa.EstimativaComPrazo;
import br.com.correios.estimativa.EstimativaComPrecoEPrazo;
import br.com.correios.webservice.estimativa.CResultado;
import br.com.correios.webservice.estimativa.CalcPrecoPrazoWS;
import br.com.correios.webservice.estimativa.CalcPrecoPrazoWSSoap;

class SoapCorreiosServicoEstimativaAPI implements CorreiosServicoEstimativaAPI {

	private CorreiosCredenciais correiosCredenciais;
	private CResultadoToEstimativasConverter<EstimativaComPrecoEPrazo> precoEPrazoConverter;
	private CResultadoToEstimativasConverter<EstimativaComPrazo> prazoConverter;
	private CalcPrecoPrazoWS calcPrecoPrazoWS;

	SoapCorreiosServicoEstimativaAPI(CalcPrecoPrazoWS calcPrecoPrazoWS, CorreiosCredenciais correiosCredenciais, CResultadoToEstimativasConverter<EstimativaComPrecoEPrazo> precoEPrazoConverter, CResultadoToEstimativasConverter<EstimativaComPrazo> prazoConverter) {
		this.calcPrecoPrazoWS = calcPrecoPrazoWS;
		this.correiosCredenciais = correiosCredenciais;
		this.precoEPrazoConverter = precoEPrazoConverter;
		this.prazoConverter = prazoConverter;
	}

	@Override
	public List<EstimativaComPrecoEPrazo> calculaPrecoEPrazo(Set<String> codigosServico, Cep cepOrigem, Cep cepDestino, DimensoesPacoteEstimado dimensoesPacoteEstimado, BigDecimal valorDeclarado, boolean adicionaServicoMaoPropria, boolean adicionaServicoAvisoRecebimento) {
		CalcPrecoPrazoWSSoap calcPrecoPrazoWSSoap = calcPrecoPrazoWS.getCalcPrecoPrazoWSSoap();

		BooleanStringfier booleanStringfier = new BooleanStringfier(TipoBooleanStringfier.S_OU_N);

		CResultado cResultado = calcPrecoPrazoWSSoap.calcPrecoPrazo(correiosCredenciais.getUsuario(),
			correiosCredenciais.getSenha(),
			StringUtils.join(codigosServico, ','),
			cepOrigem.value(),
			cepDestino.value(),
			dimensoesPacoteEstimado.getPeso().toString(),
			dimensoesPacoteEstimado.getTipoDoObjetoSendoEnviado().getCodigoInternoParaEstimativa(),
			dimensoesPacoteEstimado.getComprimento(),
			dimensoesPacoteEstimado.getAltura(),
			dimensoesPacoteEstimado.getLargura(),
			dimensoesPacoteEstimado.getDiametro(),
			booleanStringfier.convertToString(adicionaServicoMaoPropria),
			valorDeclarado,
			booleanStringfier.convertToString(adicionaServicoAvisoRecebimento));

		return precoEPrazoConverter.convert(cResultado);
	}

	@Override
	public List<EstimativaComPrazo> calculaPrazo(Set<String> codigosServico, Cep cepOrigem, Cep cepDestino) {
		CalcPrecoPrazoWSSoap calcPrecoPrazoWSSoap = calcPrecoPrazoWS.getCalcPrecoPrazoWSSoap();

		String[] codigosServicoArray = codigosServico.toArray(new String[codigosServico.size()]);
		CResultado cResultado = calcPrecoPrazoWSSoap.calcPrazo(StringUtils.join(codigosServicoArray, ','), cepOrigem.value(), cepDestino.value());

		return prazoConverter.convert(cResultado);
	}

}
