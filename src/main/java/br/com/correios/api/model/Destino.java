package br.com.correios.api.model;

/**
 * 
 * @author Alexandre Gama
 *
 */
public class Destino {

	private LocalDoPacote local;
	
	public Destino(LocalDoPacote local) {
		this.local = local;
	}
	
	public Destino() {
	}

	public LocalDoPacote getLocal() {
		return local;
	}

	public void setLocal(LocalDoPacote local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Destino [local=" + local + "]";
	}
	
}
