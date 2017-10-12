package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;

import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado;

public class DimensoesDoObjetoPlp {

	private final TipoDoObjetoSendoEnviado tipoDoObjetoSendoEnviado;
	private final BigDecimal altura;
	private final BigDecimal comprimento;
	private final BigDecimal largura;
	private final BigDecimal diametro;
	
	DimensoesDoObjetoPlp(TipoDoObjetoSendoEnviado tipoDoObjetoSendoEnviado, BigDecimal altura, BigDecimal comprimento, BigDecimal largura, BigDecimal diametro) {
		this.tipoDoObjetoSendoEnviado = tipoDoObjetoSendoEnviado;
		this.altura = altura;
		this.comprimento = comprimento;
		this.largura = largura;
		this.diametro = diametro;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public BigDecimal getComprimento() {
		return comprimento;
	}

	public BigDecimal getLargura() {
		return largura;
	}

	public BigDecimal getDiametro() {
		return diametro;
	}

	public TipoDoObjetoSendoEnviado getTipoDoObjetoSendoEnviado() {
		return tipoDoObjetoSendoEnviado;
	}
	
}
