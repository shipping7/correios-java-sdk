package br.com.correios.api.postagem.plp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ObjetoPlpTest {

	@Mock
	private DimensoesDoObjetoPlp dimensoesDoObjetoPlp;
	@Mock
	private PesoDoObjetoPlp pesoDoObjeto;
	@Mock
	private DestinatarioDoObjetoPlp destinatarioDoObjetoPlp;

	@Test
	public void deveriaRetornarONumeroDaEtiquetaSemDigitoVerificador() {
		ObjetoPlp objetoPlp = new ObjetoPlp(dimensoesDoObjetoPlp, pesoDoObjeto, "04162", "SI973006763BR", destinatarioDoObjetoPlp, null, null);

		assertEquals("SI973006763BR", objetoPlp.getNumeroDaEtiqueta());
		assertEquals("SI97300676BR", objetoPlp.getNumeroDaEtiquetaSemDigitoVerificador());
	}

}
