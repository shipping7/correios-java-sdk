package br.com.correios.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Alexandre Gama
 *
 */
public class PacoteTracker {

	private String versao;
	
	private Integer quantidade;
	
	private List<Evento> eventos = new ArrayList<>();

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Evento> getEventos() {
		return Collections.unmodifiableList(eventos);
	}

	public void adicionaEvento(Evento evento) {
		this.eventos.add(evento);
	}

	@Override
	public String toString() {
		return "PacoteTracker [versao=" + versao + ", quantidade=" + quantidade + ", eventos=" + eventos + "]";
	}

}
