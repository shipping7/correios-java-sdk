package br.com.correios.estimativa;

import java.util.LinkedList;
import java.util.List;

import br.com.correios.api.converter.Converter;
import br.com.correios.webservice.estimativa.CResultado;
import br.com.correios.webservice.estimativa.CServico;

public class CResultadoToEstimativasConverter<T> implements Converter<CResultado, List<T>> {

	private Converter<CServico, T> precoPrazoConverter;

	public CResultadoToEstimativasConverter(Converter<CServico, T> precoPrazoConverter) {
		this.precoPrazoConverter = precoPrazoConverter;
	}

	@Override
	public List<T> convert(CResultado cResultado) {
		List<T> estimativas = new LinkedList<>();

		for (CServico servico : cResultado.getServicos().getCServico()) {
			estimativas.add(precoPrazoConverter.convert(servico));
		}

		return estimativas;
	}

}
