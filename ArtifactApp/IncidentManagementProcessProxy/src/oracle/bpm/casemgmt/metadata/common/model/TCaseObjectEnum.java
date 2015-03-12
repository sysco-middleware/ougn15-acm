
package oracle.bpm.casemgmt.metadata.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCaseObjectEnum.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tCaseObjectEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CASE"/>
 *     &lt;enumeration value="COMMENT"/>
 *     &lt;enumeration value="DOCUMENT"/>
 *     &lt;enumeration value="DATA"/>
 *     &lt;enumeration value="EVENT"/>
 *     &lt;enumeration value="ACTIVITY"/>
 *     &lt;enumeration value="MILESTONE"/>
 *     &lt;enumeration value="STAKEHOLDER"/>
 *     &lt;enumeration value="HEADER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tCaseObjectEnum")
@XmlEnum
public enum TCaseObjectEnum {

    CASE,
    COMMENT,
    DOCUMENT,
    DATA,
    EVENT,
    ACTIVITY,
    MILESTONE,
    STAKEHOLDER,
    HEADER;

    public String value() {
        return name();
    }

    public static TCaseObjectEnum fromValue(String v) {
        return valueOf(v);
    }

}
