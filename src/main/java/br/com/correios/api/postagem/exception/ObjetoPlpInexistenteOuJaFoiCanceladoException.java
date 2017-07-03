package br.com.correios.api.postagem.exception;

public class ObjetoPlpInexistenteOuJaFoiCanceladoException extends RuntimeException {

	private static final long serialVersionUID = 8708529032418284246L;

	public ObjetoPlpInexistenteOuJaFoiCanceladoException(String mensagem,	Exception exception) {
		super(mensagem, exception);
	}

}
