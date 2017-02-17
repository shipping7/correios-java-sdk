package br.com.correios.api.postagem.etiqueta;

/**
 * Identificação com a letra "C", de cliente.
 *
 * Campo obrigatório para a solicitação de Etiquetas
 */
public enum TipoDestinatario {

	CLIENTE("C");

	private String codigoDoDestinatario;

	TipoDestinatario(String tipo) {
		this.codigoDoDestinatario = tipo;
	}

	public String getCodigoDoDestinatario() {
		return codigoDoDestinatario;
	}

}
