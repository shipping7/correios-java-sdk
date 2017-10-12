package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;

import com.google.common.base.Preconditions;

public class PesoDoObjetoPlp {
	
	private static final BigDecimal MIL = BigDecimal.valueOf(1000);
	private BigDecimal pesoEmGramas;

	// Construtor estático para forçar a construção pelo factory method
	private PesoDoObjetoPlp(BigDecimal pesoEmGramas) {
		this.pesoEmGramas = pesoEmGramas;
	}

	public static PesoDoObjetoPlp emGramas(BigDecimal pesoEmGramas) {
		Preconditions.checkArgument(pesoEmGramas != null, "Peso deve ter um valor valido");
		return new PesoDoObjetoPlp(pesoEmGramas);
	}
	
	public static PesoDoObjetoPlp emKilos(BigDecimal pesoEmKilos) {
		Preconditions.checkArgument(pesoEmKilos != null, "Peso deve ter um valor valido");
		return new PesoDoObjetoPlp(pesoEmKilos.multiply(MIL));
	}
	
	public BigDecimal emGramas() {
		return pesoEmGramas;
	}
	
	public BigDecimal emKilos() {
		return pesoEmGramas.divide(MIL);
	}

}
