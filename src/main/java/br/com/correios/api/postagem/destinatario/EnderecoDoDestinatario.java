package br.com.correios.api.postagem.destinatario;

public class EnderecoDoDestinatario {

	/**
	 * Logradouro do destinatário. Recomendado utilizar o método buscaCEP()
	 *
	 * Preenchimento Obrigatório.
	 */
    private String logradouro;

    /**
     * Complemento do endereço
     *
     * Preenchimento não obrigatório.
     */
    private String complemento;

    /**
     * Parte do endereço
     *
     * Preenchimento Obrigatório.
     */
    private String numero;

	public EnderecoDoDestinatario(String logradouro, String complemento, String numero) {
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getNumero() {
		return numero;
	}

}
