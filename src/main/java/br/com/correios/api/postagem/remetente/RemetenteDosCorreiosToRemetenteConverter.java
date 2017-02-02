package br.com.correios.api.postagem.remetente;

import br.com.correios.api.postagem.xml.Remetente;

public class RemetenteDosCorreiosToRemetenteConverter {

	public RemetenteDaPostagem convert(Remetente remetenteDosCorreios) {
		DadosDeContatoDoRemetente dadosDeContato = new DadosDeContatoDoRemetente(remetenteDosCorreios.getTelefoneRemetente(), remetenteDosCorreios.getFaxRemetente(), remetenteDosCorreios.getEmailRemetente());

		EnderecoDoRemetente enderecoDoRemetente = new EnderecoDoRemetente(remetenteDosCorreios.getLogradouroRemetente(), remetenteDosCorreios.getNumeroRemetente(), remetenteDosCorreios.getComplementoRemetente(),
				remetenteDosCorreios.getBairroRemetente(), remetenteDosCorreios.getCepRemetente(), remetenteDosCorreios.getCidadeRemetente(), remetenteDosCorreios.getUfRemetente());

		RemetenteDaPostagem remetente = new RemetenteDaPostagem(remetenteDosCorreios.getNumeroContrato(), remetenteDosCorreios.getNumeroDiretoria(), remetenteDosCorreios.getCodigoAdministrativo(),
				remetenteDosCorreios.getNomeRemetente(), dadosDeContato, enderecoDoRemetente);

		return remetente;
	}

}
