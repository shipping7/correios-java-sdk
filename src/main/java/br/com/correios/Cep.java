package br.com.correios;

import java.util.regex.Pattern;

public class Cep {

	private final String value;

	public Cep(String value) {
		if (!Pattern.matches("\\d{8}", value)) {
			throw new IllegalArgumentException("O cep deve estar formatado somente com 8 numeros");
		}

		this.value = value;
	}

	public String value() {
		return value;
	}
}
