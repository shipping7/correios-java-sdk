package br.com.correios.api.rastreio.model;

enum CorreiosStatusFinal {
	BDE0, BDE1, BDE24,
	BDI0, BDI1, BDI24,
	BDR0, BDR1, BDR24,
	LDI1, LDI2, LDI3, LDI4, LDI14,
	;

	public static boolean isFinal(String tipo, String status) {
		String statusConcatenado = tipo + Integer.parseInt(status);

		for (CorreiosStatusFinal statusFinal : values()) {
			if (statusFinal.name().equals(statusConcatenado)) {
				return true;
			}
		}
		return false;
	}

}
