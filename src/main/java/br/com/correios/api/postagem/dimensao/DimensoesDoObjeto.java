package br.com.correios.api.postagem.dimensao;

public class DimensoesDoObjeto {

    private String tipo;

    private String altura;

    private String largura;

    private String comprimento;

    private int diametro;

	public DimensoesDoObjeto(String tipo, String altura, String largura, String comprimento, int diametro) {
		this.tipo = tipo;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.diametro = diametro;
	}

	public String getTipo() {
		return tipo;
	}

	public String getAltura() {
		return altura;
	}

	public String getLargura() {
		return largura;
	}

	public String getComprimento() {
		return comprimento;
	}

	public int getDiametro() {
		return diametro;
	}

}
