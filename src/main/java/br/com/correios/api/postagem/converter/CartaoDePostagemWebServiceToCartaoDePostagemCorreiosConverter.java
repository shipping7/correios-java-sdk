package br.com.correios.api.postagem.converter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.correios.api.postagem.CartaoPostagem;
import br.com.correios.api.postagem.DataVigencia;
import br.com.correios.api.postagem.ServicoCorreio;
import br.com.correios.webservice.postagem.CartaoPostagemERP;
import br.com.correios.webservice.postagem.ServicoERP;

public class CartaoDePostagemWebServiceToCartaoDePostagemCorreiosConverter {

	public CartaoPostagem convert(CartaoPostagemERP cartaoWebService) {
		XMLGregorianCalendar dataAtualizacao = cartaoWebService.getDataAtualizacao();
		Calendar dataDeAtualizacao = null;
		if (dataAtualizacao != null) {
			dataDeAtualizacao = dataAtualizacao.toGregorianCalendar();
		}

		DataVigencia vigencia = new DataVigencia();
		if (cartaoWebService.getDataVigenciaInicio() != null) {
			vigencia.setDataDoInicioDaVigencia(cartaoWebService.getDataVigenciaInicio().toGregorianCalendar());
		}
		if (cartaoWebService.getDataVigenciaFim() != null) {
			vigencia.setDataDoFimDaVigencia(cartaoWebService.getDataVigenciaFim().toGregorianCalendar());
		}

		ServicoCorreioWebServiceToServicoCorreioConverter servicoConverter = new ServicoCorreioWebServiceToServicoCorreioConverter();
		List<ServicoCorreio> servicos = new ArrayList<>();
		for (ServicoERP servico: cartaoWebService.getServicos()) {
			servicos.add(servicoConverter.convert(servico));
		}

		CartaoPostagem cartao = CartaoPostagem
			.novoCartao()
			.comCodigoAdministrativo(cartaoWebService.getCodigoAdministrativo())
			.atualizadoNaData(dataDeAtualizacao)
			.comVigencia(vigencia)
			.comDescricaoGenericaDeUnidadeDePostagem(cartaoWebService.getDescricaoUnidadePostagemGenerica())
			.deNumero(cartaoWebService.getNumero())
			.build();

		return cartao;
	}

}
