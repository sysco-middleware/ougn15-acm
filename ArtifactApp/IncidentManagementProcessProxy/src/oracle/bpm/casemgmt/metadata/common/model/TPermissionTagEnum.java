
package oracle.bpm.casemgmt.metadata.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPermissionTagEnum.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tPermissionTagEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUBLIC"/>
 *     &lt;enumeration value="RESTRICTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tPermissionTagEnum")
@XmlEnum
public enum TPermissionTagEnum {

    PUBLIC,
    RESTRICTED;

    public String value() {
        return name();
    }

    public static TPermissionTagEnum fromValue(String v) {
        return valueOf(v);
    }

}
