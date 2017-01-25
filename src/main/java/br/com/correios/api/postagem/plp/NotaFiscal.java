package br.com.correios.api.postagem.plp;

public class NotaFiscal {

	/**
     * Número da nota fiscal. Se torna obrigatório se o serviço for Encomenda PAC – 41068
     *
     * Preenchimento Obrigatório para encomenda PAC.
     */
    private String numeroNotaFiscal;

    /**
     * Série da nota fiscal. Se torna obrigatório se o serviço for Encomenda PAC – 41068
     *
     * Preenchimento Obrigatório para encomenda PAC.
     */
    private String serieNotaFiscal;

    /**
     * Valor da nota fiscal
     *
     * Preenchimento não obrigatório.
     */
    private String valorNotaFiscal;

    /**
     * Natureza da nota fiscal
     *
     * Deverá ser enviada sem preenchimento nenhum.
     */
    private String naturezaNotaFiscal;

	public NotaFiscal(String numeroNotaFiscal, String serieNotaFiscal, String valorNotaFiscal,
			String naturezaNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.serieNotaFiscal = serieNotaFiscal;
		this.valorNotaFiscal = valorNotaFiscal;
		this.naturezaNotaFiscal = naturezaNotaFiscal;
	}

	public String getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public String getSerieNotaFiscal() {
		return serieNotaFiscal;
	}

	public String getValorNotaFiscal() {
		return valorNotaFiscal;
	}

	public String getNaturezaNotaFiscal() {
		return naturezaNotaFiscal;
	}

}
