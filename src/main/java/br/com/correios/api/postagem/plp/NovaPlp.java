package br.com.correios.api.postagem.plp;

import java.util.Set;

public class NovaPlp {

	private final RemetentePlp remetente;
	private final Set<ObjetoPlp> objetosPlp;

	public NovaPlp(RemetentePlp remetente, Set<ObjetoPlp> objetosPlp) {
		this.remetente = remetente;
		this.objetosPlp = objetosPlp;
	}

	public RemetentePlp getRemetente() {
		return remetente;
	}

	public Set<ObjetoPlp> getObjetosPlp() {
		return objetosPlp;
	}

}
