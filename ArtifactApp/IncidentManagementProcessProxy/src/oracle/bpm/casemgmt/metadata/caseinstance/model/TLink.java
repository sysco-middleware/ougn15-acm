
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.math.BigInteger;

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
 * <p>Java class for tLink complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tLink">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="caseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://xmlns.oracle.com/bpm/case}tCaseLinkRelationship"/>
 *         &lt;element name="relationshipDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkedCaseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkedCaseNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="linkedCaseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedCaseState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedCaseStateDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedCaseSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedCaseCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedCaseCategoryDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="addedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addedByDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://xmlns.oracle.com/bpm/case}tComment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLink", propOrder = {
         "id", "caseId", "caseNumber", "caseTitle", "relationship", "relationshipDisplayName", "linkedCaseId",
         "linkedCaseNumber", "linkedCaseTitle", "linkedCaseState", "linkedCaseStateDisplayName", "linkedCaseSummary",
         "linkedCaseCategory", "linkedCaseCategoryDisplayName", "dateAdded", "addedBy", "addedByDisplayName", "actions",
         "comment"
    })
public class TLink extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String caseId;
    @XmlElement(required = true)
    protected BigInteger caseNumber;
    protected String caseTitle;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TCaseLinkRelationship relationship;
    @XmlElement(required = true)
    protected String relationshipDisplayName;
    @XmlElement(required = true)
    protected String linkedCaseId;
    @XmlElement(required = true)
    protected BigInteger linkedCaseNumber;
    protected String linkedCaseTitle;
    protected String linkedCaseState;
    protected String linkedCaseStateDisplayName;
    protected String linkedCaseSummary;
    protected String linkedCaseCategory;
    protected String linkedCaseCategoryDisplayName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlElement(required = true)
    protected String addedBy;
    @XmlElement(required = true)
    protected String addedByDisplayName;
    protected List<String> actions;
    protected TComment comment;

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
     * Gets the value of the caseNumber property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCaseNumber(BigInteger value) {
        this.caseNumber = value;
    }

    public boolean isSetCaseNumber() {
        return (this.caseNumber != null);
    }

    /**
     * Gets the value of the caseTitle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseTitle() {
        return caseTitle;
    }

    /**
     * Sets the value of the caseTitle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseTitle(String value) {
        this.caseTitle = value;
    }

    public boolean isSetCaseTitle() {
        return (this.caseTitle != null);
    }

    /**
     * Gets the value of the relationship property.
     *
     * @return
     *     possible object is
     *     {@link TCaseLinkRelationship }
     *
     */
    public TCaseLinkRelationship getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     *
     * @param value
     *     allowed object is
     *     {@link TCaseLinkRelationship }
     *
     */
    public void setRelationship(TCaseLinkRelationship value) {
        this.relationship = value;
    }

    public boolean isSetRelationship() {
        return (this.relationship != null);
    }

    /**
     * Gets the value of the relationshipDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRelationshipDisplayName() {
        return relationshipDisplayName;
    }

    /**
     * Sets the value of the relationshipDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRelationshipDisplayName(String value) {
        this.relationshipDisplayName = value;
    }

    public boolean isSetRelationshipDisplayName() {
        return (this.relationshipDisplayName != null);
    }

    /**
     * Gets the value of the linkedCaseId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkedCaseId() {
        return linkedCaseId;
    }

    /**
     * Sets the value of the linkedCaseId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkedCaseId(String value) {
        this.linkedCaseId = value;
    }

    public boolean isSetLinkedCaseId() {
        return (this.linkedCaseId != null);
    }

    /**
     * Gets the value of the linkedCaseNumber property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getLinkedCaseNumber() {
        return linkedCaseNumber;
    }

    /**
     * Sets the value of the linkedCaseNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setLinkedCaseNumber(BigInteger value) {
        this.linkedCaseNumber = value;
    }

    public boolean isSetLinkedCaseNumber() {
        return (this.linkedCaseNumber != null);
    }

    /**
     * Gets the value of the linkedCaseTitle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkedCaseTitle() {
        return linkedCaseTitle;
    }

    /**
     * Sets the value of the linkedCaseTitle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkedCaseTitle(String value) {
        this.linkedCaseTitle = value;
    }

    public boolean isSetLinkedCaseTitle() {
        return (this.linkedCaseTitle != null);
    }

    /**
     * Gets the value of the linkedCaseState property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkedCaseState() {
        return linkedCaseState;
    }

    /**
     * Sets the value of the linkedCaseState property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkedCaseState(String value) {
        this.linkedCaseState = value;
    }

    public boolean isSetLinkedCaseState() {
        return (this.linkedCaseState != null);
    }

    /**
     * Gets the value of the linkedCaseStateDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkedCaseStateDisplayName() {
        return linkedCaseStateDisplayName;
    }

    /**
     * Sets the value of the linkedCaseStateDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkedCaseStateDisplayName(String value) {
        this.linkedCaseStateDisplayName = value;
    }

    public boolean isSetLinkedCaseStateDisplayName() {
        return (this.linkedCaseStateDisplayName != null);
    }

    /**
     * Gets the value of the linkedCaseSummary property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkedCaseSummary() {
        return linkedCaseSummary;
    }

    /**
     * Sets the value of the linkedCaseSummary property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkedCaseSummary(String value) {
        this.linkedCaseSummary = value;
    }

    public boolean isSetLinkedCaseSummary() {
        return (this.linkedCaseSummary != null);
    }

    /**
     * Gets the value of the linkedCaseCategory property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkedCaseCategory() {
        return linkedCaseCategory;
    }

    /**
     * Sets the value of the linkedCaseCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkedCaseCategory(String value) {
        this.linkedCaseCategory = value;
    }

    public boolean isSetLinkedCaseCategory() {
        return (this.linkedCaseCategory != null);
    }

    /**
     * Gets the value of the linkedCaseCategoryDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkedCaseCategoryDisplayName() {
        return linkedCaseCategoryDisplayName;
    }

    /**
     * Sets the value of the linkedCaseCategoryDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkedCaseCategoryDisplayName(String value) {
        this.linkedCaseCategoryDisplayName = value;
    }

    public boolean isSetLinkedCaseCategoryDisplayName() {
        return (this.linkedCaseCategoryDisplayName != null);
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

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link TComment }
     *
     */
    public TComment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link TComment }
     *
     */
    public void setComment(TComment value) {
        this.comment = value;
    }

    public boolean isSetComment() {
        return (this.comment != null);
    }

}
