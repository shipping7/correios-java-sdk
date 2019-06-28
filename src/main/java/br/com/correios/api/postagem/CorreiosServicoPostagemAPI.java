package br.com.correios.api.postagem;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.plp.DocumentoPlp;

import java.util.List;

public interface CorreiosServicoPostagemAPI {

	Optional<ClienteEmpresa> buscaCliente(ContratoEmpresa contratoEmpresa);

	Optional<DocumentoPlp> buscaDocumentoPlp(Long plpId);

	Optional<DocumentoPlp> buscaDocumentoPlp(Long plpId, String etiqueta);

	boolean cancelaObjetoDaPlp(Long plpId, String numeroEtiqueta);

	Long fechaPlpVariosServicos(String xml, Long plpId, String cartaoPostagem, List<String> listaEtiquetas);
}
