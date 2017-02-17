package br.com.correios.api.etiqueta;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.correios.api.postagem.TipoServicoDeEntrega;
import br.com.correios.api.postagem.cliente.ClienteInformacao;
import br.com.correios.credentials.CorreiosCredenciais;

public class CorreiosEtiquetaApiTest {

	private CorreiosCredenciais credenciais;

	@Before
	public void startUp() {
		credenciais = new CorreiosCredenciais("seu-usuario", "sua-senha");
	}

	@Test
	public void deveriaGerarUmaEtiqueta() throws Exception {
		EtiquetaApi postagemApi = new CorreiosEtiquetaApi(credenciais);

		ClienteInformacao informacoesDeCadastro = new ClienteInformacao("123456", "123456");

		String cnpj = "123456789";
		int quantidadeDesejadaDeEtiquetas = 10;
		List<Etiqueta> etiquetas = postagemApi.solicitaEtiquetas(informacoesDeCadastro, TipoDestinatario.CLIENTE, TipoServicoDeEntrega.SEDEX_COM_CONTRATO, cnpj, quantidadeDesejadaDeEtiquetas);

		System.out.println(etiquetas);
	}

}
