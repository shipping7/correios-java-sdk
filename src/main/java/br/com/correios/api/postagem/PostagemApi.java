package br.com.correios.api.postagem;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.plp.DocumentoPlp;

public interface PostagemApi {

	Optional<ClienteEmpresa> buscaCliente(ContratoEmpresa informacao);

	Optional<DocumentoPlp> buscaDocumentoPlp(Long plpId);

}
