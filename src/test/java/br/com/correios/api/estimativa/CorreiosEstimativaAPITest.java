package br.com.correios.api.estimativa;

import static br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado.PACOTE_OU_CAIXA;
import static java.math.BigDecimal.TEN;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.correios.Cep;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.estimativa.DimensoesPacoteEstimado;
import br.com.correios.estimativa.EstimativaComPrazo;
import br.com.correios.estimativa.EstimativaComPrecoEPrazo;

public class CorreiosEstimativaAPITest {

	private DimensoesPacoteEstimado dimensoesPacoteEstimado;
	private CorreiosEstimativaAPI correiosEstimativaAPI;

	@Before
	public void setup() {
		CorreiosCredenciais correiosCredenciais = new CorreiosCredenciais("usuario", "senha");
		correiosEstimativaAPI = new CorreiosEstimativaAPI(correiosCredenciais);

		dimensoesPacoteEstimado = DimensoesPacoteEstimado.builder()
			.comTipoDeObjeto(PACOTE_OU_CAIXA)
			.comPeso(BigDecimal.ONE)
			.comComprimento(BigDecimal.valueOf(16))
			.comAltura(TEN)
			.comLargura(BigDecimal.valueOf(11))
			.montaDimensoes();
	}

	@Test
	public void deveriaCalcularPrecoEPrazo() {
		List<EstimativaComPrecoEPrazo> estimativa = correiosEstimativaAPI.estimaPrecoEPrazo()
			.de(new Cep("11015231"))
			.para(new Cep("11045530"))
			.comServicos("04510")
			.comDimensoesDePacote(dimensoesPacoteEstimado)
			.comValorDeclarado(BigDecimal.valueOf(18))
			.calcula();

		assertTrue(estimativa.get(0).isEstimativaValida());
		System.out.println(estimativa);
	}

	@Test
	public void deveriaCalcularPrecoEPrazoAdicionandoServicoMaoPropria() {
		List<EstimativaComPrecoEPrazo> estimativa = correiosEstimativaAPI.estimaPrecoEPrazo()
			.de(new Cep("11015231"))
			.para(new Cep("11045530"))
			.comServicos("04510")
			.comDimensoesDePacote(dimensoesPacoteEstimado)
			.comValorDeclarado(BigDecimal.valueOf(18))
			.adicionandoServicoMaoPropria()
			.calcula();

		assertTrue(estimativa.get(0).isEstimativaValida());
		System.out.println(estimativa);
	}

	@Test
	public void deveriaCalcularPrecoEPrazoAdicionandoServicoAvisoRecebimento() {
		List<EstimativaComPrecoEPrazo> estimativa = correiosEstimativaAPI.estimaPrecoEPrazo()
			.de(new Cep("11015231"))
			.para(new Cep("11045530"))
			.comServicos("04510")
			.comDimensoesDePacote(dimensoesPacoteEstimado)
			.comValorDeclarado(BigDecimal.valueOf(18))
			.adicionandoServicoAvisoDeRecebimento()
			.calcula();

		assertTrue(estimativa.get(0).isEstimativaValida());
		System.out.println(estimativa);
	}

	@Test
	public void deveriaCalcularPrecoEPrazoAdicionandoServicoMaoPropriaEAvisoRecebimento() {
		List<EstimativaComPrecoEPrazo> estimativa = correiosEstimativaAPI.estimaPrecoEPrazo()
			.de(new Cep("11015231"))
			.para(new Cep("11045530"))
			.comServicos("04510")
			.comDimensoesDePacote(dimensoesPacoteEstimado)
			.comValorDeclarado(BigDecimal.valueOf(18))
			.adicionandoServicoMaoPropria()
			.adicionandoServicoAvisoDeRecebimento()
			.calcula();

		assertTrue(estimativa.get(0).isEstimativaValida());
		System.out.println(estimativa);
	}

	@Test
	public void deveriaCalcularPrazo() {
		List<EstimativaComPrazo> estimativa = correiosEstimativaAPI.estimaPrazo()
			.de(new Cep("11015231"))
			.para(new Cep("11045530"))
			.comServicos("04510", "12345")
			.calcula();

		assertTrue(estimativa.get(0).isEstimativaValida());
		assertFalse(estimativa.get(1).isEstimativaValida());
		System.out.println(estimativa);
	}

}
