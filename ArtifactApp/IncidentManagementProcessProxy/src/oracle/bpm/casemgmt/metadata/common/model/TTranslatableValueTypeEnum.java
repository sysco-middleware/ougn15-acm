
package oracle.bpm.casemgmt.metadata.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tTranslatableValueTypeEnum.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tTranslatableValueTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="RESOURCE"/>
 *     &lt;enumeration value="STATIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "tTranslatableValueTypeEnum")
@XmlEnum
public enum TTranslatableValueTypeEnum {

    RESOURCE,
    STATIC;

    public String value() {
        return name();
    }

    public static TTranslatableValueTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
