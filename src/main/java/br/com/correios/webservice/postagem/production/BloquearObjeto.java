
package br.com.correios.webservice.postagem.production;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bloquearObjeto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bloquearObjeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroEtiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPlp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoBloqueio" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}tipoBloqueio" minOccurs="0"/>
 *         &lt;element name="acao" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}acao" minOccurs="0"/>
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
@XmlType(name = "bloquearObjeto", propOrder = {
    "numeroEtiqueta",
    "idPlp",
    "tipoBloqueio",
    "acao",
    "usuario",
    "senha"
})
public class BloquearObjeto {

    protected String numeroEtiqueta;
    protected Long idPlp;
    @XmlSchemaType(name = "string")
    protected TipoBloqueio tipoBloqueio;
    @XmlSchemaType(name = "string")
    protected Acao acao;
    protected String usuario;
    protected String senha;

    /**
     * Gets the value of the numeroEtiqueta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEtiqueta() {
        return numeroEtiqueta;
    }

    /**
     * Sets the value of the numeroEtiqueta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEtiqueta(String value) {
        this.numeroEtiqueta = value;
    }

    /**
     * Gets the value of the idPlp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPlp() {
        return idPlp;
    }

    /**
     * Sets the value of the idPlp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPlp(Long value) {
        this.idPlp = value;
    }

    /**
     * Gets the value of the tipoBloqueio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBloqueio }
     *     
     */
    public TipoBloqueio getTipoBloqueio() {
        return tipoBloqueio;
    }

    /**
     * Sets the value of the tipoBloqueio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBloqueio }
     *     
     */
    public void setTipoBloqueio(TipoBloqueio value) {
        this.tipoBloqueio = value;
    }

    /**
     * Gets the value of the acao property.
     * 
     * @return
     *     possible object is
     *     {@link Acao }
     *     
     */
    public Acao getAcao() {
        return acao;
    }

    /**
     * Sets the value of the acao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acao }
     *     
     */
    public void setAcao(Acao value) {
        this.acao = value;
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
