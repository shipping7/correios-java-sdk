package br.com.correios.api.service;

public class CorreiosSoapServiceException extends RuntimeException {

	private static final long serialVersionUID = 3322940931807509294L;
	
	public CorreiosSoapServiceException(String mensagem, Exception e) {
		super(mensagem, e);
	}

}
