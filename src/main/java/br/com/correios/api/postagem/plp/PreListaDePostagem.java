package br.com.correios.api.postagem.plp;

import java.util.Calendar;

import br.com.correios.webservice.postagem.StatusPlp;

public class PreListaDePostagem {

	private Calendar dataDeAtualizacaoCliente;

	private Calendar dataDaAtualizacaoNoSistemaSara;

	private Calendar dataDeFechamento;

	private Calendar dataDaPostagem;

	private Calendar dataDaPostagemNoSistemaSara;

    private long plpCliente;

    private long plpNu;

    private StatusDaPlp status;

    public PreListaDePostagem(Calendar dataDeAtualizacaoCliente, Calendar dataDaAtualizacaoNoSistemaSara,
			Calendar dataDeFechamento, Calendar dataDaPostagem, Calendar dataDaPostagemNoSistemaSara, long plpCliente,
			long plpNu, StatusDaPlp status) {
		this.dataDeAtualizacaoCliente = dataDeAtualizacaoCliente;
		this.dataDaAtualizacaoNoSistemaSara = dataDaAtualizacaoNoSistemaSara;
		this.dataDeFechamento = dataDeFechamento;
		this.dataDaPostagem = dataDaPostagem;
		this.dataDaPostagemNoSistemaSara = dataDaPostagemNoSistemaSara;
		this.plpCliente = plpCliente;
		this.plpNu = plpNu;
		this.status = status;
	}

	public enum StatusDaPlp {
    	ABERTA, FECHADA, POSTADA;

		public static StatusDaPlp from(StatusPlp status) {
			if (status.equals(StatusPlp.ABERTA)) {
				return ABERTA;
			} else if (status.equals(StatusPlp.FECHADA)) {
				return FECHADA;
			} else if (status.equals(StatusPlp.POSTADA)) {
				return POSTADA;
			}
			throw new IllegalArgumentException("O status enviado pelos Correios é inválido ou não existe");
		}
    }

	public Calendar getDataDeAtualizacaoCliente() {
		return dataDeAtualizacaoCliente;
	}

	public Calendar getDataDaAtualizacaoNoSistemaSara() {
		return dataDaAtualizacaoNoSistemaSara;
	}

	public Calendar getDataDeFechamento() {
		return dataDeFechamento;
	}

	public Calendar getDataDaPostagem() {
		return dataDaPostagem;
	}

	public Calendar getDataDaPostagemNoSistemaSara() {
		return dataDaPostagemNoSistemaSara;
	}

	public long getPlpCliente() {
		return plpCliente;
	}

	public long getPlpNu() {
		return plpNu;
	}

	public StatusDaPlp getStatus() {
		return status;
	}

}
