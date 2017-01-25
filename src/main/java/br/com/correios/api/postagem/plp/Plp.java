package br.com.correios.api.postagem.plp;

public class Plp {

	/**
	 * Id da PLP
	 */
	private String id;

	/**
	 * Valor em reais do total da tarificação dos objetos da PLP, que será
	 * retornada através do método solicitaXmlPlp quando postada
	 */
	private String valorTotalDaTarifacao;

	/**
	 * Identifica a unidade de postagem dos Correios.
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

	public Plp(String id, String valorTotalDaTarifacao, String unidadeDePostagem, String nomeUnidadePostagem,
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
