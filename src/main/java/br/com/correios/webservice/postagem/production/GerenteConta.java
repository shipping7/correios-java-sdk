
package br.com.correios.webservice.postagem.production;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for gerenteConta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gerenteConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientesVisiveis" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}clienteERP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataSenha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusGerente" minOccurs="0"/>
 *         &lt;element name="tipoGerente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}tipoGerente" minOccurs="0"/>
 *         &lt;element name="usuariosInstalacao" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}usuarioInstalacao" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "gerenteConta", propOrder = {
    "clientesVisiveis",
    "dataAtualizacao",
    "dataInclusao",
    "dataSenha",
    "login",
    "matricula",
    "senha",
    "status",
    "tipoGerente",
    "usuariosInstalacao",
    "validade"
})
public class GerenteConta {

    @XmlElement(nillable = true)
    protected List<ClienteERP> clientesVisiveis;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInclusao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSenha;
    protected String login;
    protected String matricula;
    protected String senha;
    @XmlSchemaType(name = "string")
    protected StatusGerente status;
    @XmlSchemaType(name = "string")
    protected TipoGerente tipoGerente;
    @XmlElement(nillable = true)
    protected List<UsuarioInstalacao> usuariosInstalacao;
    protected String validade;

    /**
     * Gets the value of the clientesVisiveis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientesVisiveis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientesVisiveis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClienteERP }
     * 
     * 
     */
    public List<ClienteERP> getClientesVisiveis() {
        if (clientesVisiveis == null) {
            clientesVisiveis = new ArrayList<ClienteERP>();
        }
        return this.clientesVisiveis;
    }

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
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
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
     *     {@link StatusGerente }
     *     
     */
    public StatusGerente getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusGerente }
     *     
     */
    public void setStatus(StatusGerente value) {
        this.status = value;
    }

    /**
     * Gets the value of the tipoGerente property.
     * 
     * @return
     *     possible object is
     *     {@link TipoGerente }
     *     
     */
    public TipoGerente getTipoGerente() {
        return tipoGerente;
    }

    /**
     * Sets the value of the tipoGerente property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoGerente }
     *     
     */
    public void setTipoGerente(TipoGerente value) {
        this.tipoGerente = value;
    }

    /**
     * Gets the value of the usuariosInstalacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuariosInstalacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuariosInstalacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioInstalacao }
     * 
     * 
     */
    public List<UsuarioInstalacao> getUsuariosInstalacao() {
        if (usuariosInstalacao == null) {
            usuariosInstalacao = new ArrayList<UsuarioInstalacao>();
        }
        return this.usuariosInstalacao;
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
