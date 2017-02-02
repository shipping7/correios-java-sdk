package br.com.correios.api.postagem.adicional;

public class ServicoCorreioTipo {

	private String codigo;

    private String descricao;

	public ServicoCorreioTipo(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
