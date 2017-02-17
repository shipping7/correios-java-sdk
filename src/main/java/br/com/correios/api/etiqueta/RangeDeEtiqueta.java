package br.com.correios.api.etiqueta;

import static br.com.correios.api.etiqueta.CorreiosEtiquetasHelper.geraEtiquetaComDigitoVerificador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.correios.api.postagem.exception.CorreiosEtiquetaException;

public class RangeDeEtiqueta {

	private static final String SEPARADOR_DE_ETIQUETAS_DOS_CORREIOS = ",";

	private String offset;

	private EtiquetaDosCorreiosExtractor etiquetaExtractor;

	public RangeDeEtiqueta(String offsetDeEtiquetasDosCorreios) {
		this.offset = offsetDeEtiquetasDosCorreios;
		this.etiquetaExtractor = new EtiquetaDosCorreiosExtractor();
	}

	public List<Etiqueta> getEtiquetas() {
		if (offset == null || offset.isEmpty()) {
			throw new CorreiosEtiquetaException("O Range de etiquetas retornado pelos Correios não pode ser nulo ou vazio");
		}

		List<String> etiquetasSemFormatacaoDosCorreios = Arrays.asList(offset.split(SEPARADOR_DE_ETIQUETAS_DOS_CORREIOS));

		EtiquetaExtraida etiquetaExtraida = etiquetaExtractor.extraiInformacoesDas(etiquetasSemFormatacaoDosCorreios);

		Long numeroDaEtiqueta = etiquetaExtraida.getNumeroDaPrimeiraEtiqueta();

		List<Etiqueta> etiquetas = new ArrayList<>();
		for (int i = 0; i < etiquetaExtraida.getQuantidadeDeEtiquetasSolicitadas(); i++) {
			String etiquetaCompleta = etiquetaExtraida.adicionaAfixosPara(numeroDaEtiqueta);
			String semDigitoVerificador = etiquetaExtraida.removeDigitoVerificador(etiquetaCompleta);
			String comDigitoVerificador = geraEtiquetaComDigitoVerificador(etiquetaCompleta);

			Etiqueta etiquetaFormatada = new Etiqueta(semDigitoVerificador, comDigitoVerificador);
			etiquetas.add(etiquetaFormatada);

			numeroDaEtiqueta++;
		}
		return etiquetas;
	}

}
