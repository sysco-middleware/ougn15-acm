
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tMilestone complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tMilestone">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateAchieved" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="achievedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achievedByDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://xmlns.oracle.com/bpm/case}tComment" minOccurs="0"/>
 *         &lt;element name="actions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMilestone", propOrder = {
         "id", "caseId", "name", "displayName", "state", "stateDisplayName", "dateAchieved", "achievedBy",
         "achievedByDisplayName", "comment", "actions", "deadline"
    })
public class TMilestone extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String caseId;
    @XmlElement(required = true)
    protected String name;
    protected String displayName;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String stateDisplayName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAchieved;
    protected String achievedBy;
    protected String achievedByDisplayName;
    protected TComment comment;
    protected List<String> actions;
    @XmlElementRef(name = "deadline", namespace = "http://xmlns.oracle.com/bpm/case", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<XMLGregorianCalendar> deadline;

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
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name != null);
    }

    /**
     * Gets the value of the displayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    public boolean isSetDisplayName() {
        return (this.displayName != null);
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setState(String value) {
        this.state = value;
    }

    public boolean isSetState() {
        return (this.state != null);
    }

    /**
     * Gets the value of the stateDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStateDisplayName() {
        return stateDisplayName;
    }

    /**
     * Sets the value of the stateDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStateDisplayName(String value) {
        this.stateDisplayName = value;
    }

    public boolean isSetStateDisplayName() {
        return (this.stateDisplayName != null);
    }

    /**
     * Gets the value of the dateAchieved property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateAchieved() {
        return dateAchieved;
    }

    /**
     * Sets the value of the dateAchieved property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateAchieved(XMLGregorianCalendar value) {
        this.dateAchieved = value;
    }

    public boolean isSetDateAchieved() {
        return (this.dateAchieved != null);
    }

    /**
     * Gets the value of the achievedBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAchievedBy() {
        return achievedBy;
    }

    /**
     * Sets the value of the achievedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAchievedBy(String value) {
        this.achievedBy = value;
    }

    public boolean isSetAchievedBy() {
        return (this.achievedBy != null);
    }

    /**
     * Gets the value of the achievedByDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAchievedByDisplayName() {
        return achievedByDisplayName;
    }

    /**
     * Sets the value of the achievedByDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAchievedByDisplayName(String value) {
        this.achievedByDisplayName = value;
    }

    public boolean isSetAchievedByDisplayName() {
        return (this.achievedByDisplayName != null);
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
     * Gets the value of the deadline property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setDeadline(JAXBElement<XMLGregorianCalendar> value) {
        this.deadline = value;
    }

    public boolean isSetDeadline() {
        return (this.deadline != null);
    }

}
