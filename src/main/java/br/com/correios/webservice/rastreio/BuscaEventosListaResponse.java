
package br.com.correios.webservice.rastreio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscaEventosListaResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="buscaEventosListaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://resource.webservice.correios.com.br/}sroxml" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "buscaEventosListaResponse", name = "buscaEventosListaResponse", propOrder = {
    "_return"
})
public class BuscaEventosListaResponse {

    @XmlElement(name = "return")
    protected EventosDosCorreios _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link EventosDosCorreios }
     *
     */
    public EventosDosCorreios getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link EventosDosCorreios }
     *
     */
    public void setReturn(EventosDosCorreios value) {
        this._return = value;
    }

}
