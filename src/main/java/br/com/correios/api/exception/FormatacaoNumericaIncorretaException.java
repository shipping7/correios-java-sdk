package br.com.correios.api.exception;

import java.text.ParseException;

public class FormatacaoNumericaIncorretaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FormatacaoNumericaIncorretaException(ParseException e) {
		super(e);
	}

}
