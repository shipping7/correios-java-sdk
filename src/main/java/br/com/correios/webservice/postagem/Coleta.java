
package br.com.correios.webservice.postagem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coleta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coleta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cklist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="produto" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}produto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remetente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}remetente" minOccurs="0"/>
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
@XmlType(name = "coleta", propOrder = {
    "cklist",
    "descricao",
    "documento",
    "idCliente",
    "produto",
    "remetente",
    "tipo",
    "valorDeclarado"
})
@XmlSeeAlso({
    ColetaSimultanea.class,
    ColetaReversa.class
})
public class Coleta {

    protected String cklist;
    protected String descricao;
    @XmlElement(nillable = true)
    protected List<String> documento;
    @XmlElement(name = "id_cliente")
    protected String idCliente;
    @XmlElement(nillable = true)
    protected List<Produto> produto;
    protected Remetente remetente;
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
     * Gets the value of the documento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocumento() {
        if (documento == null) {
            documento = new ArrayList<String>();
        }
        return this.documento;
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
     * {@link Produto }
     * 
     * 
     */
    public List<Produto> getProduto() {
        if (produto == null) {
            produto = new ArrayList<Produto>();
        }
        return this.produto;
    }

    /**
     * Gets the value of the remetente property.
     * 
     * @return
     *     possible object is
     *     {@link Remetente }
     *     
     */
    public Remetente getRemetente() {
        return remetente;
    }

    /**
     * Sets the value of the remetente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remetente }
     *     
     */
    public void setRemetente(Remetente value) {
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
