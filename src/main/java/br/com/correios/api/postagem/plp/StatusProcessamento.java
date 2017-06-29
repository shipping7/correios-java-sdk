package br.com.correios.api.postagem.plp;

public enum StatusProcessamento {

	/**
	 * Status que mostra que o objeto ainda nao foi postado
	 */
	NAO_POSTADO(0),

	/**
	 * Status de verificacao efetuada e objeto ja postado
	 */
	POSTADO(1),

	/**
	 * Status de objeto cancelado
	 */
	CANCELADO(2),
	;

	private final int codigoInterno;

	private StatusProcessamento(int codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	/**
	 * Constroi um status de processamento a partir do codigo interno
	 * de status de processamento relacionado no Correios
	 * @param codigoInterno
	 * @return Status de Processamento
	 */
	public static StatusProcessamento aPartirDo(int codigoInterno) {
		for (StatusProcessamento statusProcessamento : StatusProcessamento.values()) {
			if (statusProcessamento.codigoInterno == codigoInterno) {
				return statusProcessamento;
			}
		}
		throw new IllegalStateException("O argumento nao esta relacionado a nenhuma opcao desse objeto");
	}
}
