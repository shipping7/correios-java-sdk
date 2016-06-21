package br.com.correios.api.exception;

public class CorreiosEventosConverterException extends RuntimeException {

	private static final long serialVersionUID = 3436745761184137500L;
	
	public CorreiosEventosConverterException(String mensagem, Exception e) {
		super(mensagem, e);
	}
	
}
