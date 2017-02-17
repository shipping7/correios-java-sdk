package br.com.correios.api.postagem.exception;

public class CorreiosPostagemDadosInvalidosException extends RuntimeException {

	private static final long serialVersionUID = 5586581689645660888L;

	public CorreiosPostagemDadosInvalidosException(String mensagem) {
		super(mensagem);
	}

}
