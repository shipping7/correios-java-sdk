package br.com.correios.api.postagem;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.adicional.ServicoCorreio;
import br.com.correios.api.postagem.cartao.CartaoPostagem;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.contrato.Contrato;

public class ClienteEmpresaTest {

	@Test
	public void deveriaRetornarOIdDoServicoAPartirDoCodigoDoDestinatario() throws Exception {
		ServicoCorreio primeiroServico = ServicoCorreio
			.novoServico()
			.comId(1L)
			.comCodigo("123")
			.build();
		ServicoCorreio segundoServico = ServicoCorreio
			.novoServico()
			.comId(2L)
			.comCodigo("456")
			.build();

		CartaoPostagem cartaoPostagem = CartaoPostagem
			.novoCartao()
			.comServicos(asList(primeiroServico, segundoServico))
			.build();

		Contrato contrato = Contrato
			.novoContrato()
			.comCartoesDePostagem(asList(cartaoPostagem))
			.build();

		ClienteEmpresa empresa = ClienteEmpresa
			.novoCliente()
			.possuindoOsContratos(asList(contrato))
			.build();

		Long servicoId = empresa.getServicoPeloCodigo("123").get().getId();

		assertThat(servicoId).isEqualTo(1);
	}

	@Test
	public void naoDeveriaRetornarNenhumServicoIdSeOCodigoDoDestinatarioNaoExiste() throws Exception {
		ServicoCorreio primeiroServico = ServicoCorreio
			.novoServico()
			.comId(1L)
			.comCodigo("123")
			.build();
		ServicoCorreio segundoServico = ServicoCorreio
			.novoServico()
			.comId(2L)
			.comCodigo("456")
			.build();

		CartaoPostagem cartaoPostagem = CartaoPostagem
			.novoCartao()
			.comServicos(asList(primeiroServico, segundoServico))
			.build();

		Contrato contrato = Contrato
			.novoContrato()
			.comCartoesDePostagem(asList(cartaoPostagem))
			.build();

		ClienteEmpresa empresa = ClienteEmpresa
			.novoCliente()
			.possuindoOsContratos(asList(contrato))
			.build();

		Optional<ServicoCorreio> servicoid = empresa.getServicoPeloCodigo("999");

		assertThat(servicoid.isPresent()).isFalse();
	}

}
