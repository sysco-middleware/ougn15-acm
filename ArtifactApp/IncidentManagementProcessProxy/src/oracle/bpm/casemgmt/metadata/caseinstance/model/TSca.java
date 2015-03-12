
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tSca complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tSca">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="applicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentComponentInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentComponentInstRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headerProperties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invokedComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeCreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSca", propOrder = {
         "applicationName", "componentName", "compositeDN", "compositeInstanceId", "compositeName", "compositeVersion",
         "ecid", "parentComponentInstanceId", "parentComponentInstRefId", "headerProperties", "invokedComponent",
         "compositeCreatedTime"
    })
public class TSca extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected String applicationName;
    protected String componentName;
    protected String compositeDN;
    protected String compositeInstanceId;
    protected String compositeName;
    protected String compositeVersion;
    protected String ecid;
    protected String parentComponentInstanceId;
    protected String parentComponentInstRefId;
    protected String headerProperties;
    protected String invokedComponent;
    @XmlElementRef(name = "compositeCreatedTime", namespace = "http://xmlns.oracle.com/bpm/case",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> compositeCreatedTime;

    /**
     * Gets the value of the applicationName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    public boolean isSetApplicationName() {
        return (this.applicationName != null);
    }

    /**
     * Gets the value of the componentName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Sets the value of the componentName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComponentName(String value) {
        this.componentName = value;
    }

    public boolean isSetComponentName() {
        return (this.componentName != null);
    }

    /**
     * Gets the value of the compositeDN property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompositeDN() {
        return compositeDN;
    }

    /**
     * Sets the value of the compositeDN property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompositeDN(String value) {
        this.compositeDN = value;
    }

    public boolean isSetCompositeDN() {
        return (this.compositeDN != null);
    }

    /**
     * Gets the value of the compositeInstanceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompositeInstanceId() {
        return compositeInstanceId;
    }

    /**
     * Sets the value of the compositeInstanceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompositeInstanceId(String value) {
        this.compositeInstanceId = value;
    }

    public boolean isSetCompositeInstanceId() {
        return (this.compositeInstanceId != null);
    }

    /**
     * Gets the value of the compositeName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompositeName() {
        return compositeName;
    }

    /**
     * Sets the value of the compositeName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompositeName(String value) {
        this.compositeName = value;
    }

    public boolean isSetCompositeName() {
        return (this.compositeName != null);
    }

    /**
     * Gets the value of the compositeVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompositeVersion() {
        return compositeVersion;
    }

    /**
     * Sets the value of the compositeVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompositeVersion(String value) {
        this.compositeVersion = value;
    }

    public boolean isSetCompositeVersion() {
        return (this.compositeVersion != null);
    }

    /**
     * Gets the value of the ecid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEcid() {
        return ecid;
    }

    /**
     * Sets the value of the ecid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEcid(String value) {
        this.ecid = value;
    }

    public boolean isSetEcid() {
        return (this.ecid != null);
    }

    /**
     * Gets the value of the parentComponentInstanceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentComponentInstanceId() {
        return parentComponentInstanceId;
    }

    /**
     * Sets the value of the parentComponentInstanceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentComponentInstanceId(String value) {
        this.parentComponentInstanceId = value;
    }

    public boolean isSetParentComponentInstanceId() {
        return (this.parentComponentInstanceId != null);
    }

    /**
     * Gets the value of the parentComponentInstRefId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentComponentInstRefId() {
        return parentComponentInstRefId;
    }

    /**
     * Sets the value of the parentComponentInstRefId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentComponentInstRefId(String value) {
        this.parentComponentInstRefId = value;
    }

    public boolean isSetParentComponentInstRefId() {
        return (this.parentComponentInstRefId != null);
    }

    /**
     * Gets the value of the headerProperties property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHeaderProperties() {
        return headerProperties;
    }

    /**
     * Sets the value of the headerProperties property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHeaderProperties(String value) {
        this.headerProperties = value;
    }

    public boolean isSetHeaderProperties() {
        return (this.headerProperties != null);
    }

    /**
     * Gets the value of the invokedComponent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInvokedComponent() {
        return invokedComponent;
    }

    /**
     * Sets the value of the invokedComponent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInvokedComponent(String value) {
        this.invokedComponent = value;
    }

    public boolean isSetInvokedComponent() {
        return (this.invokedComponent != null);
    }

    /**
     * Gets the value of the compositeCreatedTime property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getCompositeCreatedTime() {
        return compositeCreatedTime;
    }

    /**
     * Sets the value of the compositeCreatedTime property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setCompositeCreatedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.compositeCreatedTime = value;
    }

    public boolean isSetCompositeCreatedTime() {
        return (this.compositeCreatedTime != null);
    }

}
