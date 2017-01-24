
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pedidoInformacaoConsulta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pedidoInformacaoConsulta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}pedidoInformacao">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidoInformacaoConsulta", propOrder = {
    "numero"
})
public class PedidoInformacaoConsulta
    extends PedidoInformacao
{

    protected Long numero;

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumero(Long value) {
        this.numero = value;
    }

}
