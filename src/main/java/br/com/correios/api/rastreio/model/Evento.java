package br.com.correios.api.rastreio.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.google.common.base.Optional;

/**
 * Classe que contem os dados de um determinado evento ocorrido no objeto desejado
 */
public class Evento {

	/**
	 * Tipo do evento de retorno
	 */
	private String tipo;

	/**
	 * Status do evento de retorno
	 */
	private String status;

	/**
	 * Data do evento
	 */
	private Calendar data;

	/**
	 * Hora que ocorreu o evento
	 */
	private String hora;

	/**
	 * Descrição do evento ocorrido
	 */
	private String descricao;

	/**
	 * Detalhe do evento ocorrido
	 */
	private String detalhe;

	/**
	 * CEP da unidade ECT
	 */
	private String codigo;

	private LocalDoPacote local;

	private List<Destino> destinos = new ArrayList<>();

	public Evento(String tipo, String status, Calendar data, String hora, String descricao, String codigo, LocalDoPacote local) {
		this.tipo = tipo;
		this.status = status;
		this.data = data;
		this.hora = hora;
		this.descricao = descricao;
		this.codigo = codigo;
		this.local = local;
	}

	public Evento() {
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDoPacote getLocal() {
		return local;
	}

	public void setLocal(LocalDoPacote local) {
		this.local = local;
	}

	public List<Destino> getDestinos() {
		return Collections.unmodifiableList(destinos);
	}

	public Optional<Destino> getPrimeiroDestino() {
		if (destinos.size() > 0) {
			return Optional.of(destinos.get(0));
		}
		return Optional.absent();
	}

	public Optional<Destino> getUltimoDestino() {
		if (destinos.size() > 0) {
			return Optional.of(destinos.get(destinos.size() - 1));
		}
		return Optional.absent();
	}

	public boolean isStatusFinal() {
		return CorreiosStatusFinal.isFinal(tipo, status);
	}

	public boolean isEntregaRealizada() {
		return CorreiosStatusDeEntrega.isEntregaRealizada(tipo, status);
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void adicionaDestino(Destino destinoDoPacote) {
		this.destinos.add(destinoDoPacote);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
