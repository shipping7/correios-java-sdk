package br.com.correios.api.postagem.plp;

import br.com.correios.api.postagem.xml.DadosPlp;

public class PlpDosCorreiosToPlpConverter {

	public InformacoesPlp convert(DadosPlp plpDosCorreios) {
		InformacoesPlp informacoesEspecificasDaPlp = new InformacoesPlp(plpDosCorreios.getIdPlp(), plpDosCorreios.getValorGlobal(),
				plpDosCorreios.getMcuUnidadePostagem(), plpDosCorreios.getNomeUnidadePostagem(),
				plpDosCorreios.getCartaoPostagem());

		return informacoesEspecificasDaPlp;
	}

}
