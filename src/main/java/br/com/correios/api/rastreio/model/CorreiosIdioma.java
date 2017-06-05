package br.com.correios.api.rastreio.model;

/**
 * Enum que possui os idiomas aceitos pelo correio no momento da resposta dos Eventos
 * Cada idioma possui um código:
 * 101 - Portugues
 * 102 - Inglês
 */
public enum CorreiosIdioma {

	PORTUGUES("101"), INGLES("102");

	private String codigoInternoDosCorreio;

	CorreiosIdioma(String codigoInternoDosCorreios) {
		codigoInternoDosCorreio = codigoInternoDosCorreios;
	}

	public String getCodigoInternoDosCorreio() {
		return codigoInternoDosCorreio;
	}

}
