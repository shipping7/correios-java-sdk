package br.com.correios.api.postagem.webservice;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import br.com.correios.webservice.postagem.AtendeCliente;
import br.com.correios.webservice.postagem.AtendeClienteService;

public class CorreiosClienteWebService implements CorreiosClienteApi {

	private static final String SERVICE_NAME_LOCATION = "http://cliente.bean.master.sigep.bsb.correios.com.br/";

	private static final String PRODUCTION_WSDL_ADDRESS = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl";

	private AtendeCliente correiosWebService;

	public CorreiosClienteWebService() {
		URL url;
		try {
			url = new URL(PRODUCTION_WSDL_ADDRESS);
			QName qName = new QName(SERVICE_NAME_LOCATION, "AtendeClienteService");

			correiosWebService = new AtendeClienteService(url, qName).getAtendeClientePort();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public AtendeCliente getCorreiosWebService() {
		return correiosWebService;
	}

}
