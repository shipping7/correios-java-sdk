package br.com.correios.api.postagem.converter;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Optional;

import br.com.correios.api.postagem.plp.DocumentoPlp;
import br.com.correios.api.postagem.plp.ObjetoPostado;
import br.com.correios.api.postagem.plp.ObjetoPostalDosCorreiosToObjetPostadoConverter;
import br.com.correios.api.postagem.plp.Plp;
import br.com.correios.api.postagem.plp.PlpDosCorreiosToPlpConverter;
import br.com.correios.api.postagem.remetente.RemetenteDaPostagem;
import br.com.correios.api.postagem.remetente.RemetenteDosCorreiosToRemetenteConverter;
import br.com.correios.api.postagem.xml.Correioslog;
import br.com.correios.api.postagem.xml.ObjetoPostal;
import br.com.correios.api.postagem.xml.Remetente;

public class CorreiosLogToPlpDocumentoConverter {

	public Optional<DocumentoPlp> convert(Correioslog correioslog) {
		br.com.correios.api.postagem.xml.Plp plpDosCorreios = correioslog.getPlp();
		if (plpDosCorreios == null) {
			return Optional.absent();
		}
		Plp plp = new PlpDosCorreiosToPlpConverter().convert(plpDosCorreios);

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
