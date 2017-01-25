package br.com.correios.api.postagem;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ClienteInformacao;
import br.com.correios.api.postagem.plp.DocumentoPlp;

public interface PostagemApi {

	Optional<ClienteEmpresa> buscaCliente(ClienteInformacao informacao);

	Optional<DocumentoPlp> buscaInformacoesDaPlp(Long plpId);

}
