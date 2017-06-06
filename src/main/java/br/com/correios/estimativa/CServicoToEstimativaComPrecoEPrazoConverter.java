package br.com.correios.estimativa;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.BooleanStringfier;
import br.com.correios.BooleanStringfier.TipoBooleanStringfier;
import br.com.correios.api.converter.Converter;
import br.com.correios.webservice.estimativa.CServico;

public class CServicoToEstimativaComPrecoEPrazoConverter implements Converter<CServico, EstimativaComPrecoEPrazo> {

	private static final int TAMANHO_CODIGO_SERVICO = 5;

	@Override
	public EstimativaComPrecoEPrazo convert(CServico servico) {
		EstimativaComPrecoEPrazo estimativa = new EstimativaComPrecoEPrazo();
		BooleanStringfier booleanStringfier = new BooleanStringfier(TipoBooleanStringfier.S_OU_N);

		estimativa.setCodigoServico(StringUtils.leftPad(String.valueOf(servico.getCodigo()), TAMANHO_CODIGO_SERVICO, "0"));
		estimativa.setPrazoEntrega(Integer.valueOf(servico.getPrazoEntrega()));
		estimativa.setValor(servico.getValor());
		estimativa.setValorServicoAvisoDeRecebimento(servico.getValorAvisoRecebimento());
		estimativa.setValorServicoMaoPropria(servico.getValorMaoPropria());
		estimativa.setValorSemAdicionais(servico.getValorSemAdicionais());
		estimativa.setEntregaDomiciliar(booleanStringfier.convertToBoolean(servico.getEntregaDomiciliar()));
		estimativa.setEntregaAosSabados(booleanStringfier.convertToBoolean(servico.getEntregaSabado()));
		estimativa.setCodigoErro(servico.getErro());
		estimativa.setMensagemErro(servico.getMsgErro());

		return estimativa;
	}

}
