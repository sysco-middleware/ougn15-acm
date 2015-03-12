
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tStakeHolderMember complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tStakeHolderMember">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stakeHolderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stakeHolder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stakeHolderDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stakeHolderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isContextUserInRole" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStakeHolderMember", propOrder = {
         "id", "stakeHolderId", "stakeHolder", "stakeHolderDisplayName", "stakeHolderType", "applicationContext",
         "isContextUserInRole"
    })
public class TStakeHolderMember extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String id;
    protected String stakeHolderId;
    @XmlElement(required = true)
    protected String stakeHolder;
    protected String stakeHolderDisplayName;
    @XmlElement(required = true)
    protected String stakeHolderType;
    protected String applicationContext;
    protected boolean isContextUserInRole;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id != null);
    }

    /**
     * Gets the value of the stakeHolderId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStakeHolderId() {
        return stakeHolderId;
    }

    /**
     * Sets the value of the stakeHolderId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStakeHolderId(String value) {
        this.stakeHolderId = value;
    }

    public boolean isSetStakeHolderId() {
        return (this.stakeHolderId != null);
    }

    /**
     * Gets the value of the stakeHolder property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStakeHolder() {
        return stakeHolder;
    }

    /**
     * Sets the value of the stakeHolder property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStakeHolder(String value) {
        this.stakeHolder = value;
    }

    public boolean isSetStakeHolder() {
        return (this.stakeHolder != null);
    }

    /**
     * Gets the value of the stakeHolderDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStakeHolderDisplayName() {
        return stakeHolderDisplayName;
    }

    /**
     * Sets the value of the stakeHolderDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStakeHolderDisplayName(String value) {
        this.stakeHolderDisplayName = value;
    }

    public boolean isSetStakeHolderDisplayName() {
        return (this.stakeHolderDisplayName != null);
    }

    /**
     * Gets the value of the stakeHolderType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStakeHolderType() {
        return stakeHolderType;
    }

    /**
     * Sets the value of the stakeHolderType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStakeHolderType(String value) {
        this.stakeHolderType = value;
    }

    public boolean isSetStakeHolderType() {
        return (this.stakeHolderType != null);
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
     * Gets the value of the isContextUserInRole property.
     *
     */
    public boolean isIsContextUserInRole() {
        return isContextUserInRole;
    }

    /**
     * Sets the value of the isContextUserInRole property.
     *
     */
    public void setIsContextUserInRole(boolean value) {
        this.isContextUserInRole = value;
    }

    public boolean isSetIsContextUserInRole() {
        return true;
    }

}
