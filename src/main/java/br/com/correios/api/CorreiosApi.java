package br.com.correios.api;

import br.com.correios.api.etiqueta.CorreiosEtiquetaApi;
import br.com.correios.api.etiqueta.EtiquetaApi;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosApi {

	public EtiquetaApi etiquetas(CorreiosCredenciais credenciais) {
		return new CorreiosEtiquetaApi(credenciais);
	}

}
