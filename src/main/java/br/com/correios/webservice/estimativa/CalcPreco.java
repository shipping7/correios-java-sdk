
package br.com.correios.webservice.estimativa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nCdServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nVlPeso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nCdFormato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nVlComprimento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nVlAltura" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nVlLargura" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nVlDiametro" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdMaoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nVlValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdAvisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nCdEmpresa",
    "sDsSenha",
    "nCdServico",
    "sCepOrigem",
    "sCepDestino",
    "nVlPeso",
    "nCdFormato",
    "nVlComprimento",
    "nVlAltura",
    "nVlLargura",
    "nVlDiametro",
    "sCdMaoPropria",
    "nVlValorDeclarado",
    "sCdAvisoRecebimento"
})
@XmlRootElement(name = "CalcPreco")
public class CalcPreco {

    protected String nCdEmpresa;
    protected String sDsSenha;
    protected String nCdServico;
    protected String sCepOrigem;
    protected String sCepDestino;
    protected String nVlPeso;
    protected int nCdFormato;
    @XmlElement(required = true)
    protected BigDecimal nVlComprimento;
    @XmlElement(required = true)
    protected BigDecimal nVlAltura;
    @XmlElement(required = true)
    protected BigDecimal nVlLargura;
    @XmlElement(required = true)
    protected BigDecimal nVlDiametro;
    protected String sCdMaoPropria;
    @XmlElement(required = true)
    protected BigDecimal nVlValorDeclarado;
    protected String sCdAvisoRecebimento;

    /**
     * Gets the value of the nCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCdEmpresa() {
        return nCdEmpresa;
    }

    /**
     * Sets the value of the nCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCdEmpresa(String value) {
        this.nCdEmpresa = value;
    }

    /**
     * Gets the value of the sDsSenha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsSenha() {
        return sDsSenha;
    }

    /**
     * Sets the value of the sDsSenha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsSenha(String value) {
        this.sDsSenha = value;
    }

    /**
     * Gets the value of the nCdServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCdServico() {
        return nCdServico;
    }

    /**
     * Sets the value of the nCdServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCdServico(String value) {
        this.nCdServico = value;
    }

    /**
     * Gets the value of the sCepOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCepOrigem() {
        return sCepOrigem;
    }

    /**
     * Sets the value of the sCepOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCepOrigem(String value) {
        this.sCepOrigem = value;
    }

    /**
     * Gets the value of the sCepDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCepDestino() {
        return sCepDestino;
    }

    /**
     * Sets the value of the sCepDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCepDestino(String value) {
        this.sCepDestino = value;
    }

    /**
     * Gets the value of the nVlPeso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVlPeso() {
        return nVlPeso;
    }

    /**
     * Sets the value of the nVlPeso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVlPeso(String value) {
        this.nVlPeso = value;
    }

    /**
     * Gets the value of the nCdFormato property.
     * 
     */
    public int getNCdFormato() {
        return nCdFormato;
    }

    /**
     * Sets the value of the nCdFormato property.
     * 
     */
    public void setNCdFormato(int value) {
        this.nCdFormato = value;
    }

    /**
     * Gets the value of the nVlComprimento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNVlComprimento() {
        return nVlComprimento;
    }

    /**
     * Sets the value of the nVlComprimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNVlComprimento(BigDecimal value) {
        this.nVlComprimento = value;
    }

    /**
     * Gets the value of the nVlAltura property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNVlAltura() {
        return nVlAltura;
    }

    /**
     * Sets the value of the nVlAltura property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNVlAltura(BigDecimal value) {
        this.nVlAltura = value;
    }

    /**
     * Gets the value of the nVlLargura property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNVlLargura() {
        return nVlLargura;
    }

    /**
     * Sets the value of the nVlLargura property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNVlLargura(BigDecimal value) {
        this.nVlLargura = value;
    }

    /**
     * Gets the value of the nVlDiametro property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNVlDiametro() {
        return nVlDiametro;
    }

    /**
     * Sets the value of the nVlDiametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNVlDiametro(BigDecimal value) {
        this.nVlDiametro = value;
    }

    /**
     * Gets the value of the sCdMaoPropria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdMaoPropria() {
        return sCdMaoPropria;
    }

    /**
     * Sets the value of the sCdMaoPropria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdMaoPropria(String value) {
        this.sCdMaoPropria = value;
    }

    /**
     * Gets the value of the nVlValorDeclarado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNVlValorDeclarado() {
        return nVlValorDeclarado;
    }

    /**
     * Sets the value of the nVlValorDeclarado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNVlValorDeclarado(BigDecimal value) {
        this.nVlValorDeclarado = value;
    }

    /**
     * Gets the value of the sCdAvisoRecebimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdAvisoRecebimento() {
        return sCdAvisoRecebimento;
    }

    /**
     * Sets the value of the sCdAvisoRecebimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdAvisoRecebimento(String value) {
        this.sCdAvisoRecebimento = value;
    }

}
