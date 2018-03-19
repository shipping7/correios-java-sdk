package br.com.correios.api.postagem.plp;

public class DestinatarioDoObjetoPlpBuilder {
	
	private String nome;
	private Endereco endereco;

	public DestinatarioDoObjetoPlpComNomeBuilder comNome(String nomeDoDestinatario) {
		this.nome = nomeDoDestinatario;
		return new DestinatarioDoObjetoPlpComNomeBuilder(this);
	}
	
	public class DestinatarioDoObjetoPlpComNomeBuilder {

		private DestinatarioDoObjetoPlpBuilder builder;

		public DestinatarioDoObjetoPlpComNomeBuilder(DestinatarioDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DestinatarioDoObjetoPlpComEnderecoBuilder comEndereco(Endereco enderecoDoDestinatario) {
			builder.endereco = enderecoDoDestinatario;
			return new DestinatarioDoObjetoPlpComEnderecoBuilder(builder);
		}
		
	}
	
	public class DestinatarioDoObjetoPlpComEnderecoBuilder {

		private DestinatarioDoObjetoPlpBuilder builder;

		public DestinatarioDoObjetoPlpComEnderecoBuilder(DestinatarioDoObjetoPlpBuilder builder) {
			this.builder = builder;
		}

		public DestinatarioDoObjetoPlp build() {
			return new DestinatarioDoObjetoPlp(builder.nome, builder.endereco);
		}
		
	}

}
