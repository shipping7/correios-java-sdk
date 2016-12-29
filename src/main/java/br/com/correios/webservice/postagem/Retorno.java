
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retorno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retorno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPI" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPrazoResposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataResposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataUltimaRecorrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mensagemRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retorno", propOrder = {
    "codigoPI",
    "codigoRegistro",
    "codigoRetorno",
    "dataPrazoResposta",
    "dataRegistro",
    "dataResposta",
    "dataUltimaRecorrencia",
    "id",
    "mensagemRetorno",
    "resposta"
})
public class Retorno {

    protected Long codigoPI;
    protected String codigoRegistro;
    protected String codigoRetorno;
    protected String dataPrazoResposta;
    protected String dataRegistro;
    protected String dataResposta;
    protected String dataUltimaRecorrencia;
    protected Long id;
    protected String mensagemRetorno;
    protected String resposta;

    /**
     * Gets the value of the codigoPI property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoPI() {
        return codigoPI;
    }

    /**
     * Sets the value of the codigoPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoPI(Long value) {
        this.codigoPI = value;
    }

    /**
     * Gets the value of the codigoRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    /**
     * Sets the value of the codigoRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegistro(String value) {
        this.codigoRegistro = value;
    }

    /**
     * Gets the value of the codigoRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    /**
     * Sets the value of the codigoRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRetorno(String value) {
        this.codigoRetorno = value;
    }

    /**
     * Gets the value of the dataPrazoResposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrazoResposta() {
        return dataPrazoResposta;
    }

    /**
     * Sets the value of the dataPrazoResposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrazoResposta(String value) {
        this.dataPrazoResposta = value;
    }

    /**
     * Gets the value of the dataRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRegistro() {
        return dataRegistro;
    }

    /**
     * Sets the value of the dataRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRegistro(String value) {
        this.dataRegistro = value;
    }

    /**
     * Gets the value of the dataResposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataResposta() {
        return dataResposta;
    }

    /**
     * Sets the value of the dataResposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataResposta(String value) {
        this.dataResposta = value;
    }

    /**
     * Gets the value of the dataUltimaRecorrencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimaRecorrencia() {
        return dataUltimaRecorrencia;
    }

    /**
     * Sets the value of the dataUltimaRecorrencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimaRecorrencia(String value) {
        this.dataUltimaRecorrencia = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the mensagemRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemRetorno() {
        return mensagemRetorno;
    }

    /**
     * Sets the value of the mensagemRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemRetorno(String value) {
        this.mensagemRetorno = value;
    }

    /**
     * Gets the value of the resposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResposta() {
        return resposta;
    }

    /**
     * Sets the value of the resposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResposta(String value) {
        this.resposta = value;
    }

}
