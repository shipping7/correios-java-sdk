package br.com.correios.estimativa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.correios.webservice.estimativa.CServico;

public class CServicoToEstimativaComPrecoEPrazoConverterTest {

	private CServicoToEstimativaComPrecoEPrazoConverter converter;
	private CServico servico;

	@Before
	public void setUp() {
		converter = new CServicoToEstimativaComPrecoEPrazoConverter();
		servico = new CServico();
	}

	@Test
	public void deveriaConverterServicoEmEstimativaComPrecoEPrazo() {
		servico.setCodigo(4669);
		servico.setEntregaDomiciliar("S");
		servico.setEntregaSabado("N");
		servico.setPrazoEntrega("5");
		servico.setValor("7,50");
		servico.setValorAvisoRecebimento("0,00");
		servico.setValorMaoPropria("0,00");
		servico.setValorValorDeclarado("1,50");
		servico.setValorSemAdicionais("7,50");
		servico.setErro("0");
		servico.setMsgErro(null);

		EstimativaComPrecoEPrazo estimativa = converter.convert(servico);

		assertEquals("04669", estimativa.getCodigoServico());
		assertEquals(Integer.valueOf(5), estimativa.getPrazoEntrega());
		assertEquals("7,50", estimativa.getValor());
		assertEquals("0,00", estimativa.getValorServicoAvisoDeRecebimento());
		assertEquals("1,50", estimativa.getValorSeguro());
		assertEquals("0,00", estimativa.getValorServicoMaoPropria());
		assertEquals("7,50", estimativa.getValorSemAdicionais());
		assertTrue(estimativa.isEntregaDomiciliar());
		assertFalse(estimativa.isEntregaAosSabados());
		assertEquals("0", estimativa.getCodigoErro());
		assertNull(estimativa.getMensagemErro());
	}

	@Test
	public void deveriaConverterServicoEmEstimativaComPrecoEPrazoMesmoQuandoEstimativaForInvalida() {
		servico.setCodigo(4669);
		servico.setEntregaDomiciliar(null);
		servico.setEntregaSabado(null);
		servico.setPrazoEntrega("0");
		servico.setValor("0,00");
		servico.setValorAvisoRecebimento("0,00");
		servico.setValorValorDeclarado("0,00");
		servico.setValorMaoPropria("0,00");
		servico.setValorSemAdicionais("0,00");
		servico.setErro("-20");
		servico.setMsgErro("A largura nao pode ser inferior a 11 cm.");

		EstimativaComPrecoEPrazo estimativa = converter.convert(servico);

		assertEquals("04669", estimativa.getCodigoServico());
		assertEquals(Integer.valueOf(0), estimativa.getPrazoEntrega());
		assertEquals("0,00", estimativa.getValor());
		assertEquals("0,00", estimativa.getValorServicoAvisoDeRecebimento());
		assertEquals("0,00", estimativa.getValorSeguro());
		assertEquals("0,00", estimativa.getValorServicoMaoPropria());
		assertEquals("0,00", estimativa.getValorSemAdicionais());
		assertFalse(estimativa.isEntregaDomiciliar());
		assertFalse(estimativa.isEntregaAosSabados());
		assertEquals("-20", estimativa.getCodigoErro());
		assertEquals("A largura nao pode ser inferior a 11 cm.", estimativa.getMensagemErro());
	}

}
