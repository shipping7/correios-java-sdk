package br.com.correios.api.postagem.converter;

import java.util.Calendar;

import br.com.correios.api.postagem.DataVigencia;
import br.com.correios.api.postagem.ServicoCorreio;
import br.com.correios.webservice.postagem.ServicoERP;
import br.com.correios.webservice.postagem.VigenciaERP;

public class ServicoCorreioWebServiceToServicoCorreioConverter {

	public ServicoCorreio convert(ServicoERP servicoWebService) {
		VigenciaERP vigencia = servicoWebService.getVigencia();
		DataVigencia dataVigencia = new DataVigencia();
		if (vigencia != null) {
			if (vigencia.getDataInicial() != null) {
				dataVigencia.setDataDoInicioDaVigencia(vigencia.getDataInicial().toGregorianCalendar());
			}
			if (vigencia.getDataFinal() != null) {
				dataVigencia.setDataDoFimDaVigencia(vigencia.getDataFinal().toGregorianCalendar());
			}
		}

		Calendar dataDeAtualizacao = null;
		if (servicoWebService.getDataAtualizacao() != null) {
			dataDeAtualizacao = servicoWebService.getDataAtualizacao().toGregorianCalendar();
		}

		ServicoCorreio servico = ServicoCorreio
			.novoServico()
			.comId(servicoWebService.getId())
			.comCodigo(servicoWebService.getCodigo())
			.comDescricao(servicoWebService.getDescricao())
			.comVigencia(dataVigencia)
			.atualizadoNaData(dataDeAtualizacao)
			.build();

		return servico;
	}

}
