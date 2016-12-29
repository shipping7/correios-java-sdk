package br.com.correios.api.postagem;

import java.util.Calendar;
import java.util.List;

public class ServicoCorreio {

	private Long id;

    private String codigo;

    private Calendar dataAtualizacao;

    private String descricao;

    private ServicoCorreioSigep servicoSigep;

    private List<ServicoAdicional> servicosAdicionais;

    private ServicoCorreioTipo tipo1;

    private ServicoCorreioTipo tipo2;

    private DataVigencia vigencia;

    private ServicoCorreio() {}

    public Long getId() {
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

	public ServicoCorreioSigep getServicoSigep() {
		return servicoSigep;
	}

	public List<ServicoAdicional> getServicosAdicionais() {
		return servicosAdicionais;
	}

	public ServicoCorreioTipo getTipo1() {
		return tipo1;
	}

	public ServicoCorreioTipo getTipo2() {
		return tipo2;
	}

	public DataVigencia getVigencia() {
		return vigencia;
	}

	public static ServicoCorreioBuilder novoServico() {
    	return new ServicoCorreioBuilder();
    }

    public static class ServicoCorreioBuilder {

    	private ServicoCorreio servicoCorreio;

    	public ServicoCorreioBuilder() {
    		this.servicoCorreio = new ServicoCorreio();
		}

    	public ServicoCorreioBuilder comId(Long id) {
    		this.servicoCorreio.id = id;
    		return this;
    	}

    	public ServicoCorreioBuilder comCodigo(String codigo) {
    		this.servicoCorreio.codigo = codigo;
    		return this;
    	}

    	public ServicoCorreioBuilder atualizadoNaData(Calendar dataDeAtualizacao) {
    		this.servicoCorreio.dataAtualizacao = dataDeAtualizacao;
    		return this;
    	}

    	public ServicoCorreioBuilder comDescricao(String descricao) {
    		this.servicoCorreio.descricao = descricao;
    		return this;
    	}

    	public ServicoCorreioBuilder usandoOServicoDoSigep(ServicoCorreioSigep servico) {
    		this.servicoCorreio.servicoSigep = servico;
    		return this;
    	}

    	public ServicoCorreioBuilder usandoOsServicosAdicionais(List<ServicoAdicional> servicosAdicionais) {
    		this.servicoCorreio.servicosAdicionais = servicosAdicionais;
    		return this;
    	}

    	public ServicoCorreioBuilder usandoServicoTipo1(ServicoCorreioTipo tipo1) {
    		this.servicoCorreio.tipo1 = tipo1;
    		return this;
    	}

    	public ServicoCorreioBuilder usandoServicoTipo2(ServicoCorreioTipo tipo2) {
    		this.servicoCorreio.tipo2 = tipo2;
    		return this;
    	}

    	public ServicoCorreioBuilder comVigencia(DataVigencia vigencia) {
    		this.servicoCorreio.vigencia = vigencia;
    		return this;
    	}

		public ServicoCorreio build() {
			return this.servicoCorreio;
		}

    }


}
