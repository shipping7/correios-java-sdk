package br.com.correios.api;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Alexandre Gama
 *
 */
public class Evento {

	private String tipo;

	private String status;

	private Calendar data;

	private String hora;

	private String descricao;

	private String codigo;

	private LocalDoPacote local;

	private List<Destino> destinos = new ArrayList<>();
	
	public Evento(String tipo, String status, Calendar data, String hora, String descricao, String codigo,
			LocalDoPacote local) {
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
		return "Evento [tipo=" + tipo + ", status=" + status + ", descricao="
				+ descricao + ", codigo=" + codigo + ", local=" + local + ", destino=" + destinos + "]";
	}
}
