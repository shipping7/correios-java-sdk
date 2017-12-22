package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;

public class ObjetoPlp {

	private final DimensoesDoObjetoPlp dimensoesDoObjeto;
	private final PesoDoObjetoPlp pesoDoObjeto;
	private final String codigoDeServico;
	private final String numeroDaEtiqueta;
	private final DestinatarioDoObjetoPlp destinatarioDoObjeto;
	private final Set<String> codigoServicosAdicionais;
	private final BigDecimal valorAdicionalDoSeguro;

	ObjetoPlp(DimensoesDoObjetoPlp dimensoesDoObjeto, PesoDoObjetoPlp pesoDoObjeto, String codigoDeServico,
			String numeroDaEtiqueta, DestinatarioDoObjetoPlp destinatarioDoObjeto, Set<String> codigoServicosAdicionais,
			BigDecimal valorAdicionalDoSeguro) {
		this.dimensoesDoObjeto = dimensoesDoObjeto;
		this.pesoDoObjeto = pesoDoObjeto;
		this.codigoDeServico = codigoDeServico;
		this.numeroDaEtiqueta = numeroDaEtiqueta;
		this.destinatarioDoObjeto = destinatarioDoObjeto;
		this.codigoServicosAdicionais = codigoServicosAdicionais;
		this.valorAdicionalDoSeguro = valorAdicionalDoSeguro;
	}

	public DimensoesDoObjetoPlp getDimensoesDoObjeto() {
		return dimensoesDoObjeto;
	}

	public PesoDoObjetoPlp getPesoDoObjeto() {
		return pesoDoObjeto;
	}

	public String getCodigoDeServico() {
		return codigoDeServico;
	}

	public String getNumeroDaEtiqueta() {
		return numeroDaEtiqueta;
	}

	public String getNumeroDaEtiquetaSemDigitoVerificador() {
		return numeroDaEtiqueta.substring(0, 10) + numeroDaEtiqueta.substring(11);
	}

	public DestinatarioDoObjetoPlp getDestinatarioDoObjeto() {
		return destinatarioDoObjeto;
	}

	public Set<String> getCodigoServicosAdicionais() {
		return codigoServicosAdicionais;
	}

	public Optional<BigDecimal> getValorDeclaradoParaEncomenda() {
		return Optional.ofNullable(valorAdicionalDoSeguro);
	}

}
