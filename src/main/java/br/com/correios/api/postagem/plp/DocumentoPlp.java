package br.com.correios.api.postagem.plp;

import java.math.BigDecimal;
import java.util.List;

import br.com.correios.api.postagem.remetente.RemetenteDaPostagem;

public class DocumentoPlp {

	/**
	 * Identifica o tipo de arquivo nos correios. O valor será POSTAGEM
	 */
	private String tipoDoArquivoNosCorreios;

	private BigDecimal versaoArquivo;

	private Plp plp;

	/**
	 * Identifica o remetente da postagem. Esta Tag deverá aparecer somente uma vez no arquivo
	 */
	private RemetenteDaPostagem remetente;

	/**
	 * Valor numérico indicando a forma de pagamento utilizada pelo cliente para realizar a postagem.
	 * Observação: campo não obrigatório.
	 * Para postagens a faturar enviar a tag vazia
	 */
	private String formaPagamento;

	/**
	 * Tag delimitadora do objeto que será postado. Esta tag contém as características do objeto postado.
	 * Para postagens de “n” objetos, esta tag deverá ser repetida conforme a quantidade de objetos desejados.
	 */
	private List<ObjetoPostado> objetoPostado;

	public DocumentoPlp(String tipoDoArquivoNosCorreios, BigDecimal versaoArquivo, Plp plp,
			RemetenteDaPostagem remetente, String formaPagamento, List<ObjetoPostado> objetoPostado) {
		this.tipoDoArquivoNosCorreios = tipoDoArquivoNosCorreios;
		this.versaoArquivo = versaoArquivo;
		this.plp = plp;
		this.remetente = remetente;
		this.formaPagamento = formaPagamento;
		this.objetoPostado = objetoPostado;
	}

	public String getTipoDoArquivoNosCorreios() {
		return tipoDoArquivoNosCorreios;
	}

	public BigDecimal getVersaoArquivo() {
		return versaoArquivo;
	}

	public Plp getPlp() {
		return plp;
	}

	public RemetenteDaPostagem getRemetente() {
		return remetente;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public List<ObjetoPostado> getObjetoPostado() {
		return objetoPostado;
	}

}
