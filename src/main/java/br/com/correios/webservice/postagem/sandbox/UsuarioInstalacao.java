
package br.com.correios.webservice.postagem.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for usuarioInstalacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usuarioInstalacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataSenha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gerenteMaster" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}gerenteConta" minOccurs="0"/>
 *         &lt;element name="hashSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametros" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}parametroMaster" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusUsuario" minOccurs="0"/>
 *         &lt;element name="validade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarioInstalacao", propOrder = {
    "dataAtualizacao",
    "dataInclusao",
    "dataSenha",
    "gerenteMaster",
    "hashSenha",
    "id",
    "login",
    "nome",
    "parametros",
    "senha",
    "status",
    "validade"
})
public class UsuarioInstalacao {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInclusao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSenha;
    protected GerenteConta gerenteMaster;
    protected String hashSenha;
    protected Long id;
    protected String login;
    protected String nome;
    @XmlElement(nillable = true)
    protected List<ParametroMaster> parametros;
    protected String senha;
    @XmlSchemaType(name = "string")
    protected StatusUsuario status;
    protected String validade;

    /**
     * Gets the value of the dataAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Sets the value of the dataAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacao(XMLGregorianCalendar value) {
        this.dataAtualizacao = value;
    }

    /**
     * Gets the value of the dataInclusao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInclusao() {
        return dataInclusao;
    }

    /**
     * Sets the value of the dataInclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInclusao(XMLGregorianCalendar value) {
        this.dataInclusao = value;
    }

    /**
     * Gets the value of the dataSenha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSenha() {
        return dataSenha;
    }

    /**
     * Sets the value of the dataSenha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSenha(XMLGregorianCalendar value) {
        this.dataSenha = value;
    }

    /**
     * Gets the value of the gerenteMaster property.
     * 
     * @return
     *     possible object is
     *     {@link GerenteConta }
     *     
     */
    public GerenteConta getGerenteMaster() {
        return gerenteMaster;
    }

    /**
     * Sets the value of the gerenteMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link GerenteConta }
     *     
     */
    public void setGerenteMaster(GerenteConta value) {
        this.gerenteMaster = value;
    }

    /**
     * Gets the value of the hashSenha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashSenha() {
        return hashSenha;
    }

    /**
     * Sets the value of the hashSenha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashSenha(String value) {
        this.hashSenha = value;
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
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
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
     * Gets the value of the parametros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroMaster }
     * 
     * 
     */
    public List<ParametroMaster> getParametros() {
        if (parametros == null) {
            parametros = new ArrayList<ParametroMaster>();
        }
        return this.parametros;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusUsuario }
     *     
     */
    public StatusUsuario getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusUsuario }
     *     
     */
    public void setStatus(StatusUsuario value) {
        this.status = value;
    }

    /**
     * Gets the value of the validade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidade() {
        return validade;
    }

    /**
     * Sets the value of the validade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidade(String value) {
        this.validade = value;
    }

}
