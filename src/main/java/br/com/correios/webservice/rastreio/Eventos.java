
package br.com.correios.webservice.rastreio;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventos complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="eventos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalhe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recebedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amazoncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amazontimezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://resource.webservice.correios.com.br/}destino" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://resource.webservice.correios.com.br/}endereco" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventos", propOrder = {
    "tipo",
    "status",
    "data",
    "hora",
    "descricao",
    "detalhe",
    "recebedor",
    "documento",
    "comentario",
    "local",
    "codigo",
    "cidade",
    "uf",
    "sto",
    "amazoncode",
    "amazontimezone",
    "destino",
    "endereco"
})
public class Eventos {

    protected String tipo;
    protected String status;
    protected String data;
    protected String hora;
    protected String descricao;
    protected String detalhe;
    protected String recebedor;
    protected String documento;
    protected String comentario;
    protected String local;
    protected String codigo;
    protected String cidade;
    protected String uf;
    protected String sto;
    protected String amazoncode;
    protected String amazontimezone;
    @XmlElement
    protected List<Destinos> destino;
    @XmlElement
    protected EnderecoMobile endereco;

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
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the detalhe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDetalhe() {
        return detalhe;
    }

    /**
     * Sets the value of the detalhe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDetalhe(String value) {
        this.detalhe = value;
    }

    /**
     * Gets the value of the recebedor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRecebedor() {
        return recebedor;
    }

    /**
     * Sets the value of the recebedor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRecebedor(String value) {
        this.recebedor = value;
    }

    /**
     * Gets the value of the documento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Gets the value of the comentario property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Sets the value of the comentario property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Gets the value of the local property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Gets the value of the codigo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the cidade property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Gets the value of the uf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Gets the value of the sto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSto() {
        return sto;
    }

    /**
     * Sets the value of the sto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSto(String value) {
        this.sto = value;
    }

    /**
     * Gets the value of the amazoncode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAmazoncode() {
        return amazoncode;
    }

    /**
     * Sets the value of the amazoncode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAmazoncode(String value) {
        this.amazoncode = value;
    }

    /**
     * Gets the value of the amazontimezone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAmazontimezone() {
        return amazontimezone;
    }

    /**
     * Sets the value of the amazontimezone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAmazontimezone(String value) {
        this.amazontimezone = value;
    }

    /**
     * Gets the value of the destino property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destino property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestino().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destinos }
     *
     *
     */
    public List<Destinos> getDestino() {
        if (destino == null) {
            destino = new ArrayList<Destinos>();
        }
        return this.destino;
    }

    /**
     * Gets the value of the endereco property.
     *
     * @return
     *     possible object is
     *     {@link EnderecoMobile }
     *
     */
    public EnderecoMobile getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     *
     * @param value
     *     allowed object is
     *     {@link EnderecoMobile }
     *
     */
    public void setEndereco(EnderecoMobile value) {
        this.endereco = value;
    }

}
