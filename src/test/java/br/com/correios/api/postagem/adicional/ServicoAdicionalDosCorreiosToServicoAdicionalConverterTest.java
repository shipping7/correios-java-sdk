package br.com.correios.api.postagem.adicional;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.com.correios.api.postagem.plp.ServicoAdicionalDoObjeto;
import br.com.correios.api.postagem.xml.ServicoAdicional;

public class ServicoAdicionalDosCorreiosToServicoAdicionalConverterTest {

	@Test
	public void deveriaConverterOServicoAdicionalDosCorreiosNoServicoAdicionalDoSdk() throws Exception {
		ServicoAdicionalDosCorreiosToServicoAdicionalConverter converter = new ServicoAdicionalDosCorreiosToServicoAdicionalConverter();
		ServicoAdicional servicoAdicionalDosCorreios = new ServicoAdicional();
		servicoAdicionalDosCorreios.addCodigoServicoAdicional("ABC");
		servicoAdicionalDosCorreios.addCodigoServicoAdicional("DEF");
		servicoAdicionalDosCorreios.setValorDeclarado("100");

		ServicoAdicionalDoObjeto servicoAdicional = converter.convert(servicoAdicionalDosCorreios);

		assertThat(servicoAdicional.getCodigosDosServicosAdicionais().get(0)).isEqualTo("ABC");
		assertThat(servicoAdicional.getCodigosDosServicosAdicionais().get(1)).isEqualTo("DEF");
		assertThat(servicoAdicional.getValorDeclarado()).isEqualTo("100");
	}

}
