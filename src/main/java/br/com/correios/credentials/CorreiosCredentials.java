package br.com.correios.credentials;

/**
 * 
 * @author Alexandre Gama
 *
 */
public class CorreiosCredentials {

	/**
	 * Identificação do cliente
	 * Informado pela área comercial dos Correios na ativação do serviço. 
	 * Usuario é case sensitive
	 */
	private String usuario;
	
	/**
	 * Senha do cliente
	 * Informado pela área comercial dos Correios na ativação do serviço. 
	 * Senha é case sensitive
	 */
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
