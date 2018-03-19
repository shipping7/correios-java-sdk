package br.com.correios.api.postagem.plp;

public class PlpNaoFechadaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PlpNaoFechadaException(Exception e) {
		super("Erro ao tentar fechar a PLP", e);
	}
}
