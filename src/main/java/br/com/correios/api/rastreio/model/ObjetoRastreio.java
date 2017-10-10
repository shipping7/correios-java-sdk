package br.com.correios.api.rastreio.model;

import static org.apache.commons.lang3.StringUtils.defaultIfBlank;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.common.base.Optional;

public class ObjetoRastreio {

	/**
	 * Número do objeto
	 */
	private String numero;

	/**
	 * Sigla do objeto solicitado
	 */
	private String sigla;

	/**
	 * Nome do objeto solicitado
	 */
	private String nome;

	/**
	 * Categoria do objeto solicitado
	 */
	private String categoria;

	/**
	 * Descricao do erro, caso exista algum problema
	 */
	private String descricaoErro;

	/**
	 * Lista dos eventos que ocorreram com o objeto desejado
	 */
	private List<Evento> eventos = new ArrayList<>();

	public List<Evento> getEventos() {
		return Collections.unmodifiableList(eventos);
	}

	public void adicionaEvento(Evento evento) {
		this.eventos.add(evento);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Optional<String> getDescricaoErro() {
		return Optional.fromNullable(defaultIfBlank(descricaoErro, null));
	}

	public void setDescricaoErro(String descricaoErro) {
		this.descricaoErro = descricaoErro;
	}

	public int getQuantidadeDeEventosOcorridos() {
		return eventos.size() > 0 ? eventos.size(): 0;
	}

	public Optional<Evento> getPrimeiroEvento() {
		if (eventos.size() > 0) {
			return Optional.of(eventos.get(0));
		}
		return Optional.absent();
	}

	public Optional<Evento> getUltimoEvento() {
		if (eventos.size() > 0) {
			return Optional.of(eventos.get(eventos.size() - 1));
		}
		return Optional.absent();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, SHORT_PREFIX_STYLE);
	}

}
