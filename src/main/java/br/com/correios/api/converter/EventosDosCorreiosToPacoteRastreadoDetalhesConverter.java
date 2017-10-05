package br.com.correios.api.converter;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.Calendar;

import br.com.correios.api.rastreio.model.Destino;
import br.com.correios.api.rastreio.model.DetalhesRastreio;
import br.com.correios.api.rastreio.model.Evento;
import br.com.correios.api.rastreio.model.LocalDoPacote;
import br.com.correios.api.rastreio.model.ObjetoRastreio;
import br.com.correios.webservice.rastreio.Destinos;
import br.com.correios.webservice.rastreio.Eventos;
import br.com.correios.webservice.rastreio.EventosDosCorreios;
import br.com.correios.webservice.rastreio.Objeto;



/**
 * Classe responsavel por converter o objeto de Eventos que sao retornado pelos Correios
 *
 * @see DetalhesRastreio
 */
public class EventosDosCorreiosToPacoteRastreadoDetalhesConverter implements Converter<EventosDosCorreios, DetalhesRastreio> {

	@Override
	public DetalhesRastreio convert(EventosDosCorreios eventosDoCorreios) {
		DetalhesRastreio detalhesRastreio = new DetalhesRastreio();
		detalhesRastreio.setQuantidade(Integer.valueOf(eventosDoCorreios.getQtd()));
		detalhesRastreio.setVersao(eventosDoCorreios.getVersao());

		for (Objeto objeto : eventosDoCorreios.getObjeto()) {
			ObjetoRastreio objetoRastreio = converteOsDadosDoPacote(objeto);

			for (Eventos eventoDoCorreio : objeto.getEvento()) {
				Evento evento = converteDadosDoLocalDoEvento(eventoDoCorreio);

				for (Destinos destino : eventoDoCorreio.getDestino()) {
					Destino destinoDoPacote = converteDestinoDoEvento(destino);
					evento.adicionaDestino(destinoDoPacote);
				}
				objetoRastreio.adicionaEvento(evento);
			}
			detalhesRastreio.adicionaObjetoRastreio(objetoRastreio);
		}

		return detalhesRastreio;
	}

	private static ObjetoRastreio converteOsDadosDoPacote(Objeto objeto) {
		ObjetoRastreio objetoRastreio = new ObjetoRastreio();

		objetoRastreio.setNumero(objeto.getNumero());
		objetoRastreio.setSigla(objeto.getSigla());
		objetoRastreio.setNome(objeto.getNome());
		objetoRastreio.setCategoria(objeto.getCategoria());
		objetoRastreio.setDescricaoErro(objeto.getErro());

		return objetoRastreio;
	}

	private static Destino converteDestinoDoEvento(Destinos destino) {
		LocalDoPacote localDoDestino = new LocalDoPacote(destino.getLocal(), destino.getCodigo(), destino.getCidade(), destino.getBairro(), destino.getUf());
		return new Destino(localDoDestino);
	}

	private static Evento converteDadosDoLocalDoEvento(Eventos eventoDoCorreios) {
		Evento evento = new Evento();
		evento.setTipo(eventoDoCorreios.getTipo());
		evento.setStatus(eventoDoCorreios.getStatus());
		evento.setHora(eventoDoCorreios.getHora());
		evento.setDescricao(eventoDoCorreios.getDescricao());
		evento.setDetalhe(eventoDoCorreios.getDetalhe());

		if (isNotBlank(eventoDoCorreios.getData())) {
			Calendar data = FormatadorData.formataComPadraoDosCorreios(eventoDoCorreios.getData());
			evento.setData(data);
		}

		LocalDoPacote localDoPacote = new LocalDoPacote(eventoDoCorreios.getLocal(), eventoDoCorreios.getCodigo(), eventoDoCorreios.getCidade(), null, eventoDoCorreios.getUf());
		evento.setLocal(localDoPacote);
		return evento;
	}

}
