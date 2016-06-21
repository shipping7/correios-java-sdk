package br.com.correios.api.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.correios.api.exception.DataInvalidaDoEventoException;

public class FormatadorData {

	public static Calendar formataComPadraoDosCorreios(String data) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		try {
			date = formatador.parse(data);
			Calendar dataDoEvento = Calendar.getInstance();
			dataDoEvento.setTime(date);
			return dataDoEvento;
		} catch (ParseException e) {
			throw new DataInvalidaDoEventoException(String.format("A seguinte data retornada pelo correios é inválida: %s", data));
		}
	}

}
