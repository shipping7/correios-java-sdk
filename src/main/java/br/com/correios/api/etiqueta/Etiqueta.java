package br.com.correios.api.etiqueta;

import static com.google.common.base.MoreObjects.toStringHelper;
import static java.lang.Integer.valueOf;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.api.postagem.exception.CorreiosEtiquetaDadosInvalidosException;

/**
 * Classe que representa uma Etiqueta dos Correios. Você poderá usar as seguintes características de uma Etiqueta
 * - Prefixo
 * - Sufixo
 * - Numero da Etiqueta
 * - Etiqueta Completa, já com o seu dígito verificador
 */
public class Etiqueta {

	/**
	 * Prefixo usado na Etiqueta
	 * Por exemplo, podemos ter a seguinte Etiqueta retornada pelos Correios: DW83589539 BR
	 * O seu prefixo será DW
	 */
	private String prefixo;

	/**
	 * Sufixo usado na Etiqueta
	 * Por exemplo, podemos ter a seguinte Etiqueta retornada pelos Correios: DW83589539 BR
	 * O seu sufixo será BR
	 */
	private String sufixo;

	/**
	 * Número da Etiqueta, sem afixos e dígito verificador
	 * Por exemplo, podemos ter a seguinte Etiqueta retornada pelos Correios: DW83589539 BR
	 * O seu número será 83589539
	 */
	private Long numeroDaEtiqueta;

	/**
	 * Etiqueta completa, já com o dígito verificador e afixos.
	 * Por exemplo, podemos ter a seguinte Etiqueta retornada pelos Correios: DW83589539 BR
	 * A etiqueta completa será DW835895394BR
	 */
	private String etiquetaCompleta;

	public Etiqueta(String prefixo, String sufixo, Long numeroDaEtiqueta) {
		this.prefixo = prefixo;
		this.sufixo = sufixo;
		this.numeroDaEtiqueta = numeroDaEtiqueta;

		String espacoObrigatorio = " ";
		this.etiquetaCompleta = prefixo + numeroDaEtiqueta + espacoObrigatorio + sufixo;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public String getSufixo() {
		return sufixo;
	}

	public Long getNumeroDaEtiqueta() {
		return numeroDaEtiqueta;
	}

	public String getNumeroDaEtiquetaSemDigitoVerificador() {
		return etiquetaCompleta.replace(" ", StringUtils.EMPTY);
	}

	/**
	 * Note que este método substitui a chamada aos correios para criar o dígito verificador
	 */
	public String getNumeroDaEtiquetaComDigitoVerificador() {
		String numeroEmTexto = numeroDaEtiqueta.toString();

		if (etiquetaCompleta.length() < 12) {
			throw new CorreiosEtiquetaDadosInvalidosException("O tamanho da etiqueta não deve ser menor que 12");
		}

		if (numeroEmTexto.length() < 8 && etiquetaCompleta.length() == 12) {
			numeroEmTexto = adicionaZerosAEsquerdaDo(numeroEmTexto);
		} else {
			numeroEmTexto = numeroEmTexto.substring(0, 8);
		}

		String digitoVerificador = calculaDigitoParaO(numeroEmTexto);

		String numeroComDigito = numeroEmTexto += digitoVerificador;
		String etiquetaCompletaComDigito = prefixo + numeroComDigito + sufixo;

		return etiquetaCompletaComDigito;
	}

	private static String calculaDigitoParaO(String numeroDaEtiqueta) {
		int[] multiplicadoresObrigatoriosDosCorreios = { 8, 6, 4, 2, 3, 5, 9, 7 };
		int soma = 0;
		for (int i = 0; i < 8; i++) {
			String numero = numeroDaEtiqueta.substring(i, (i + 1));
			int multiplicador = multiplicadoresObrigatoriosDosCorreios[i];

			soma += valueOf(numero) * multiplicador;
		}

		int resto = soma % 11;

		if (resto == 0) {
			return "5";
		} else if (resto == 1) {
			return "0";
		} else {
			return valueOf(11 - resto).toString();
		}
	}

	private static String adicionaZerosAEsquerdaDo(String numero) {
		String zerosAEsquerda = "";
		int quantidadeDeZeros = 8 - numero.length();

		for (int i = 0; i < quantidadeDeZeros; i++) {
			zerosAEsquerda += "0";
		}
		String numeroComZerosAEsquerda = zerosAEsquerda + numero;

		return numeroComZerosAEsquerda;
	}

	@Override
	public String toString() {
		return toStringHelper(this)
			.add("prefixo" , prefixo)
			.add("sufixo" , sufixo)
			.add("numeroDaEtiqueta" , numeroDaEtiqueta)
			.add("etiquetaCompleta" , etiquetaCompleta)
			.toString();
	}



}
