
package br.com.correios.webservice.postagem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaSRO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaSRO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaObjetos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioSro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senhaSro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaSRO", propOrder = {
    "listaObjetos",
    "tipoConsulta",
    "tipoResultado",
    "usuarioSro",
    "senhaSro"
})
public class ConsultaSRO {

    protected List<String> listaObjetos;
    protected String tipoConsulta;
    protected String tipoResultado;
    protected String usuarioSro;
    protected String senhaSro;

    /**
     * Gets the value of the listaObjetos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaObjetos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaObjetos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaObjetos() {
        if (listaObjetos == null) {
            listaObjetos = new ArrayList<String>();
        }
        return this.listaObjetos;
    }

    /**
     * Gets the value of the tipoConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Sets the value of the tipoConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
    }

    /**
     * Gets the value of the tipoResultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoResultado() {
        return tipoResultado;
    }

    /**
     * Sets the value of the tipoResultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoResultado(String value) {
        this.tipoResultado = value;
    }

    /**
     * Gets the value of the usuarioSro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioSro() {
        return usuarioSro;
    }

    /**
     * Sets the value of the usuarioSro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioSro(String value) {
        this.usuarioSro = value;
    }

    /**
     * Gets the value of the senhaSro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaSro() {
        return senhaSro;
    }

    /**
     * Sets the value of the senhaSro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaSro(String value) {
        this.senhaSro = value;
    }

}
