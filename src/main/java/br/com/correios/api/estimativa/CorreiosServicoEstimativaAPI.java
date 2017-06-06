package br.com.correios.api.estimativa;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import br.com.correios.Cep;
import br.com.correios.estimativa.DimensoesPacoteEstimado;
import br.com.correios.estimativa.EstimativaComPrazo;
import br.com.correios.estimativa.EstimativaComPrecoEPrazo;

public interface CorreiosServicoEstimativaAPI {

	List<EstimativaComPrecoEPrazo> calculaPrecoEPrazo(Set<String> codigosServico, Cep cepOrigem, Cep cepDestino, DimensoesPacoteEstimado dimensoesPacoteEstimado, BigDecimal valorDeclarado, boolean adicionaServicoMaoPropria, boolean adicionaServicoAvisoRecebimento);

	List<EstimativaComPrazo> calculaPrazo(Set<String> codigosServico, Cep cepOrigem, Cep cepDestino);
}
