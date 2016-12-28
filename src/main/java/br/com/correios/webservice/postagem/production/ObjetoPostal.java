
package br.com.correios.webservice.postagem.production;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for objetoPostal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objetoPostal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEtiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAtualizacaoCliente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataCancelamentoEtiqueta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="objetoPostalPK" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoPostalPK" minOccurs="0"/>
 *         &lt;element name="plpNu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preListaPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}preListaPostagem" minOccurs="0"/>
 *         &lt;element name="statusEtiqueta" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusObjetoPostal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoPostal", propOrder = {
    "codigoEtiqueta",
    "dataAtualizacaoCliente",
    "dataCancelamentoEtiqueta",
    "dataInclusao",
    "objetoPostalPK",
    "plpNu",
    "preListaPostagem",
    "statusEtiqueta"
})
public class ObjetoPostal {

    protected String codigoEtiqueta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacaoCliente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancelamentoEtiqueta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInclusao;
    protected ObjetoPostalPK objetoPostalPK;
    protected Long plpNu;
    protected PreListaPostagem preListaPostagem;
    @XmlSchemaType(name = "string")
    protected StatusObjetoPostal statusEtiqueta;

    /**
     * Gets the value of the codigoEtiqueta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEtiqueta() {
        return codigoEtiqueta;
    }

    /**
     * Sets the value of the codigoEtiqueta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEtiqueta(String value) {
        this.codigoEtiqueta = value;
    }

    /**
     * Gets the value of the dataAtualizacaoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacaoCliente() {
        return dataAtualizacaoCliente;
    }

    /**
     * Sets the value of the dataAtualizacaoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacaoCliente(XMLGregorianCalendar value) {
        this.dataAtualizacaoCliente = value;
    }

    /**
     * Gets the value of the dataCancelamentoEtiqueta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancelamentoEtiqueta() {
        return dataCancelamentoEtiqueta;
    }

    /**
     * Sets the value of the dataCancelamentoEtiqueta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancelamentoEtiqueta(XMLGregorianCalendar value) {
        this.dataCancelamentoEtiqueta = value;
    }

    /**
     * Gets the value of the dataInclusao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInclusao() {
        return dataInclusao;
    }

    /**
     * Sets the value of the dataInclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInclusao(XMLGregorianCalendar value) {
        this.dataInclusao = value;
    }

    /**
     * Gets the value of the objetoPostalPK property.
     * 
     * @return
     *     possible object is
     *     {@link ObjetoPostalPK }
     *     
     */
    public ObjetoPostalPK getObjetoPostalPK() {
        return objetoPostalPK;
    }

    /**
     * Sets the value of the objetoPostalPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjetoPostalPK }
     *     
     */
    public void setObjetoPostalPK(ObjetoPostalPK value) {
        this.objetoPostalPK = value;
    }

    /**
     * Gets the value of the plpNu property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlpNu() {
        return plpNu;
    }

    /**
     * Sets the value of the plpNu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlpNu(Long value) {
        this.plpNu = value;
    }

    /**
     * Gets the value of the preListaPostagem property.
     * 
     * @return
     *     possible object is
     *     {@link PreListaPostagem }
     *     
     */
    public PreListaPostagem getPreListaPostagem() {
        return preListaPostagem;
    }

    /**
     * Sets the value of the preListaPostagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreListaPostagem }
     *     
     */
    public void setPreListaPostagem(PreListaPostagem value) {
        this.preListaPostagem = value;
    }

    /**
     * Gets the value of the statusEtiqueta property.
     * 
     * @return
     *     possible object is
     *     {@link StatusObjetoPostal }
     *     
     */
    public StatusObjetoPostal getStatusEtiqueta() {
        return statusEtiqueta;
    }

    /**
     * Sets the value of the statusEtiqueta property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusObjetoPostal }
     *     
     */
    public void setStatusEtiqueta(StatusObjetoPostal value) {
        this.statusEtiqueta = value;
    }

}
