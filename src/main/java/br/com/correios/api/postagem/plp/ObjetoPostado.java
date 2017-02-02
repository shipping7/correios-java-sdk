package br.com.correios.api.postagem.plp;

import br.com.correios.api.postagem.destinatario.DestinatarioDoObjeto;
import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto;

public class ObjetoPostado {

	/**
	 * Número do Objeto na ECT. Importante: aqui deverá constar: número do objeto + digito verificador. Exemplo: DF12345678 BR
	 *
	 * Preenchimento Obrigatório
	 */
	private String numeroEtiqueta;

	/**
	 * Código de controle do objeto no cliente
	 *
	 * Preenchimento não obrigatório.
	 */
	private String codigoDeControleDoObjetoDoCliente;

	/**
	 * Código do serviço da postagem, por exemplo: 40215, 40096, etc.
	 *
	 * Preenchimento obrigatório
	 */
	private String codigoDoServicoDePostagem;

	/**
	 * Essas medidas sao enviadas pelos Correios nos campos cubagem e peso
	 */
	private MedidasDoObjetoPostado medidas;

	/**
	 * Para os Correios essas observacoes sao usadas pelos campos rt1 e rt2
	 */
	private ObservacoesDoCliente observacoesDoCliente;

	/**
	 * Dados do destinatário
	 *
	 * Preenchimento Obrigatório
	 */
	private DestinatarioDoObjeto destinatario;

	/**
	 * Os dados de entrega sao representados pela classe Nacional dos Correios
	 *
	 * Dados relevantes a postagem nacional
	 *
	 * Preenchimento Obrigatório
	 */
	private DadosDeEntrega dadosDeEntrega;

	/**
	 * Identifica os serviços adicionais do objeto postado
	 *
	 * Preenchimento Obrigatório
	 */
	private ServicoAdicionalDoObjeto servicoAdicional;

	/**
	 * Contém as dimensões do objeto (altura, largura, comprimento e diâmetro) e o tipo do objeto (embalagem)
	 *
	 * Preenchimento Obrigatório.
	 */
	private DimensoesDoObjeto dimensaoObjeto;

	/**
	 * Contém a data de efetivação da postagem.
	 *
	 * Preenchimento não obrigatório.
	 */
	private String dataDaPostagemNoSistemaSara;

	/**
	 * Contém o STATUS do processamento do objeto, deverá ser enviado a informação com valor igual a "0" pelos Correios.
	 *
	 * Preenchimento não obrigatório.
	 */
	private boolean processado;

	/**
	 * Contém o numero de comprovante de postagem.
	 *
	 * Preenchimento não obrigatório.
	 */
	private String numeroDoComprovanteDePostagem;

	/**
	 * Valor que foi tarifado no Sistema de Atendimento da Agência dos Correios.
	 *
	 * Preenchimento não obrigatório.
	 */
	private String valorCobrado;

	public ObjetoPostado(String numeroEtiqueta, String codigoDeControleDoObjetoDoCliente,
			String codigoDoServicoDePostagem, MedidasDoObjetoPostado medidas, ObservacoesDoCliente observacoesDoCliente,
			DestinatarioDoObjeto destinatario, DadosDeEntrega dadosDeEntrega, ServicoAdicionalDoObjeto servicoAdicional,
			DimensoesDoObjeto dimensaoObjeto, String dataDaPostagemNoSistemaSara, boolean processado,
			String numeroDoComprovanteDePostagem, String valorCobrado) {
		this.numeroEtiqueta = numeroEtiqueta;
		this.codigoDeControleDoObjetoDoCliente = codigoDeControleDoObjetoDoCliente;
		this.codigoDoServicoDePostagem = codigoDoServicoDePostagem;
		this.medidas = medidas;
		this.observacoesDoCliente = observacoesDoCliente;
		this.destinatario = destinatario;
		this.dadosDeEntrega = dadosDeEntrega;
		this.servicoAdicional = servicoAdicional;
		this.dimensaoObjeto = dimensaoObjeto;
		this.dataDaPostagemNoSistemaSara = dataDaPostagemNoSistemaSara;
		this.processado = processado;
		this.numeroDoComprovanteDePostagem = numeroDoComprovanteDePostagem;
		this.valorCobrado = valorCobrado;
	}

	public String getNumeroEtiqueta() {
		return numeroEtiqueta;
	}

	public String getCodigoDeControleDoObjetoDoCliente() {
		return codigoDeControleDoObjetoDoCliente;
	}

	public String getCodigoDoServicoDePostagem() {
		return codigoDoServicoDePostagem;
	}

	public MedidasDoObjetoPostado getMedidas() {
		return medidas;
	}

	public ObservacoesDoCliente getObservacoesDoCliente() {
		return observacoesDoCliente;
	}

	public DestinatarioDoObjeto getDestinatario() {
		return destinatario;
	}

	public DadosDeEntrega getDadosDeEntrega() {
		return dadosDeEntrega;
	}

	public ServicoAdicionalDoObjeto getServicoAdicional() {
		return servicoAdicional;
	}

	public DimensoesDoObjeto getDimensaoObjeto() {
		return dimensaoObjeto;
	}

	public String getDataDaPostagemNoSistemaSara() {
		return dataDaPostagemNoSistemaSara;
	}

	public boolean isProcessado() {
		return processado;
	}

	public String getNumeroDoComprovanteDePostagem() {
		return numeroDoComprovanteDePostagem;
	}

	public String getValorCobrado() {
		return valorCobrado;
	}

}
