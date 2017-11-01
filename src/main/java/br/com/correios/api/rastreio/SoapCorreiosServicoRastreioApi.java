package br.com.correios.api.rastreio;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.api.converter.EventosDosCorreiosToPacoteRastreadoDetalhesConverter;
import br.com.correios.api.exception.CorreiosEventosConverterException;
import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.rastreio.model.CorreiosEscopoResultado;
import br.com.correios.api.rastreio.model.CorreiosIdioma;
import br.com.correios.api.rastreio.model.CorreiosTipoIdentificador;
import br.com.correios.api.rastreio.model.DetalhesRastreio;
import br.com.correios.api.rastreio.model.ObjetoRastreio;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.rastreio.EventosDosCorreios;
import br.com.correios.webservice.rastreio.Service;



/**
 * Classe que encapsula a chamada SOAP para os correios atraves do WSDL dos Correios
 */
class SoapCorreiosServicoRastreioApi implements CorreiosServicoRastreioApi {

	private CorreiosCredenciais credenciais;
	private Service servicoApi;
	private EventosDosCorreiosToPacoteRastreadoDetalhesConverter converter;

	public SoapCorreiosServicoRastreioApi(CorreiosCredenciais credenciais, Service servicoApi, EventosDosCorreiosToPacoteRastreadoDetalhesConverter converter) {
		this.credenciais = credenciais;
		this.servicoApi = servicoApi;
		this.converter = converter;
	}

	@Override
	public DetalhesRastreio buscaDetalhesRastreio(List<String> codigosDeRastreio, CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador) {
		EventosDosCorreios eventos = null;
		try {
			eventos = servicoApi.buscaEventosLista(credenciais.getUsuario(), credenciais.getSenha(),
					tipoIdentificador.getCodigoInternoDosCorreios(),
					resultado.getCodigoInternoDosCorreios(),
					idioma.getCodigoInternoDosCorreio(),
					codigosDeRastreio);
		} catch (Exception e) {
			throw new CorreiosServicoSoapException("Ocorreu um erro ao fazer a chamada SOAP para os correios. Verifique se voce passou corretamente os dados desejados", e);
		}

		DetalhesRastreio detalhesRastreio;
		try {
			detalhesRastreio = converter.convert(eventos);
		} catch (Exception e) {
			throw new CorreiosEventosConverterException("Ocorreu um erro ao tentar converter o Evento vindo dos correios", e);
		}

		List<ObjetoRastreio> objetosRastreio = detalhesRastreio.getObjetosRastreio();
		if (temErroGenerico(objetosRastreio)) {
			throw new CorreiosServicoSoapException(String.format("Ocorreu um erro ao fazer a chamada SOAP para os correios: %s", objetosRastreio.get(0).getDescricaoErro().get()));
		}

		return detalhesRastreio;
	}

	private boolean temErroGenerico(List<ObjetoRastreio> objetosRastreio) {
		return objetosRastreio.size() == 1 && StringUtils.equals(objetosRastreio.get(0).getNumero(), "Erro");
	}

}
