package br.com.correios.api.postagem.exception;

public class CorreiosUnsupportedTipoObjetoException extends RuntimeException {

	private static final long serialVersionUID = -652049072426370493L;

	public CorreiosUnsupportedTipoObjetoException(String message) {
		super(message);
	}

}
