
package br.com.correios.webservice.postagem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chancelaMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chancelaMaster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chancela" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="servicosSigep" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoSigep" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chancelaMaster", propOrder = {
    "chancela",
    "dataAtualizacao",
    "descricao",
    "id",
    "servicosSigep"
})
public class ChancelaMaster {

    protected byte[] chancela;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacao;
    protected String descricao;
    protected long id;
    @XmlElement(nillable = true)
    protected List<ServicoSigep> servicosSigep;

    /**
     * Gets the value of the chancela property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChancela() {
        return chancela;
    }

    /**
     * Sets the value of the chancela property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setChancela(byte[] value) {
        this.chancela = value;
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
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the servicosSigep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicosSigep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicosSigep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicoSigep }
     * 
     * 
     */
    public List<ServicoSigep> getServicosSigep() {
        if (servicosSigep == null) {
            servicosSigep = new ArrayList<ServicoSigep>();
        }
        return this.servicosSigep;
    }

}
