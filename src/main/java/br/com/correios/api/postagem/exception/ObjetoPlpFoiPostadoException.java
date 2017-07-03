package br.com.correios.api.postagem.exception;

public class ObjetoPlpFoiPostadoException extends RuntimeException {

	private static final long serialVersionUID = -3328326631056241491L;

	public ObjetoPlpFoiPostadoException(String mensagem, Exception exceptionCancelamento) {
		super(mensagem, exceptionCancelamento);
	}

}
