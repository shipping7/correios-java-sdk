package br.com.correios.api;

/**
 * @author Alexandre Gama
 * 
 * Delimitação do escopo da resposta a ser dada à consulta do rastreamento de cada objeto
 * T: Serão retornados todos os eventos do objeto 
 * U: Será retornado apenas o último evento do objeto
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
