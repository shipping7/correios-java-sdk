package br.com.correios.api.postagem;

import java.util.Calendar;
import java.util.List;

public class GerenteDeConta {

    private List<ClienteContrato> clientesVisiveis;

    private Calendar dataAtualizacao;

    private Calendar dataInclusao;

    private Calendar dataSenha;

    private String login;

    private String matricula;

    private String senha;

    private StatusDeAtivacao status;

    private TipoContaGerenciada tipoDeContaGerenciada;

    private String validade;

    public enum StatusDeAtivacao {
    	ATIVO, INATIVO;
    }

    public enum TipoContaGerenciada {
    	CONTA_SIMPLES, CONTA_MASTER;
    }

    public List<ClienteContrato> getClientesVisiveis() {
		return clientesVisiveis;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	public Calendar getDataInclusao() {
		return dataInclusao;
	}

	public Calendar getDataSenha() {
		return dataSenha;
	}

	public String getLogin() {
		return login;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getSenha() {
		return senha;
	}

	public StatusDeAtivacao getStatus() {
		return status;
	}

	public TipoContaGerenciada getTipoDeContaGerenciada() {
		return tipoDeContaGerenciada;
	}

	public String getValidade() {
		return validade;
	}

	public static GerenteDeContaBuilder novoGerente() {
    	return new GerenteDeContaBuilder();
    }

    public static class GerenteDeContaBuilder {

    	private GerenteDeConta gerente;

    	public GerenteDeContaBuilder() {
    		this.gerente = new GerenteDeConta();
		}

    	public GerenteDeContaBuilder comClientes(List<ClienteContrato> clientesVisiveisAoGerente) {
    		this.gerente.clientesVisiveis = clientesVisiveisAoGerente;
    		return this;
    	}

    	public GerenteDeContaBuilder atualizadoNaData(Calendar data) {
    		this.gerente.dataAtualizacao = data;
    		return this;
    	}

    	public GerenteDeContaBuilder inclusoNaData(Calendar data) {
    		this.gerente.dataInclusao = data;
    		return this;
    	}

    	public GerenteDeContaBuilder comSenhaNaData(Calendar data) {
    		this.gerente.dataSenha = data;
    		return this;
    	}

    	public GerenteDeContaBuilder comLogin(String login) {
    		this.gerente.login = login;
    		return this;
    	}

    	public GerenteDeContaBuilder comSenha(String senha) {
    		this.gerente.senha = senha;
    		return this;
    	}

    	public GerenteDeContaBuilder comStatus(StatusDeAtivacao status) {
    		this.gerente.status = status;
    		return this;
    	}

    	public GerenteDeContaBuilder gerenciandoContasDoTipo(TipoContaGerenciada tipoDeConta) {
    		this.gerente.tipoDeContaGerenciada = tipoDeConta;
    		return this;
    	}

    	public GerenteDeContaBuilder comValidadeAte(String validade) {
    		this.gerente.validade = validade;
    		return this;
    	}

    	public GerenteDeContaBuilder comMatricula(String matricula) {
    		this.gerente.matricula = matricula;
    		return this;
    	}

    	public GerenteDeConta build() {
    		return this.gerente;
    	}

    }

}
