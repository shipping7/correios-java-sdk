package br.com.correios.api.exception;

/**
 * @author Alexandre Gama
 * 
 * @description Exception utilizada quando o usuario tenta retornar um evento que nao existe, como por exemplo, o ultimo evento
 * de uma lista vazia de eventos
 */
public class EventoInexistenteException extends RuntimeException {

	private static final long serialVersionUID = -8782210155509189365L;

	public EventoInexistenteException(String mensagem) {
		super(mensagem);
	}

}
