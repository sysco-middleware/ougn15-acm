
package oracle.bpm.casemgmt.metadata.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tStaticOrXpathType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tStaticOrXpathType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STATIC"/>
 *     &lt;enumeration value="XPATH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tStaticOrXpathType")
@XmlEnum
public enum TStaticOrXpathType {

    STATIC,
    XPATH;

    public String value() {
        return name();
    }

    public static TStaticOrXpathType fromValue(String v) {
        return valueOf(v);
    }

}
