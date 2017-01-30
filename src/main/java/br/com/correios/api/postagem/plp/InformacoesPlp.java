package br.com.correios.api.postagem.plp;

public class InformacoesPlp {

	/**
	 * Id da PLP
	 *
	 * Identifica o registro da PLP – Pré Lista de Postagem que será retornada através do método fechaPLP e sendo chave para o atendimento nos
	 * Correios dos objetos a serem postados
	 *
	 * Preenchimento não obrigatório
	 *
	 * Tipo: Numérico(10)
	 */
	private String id;

	/**
	 * Representado pela tag <valor_global>
	 *
	 * Valor em reais do total da tarificação dos objetos da PLP, que será
	 * retornada através do método solicitaXmlPlp quando postada
	 *
	 * Tipo: Numérico(10,2)
	 *
	 * Preenchimento não obrigatório.
	 */
	private String valorTotalDaTarifacao;

	/**
	 * Representado pela tag <mcu_unidade_postagem>
	 *
	 * Identifica a unidade de postagem dos Correios.
	 *
	 * Preenchimento não obrigatório.
	 *
	 * Tipo: Caractere(12)
	 */
	private String unidadeDePostagem;

	/**
	 * Nome da unidade de postagem dos Correios.
	 */
	private String nomeUnidadePostagem;

	/**
	 * Numero do cartão do cliente associado à PLP. Ex: 0087654321 (sempre com
	 * 10 caracteres – inserir zeros à esquerda).
	 */
	private String numeroDoCartaoDePostagem;

	public InformacoesPlp(String id, String valorTotalDaTarifacao, String unidadeDePostagem, String nomeUnidadePostagem,
			String numeroDoCartaoDePostagem) {
		this.id = id;
		this.valorTotalDaTarifacao = valorTotalDaTarifacao;
		this.unidadeDePostagem = unidadeDePostagem;
		this.nomeUnidadePostagem = nomeUnidadePostagem;
		this.numeroDoCartaoDePostagem = numeroDoCartaoDePostagem;
	}

	public String getId() {
		return id;
	}

	public String getValorTotalDaTarifacao() {
		return valorTotalDaTarifacao;
	}

	public String getUnidadeDePostagem() {
		return unidadeDePostagem;
	}

	public String getNomeUnidadePostagem() {
		return nomeUnidadePostagem;
	}

	public String getNumeroDoCartaoDePostagem() {
		return numeroDoCartaoDePostagem;
	}

}
