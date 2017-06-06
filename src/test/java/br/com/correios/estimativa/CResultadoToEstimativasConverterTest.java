package br.com.correios.estimativa;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.correios.api.converter.Converter;
import br.com.correios.webservice.estimativa.CResultado;
import br.com.correios.webservice.estimativa.CServico;

@RunWith(MockitoJUnitRunner.class)
public class CResultadoToEstimativasConverterTest {

	@Mock
	private Converter<CServico, EstimativaComPrecoEPrazo> converterServicoPrecoEPrazo;
	@Mock
	private Converter<CServico, EstimativaComPrazo> converterServicoPrazo;
	@Mock(answer=Answers.RETURNS_DEEP_STUBS)
	private CResultado cResultado;

	@Test
	public void deveriaConverterCResultadoEmListaDeEstimativasDePrecoEPrazo() {
		CServico servico = new CServico();
		when(cResultado.getServicos().getCServico()).thenReturn(Arrays.asList(servico, servico));

		CResultadoToEstimativasConverter<EstimativaComPrecoEPrazo> converter = new CResultadoToEstimativasConverter<>(converterServicoPrecoEPrazo);

		List<EstimativaComPrecoEPrazo> estimativas = converter.convert(cResultado);

		assertEquals(2, estimativas.size());
		verify(converterServicoPrecoEPrazo, times(2)).convert(any());
	}

	@Test
	public void deveriaConverterCResultadoEmListaDeEstimativasDePrazo() {
		CServico servico = new CServico();
		when(cResultado.getServicos().getCServico()).thenReturn(Arrays.asList(servico, servico));

		CResultadoToEstimativasConverter<EstimativaComPrazo> converter = new CResultadoToEstimativasConverter<>(converterServicoPrazo);

		List<EstimativaComPrazo> estimativas = converter.convert(cResultado);

		assertEquals(2, estimativas.size());
		verify(converterServicoPrazo, times(2)).convert(any());
	}

}
