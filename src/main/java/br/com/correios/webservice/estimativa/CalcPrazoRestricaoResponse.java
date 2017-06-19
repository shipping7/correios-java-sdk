
package br.com.correios.webservice.estimativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CalcPrazoRestricaoResult" type="{http://tempuri.org/}cResultado"/>
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
    "calcPrazoRestricaoResult"
})
@XmlRootElement(name = "CalcPrazoRestricaoResponse")
public class CalcPrazoRestricaoResponse {

    @XmlElement(name = "CalcPrazoRestricaoResult", required = true)
    protected CResultado calcPrazoRestricaoResult;

    /**
     * Gets the value of the calcPrazoRestricaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link CResultado }
     *     
     */
    public CResultado getCalcPrazoRestricaoResult() {
        return calcPrazoRestricaoResult;
    }

    /**
     * Sets the value of the calcPrazoRestricaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultado }
     *     
     */
    public void setCalcPrazoRestricaoResult(CResultado value) {
        this.calcPrazoRestricaoResult = value;
    }

}
