
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pedidoInformacaoRegistro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pedidoInformacaoRegistro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}pedidoInformacao">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}cliente" minOccurs="0"/>
 *         &lt;element name="codigoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conta" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}conta" minOccurs="0"/>
 *         &lt;element name="conteudoObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfCnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinatario" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}destinatario" minOccurs="0"/>
 *         &lt;element name="embalagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}postagem" minOccurs="0"/>
 *         &lt;element name="remetente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}remetente" minOccurs="0"/>
 *         &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidoInformacaoRegistro", propOrder = {
    "cliente",
    "codigoRegistro",
    "conta",
    "conteudoObjeto",
    "cpfCnpj",
    "destinatario",
    "embalagem",
    "motivo",
    "observacao",
    "postagem",
    "remetente",
    "servico",
    "tipoDocumento"
})
public class PedidoInformacaoRegistro
    extends PedidoInformacao
{

    protected Cliente cliente;
    protected String codigoRegistro;
    protected Conta conta;
    protected String conteudoObjeto;
    protected String cpfCnpj;
    protected Destinatario destinatario;
    protected String embalagem;
    protected Integer motivo;
    protected String observacao;
    protected Postagem postagem;
    protected Remetente remetente;
    protected Integer servico;
    protected String tipoDocumento;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
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
     * Gets the value of the conta property.
     * 
     * @return
     *     possible object is
     *     {@link Conta }
     *     
     */
    public Conta getConta() {
        return conta;
    }

    /**
     * Sets the value of the conta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conta }
     *     
     */
    public void setConta(Conta value) {
        this.conta = value;
    }

    /**
     * Gets the value of the conteudoObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConteudoObjeto() {
        return conteudoObjeto;
    }

    /**
     * Sets the value of the conteudoObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConteudoObjeto(String value) {
        this.conteudoObjeto = value;
    }

    /**
     * Gets the value of the cpfCnpj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Sets the value of the cpfCnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfCnpj(String value) {
        this.cpfCnpj = value;
    }

    /**
     * Gets the value of the destinatario property.
     * 
     * @return
     *     possible object is
     *     {@link Destinatario }
     *     
     */
    public Destinatario getDestinatario() {
        return destinatario;
    }

    /**
     * Sets the value of the destinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destinatario }
     *     
     */
    public void setDestinatario(Destinatario value) {
        this.destinatario = value;
    }

    /**
     * Gets the value of the embalagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbalagem() {
        return embalagem;
    }

    /**
     * Sets the value of the embalagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbalagem(String value) {
        this.embalagem = value;
    }

    /**
     * Gets the value of the motivo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMotivo() {
        return motivo;
    }

    /**
     * Sets the value of the motivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMotivo(Integer value) {
        this.motivo = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the postagem property.
     * 
     * @return
     *     possible object is
     *     {@link Postagem }
     *     
     */
    public Postagem getPostagem() {
        return postagem;
    }

    /**
     * Sets the value of the postagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Postagem }
     *     
     */
    public void setPostagem(Postagem value) {
        this.postagem = value;
    }

    /**
     * Gets the value of the remetente property.
     * 
     * @return
     *     possible object is
     *     {@link Remetente }
     *     
     */
    public Remetente getRemetente() {
        return remetente;
    }

    /**
     * Sets the value of the remetente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remetente }
     *     
     */
    public void setRemetente(Remetente value) {
        this.remetente = value;
    }

    /**
     * Gets the value of the servico property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServico() {
        return servico;
    }

    /**
     * Sets the value of the servico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServico(Integer value) {
        this.servico = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

}
