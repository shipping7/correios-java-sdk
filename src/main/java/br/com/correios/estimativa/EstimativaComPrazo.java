package br.com.correios.estimativa;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Classe que representa uma estimativa calculada pelo servico do Correios
 * que possui <b>somente o prazo</b> da encomenda
 *
 * @since 0.0.17-BETA
 */
public class EstimativaComPrazo {

	/**
	 * Codigo do Servico de Entrega.
	 */
	private String codigoServico;

	/**
	 * Prazo estimado em dias para entrega do produto.
	 * Se o valor retornado for 0 (zero), indica que o prazo nao foi retornado corretamente.
	 * Mas nesso modelo use {@link #isEstimativaValida()} para validar se a estimativa esta valida
	 */
	private Integer prazoEntrega;

	/**
	 * Informa se a localidade informada possui entrega domiciliaria.
	 * Se o prazo nao for retornado corretamente, o retorno deste parametro sera vazio.
	 */
	private boolean entregaDomiciliar;

	/**
	 * Informa se a localidade informada possui entrega domiciliaria aos sabados.
	 * Se o prazo nao for retornado corretamente, o retorno deste parametro sera vazio.
	 */
	private boolean entregaAosSabados;

	/**
	 * Codigo do Erro retornado pelo calculador
	 */
	private String codigoErro;

	/**
	 * Descricao do erro gerado.
	 */
	private String mensagemErro;

	/**
	 * Data maxima que a entrega pode chegar.
	 */
	private String dataMaximaEntrega;

	/**
	 * Hora maxima que a entrega pode chegar.
	 */
	private String horaMaximaEntrega;

	public String getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}

	public Integer getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(Integer prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
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

	public String getDataMaximaEntrega() {
		return dataMaximaEntrega;
	}

	public void setDataMaximaEntrega(String dataMaximaEntrega) {
		this.dataMaximaEntrega = dataMaximaEntrega;
	}

	public String getHoraMaximaEntrega() {
		return horaMaximaEntrega;
	}

	public void setHoraMaximaEntrega(String horaMaximaEntrega) {
		this.horaMaximaEntrega = horaMaximaEntrega;
	}

	/**
	 * @return se uma estimativa esta valida, ou seja, possui um prazo de entrega valido
	 */
	public boolean isEstimativaValida() {
		return !temMensagemErro() || prazoEntrega != 0;
	}

	/**
	 * @return Se uma estimativa possui uma mensagem de atencao,
	 * porem <b>ainda esta valida</b>
	 */
	public boolean possuiMensagemAtencao() {
		return temMensagemErro() && prazoEntrega != 0;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	private boolean temMensagemErro() {
		return StringUtils.isNotBlank(codigoErro) && !"0".equals(codigoErro);
	}
}
