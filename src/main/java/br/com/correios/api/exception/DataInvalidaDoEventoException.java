package br.com.correios.api.exception;

public class DataInvalidaDoEventoException extends RuntimeException {

	private static final long serialVersionUID = 2776160029765603084L;
	
	public DataInvalidaDoEventoException(String mensagem) {
		super(mensagem);
	}
}
