
package br.com.correios.webservice.rastreio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for listaEntregaExterna complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaEntregaExterna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carteiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCarteiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objetos" type="{http://resource.webservice.correios.com.br/}objetoPostal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaEntregaExterna", propOrder = {
    "carteiro",
    "data",
    "distrito",
    "estacao",
    "id",
    "loec",
    "nomeCarteiro",
    "nomeUnidade",
    "objetos",
    "unidade"
})
public class ListaEntregaExterna2 {

    protected String carteiro;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected String distrito;
    protected String estacao;
    protected String id;
    protected String loec;
    protected String nomeCarteiro;
    protected String nomeUnidade;
    @XmlElement(nillable = true)
    protected List<ObjetoPostal> objetos;
    protected String unidade;

    /**
     * Gets the value of the carteiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarteiro() {
        return carteiro;
    }

    /**
     * Sets the value of the carteiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarteiro(String value) {
        this.carteiro = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the distrito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Sets the value of the distrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrito(String value) {
        this.distrito = value;
    }

    /**
     * Gets the value of the estacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstacao() {
        return estacao;
    }

    /**
     * Sets the value of the estacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstacao(String value) {
        this.estacao = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the loec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoec() {
        return loec;
    }

    /**
     * Sets the value of the loec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoec(String value) {
        this.loec = value;
    }

    /**
     * Gets the value of the nomeCarteiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCarteiro() {
        return nomeCarteiro;
    }

    /**
     * Sets the value of the nomeCarteiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCarteiro(String value) {
        this.nomeCarteiro = value;
    }

    /**
     * Gets the value of the nomeUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUnidade() {
        return nomeUnidade;
    }

    /**
     * Sets the value of the nomeUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUnidade(String value) {
        this.nomeUnidade = value;
    }

    /**
     * Gets the value of the objetos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objetos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjetos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjetoPostal }
     * 
     * 
     */
    public List<ObjetoPostal> getObjetos() {
        if (objetos == null) {
            objetos = new ArrayList<ObjetoPostal>();
        }
        return this.objetos;
    }

    /**
     * Gets the value of the unidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * Sets the value of the unidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidade(String value) {
        this.unidade = value;
    }

}
