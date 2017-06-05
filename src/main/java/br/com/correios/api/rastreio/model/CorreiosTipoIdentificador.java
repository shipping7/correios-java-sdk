package br.com.correios.api.rastreio.model;

/**
 * Definição de como a lista de identificadores de objetos deverá ser interpretada pelo servidor SRO.
 * L: lista de objetos. O servidor fará a consulta individual de cada identificador informado;
 * F: intervalo de objetos. O servidor fará a consulta sequencial do primeiro ao último objeto informado,
 *
 * @since 0.0.1-BETA
 */
public enum CorreiosTipoIdentificador {

	LISTA_DE_OBJETOS("L"), INTERVALO_DE_OBJETOS("F");

	private String codigoInternoDosCorreios;

	CorreiosTipoIdentificador(String codigoInternoDosCorreios) {
		this.codigoInternoDosCorreios = codigoInternoDosCorreios;
	}

	public String getCodigoInternoDosCorreios() {
		return codigoInternoDosCorreios;
	}

}
