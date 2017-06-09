package br.com.correios.estimativa;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EstimativaComPrazoTest {

	private EstimativaComPrazo estimativaComPrazo;

	@Before
	public void setUp() {
		estimativaComPrazo = new EstimativaComPrazo();
	}

	@Test
	public void deveriaMostrarEstimativaInvalidaESemMensagemDeAtencaoQuandoPrazoDeEntregaForZeroETiverMensagemErro() {
		estimativaComPrazo.setPrazoEntrega(0);
		estimativaComPrazo.setCodigoErro("001");
		estimativaComPrazo.setMensagemErro("Codigo de servico invalido.");

		assertFalse(estimativaComPrazo.isEstimativaValida());
		assertFalse(estimativaComPrazo.possuiMensagemAtencao());
	}

	@Test
	public void deveriaMostrarEstimativaValidaEComMensagemDeAtencaoQuandoPrazoDeEntregaForValidoETiverMensagemErro() {
		estimativaComPrazo.setPrazoEntrega(5);
		estimativaComPrazo.setCodigoErro("010");
		estimativaComPrazo.setMensagemErro("Area de Risco");

		assertTrue(estimativaComPrazo.isEstimativaValida());
		assertTrue(estimativaComPrazo.possuiMensagemAtencao());
	}

	@Test
	public void deveriaMostrarEstimativaValidaESemMensagemDeAtencaoQuandoPrazoDeEntregaForValidoENaoTiverMensagemErro() {
		estimativaComPrazo.setPrazoEntrega(5);
		estimativaComPrazo.setCodigoErro("0");
		estimativaComPrazo.setMensagemErro("");

		assertTrue(estimativaComPrazo.isEstimativaValida());
		assertFalse(estimativaComPrazo.possuiMensagemAtencao());
	}

}
