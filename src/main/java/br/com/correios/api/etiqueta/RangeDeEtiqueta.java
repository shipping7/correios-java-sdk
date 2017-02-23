package br.com.correios.api.etiqueta;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class RangeDeEtiqueta {

	private static final String CARACTERES_DIFERENTES_DE_NUMEROS = "[^0-9]";
	private Long numeroDaPrimeiraEtiqueta;
	private Long numeroDaUltimaEtiqueta;
	private String prefixo;
	private String sufixo;

	private RangeDeEtiqueta(Long primeiraEtiqueta, Long ultimaEtiqueta,
			String prefixo, String sufixo) {
				this.numeroDaPrimeiraEtiqueta = primeiraEtiqueta;
				this.numeroDaUltimaEtiqueta = ultimaEtiqueta;
				this.prefixo = prefixo;
				this.sufixo = sufixo;
	}

	public static RangeDeEtiqueta extraiInformacoesDa(List<String> listaComOffsetDeEtiquetas) {
		Long primeiraEtiqueta = removeLetrasRetornandoValorNumerico(listaComOffsetDeEtiquetas.get(0));
		Long ultimaEtiqueta = removeLetrasRetornandoValorNumerico(listaComOffsetDeEtiquetas.get(1));

		String prefixo = listaComOffsetDeEtiquetas.get(0).substring(0, 2);
		String sufixo = listaComOffsetDeEtiquetas.get(0).substring(10).trim();

		return new RangeDeEtiqueta(primeiraEtiqueta, ultimaEtiqueta, prefixo, sufixo);
	}

	private static Long removeLetrasRetornandoValorNumerico(String etiqueta) {
		return Long.valueOf(etiqueta.replaceAll(CARACTERES_DIFERENTES_DE_NUMEROS, ""));
	}

	public Long getNumeroDaPrimeiraEtiqueta() {
		return numeroDaPrimeiraEtiqueta;
	}

	public Long getNumeroDaUltimaEtiqueta() {
		return numeroDaUltimaEtiqueta;
	}

	public Long getQuantidadeDeEtiquetasSolicitadas() {
		return numeroDaUltimaEtiqueta - numeroDaPrimeiraEtiqueta + 1;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public String getSufixo() {
		return sufixo;
	}

	public String removeDigitoVerificadorDa(String etiquetaCompleta) {
		return etiquetaCompleta.replace(" ", StringUtils.EMPTY);
	}

}
