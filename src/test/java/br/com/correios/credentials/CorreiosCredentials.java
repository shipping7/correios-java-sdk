package br.com.correios.credentials;

public class CorreiosCredentials {

	private String usuario;
	private String senha;

	public CorreiosCredentials(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public String getSenha() {
		return senha;
	}

}
