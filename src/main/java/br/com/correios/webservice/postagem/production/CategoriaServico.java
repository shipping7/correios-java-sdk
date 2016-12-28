
package br.com.correios.webservice.postagem.production;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoriaServico.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoriaServico">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEM_CATEGORIA"/>
 *     &lt;enumeration value="PAC"/>
 *     &lt;enumeration value="SEDEX"/>
 *     &lt;enumeration value="CARTA_REGISTRADA"/>
 *     &lt;enumeration value="SERVICO_COM_RESTRICAO"/>
 *     &lt;enumeration value="REVERSO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoriaServico")
@XmlEnum
public enum CategoriaServico {

    SEM_CATEGORIA,
    PAC,
    SEDEX,
    CARTA_REGISTRADA,
    SERVICO_COM_RESTRICAO,
    REVERSO;

    public String value() {
        return name();
    }

    public static CategoriaServico fromValue(String v) {
        return valueOf(v);
    }

}
