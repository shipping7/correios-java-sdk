
package br.com.correios.webservice.postagem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coletaReversaTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coletaReversaTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}coletaTO">
 *       &lt;sequence>
 *         &lt;element name="ag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cartao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="obj_col" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servico_adicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaReversaTO", propOrder = {
    "ag",
    "ar",
    "cartao",
    "numero",
    "objCol",
    "servicoAdicional"
})
public class ColetaReversaTO
    extends ColetaTO
{

    protected String ag;
    protected Integer ar;
    protected Long cartao;
    protected Integer numero;
    @XmlElement(name = "obj_col", nillable = true)
    protected List<ObjetoTO> objCol;
    @XmlElement(name = "servico_adicional")
    protected String servicoAdicional;

    /**
     * Gets the value of the ag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAg() {
        return ag;
    }

    /**
     * Sets the value of the ag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAg(String value) {
        this.ag = value;
    }

    /**
     * Gets the value of the ar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAr() {
        return ar;
    }

    /**
     * Sets the value of the ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAr(Integer value) {
        this.ar = value;
    }

    /**
     * Gets the value of the cartao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCartao() {
        return cartao;
    }

    /**
     * Sets the value of the cartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCartao(Long value) {
        this.cartao = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumero(Integer value) {
        this.numero = value;
    }

    /**
     * Gets the value of the objCol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objCol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjCol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjetoTO }
     * 
     * 
     */
    public List<ObjetoTO> getObjCol() {
        if (objCol == null) {
            objCol = new ArrayList<ObjetoTO>();
        }
        return this.objCol;
    }

    /**
     * Gets the value of the servicoAdicional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicoAdicional() {
        return servicoAdicional;
    }

    /**
     * Sets the value of the servicoAdicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicoAdicional(String value) {
        this.servicoAdicional = value;
    }

}
