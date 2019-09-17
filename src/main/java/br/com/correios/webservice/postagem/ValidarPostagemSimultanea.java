
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validarPostagemSimultanea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validarPostagemSimultanea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoServico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idCartaoPostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coleta" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}coletaSimultanea" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarPostagemSimultanea", propOrder = {
    "codAdministrativo",
    "codigoServico",
    "idCartaoPostagem",
    "cepDestinatario",
    "coleta",
    "usuario",
    "senha"
})
public class ValidarPostagemSimultanea {

    protected Integer codAdministrativo;
    protected Integer codigoServico;
    protected String idCartaoPostagem;
    protected String cepDestinatario;
    protected ColetaSimultanea coleta;
    protected String usuario;
    protected String senha;

    /**
     * Gets the value of the codAdministrativo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAdministrativo() {
        return codAdministrativo;
    }

    /**
     * Sets the value of the codAdministrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAdministrativo(Integer value) {
        this.codAdministrativo = value;
    }

    /**
     * Gets the value of the codigoServico property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoServico() {
        return codigoServico;
    }

    /**
     * Sets the value of the codigoServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoServico(Integer value) {
        this.codigoServico = value;
    }

    /**
     * Gets the value of the idCartaoPostagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCartaoPostagem() {
        return idCartaoPostagem;
    }

    /**
     * Sets the value of the idCartaoPostagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCartaoPostagem(String value) {
        this.idCartaoPostagem = value;
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
     * Gets the value of the coleta property.
     * 
     * @return
     *     possible object is
     *     {@link ColetaSimultanea }
     *     
     */
    public ColetaSimultanea getColeta() {
        return coleta;
    }

    /**
     * Sets the value of the coleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColetaSimultanea }
     *     
     */
    public void setColeta(ColetaSimultanea value) {
        this.coleta = value;
    }

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

}
