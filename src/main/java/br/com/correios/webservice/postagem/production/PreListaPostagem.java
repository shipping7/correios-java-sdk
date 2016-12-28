
package br.com.correios.webservice.postagem.production;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for preListaPostagem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preListaPostagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cartaoPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}cartaoPostagemERP" minOccurs="0"/>
 *         &lt;element name="dataAtualizacaoCliente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataAtualizacaoSara" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataFechamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPostagem" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPostagemSara" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="objetosPostais" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoPostal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plpCliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="plpNu" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="plpXml" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plpXmlRetorno" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusPlp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preListaPostagem", propOrder = {
    "cartaoPostagem",
    "dataAtualizacaoCliente",
    "dataAtualizacaoSara",
    "dataFechamento",
    "dataPostagem",
    "dataPostagemSara",
    "objetosPostais",
    "plpCliente",
    "plpNu",
    "plpXml",
    "plpXmlRetorno",
    "status"
})
public class PreListaPostagem {

    protected CartaoPostagemERP cartaoPostagem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacaoCliente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacaoSara;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFechamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPostagem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPostagemSara;
    @XmlElement(nillable = true)
    protected List<ObjetoPostal> objetosPostais;
    protected long plpCliente;
    protected long plpNu;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "unsignedShort")
    protected List<Integer> plpXml;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "unsignedShort")
    protected List<Integer> plpXmlRetorno;
    @XmlSchemaType(name = "string")
    protected StatusPlp status;

    /**
     * Gets the value of the cartaoPostagem property.
     * 
     * @return
     *     possible object is
     *     {@link CartaoPostagemERP }
     *     
     */
    public CartaoPostagemERP getCartaoPostagem() {
        return cartaoPostagem;
    }

    /**
     * Sets the value of the cartaoPostagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaoPostagemERP }
     *     
     */
    public void setCartaoPostagem(CartaoPostagemERP value) {
        this.cartaoPostagem = value;
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
     * Gets the value of the dataAtualizacaoSara property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacaoSara() {
        return dataAtualizacaoSara;
    }

    /**
     * Sets the value of the dataAtualizacaoSara property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacaoSara(XMLGregorianCalendar value) {
        this.dataAtualizacaoSara = value;
    }

    /**
     * Gets the value of the dataFechamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFechamento() {
        return dataFechamento;
    }

    /**
     * Sets the value of the dataFechamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFechamento(XMLGregorianCalendar value) {
        this.dataFechamento = value;
    }

    /**
     * Gets the value of the dataPostagem property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPostagem() {
        return dataPostagem;
    }

    /**
     * Sets the value of the dataPostagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPostagem(XMLGregorianCalendar value) {
        this.dataPostagem = value;
    }

    /**
     * Gets the value of the dataPostagemSara property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPostagemSara() {
        return dataPostagemSara;
    }

    /**
     * Sets the value of the dataPostagemSara property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPostagemSara(XMLGregorianCalendar value) {
        this.dataPostagemSara = value;
    }

    /**
     * Gets the value of the objetosPostais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objetosPostais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjetosPostais().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjetoPostal }
     * 
     * 
     */
    public List<ObjetoPostal> getObjetosPostais() {
        if (objetosPostais == null) {
            objetosPostais = new ArrayList<ObjetoPostal>();
        }
        return this.objetosPostais;
    }

    /**
     * Gets the value of the plpCliente property.
     * 
     */
    public long getPlpCliente() {
        return plpCliente;
    }

    /**
     * Sets the value of the plpCliente property.
     * 
     */
    public void setPlpCliente(long value) {
        this.plpCliente = value;
    }

    /**
     * Gets the value of the plpNu property.
     * 
     */
    public long getPlpNu() {
        return plpNu;
    }

    /**
     * Sets the value of the plpNu property.
     * 
     */
    public void setPlpNu(long value) {
        this.plpNu = value;
    }

    /**
     * Gets the value of the plpXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plpXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlpXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPlpXml() {
        if (plpXml == null) {
            plpXml = new ArrayList<Integer>();
        }
        return this.plpXml;
    }

    /**
     * Gets the value of the plpXmlRetorno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plpXmlRetorno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlpXmlRetorno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPlpXmlRetorno() {
        if (plpXmlRetorno == null) {
            plpXmlRetorno = new ArrayList<Integer>();
        }
        return this.plpXmlRetorno;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusPlp }
     *     
     */
    public StatusPlp getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusPlp }
     *     
     */
    public void setStatus(StatusPlp value) {
        this.status = value;
    }

}
