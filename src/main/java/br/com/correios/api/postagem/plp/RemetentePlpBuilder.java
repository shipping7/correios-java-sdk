package br.com.correios.api.postagem.plp;

public class RemetentePlpBuilder {
	
	private String nome;
	private String email;
	private String numeroContrato;
	private String numeroDeDiretoria;
	private String codigoAdministrativo;
	private Endereco endereco;

	public RemetentePlpComNomeBuilder comNome(String nomeRemetente) {
		this.nome = nomeRemetente;
		return new RemetentePlpComNomeBuilder(this);
	}
	
	public class RemetentePlpComNomeBuilder {

		private RemetentePlpBuilder builder;

		private RemetentePlpComNomeBuilder(RemetentePlpBuilder builder) {
			this.builder = builder;
		}

		public RemetentePlpComEmailBuilder comEmail(String emailRemetente) {
			this.builder.email = emailRemetente;
			return new RemetentePlpComEmailBuilder(builder);
		}
		
	}
	
	public class RemetentePlpComEmailBuilder {

		private RemetentePlpBuilder builder;

		private RemetentePlpComEmailBuilder(RemetentePlpBuilder builder) {
			this.builder = builder;
		}

		public RemetentePlpComNumeroDeContratoBuilder comNumeroDeContrato(String numeroDeContrato) {
			this.builder.numeroContrato = numeroDeContrato;
			return new RemetentePlpComNumeroDeContratoBuilder(builder);
		}
		
	}
	
	public class RemetentePlpComNumeroDeContratoBuilder {

		private RemetentePlpBuilder builder;

		private RemetentePlpComNumeroDeContratoBuilder(RemetentePlpBuilder builder) {
			this.builder = builder;
		}

		public RemetentePlpComNumeroDeDiretoriaBuilder comNumeroDeDiretoria(String numeroDeDiretoria) {
			this.builder.numeroDeDiretoria = numeroDeDiretoria;
			return new RemetentePlpComNumeroDeDiretoriaBuilder(builder);
		}
		
	}
	
	public class RemetentePlpComNumeroDeDiretoriaBuilder {

		private RemetentePlpBuilder builder;

		private RemetentePlpComNumeroDeDiretoriaBuilder(RemetentePlpBuilder builder) {
			this.builder = builder;
		}

		public RemetentePlpComCodigoAdministrativoBuilder comCodigoAdministrativo(String codigoAdministrativo) {
			this.builder.codigoAdministrativo = codigoAdministrativo;
			return new RemetentePlpComCodigoAdministrativoBuilder(builder);
		}
		
	}
	
	public class RemetentePlpComCodigoAdministrativoBuilder {

		private RemetentePlpBuilder builder;

		private RemetentePlpComCodigoAdministrativoBuilder(RemetentePlpBuilder builder) {
			this.builder = builder;
		}

		public RemetentePlpComEnderecoBuilder comEndereco(Endereco enderecoDoRemetente) {
			this.builder.endereco = enderecoDoRemetente;
			return new RemetentePlpComEnderecoBuilder(builder);
		}
		
	}
	
	public class RemetentePlpComEnderecoBuilder {

		private RemetentePlpBuilder builder;

		private RemetentePlpComEnderecoBuilder(RemetentePlpBuilder builder) {
			this.builder = builder;
		}

		public RemetentePlp build() {
			return new RemetentePlp(builder.nome, 
									builder.email, 
									builder.numeroContrato, 
									builder.numeroDeDiretoria, 
									builder.codigoAdministrativo, 
									builder.endereco);
		}
		
	}

}
