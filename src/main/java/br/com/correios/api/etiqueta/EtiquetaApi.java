package br.com.correios.api.etiqueta;

import java.util.List;

import br.com.correios.api.postagem.TipoServicoDeEntrega;
import br.com.correios.api.postagem.cliente.ClienteInformacao;

public interface EtiquetaApi {

	List<Etiqueta> solicitaEtiquetas(ClienteInformacao informacoesDeCadastro, TipoDestinatario destinatario, TipoServicoDeEntrega tipoDeEntrega, String cnpj, Integer quantidadeDesejadaDeEtiquetas);

}
