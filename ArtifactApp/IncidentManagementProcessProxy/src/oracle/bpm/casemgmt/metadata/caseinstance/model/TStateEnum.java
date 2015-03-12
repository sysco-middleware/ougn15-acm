
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tStateEnum.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tStateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ABORTED"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tStateEnum")
@XmlEnum
public enum TStateEnum {

    ABORTED,
    ACTIVE,
    CLOSED,
    EXPIRED,
    SUSPENDED;

    public String value() {
        return name();
    }

    public static TStateEnum fromValue(String v) {
        return valueOf(v);
    }

}
