package br.com.correios.api.postagem.destinatario;

public class DadosDeContatoDoDestinatario {

	/**
     * Email do Destinatário
     *
     * Preenchimento não obrigatório.
     *
     * Tipo: Caractere(50)
     */
    private String email;

	/**
     * Telefone do Destinatário
     *
     * Preenchimento não obrigatório. 99999999999 Não pode existir o caractere "-" entre os números
     *
     * Tipo: Numérico (12)
     */
    private String telefone;

    /**
     * Celular do Destinatário
     *
     * Preenchimento não obrigatório. 99999999999 Não pode existir o caractere "-" entre os números
     *
     * Tipo: Numérico (12)
     */
    private String celular;

	public DadosDeContatoDoDestinatario(String email, String telefone, String celular) {
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCelular() {
		return celular;
	}

	public String getEmail() {
		return email;
	}

}
