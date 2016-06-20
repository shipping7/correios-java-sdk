package br.com.correios.api.converter;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.correios.api.exception.DataInvalidaDoEventoException;
import br.com.correios.api.model.Destino;
import br.com.correios.api.model.Evento;
import br.com.correios.api.model.LocalDoPacote;
import br.com.correios.api.service.PacoteRastreadoDetalhes;
import br.com.correios.webservice.resource.Destinos;
import br.com.correios.webservice.resource.Eventos;
import br.com.correios.webservice.resource.EventosDosCorreios;
import br.com.correios.webservice.resource.Objeto;

/**
 * @author Alexandre Gama
 * 
 * Classe responsavel por converter o objeto de Eventos que é retornado pelos Correios para o objeto @see PacoteRastreadoDetalhes
 */
public class EventosDosCorreiosToPacoteRastreadoDetalhesConverter implements Converter<EventosDosCorreios, PacoteRastreadoDetalhes> {

	@Override
	public PacoteRastreadoDetalhes convert(EventosDosCorreios eventosDoCorreios) {
		PacoteRastreadoDetalhes pacoteRastreado = new PacoteRastreadoDetalhes();
		pacoteRastreado.setQuantidade(Integer.valueOf(eventosDoCorreios.getQtd()));
		pacoteRastreado.setVersao(eventosDoCorreios.getVersao());

		for (Objeto objeto : eventosDoCorreios.getObjeto()) {
			converteOsDadosDoPacote(pacoteRastreado, objeto);

			for (Eventos eventoDoCorreio : objeto.getEvento()) {
				Evento evento = converteDadosDoLocalDoEvento(eventoDoCorreio);
				for (Destinos destino : eventoDoCorreio.getDestino()) {
					converteDestinoDoEvento(evento, destino);
				}
				pacoteRastreado.adicionaEvento(evento);
			}
		}
		return pacoteRastreado;
	}

	private void converteOsDadosDoPacote(PacoteRastreadoDetalhes pacoteRastreado, Objeto objeto) {
		pacoteRastreado.setNumero(objeto.getNumero());
		pacoteRastreado.setSigla(objeto.getSigla());
		pacoteRastreado.setNome(objeto.getNome());
		pacoteRastreado.setCategoria(objeto.getCategoria());
	}

	private void converteDestinoDoEvento(Evento evento, Destinos destino) {
		LocalDoPacote localDoDestino = new LocalDoPacote(destino.getLocal(), destino.getCodigo(), destino.getCidade(), destino.getBairro(), destino.getUf());
		Destino destinoDoPacote = new Destino(localDoDestino);
		evento.adicionaDestino(destinoDoPacote);
	}

	private Evento converteDadosDoLocalDoEvento(Eventos eventoDoCorreio) {
		Evento evento = new Evento();
		evento.setTipo(eventoDoCorreio.getTipo());
		evento.setStatus(eventoDoCorreio.getStatus());
		evento.setHora(eventoDoCorreio.getHora());
		evento.setDescricao(eventoDoCorreio.getDescricao());

		if (isNotBlank(eventoDoCorreio.getData())) {
			converteData(eventoDoCorreio, evento);
		}

		LocalDoPacote localDoPacote = new LocalDoPacote(eventoDoCorreio.getLocal(), eventoDoCorreio.getCodigo(), eventoDoCorreio.getCidade(), null, eventoDoCorreio.getUf());
		evento.setLocal(localDoPacote);
		return evento;
	}

	private void converteData(Eventos eventoDoCorreio, Evento evento) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		try {
			date = formatador.parse(eventoDoCorreio.getData());
			Calendar dataDoEvento = Calendar.getInstance();
			dataDoEvento.setTime(date);
			evento.setData(dataDoEvento);
		} catch (ParseException e) {
			throw new DataInvalidaDoEventoException(String.format("A seguinte data retornada pelo correios é inválida: %s", eventoDoCorreio.getData()));
		}
	}

}
