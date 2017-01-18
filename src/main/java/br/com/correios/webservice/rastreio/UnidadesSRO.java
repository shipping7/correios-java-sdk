
package br.com.correios.webservice.rastreio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnidadesSRO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UnidadesSRO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoSRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "unidadesSRO", name = "UnidadesSRO", propOrder = {
    "codigoSRO"
})
public class UnidadesSRO {

    protected String codigoSRO;

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

}
