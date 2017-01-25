package br.com.correios.api.postagem.exception;

public class PlpException extends RuntimeException {

	private static final long serialVersionUID = 4238354294423806208L;

	public PlpException(String message, Exception e) {
		super(message, e);
	}
}
