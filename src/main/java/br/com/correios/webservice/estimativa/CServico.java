
package br.com.correios.webservice.estimativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cServico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrazoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorMaoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorAvisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntregaDomiciliar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntregaSabado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorSemAdicionais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obsFim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cServico", propOrder = {
    "codigo",
    "valor",
    "prazoEntrega",
    "valorMaoPropria",
    "valorAvisoRecebimento",
    "valorValorDeclarado",
    "entregaDomiciliar",
    "entregaSabado",
    "erro",
    "msgErro",
    "valorSemAdicionais",
    "obsFim"
})
public class CServico {

    @XmlElement(name = "Codigo")
    protected int codigo;
    @XmlElement(name = "Valor")
    protected String valor;
    @XmlElement(name = "PrazoEntrega")
    protected String prazoEntrega;
    @XmlElement(name = "ValorMaoPropria")
    protected String valorMaoPropria;
    @XmlElement(name = "ValorAvisoRecebimento")
    protected String valorAvisoRecebimento;
    @XmlElement(name = "ValorValorDeclarado")
    protected String valorValorDeclarado;
    @XmlElement(name = "EntregaDomiciliar")
    protected String entregaDomiciliar;
    @XmlElement(name = "EntregaSabado")
    protected String entregaSabado;
    @XmlElement(name = "Erro")
    protected String erro;
    @XmlElement(name = "MsgErro")
    protected String msgErro;
    @XmlElement(name = "ValorSemAdicionais")
    protected String valorSemAdicionais;
    protected String obsFim;

    /**
     * Gets the value of the codigo property.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

    /**
     * Gets the value of the prazoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    /**
     * Sets the value of the prazoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrazoEntrega(String value) {
        this.prazoEntrega = value;
    }

    /**
     * Gets the value of the valorMaoPropria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorMaoPropria() {
        return valorMaoPropria;
    }

    /**
     * Sets the value of the valorMaoPropria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorMaoPropria(String value) {
        this.valorMaoPropria = value;
    }

    /**
     * Gets the value of the valorAvisoRecebimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorAvisoRecebimento() {
        return valorAvisoRecebimento;
    }

    /**
     * Sets the value of the valorAvisoRecebimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorAvisoRecebimento(String value) {
        this.valorAvisoRecebimento = value;
    }

    /**
     * Gets the value of the valorValorDeclarado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorValorDeclarado() {
        return valorValorDeclarado;
    }

    /**
     * Sets the value of the valorValorDeclarado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorValorDeclarado(String value) {
        this.valorValorDeclarado = value;
    }

    /**
     * Gets the value of the entregaDomiciliar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntregaDomiciliar() {
        return entregaDomiciliar;
    }

    /**
     * Sets the value of the entregaDomiciliar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntregaDomiciliar(String value) {
        this.entregaDomiciliar = value;
    }

    /**
     * Gets the value of the entregaSabado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntregaSabado() {
        return entregaSabado;
    }

    /**
     * Sets the value of the entregaSabado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntregaSabado(String value) {
        this.entregaSabado = value;
    }

    /**
     * Gets the value of the erro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErro() {
        return erro;
    }

    /**
     * Sets the value of the erro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErro(String value) {
        this.erro = value;
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
     * Gets the value of the valorSemAdicionais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorSemAdicionais() {
        return valorSemAdicionais;
    }

    /**
     * Sets the value of the valorSemAdicionais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorSemAdicionais(String value) {
        this.valorSemAdicionais = value;
    }

    /**
     * Gets the value of the obsFim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsFim() {
        return obsFim;
    }

    /**
     * Sets the value of the obsFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsFim(String value) {
        this.obsFim = value;
    }

}
