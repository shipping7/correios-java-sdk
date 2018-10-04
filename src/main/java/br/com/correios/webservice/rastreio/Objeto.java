
package br.com.correios.webservice.rastreio;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objeto complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="objeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://resource.webservice.correios.com.br/}evento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objeto", propOrder = {
    "numero",
    "sigla",
    "nome",
    "categoria",
    "erro",
    "evento"
})
public class Objeto {

    protected String numero;
    protected String sigla;
    protected String nome;
    protected String categoria;
    protected String erro;
    @XmlElement
    protected List<Eventos> evento;

    /**
     * Gets the value of the numero property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the sigla property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Sets the value of the sigla property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSigla(String value) {
        this.sigla = value;
    }

    /**
     * Gets the value of the nome property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the categoria property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the erro property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErro() {
        return erro;
    }

    /**
     * Sets the value of the erro property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErro(String value) {
        this.erro = value;
    }

    /**
     * Gets the value of the evento property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evento property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvento().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Eventos }
     *
     *
     */
    public List<Eventos> getEvento() {
        if (evento == null) {
            evento = new ArrayList<Eventos>();
        }
        return this.evento;
    }

}
