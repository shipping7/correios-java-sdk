
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for valePostal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valePostal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cidNoCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctcCoAadministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctcNuContrato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ctcNuContratoEct" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cvpEdBairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvpEdCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvpEdComplemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvpEdNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvpNoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvpNuCep" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descricaoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estSgEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monVarTarifaAdicional" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monVarTarifaServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monVarValorDescontos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monVarValorImposto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prsCoProdutoServico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pveNu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pveOrgNuAgencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pveOrgNuAgenciaDes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pveOrgNuAgenciaOri" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="retornaCodErro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sitNoSituacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tlgTxDescricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vapDhTransacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vapNuEtiquetaEncomenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vapVrCobradoEct" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vapVrNominal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valePostal", propOrder = {
    "cidNoCidade",
    "ctcCoAadministrativo",
    "ctcNuContrato",
    "ctcNuContratoEct",
    "cvpEdBairro",
    "cvpEdCliente",
    "cvpEdComplemento",
    "cvpEdNumero",
    "cvpNoCliente",
    "cvpNuCep",
    "descricaoErro",
    "estSgEstado",
    "monVarTarifaAdicional",
    "monVarTarifaServico",
    "monVarValorDescontos",
    "monVarValorImposto",
    "prsCoProdutoServico",
    "pveNu",
    "pveOrgNuAgencia",
    "pveOrgNuAgenciaDes",
    "pveOrgNuAgenciaOri",
    "retornaCodErro",
    "sitNoSituacao",
    "tlgTxDescricao",
    "vapDhTransacao",
    "vapNuEtiquetaEncomenda",
    "vapVrCobradoEct",
    "vapVrNominal"
})
public class ValePostal {

    protected String cidNoCidade;
    protected String ctcCoAadministrativo;
    protected Long ctcNuContrato;
    protected Long ctcNuContratoEct;
    protected String cvpEdBairro;
    protected String cvpEdCliente;
    protected String cvpEdComplemento;
    protected String cvpEdNumero;
    protected String cvpNoCliente;
    protected Long cvpNuCep;
    protected String descricaoErro;
    protected String estSgEstado;
    protected int monVarTarifaAdicional;
    protected int monVarTarifaServico;
    protected int monVarValorDescontos;
    protected int monVarValorImposto;
    protected Long prsCoProdutoServico;
    protected Long pveNu;
    protected Long pveOrgNuAgencia;
    protected Long pveOrgNuAgenciaDes;
    protected Long pveOrgNuAgenciaOri;
    protected int retornaCodErro;
    protected String sitNoSituacao;
    protected String tlgTxDescricao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vapDhTransacao;
    protected String vapNuEtiquetaEncomenda;
    protected Double vapVrCobradoEct;
    protected Double vapVrNominal;

    /**
     * Gets the value of the cidNoCidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidNoCidade() {
        return cidNoCidade;
    }

    /**
     * Sets the value of the cidNoCidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidNoCidade(String value) {
        this.cidNoCidade = value;
    }

    /**
     * Gets the value of the ctcCoAadministrativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtcCoAadministrativo() {
        return ctcCoAadministrativo;
    }

    /**
     * Sets the value of the ctcCoAadministrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtcCoAadministrativo(String value) {
        this.ctcCoAadministrativo = value;
    }

    /**
     * Gets the value of the ctcNuContrato property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCtcNuContrato() {
        return ctcNuContrato;
    }

    /**
     * Sets the value of the ctcNuContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCtcNuContrato(Long value) {
        this.ctcNuContrato = value;
    }

    /**
     * Gets the value of the ctcNuContratoEct property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCtcNuContratoEct() {
        return ctcNuContratoEct;
    }

    /**
     * Sets the value of the ctcNuContratoEct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCtcNuContratoEct(Long value) {
        this.ctcNuContratoEct = value;
    }

    /**
     * Gets the value of the cvpEdBairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpEdBairro() {
        return cvpEdBairro;
    }

    /**
     * Sets the value of the cvpEdBairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpEdBairro(String value) {
        this.cvpEdBairro = value;
    }

    /**
     * Gets the value of the cvpEdCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpEdCliente() {
        return cvpEdCliente;
    }

    /**
     * Sets the value of the cvpEdCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpEdCliente(String value) {
        this.cvpEdCliente = value;
    }

    /**
     * Gets the value of the cvpEdComplemento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpEdComplemento() {
        return cvpEdComplemento;
    }

    /**
     * Sets the value of the cvpEdComplemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpEdComplemento(String value) {
        this.cvpEdComplemento = value;
    }

    /**
     * Gets the value of the cvpEdNumero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpEdNumero() {
        return cvpEdNumero;
    }

    /**
     * Sets the value of the cvpEdNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpEdNumero(String value) {
        this.cvpEdNumero = value;
    }

    /**
     * Gets the value of the cvpNoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpNoCliente() {
        return cvpNoCliente;
    }

    /**
     * Sets the value of the cvpNoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpNoCliente(String value) {
        this.cvpNoCliente = value;
    }

    /**
     * Gets the value of the cvpNuCep property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCvpNuCep() {
        return cvpNuCep;
    }

    /**
     * Sets the value of the cvpNuCep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCvpNuCep(Long value) {
        this.cvpNuCep = value;
    }

    /**
     * Gets the value of the descricaoErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoErro() {
        return descricaoErro;
    }

    /**
     * Sets the value of the descricaoErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoErro(String value) {
        this.descricaoErro = value;
    }

    /**
     * Gets the value of the estSgEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstSgEstado() {
        return estSgEstado;
    }

    /**
     * Sets the value of the estSgEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstSgEstado(String value) {
        this.estSgEstado = value;
    }

    /**
     * Gets the value of the monVarTarifaAdicional property.
     * 
     */
    public int getMonVarTarifaAdicional() {
        return monVarTarifaAdicional;
    }

    /**
     * Sets the value of the monVarTarifaAdicional property.
     * 
     */
    public void setMonVarTarifaAdicional(int value) {
        this.monVarTarifaAdicional = value;
    }

    /**
     * Gets the value of the monVarTarifaServico property.
     * 
     */
    public int getMonVarTarifaServico() {
        return monVarTarifaServico;
    }

    /**
     * Sets the value of the monVarTarifaServico property.
     * 
     */
    public void setMonVarTarifaServico(int value) {
        this.monVarTarifaServico = value;
    }

    /**
     * Gets the value of the monVarValorDescontos property.
     * 
     */
    public int getMonVarValorDescontos() {
        return monVarValorDescontos;
    }

    /**
     * Sets the value of the monVarValorDescontos property.
     * 
     */
    public void setMonVarValorDescontos(int value) {
        this.monVarValorDescontos = value;
    }

    /**
     * Gets the value of the monVarValorImposto property.
     * 
     */
    public int getMonVarValorImposto() {
        return monVarValorImposto;
    }

    /**
     * Sets the value of the monVarValorImposto property.
     * 
     */
    public void setMonVarValorImposto(int value) {
        this.monVarValorImposto = value;
    }

    /**
     * Gets the value of the prsCoProdutoServico property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrsCoProdutoServico() {
        return prsCoProdutoServico;
    }

    /**
     * Sets the value of the prsCoProdutoServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrsCoProdutoServico(Long value) {
        this.prsCoProdutoServico = value;
    }

    /**
     * Gets the value of the pveNu property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPveNu() {
        return pveNu;
    }

    /**
     * Sets the value of the pveNu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPveNu(Long value) {
        this.pveNu = value;
    }

    /**
     * Gets the value of the pveOrgNuAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPveOrgNuAgencia() {
        return pveOrgNuAgencia;
    }

    /**
     * Sets the value of the pveOrgNuAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPveOrgNuAgencia(Long value) {
        this.pveOrgNuAgencia = value;
    }

    /**
     * Gets the value of the pveOrgNuAgenciaDes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPveOrgNuAgenciaDes() {
        return pveOrgNuAgenciaDes;
    }

    /**
     * Sets the value of the pveOrgNuAgenciaDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPveOrgNuAgenciaDes(Long value) {
        this.pveOrgNuAgenciaDes = value;
    }

    /**
     * Gets the value of the pveOrgNuAgenciaOri property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPveOrgNuAgenciaOri() {
        return pveOrgNuAgenciaOri;
    }

    /**
     * Sets the value of the pveOrgNuAgenciaOri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPveOrgNuAgenciaOri(Long value) {
        this.pveOrgNuAgenciaOri = value;
    }

    /**
     * Gets the value of the retornaCodErro property.
     * 
     */
    public int getRetornaCodErro() {
        return retornaCodErro;
    }

    /**
     * Sets the value of the retornaCodErro property.
     * 
     */
    public void setRetornaCodErro(int value) {
        this.retornaCodErro = value;
    }

    /**
     * Gets the value of the sitNoSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitNoSituacao() {
        return sitNoSituacao;
    }

    /**
     * Sets the value of the sitNoSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitNoSituacao(String value) {
        this.sitNoSituacao = value;
    }

    /**
     * Gets the value of the tlgTxDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlgTxDescricao() {
        return tlgTxDescricao;
    }

    /**
     * Sets the value of the tlgTxDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlgTxDescricao(String value) {
        this.tlgTxDescricao = value;
    }

    /**
     * Gets the value of the vapDhTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVapDhTransacao() {
        return vapDhTransacao;
    }

    /**
     * Sets the value of the vapDhTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVapDhTransacao(XMLGregorianCalendar value) {
        this.vapDhTransacao = value;
    }

    /**
     * Gets the value of the vapNuEtiquetaEncomenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVapNuEtiquetaEncomenda() {
        return vapNuEtiquetaEncomenda;
    }

    /**
     * Sets the value of the vapNuEtiquetaEncomenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVapNuEtiquetaEncomenda(String value) {
        this.vapNuEtiquetaEncomenda = value;
    }

    /**
     * Gets the value of the vapVrCobradoEct property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVapVrCobradoEct() {
        return vapVrCobradoEct;
    }

    /**
     * Sets the value of the vapVrCobradoEct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVapVrCobradoEct(Double value) {
        this.vapVrCobradoEct = value;
    }

    /**
     * Gets the value of the vapVrNominal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVapVrNominal() {
        return vapVrNominal;
    }

    /**
     * Sets the value of the vapVrNominal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVapVrNominal(Double value) {
        this.vapVrNominal = value;
    }

}
