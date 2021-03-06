//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.03.07 at 04:22:37 PM BRT
//


package br.com.correios.api.postagem.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;
import org.eclipse.persistence.oxm.annotations.XmlMarshalNullRepresentation;
import org.eclipse.persistence.oxm.annotations.XmlNullPolicy;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}bairro_destinatario"/>
 *         &lt;element ref="{}cidade_destinatario"/>
 *         &lt;element ref="{}uf_destinatario"/>
 *         &lt;element ref="{}cep_destinatario"/>
 *         &lt;element ref="{}codigo_usuario_postal"/>
 *         &lt;element ref="{}centro_custo_cliente"/>
 *         &lt;element ref="{}numero_nota_fiscal"/>
 *         &lt;element ref="{}serie_nota_fiscal"/>
 *         &lt;element ref="{}valor_nota_fiscal"/>
 *         &lt;element ref="{}natureza_nota_fiscal"/>
 *         &lt;element ref="{}descricao_objeto"/>
 *         &lt;element ref="{}valor_a_cobrar"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bairroDestinatario",
    "cidadeDestinatario",
    "ufDestinatario",
    "cepDestinatario",
    "codigoUsuarioPostal",
    "centroCustoCliente",
    "numeroNotaFiscal",
    "serieNotaFiscal",
    "valorNotaFiscal",
    "naturezaNotaFiscal",
    "descricaoObjeto",
    "valorACobrar"
})
@XmlRootElement(name = "nacional")
public class Nacional {

    @XmlElement(name = "bairro_destinatario", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    @XmlCDATA
    protected String bairroDestinatario;

    @XmlElement(name = "cidade_destinatario", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    @XmlCDATA
    protected String cidadeDestinatario;

    @XmlElement(name = "uf_destinatario", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String ufDestinatario;

    @XmlElement(name = "cep_destinatario", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    @XmlCDATA
    protected String cepDestinatario;

    @XmlElement(name = "codigo_usuario_postal", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String codigoUsuarioPostal;

    @XmlElement(name = "centro_custo_cliente", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String centroCustoCliente;

    @XmlElement(name = "numero_nota_fiscal", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String numeroNotaFiscal;

    @XmlElement(name = "serie_nota_fiscal", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String serieNotaFiscal;

    @XmlElement(name = "valor_nota_fiscal", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String valorNotaFiscal;

    @XmlElement(name = "natureza_nota_fiscal", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String naturezaNotaFiscal;

    @XmlElement(name = "descricao_objeto", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    @XmlCDATA
    protected String descricaoObjeto;

    @XmlElement(name = "valor_a_cobrar", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String valorACobrar;

    /**
     * Gets the value of the bairroDestinatario property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBairroDestinatario() {
        return bairroDestinatario;
    }

    /**
     * Sets the value of the bairroDestinatario property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBairroDestinatario(String value) {
        this.bairroDestinatario = value;
    }

    /**
     * Gets the value of the cidadeDestinatario property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCidadeDestinatario() {
        return cidadeDestinatario;
    }

    /**
     * Sets the value of the cidadeDestinatario property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCidadeDestinatario(String value) {
        this.cidadeDestinatario = value;
    }

    /**
     * Gets the value of the ufDestinatario property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUfDestinatario() {
        return ufDestinatario;
    }

    /**
     * Sets the value of the ufDestinatario property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUfDestinatario(String value) {
        this.ufDestinatario = value;
    }

    /**
     * Gets the value of the cepDestinatario property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCepDestinatario() {
        return cepDestinatario;
    }

    /**
     * Sets the value of the cepDestinatario property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCepDestinatario(String value) {
        this.cepDestinatario = value;
    }

    /**
     * Gets the value of the codigoUsuarioPostal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoUsuarioPostal() {
        return codigoUsuarioPostal;
    }

    /**
     * Sets the value of the codigoUsuarioPostal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoUsuarioPostal(String value) {
        this.codigoUsuarioPostal = value;
    }

    /**
     * Gets the value of the centroCustoCliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCentroCustoCliente() {
        return centroCustoCliente;
    }

    /**
     * Sets the value of the centroCustoCliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCentroCustoCliente(String value) {
        this.centroCustoCliente = value;
    }

    /**
     * Gets the value of the numeroNotaFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    /**
     * Sets the value of the numeroNotaFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroNotaFiscal(String value) {
        this.numeroNotaFiscal = value;
    }

    /**
     * Gets the value of the serieNotaFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSerieNotaFiscal() {
        return serieNotaFiscal;
    }

    /**
     * Sets the value of the serieNotaFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSerieNotaFiscal(String value) {
        this.serieNotaFiscal = value;
    }

    /**
     * Gets the value of the valorNotaFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValorNotaFiscal() {
        return valorNotaFiscal;
    }

    /**
     * Sets the value of the valorNotaFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValorNotaFiscal(String value) {
        this.valorNotaFiscal = value;
    }

    /**
     * Gets the value of the naturezaNotaFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNaturezaNotaFiscal() {
        return naturezaNotaFiscal;
    }

    /**
     * Sets the value of the naturezaNotaFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNaturezaNotaFiscal(String value) {
        this.naturezaNotaFiscal = value;
    }

    /**
     * Gets the value of the descricaoObjeto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescricaoObjeto() {
        return descricaoObjeto;
    }

    /**
     * Sets the value of the descricaoObjeto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescricaoObjeto(String value) {
        this.descricaoObjeto = value;
    }

    /**
     * Gets the value of the valorACobrar property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValorACobrar() {
        return valorACobrar;
    }

    /**
     * Sets the value of the valorACobrar property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValorACobrar(String value) {
        this.valorACobrar = value;
    }

}
