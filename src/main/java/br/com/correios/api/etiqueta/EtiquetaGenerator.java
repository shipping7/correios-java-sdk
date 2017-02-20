package br.com.correios.api.etiqueta;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import br.com.correios.api.postagem.exception.CorreiosEtiquetaException;

public class EtiquetaGenerator {

	private static final String SEPARADOR_DE_ETIQUETAS_DOS_CORREIOS = ",";

	public static List<Etiqueta> geraEtiquetasDo(String offsetDeEtiquetasRetornadoDosCorreios) {
		boolean offsetVazio = offsetDeEtiquetasRetornadoDosCorreios == null || offsetDeEtiquetasRetornadoDosCorreios.isEmpty();
		if (offsetVazio) {
			throw new CorreiosEtiquetaException("O Range de etiquetas retornado pelos Correios não pode ser nulo ou vazio");
		}

		List<String> listaComOffsetDeEtiquetas = asList(offsetDeEtiquetasRetornadoDosCorreios.split(SEPARADOR_DE_ETIQUETAS_DOS_CORREIOS));

		RangeDeEtiqueta rangeDeEtiquetas = RangeDeEtiqueta.extraiInformacoesDa(listaComOffsetDeEtiquetas);

		Long numeroDaEtiqueta = rangeDeEtiquetas.getNumeroDaPrimeiraEtiqueta();

		List<Etiqueta> etiquetas = new ArrayList<>();
		for (int posicaoNoRange = 0; posicaoNoRange < rangeDeEtiquetas.getQuantidadeDeEtiquetasSolicitadas(); posicaoNoRange++) {
			String etiquetaCompleta = rangeDeEtiquetas.adicionaAfixosPara(numeroDaEtiqueta);
			String semDigitoVerificador = rangeDeEtiquetas.removeDigitoVerificadorDa(etiquetaCompleta);
			String comDigitoVerificador = rangeDeEtiquetas.retornaEtiquetaComDigitoVerificadorPara(etiquetaCompleta);

			Etiqueta etiqueta = new Etiqueta(semDigitoVerificador, comDigitoVerificador);
			etiquetas.add(etiqueta);

			numeroDaEtiqueta++;
		}
		return etiquetas;
	}

}
