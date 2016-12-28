
package br.com.correios.webservice.postagem.production;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusPlp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusPlp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aberta"/>
 *     &lt;enumeration value="Fechada"/>
 *     &lt;enumeration value="Postada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusPlp")
@XmlEnum
public enum StatusPlp {

    @XmlEnumValue("Aberta")
    ABERTA("Aberta"),
    @XmlEnumValue("Fechada")
    FECHADA("Fechada"),
    @XmlEnumValue("Postada")
    POSTADA("Postada");
    private final String value;

    StatusPlp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusPlp fromValue(String v) {
        for (StatusPlp c: StatusPlp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
