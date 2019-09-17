
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculaTarifaServico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculaTarifaServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFormato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="comprimento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="largura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="diametro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codMaoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorDeclarado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codAvisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculaTarifaServico", propOrder = {
    "codAdministrativo",
    "usuario",
    "senha",
    "codServico",
    "cepOrigem",
    "cepDestino",
    "peso",
    "codFormato",
    "comprimento",
    "altura",
    "largura",
    "diametro",
    "codMaoPropria",
    "valorDeclarado",
    "codAvisoRecebimento"
})
public class CalculaTarifaServico {

    protected String codAdministrativo;
    protected String usuario;
    protected String senha;
    protected String codServico;
    protected String cepOrigem;
    protected String cepDestino;
    protected String peso;
    protected Integer codFormato;
    protected Double comprimento;
    protected Double altura;
    protected Double largura;
    protected Double diametro;
    protected String codMaoPropria;
    protected Double valorDeclarado;
    protected String codAvisoRecebimento;

    /**
     * Gets the value of the codAdministrativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAdministrativo() {
        return codAdministrativo;
    }

    /**
     * Sets the value of the codAdministrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAdministrativo(String value) {
        this.codAdministrativo = value;
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

    /**
     * Gets the value of the codServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodServico() {
        return codServico;
    }

    /**
     * Sets the value of the codServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodServico(String value) {
        this.codServico = value;
    }

    /**
     * Gets the value of the cepOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepOrigem() {
        return cepOrigem;
    }

    /**
     * Sets the value of the cepOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepOrigem(String value) {
        this.cepOrigem = value;
    }

    /**
     * Gets the value of the cepDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepDestino() {
        return cepDestino;
    }

    /**
     * Sets the value of the cepDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepDestino(String value) {
        this.cepDestino = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeso(String value) {
        this.peso = value;
    }

    /**
     * Gets the value of the codFormato property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodFormato() {
        return codFormato;
    }

    /**
     * Sets the value of the codFormato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodFormato(Integer value) {
        this.codFormato = value;
    }

    /**
     * Gets the value of the comprimento property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getComprimento() {
        return comprimento;
    }

    /**
     * Sets the value of the comprimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setComprimento(Double value) {
        this.comprimento = value;
    }

    /**
     * Gets the value of the altura property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * Sets the value of the altura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltura(Double value) {
        this.altura = value;
    }

    /**
     * Gets the value of the largura property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLargura() {
        return largura;
    }

    /**
     * Sets the value of the largura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLargura(Double value) {
        this.largura = value;
    }

    /**
     * Gets the value of the diametro property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiametro() {
        return diametro;
    }

    /**
     * Sets the value of the diametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiametro(Double value) {
        this.diametro = value;
    }

    /**
     * Gets the value of the codMaoPropria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMaoPropria() {
        return codMaoPropria;
    }

    /**
     * Sets the value of the codMaoPropria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMaoPropria(String value) {
        this.codMaoPropria = value;
    }

    /**
     * Gets the value of the valorDeclarado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Sets the value of the valorDeclarado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorDeclarado(Double value) {
        this.valorDeclarado = value;
    }

    /**
     * Gets the value of the codAvisoRecebimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAvisoRecebimento() {
        return codAvisoRecebimento;
    }

    /**
     * Sets the value of the codAvisoRecebimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAvisoRecebimento(String value) {
        this.codAvisoRecebimento = value;
    }

}
