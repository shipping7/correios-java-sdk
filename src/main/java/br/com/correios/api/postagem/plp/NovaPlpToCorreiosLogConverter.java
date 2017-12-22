package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;

import br.com.correios.api.converter.Converter;
import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado;
import br.com.correios.api.postagem.xml.Correioslog;
import br.com.correios.api.postagem.xml.DadosPlp;
import br.com.correios.api.postagem.xml.Destinatario;
import br.com.correios.api.postagem.xml.DimensaoObjeto;
import br.com.correios.api.postagem.xml.Nacional;
import br.com.correios.api.postagem.xml.ObjetoPostal;
import br.com.correios.api.postagem.xml.Remetente;
import br.com.correios.api.postagem.xml.ServicoAdicional;

public class NovaPlpToCorreiosLogConverter implements Converter<NovaPlp, Correioslog> {

	private static final String POSTAGEM = "Postagem";
	private static final String CARTAO_POSTAGEM = "";
	private static final BigDecimal VERSAO_ARQUIVO = BigDecimal.valueOf(2.3);

	@Override
	public Correioslog convert(NovaPlp novaPlp) {

		Correioslog correioslog = new Correioslog();
		correioslog.setTipoArquivo(POSTAGEM);
		correioslog.setVersaoArquivo(VERSAO_ARQUIVO);

		DadosPlp plp = new DadosPlp();
		plp.setCartaoPostagem(CARTAO_POSTAGEM);

		correioslog.setPlp(plp);

		correioslog.setRemetente(asRemetente(novaPlp.getRemetente()));

		for (ObjetoPlp objetoPlp : novaPlp.getObjetosPlp()) {
			correioslog.getObjetoPostal().add(asObjetoPostal(objetoPlp));
		}

		return correioslog;
	}

	private Remetente asRemetente(RemetentePlp remetentePlp) {
		Remetente remetente = new Remetente();

		remetente.setNomeRemetente(remetentePlp.getNome());
		remetente.setEmailRemetente(remetentePlp.getEmail());
		remetente.setNumeroContrato(remetentePlp.getNumeroContrato());
		remetente.setNumeroDiretoria(Byte.parseByte(remetentePlp.getNumeroDeDiretoria()));
		remetente.setCodigoAdministrativo(remetentePlp.getCodigoAdministrativo());

		Endereco enderecoPlp = remetentePlp.getEndereco();
		remetente.setBairroRemetente(enderecoPlp.getBairro());
		remetente.setCepRemetente(enderecoPlp.getCep().value());
		remetente.setCidadeRemetente(enderecoPlp.getCidade());
		remetente.setComplementoRemetente(enderecoPlp.getComplemento());
		remetente.setLogradouroRemetente(enderecoPlp.getLogradouro());
		remetente.setNumeroRemetente(String.valueOf(enderecoPlp.getNumero()));
		remetente.setUfRemetente(enderecoPlp.getUf());

		return remetente;
	}

	private ObjetoPostal asObjetoPostal(ObjetoPlp objetoPlp) {
		ObjetoPostal objetoPostal = new ObjetoPostal();
		Endereco endereco = objetoPlp.getDestinatarioDoObjeto().getEndereco();
		DimensoesDoObjetoPlp dimensoesDoObjeto = objetoPlp.getDimensoesDoObjeto();

		objetoPostal.setNumeroEtiqueta(objetoPlp.getNumeroDaEtiqueta());
		objetoPostal.setCodigoServicoPostagem(objetoPlp.getCodigoDeServico());
		objetoPostal.setPeso(objetoPlp.getPesoDoObjeto().emGramas().toBigInteger());

		Destinatario destinatario = new Destinatario();
		destinatario.setComplementoDestinatario(endereco.getComplemento());
		destinatario.setLogradouroDestinatario(endereco.getLogradouro());
		destinatario.setNomeDestinatario(objetoPlp.getDestinatarioDoObjeto().getNome());
		destinatario.setNumeroEndDestinatario(String.valueOf(endereco.getNumero()));

		objetoPostal.setDestinatario(destinatario);

		Nacional nacional = new Nacional();
		nacional.setBairroDestinatario(endereco.getBairro());
		nacional.setCidadeDestinatario(endereco.getCidade());
		nacional.setUfDestinatario(endereco.getUf());
		nacional.setCepDestinatario(endereco.getCep().value());

		objetoPostal.setNacional(nacional);

		ServicoAdicional servicoAdicional = new ServicoAdicional();
		objetoPlp.getCodigoServicosAdicionais().forEach(servicoAdicional::addCodigoServicoAdicional);
		objetoPlp.getValorDeclaradoParaEncomenda().ifPresent(valorDeclaradoParaEncomenda -> {
			servicoAdicional.setValorDeclarado(valorDeclaradoParaEncomenda.toEngineeringString());
		});

		objetoPostal.setServicoAdicional(servicoAdicional);

		DimensaoObjeto dimensaoObjeto = new DimensaoObjeto();

		TipoDoObjetoSendoEnviado tipoDoObjetoSendoEnviado = objetoPlp.getDimensoesDoObjeto().getTipoDoObjetoSendoEnviado();

		if(TipoDoObjetoSendoEnviado.ENVELOPE != tipoDoObjetoSendoEnviado) {
			dimensaoObjeto.setDimensaoAltura(dimensoesDoObjeto.getAltura().toEngineeringString());
			dimensaoObjeto.setDimensaoComprimento(dimensoesDoObjeto.getComprimento().toEngineeringString());
			dimensaoObjeto.setDimensaoDiametro(dimensoesDoObjeto.getDiametro().signum());
			dimensaoObjeto.setDimensaoLargura(dimensoesDoObjeto.getLargura().toEngineeringString());
		}

		dimensaoObjeto.setTipoObjeto(Short.valueOf(dimensoesDoObjeto.getTipoDoObjetoSendoEnviado().getCodigoInternoDosCorreios()));

		objetoPostal.setDimensaoObjeto(dimensaoObjeto);

		return objetoPostal;
	}

}
