package br.com.correios.api.postagem.plp;


import br.com.correios.api.converter.Converter;
import br.com.correios.api.postagem.xml.Correioslog;
import br.com.correios.api.postagem.xml.DadosPlp;
import br.com.correios.api.postagem.xml.ObjetoPostal;
import br.com.correios.api.postagem.xml.Remetente;

public class DocumentoPlpToCorreiosLogConverter implements Converter<DocumentoPlp, Correioslog> {

	@Override
	public Correioslog convert(DocumentoPlp documentoPlp) {
		Correioslog correioslog = new Correioslog();
		DadosPlp plp = new DadosPlp();

		plp.setIdPlp(documentoPlp.getPlp().getId());


		plp.setCartaoPostagem(CARTAO_POSTAGEM);
		Remetente rementente = RemetenteBuilder.build(incompletePostageList.getSender());

		correioslog.setTipoArquivo(POSTAGEM);
		correioslog.setVersaoArquivo(VERSAO_ARQUIVO);

		correioslog.setPlp(plp);
		correioslog.setRemetente(rementente);

		for (PostageItem item : incompletePostageList.getItems()) {
			ObjetoPostal objetoPostal = ObjetoPostalBuilder.build(item);
			correioslog.getObjetoPostal().add(objetoPostal);
		}

		return correioslog;
	}

}
