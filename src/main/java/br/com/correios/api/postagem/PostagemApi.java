package br.com.correios.api.postagem;

import com.google.common.base.Optional;

public interface PostagemApi {

	Optional<ClienteEmpresa> buscaCliente(ClienteInformacao informacao);

}
