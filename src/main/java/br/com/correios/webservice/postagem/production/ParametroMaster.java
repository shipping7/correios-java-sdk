
package br.com.correios.webservice.postagem.production;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametroMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametroMaster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prmCoParametro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="prmTxParametro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prmTxValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametroMaster", propOrder = {
    "prmCoParametro",
    "prmTxParametro",
    "prmTxValor"
})
public class ParametroMaster {

    protected long prmCoParametro;
    protected String prmTxParametro;
    protected String prmTxValor;

    /**
     * Gets the value of the prmCoParametro property.
     * 
     */
    public long getPrmCoParametro() {
        return prmCoParametro;
    }

    /**
     * Sets the value of the prmCoParametro property.
     * 
     */
    public void setPrmCoParametro(long value) {
        this.prmCoParametro = value;
    }

    /**
     * Gets the value of the prmTxParametro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmTxParametro() {
        return prmTxParametro;
    }

    /**
     * Sets the value of the prmTxParametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrmTxParametro(String value) {
        this.prmTxParametro = value;
    }

    /**
     * Gets the value of the prmTxValor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmTxValor() {
        return prmTxValor;
    }

    /**
     * Sets the value of the prmTxValor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrmTxValor(String value) {
        this.prmTxValor = value;
    }

}
