package br.com.correios.api.postagem;

import com.google.common.base.MoreObjects;

public class CorreiosPostagemDadosAutenticacao {

	private String usuario;

	private String senha;

	public CorreiosPostagemDadosAutenticacao(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("usuario", usuario)
				.add("senha", senha)
				.toString();
	}

}
