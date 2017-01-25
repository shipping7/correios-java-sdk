package br.com.correios.api.postagem.plp;

import br.com.correios.api.postagem.xml.Nacional;
import br.com.correios.api.postagem.xml.ObjetoPostal;

public class ObjetoToDadosDeEntregaConverter {

	public DadosDeEntrega convert(ObjetoPostal objeto) {
		Nacional nacional = objeto.getNacional();
		EnderecoDeEntrega enderecoDeEntrega = null;
		NotaFiscal notaFiscal = null;
		if (nacional != null) {
			enderecoDeEntrega = new EnderecoDeEntrega(nacional.getBairroDestinatario(), nacional.getCidadeDestinatario(), nacional.getUfDestinatario(), nacional.getCepDestinatario());

			notaFiscal = new NotaFiscal(nacional.getNumeroNotaFiscal(), nacional.getSerieNotaFiscal(), nacional.getValorNotaFiscal(), nacional.getNaturezaNotaFiscal());
		}

		DadosDeEntrega dadosDeEntrega = new DadosDeEntrega(enderecoDeEntrega, nacional.getCodigoUsuarioPostal(), nacional.getCentroCustoCliente(), notaFiscal, nacional.getDescricaoObjeto(), nacional.getValorACobrar());

		return dadosDeEntrega;
	}

}
