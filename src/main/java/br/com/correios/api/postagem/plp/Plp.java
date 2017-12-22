package br.com.correios.api.postagem.plp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Plp {

	private final Long plpId;

	public Plp(Long plpId) {
		this.plpId = plpId;
	}

	public Long getPlpId() {
		return plpId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
	}

}
