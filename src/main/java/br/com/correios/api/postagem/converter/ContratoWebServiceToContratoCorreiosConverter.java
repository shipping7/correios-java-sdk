package br.com.correios.api.postagem.converter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.correios.api.postagem.CartaoPostagem;
import br.com.correios.api.postagem.Contrato;
import br.com.correios.api.postagem.ContratoDiretoria;
import br.com.correios.api.postagem.DataVigencia;
import br.com.correios.api.postagem.Status;
import br.com.correios.webservice.postagem.CartaoPostagemERP;
import br.com.correios.webservice.postagem.ContratoERP;

public class ContratoWebServiceToContratoCorreiosConverter {

	public Contrato convert(ContratoERP contratoWebService) {
		CartaoDePostagemWebServiceToCartaoDePostagemCorreiosConverter cartaoDePostagemConverter = new CartaoDePostagemWebServiceToCartaoDePostagemCorreiosConverter();
		List<CartaoPostagem> cartoes = new ArrayList<>();

		for (CartaoPostagemERP cartao: contratoWebService.getCartoesPostagem()) {
			cartoes.add(cartaoDePostagemConverter.convert(cartao));
		}

		XMLGregorianCalendar dataAtualizacao = contratoWebService.getDataAtualizacao();
		Calendar dataDeAtualizacao = null;
		if (dataAtualizacao != null) {
			dataDeAtualizacao = dataAtualizacao.toGregorianCalendar();
		}

		DataVigencia vigencia = new DataVigencia();
		if (contratoWebService.getDataVigenciaInicio() != null) {
			vigencia.setDataDoInicioDaVigencia(contratoWebService.getDataVigenciaInicio().toGregorianCalendar());
		}
		if (contratoWebService.getDataVigenciaFim() != null) {
			vigencia.setDataDoFimDaVigencia(contratoWebService.getDataVigenciaFim().toGregorianCalendar());
		}

		Contrato contrato = Contrato
				.novoContrato()
				.comCartoesDePostagem(cartoes)
				.comCodigoCliente(contratoWebService.getCodigoCliente())
				.atualizadoNaData(dataDeAtualizacao)
				.comContratoDeDiretoria(new ContratoDiretoria(contratoWebService.getCodigoDiretoria()))
				.comDescricaoDeDiretoriaRegional(contratoWebService.getDescricaoDiretoriaRegional())
				.comStatus(new Status(contratoWebService.getDescricaoStatus(), contratoWebService.getStatusCodigo()))
				.comVigencia(vigencia)
				.build();

		return contrato;
	}

}
