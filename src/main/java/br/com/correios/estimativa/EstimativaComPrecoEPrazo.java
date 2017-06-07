package br.com.correios.estimativa;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Classe que representa uma estimativa calculada pelo servico do Correios
 * que possui o <b>preco e prazo</b> da encomenda
 *
 * @since 0.0.17-BETA
 */
public class EstimativaComPrecoEPrazo {

	/**
	 * Codigo do Servico de Entrega.
	 */
	private String codigoServico;

	/**
	 * Preco total da encomenda, em Reais, incluindo os precos dos servicos opcionais
	 */
	private String valor;

	/**
	 * Prazo estimado em dias para entrega do produto.
	 * Se o valor retornado for 0 (zero), indica que o prazo nao foi retornado corretamente.
	 * Mas nesso modelo use {@link #isEstimativaValida()} para validar se a estimativa esta valida
	 */
	private Integer prazoEntrega;

	/**
	 * Preco do servico adicional Mao Propria
	 */
	private String valorServicoMaoPropria;

	/**
	 * Preco do servico adicional Aviso de Recebimento
	 */
	private String valorServicoAvisoDeRecebimento;

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
	 * Preco da encomenda, sem adicionar os servicos adicionais como {@link #entregaDomiciliar} e {@link #entregaAosSabados}
	 */
	private String valorSemAdicionais;

	/**
	 * Codigo do Erro retornado pelo calculador
	 */
	private String codigoErro;

	/**
	 * Descricao do erro gerado.
	 */
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

	/**
	 * @return se uma estimativa esta valida, ou seja, nao possui nenhum erro
	 * retornado pelo calculador
	 */
	public boolean isEstimativaValida() {
		return StringUtils.isBlank(codigoErro) || "0".equals(codigoErro);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
