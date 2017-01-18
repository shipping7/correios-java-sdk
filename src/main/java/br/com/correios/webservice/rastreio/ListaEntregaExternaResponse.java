
package br.com.correios.webservice.rastreio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaEntregaExternaResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListaEntregaExternaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://resource.webservice.correios.com.br/}listaEntregaExterna" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "listaEntregaExternaResponse", name = "ListaEntregaExternaResponse", propOrder = {
    "_return"
})
public class ListaEntregaExternaResponse {

    @XmlElement(name = "return")
    protected ListaEntregaExterna2 _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link ListaEntregaExterna2 }
     *
     */
    public ListaEntregaExterna2 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link ListaEntregaExterna2 }
     *
     */
    public void setReturn(ListaEntregaExterna2 value) {
        this._return = value;
    }

}
