package br.com.correios.api.etiqueta;

/**
 * Identificação com a letra "C", de cliente.
 *
 * Campo obrigatório para a solicitação de Etiquetas
 */
enum TipoDestinatario {

	CLIENTE("C");

	private String codigoDoDestinatario;

	TipoDestinatario(String tipo) {
		this.codigoDoDestinatario = tipo;
	}

	public String getCodigoDoDestinatario() {
		return codigoDoDestinatario;
	}

}
