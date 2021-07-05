
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retornoCancelamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retornoCancelamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo_administrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msg_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objeto_postal" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoSimplificado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoCancelamento", propOrder = {
    "codErro",
    "codigoAdministrativo",
    "data",
    "hora",
    "msgErro",
    "objetoPostal"
})
public class RetornoCancelamento {

    @XmlElement(name = "cod_erro")
    protected String codErro;
    @XmlElement(name = "codigo_administrativo")
    protected String codigoAdministrativo;
    protected String data;
    protected String hora;
    @XmlElement(name = "msg_erro")
    protected String msgErro;
    @XmlElement(name = "objeto_postal")
    protected ObjetoSimplificado objetoPostal;

    /**
     * Gets the value of the codErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodErro() {
        return codErro;
    }

    /**
     * Sets the value of the codErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodErro(String value) {
        this.codErro = value;
    }

    /**
     * Gets the value of the codigoAdministrativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAdministrativo() {
        return codigoAdministrativo;
    }

    /**
     * Sets the value of the codigoAdministrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAdministrativo(String value) {
        this.codigoAdministrativo = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the hora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Sets the value of the hora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Gets the value of the msgErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErro() {
        return msgErro;
    }

    /**
     * Sets the value of the msgErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErro(String value) {
        this.msgErro = value;
    }

    /**
     * Gets the value of the objetoPostal property.
     * 
     * @return
     *     possible object is
     *     {@link ObjetoSimplificado }
     *     
     */
    public ObjetoSimplificado getObjetoPostal() {
        return objetoPostal;
    }

    /**
     * Sets the value of the objetoPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjetoSimplificado }
     *     
     */
    public void setObjetoPostal(ObjetoSimplificado value) {
        this.objetoPostal = value;
    }

}
