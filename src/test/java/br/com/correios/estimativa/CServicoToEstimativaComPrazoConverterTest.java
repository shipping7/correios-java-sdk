package br.com.correios.estimativa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.correios.webservice.estimativa.CServico;

public class CServicoToEstimativaComPrazoConverterTest {

	private CServicoToEstimativaComPrazoConverter converter;
	private CServico servico;

	@Before
	public void setup() {
		converter = new CServicoToEstimativaComPrazoConverter();
		servico = new CServico();
	}

	@Test
	public void deveriaConverterServicoEmEstimativaComPrazo() {
		servico.setCodigo(4669);
		servico.setEntregaDomiciliar("S");
		servico.setEntregaSabado("N");
		servico.setPrazoEntrega("5");
		servico.setErro("0");
		servico.setMsgErro(null);
		servico.setDataMaxEntrega("20/10/2017");
		servico.setHoraMaxEntrega("10:30:00");

		EstimativaComPrazo estimativa = converter.convert(servico);

		assertEquals("04669", estimativa.getCodigoServico());
		assertEquals(Integer.valueOf(5), estimativa.getPrazoEntrega());
		assertTrue(estimativa.isEntregaDomiciliar());
		assertFalse(estimativa.isEntregaAosSabados());
		assertEquals("0", estimativa.getCodigoErro());
		assertNull(estimativa.getMensagemErro());
		assertEquals("20/10/2017", estimativa.getDataMaximaEntrega());
		assertEquals("10:30:00", estimativa.getHoraMaximaEntrega());
	}

	@Test
	public void deveriaConverterServicoEmEstimativaComPrazoMesmoQuandoEstimativaForInvalida() {
		servico.setCodigo(4669);
		servico.setEntregaDomiciliar(null);
		servico.setEntregaSabado(null);
		servico.setPrazoEntrega("0");
		servico.setErro("002");
		servico.setMsgErro("CEP de origem invalido");

		EstimativaComPrazo estimativa = converter.convert(servico);

		assertEquals("04669", estimativa.getCodigoServico());
		assertEquals(Integer.valueOf(0), estimativa.getPrazoEntrega());
		assertFalse(estimativa.isEntregaDomiciliar());
		assertFalse(estimativa.isEntregaAosSabados());
		assertEquals("002", estimativa.getCodigoErro());
		assertEquals("CEP de origem invalido", estimativa.getMensagemErro());
	}

}
