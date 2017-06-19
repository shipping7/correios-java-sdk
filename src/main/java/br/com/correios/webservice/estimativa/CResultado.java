
package br.com.correios.webservice.estimativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cResultado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cResultado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Servicos" type="{http://tempuri.org/}ArrayOfCServico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cResultado", propOrder = {
    "servicos"
})
public class CResultado {

    @XmlElement(name = "Servicos")
    protected ArrayOfCServico servicos;

    /**
     * Gets the value of the servicos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCServico }
     *     
     */
    public ArrayOfCServico getServicos() {
        return servicos;
    }

    /**
     * Sets the value of the servicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCServico }
     *     
     */
    public void setServicos(ArrayOfCServico value) {
        this.servicos = value;
    }

}
