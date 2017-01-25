package br.com.correios.api.postagem.xml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
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

	private Correioslog parseFrom(String xml) {
		try {
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(xml);

			return (Correioslog) unmarshaller.unmarshal(reader);

		} catch (JAXBException e) {
			throw new PlpException("Ocorreu um erro ao tentar fazer o Unmarshal do XML da PLP: " + xml, e);
		}
	}

	public static void main(String[] args) throws IOException {
		XmlPlpParser parser = new XmlPlpParser();

		BufferedReader reader = new BufferedReader(new FileReader("/Users/Developer/dev/correios-tracking-java-sdk/src/main/java/br/com/correios/api/postagem/xml/plp.xml"));

		String line = "";
		StringBuilder xml = new StringBuilder();
		while ((line = reader.readLine()) != null) {
			xml.append(line);
		}
		reader.close();

		System.out.println(xml.toString());
		Correioslog correioslog = parser.parseFrom(xml.toString());

		System.out.println(correioslog.getObjetoPostal().get(0).getNumeroEtiqueta());
	}
}
