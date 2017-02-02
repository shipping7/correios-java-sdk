package br.com.correios.api.postagem.dimensao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado;

public class DimensoesDoObjetoTest {

	private TipoDoObjetoSendoEnviado tipoDoObjeto;

	@Before
	public void setUp() {
		tipoDoObjeto = TipoDoObjetoSendoEnviado.getTipoDoObjetoAPartirDoCodigo("1");
	}

	@Test
	public void deveriaRetornarOComprimentoComoNumero() throws Exception {
		DimensoesDoObjeto dimensoes = new DimensoesDoObjeto(tipoDoObjeto, "24", "22", "1.021,52", 50);

		Integer comprimento = dimensoes.getComprimentoNumerico();

		assertThat(comprimento).isEqualTo(1021);
	}

	@Test
	public void deveriaRetornarAAlturaComoNumero() throws Exception {
		DimensoesDoObjeto dimensoes = new DimensoesDoObjeto(tipoDoObjeto, "24,20", "22", "21", 50);

		Integer altura = dimensoes.getAlturaNumerico();

		assertThat(altura).isEqualTo(24);
	}

	@Test
	public void deveriaRetornarALarguraComoNumero() throws Exception {
		DimensoesDoObjeto dimensoes = new DimensoesDoObjeto(tipoDoObjeto, "24", "2213,12", "21", 50);

		Integer largura = dimensoes.getLarguraNumerico();

		assertThat(largura).isEqualTo(2213);
	}

}
