package br.com.correios.api.postagem.remetente;

public class RemetenteDaPostagem {

	/**
	 * Número do contrato do cliente
	 *
	 * Preenchimento Obrigatório. Não pode existir o caractere “-“ entre os
	 * números.
	 *
	 * Tipo: Caractere(10)
	 */
	private String numeroDoContrato;

	/**
	 * Número da Diretoria Regional do contrato do cliente, conforme Anexo 05.
	 *
	 * Preenchimento Obrigatório.
	 *
	 * Tipo: Numerico(2)
	 */
	private int numeroDaDiretoriaRegional;

	/**
	 * Código administrativo do cliente
	 *
	 * Preenchimento Obrigatório. Não pode existir o caractere “-“ entre os
	 * números.
	 *
	 * Caractere(8)
	 */
	private String codigoAdministrativo;

	/**
	 * Nome do remetente
	 *
	 * Preenchimento Obrigatório.
	 *
	 * Tipo: Caractere(50)
	 */
	private String nome;

	/**
	 * Dados de Contato do Remetente
	 *
	 * Os campos não são de preenchimento obrigatório
	 */
	private DadosDeContatoDoRemetente dadosDeContato;

	/**
	 * Dados do Endereço do Remetente
	 *
	 * Existem campos obrigatórios no endereco
	 */
	private EnderecoDoRemetente endereco;

	public RemetenteDaPostagem(String numeroDoContrato, int numeroDaDiretoriaRegional, String codigoAdministrativo,
			String nome, DadosDeContatoDoRemetente dadosDeContato, EnderecoDoRemetente endereco) {
		this.numeroDoContrato = numeroDoContrato;
		this.numeroDaDiretoriaRegional = numeroDaDiretoriaRegional;
		this.codigoAdministrativo = codigoAdministrativo;
		this.nome = nome;
		this.dadosDeContato = dadosDeContato;
		this.endereco = endereco;
	}

	public String getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public int getNumeroDaDiretoriaRegional() {
		return numeroDaDiretoriaRegional;
	}

	public String getCodigoAdministrativo() {
		return codigoAdministrativo;
	}

	public String getNome() {
		return nome;
	}

	public DadosDeContatoDoRemetente getDadosDeContato() {
		return dadosDeContato;
	}

	public EnderecoDoRemetente getEndereco() {
		return endereco;
	}

}
