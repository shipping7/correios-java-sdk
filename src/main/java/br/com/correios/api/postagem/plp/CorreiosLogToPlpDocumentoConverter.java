package br.com.correios.api.postagem.plp;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.remetente.RemetenteDaPostagem;
import br.com.correios.api.postagem.remetente.RemetenteDosCorreiosToRemetenteConverter;
import br.com.correios.api.postagem.xml.Correioslog;
import br.com.correios.api.postagem.xml.DadosPlp;
import br.com.correios.api.postagem.xml.ObjetoPostal;
import br.com.correios.api.postagem.xml.Remetente;

public class CorreiosLogToPlpDocumentoConverter {

	public Optional<DocumentoPlp> convert(Correioslog correioslog) {
		DadosPlp plpDosCorreios = correioslog.getPlp();
		if (plpDosCorreios == null) {
			return Optional.absent();
		}
		InformacoesPlp plp = new PlpDosCorreiosToPlpConverter().convert(plpDosCorreios);

		Remetente remetenteDosCorreios = correioslog.getRemetente();
		RemetenteDaPostagem remetente = null;
		if (remetenteDosCorreios != null) {
			remetente = new RemetenteDosCorreiosToRemetenteConverter().convert(remetenteDosCorreios);
		}

		List<ObjetoPostado> listaDeObjetosPostados = new ArrayList<>();
		for (ObjetoPostal objeto: correioslog.getObjetoPostal()) {
			ObjetoPostado objetoPostado = new ObjetoPostalDosCorreiosToObjetPostadoConverter().convert(objeto);

			listaDeObjetosPostados.add(objetoPostado);
		}

		DocumentoPlp documentoPlp = new DocumentoPlp(correioslog.getTipoArquivo(), correioslog.getVersaoArquivo(), plp, remetente, correioslog.getFormaPagamento(), listaDeObjetosPostados);

		return Optional.of(documentoPlp);
	}

}
