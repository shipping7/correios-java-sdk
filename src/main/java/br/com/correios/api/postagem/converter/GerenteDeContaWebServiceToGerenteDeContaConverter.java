package br.com.correios.api.postagem.converter;

import static br.com.correios.api.postagem.gerente.GerenteDeConta.StatusDeAtivacao.ATIVO;
import static br.com.correios.api.postagem.gerente.GerenteDeConta.StatusDeAtivacao.INATIVO;
import static br.com.correios.api.postagem.gerente.GerenteDeConta.TipoContaGerenciada.CONTA_MASTER;
import static br.com.correios.api.postagem.gerente.GerenteDeConta.TipoContaGerenciada.CONTA_SIMPLES;
import static br.com.correios.webservice.postagem.TipoGerente.GERENTE_CONTA;
import static br.com.correios.webservice.postagem.TipoGerente.GERENTE_CONTA_MASTER;

import java.util.Calendar;

import br.com.correios.api.postagem.gerente.GerenteDeConta;
import br.com.correios.api.postagem.gerente.GerenteDeConta.StatusDeAtivacao;
import br.com.correios.api.postagem.gerente.GerenteDeConta.TipoContaGerenciada;
import br.com.correios.webservice.postagem.GerenteConta;
import br.com.correios.webservice.postagem.StatusGerente;
import br.com.correios.webservice.postagem.TipoGerente;

public class GerenteDeContaWebServiceToGerenteDeContaConverter {

	public GerenteDeConta convert(GerenteConta gerenteWebService) {
		Calendar data = null;
		if (gerenteWebService.getDataAtualizacao() != null) {
			data = gerenteWebService.getDataAtualizacao().toGregorianCalendar();
		}

		Calendar dataDaSenha = null;
		if (gerenteWebService.getDataSenha() != null) {
			dataDaSenha = gerenteWebService.getDataSenha().toGregorianCalendar();
		}

		TipoGerente tipoGerente = gerenteWebService.getTipoGerente();
		TipoContaGerenciada tipoConta = null;
		if (GERENTE_CONTA.equals(tipoGerente)) {
			tipoConta = CONTA_SIMPLES;
		} else if (GERENTE_CONTA_MASTER.equals(tipoGerente)){
			tipoConta = CONTA_MASTER;
		}

		StatusGerente statusGerente = gerenteWebService.getStatus();
		StatusDeAtivacao statusDeAtivacao = null;
		if (StatusGerente.ATIVO.equals(statusGerente)) {
			statusDeAtivacao = ATIVO;
		}
		else if (StatusGerente.INATIVO.equals(statusGerente)) {
			statusDeAtivacao = INATIVO;
		}

		GerenteDeConta gerente = GerenteDeConta
			.novoGerente()
			.atualizadoNaData(data)
			.comLogin(gerenteWebService.getLogin())
			.comSenha(gerenteWebService.getSenha())
			.comSenhaNaData(dataDaSenha)
			.comMatricula(gerenteWebService.getMatricula())
			.inclusoNaData(data)
			.comValidadeAte(gerenteWebService.getValidade())
			.gerenciandoContasDoTipo(tipoConta)
			.comStatus(statusDeAtivacao)
			.build();

		return gerente;
	}

}
