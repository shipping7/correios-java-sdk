package br.com.correios.api.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;

import org.junit.Test;

import br.com.correios.api.exception.DataInvalidaDoEventoException;

public class DateFormatterTest {

	@Test
	public void deveriaFormatarDataEnviadaPelosCorreiosDeAcordoComOSeuPadrao() throws Exception {
		String dataDoCorreio = "15/06/2016";
		
		Calendar dataFormatada = DateFormatter.formataComPadraoDosCorreios(dataDoCorreio);
		
		assertThat(dataFormatada.get(Calendar.DAY_OF_MONTH)).isEqualTo(15);
		assertThat(dataFormatada.get(Calendar.MONTH)).isEqualTo(5);
		assertThat(dataFormatada.get(Calendar.YEAR)).isEqualTo(2016);
	}
	
	@Test(expected = DataInvalidaDoEventoException.class)
	public void deveriaLancarUmaExcecaoQuandoADataVindaDosCorreiosEstiverInvalida() throws Exception {
		String dataDoCorreio = "invalido";
		
		DateFormatter.formataComPadraoDosCorreios(dataDoCorreio);
	}
	
}
