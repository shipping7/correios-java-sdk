package br.com.correios.api.postagem.plp;

public class PlpDosCorreiosToPlpConverter {

	public Plp convert(br.com.correios.api.postagem.xml.Plp plpDosCorreios) {
		Plp plpConvertida = new Plp(plpDosCorreios.getIdPlp(), plpDosCorreios.getValorGlobal(), plpDosCorreios.getMcuUnidadePostagem(), plpDosCorreios.getNomeUnidadePostagem(), plpDosCorreios.getValorGlobal());

		return plpConvertida;
	}

}
