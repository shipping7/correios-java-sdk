
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objetoSimplificadoTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objetoSimplificadoTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datahora_cancelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero_pedido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status_pedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoSimplificadoTO", propOrder = {
    "datahoraCancelamento",
    "numeroPedido",
    "statusPedido"
})
public class ObjetoSimplificadoTO {

    @XmlElement(name = "datahora_cancelamento")
    protected String datahoraCancelamento;
    @XmlElement(name = "numero_pedido")
    protected Integer numeroPedido;
    @XmlElement(name = "status_pedido")
    protected String statusPedido;

    /**
     * Gets the value of the datahoraCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatahoraCancelamento() {
        return datahoraCancelamento;
    }

    /**
     * Sets the value of the datahoraCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatahoraCancelamento(String value) {
        this.datahoraCancelamento = value;
    }

    /**
     * Gets the value of the numeroPedido property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Sets the value of the numeroPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroPedido(Integer value) {
        this.numeroPedido = value;
    }

    /**
     * Gets the value of the statusPedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPedido() {
        return statusPedido;
    }

    /**
     * Sets the value of the statusPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPedido(String value) {
        this.statusPedido = value;
    }

}
