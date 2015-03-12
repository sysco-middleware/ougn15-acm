
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tComment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tComment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseObjectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isSystemComment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="addedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addedByDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tComment", propOrder = {
         "id", "caseId", "comment", "caseObjectId", "caseObjectType", "isSystemComment", "dateAdded", "addedBy",
         "addedByDisplayName", "actions"
    })
public class TComment extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String caseId;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected String caseObjectId;
    @XmlElement(required = true)
    protected String caseObjectType;
    protected boolean isSystemComment;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlElement(required = true)
    protected String addedBy;
    @XmlElement(required = true)
    protected String addedByDisplayName;
    protected List<String> actions;

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
     * Gets the value of the caseId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseId(String value) {
        this.caseId = value;
    }

    public boolean isSetCaseId() {
        return (this.caseId != null);
    }

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComment(String value) {
        this.comment = value;
    }

    public boolean isSetComment() {
        return (this.comment != null);
    }

    /**
     * Gets the value of the caseObjectId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseObjectId() {
        return caseObjectId;
    }

    /**
     * Sets the value of the caseObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseObjectId(String value) {
        this.caseObjectId = value;
    }

    public boolean isSetCaseObjectId() {
        return (this.caseObjectId != null);
    }

    /**
     * Gets the value of the caseObjectType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseObjectType() {
        return caseObjectType;
    }

    /**
     * Sets the value of the caseObjectType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseObjectType(String value) {
        this.caseObjectType = value;
    }

    public boolean isSetCaseObjectType() {
        return (this.caseObjectType != null);
    }

    /**
     * Gets the value of the isSystemComment property.
     *
     */
    public boolean isIsSystemComment() {
        return isSystemComment;
    }

    /**
     * Sets the value of the isSystemComment property.
     *
     */
    public void setIsSystemComment(boolean value) {
        this.isSystemComment = value;
    }

    public boolean isSetIsSystemComment() {
        return true;
    }

    /**
     * Gets the value of the dateAdded property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    public boolean isSetDateAdded() {
        return (this.dateAdded != null);
    }

    /**
     * Gets the value of the addedBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddedBy() {
        return addedBy;
    }

    /**
     * Sets the value of the addedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddedBy(String value) {
        this.addedBy = value;
    }

    public boolean isSetAddedBy() {
        return (this.addedBy != null);
    }

    /**
     * Gets the value of the addedByDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddedByDisplayName() {
        return addedByDisplayName;
    }

    /**
     * Sets the value of the addedByDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddedByDisplayName(String value) {
        this.addedByDisplayName = value;
    }

    public boolean isSetAddedByDisplayName() {
        return (this.addedByDisplayName != null);
    }

    /**
     * Gets the value of the actions property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getActions() {
        if (actions == null) {
            actions = new ArrayList<String>();
        }
        return this.actions;
    }

    public boolean isSetActions() {
        return ((this.actions != null) && (!this.actions.isEmpty()));
    }

    public void unsetActions() {
        this.actions = null;
    }

}
