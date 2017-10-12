package br.com.correios.api.postagem.plp;

import br.com.correios.Cep;

public class Endereco {

	private final Cep cep;
	private final String logradouro;
	private final Integer numero;
	private final String complemento;
	private final String bairro;
	private final String cidade;
	private final String uf;

	Endereco(Cep cep, String logradouro, Integer numero, String complemento, String bairro, String cidade, String uf) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Cep getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUf() {
		return uf;
	}
	
}
