
package oracle.bpm.casemgmt.metadata.common.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tResource complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tResource">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://xmlns.oracle.com/bpm/case/metadata/common>tStaticOrXPath">
 *       &lt;attribute name="identityType" use="required" type="{http://xmlns.oracle.com/bpm/case/metadata/common}tResourceIdentityType" />
 *       &lt;attribute name="application_context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="systemAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResource")
public class TResource extends TStaticOrXPath implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlAttribute(name = "identityType", required = true)
    protected TResourceIdentityType identityType;
    @XmlAttribute(name = "application_context")
    protected String applicationContext;
    @XmlAttribute(name = "systemAttribute")
    protected String systemAttribute;

    /**
     * Gets the value of the identityType property.
     *
     * @return
     *     possible object is
     *     {@link TResourceIdentityType }
     *
     */
    public TResourceIdentityType getIdentityType() {
        return identityType;
    }

    /**
     * Sets the value of the identityType property.
     *
     * @param value
     *     allowed object is
     *     {@link TResourceIdentityType }
     *
     */
    public void setIdentityType(TResourceIdentityType value) {
        this.identityType = value;
    }

    public boolean isSetIdentityType() {
        return (this.identityType != null);
    }

    /**
     * Gets the value of the applicationContext property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApplicationContext() {
        return applicationContext;
    }

    /**
     * Sets the value of the applicationContext property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApplicationContext(String value) {
        this.applicationContext = value;
    }

    public boolean isSetApplicationContext() {
        return (this.applicationContext != null);
    }

    /**
     * Gets the value of the systemAttribute property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSystemAttribute() {
        return systemAttribute;
    }

    /**
     * Sets the value of the systemAttribute property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSystemAttribute(String value) {
        this.systemAttribute = value;
    }

    public boolean isSetSystemAttribute() {
        return (this.systemAttribute != null);
    }

}
