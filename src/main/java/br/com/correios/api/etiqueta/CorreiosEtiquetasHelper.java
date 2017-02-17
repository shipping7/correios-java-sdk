package br.com.correios.api.etiqueta;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.api.postagem.exception.CorreiosEtiquetaDadosInvalidosException;

public class CorreiosEtiquetasHelper {

	private CorreiosEtiquetasHelper() {
	}

	public static String geraProximaEtiqueta(String etiqueta) {
		String prefixo = etiqueta.substring(0, 2);
		Long numero = new Long(etiqueta.substring(2, 10).trim()) + 1;
		String sufixo = etiqueta.substring(10).trim();
		return prefixo + StringUtils.leftPad(numero.toString(), 8, "0") + " " + sufixo;
	}

	public static String geraEtiquetaComDigitoVerificador(String numeroEtiqueta) {

		String prefixo = numeroEtiqueta.substring(0, 2);
		String numero = numeroEtiqueta.substring(2, 10);
		String sufixo = numeroEtiqueta.substring(10).trim();
		String retorno = numero;
		String dv;
		int[] multiplicadores = { 8, 6, 4, 2, 3, 5, 9, 7 };
		int soma = 0;

		if (numeroEtiqueta.length() < 12) {
			throw new CorreiosEtiquetaDadosInvalidosException("Correios ticket should has size equals to 12");

		} else if (numero.length() < 8 && numeroEtiqueta.length() == 12) {
			String zeros = "";
			int diferenca = 8 - numero.length();

			for (int i = 0; i < diferenca; i++) {
				zeros += "0";
			}
			retorno = zeros + numero;
		} else {
			retorno = numero.substring(0, 8);
		}

		for (int i = 0; i < 8; i++) {

			soma += Integer.valueOf(retorno.substring(i, (i + 1))) * multiplicadores[i];
		}

		int resto = soma % 11;

		if (resto == 0) {
			dv = "5";
		} else if (resto == 1) {
			dv = "0";
		} else {
			dv = Integer.valueOf(11 - resto).toString();
		}

		retorno += dv;
		retorno = prefixo + retorno + sufixo;

		return retorno;
	}
}
