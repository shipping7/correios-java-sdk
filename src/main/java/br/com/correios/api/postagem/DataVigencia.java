package br.com.correios.api.postagem;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.google.common.base.Optional;

public class DataVigencia {

	private static final String FORMATO_BRASILEIRO_DE_DATA = "dd/MM/yyyy";

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

    public Optional<String> getDataDoInicioDaVigenciaFormatada() {
    	if (this.dataDoInicioDaVigencia != null) {
    		SimpleDateFormat formatter = new SimpleDateFormat(FORMATO_BRASILEIRO_DE_DATA);

    		return Optional.of(formatter.format(dataDoInicioDaVigencia.getTime()));
		}
    	return Optional.absent();
    }

    public Optional<String> getDataDoFimDaVigenciaFormatada() {
    	if (this.dataDoFimDaVigencia != null) {
    		SimpleDateFormat formatter = new SimpleDateFormat(FORMATO_BRASILEIRO_DE_DATA);

    		return Optional.of(formatter.format(dataDoFimDaVigencia.getTime()));
    	}
    	return Optional.absent();
    }

}
