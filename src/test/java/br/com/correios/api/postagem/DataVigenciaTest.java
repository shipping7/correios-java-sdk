package br.com.correios.api.postagem;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class DataVigenciaTest {

	@Test
	public void deveriaRetornarADataInicialNoFormatoDefaultBrasileiro() throws Exception {
		DataVigencia data = new DataVigencia();

		Calendar dataDeInicio = new GregorianCalendar(2017, 5, 15);

		data.setDataDoInicioDaVigencia(dataDeInicio);

		String dataDeInicioFormatada = data.getDataDoInicioDaVigenciaFormatada().get();

		assertThat(dataDeInicioFormatada).isEqualTo("15/06/2017");
	}

	@Test
	public void deveriaRetornarADataFinalNoFormatoDefaultBrasileiro() throws Exception {
		DataVigencia data = new DataVigencia();

		Calendar dataFinal = new GregorianCalendar(2017, 5, 15);

		data.setDataDoFimDaVigencia(dataFinal);

		String dataDeFimFormatada = data.getDataDoFimDaVigenciaFormatada().get();

		assertThat(dataDeFimFormatada).isEqualTo("15/06/2017");
	}

}
