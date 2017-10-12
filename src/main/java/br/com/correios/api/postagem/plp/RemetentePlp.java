package br.com.correios.api.postagem.plp;

public class RemetentePlp {

	private final String nome;
	private final String email;
	private final String numeroContrato;
	private final String numeroDeDiretoria;
	private final String codigoAdministrativo;
	private final Endereco endereco;

	RemetentePlp(String nome, String email, String numeroContrato, String numeroDeDiretoria, String codigoAdministrativo, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.numeroContrato = numeroContrato;
		this.numeroDeDiretoria = numeroDeDiretoria;
		this.codigoAdministrativo = codigoAdministrativo;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public String getNumeroDeDiretoria() {
		return numeroDeDiretoria;
	}

	public String getCodigoAdministrativo() {
		return codigoAdministrativo;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
}
