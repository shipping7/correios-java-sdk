
package br.com.correios.webservice.rastreio;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sroxml complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="sroxml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoPesquisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://resource.webservice.correios.com.br/}objeto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sroxml", propOrder = {
    "versao",
    "qtd",
    "tipoPesquisa",
    "tipoResultado",
    "objeto"
})
public class EventosDosCorreios {

    protected String versao;
    protected String qtd;
    @XmlElement(name = "TipoPesquisa")
    protected String tipoPesquisa;
    @XmlElement(name = "TipoResultado")
    protected String tipoResultado;
    @XmlElement
    protected List<Objeto> objeto;

    /**
     * Gets the value of the versao property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Gets the value of the qtd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQtd() {
        return qtd;
    }

    /**
     * Sets the value of the qtd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQtd(String value) {
        this.qtd = value;
    }

    /**
     * Gets the value of the tipoPesquisa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoPesquisa() {
        return tipoPesquisa;
    }

    /**
     * Sets the value of the tipoPesquisa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoPesquisa(String value) {
        this.tipoPesquisa = value;
    }

    /**
     * Gets the value of the tipoResultado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoResultado() {
        return tipoResultado;
    }

    /**
     * Sets the value of the tipoResultado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoResultado(String value) {
        this.tipoResultado = value;
    }

    /**
     * Gets the value of the objeto property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objeto property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjeto().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objeto }
     *
     *
     */
    public List<Objeto> getObjeto() {
        if (objeto == null) {
            objeto = new ArrayList<Objeto>();
        }
        return this.objeto;
    }

}
