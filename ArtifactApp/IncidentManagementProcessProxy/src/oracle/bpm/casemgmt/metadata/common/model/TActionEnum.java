
package oracle.bpm.casemgmt.metadata.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tActionEnum.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tActionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="READ"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="INVOKE"/>
 *     &lt;enumeration value="CLOSE"/>
 *     &lt;enumeration value="FORCE_CLOSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tActionEnum")
@XmlEnum
public enum TActionEnum {

    READ,
    UPDATE,
    INVOKE,
    CLOSE,
    FORCE_CLOSE;

    public String value() {
        return name();
    }

    public static TActionEnum fromValue(String v) {
        return valueOf(v);
    }

}
