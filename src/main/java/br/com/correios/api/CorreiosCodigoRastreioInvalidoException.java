package br.com.correios.api;

public class CorreiosCodigoRastreioInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 737499170988505334L;
	
	public CorreiosCodigoRastreioInvalidoException(String message) {
		super(message);
	}

}
