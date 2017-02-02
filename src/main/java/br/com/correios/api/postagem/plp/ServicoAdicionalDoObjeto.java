package br.com.correios.api.postagem.plp;

import java.util.List;

public class ServicoAdicionalDoObjeto {

	/**
	 * Código do serviço adicional
	 *
	 * Preenchimento Obrigatório. O serviço adicional "025", referente ao registro, deve sempre ser informado.
	 * Casos os serviços postados pelo cliente possuam outros serviços adicionais, estes devem também ser informados conforme Anexo 06.
	 *
	 * Tipo: Caractere (3)
	 */
    private final List<String> codigosDosServicosAdicionais;

    /**
     * Valor do seguro adicional declarado pelo cliente.
     *
     * Se o código do serviço adicional for igual a “019” o campo é obrigatório
     *
     * Tipo: Numérico (9,2)
     */
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
