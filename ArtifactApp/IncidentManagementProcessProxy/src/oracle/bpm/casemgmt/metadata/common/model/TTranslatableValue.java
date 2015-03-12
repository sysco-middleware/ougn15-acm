
package oracle.bpm.casemgmt.metadata.common.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tTranslatableValue complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tTranslatableValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="translationValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="translationParam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="translationType" use="required" type="{http://xmlns.oracle.com/bpm/case/metadata/common}tTranslatableValueTypeEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTranslatableValue", propOrder = { "translationValue", "translationParam" })
public class TTranslatableValue implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String translationValue;
    protected List<String> translationParam;
    @XmlAttribute(name = "translationType", required = true)
    protected TTranslatableValueTypeEnum translationType;

    /**
     * Gets the value of the translationValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTranslationValue() {
        return translationValue;
    }

    /**
     * Sets the value of the translationValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTranslationValue(String value) {
        this.translationValue = value;
    }

    public boolean isSetTranslationValue() {
        return (this.translationValue != null);
    }

    /**
     * Gets the value of the translationParam property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translationParam property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslationParam().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getTranslationParam() {
        if (translationParam == null) {
            translationParam = new ArrayList<String>();
        }
        return this.translationParam;
    }

    public boolean isSetTranslationParam() {
        return ((this.translationParam != null) && (!this.translationParam.isEmpty()));
    }

    public void unsetTranslationParam() {
        this.translationParam = null;
    }

    /**
     * Gets the value of the translationType property.
     *
     * @return
     *     possible object is
     *     {@link TTranslatableValueTypeEnum }
     *
     */
    public TTranslatableValueTypeEnum getTranslationType() {
        return translationType;
    }

    /**
     * Sets the value of the translationType property.
     *
     * @param value
     *     allowed object is
     *     {@link TTranslatableValueTypeEnum }
     *
     */
    public void setTranslationType(TTranslatableValueTypeEnum value) {
        this.translationType = value;
    }

    public boolean isSetTranslationType() {
        return (this.translationType != null);
    }

}
