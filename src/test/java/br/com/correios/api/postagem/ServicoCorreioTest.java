package br.com.correios.api.postagem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.com.correios.api.postagem.adicional.ServicoCorreio;

public class ServicoCorreioTest {

	@Test
	public void deveriaIndicarQueOCodigoDoDestinatarioEhOMesmoCodigoExistenteNoServico() throws Exception {
		ServicoCorreio servicoCorreio = ServicoCorreio
			.novoServico()
			.comCodigo("123456")
			.build();

		boolean codigoIgual = servicoCorreio.temMesmoCodigoDoDestinatario(123456);

		assertThat(codigoIgual).isTrue();
	}

	@Test
	public void deveriaIndicarQueOCodigoDoDestinatarioEOMesmoCodigoExistenteNoServicoMesmoComEspacoEnviadoPeloCorreio() throws Exception {
		ServicoCorreio servicoCorreio = ServicoCorreio
			.novoServico()
			.comCodigo("123456 ")
			.build();

		boolean codigoIgual = servicoCorreio.temMesmoCodigoDoDestinatario(123456);

		assertThat(codigoIgual).isTrue();
	}

	@Test
	public void deveriaIndicarQueOCodigoDoDestinatarioNaoEhOMesmoCodigoExistenteNoServico() throws Exception {
		ServicoCorreio servicoCorreio = ServicoCorreio
			.novoServico()
			.comCodigo("654321")
			.build();

		boolean codigoIgual = servicoCorreio.temMesmoCodigoDoDestinatario(123456);

		assertThat(codigoIgual).isFalse();
	}

}
