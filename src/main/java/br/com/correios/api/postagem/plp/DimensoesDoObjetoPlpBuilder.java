package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;

import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto;
import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado;
import br.com.correios.api.postagem.plp.EnderecoBuilder.EnderecoComUfBuilder;

public class DimensoesDoObjetoPlpBuilder {
	
	private BigDecimal altura;
	private BigDecimal comprimento;
	private BigDecimal largura;
	private BigDecimal diametro;
	private TipoDoObjetoSendoEnviado tipoDoObjetoSendoEnviado;
	
	public DimensoesDoObjetoPlpDoTipoPacoteOuCaixaBuilder doTipoPacoteOuCaixa() {
		this.tipoDoObjetoSendoEnviado = TipoDoObjetoSendoEnviado.PACOTE_OU_CAIXA;
		return new DimensoesDoObjetoPlpDoTipoPacoteOuCaixaBuilder(this);
	}
	
	public DimensoesDoObjetoPlpDoTipoRoloOuCilindroBuilder doTipoRoloOuCilindro() {
		this.tipoDoObjetoSendoEnviado = TipoDoObjetoSendoEnviado.ROLO_OU_CILINDRO;
		return new DimensoesDoObjetoPlpDoTipoRoloOuCilindroBuilder(this);
	}
	
	public DimensoesDoObjetoPlpDoTipoEnvelopeBuilder doTipoEnvelope() {
		this.tipoDoObjetoSendoEnviado = TipoDoObjetoSendoEnviado.ENVELOPE;
		return new DimensoesDoObjetoPlpDoTipoEnvelopeBuilder(this);
	}
	
	public class DimensoesDoObjetoPlpDoTipoPacoteOuCaixaBuilder {

		private DimensoesDoObjetoPlpBuilder builder;

		private DimensoesDoObjetoPlpDoTipoPacoteOuCaixaBuilder(DimensoesDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComAlturaBuilder comAltura(BigDecimal alturaDaCaixa) {
			builder.altura = alturaDaCaixa;
			return new DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComAlturaBuilder(builder);
		}
	}
	
	public class DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComAlturaBuilder {

		private DimensoesDoObjetoPlpBuilder builder;

		private DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComAlturaBuilder(DimensoesDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComComprimentoBuilder comComprimento(BigDecimal comprimentoDaCaixa) {
			builder.comprimento = comprimentoDaCaixa;
			return new DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComComprimentoBuilder(builder);
		}
	}
	
	public class DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComComprimentoBuilder {

		private DimensoesDoObjetoPlpBuilder builder;

		private DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComComprimentoBuilder(DimensoesDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComLarguraBuilder comLargura(BigDecimal larguraDaCaixa) {
			builder.largura = larguraDaCaixa;
			return new DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComLarguraBuilder(builder);
		}
	}
	
	public class DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComLarguraBuilder {

		private DimensoesDoObjetoPlpBuilder builder;

		private DimensoesDoObjetoPlpDoTipoPacoteOuCaixaComLarguraBuilder(DimensoesDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DimensoesDoObjetoPlp build() {
			return new DimensoesDoObjetoPlp(builder.tipoDoObjetoSendoEnviado, builder.altura, builder.comprimento, builder.largura, builder.diametro);
		}
	}
	
	public class DimensoesDoObjetoPlpDoTipoRoloOuCilindroBuilder {

		private DimensoesDoObjetoPlpBuilder builder;

		private DimensoesDoObjetoPlpDoTipoRoloOuCilindroBuilder(DimensoesDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DimensoesDoObjetoPlpDoTipoRoloOuCilindroComComprimentoBuilder comComprimento(BigDecimal comprimentoDoCilindro) {
			builder.comprimento = comprimentoDoCilindro;
			return new DimensoesDoObjetoPlpDoTipoRoloOuCilindroComComprimentoBuilder(builder);
		}
	}
	
	public class DimensoesDoObjetoPlpDoTipoRoloOuCilindroComComprimentoBuilder {

		private DimensoesDoObjetoPlpBuilder builder;

		private DimensoesDoObjetoPlpDoTipoRoloOuCilindroComComprimentoBuilder(DimensoesDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DimensoesDoObjetoPlpDoTipoRoloOuCilindroComDiametroBuilder comDiametro(BigDecimal diametroDoCilindro) {
			builder.diametro = diametroDoCilindro;
			return new DimensoesDoObjetoPlpDoTipoRoloOuCilindroComDiametroBuilder(builder);
		}
	}
	
	public class DimensoesDoObjetoPlpDoTipoRoloOuCilindroComDiametroBuilder {

		private DimensoesDoObjetoPlpBuilder builder;

		private DimensoesDoObjetoPlpDoTipoRoloOuCilindroComDiametroBuilder(DimensoesDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DimensoesDoObjetoPlp build() {
			return new DimensoesDoObjetoPlp(builder.tipoDoObjetoSendoEnviado, builder.altura, builder.comprimento, builder.largura, builder.diametro);
		}
	}

	public class DimensoesDoObjetoPlpDoTipoEnvelopeBuilder {

		private DimensoesDoObjetoPlpBuilder builder;

		private DimensoesDoObjetoPlpDoTipoEnvelopeBuilder(DimensoesDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DimensoesDoObjetoPlp build() {
			return new DimensoesDoObjetoPlp(builder.tipoDoObjetoSendoEnviado, builder.altura, builder.comprimento, builder.largura, builder.diametro);
		}
		
	}

}
