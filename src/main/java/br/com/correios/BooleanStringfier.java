package br.com.correios;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

public class BooleanStringfier {

	private TipoBooleanStringfier booleanToStringType;

	public BooleanStringfier(TipoBooleanStringfier booleanToStringType) {
		this.booleanToStringType = booleanToStringType;
	}

	public enum TipoBooleanStringfier {
		S_OU_N("S", "N");

		private final String trueString;
		private final String falseString;

		private TipoBooleanStringfier(String trueString, String falseString) {
			this.trueString = trueString;
			this.falseString = falseString;
		}

		private boolean convertToBoolean(String text) {
			return BooleanUtils.toBoolean(text, trueString, falseString);
		}

		private String convertToString(boolean flag) {
			return BooleanUtils.toString(flag, trueString, falseString);
		}
	}

	public String convertToString(boolean flag) {
		return booleanToStringType.convertToString(flag);
	}

	public boolean convertToBoolean(String text) {
		return booleanToStringType.convertToBoolean(StringUtils.defaultIfBlank(text, booleanToStringType.falseString));
	}
}
