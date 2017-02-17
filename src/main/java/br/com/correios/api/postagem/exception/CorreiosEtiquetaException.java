package br.com.correios.api.postagem.exception;

public class CorreiosEtiquetaException extends RuntimeException {

	private static final long serialVersionUID = 1393319149905051126L;

	public CorreiosEtiquetaException(String mensagem) {
		super(mensagem);
	}

	public CorreiosEtiquetaException(String mensagem, Throwable e) {
		super(mensagem, e);
	}

}
