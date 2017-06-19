package br.com.correios.api.estimativa;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

import br.com.correios.Cep;
import br.com.correios.estimativa.DimensoesPacoteEstimado;
import br.com.correios.estimativa.EstimativaComPrecoEPrazo;

/**
 * Builder para construir a requisicao para estimativa de preco e prazo.
 *
 * @since 0.0.17-BETA
 */
public class RequisicaoEstimativaDePrecoEPrazoBuilder {

	private CorreiosServicoEstimativaAPI correiosServicoEstimativaAPI;
	private Set<String> codigosServico;
	private Cep cepOrigem;
	private Cep cepDestino;
	private DimensoesPacoteEstimado dimensoesPacoteEstimado;
	private BigDecimal valorDeclarado;
	private boolean adicionaServicoMaoPropria;
	private boolean adicionaServicoAvisoRecebimento;

	RequisicaoEstimativaDePrecoEPrazoBuilder(CorreiosServicoEstimativaAPI correiosServicoEstimativaAPI) {
		this.correiosServicoEstimativaAPI = correiosServicoEstimativaAPI;
		this.adicionaServicoMaoPropria = false;
		this.adicionaServicoAvisoRecebimento = false;
	}

	/**
	 * Informa o CEP de origem
	 */
	public RequisicaoEstimativaDePrecoEPrazoComCepOrigem de(Cep cepOrigem) {
		this.cepOrigem = cepOrigem;
		return new RequisicaoEstimativaDePrecoEPrazoComCepOrigem(this);
	}

	public class RequisicaoEstimativaDePrecoEPrazoComCepOrigem {

		private RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder;

		private RequisicaoEstimativaDePrecoEPrazoComCepOrigem(RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder) {
			this.requisicaoEstimativaDePrecoEPrazoBuilder = requisicaoEstimativaDePrecoEPrazoBuilder;
		}

		/**
		 * Informa o CEP de destino
		 */
		public RequisicaoEstimativaDePrecoEPrazoComCepDestino para(Cep cepDestino) {
			requisicaoEstimativaDePrecoEPrazoBuilder.cepDestino = cepDestino;
			return new RequisicaoEstimativaDePrecoEPrazoComCepDestino(requisicaoEstimativaDePrecoEPrazoBuilder);
		}
	}

	public class RequisicaoEstimativaDePrecoEPrazoComCepDestino {

		private RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder;

		private RequisicaoEstimativaDePrecoEPrazoComCepDestino(RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder) {
			this.requisicaoEstimativaDePrecoEPrazoBuilder = requisicaoEstimativaDePrecoEPrazoBuilder;
		}

		/**
		 * Informa os codigos dos servicos que serao calculados
		 */
		public RequisicaoEstimativaDePrecoEPrazoComServico comServicos(String...codigosServico) {
			requisicaoEstimativaDePrecoEPrazoBuilder.codigosServico = Sets.newHashSet(codigosServico);
			return new RequisicaoEstimativaDePrecoEPrazoComServico(requisicaoEstimativaDePrecoEPrazoBuilder);
		}
	}

	public class RequisicaoEstimativaDePrecoEPrazoComServico {

		private RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder;

		private RequisicaoEstimativaDePrecoEPrazoComServico(RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder) {
			this.requisicaoEstimativaDePrecoEPrazoBuilder = requisicaoEstimativaDePrecoEPrazoBuilder;
		}

		/**
		 * Informa as dimensoes do pacote a ser estimado
		 */
		public RequisicaoEstimativaDePrecoEPrazoComDimensoesDoPacote comDimensoesDePacote(DimensoesPacoteEstimado dimensoesPacoteEstimado) {
			requisicaoEstimativaDePrecoEPrazoBuilder.dimensoesPacoteEstimado = dimensoesPacoteEstimado;
			return new RequisicaoEstimativaDePrecoEPrazoComDimensoesDoPacote(requisicaoEstimativaDePrecoEPrazoBuilder);
		}
	}


	public class RequisicaoEstimativaDePrecoEPrazoComDimensoesDoPacote {

		private RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder;

		private RequisicaoEstimativaDePrecoEPrazoComDimensoesDoPacote(RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder) {
			this.requisicaoEstimativaDePrecoEPrazoBuilder = requisicaoEstimativaDePrecoEPrazoBuilder;
		}

		/**
		 * Informa o valor declarado do objeto que fara parte da encomenda.
		 * Esse valor interfere no calculo porque serve como base do calculo do seguro da encomenda
		 */
		public RequisicaoEstimativaDePrecoEPrazoComValorDeclarado comValorDeclarado(BigDecimal valorDeclarado) {
			requisicaoEstimativaDePrecoEPrazoBuilder.valorDeclarado = valorDeclarado;
			return new RequisicaoEstimativaDePrecoEPrazoComValorDeclarado(requisicaoEstimativaDePrecoEPrazoBuilder);
		}
	}

	public class RequisicaoEstimativaDePrecoEPrazoComValorDeclarado {

		private RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder;

		private RequisicaoEstimativaDePrecoEPrazoComValorDeclarado(RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder) {
			this.requisicaoEstimativaDePrecoEPrazoBuilder = requisicaoEstimativaDePrecoEPrazoBuilder;
		}

		/**
		 * Indica se a encomenda sera entregue com o servico adicional mao propria.
		 */
		public RequisicaoEstimativaDePrecoEPrazoComServicoMaoPropria adicionandoServicoMaoPropria() {
			requisicaoEstimativaDePrecoEPrazoBuilder.adicionaServicoMaoPropria = true;
			return new RequisicaoEstimativaDePrecoEPrazoComServicoMaoPropria(requisicaoEstimativaDePrecoEPrazoBuilder);
		}

		/**
		 * Indica se a encomenda sera entregue com o servico adicional aviso de recebimento.
		 */
		public RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento adicionandoServicoAvisoDeRecebimento() {
			requisicaoEstimativaDePrecoEPrazoBuilder.adicionaServicoAvisoRecebimento = true;
			return new RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento();
		}

		/**
		 * @return as estimativas calculadas com preco e prazo
		 */
		public List<EstimativaComPrecoEPrazo> calcula() {
			return correiosServicoEstimativaAPI.calculaPrecoEPrazo(codigosServico, cepOrigem, cepDestino, dimensoesPacoteEstimado, valorDeclarado, adicionaServicoMaoPropria, adicionaServicoAvisoRecebimento);
		}
	}

	public class RequisicaoEstimativaDePrecoEPrazoComServicoMaoPropria {

		private RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder;

		private RequisicaoEstimativaDePrecoEPrazoComServicoMaoPropria(RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder) {
			this.requisicaoEstimativaDePrecoEPrazoBuilder = requisicaoEstimativaDePrecoEPrazoBuilder;
		}

		/**
		 * Indica se a encomenda sera entregue com o servico adicional aviso de recebimento.
		 */
		public RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento adicionandoServicoAvisoDeRecebimento() {
			requisicaoEstimativaDePrecoEPrazoBuilder.adicionaServicoAvisoRecebimento = true;
			return new RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento();
		}

		/**
		 * @return as estimativas calculadas com preco e prazo
		 */
		public List<EstimativaComPrecoEPrazo> calcula() {
			return correiosServicoEstimativaAPI.calculaPrecoEPrazo(codigosServico, cepOrigem, cepDestino, dimensoesPacoteEstimado, valorDeclarado, adicionaServicoMaoPropria, adicionaServicoAvisoRecebimento);
		}
	}

	public class RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento {

		/**
		 * @return as estimativas calculadas com preco e prazo
		 */
		public List<EstimativaComPrecoEPrazo> calcula() {
			return correiosServicoEstimativaAPI.calculaPrecoEPrazo(codigosServico, cepOrigem, cepDestino, dimensoesPacoteEstimado, valorDeclarado, adicionaServicoMaoPropria, adicionaServicoAvisoRecebimento);
		}
	}
}
