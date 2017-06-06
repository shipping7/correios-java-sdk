package br.com.correios.estimativa;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado;

public class DimensoesPacoteEstimadoTest {

	@Test
	public void deveriaMontarDimensoesUsandoBuilder() {
		DimensoesPacoteEstimado dimensoesPacoteEstimado = DimensoesPacoteEstimado.builder()
														   .comTipoDeObjeto(TipoDoObjetoSendoEnviado.PACOTE_OU_CAIXA)
														   .comPeso(BigDecimal.ONE)
														   .comComprimento(BigDecimal.valueOf(2))
														   .comAltura(BigDecimal.valueOf(3))
														   .comLargura(BigDecimal.valueOf(4))
														   .montaDimensoes();

		assertEquals(TipoDoObjetoSendoEnviado.PACOTE_OU_CAIXA, dimensoesPacoteEstimado.getTipoDoObjetoSendoEnviado());
		assertEquals(BigDecimal.ONE, dimensoesPacoteEstimado.getPeso());
		assertEquals(BigDecimal.valueOf(2), dimensoesPacoteEstimado.getComprimento());
		assertEquals(BigDecimal.valueOf(3), dimensoesPacoteEstimado.getAltura());
		assertEquals(BigDecimal.valueOf(4), dimensoesPacoteEstimado.getLargura());
		assertEquals(BigDecimal.ZERO, dimensoesPacoteEstimado.getDiametro());
	}

	@Test
	public void deveriaMontarDimensoesPodendoUsarDiametroTambem() {
		DimensoesPacoteEstimado dimensoesPacoteEstimado = DimensoesPacoteEstimado.builder()
				.comTipoDeObjeto(TipoDoObjetoSendoEnviado.PACOTE_OU_CAIXA)
				.comPeso(BigDecimal.ONE)
				.comComprimento(BigDecimal.valueOf(2))
				.comAltura(BigDecimal.valueOf(3))
				.comLargura(BigDecimal.valueOf(4))
				.comDiametro(BigDecimal.valueOf(5))
				.montaDimensoes();

		assertEquals(TipoDoObjetoSendoEnviado.PACOTE_OU_CAIXA, dimensoesPacoteEstimado.getTipoDoObjetoSendoEnviado());
		assertEquals(BigDecimal.ONE, dimensoesPacoteEstimado.getPeso());
		assertEquals(BigDecimal.valueOf(2), dimensoesPacoteEstimado.getComprimento());
		assertEquals(BigDecimal.valueOf(3), dimensoesPacoteEstimado.getAltura());
		assertEquals(BigDecimal.valueOf(4), dimensoesPacoteEstimado.getLargura());
		assertEquals(BigDecimal.valueOf(5), dimensoesPacoteEstimado.getDiametro());
	}

}
