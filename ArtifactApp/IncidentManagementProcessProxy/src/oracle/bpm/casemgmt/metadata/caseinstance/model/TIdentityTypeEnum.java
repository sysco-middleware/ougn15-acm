
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tIdentityTypeEnum.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tIdentityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="application_role"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tIdentityTypeEnum")
@XmlEnum
public enum TIdentityTypeEnum {

    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("application_role")
    APPLICATION_ROLE("application_role");
    private final String value;

    TIdentityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIdentityTypeEnum fromValue(String v) {
        for (TIdentityTypeEnum c : TIdentityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
