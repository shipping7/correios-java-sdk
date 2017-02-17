package br.com.correios.api.etiqueta;

import org.apache.commons.lang3.StringUtils;

public class EtiquetaExtraida {

	private Long numeroDaPrimeiraEtiqueta;
	private Long numeroDaUltimaEtiqueta;
	private Long quantidadeDeEtiquetasSolicitadas;
	private String prefixo;
	private String sufixo;

	public EtiquetaExtraida(Long primeiraEtiqueta, Long ultimaEtiqueta, Long quantidadeDeEtiquetasSolicitadas,
			String prefixo, String sufixo) {
				this.numeroDaPrimeiraEtiqueta = primeiraEtiqueta;
				this.numeroDaUltimaEtiqueta = ultimaEtiqueta;
				this.quantidadeDeEtiquetasSolicitadas = quantidadeDeEtiquetasSolicitadas;
				this.prefixo = prefixo;
				this.sufixo = sufixo;
	}

	public String adicionaAfixosPara(Long numeroDaEtiqueta) {
		return prefixo + numeroDaEtiqueta + " " + sufixo;
	}

	public Long getNumeroDaPrimeiraEtiqueta() {
		return numeroDaPrimeiraEtiqueta;
	}

	public Long getNumeroDaUltimaEtiqueta() {
		return numeroDaUltimaEtiqueta;
	}

	public Long getQuantidadeDeEtiquetasSolicitadas() {
		return quantidadeDeEtiquetasSolicitadas;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public String getSufixo() {
		return sufixo;
	}

	public String removeDigitoVerificador(String etiquetaCompleta) {
		return etiquetaCompleta.replace(" ", StringUtils.EMPTY);
	}

}
