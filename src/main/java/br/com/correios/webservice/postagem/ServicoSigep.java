
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicoSigep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicoSigep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoriaServico" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}categoriaServico" minOccurs="0"/>
 *         &lt;element name="chancela" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}chancelaMaster" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exigeDimensoes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="exigeValorCobrar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="imitm" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pagamentoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remessaAgrupada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restricao" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}simNao" minOccurs="0"/>
 *         &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="servicoERP" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoERP" minOccurs="0"/>
 *         &lt;element name="ssiCoCodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicoSigep", propOrder = {
    "categoriaServico",
    "chancela",
    "descricao",
    "exigeDimensoes",
    "exigeValorCobrar",
    "imitm",
    "pagamentoEntrega",
    "remessaAgrupada",
    "restricao",
    "servico",
    "servicoERP",
    "ssiCoCodigoPostal"
})
public class ServicoSigep {

    @XmlSchemaType(name = "string")
    protected CategoriaServico categoriaServico;
    protected ChancelaMaster chancela;
    protected String descricao;
    protected Boolean exigeDimensoes;
    protected Boolean exigeValorCobrar;
    protected long imitm;
    protected String pagamentoEntrega;
    protected String remessaAgrupada;
    @XmlSchemaType(name = "string")
    protected SimNao restricao;
    protected long servico;
    protected ServicoERP servicoERP;
    protected String ssiCoCodigoPostal;

    /**
     * Gets the value of the categoriaServico property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaServico }
     *     
     */
    public CategoriaServico getCategoriaServico() {
        return categoriaServico;
    }

    /**
     * Sets the value of the categoriaServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaServico }
     *     
     */
    public void setCategoriaServico(CategoriaServico value) {
        this.categoriaServico = value;
    }

    /**
     * Gets the value of the chancela property.
     * 
     * @return
     *     possible object is
     *     {@link ChancelaMaster }
     *     
     */
    public ChancelaMaster getChancela() {
        return chancela;
    }

    /**
     * Sets the value of the chancela property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChancelaMaster }
     *     
     */
    public void setChancela(ChancelaMaster value) {
        this.chancela = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the exigeDimensoes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExigeDimensoes() {
        return exigeDimensoes;
    }

    /**
     * Sets the value of the exigeDimensoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExigeDimensoes(Boolean value) {
        this.exigeDimensoes = value;
    }

    /**
     * Gets the value of the exigeValorCobrar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExigeValorCobrar() {
        return exigeValorCobrar;
    }

    /**
     * Sets the value of the exigeValorCobrar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExigeValorCobrar(Boolean value) {
        this.exigeValorCobrar = value;
    }

    /**
     * Gets the value of the imitm property.
     * 
     */
    public long getImitm() {
        return imitm;
    }

    /**
     * Sets the value of the imitm property.
     * 
     */
    public void setImitm(long value) {
        this.imitm = value;
    }

    /**
     * Gets the value of the pagamentoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagamentoEntrega() {
        return pagamentoEntrega;
    }

    /**
     * Sets the value of the pagamentoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagamentoEntrega(String value) {
        this.pagamentoEntrega = value;
    }

    /**
     * Gets the value of the remessaAgrupada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemessaAgrupada() {
        return remessaAgrupada;
    }

    /**
     * Sets the value of the remessaAgrupada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemessaAgrupada(String value) {
        this.remessaAgrupada = value;
    }

    /**
     * Gets the value of the restricao property.
     * 
     * @return
     *     possible object is
     *     {@link SimNao }
     *     
     */
    public SimNao getRestricao() {
        return restricao;
    }

    /**
     * Sets the value of the restricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimNao }
     *     
     */
    public void setRestricao(SimNao value) {
        this.restricao = value;
    }

    /**
     * Gets the value of the servico property.
     * 
     */
    public long getServico() {
        return servico;
    }

    /**
     * Sets the value of the servico property.
     * 
     */
    public void setServico(long value) {
        this.servico = value;
    }

    /**
     * Gets the value of the servicoERP property.
     * 
     * @return
     *     possible object is
     *     {@link ServicoERP }
     *     
     */
    public ServicoERP getServicoERP() {
        return servicoERP;
    }

    /**
     * Sets the value of the servicoERP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicoERP }
     *     
     */
    public void setServicoERP(ServicoERP value) {
        this.servicoERP = value;
    }

    /**
     * Gets the value of the ssiCoCodigoPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsiCoCodigoPostal() {
        return ssiCoCodigoPostal;
    }

    /**
     * Sets the value of the ssiCoCodigoPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsiCoCodigoPostal(String value) {
        this.ssiCoCodigoPostal = value;
    }

}
