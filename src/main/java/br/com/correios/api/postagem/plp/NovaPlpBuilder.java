package br.com.correios.api.postagem.plp;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import br.com.correios.api.postagem.CorreiosServicoPostagemAPI;

public class NovaPlpBuilder {

	private String cartaoDePostagem;
	private RemetentePlp remetente;
	private Set<ObjetoPlp> objetosPlp;
	private Long codigoPlpCliente = 0l;
	private CorreiosServicoPostagemAPI correiosServicoPostagemAPI;

	public NovaPlpBuilder(CorreiosServicoPostagemAPI correiosServicoPostagemAPI) {
		this.correiosServicoPostagemAPI = correiosServicoPostagemAPI;
	}

	public NovaPlpComCartaoDePostagemBuilder comCartaoDePostagem(String cartaoDePostagem) {
		this.cartaoDePostagem = cartaoDePostagem;
		return new NovaPlpComCartaoDePostagemBuilder(this);
	}

	public class NovaPlpComCartaoDePostagemBuilder {

		private NovaPlpBuilder builder;

		public NovaPlpComCartaoDePostagemBuilder(NovaPlpBuilder builder) {
			this.builder = builder;
		}

		public NovaPlpComRemetenteBuilder deRemetente(RemetentePlp remetente) {
			builder.remetente = remetente;
			return new NovaPlpComRemetenteBuilder(builder);
		}

	}

	public class NovaPlpComRemetenteBuilder {

		private NovaPlpBuilder builder;

		private NovaPlpComRemetenteBuilder(NovaPlpBuilder builder) {
			this.builder = builder;
		}

		public NovaPlpComObjetoAdicionadoBuilder adicionandoObjeto(ObjetoPlp objetoPlp) {
			builder.objetosPlp = newHashSet(objetoPlp);
			return new NovaPlpComObjetoAdicionadoBuilder(builder);
		}

		public NovaPlpComObjetoAdicionadoBuilder adicionandoObjetos(Set<ObjetoPlp> objetosPlp) {
			builder.objetosPlp = objetosPlp;
			return new NovaPlpComObjetoAdicionadoBuilder(builder);
		}

	}

	public class NovaPlpComObjetoAdicionadoBuilder {

		private NovaPlpBuilder builder;

		private NovaPlpComObjetoAdicionadoBuilder(NovaPlpBuilder builder) {
			this.builder = builder;
		}

		public NovaPlpComObjetoAdicionadoBuilder adicionandoObjeto(ObjetoPlp objetoPlp) {
			builder.objetosPlp.add(objetoPlp);
			return new NovaPlpComObjetoAdicionadoBuilder(builder);
		}

		public NovaPlpComObjetoAdicionadoBuilder comCodigoPlpCliente(Long codigoPlpCliente) {
			builder.codigoPlpCliente = codigoPlpCliente;
			return this;
		}

		public Plp fechaPlp() {
			return correiosServicoPostagemAPI.fechaPlp(cartaoDePostagem, codigoPlpCliente, new NovaPlp(builder.remetente, builder.objetosPlp));
		}

	}


}
