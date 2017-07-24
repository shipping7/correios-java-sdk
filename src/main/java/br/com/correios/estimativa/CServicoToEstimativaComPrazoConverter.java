package br.com.correios.estimativa;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.BooleanStringfier;
import br.com.correios.BooleanStringfier.TipoBooleanStringfier;
import br.com.correios.api.converter.Converter;
import br.com.correios.webservice.estimativa.CServico;

public class CServicoToEstimativaComPrazoConverter implements Converter<CServico, EstimativaComPrazo> {

	private static final int TAMANHO_CODIGO_SERVICO = 5;

	@Override
	public EstimativaComPrazo convert(CServico servico) {
		EstimativaComPrazo estimativa = new EstimativaComPrazo();
		BooleanStringfier booleanStringfier = new BooleanStringfier(TipoBooleanStringfier.S_OU_N);

		estimativa.setCodigoServico(StringUtils.leftPad(String.valueOf(servico.getCodigo()), TAMANHO_CODIGO_SERVICO, "0"));
		estimativa.setPrazoEntrega(Integer.valueOf(servico.getPrazoEntrega()));
		estimativa.setEntregaDomiciliar(booleanStringfier.convertToBoolean(servico.getEntregaDomiciliar()));
		estimativa.setEntregaAosSabados(booleanStringfier.convertToBoolean(servico.getEntregaSabado()));
		estimativa.setCodigoErro(servico.getErro());
		estimativa.setMensagemErro(servico.getMsgErro());
		estimativa.setDataMaximaEntrega(servico.getDataMaxEntrega());
		estimativa.setHoraMaximaEntrega(servico.getHoraMaxEntrega());

		return estimativa;
	}

}
