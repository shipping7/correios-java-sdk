package br.com.correios.api.postagem.plp;

import br.com.correios.Cep;

public class EnderecoBuilder {
	
	private Cep cep;
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;

	public EnderecoComCepBuilder cep(Cep cepEndereco) {
		this.cep = cepEndereco;
		return new EnderecoComCepBuilder(this);
	}
	
	public class EnderecoComCepBuilder {

		private EnderecoBuilder builder;

		private EnderecoComCepBuilder(EnderecoBuilder builder) {
			this.builder = builder;
		}

		public EnderecoComLogradouroBuilder logradouro(String logradouroEndereco) {
			builder.logradouro = logradouroEndereco;
			return new EnderecoComLogradouroBuilder(builder);
		}
		
	}
	
	public class EnderecoComLogradouroBuilder {

		private EnderecoBuilder builder;

		private EnderecoComLogradouroBuilder(EnderecoBuilder builder) {
			this.builder = builder;
		}

		public EnderecoComNumeroBuilder numero(Integer numeroEndereco) {
			this.builder.numero = numeroEndereco;
			return new EnderecoComNumeroBuilder(builder);
		}
		
	}
	
	public class EnderecoComNumeroBuilder {

		private EnderecoBuilder builder;

		private EnderecoComNumeroBuilder(EnderecoBuilder builder) {
			this.builder = builder;
		}

		public EnderecoComComplementoBuilder complemento(String complementoDoEndereco) {
			this.builder.complemento = complementoDoEndereco;
			return new EnderecoComComplementoBuilder(builder);
		}
		
	}
	
	public class EnderecoComComplementoBuilder {

		private EnderecoBuilder builder;

		private EnderecoComComplementoBuilder(EnderecoBuilder builder) {
			this.builder = builder;
		}

		public EnderecoComBairroBuilder bairro(String nomeBairro) {
			this.builder.bairro = nomeBairro;
			return new EnderecoComBairroBuilder(builder);
		}
		
	}

	public class EnderecoComBairroBuilder {

		private EnderecoBuilder builder;

		private EnderecoComBairroBuilder(EnderecoBuilder builder) {
			this.builder = builder;
		}

		public EnderecoComCidadeBuilder cidade(String nomeDaCidade) {
			this.builder.cidade = nomeDaCidade;
			return new EnderecoComCidadeBuilder(builder);
		}
		
	}
	
	public class EnderecoComCidadeBuilder {

		private EnderecoBuilder builder;

		private EnderecoComCidadeBuilder(EnderecoBuilder builder) {
			this.builder = builder;
		}

		public EnderecoComUfBuilder uf(String ufEstado) {
			this.builder.uf = ufEstado;
			return new EnderecoComUfBuilder(builder);
		}
		
	}
	
	public class EnderecoComUfBuilder {

		private EnderecoBuilder builder;

		private EnderecoComUfBuilder(EnderecoBuilder builder) {
			this.builder = builder;
		}

		public Endereco build() {
			return new Endereco(builder.cep, 
								builder.logradouro, 
								builder.numero, 
								builder.complemento, 
								builder.bairro, 
								builder.cidade, 
								builder.uf);
		}
		
	}
}
