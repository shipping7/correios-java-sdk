package br.com.correios.api.postagem;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.converter.ClienteRetornadoDosCorreiosToClienteConverter;
import br.com.correios.api.postagem.exception.CorreiosPostagemAutenticacaoException;
import br.com.correios.webservice.postagem.AutenticacaoException;
import br.com.correios.webservice.postagem.ClienteERP;
import br.com.correios.webservice.postagem.SigepClienteException;

public class CorreiosPostagemApi implements PostagemApi {

	private CorreiosPostagemDadosAutenticacao credenciais;
	private CorreiosWebService correiosWebService;

	public CorreiosPostagemApi(CorreiosPostagemDadosAutenticacao credenciais) {
		this.credenciais = credenciais;
		this.correiosWebService = new CorreiosWebService();
	}

	@Override
	public Optional<ClienteEmpresa> buscaCliente(ClienteInformacao informacao) {
		try {
			ClienteERP clienteRetornadoDosCorreios = correiosWebService
					.getCorreiosWebService()
					.buscaCliente(informacao.getContrato(), informacao.getCartaoDePostagem(), credenciais.getUsuario(), credenciais.getSenha());

			if (clienteRetornadoDosCorreios != null) {
 				ClienteEmpresa cliente = new ClienteRetornadoDosCorreiosToClienteConverter().convert(clienteRetornadoDosCorreios);
				return Optional.of(cliente);
			}
		} catch (AutenticacaoException | SigepClienteException e) {
			throw new CorreiosPostagemAutenticacaoException(String.format("Ocorreu um erro ao se autenticar nos correios com a seguinte credencial: ", credenciais));
		}
		return Optional.absent();
	}

}
