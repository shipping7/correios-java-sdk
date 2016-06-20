package br.com.correios.api.service;

import static br.com.correios.api.model.CorreiosTipoIdentificador.LISTA_DE_OBJETOS;

import br.com.correios.api.converter.EventosDosCorreiosToPacoteRastreadoDetalhesConverter;
import br.com.correios.api.exception.CorreiosEventosConverterException;
import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.model.CorreiosEscopoResultado;
import br.com.correios.api.model.CorreiosIdioma;
import br.com.correios.api.model.CorreiosTipoIdentificador;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.resource.EventosDosCorreios;
import br.com.correios.webservice.resource.Rastro;
import br.com.correios.webservice.resource.Service;

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
	public PacoteRastreadoDetalhes buscaPacoteRastreadoDetalhes(String codigoDeRastreio, CorreiosIdioma idioma, CorreiosEscopoResultado resultado, CorreiosTipoIdentificador tipoIdentificador) {
		Service servicoApi = new Rastro().getServicePort();

		EventosDosCorreios eventos = null;
		try {
			eventos = servicoApi.buscaEventos(credenciais.getUsuario(), credenciais.getSenha(),
					LISTA_DE_OBJETOS.getCodigoInternoDosCorreios(),
					resultado.getCodigoInternoDosCorreios(),
					idioma.getCodigoInternoDosCorreio(),
					codigoDeRastreio);
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
