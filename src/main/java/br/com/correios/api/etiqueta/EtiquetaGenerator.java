package br.com.correios.api.etiqueta;

import static br.com.correios.api.etiqueta.RangeDeEtiqueta.extraiInformacoesDa;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import br.com.correios.api.postagem.exception.CorreiosEtiquetaException;

public class EtiquetaGenerator {

	private static final String SEPARADOR_DE_ETIQUETAS_DOS_CORREIOS = ",";

	public static List<Etiqueta> geraEtiquetasDo(String offsetDeEtiquetasRetornadoDosCorreios) {
		boolean offsetVazioOuNulo = offsetDeEtiquetasRetornadoDosCorreios == null || offsetDeEtiquetasRetornadoDosCorreios.isEmpty();
		if (offsetVazioOuNulo) {
			throw new CorreiosEtiquetaException("O Range de etiquetas retornado pelos Correios não pode ser nulo ou vazio");
		}

		List<String> listaComOffsetDeEtiquetas = transformaListaDeStringsNaListaDeEtiquetas(offsetDeEtiquetasRetornadoDosCorreios);

		RangeDeEtiqueta informacoesDaEtiqueta = extraiInformacoesDa(listaComOffsetDeEtiquetas);

		Long numeroDaEtiquetaSemTratamento = informacoesDaEtiqueta.getNumeroDaPrimeiraEtiqueta();

		List<Etiqueta> etiquetas = new ArrayList<>();

		for (int posicaoNoRange = 0; posicaoNoRange < informacoesDaEtiqueta.getQuantidadeDeEtiquetasSolicitadas(); posicaoNoRange++) {
			Etiqueta etiqueta = new Etiqueta(informacoesDaEtiqueta.getPrefixo(), informacoesDaEtiqueta.getSufixo(), numeroDaEtiquetaSemTratamento);

			etiquetas.add(etiqueta);

			numeroDaEtiquetaSemTratamento++;
		}
		return etiquetas;
	}

	private static List<String> transformaListaDeStringsNaListaDeEtiquetas(
			String offsetDeEtiquetasRetornadoDosCorreios) {
		String[] arrayComOffsetDeEtiquetas = offsetDeEtiquetasRetornadoDosCorreios.split(SEPARADOR_DE_ETIQUETAS_DOS_CORREIOS);

		return asList(arrayComOffsetDeEtiquetas);
	}

}
