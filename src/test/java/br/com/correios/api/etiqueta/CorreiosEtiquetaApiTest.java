package br.com.correios.api.etiqueta;

import static br.com.correios.api.postagem.TipoServicoDeEntrega.SEDEX_COM_CONTRATO;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.correios.api.CorreiosApi;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosEtiquetaApiTest {

	private CorreiosCredenciais credenciais;

	@Before
	public void startUp() {
		credenciais = new CorreiosCredenciais("seu-usuario", "sua-senha");
	}

	@Test
	public void deveriaSolicitarEtiquetasAosCorreios() throws Exception {
		CorreiosApi api = new CorreiosApi();

		String cnpj = "123456789";
		ContratoEmpresa contrato = new ContratoEmpresa(cnpj, "123456789", "123456789");

		List<Etiqueta> etiquetas = api
			.etiquetas(credenciais)
			.solicita(2)
			.usandoServicoDeEntrega(SEDEX_COM_CONTRATO)
			.comContrato(contrato);

		assertThat(etiquetas.size()).isGreaterThan(1);
	}

}
