package br.com.correios.api.rastreio.model;

enum CorreiosStatusDeEntrega {

	BDE0, BDE1,
	BDI0, BDI1,
	BDR0, BDR1,
	;

	public static boolean isEntregaRealizada(String tipo, String status) {
		String statusConcatenado = tipo + Integer.parseInt(status);

		for (CorreiosStatusDeEntrega statusEntregue : values()) {
			if (statusEntregue.name().equals(statusConcatenado)) {
				return true;
			}
		}
		return false;
	}
}
