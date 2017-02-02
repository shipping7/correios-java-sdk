package br.com.correios.api.postagem.plp;

public class ObservacoesDoCliente {

	private String primeiraObservacao;

	private String segundaObservacao;

	public ObservacoesDoCliente(String primeiraObservacao, String segundaObservacao) {
		this.primeiraObservacao = primeiraObservacao;
		this.segundaObservacao = segundaObservacao;
	}

	public String getPrimeiraObservacao() {
		return primeiraObservacao;
	}

	public String getSegundaObservacao() {
		return segundaObservacao;
	}

}
