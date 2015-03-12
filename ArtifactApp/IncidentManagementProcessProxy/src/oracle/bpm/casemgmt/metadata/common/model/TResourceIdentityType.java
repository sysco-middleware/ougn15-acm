
package oracle.bpm.casemgmt.metadata.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tResourceIdentityType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tResourceIdentityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="application_role"/>
 *     &lt;enumeration value="process_role"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tResourceIdentityType")
@XmlEnum
public enum TResourceIdentityType {

    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("application_role")
    APPLICATION_ROLE("application_role"),
    @XmlEnumValue("process_role")
    PROCESS_ROLE("process_role");
    private final String value;

    TResourceIdentityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TResourceIdentityType fromValue(String v) {
        for (TResourceIdentityType c : TResourceIdentityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
