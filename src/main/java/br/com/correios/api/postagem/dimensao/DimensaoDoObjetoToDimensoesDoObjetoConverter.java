package br.com.correios.api.postagem.dimensao;

import static java.lang.String.valueOf;

import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado;
import br.com.correios.api.postagem.xml.DimensaoObjeto;

public class DimensaoDoObjetoToDimensoesDoObjetoConverter {

	public DimensoesDoObjeto convert(DimensaoObjeto dimensaoObjeto) {
		TipoDoObjetoSendoEnviado tipo = TipoDoObjetoSendoEnviado.getTipoDoObjetoAPartirDoCodigo(valueOf(dimensaoObjeto.getTipoObjeto()));

		DimensoesDoObjeto dimensoes = new DimensoesDoObjeto(tipo, dimensaoObjeto.getDimensaoAltura(),
				dimensaoObjeto.getDimensaoLargura(), dimensaoObjeto.getDimensaoComprimento(),
				dimensaoObjeto.getDimensaoDiametro());

		return dimensoes;
	}

}
