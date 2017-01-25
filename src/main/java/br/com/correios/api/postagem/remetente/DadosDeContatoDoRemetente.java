package br.com.correios.api.postagem.remetente;

public class DadosDeContatoDoRemetente {

	/**
	 * Telefone do Remetente.
	 *
	 * Preenchimento não obrigatório
	 *
	 * Não pode existir o caractere “-“ entre os números.
	 */
	private String telefone;

	/**
	 * Fax do remetente
	 *
	 * Preenchimento não obrigatório. 99999999999
	 *
	 * Não pode existir o caractere “-“ entre os números
	 */
	private String fax;

	/**
	 * Email do remetente
	 *
	 * Preenchimento não obrigatório.
	 */
	private String email;

	public DadosDeContatoDoRemetente(String telefone, String fax, String email) {
		this.telefone = telefone;
		this.fax = fax;
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getFax() {
		return fax;
	}

	public String getEmail() {
		return email;
	}

}
