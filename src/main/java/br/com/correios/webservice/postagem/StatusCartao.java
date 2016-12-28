
package br.com.correios.webservice.postagem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusCartao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusCartao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Desconhecido"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Suspenso"/>
 *     &lt;enumeration value="Cancelado"/>
 *     &lt;enumeration value="Irregular"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusCartao")
@XmlEnum
public enum StatusCartao {

    @XmlEnumValue("Desconhecido")
    DESCONHECIDO("Desconhecido"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Suspenso")
    SUSPENSO("Suspenso"),
    @XmlEnumValue("Cancelado")
    CANCELADO("Cancelado"),
    @XmlEnumValue("Irregular")
    IRREGULAR("Irregular");
    private final String value;

    StatusCartao(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCartao fromValue(String v) {
        for (StatusCartao c: StatusCartao.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
