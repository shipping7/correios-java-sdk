package br.com.correios.api.postagem.dimensao;

import br.com.correios.api.postagem.xml.DimensaoObjeto;

public class DimensaoDoObjetoToDimensoesDoObjetoConverter {

	public DimensoesDoObjeto convert(DimensaoObjeto dimensaoObjeto) {
		DimensoesDoObjeto dimensoes = new DimensoesDoObjeto(String.valueOf(dimensaoObjeto.getTipoObjeto()), dimensaoObjeto.getDimensaoAltura(),
				dimensaoObjeto.getDimensaoLargura(), dimensaoObjeto.getDimensaoComprimento(),
				dimensaoObjeto.getDimensaoDiametro());

		return dimensoes;
	}

}
