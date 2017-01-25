package br.com.correios.api.postagem.adicional;

import java.util.Calendar;

public class ServicoAdicional {

	private Integer id;

    private String codigo;

    private Calendar dataAtualizacao;

    private String descricao;

    private String sigla;

    private ServicoAdicional() {}

    public Integer getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public static ServicoAdicionalBuilder novoServico() {
    	return new ServicoAdicionalBuilder();
    }

    public static class ServicoAdicionalBuilder {

    	private ServicoAdicional servicoAdicional;

    	public ServicoAdicionalBuilder() {
    		this.servicoAdicional = new ServicoAdicional();
		}

    	public ServicoAdicionalBuilder comId(Integer id) {
    		this.servicoAdicional.id = id;
    		return this;
    	}

    	public ServicoAdicionalBuilder comCodigo(String codigo) {
    		this.servicoAdicional.codigo = codigo;
    		return this;
    	}

    	public ServicoAdicionalBuilder comDataDeAtualizacao(Calendar data) {
    		this.servicoAdicional.dataAtualizacao = data;
    		return this;
    	}

    	public ServicoAdicionalBuilder comDescricao(String descricao) {
    		this.servicoAdicional.descricao = descricao;
    		return this;
    	}

    	public ServicoAdicionalBuilder deSigla(String sigla) {
    		this.servicoAdicional.sigla = sigla;
    		return this;
    	}
    }

}
