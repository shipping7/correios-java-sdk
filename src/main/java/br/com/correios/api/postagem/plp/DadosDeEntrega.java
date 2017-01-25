package br.com.correios.api.postagem.plp;

public class DadosDeEntrega {

	/**
	 * Endereco de entrega do objeto
	 *
	 * Todos os dados são obrigatórios
	 */
	private EnderecoDeEntrega endereco;

    /**
     * Código do usuário postal
     *
     * Preenchimento não obrigatório.
     */
    private String codigoDoUsuarioPostal;

    /**
     * Centro de custo do cliente
     *
     * Preenchimento não obrigatório.
     */
    private String centroDeCustoDoCliente;

    /**
     * NotaFiscal do objeto a ser entregue
     */
    private NotaFiscal notaFiscal;

    /**
     * Descrição do objeto
     *
     * Preenchimento não obrigatório.
     */
    private String descricaoDoObjeto;

    /**
     * Valor a cobrar do destinatário
     *
     * Obrigatório para o serviço na modalidade a cobrar.
     */
    private String valorACobrarDoDestinatario;

	public DadosDeEntrega(EnderecoDeEntrega endereco, String codigoDoUsuarioPostal, String centroDeCustoDoCliente,
			NotaFiscal notaFiscal, String descricaoDoObjeto, String valorACobrarDoDestinatario) {
		this.endereco = endereco;
		this.codigoDoUsuarioPostal = codigoDoUsuarioPostal;
		this.centroDeCustoDoCliente = centroDeCustoDoCliente;
		this.notaFiscal = notaFiscal;
		this.descricaoDoObjeto = descricaoDoObjeto;
		this.valorACobrarDoDestinatario = valorACobrarDoDestinatario;
	}

	public EnderecoDeEntrega getEndereco() {
		return endereco;
	}

	public String getCodigoDoUsuarioPostal() {
		return codigoDoUsuarioPostal;
	}

	public String getCentroDeCustoDoCliente() {
		return centroDeCustoDoCliente;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public String getDescricaoDoObjeto() {
		return descricaoDoObjeto;
	}

	public String getValorACobrarDoDestinatario() {
		return valorACobrarDoDestinatario;
	}

}
