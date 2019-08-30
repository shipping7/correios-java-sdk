package br.com.correios.api.postagem.contrato;

import java.util.Calendar;
import java.util.List;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;

import br.com.correios.api.postagem.adicional.ServicoCorreio;
import br.com.correios.api.postagem.cartao.CartaoPostagem;
import br.com.correios.api.postagem.cartao.StatusDoCartaoDaPostagem;
import br.com.correios.api.postagem.common.DataVigencia;
import br.com.correios.webservice.postagem.Cliente;

public class Contrato {

    private List<CartaoPostagem> cartoesPostagem;

    //TODO Este cliente ja possui um contrato. Ver a possibilidade de remover daqui
    private Cliente cliente;

    private long codigoCliente;

    private ContratoDiretoria contratoDiretoria;

    private Calendar dataAtualizacao;

    private DataVigencia dataDeVigencia;

    private String descricaoDiretoriaRegional;

    private StatusDoCartaoDaPostagem status;

    private UnidadePostagem unidadeDePostagem;

    private Contrato() {}

    public String getDataDaAtualizacaoFormatada() {
    	return "";
    }

    public List<CartaoPostagem> getCartoesPostagem() {
		return cartoesPostagem;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public long getCodigoCliente() {
		return codigoCliente;
	}

	public ContratoDiretoria getContratoDiretoria() {
		return contratoDiretoria;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	public DataVigencia getDataDeVigencia() {
		return dataDeVigencia;
	}

	public String getDescricaoDiretoriaRegional() {
		return descricaoDiretoriaRegional;
	}

	public StatusDoCartaoDaPostagem getStatus() {
		return status;
	}

	public UnidadePostagem getUnidadeDePostagem() {
		return unidadeDePostagem;
	}

	public static ContratoBuilder novoContrato() {
    	return new ContratoBuilder();
    }

    public static class ContratoBuilder {

    	private Contrato contrato;

    	public ContratoBuilder() {
    		this.contrato = new Contrato();
		}

		public ContratoBuilder comCartoesDePostagem(List<CartaoPostagem> cartoes) {
			this.contrato.cartoesPostagem = cartoes;
			return this;
		}

		public ContratoBuilder doCliente(Cliente cliente) {
			this.contrato.cliente = cliente;
			return this;
		}

		public ContratoBuilder comContratoDeDiretoria(ContratoDiretoria contrato) {
			this.contrato.contratoDiretoria = contrato;
			return this;
		}

		public ContratoBuilder comCodigoCliente(Long codigoCliente) {
			this.contrato.codigoCliente = codigoCliente;
			return this;
		}

		public ContratoBuilder atualizadoNaData(Calendar data) {
			this.contrato.dataAtualizacao = data;
			return this;
		}

		public ContratoBuilder comVigencia(DataVigencia vigencia) {
			this.contrato.dataDeVigencia = vigencia;
			return this;
		}

		public ContratoBuilder comDescricaoDeDiretoriaRegional(String descricao) {
			this.contrato.descricaoDiretoriaRegional = descricao;
			return this;
		}

		public ContratoBuilder comStatus(StatusDoCartaoDaPostagem status) {
			this.contrato.status = status;
			return this;
		}

		public ContratoBuilder naUnidadeDePostagem(UnidadePostagem unidadePostagem) {
			this.contrato.unidadeDePostagem = unidadePostagem;
			return this;
		}

		public Contrato build() {
			return this.contrato;
		}

    }

	public Optional<ServicoCorreio> retornaServicoPelo(String codigoDoDestinatario) {
		List<CartaoPostagem> cartoesDePostagem = getCartoesPostagem();
		for (CartaoPostagem cartao: cartoesDePostagem) {
			List<ServicoCorreio> servicos = cartao.getServicos();
			for (ServicoCorreio servico: servicos) {
				if (servico.temMesmoCodigoDoDestinatario(codigoDoDestinatario)) {
					return Optional.of(servico);
				}
			}
		}
		return Optional.absent();
	}

	public Optional<ServicoCorreio> retornaServicoPelo(Long idDoDestinatario) {
		List<CartaoPostagem> cartoesDePostagem = getCartoesPostagem();
		for (CartaoPostagem cartao: cartoesDePostagem) {
			List<ServicoCorreio> servicos = cartao.getServicos();
			for (ServicoCorreio servico: servicos) {
				if (servico.temMesmoIdDoDestinatario(idDoDestinatario)) {
					return Optional.of(servico);
				}
			}
		}
		return Optional.absent();
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
			.add("contratoDiretoria", this.contratoDiretoria)
			.add("cartoesPostagem", this.cartoesPostagem)
			.add("cliente", this.cliente)
			.add("codigoCliente", this.codigoCliente)
			.add("descricaoDiretoriaRegional", this.descricaoDiretoriaRegional)
			.add("status", this.status)
			.add("unidadeDePostagem", this.unidadeDePostagem)
			.toString();
	}


}
