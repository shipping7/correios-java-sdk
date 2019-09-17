
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dimensaoTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dimensaoTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="altura" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 *         &lt;element name="comprimento" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 *         &lt;element name="diametro" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 *         &lt;element name="largura" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 *         &lt;element name="soma" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimensaoTO", propOrder = {
    "altura",
    "comprimento",
    "diametro",
    "largura",
    "peso",
    "soma"
})
public class DimensaoTO {

    protected MedidaTO altura;
    protected MedidaTO comprimento;
    protected MedidaTO diametro;
    protected MedidaTO largura;
    protected MedidaTO peso;
    protected MedidaTO soma;

    /**
     * Gets the value of the altura property.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getAltura() {
        return altura;
    }

    /**
     * Sets the value of the altura property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setAltura(MedidaTO value) {
        this.altura = value;
    }

    /**
     * Gets the value of the comprimento property.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getComprimento() {
        return comprimento;
    }

    /**
     * Sets the value of the comprimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setComprimento(MedidaTO value) {
        this.comprimento = value;
    }

    /**
     * Gets the value of the diametro property.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getDiametro() {
        return diametro;
    }

    /**
     * Sets the value of the diametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setDiametro(MedidaTO value) {
        this.diametro = value;
    }

    /**
     * Gets the value of the largura property.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getLargura() {
        return largura;
    }

    /**
     * Sets the value of the largura property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setLargura(MedidaTO value) {
        this.largura = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setPeso(MedidaTO value) {
        this.peso = value;
    }

    /**
     * Gets the value of the soma property.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getSoma() {
        return soma;
    }

    /**
     * Sets the value of the soma property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setSoma(MedidaTO value) {
        this.soma = value;
    }

}
