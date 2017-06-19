package br.com.correios.api.estimativa;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import br.com.correios.Cep;
import br.com.correios.estimativa.DimensoesPacoteEstimado;
import br.com.correios.estimativa.EstimativaComPrazo;
import br.com.correios.estimativa.EstimativaComPrecoEPrazo;

/**
 * Servico responsavel por acessar o servico do Correios
 *
 * @since 0.0.17-BETA
 */
public interface CorreiosServicoEstimativaAPI {

	/**
	 * @return estimativas com preco e prazo
	 */
	List<EstimativaComPrecoEPrazo> calculaPrecoEPrazo(Set<String> codigosServico, Cep cepOrigem, Cep cepDestino, DimensoesPacoteEstimado dimensoesPacoteEstimado, BigDecimal valorDeclarado, boolean adicionaServicoMaoPropria, boolean adicionaServicoAvisoRecebimento);

	/**
	 * @return estimativas somente com prazo
	 */
	List<EstimativaComPrazo> calculaPrazo(Set<String> codigosServico, Cep cepOrigem, Cep cepDestino);
}
