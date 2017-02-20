package br.com.correios.api.etiqueta;

public class Etiqueta {

	private String semDigitoVerificador;

	private String comDigitoVerificador;

	public Etiqueta(String semDigitoVerificador, String comDigitoVerificador) {
		this.semDigitoVerificador = semDigitoVerificador;
		this.comDigitoVerificador = comDigitoVerificador;
	}

	public String getSemDigitoVerificador() {
		return semDigitoVerificador;
	}

	public String getComDigitoVerificador() {
		return comDigitoVerificador;
	}

	@Override
	public String toString() {
		return "Etiqueta [semDigitoVerificador=" + semDigitoVerificador
				+ ", comDigitoVerificador=" + comDigitoVerificador + "]";
	}

}
