
package br.com.correios.webservice.postagem.production;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coletaTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coletaTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cklist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="produto" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}produtoTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remetente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}remetenteTO" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor_declarado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaTO", propOrder = {
    "cklist",
    "descricao",
    "idCliente",
    "produto",
    "remetente",
    "tipo",
    "valorDeclarado"
})
@XmlSeeAlso({
    ColetaReversaTO.class,
    ColetaSimultaneaTO.class
})
public class ColetaTO {

    protected String cklist;
    protected String descricao;
    @XmlElement(name = "id_cliente")
    protected String idCliente;
    @XmlElement(nillable = true)
    protected List<ProdutoTO> produto;
    protected RemetenteTO remetente;
    protected String tipo;
    @XmlElement(name = "valor_declarado")
    protected String valorDeclarado;

    /**
     * Gets the value of the cklist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCklist() {
        return cklist;
    }

    /**
     * Sets the value of the cklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCklist(String value) {
        this.cklist = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the idCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the produto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdutoTO }
     * 
     * 
     */
    public List<ProdutoTO> getProduto() {
        if (produto == null) {
            produto = new ArrayList<ProdutoTO>();
        }
        return this.produto;
    }

    /**
     * Gets the value of the remetente property.
     * 
     * @return
     *     possible object is
     *     {@link RemetenteTO }
     *     
     */
    public RemetenteTO getRemetente() {
        return remetente;
    }

    /**
     * Sets the value of the remetente property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemetenteTO }
     *     
     */
    public void setRemetente(RemetenteTO value) {
        this.remetente = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the valorDeclarado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Sets the value of the valorDeclarado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDeclarado(String value) {
        this.valorDeclarado = value;
    }

}
