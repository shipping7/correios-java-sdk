
package br.com.correios.webservice.rastreio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registroUnidades complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registroUnidades">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMCU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoSRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaTipoUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registroUnidades", propOrder = {
    "codigoDR",
    "codigoMCU",
    "codigoSRO",
    "nomeUnidade",
    "siglaDR",
    "siglaTipoUnidade",
    "tipoUnidade"
})
public class RegistroUnidades {

    protected String codigoDR;
    protected String codigoMCU;
    protected String codigoSRO;
    protected String nomeUnidade;
    protected String siglaDR;
    protected String siglaTipoUnidade;
    protected String tipoUnidade;

    /**
     * Gets the value of the codigoDR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDR() {
        return codigoDR;
    }

    /**
     * Sets the value of the codigoDR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDR(String value) {
        this.codigoDR = value;
    }

    /**
     * Gets the value of the codigoMCU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMCU() {
        return codigoMCU;
    }

    /**
     * Sets the value of the codigoMCU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMCU(String value) {
        this.codigoMCU = value;
    }

    /**
     * Gets the value of the codigoSRO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSRO() {
        return codigoSRO;
    }

    /**
     * Sets the value of the codigoSRO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSRO(String value) {
        this.codigoSRO = value;
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
     * Gets the value of the siglaDR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaDR() {
        return siglaDR;
    }

    /**
     * Sets the value of the siglaDR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaDR(String value) {
        this.siglaDR = value;
    }

    /**
     * Gets the value of the siglaTipoUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaTipoUnidade() {
        return siglaTipoUnidade;
    }

    /**
     * Sets the value of the siglaTipoUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaTipoUnidade(String value) {
        this.siglaTipoUnidade = value;
    }

    /**
     * Gets the value of the tipoUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoUnidade() {
        return tipoUnidade;
    }

    /**
     * Sets the value of the tipoUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoUnidade(String value) {
        this.tipoUnidade = value;
    }

}
