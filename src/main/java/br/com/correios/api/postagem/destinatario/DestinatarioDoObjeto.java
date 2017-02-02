package br.com.correios.api.postagem.destinatario;

public class DestinatarioDoObjeto {

	/**
	 * Nome do destinatário
	 *
	 * Preenchimento Obrigatório.
	 *
	 * Tipo: Caractere(50)
	 */
    private String nome;

    /**
     * Dados de contato do destinatario, como telefone fixo e celular
     *
     * Preenchimento não obrigatório.
     */
    private DadosDeContatoDoDestinatario dadosDeContato;

    /**
     * Endereco do Destinatario
     *
     * Somente o Complemento não é obrigatório
     */
    private EnderecoDoDestinatario enderedo;

	public DestinatarioDoObjeto(String nome, DadosDeContatoDoDestinatario dadosDeContato,
			EnderecoDoDestinatario enderedo) {
		this.nome = nome;
		this.dadosDeContato = dadosDeContato;
		this.enderedo = enderedo;
	}

	public String getNome() {
		return nome;
	}

	public DadosDeContatoDoDestinatario getDadosDeContato() {
		return dadosDeContato;
	}

	public EnderecoDoDestinatario getEnderedo() {
		return enderedo;
	}

}
