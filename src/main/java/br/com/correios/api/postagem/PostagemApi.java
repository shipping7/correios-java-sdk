package br.com.correios.api.postagem;

import java.util.List;

import com.google.common.base.Optional;

import br.com.correios.api.etiqueta.Etiqueta;
import br.com.correios.api.etiqueta.TipoDestinatario;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ClienteInformacao;
import br.com.correios.api.postagem.plp.DocumentoPlp;

public interface PostagemApi {

	Optional<ClienteEmpresa> buscaCliente(ClienteInformacao informacao);

	Optional<DocumentoPlp> buscaDocumentoPlp(Long plpId);

	List<Etiqueta> solicitaEtiquetas(ClienteInformacao informacoesDeCadastro, TipoDestinatario destinatario, TipoServicoDeEntrega tipoDeEntrega, String cnpj, Integer quantidadeDesejadaDeEtiquetas);

}
