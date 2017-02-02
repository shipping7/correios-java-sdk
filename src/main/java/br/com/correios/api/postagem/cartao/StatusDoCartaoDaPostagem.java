package br.com.correios.api.postagem.cartao;

public class StatusDoCartaoDaPostagem {

	private String descricao;

	private String codigo;

	public StatusDoCartaoDaPostagem(String descricao, String codigo) {
		this.descricao = descricao;
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCodigo() {
		return codigo;
	}

}
