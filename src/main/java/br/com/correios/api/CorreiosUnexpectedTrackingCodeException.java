package br.com.correios.api;

public class CorreiosUnexpectedTrackingCodeException extends RuntimeException {

	private static final long serialVersionUID = 737499170988505334L;
	
	public CorreiosUnexpectedTrackingCodeException(String message) {
		super(message);
	}

}
