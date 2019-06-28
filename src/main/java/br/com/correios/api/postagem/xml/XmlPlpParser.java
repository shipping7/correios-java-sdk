package br.com.correios.api.postagem.xml;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.exception.PlpException;

public class XmlPlpParser {

	private final JAXBContext jaxbContext;

	public XmlPlpParser() {
		try {
			jaxbContext = JAXBContext.newInstance(Correioslog.class);
		} catch (JAXBException e) {
			throw new PlpException("Ocorreu um erro ao criar a instancia do JaxB Context com a classe Correioslog", e);
		}
	}

	public Optional<Correioslog> convert(String xmlPlp) {
		Correioslog correiosLog = parseFrom(xmlPlp);

		return Optional.fromNullable(correiosLog);
	}

	public String convert(Correioslog correioslog) {
		return parseFrom(correioslog);
	}

	private Correioslog parseFrom(String xml) {
		try {
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(xml);

			return (Correioslog) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {
			throw new PlpException("Ocorreu um erro ao tentar fazer o Unmarshal do XML da PLP: " + xml, e);
		}
	}

	private String parseFrom(Correioslog correioslog) {
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter sw = new StringWriter();
			marshaller.marshal(correioslog, sw);

			return sw.toString();

		} catch (JAXBException e) {
			throw new PlpException("Ocorreu um erro ao tentar fazer o Marshal do objeto para XML", e);
		}
	}

}
