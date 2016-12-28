
package br.com.correios.webservice.rastreio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="agrupamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devolucaoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devolucaoObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "agrupamento",
    "avisoRecebimento",
    "devolucaoDocumento",
    "devolucaoObjeto",
    "maoPropria",
    "numeroObjeto"
})
public class ObjetoPostal {

    protected String agrupamento;
    protected String avisoRecebimento;
    protected String devolucaoDocumento;
    protected String devolucaoObjeto;
    protected String maoPropria;
    protected String numeroObjeto;

    /**
     * Gets the value of the agrupamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrupamento() {
        return agrupamento;
    }

    /**
     * Sets the value of the agrupamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrupamento(String value) {
        this.agrupamento = value;
    }

    /**
     * Gets the value of the avisoRecebimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvisoRecebimento() {
        return avisoRecebimento;
    }

    /**
     * Sets the value of the avisoRecebimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvisoRecebimento(String value) {
        this.avisoRecebimento = value;
    }

    /**
     * Gets the value of the devolucaoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevolucaoDocumento() {
        return devolucaoDocumento;
    }

    /**
     * Sets the value of the devolucaoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevolucaoDocumento(String value) {
        this.devolucaoDocumento = value;
    }

    /**
     * Gets the value of the devolucaoObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevolucaoObjeto() {
        return devolucaoObjeto;
    }

    /**
     * Sets the value of the devolucaoObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevolucaoObjeto(String value) {
        this.devolucaoObjeto = value;
    }

    /**
     * Gets the value of the maoPropria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaoPropria() {
        return maoPropria;
    }

    /**
     * Sets the value of the maoPropria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaoPropria(String value) {
        this.maoPropria = value;
    }

    /**
     * Gets the value of the numeroObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroObjeto() {
        return numeroObjeto;
    }

    /**
     * Sets the value of the numeroObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroObjeto(String value) {
        this.numeroObjeto = value;
    }

}
