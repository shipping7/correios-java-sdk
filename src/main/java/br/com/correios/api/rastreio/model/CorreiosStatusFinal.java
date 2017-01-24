package br.com.correios.api.rastreio.model;

enum CorreiosStatusFinal {
	BDE0, BDE1, BDE9, BDE28, BDE37, BDE43, BDE50, BDE51, BDE52,
	BDI0, BDI1, BDI9, BDI28, BDI37, BDI43, BDI50, BDI51, BDI52,
	BDR0, BDR1, BDR9, BDR28, BDR37, BDR43, BDR50, BDR51, BDR52,
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
