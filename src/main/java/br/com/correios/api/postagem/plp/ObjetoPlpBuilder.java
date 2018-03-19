package br.com.correios.api.postagem.plp;

import static com.google.common.collect.Sets.newHashSet;

import java.math.BigDecimal;
import java.util.Set;

public class ObjetoPlpBuilder {

	private final static String CODIGO_DE_SERVICO_ADICIONAL_SEGURO = "019";
	private final static String CODIGO_DE_SERVICO_REGISTRO_NACIONAL = "025";

	private DimensoesDoObjetoPlp dimensoesDoObjeto;
	private PesoDoObjetoPlp pesoDoObjeto;
	private String codigoDeServico;
	private String numeroDaEtiqueta;
	private DestinatarioDoObjetoPlp destinatarioDoObjeto;
	private Set<String> codigoServicosAdicionais = newHashSet(CODIGO_DE_SERVICO_REGISTRO_NACIONAL);
	private BigDecimal valorAdicionalDoSeguro;

	public ObjetoPlpComDimensoesDoObjetoBuilder comDimensoes(DimensoesDoObjetoPlp dimensoesDoObjeto) {
		this.dimensoesDoObjeto = dimensoesDoObjeto;
		return new ObjetoPlpComDimensoesDoObjetoBuilder(this);
	}

	public class ObjetoPlpComDimensoesDoObjetoBuilder {

		private ObjetoPlpBuilder builder;

		private ObjetoPlpComDimensoesDoObjetoBuilder(ObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public ObjetoPlpComPesoDoObjetoPlpBuilder comPeso(PesoDoObjetoPlp pesoDoObjeto) {
			builder.pesoDoObjeto = pesoDoObjeto;
			return new ObjetoPlpComPesoDoObjetoPlpBuilder(builder);
		}

	}

	public class ObjetoPlpComPesoDoObjetoPlpBuilder {

		private ObjetoPlpBuilder builder;

		private ObjetoPlpComPesoDoObjetoPlpBuilder(ObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public ObjetoPlpComCodigoDeServicoBuilder usandoCodigoDeServico(String codigoDeServico) {
			builder.codigoDeServico = codigoDeServico;
			return new ObjetoPlpComCodigoDeServicoBuilder(builder);
		}

	}

	public class ObjetoPlpComCodigoDeServicoBuilder {

		private ObjetoPlpBuilder builder;

		private ObjetoPlpComCodigoDeServicoBuilder(ObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public ObjetoPlpComNumeroDaEtiquetaBuilder comNumeroDaEtiqueta(String numeroDaEtiqueta) {
			builder.numeroDaEtiqueta = numeroDaEtiqueta;
			return new ObjetoPlpComNumeroDaEtiquetaBuilder(builder);
		}

	}

	public class ObjetoPlpComNumeroDaEtiquetaBuilder {

		private ObjetoPlpBuilder builder;

		private ObjetoPlpComNumeroDaEtiquetaBuilder(ObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public ObjetoPlpComDestinatarioBuilder paraDestinatario(DestinatarioDoObjetoPlp destinatarioDoObjetoPlp) {
			builder.destinatarioDoObjeto = destinatarioDoObjetoPlp;
			return new ObjetoPlpComDestinatarioBuilder(builder);
		}

	}

	public class ObjetoPlpComDestinatarioBuilder {

		private ObjetoPlpBuilder builder;

		private ObjetoPlpComDestinatarioBuilder(ObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public ObjetoPlpComDestinatarioBuilder adicionandoServicoAdicionalComCodigo(String codigoServicoAdicional) {
			builder.codigoServicosAdicionais.add(codigoServicoAdicional);
			return new ObjetoPlpComDestinatarioBuilder(builder);
		}

		public ObjetoPlpComDestinatarioBuilder comValorAdicionalDoSeguro(BigDecimal valorAdicionalDoSeguro) {
			builder.codigoServicosAdicionais.add(CODIGO_DE_SERVICO_ADICIONAL_SEGURO);
			builder.valorAdicionalDoSeguro = valorAdicionalDoSeguro;
			return new ObjetoPlpComDestinatarioBuilder(builder);
		}

		public ObjetoPlp build() {
			return new ObjetoPlp(builder.dimensoesDoObjeto, builder.pesoDoObjeto, builder.codigoDeServico,
					builder.numeroDaEtiqueta, builder.destinatarioDoObjeto, builder.codigoServicosAdicionais,
					builder.valorAdicionalDoSeguro);
		}

	}

}
