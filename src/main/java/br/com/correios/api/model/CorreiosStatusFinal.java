package br.com.correios.api.model;

enum CorreiosStatusFinal {
	BDE0,
	BDE01,
	BDI0,
	BDI01,
	BDR0,
	BDR01
	;

	public static boolean isFinal(String tipo, String status) {
		String statusConcatenado = tipo + status;

		for (CorreiosStatusFinal statusFinal : values()) {
			if (statusFinal.name().equals(statusConcatenado)) {
				return true;
			}
		}
		return false;
	}

}
