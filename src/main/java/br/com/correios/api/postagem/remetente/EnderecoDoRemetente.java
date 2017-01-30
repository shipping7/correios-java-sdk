package br.com.correios.api.postagem.remetente;

public class EnderecoDoRemetente {

	/**
	 * Logradouro do remetente. Recomendado utilizar o método buscaCEP()
	 *
	 * Preenchimento Obrigatório
	 *
	 * Tipo: Caractere(40)
	 */
	private String logradouro;

	/**
	 * Parte do endereço do Remetente
	 *
	 * Preenchimento Obrigatório
	 *
	 * Tipo: Caractere(5)
	 */
	private String numero;

	/**
	 * Complemento do endereço
	 *
	 * Preenchimento não Obrigatório
	 *
	 * Tipo: Caractere(20)
	 */
	private String complemento;

	/**
	 * Bairro do remetente
	 *
	 * Preenchimento Obrigatório
	 *
	 * Tipo: Caractere(20)
	 */
	private String bairro;

	/**
	 * Cep do Remetente
	 *
	 * Preenchimento Obrigatório 99999999
	 *
	 * Não pode existir o caractere "-" entre os números.
	 *
	 * Tipo: Numérico(8)
	 */
	private String cep;

	/**
	 * Estado do Remetente
	 *
	 * Preenchimento Obrigatório
	 *
	 * Tipo: Caractere(30)
	 */
	private String cidade;

	/**
	 * Estado do Remetente
	 *
	 * Preenchimento Obrigatório
	 *
	 * Tipo: Caractere(2)
	 */
	private String estado;

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
