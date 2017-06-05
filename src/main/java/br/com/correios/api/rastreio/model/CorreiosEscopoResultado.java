package br.com.correios.api.rastreio.model;

/**
 * Delimitacao do escopo da resposta a ser dada a consulta do rastreamento de cada objeto
 * T: Serao retornados todos os eventos do objeto
 * U: Sera retornado apenas o ultimo evento do objeto
 *
 * @since 0.0.1-BETA
 */
public enum CorreiosEscopoResultado {

	TODOS_OS_EVENTOS("T"), ULTIMO_EVENTO("U");

	private String codigoInternoDosCorreios;

	CorreiosEscopoResultado(String codigoInternoDosCorreios) {
		this.codigoInternoDosCorreios = codigoInternoDosCorreios;
	}

	public String getCodigoInternoDosCorreios() {
		return codigoInternoDosCorreios;
	}

}
