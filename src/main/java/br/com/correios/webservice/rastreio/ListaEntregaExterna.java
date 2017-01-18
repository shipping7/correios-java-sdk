
package br.com.correios.webservice.rastreio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaEntregaExterna complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListaEntregaExterna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "listaEntregaExterna", name = "ListaEntregaExterna", propOrder = {
    "loec"
})
public class ListaEntregaExterna {

    protected String loec;

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

}
