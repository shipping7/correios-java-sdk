
package br.com.correios.webservice.estimativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nCdServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDtCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nCdServico",
    "sCepOrigem",
    "sCepDestino",
    "sDtCalculo"
})
@XmlRootElement(name = "CalcPrazoRestricao")
public class CalcPrazoRestricao {

    protected String nCdServico;
    protected String sCepOrigem;
    protected String sCepDestino;
    protected String sDtCalculo;

    /**
     * Gets the value of the nCdServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCdServico() {
        return nCdServico;
    }

    /**
     * Sets the value of the nCdServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCdServico(String value) {
        this.nCdServico = value;
    }

    /**
     * Gets the value of the sCepOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCepOrigem() {
        return sCepOrigem;
    }

    /**
     * Sets the value of the sCepOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCepOrigem(String value) {
        this.sCepOrigem = value;
    }

    /**
     * Gets the value of the sCepDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCepDestino() {
        return sCepDestino;
    }

    /**
     * Sets the value of the sCepDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCepDestino(String value) {
        this.sCepDestino = value;
    }

    /**
     * Gets the value of the sDtCalculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDtCalculo() {
        return sDtCalculo;
    }

    /**
     * Sets the value of the sDtCalculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDtCalculo(String value) {
        this.sDtCalculo = value;
    }

}
