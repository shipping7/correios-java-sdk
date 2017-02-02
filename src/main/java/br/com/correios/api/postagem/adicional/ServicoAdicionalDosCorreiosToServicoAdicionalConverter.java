package br.com.correios.api.postagem.adicional;

import br.com.correios.api.postagem.plp.ServicoAdicionalDoObjeto;
import br.com.correios.api.postagem.xml.ServicoAdicional;

public class ServicoAdicionalDosCorreiosToServicoAdicionalConverter {

	public ServicoAdicionalDoObjeto convert(ServicoAdicional servicoAdicional) {
		ServicoAdicionalDoObjeto servico = new ServicoAdicionalDoObjeto(servicoAdicional.getCodigoServicoAdicional(), servicoAdicional.getValorDeclarado());

		return servico;
	}

}
