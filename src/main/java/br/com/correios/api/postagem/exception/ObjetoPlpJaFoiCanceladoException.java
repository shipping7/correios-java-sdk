package br.com.correios.api.postagem.exception;

public class ObjetoPlpJaFoiCanceladoException extends RuntimeException {

	private static final long serialVersionUID = -6940355031846418834L;

	public ObjetoPlpJaFoiCanceladoException(String mensagem, Exception exceptionCancelamento) {
		super(mensagem, exceptionCancelamento);
	}

}
