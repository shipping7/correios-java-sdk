package br.com.correios.api.postagem.plp;

import java.util.List;

public class ServicoAdicionalDoObjeto {

    private final List<String> codigosDosServicosAdicionais;

    private final String valorDeclarado;

	public ServicoAdicionalDoObjeto(List<String> codigosDosServicosAdicionais, String valorDeclarado) {
		this.codigosDosServicosAdicionais = codigosDosServicosAdicionais;
		this.valorDeclarado = valorDeclarado;
	}

	public List<String> getCodigosDosServicosAdicionais() {
		return codigosDosServicosAdicionais;
	}

	public String getValorDeclarado() {
		return valorDeclarado;
	}

}
