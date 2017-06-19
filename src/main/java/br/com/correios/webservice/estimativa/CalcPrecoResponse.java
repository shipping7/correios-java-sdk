
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
 *         &lt;element name="CalcPrecoResult" type="{http://tempuri.org/}cResultado"/>
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
    "calcPrecoResult"
})
@XmlRootElement(name = "CalcPrecoResponse")
public class CalcPrecoResponse {

    @XmlElement(name = "CalcPrecoResult", required = true)
    protected CResultado calcPrecoResult;

    /**
     * Gets the value of the calcPrecoResult property.
     * 
     * @return
     *     possible object is
     *     {@link CResultado }
     *     
     */
    public CResultado getCalcPrecoResult() {
        return calcPrecoResult;
    }

    /**
     * Sets the value of the calcPrecoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultado }
     *     
     */
    public void setCalcPrecoResult(CResultado value) {
        this.calcPrecoResult = value;
    }

}
