package br.com.correios.api.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import br.com.correios.api.model.Evento;
import br.com.correios.api.model.LocalDoPacote;
import br.com.correios.api.service.PacoteRastreadoDetalhes;
import br.com.correios.webservice.resource.Destinos;
import br.com.correios.webservice.resource.Eventos;
import br.com.correios.webservice.resource.EventosDosCorreios;
import br.com.correios.webservice.resource.Objeto;

public class EventosDosCorreiosToPacoteRastreadoDetalhesConverterTest {

	@Test
	public void deveriaConverterAsInformacoesBasicasDeEventosDosCorreiosParaUmObjetoPacoteRastreadoDetalhes() throws Exception {
		EventosDosCorreios eventosDosCorreios = new EventosDosCorreios();
		eventosDosCorreios.setQtd("12");
		eventosDosCorreios.setVersao("1");
		
		EventosDosCorreiosToPacoteRastreadoDetalhesConverter converter = new EventosDosCorreiosToPacoteRastreadoDetalhesConverter();
		PacoteRastreadoDetalhes pacoteRastreado = converter.convert(eventosDosCorreios);
		
		assertThat(pacoteRastreado.getQuantidade()).isEqualTo(12);
		assertThat(pacoteRastreado.getVersao()).isEqualTo("1");
	}
	
	@Test
	public void deveriaConverterAsInformacoesDeObjetoDeEventosDosCorreiosParaUmObjetoPacoteRastreadoDetalhes() throws Exception {
		EventosDosCorreios eventosDosCorreios = new EventosDosCorreios();
		eventosDosCorreios.setQtd("12");
		eventosDosCorreios.setVersao("1");
		
		Objeto primeiroObjeto = new Objeto();
		primeiroObjeto.setCategoria("E-SEDEX");
		primeiroObjeto.setNome("Encomenda E-SEDEX");
		primeiroObjeto.setNumero("123456789");
		primeiroObjeto.setSigla("DU");
		
		eventosDosCorreios.getObjeto().add(primeiroObjeto);
		
		EventosDosCorreiosToPacoteRastreadoDetalhesConverter converter = new EventosDosCorreiosToPacoteRastreadoDetalhesConverter();
		PacoteRastreadoDetalhes pacoteRastreado = converter.convert(eventosDosCorreios);
		
		assertThat(pacoteRastreado.getCategoria()).isEqualTo("E-SEDEX");
		assertThat(pacoteRastreado.getNome()).isEqualTo("Encomenda E-SEDEX");
		assertThat(pacoteRastreado.getNumero()).isEqualTo("123456789");
		assertThat(pacoteRastreado.getSigla()).isEqualTo("DU");
	}

	@Test
	public void deveriaConverterOsDadosDosEventosEmUmObjetoContendoOLocalDosEventos() throws Exception {
		EventosDosCorreios eventosDosCorreios = new EventosDosCorreios();
		eventosDosCorreios.setQtd("12");
		eventosDosCorreios.setVersao("1");
		
		Objeto objetoRastreado = new Objeto();
		objetoRastreado.setCategoria("E-SEDEX");
		objetoRastreado.setNome("Encomenda E-SEDEX");
		objetoRastreado.setNumero("123456789");
		objetoRastreado.setSigla("DU");
		
		Eventos eventos = new Eventos();
		eventos.setTipo("BDE");
		eventos.setStatus("01");
		eventos.setHora("02:30");
		eventos.setDescricao("Objeto entregue ao destinatário");
		String dataNoFormatoDosCorreios = "15/06/2016";
		eventos.setData(dataNoFormatoDosCorreios);
		objetoRastreado.getEvento().add(eventos);
		eventosDosCorreios.getObjeto().add(objetoRastreado);
		
		EventosDosCorreiosToPacoteRastreadoDetalhesConverter converter = new EventosDosCorreiosToPacoteRastreadoDetalhesConverter();
		PacoteRastreadoDetalhes pacoteRastreado = converter.convert(eventosDosCorreios);
		
		Evento eventoConvertido = pacoteRastreado.getPrimeiroEvento();
		
		Calendar dataEsperada = Calendar.getInstance();
		dataEsperada.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(dataNoFormatoDosCorreios));
		
		assertThat(pacoteRastreado.getQuantidadeDeEventosOcorridos()).isEqualTo(1);
		assertThat(eventoConvertido.getTipo()).isEqualTo("BDE");
		assertThat(eventoConvertido.getStatus()).isEqualTo("01");
		assertThat(eventoConvertido.getHora()).isEqualTo("02:30");
		assertThat(eventoConvertido.getDescricao()).isEqualTo("Objeto entregue ao destinatário");
		assertThat(eventoConvertido.getData()).isEqualTo(dataEsperada);
	}
	
	@Test
	public void deveriaConverterOsDadosDosEventosEmUmObjetoContendoODestinoDosEventos() throws Exception {
		EventosDosCorreios eventosDosCorreios = new EventosDosCorreios();
		eventosDosCorreios.setQtd("12");
		eventosDosCorreios.setVersao("1");
		
		Objeto objetoRastreado = new Objeto();
		objetoRastreado.setCategoria("E-SEDEX");
		objetoRastreado.setNome("Encomenda E-SEDEX");
		objetoRastreado.setNumero("123456789");
		objetoRastreado.setSigla("DU");
		
		Eventos eventos = new Eventos();
		eventos.setTipo("BDE");
		eventos.setStatus("01");
		eventos.setHora("02:30");
		eventos.setDescricao("Objeto entregue ao destinatário");
		eventos.setData("15/06/2016");
		
		Destinos destinoDosCorreios = new Destinos();
		destinoDosCorreios.setLocal("Rua Beira Rio");
		destinoDosCorreios.setCodigo("123456");
		destinoDosCorreios.setCidade("Sao Paulo");
		destinoDosCorreios.setBairro("Vila Olimpia");
		destinoDosCorreios.setUf("SP");
		
		objetoRastreado.getEvento().add(eventos);
		eventosDosCorreios.getObjeto().add(objetoRastreado);
		eventos.getDestino().add(destinoDosCorreios);
		
		EventosDosCorreiosToPacoteRastreadoDetalhesConverter converter = new EventosDosCorreiosToPacoteRastreadoDetalhesConverter();
		PacoteRastreadoDetalhes pacoteRastreado = converter.convert(eventosDosCorreios);
		
		LocalDoPacote localDoDestino = pacoteRastreado.getPrimeiroEvento().getPrimeiroDestino().getLocal();
		
		assertThat(pacoteRastreado.getQuantidadeDeEventosOcorridos()).isEqualTo(1);
		assertThat(localDoDestino.getNome()).isEqualTo("Rua Beira Rio");
		assertThat(localDoDestino.getCodigo()).isEqualTo("123456");
		assertThat(localDoDestino.getBairro()).isEqualTo("Vila Olimpia");
		assertThat(localDoDestino.getUf()).isEqualTo("SP");
	}

	@Test
	public void deveriaConverterMaisDeUmEventoEmUmaListaDeEventosNoPacoteRastreado() throws Exception {
		EventosDosCorreios eventosDosCorreios = new EventosDosCorreios();
		eventosDosCorreios.setQtd("12");
		eventosDosCorreios.setVersao("1");
		
		Objeto objetoRastreado = new Objeto();
		objetoRastreado.setCategoria("E-SEDEX");
		objetoRastreado.setNome("Encomenda E-SEDEX");
		objetoRastreado.setNumero("123456789");
		objetoRastreado.setSigla("DU");
		
		Eventos primeiroEvento = new Eventos();
		primeiroEvento.setTipo("BDE");
		primeiroEvento.setStatus("01");
		primeiroEvento.setHora("02:30");
		primeiroEvento.setDescricao("Objeto entregue ao destinatário");
		primeiroEvento.setData("15/06/2016");
		
		Eventos segundoEvento = new Eventos();
		segundoEvento.setTipo("BDE");
		segundoEvento.setStatus("01");
		segundoEvento.setHora("02:30");
		segundoEvento.setDescricao("Objeto entregue ao destinatário");
		segundoEvento.setData("15/06/2016");
		
		objetoRastreado.getEvento().add(primeiroEvento);
		objetoRastreado.getEvento().add(segundoEvento);
		eventosDosCorreios.getObjeto().add(objetoRastreado);
		
		EventosDosCorreiosToPacoteRastreadoDetalhesConverter converter = new EventosDosCorreiosToPacoteRastreadoDetalhesConverter();
		PacoteRastreadoDetalhes pacoteRastreado = converter.convert(eventosDosCorreios);
		
		assertThat(pacoteRastreado.getQuantidadeDeEventosOcorridos()).isEqualTo(2);
	}
}
