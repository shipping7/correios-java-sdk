package br.com.correios.api;

/**
 * 
 * @author Alexandre Gama
 *
 */
public class LocalDoPacote {

	private String nome;
	
	private String codigo;
	
	private String cidade;
	
	private String bairro;
	
	private String uf;

	public LocalDoPacote(String nome, String codigo, String cidade, String bairro, String uf) {
		this.nome = nome;
		this.codigo = codigo;
		this.cidade = cidade;
		this.bairro = bairro;
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "LocalDoPacote [nome=" + nome + ", codigo=" + codigo + ", cidade=" + cidade + ", bairro=" + bairro
				+ ", uf=" + uf + "]";
	}
	
	
}
