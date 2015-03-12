
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCaseLinkRelationship.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tCaseLinkRelationship">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPENDS_ON"/>
 *     &lt;enumeration value="RELATED_TO"/>
 *     &lt;enumeration value="HAS_SUBCASE"/>
 *     &lt;enumeration value="DUPLICATE"/>
 *     &lt;enumeration value="DEPENDS_ON_INVERSE"/>
 *     &lt;enumeration value="RELATED_TO_INVERSE"/>
 *     &lt;enumeration value="HAS_SUBCASE_INVERSE"/>
 *     &lt;enumeration value="DUPLICATE_INVERSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tCaseLinkRelationship")
@XmlEnum
public enum TCaseLinkRelationship {

    DEPENDS_ON,
    RELATED_TO,
    HAS_SUBCASE,
    DUPLICATE,
    DEPENDS_ON_INVERSE,
    RELATED_TO_INVERSE,
    HAS_SUBCASE_INVERSE,
    DUPLICATE_INVERSE;

    public String value() {
        return name();
    }

    public static TCaseLinkRelationship fromValue(String v) {
        return valueOf(v);
    }

}
