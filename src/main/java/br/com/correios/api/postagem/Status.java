package br.com.correios.api.postagem;

public class Status {

	private String descricao;

	private String codigo;

	public Status(String descricao, String codigo) {
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
