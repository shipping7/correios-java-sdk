package br.com.correios.api.service;

public class CorreiosServicoSoapException extends RuntimeException {

	private static final long serialVersionUID = 3322940931807509294L;
	
	public CorreiosServicoSoapException(String mensagem, Exception e) {
		super(mensagem, e);
	}

}
