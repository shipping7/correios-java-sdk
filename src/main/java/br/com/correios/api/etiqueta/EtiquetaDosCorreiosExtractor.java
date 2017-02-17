package br.com.correios.api.etiqueta;

import java.util.List;

public class EtiquetaDosCorreiosExtractor {

	private static final String CARACTERES_DIFERENTES_DE_NUMEROS = "[^0-9]";

	public EtiquetaExtraida extraiInformacoesDas(List<String> etiquetasSemFormatacaoDosCorreios) {
		Long primeiraEtiqueta = removeLetrasRetornandoValorNumerico(etiquetasSemFormatacaoDosCorreios.get(0));
		Long ultimaEtiqueta = removeLetrasRetornandoValorNumerico(etiquetasSemFormatacaoDosCorreios.get(1));
		Long quantidadeDeEtiquetasSolicitadas = ultimaEtiqueta - primeiraEtiqueta + 1;

		String prefixo = etiquetasSemFormatacaoDosCorreios.get(0).substring(0, 2);
		String sufixo = etiquetasSemFormatacaoDosCorreios.get(0).substring(10).trim();

		return new EtiquetaExtraida(primeiraEtiqueta, ultimaEtiqueta, quantidadeDeEtiquetasSolicitadas, prefixo, sufixo);
	}

	private Long removeLetrasRetornandoValorNumerico(String etiqueta) {
		return Long.valueOf(etiqueta.replaceAll(CARACTERES_DIFERENTES_DE_NUMEROS, ""));
	}

}
