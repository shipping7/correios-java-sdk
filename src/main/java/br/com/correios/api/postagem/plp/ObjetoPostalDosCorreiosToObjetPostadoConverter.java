package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;

import br.com.correios.api.postagem.adicional.ServicoAdicionalDosCorreiosToServicoAdicionalConverter;
import br.com.correios.api.postagem.destinatario.DestinatarioDoObjeto;
import br.com.correios.api.postagem.destinatario.DestinatarioDosCorreiosToDestinatarioConverter;
import br.com.correios.api.postagem.dimensao.DimensaoDoObjetoToDimensoesDoObjetoConverter;
import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto;
import br.com.correios.api.postagem.xml.ObjetoPostal;

public class ObjetoPostalDosCorreiosToObjetPostadoConverter {

	public ObjetoPostado convert(ObjetoPostal objeto) {
		MedidasDoObjetoPostado medidasDoObjeto = new MedidasDoObjetoPostado(new BigDecimal(objeto.getCubagem()), new BigDecimal(objeto.getPeso()));

		ObservacoesDoCliente observacoesDoCliente = new ObservacoesDoCliente(objeto.getRt1(), objeto.getRt2());

		DestinatarioDoObjeto destinatario = new DestinatarioDosCorreiosToDestinatarioConverter().convert(objeto.getDestinatario());

		DadosDeEntrega dadosDeEntrega = new ObjetoToDadosDeEntregaConverter().convert(objeto);

		ServicoAdicionalDoObjeto servicoAdicional = new ServicoAdicionalDosCorreiosToServicoAdicionalConverter().convert(objeto.getServicoAdicional());

		DimensoesDoObjeto dimensoesDoObjeto = new DimensaoDoObjetoToDimensoesDoObjetoConverter().convert(objeto.getDimensaoObjeto());

		StatusProcessamento statusDeProcessamento = StatusProcessamento.aPartirDo(objeto.getStatusProcessamento());

		ObjetoPostado objetoPostado = new ObjetoPostado(objeto.getNumeroEtiqueta(), objeto.getCodigoObjetoCliente(), objeto.getCodigoServicoPostagem(), medidasDoObjeto,
				observacoesDoCliente, destinatario, dadosDeEntrega, servicoAdicional, dimensoesDoObjeto, objeto.getDataPostagemSara(),
				statusDeProcessamento, objeto.getNumeroComprovantePostagem(), objeto.getValorCobrado());

		return objetoPostado;
	}

}
