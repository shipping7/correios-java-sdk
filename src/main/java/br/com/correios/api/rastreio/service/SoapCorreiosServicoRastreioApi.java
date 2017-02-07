package br.com.correios.api.rastreio.service;

import static java.util.Arrays.asList;

import java.util.List;

import br.com.correios.api.converter.EventosDosCorreiosToPacoteRastreadoDetalhesConverter;
import br.com.correios.api.exception.CorreiosEventosConverterException;
import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.rastreio.model.CorreiosEscopoResultado;
import br.com.correios.api.rastreio.model.CorreiosIdioma;
import br.com.correios.api.rastreio.model.CorreiosTipoIdentificador;
import br.com.correios.api.rastreio.model.DetalhesRastreio;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.rastreio.EventosDosCorreios;
import br.com.correios.webservice.rastreio.Rastro;
import br.com.correios.webservice.rastreio.Service;



/**
 * @author Alexandre Gama
 *
 * Classe que encapsula a chamada SOAP para os correios atraves do WSDL dos Correios
 *
 */
class SoapCorreiosServicoRastreioApi implements CorreiosServicoRastreioApi {

	private CorreiosCredenciais credenciais;

	public SoapCorreiosServicoRastreioApi(CorreiosCredenciais credenciais) {
		this.credenciais = credenciais;
	}

	@Override
	public DetalhesRastreio buscaDetalhesRastreio(String codigoDeRastreio, CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador) {
		return buscaDetalhes(idioma, resultado, tipoIdentificador, asList(codigoDeRastreio));
	}


	@Override
	public DetalhesRastreio buscaDetalhesRastreio(List<String> codigosDeRastreio, CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador) {
		return buscaDetalhes(idioma, resultado, tipoIdentificador, codigosDeRastreio);
	}

	private DetalhesRastreio buscaDetalhes(CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador, List<String> codigosDeRastreio) {
		Service servicoApi = new Rastro().getServicePort();

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

		try {
			EventosDosCorreiosToPacoteRastreadoDetalhesConverter converter = new EventosDosCorreiosToPacoteRastreadoDetalhesConverter();

			return converter.convert(eventos);
		} catch (Exception e) {
			throw new CorreiosEventosConverterException("Ocorreu um erro ao tentar converter o Evento vindo dos correios", e);
		}
	}

}
