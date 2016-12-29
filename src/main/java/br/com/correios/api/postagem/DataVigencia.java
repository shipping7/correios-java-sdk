package br.com.correios.api.postagem;

import java.util.Calendar;

public class DataVigencia {

	private Calendar dataDoFimDaVigencia;

    private Calendar dataDoInicioDaVigencia;

	public Calendar getDataDoFimDaVigencia() {
		return dataDoFimDaVigencia;
	}

	public Calendar getDataDoInicioDaVigencia() {
		return dataDoInicioDaVigencia;
	}

	public void setDataDoFimDaVigencia(Calendar dataDoFimDaVigencia) {
		this.dataDoFimDaVigencia = dataDoFimDaVigencia;
	}

	public void setDataDoInicioDaVigencia(Calendar dataDoInicioDaVigencia) {
		this.dataDoInicioDaVigencia = dataDoInicioDaVigencia;
	}

    public String getDataDoInicioDaVigenciaFormatada() {
    	return "";
    }

    public String getDataDoFimDaVigenciaFormatada() {
    	return "";
    }

}
