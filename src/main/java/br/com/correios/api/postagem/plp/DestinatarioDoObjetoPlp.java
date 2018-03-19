package br.com.correios.api.postagem.plp;

public class DestinatarioDoObjetoPlp {

	private final String nome;
	private final Endereco endereco;
	
	DestinatarioDoObjetoPlp(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
}
