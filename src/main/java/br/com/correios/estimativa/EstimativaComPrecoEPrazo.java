package br.com.correios.estimativa;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EstimativaComPrecoEPrazo {

	private String codigoServico;
	private String valor;
	private Integer prazoEntrega;
	private String valorServicoMaoPropria;
	private String valorServicoAvisoDeRecebimento;
	private boolean entregaDomiciliar;
	private boolean entregaAosSabados;
	private String valorSemAdicionais;
	private String codigoErro;
	private String mensagemErro;

	public String getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Integer getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(Integer prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

	public String getValorServicoMaoPropria() {
		return valorServicoMaoPropria;
	}

	public void setValorServicoMaoPropria(String valorServicoMaoPropria) {
		this.valorServicoMaoPropria = valorServicoMaoPropria;
	}

	public String getValorServicoAvisoDeRecebimento() {
		return valorServicoAvisoDeRecebimento;
	}

	public void setValorServicoAvisoDeRecebimento(String valorServicoAvisoDeRecebimento) {
		this.valorServicoAvisoDeRecebimento = valorServicoAvisoDeRecebimento;
	}

	public boolean isEntregaDomiciliar() {
		return entregaDomiciliar;
	}

	public void setEntregaDomiciliar(boolean entregaDomiciliar) {
		this.entregaDomiciliar = entregaDomiciliar;
	}

	public boolean isEntregaAosSabados() {
		return entregaAosSabados;
	}

	public void setEntregaAosSabados(boolean entregaAosSabados) {
		this.entregaAosSabados = entregaAosSabados;
	}

	public String getValorSemAdicionais() {
		return valorSemAdicionais;
	}

	public void setValorSemAdicionais(String valorSemAdicionais) {
		this.valorSemAdicionais = valorSemAdicionais;
	}

	public String getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(String codigoErro) {
		this.codigoErro = codigoErro;
	}

	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	public boolean isEstimativaValida() {
		return StringUtils.isBlank(codigoErro) || "0".equals(codigoErro);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
