package br.com.correios.estimativa;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EstimativaComPrecoEPrazoTest {

	private EstimativaComPrecoEPrazo estimativaComPrecoEPrazo;

	@Before
	public void setUp() {
		estimativaComPrecoEPrazo = new EstimativaComPrecoEPrazo();
	}

	@Test
	public void deveriaMostrarEstimativaInvalidaESemMensagemDeAtencaoQuandoPrazoDeEntregaForZeroETiverMensagemErro() {
		estimativaComPrecoEPrazo.setValor("0");
		estimativaComPrecoEPrazo.setPrazoEntrega(0);
		estimativaComPrecoEPrazo.setCodigoErro("001");
		estimativaComPrecoEPrazo.setMensagemErro("Codigo de servico invalido.");

		assertFalse(estimativaComPrecoEPrazo.isEstimativaValida());
		assertFalse(estimativaComPrecoEPrazo.possuiMensagemAtencao());
	}

	@Test
	public void deveriaMostrarEstimativaValidaEComMensagemDeAtencaoQuandoPrazoDeEntregaForValidoETiverMensagemErro() {
		estimativaComPrecoEPrazo.setValor("17,20");
		estimativaComPrecoEPrazo.setPrazoEntrega(5);
		estimativaComPrecoEPrazo.setCodigoErro("010");
		estimativaComPrecoEPrazo.setMensagemErro("Area de Risco");

		assertTrue(estimativaComPrecoEPrazo.isEstimativaValida());
		assertTrue(estimativaComPrecoEPrazo.possuiMensagemAtencao());
	}

	@Test
	public void deveriaMostrarEstimativaValidaESemMensagemDeAtencaoQuandoPrazoDeEntregaForValidoENaoTiverMensagemErro() {
		estimativaComPrecoEPrazo.setValor("17,20");
		estimativaComPrecoEPrazo.setPrazoEntrega(5);
		estimativaComPrecoEPrazo.setCodigoErro("0");
		estimativaComPrecoEPrazo.setMensagemErro("");

		assertTrue(estimativaComPrecoEPrazo.isEstimativaValida());
		assertFalse(estimativaComPrecoEPrazo.possuiMensagemAtencao());
	}

}
