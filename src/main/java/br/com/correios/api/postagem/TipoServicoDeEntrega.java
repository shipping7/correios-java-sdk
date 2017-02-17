package br.com.correios.api.postagem;

/**
 * Id do serviço de entrega que porderá ser obtido no método buscaCliente() dos correios.
 *
 * Esse serviço poderá ser:
 * - SEDEX - CONTRATO
 * - PAC
 * - E-SEDEX STANDARD
 * - PAC GRANDES FORMATOS
 * - PAC EXTRA
 */
public enum TipoServicoDeEntrega {

	SEDEX_SEM_CONTRATO("40010", "Sedex"),
	SEDEX_COM_CONTRATO("40096", "Sedex"),
	ESEDEX_COM_CONTRATO("81019", "Esedex"),
	PAC_SEM_CONTRATO("41106", "Pac"),
	PAC_COM_CONTRATO("41068", "Pac"),;

	private String codigoDoContrato;

	private String categoriaDoServico;

	TipoServicoDeEntrega(String codigoDoContrato, String categoriaDoServico) {
		this.codigoDoContrato = codigoDoContrato;
		this.categoriaDoServico = categoriaDoServico;
	}

	public String getCodigoDoContrato() {
		return codigoDoContrato;
	}

	public String getCategoriaDoServico() {
		return categoriaDoServico;
	}

}
