package br.com.correios.api.postagem.xml;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.exception.ParseIncorretoNoXmlPlpException;

public class XmlPlpParser {

	private final JAXBContext jaxbContext;

	public XmlPlpParser() {
		try {
			jaxbContext = JAXBContext.newInstance(Correioslog.class);
		} catch (JAXBException e) {
			throw new ParseIncorretoNoXmlPlpException("Ocorreu um erro ao criar a instancia do JaxB Context com a classe Correioslog", e);
		}
	}

	public Optional<Correioslog> getObjectFrom(String xmlPlp) {
		return Optional.fromNullable(parseFrom(xmlPlp));
	}

	public String getXmlFrom(Correioslog correiosLog) {
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();

			StringWriter writer = new StringWriter();
			marshaller.marshal(correiosLog, writer);

			return writer.toString();

		} catch (JAXBException e) {
			throw new ParseIncorretoNoXmlPlpException("Ocorreu um erro ao tentar fazer o marshal do XML da PLP: " + correiosLog, e);
		}
	}

	private Correioslog parseFrom(String xml) {
		try {
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(xml);

			return (Correioslog) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {
			throw new ParseIncorretoNoXmlPlpException("Ocorreu um erro ao tentar fazer o unmarshal do XML da PLP: " + xml, e);
		}
	}

}
