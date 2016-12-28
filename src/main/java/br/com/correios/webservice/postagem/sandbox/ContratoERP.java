
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
 * <p>Java class for contratoERP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contratoERP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cartoesPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}cartaoPostagemERP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}clienteERP" minOccurs="0"/>
 *         &lt;element name="codigoCliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoDiretoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contratoPK" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}contratoERPPK" minOccurs="0"/>
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataAtualizacaoDDMMYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataVigenciaFim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataVigenciaFimDDMMYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataVigenciaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataVigenciaInicioDDMMYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datajVigenciaFim" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datajVigenciaInicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descricaoDiretoriaRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diretoriaRegional" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}unidadePostagemERP" minOccurs="0"/>
 *         &lt;element name="horajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="statusCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contratoERP", propOrder = {
    "cartoesPostagem",
    "cliente",
    "codigoCliente",
    "codigoDiretoria",
    "contratoPK",
    "dataAtualizacao",
    "dataAtualizacaoDDMMYYYY",
    "dataVigenciaFim",
    "dataVigenciaFimDDMMYYYY",
    "dataVigenciaInicio",
    "dataVigenciaInicioDDMMYYYY",
    "datajAtualizacao",
    "datajVigenciaFim",
    "datajVigenciaInicio",
    "descricaoDiretoriaRegional",
    "descricaoStatus",
    "diretoriaRegional",
    "horajAtualizacao",
    "statusCodigo"
})
public class ContratoERP {

    @XmlElement(nillable = true)
    protected List<CartaoPostagemERP> cartoesPostagem;
    protected ClienteERP cliente;
    protected long codigoCliente;
    protected String codigoDiretoria;
    protected ContratoERPPK contratoPK;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacao;
    protected String dataAtualizacaoDDMMYYYY;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVigenciaFim;
    protected String dataVigenciaFimDDMMYYYY;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVigenciaInicio;
    protected String dataVigenciaInicioDDMMYYYY;
    protected Integer datajAtualizacao;
    protected Integer datajVigenciaFim;
    protected Integer datajVigenciaInicio;
    protected String descricaoDiretoriaRegional;
    protected String descricaoStatus;
    protected UnidadePostagemERP diretoriaRegional;
    protected Integer horajAtualizacao;
    protected String statusCodigo;

    /**
     * Gets the value of the cartoesPostagem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartoesPostagem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartoesPostagem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartaoPostagemERP }
     * 
     * 
     */
    public List<CartaoPostagemERP> getCartoesPostagem() {
        if (cartoesPostagem == null) {
            cartoesPostagem = new ArrayList<CartaoPostagemERP>();
        }
        return this.cartoesPostagem;
    }

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link ClienteERP }
     *     
     */
    public ClienteERP getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteERP }
     *     
     */
    public void setCliente(ClienteERP value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the codigoCliente property.
     * 
     */
    public long getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Sets the value of the codigoCliente property.
     * 
     */
    public void setCodigoCliente(long value) {
        this.codigoCliente = value;
    }

    /**
     * Gets the value of the codigoDiretoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDiretoria() {
        return codigoDiretoria;
    }

    /**
     * Sets the value of the codigoDiretoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDiretoria(String value) {
        this.codigoDiretoria = value;
    }

    /**
     * Gets the value of the contratoPK property.
     * 
     * @return
     *     possible object is
     *     {@link ContratoERPPK }
     *     
     */
    public ContratoERPPK getContratoPK() {
        return contratoPK;
    }

    /**
     * Sets the value of the contratoPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContratoERPPK }
     *     
     */
    public void setContratoPK(ContratoERPPK value) {
        this.contratoPK = value;
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
     * Gets the value of the dataAtualizacaoDDMMYYYY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtualizacaoDDMMYYYY() {
        return dataAtualizacaoDDMMYYYY;
    }

    /**
     * Sets the value of the dataAtualizacaoDDMMYYYY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtualizacaoDDMMYYYY(String value) {
        this.dataAtualizacaoDDMMYYYY = value;
    }

    /**
     * Gets the value of the dataVigenciaFim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVigenciaFim() {
        return dataVigenciaFim;
    }

    /**
     * Sets the value of the dataVigenciaFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVigenciaFim(XMLGregorianCalendar value) {
        this.dataVigenciaFim = value;
    }

    /**
     * Gets the value of the dataVigenciaFimDDMMYYYY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVigenciaFimDDMMYYYY() {
        return dataVigenciaFimDDMMYYYY;
    }

    /**
     * Sets the value of the dataVigenciaFimDDMMYYYY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVigenciaFimDDMMYYYY(String value) {
        this.dataVigenciaFimDDMMYYYY = value;
    }

    /**
     * Gets the value of the dataVigenciaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVigenciaInicio() {
        return dataVigenciaInicio;
    }

    /**
     * Sets the value of the dataVigenciaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVigenciaInicio(XMLGregorianCalendar value) {
        this.dataVigenciaInicio = value;
    }

    /**
     * Gets the value of the dataVigenciaInicioDDMMYYYY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVigenciaInicioDDMMYYYY() {
        return dataVigenciaInicioDDMMYYYY;
    }

    /**
     * Sets the value of the dataVigenciaInicioDDMMYYYY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVigenciaInicioDDMMYYYY(String value) {
        this.dataVigenciaInicioDDMMYYYY = value;
    }

    /**
     * Gets the value of the datajAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatajAtualizacao() {
        return datajAtualizacao;
    }

    /**
     * Sets the value of the datajAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatajAtualizacao(Integer value) {
        this.datajAtualizacao = value;
    }

    /**
     * Gets the value of the datajVigenciaFim property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatajVigenciaFim() {
        return datajVigenciaFim;
    }

    /**
     * Sets the value of the datajVigenciaFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatajVigenciaFim(Integer value) {
        this.datajVigenciaFim = value;
    }

    /**
     * Gets the value of the datajVigenciaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatajVigenciaInicio() {
        return datajVigenciaInicio;
    }

    /**
     * Sets the value of the datajVigenciaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatajVigenciaInicio(Integer value) {
        this.datajVigenciaInicio = value;
    }

    /**
     * Gets the value of the descricaoDiretoriaRegional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDiretoriaRegional() {
        return descricaoDiretoriaRegional;
    }

    /**
     * Sets the value of the descricaoDiretoriaRegional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDiretoriaRegional(String value) {
        this.descricaoDiretoriaRegional = value;
    }

    /**
     * Gets the value of the descricaoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoStatus() {
        return descricaoStatus;
    }

    /**
     * Sets the value of the descricaoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoStatus(String value) {
        this.descricaoStatus = value;
    }

    /**
     * Gets the value of the diretoriaRegional property.
     * 
     * @return
     *     possible object is
     *     {@link UnidadePostagemERP }
     *     
     */
    public UnidadePostagemERP getDiretoriaRegional() {
        return diretoriaRegional;
    }

    /**
     * Sets the value of the diretoriaRegional property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadePostagemERP }
     *     
     */
    public void setDiretoriaRegional(UnidadePostagemERP value) {
        this.diretoriaRegional = value;
    }

    /**
     * Gets the value of the horajAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorajAtualizacao() {
        return horajAtualizacao;
    }

    /**
     * Sets the value of the horajAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorajAtualizacao(Integer value) {
        this.horajAtualizacao = value;
    }

    /**
     * Gets the value of the statusCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCodigo() {
        return statusCodigo;
    }

    /**
     * Sets the value of the statusCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCodigo(String value) {
        this.statusCodigo = value;
    }

}
