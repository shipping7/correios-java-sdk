package br.com.correios.api.postagem.plp;

public class EnderecoDeEntrega {

	/**
	 * Bairro do destinatário
	 *
	 * Preenchimento Obrigatório.
	 */
	private String bairro;

	/**
	 * Cidade do destinatário
	 *
	 * Preenchimento Obrigatório.
	 */
	private String cidade;

	/**
	 * Sigla da UF do destinatário
	 *
	 * Preenchimento Obrigatório
	 */
	private String uf;

	/**
	 * CEP do destinatário
	 *
	 * Preenchimento Obrigatório 99999999. Não pode existir o caractere "-"
	 * entre os números.
	 */
	private String cep;

	public EnderecoDeEntrega(String bairro, String cidade, String uf, String cep) {
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUf() {
		return uf;
	}

	public String getCep() {
		return cep;
	}

}
