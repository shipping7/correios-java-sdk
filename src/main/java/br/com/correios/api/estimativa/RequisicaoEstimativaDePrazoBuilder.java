package br.com.correios.api.estimativa;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

import br.com.correios.Cep;
import br.com.correios.estimativa.EstimativaComPrazo;

public class RequisicaoEstimativaDePrazoBuilder {

	private CorreiosServicoEstimativaAPI correiosServicoEstimativaAPI;
	private Set<String> codigosServico;
	private Cep cepOrigem;
	private Cep cepDestino;

	RequisicaoEstimativaDePrazoBuilder(CorreiosServicoEstimativaAPI correiosServicoEstimativaAPI) {
		this.correiosServicoEstimativaAPI = correiosServicoEstimativaAPI;
	}

	public RequisicaoEstimativaDePrazoComCepOrigem de(Cep cepOrigem) {
		this.cepOrigem = cepOrigem;
		return new RequisicaoEstimativaDePrazoComCepOrigem(this);
	}

	public class RequisicaoEstimativaDePrazoComCepOrigem {

		private RequisicaoEstimativaDePrazoBuilder requisicaoEstimativaDePrazoBuilder;

		private RequisicaoEstimativaDePrazoComCepOrigem(RequisicaoEstimativaDePrazoBuilder requisicaoEstimativaDePrazoBuilder) {
			this.requisicaoEstimativaDePrazoBuilder = requisicaoEstimativaDePrazoBuilder;
		}

		public RequisicaoEstimativaDePrazoComCepDestino para(Cep cepDestino) {
			requisicaoEstimativaDePrazoBuilder.cepDestino = cepDestino;
			return new RequisicaoEstimativaDePrazoComCepDestino(requisicaoEstimativaDePrazoBuilder);
		}
	}

	public class RequisicaoEstimativaDePrazoComCepDestino {

		private RequisicaoEstimativaDePrazoBuilder requisicaoEstimativaDePrazoBuilder;

		private RequisicaoEstimativaDePrazoComCepDestino(RequisicaoEstimativaDePrazoBuilder requisicaoEstimativaDePrazoBuilder) {
			this.requisicaoEstimativaDePrazoBuilder = requisicaoEstimativaDePrazoBuilder;
		}

		public RequisicaoEstimativaDePrazoComServico comServicos(String...codigosServico) {
			requisicaoEstimativaDePrazoBuilder.codigosServico = Sets.newHashSet(codigosServico);
			return new RequisicaoEstimativaDePrazoComServico();
		}
	}

	public class RequisicaoEstimativaDePrazoComServico {

		public List<EstimativaComPrazo> calcula() {
			return correiosServicoEstimativaAPI.calculaPrazo(codigosServico, cepOrigem, cepDestino);
		}

	}
}
