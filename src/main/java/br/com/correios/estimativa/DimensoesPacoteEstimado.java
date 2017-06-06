package br.com.correios.estimativa;

import java.math.BigDecimal;

import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado;

public class DimensoesPacoteEstimado {

	private TipoDoObjetoSendoEnviado tipoDoObjetoSendoEnviado;
	private BigDecimal peso;
	private BigDecimal comprimento;
	private BigDecimal altura;
	private BigDecimal largura;
	private BigDecimal diametro;

	// Construtor privado para obrigar o uso do builder
	private DimensoesPacoteEstimado() {
		this.diametro = BigDecimal.ZERO;
	}

	public static DimensoesPacoteEstimadoBuilder builder() {
		return new DimensoesPacoteEstimadoBuilder();
	}

	public static class DimensoesPacoteEstimadoBuilder {

		private DimensoesPacoteEstimado dimensoesPacoteEstimado;

		public DimensoesPacoteEstimadoBuilder() {
			this.dimensoesPacoteEstimado = new DimensoesPacoteEstimado();
		}

		public DimensoesPacoteEstimadoComTipoDeObjeto comTipoDeObjeto(TipoDoObjetoSendoEnviado tipoDoObjetoSendoEnviado) {
			dimensoesPacoteEstimado.tipoDoObjetoSendoEnviado = tipoDoObjetoSendoEnviado;
			return new DimensoesPacoteEstimadoComTipoDeObjeto();
		}

		public class DimensoesPacoteEstimadoComTipoDeObjeto {

			public DimensoesPacoteEstimadoComPeso comPeso(BigDecimal peso) {
				dimensoesPacoteEstimado.peso = peso;
				return new DimensoesPacoteEstimadoComPeso();
			}
		}

		public class DimensoesPacoteEstimadoComPeso {

			public DimensoesPacoteEstimadoComComprimento comComprimento(BigDecimal comprimento) {
				dimensoesPacoteEstimado.comprimento = comprimento;
				return new DimensoesPacoteEstimadoComComprimento();
			}
		}

		public class DimensoesPacoteEstimadoComComprimento {

			public DimensoesPacoteEstimadoComAltura comAltura(BigDecimal altura) {
				dimensoesPacoteEstimado.altura = altura;
				return new DimensoesPacoteEstimadoComAltura();
			}
		}

		public class DimensoesPacoteEstimadoComAltura {

			public DimensoesPacoteEstimadoComLargura comLargura(BigDecimal largura) {
				dimensoesPacoteEstimado.largura = largura;
				return new DimensoesPacoteEstimadoComLargura();
			}
		}

		public class DimensoesPacoteEstimadoComLargura {

			public DimensoesPacoteEstimado montaDimensoes() {
				return dimensoesPacoteEstimado;
			}

			public DimensoesPacoteEstimadoComDiametro comDiametro(BigDecimal diametro) {
				dimensoesPacoteEstimado.diametro = diametro;
				return new DimensoesPacoteEstimadoComDiametro();
			}
		}

		public class DimensoesPacoteEstimadoComDiametro {

			public DimensoesPacoteEstimado montaDimensoes() {
				return dimensoesPacoteEstimado;
			}
		}
	}

	public TipoDoObjetoSendoEnviado getTipoDoObjetoSendoEnviado() {
		return tipoDoObjetoSendoEnviado;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public BigDecimal getComprimento() {
		return comprimento;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public BigDecimal getLargura() {
		return largura;
	}

	public BigDecimal getDiametro() {
		return diametro;
	}

}
