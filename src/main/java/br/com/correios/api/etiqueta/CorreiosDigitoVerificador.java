package br.com.correios.api.etiqueta;

import br.com.correios.api.postagem.exception.CorreiosEtiquetaDadosInvalidosException;

public class CorreiosDigitoVerificador {

	public static String adicionaDigitoPara(String etiquetaCompleta) {
		String prefixo = etiquetaCompleta.substring(0, 2);
		String numero = etiquetaCompleta.substring(2, 10);
		String sufixo = etiquetaCompleta.substring(10).trim();
		String retorno = numero;

		if (etiquetaCompleta.length() < 12) {
			throw new CorreiosEtiquetaDadosInvalidosException("O tamanho da etiqueta não deve ser menor que 12");
		}

		if (numero.length() < 8 && etiquetaCompleta.length() == 12) {
			retorno = adicionaZerosAEsquerdaDo(numero);
		} else {
			retorno = numero.substring(0, 8);
		}

		int resto = calculaRestoDaDivisao(retorno);

		String digito;
		if (resto == 0) {
			digito = "5";
		} else if (resto == 1) {
			digito = "0";
		} else {
			digito = Integer.valueOf(11 - resto).toString();
		}

		retorno += digito;
		retorno = prefixo + retorno + sufixo;

		return retorno;
	}

	private static int calculaRestoDaDivisao(String retorno) {
		int[] multiplicadores = { 8, 6, 4, 2, 3, 5, 9, 7 };
		int soma = 0;
		for (int i = 0; i < 8; i++) {
			soma += Integer.valueOf(retorno.substring(i, (i + 1))) * multiplicadores[i];
		}

		int resto = soma % 11;
		return resto;
	}

	private static String adicionaZerosAEsquerdaDo(String numero) {
		String retorno;
		String zeros = "";
		int quantidadeDeZeros = 8 - numero.length();

		for (int i = 0; i < quantidadeDeZeros; i++) {
			zeros += "0";
		}
		retorno = zeros + numero;
		return retorno;
	}

}
