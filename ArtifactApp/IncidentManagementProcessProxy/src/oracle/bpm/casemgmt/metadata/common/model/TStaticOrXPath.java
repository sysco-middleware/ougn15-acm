
package oracle.bpm.casemgmt.metadata.common.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for tStaticOrXPath complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tStaticOrXPath">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" type="{http://xmlns.oracle.com/bpm/case/metadata/common}tStaticOrXpathType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStaticOrXPath", propOrder = { "value" })
@XmlSeeAlso({ TResource.class })
public class TStaticOrXPath implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "type")
    protected TStaticOrXpathType type;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value != null);
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link TStaticOrXpathType }
     *
     */
    public TStaticOrXpathType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link TStaticOrXpathType }
     *
     */
    public void setType(TStaticOrXpathType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type != null);
    }

}
