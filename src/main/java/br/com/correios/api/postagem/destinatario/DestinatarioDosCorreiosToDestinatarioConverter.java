package br.com.correios.api.postagem.destinatario;

import br.com.correios.api.postagem.xml.Destinatario;

public class DestinatarioDosCorreiosToDestinatarioConverter {

	public DestinatarioDoObjeto convert(Destinatario destinatario) {
		DadosDeContatoDoDestinatario contatosDoDestinatario = new DadosDeContatoDoDestinatario(
				destinatario.getEmailDestinatario(), destinatario.getTelefoneDestinatario(),
				destinatario.getCelularDestinatario());

		EnderecoDoDestinatario endereco = new EnderecoDoDestinatario(destinatario.getLogradouroDestinatario(),
				destinatario.getComplementoDestinatario(), destinatario.getNumeroEndDestinatario());

		DestinatarioDoObjeto destinatarioDoObjeto = new DestinatarioDoObjeto(destinatario.getNomeDestinatario(),
				contatosDoDestinatario, endereco);

		return destinatarioDoObjeto;
	}

}
