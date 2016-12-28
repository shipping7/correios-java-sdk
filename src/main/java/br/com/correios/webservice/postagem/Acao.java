
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="acao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEVOLVIDO_AO_REMETENTE"/>
 *     &lt;enumeration value="ENCAMINHADO_PARA_REFUGO"/>
 *     &lt;enumeration value="REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE"/>
 *     &lt;enumeration value="DESBLOQUEADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "acao")
@XmlEnum
public enum Acao {

    DEVOLVIDO_AO_REMETENTE,
    ENCAMINHADO_PARA_REFUGO,
    REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE,
    DESBLOQUEADO;

    public String value() {
        return name();
    }

    public static Acao fromValue(String v) {
        return valueOf(v);
    }

}
