package br.com.correios.api.postagem.cliente;

public class ClienteContrato {

	private String numeroContrato;

	private String possuiContrato;

	public ClienteContrato(String numeroContrato, String possuiContrato) {
		this.numeroContrato = numeroContrato;
		this.possuiContrato = possuiContrato;
	}

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public String getPossuiContrato() {
		return possuiContrato;
	}


}
