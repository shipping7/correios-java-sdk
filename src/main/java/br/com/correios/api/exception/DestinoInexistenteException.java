package br.com.correios.api.exception;

public class DestinoInexistenteException extends RuntimeException {

	private static final long serialVersionUID = -7762115023478674904L;
	
	public DestinoInexistenteException(String mensagem) {
		super(mensagem);
	}

}
