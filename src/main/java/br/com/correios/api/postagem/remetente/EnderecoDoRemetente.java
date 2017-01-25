package br.com.correios.api.postagem.remetente;

public class EnderecoDoRemetente {

	/**
	 * Logradouro do remetente. Recomendado utilizar o método buscaCEP()
	 *
	 * Preenchimento Obrigatório
	 */
	private String logradouro = "";

	/**
	 * Parte do endereço do Remetente
	 *
	 * Preenchimento Obrigatório
	 */
	private String numero = "";

	/**
	 * Complemento do endereço
	 *
	 * Preenchimento não Obrigatório
	 */
	private String complemento = "";

	/**
	 * Bairro do remetente
	 *
	 * Preenchimento Obrigatório
	 */
	private String bairro = "";

	/**
	 * Cep do Remetente
	 *
	 * Preenchimento Obrigatório 99999999
	 *
	 * Não pode existir o caractere “-“ entre os números.
	 */
	private String cep = "";

	/**
	 * Estado do Remetente
	 *
	 * Preenchimento Obrigatório
	 */
	private String cidade = "";

	/**
	 * Estado do Remetente
	 *
	 * Preenchimento Obrigatório
	 */
	private String estado = "";

	public EnderecoDoRemetente(String logradouro, String numero, String complemento, String bairro, String cep,
			String cidade, String estado) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

}
