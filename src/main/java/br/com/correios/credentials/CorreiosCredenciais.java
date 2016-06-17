package br.com.correios.credentials;

/**
 * @author Alexandre Gama
 * Classe que deve ser usada para a autenticacao com a API dos correios. 
 */
public class CorreiosCredenciais {

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

	public CorreiosCredenciais(String usuario, String senha) {
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
