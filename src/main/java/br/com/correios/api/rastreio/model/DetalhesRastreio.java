package br.com.correios.api.rastreio.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que contem todas as informacoes de um Objeto Rastreado, inclusive os eventos associados ao Objeto em questao
 *
 * @since 0.0.1-BETA
 */
public class DetalhesRastreio {

	/**
	 * Versão do SRO XML
	 */
	private String versao;

	/**
	 * Quantidade de objetos consultados
	 */
	private Integer quantidade;

	/**
	 * Lista de objetos rastreados
	 */
	private List<ObjetoRastreio> objetosRastreio = new ArrayList<>();

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

	public void adicionaObjetoRastreio(ObjetoRastreio objetoRastreio) {
		this.objetosRastreio.add(objetoRastreio);
	}

	public List<ObjetoRastreio> getObjetosRastreio() {
		return objetosRastreio;
	}

	@Override
	public String toString() {
		return "DetalhesRastreio [versao=" + versao + ", quantidade=" + quantidade + ", objetosRastreio=" + objetosRastreio + "]";
	}

}
