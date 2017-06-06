package br.com.correios.api.estimativa;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

import br.com.correios.Cep;
import br.com.correios.estimativa.DimensoesPacoteEstimado;
import br.com.correios.estimativa.EstimativaComPrecoEPrazo;

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

	public RequisicaoEstimativaDePrecoEPrazoComCepOrigem de(Cep cepOrigem) {
		this.cepOrigem = cepOrigem;
		return new RequisicaoEstimativaDePrecoEPrazoComCepOrigem(this);
	}

	public class RequisicaoEstimativaDePrecoEPrazoComCepOrigem {

		private RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder;

		private RequisicaoEstimativaDePrecoEPrazoComCepOrigem(RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder) {
			this.requisicaoEstimativaDePrecoEPrazoBuilder = requisicaoEstimativaDePrecoEPrazoBuilder;
		}

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

		public RequisicaoEstimativaDePrecoEPrazoComServicoMaoPropria adicionandoServicoMaoPropria() {
			requisicaoEstimativaDePrecoEPrazoBuilder.adicionaServicoMaoPropria = true;
			return new RequisicaoEstimativaDePrecoEPrazoComServicoMaoPropria(requisicaoEstimativaDePrecoEPrazoBuilder);
		}

		public RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento adicionandoServicoAvisoDeRecebimento() {
			requisicaoEstimativaDePrecoEPrazoBuilder.adicionaServicoAvisoRecebimento = true;
			return new RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento();
		}

		public List<EstimativaComPrecoEPrazo> calcula() {
			return correiosServicoEstimativaAPI.calculaPrecoEPrazo(codigosServico, cepOrigem, cepDestino, dimensoesPacoteEstimado, valorDeclarado, adicionaServicoMaoPropria, adicionaServicoAvisoRecebimento);
		}
	}

	public class RequisicaoEstimativaDePrecoEPrazoComServicoMaoPropria {

		private RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder;

		private RequisicaoEstimativaDePrecoEPrazoComServicoMaoPropria(RequisicaoEstimativaDePrecoEPrazoBuilder requisicaoEstimativaDePrecoEPrazoBuilder) {
			this.requisicaoEstimativaDePrecoEPrazoBuilder = requisicaoEstimativaDePrecoEPrazoBuilder;
		}

		public RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento adicionandoServicoAvisoDeRecebimento() {
			requisicaoEstimativaDePrecoEPrazoBuilder.adicionaServicoAvisoRecebimento = true;
			return new RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento();
		}

		public List<EstimativaComPrecoEPrazo> calcula() {
			return correiosServicoEstimativaAPI.calculaPrecoEPrazo(codigosServico, cepOrigem, cepDestino, dimensoesPacoteEstimado, valorDeclarado, adicionaServicoMaoPropria, adicionaServicoAvisoRecebimento);
		}
	}

	public class RequisicaoEstimativaDePrecoEPrazoComServicoAvisoDeRecebimento {

		public List<EstimativaComPrecoEPrazo> calcula() {
			return correiosServicoEstimativaAPI.calculaPrecoEPrazo(codigosServico, cepOrigem, cepDestino, dimensoesPacoteEstimado, valorDeclarado, adicionaServicoMaoPropria, adicionaServicoAvisoRecebimento);
		}
	}
}
