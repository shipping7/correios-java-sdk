package br.com.correios.api.postagem.exception;

public class CorreiosEtiquetaDadosInvalidosException extends RuntimeException {

	private static final long serialVersionUID = 5586581689645660888L;

	public CorreiosEtiquetaDadosInvalidosException(String mensagem) {
		super(mensagem);
	}

}
