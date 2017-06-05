package br.com.correios.credentials;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * Responsavel pela autenticacao com a API dos correios.
 */
public class CorreiosCredenciais {

	/**
	 * Identificação do cliente
	 * Informado pela área comercial dos Correios na ativação do serviço.
	 * Usuario é case sensitive
	 */
	private final String usuario;

	/**
	 * Senha do cliente
	 * Informado pela área comercial dos Correios na ativação do serviço.
	 * Senha é case sensitive
	 */
	private final String senha;

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

	@Override
	public String toString() {
		return toStringHelper(this)
				.add("usuario", this.usuario)
				.add("senha", this.senha)
				.toString();
	}
}
