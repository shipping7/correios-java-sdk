
package br.com.correios.webservice.rastreio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RastroJson complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RastroJson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lingua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objetos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rastroJson", name = "RastroJson", propOrder = {
    "usuario",
    "senha",
    "tipo",
    "resultado",
    "lingua",
    "objetos"
})
public class RastroJson {

    protected String usuario;
    protected String senha;
    protected String tipo;
    protected String resultado;
    protected String lingua;
    protected String objetos;

    /**
     * Gets the value of the usuario property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the senha property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSenha(String value) {
        this.senha = value;
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
     * Gets the value of the resultado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the lingua property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLingua() {
        return lingua;
    }

    /**
     * Sets the value of the lingua property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLingua(String value) {
        this.lingua = value;
    }

    /**
     * Gets the value of the objetos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getObjetos() {
        return objetos;
    }

    /**
     * Sets the value of the objetos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setObjetos(String value) {
        this.objetos = value;
    }

}
