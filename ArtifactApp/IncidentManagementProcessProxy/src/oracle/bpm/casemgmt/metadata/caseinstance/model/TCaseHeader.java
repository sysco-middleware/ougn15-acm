
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.math.BigInteger;

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
 * <p>Java class for tCaseHeader complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tCaseHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="caseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://xmlns.oracle.com/bpm/case}tPriority"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdByDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="state" type="{http://xmlns.oracle.com/bpm/case}tStateEnum"/>
 *         &lt;element name="stateDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDefinedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDefinedStatusDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecmFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseNamespace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{http://xmlns.oracle.com/bpm/case}tCategory" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outcomeDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sca" type="{http://xmlns.oracle.com/bpm/case}tSca"/>
 *         &lt;element name="actions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="caseSummaryFormURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organizationalUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completedCaseActivityList" type="{http://xmlns.oracle.com/bpm/case}tCompletedCaseActivityList"/>
 *         &lt;element name="userPermissions" type="{http://xmlns.oracle.com/bpm/case}tUserPermissions" minOccurs="0"/>
 *         &lt;element name="userActions" type="{http://xmlns.oracle.com/bpm/case}tUserActions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCaseHeader", propOrder = {
         "caseId", "caseNumber", "caseName", "caseDisplayName", "title", "summary", "priority", "createdBy",
         "createdByDisplayName", "createdDate", "endDate", "expirationDate", "dueDate", "state", "stateDisplayName",
         "userDefinedStatus", "userDefinedStatusDisplayName", "ecmFolder", "caseDefinitionId", "caseDefinitionName",
         "caseNamespace", "identificationKey", "category", "outcome", "outcomeDisplayName", "sca", "actions",
         "caseSummaryFormURI", "organizationalUnitId", "completedCaseActivityList", "userPermissions", "userActions"
    })
public class TCaseHeader extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String caseId;
    @XmlElement(required = true)
    protected BigInteger caseNumber;
    @XmlElement(required = true)
    protected String caseName;
    protected String caseDisplayName;
    protected String title;
    protected String summary;
    @XmlSchemaType(name = "integer")
    protected int priority;
    protected String createdBy;
    protected String createdByDisplayName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElementRef(name = "endDate", namespace = "http://xmlns.oracle.com/bpm/case", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "expirationDate", namespace = "http://xmlns.oracle.com/bpm/case", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<XMLGregorianCalendar> expirationDate;
    @XmlElementRef(name = "dueDate", namespace = "http://xmlns.oracle.com/bpm/case", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<XMLGregorianCalendar> dueDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected TStateEnum state;
    protected String stateDisplayName;
    protected String userDefinedStatus;
    protected String userDefinedStatusDisplayName;
    protected String ecmFolder;
    @XmlElement(required = true)
    protected String caseDefinitionId;
    @XmlElement(required = true)
    protected String caseDefinitionName;
    @XmlElement(required = true)
    protected String caseNamespace;
    protected String identificationKey;
    protected TCategory category;
    protected String outcome;
    protected String outcomeDisplayName;
    @XmlElement(required = true)
    protected TSca sca;
    protected List<String> actions;
    protected String caseSummaryFormURI;
    protected String organizationalUnitId;
    @XmlElement(required = true)
    protected TCompletedCaseActivityList completedCaseActivityList;
    protected TUserPermissions userPermissions;
    protected TUserActions userActions;

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
     * Gets the value of the caseName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * Sets the value of the caseName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseName(String value) {
        this.caseName = value;
    }

    public boolean isSetCaseName() {
        return (this.caseName != null);
    }

    /**
     * Gets the value of the caseDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseDisplayName() {
        return caseDisplayName;
    }

    /**
     * Sets the value of the caseDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseDisplayName(String value) {
        this.caseDisplayName = value;
    }

    public boolean isSetCaseDisplayName() {
        return (this.caseDisplayName != null);
    }

    /**
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title != null);
    }

    /**
     * Gets the value of the summary property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    public boolean isSetSummary() {
        return (this.summary != null);
    }

    /**
     * Gets the value of the priority property.
     *
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    public boolean isSetPriority() {
        return true;
    }

    /**
     * Gets the value of the createdBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    public boolean isSetCreatedBy() {
        return (this.createdBy != null);
    }

    /**
     * Gets the value of the createdByDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreatedByDisplayName() {
        return createdByDisplayName;
    }

    /**
     * Sets the value of the createdByDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatedByDisplayName(String value) {
        this.createdByDisplayName = value;
    }

    public boolean isSetCreatedByDisplayName() {
        return (this.createdByDisplayName != null);
    }

    /**
     * Gets the value of the createdDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    public boolean isSetCreatedDate() {
        return (this.createdDate != null);
    }

    /**
     * Gets the value of the endDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }

    public boolean isSetEndDate() {
        return (this.endDate != null);
    }

    /**
     * Gets the value of the expirationDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationDate = value;
    }

    public boolean isSetExpirationDate() {
        return (this.expirationDate != null);
    }

    /**
     * Gets the value of the dueDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setDueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dueDate = value;
    }

    public boolean isSetDueDate() {
        return (this.dueDate != null);
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link TStateEnum }
     *
     */
    public TStateEnum getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link TStateEnum }
     *
     */
    public void setState(TStateEnum value) {
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
     * Gets the value of the userDefinedStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserDefinedStatus() {
        return userDefinedStatus;
    }

    /**
     * Sets the value of the userDefinedStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserDefinedStatus(String value) {
        this.userDefinedStatus = value;
    }

    public boolean isSetUserDefinedStatus() {
        return (this.userDefinedStatus != null);
    }

    /**
     * Gets the value of the userDefinedStatusDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserDefinedStatusDisplayName() {
        return userDefinedStatusDisplayName;
    }

    /**
     * Sets the value of the userDefinedStatusDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserDefinedStatusDisplayName(String value) {
        this.userDefinedStatusDisplayName = value;
    }

    public boolean isSetUserDefinedStatusDisplayName() {
        return (this.userDefinedStatusDisplayName != null);
    }

    /**
     * Gets the value of the ecmFolder property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEcmFolder() {
        return ecmFolder;
    }

    /**
     * Sets the value of the ecmFolder property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEcmFolder(String value) {
        this.ecmFolder = value;
    }

    public boolean isSetEcmFolder() {
        return (this.ecmFolder != null);
    }

    /**
     * Gets the value of the caseDefinitionId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseDefinitionId() {
        return caseDefinitionId;
    }

    /**
     * Sets the value of the caseDefinitionId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseDefinitionId(String value) {
        this.caseDefinitionId = value;
    }

    public boolean isSetCaseDefinitionId() {
        return (this.caseDefinitionId != null);
    }

    /**
     * Gets the value of the caseDefinitionName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseDefinitionName() {
        return caseDefinitionName;
    }

    /**
     * Sets the value of the caseDefinitionName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseDefinitionName(String value) {
        this.caseDefinitionName = value;
    }

    public boolean isSetCaseDefinitionName() {
        return (this.caseDefinitionName != null);
    }

    /**
     * Gets the value of the caseNamespace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseNamespace() {
        return caseNamespace;
    }

    /**
     * Sets the value of the caseNamespace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseNamespace(String value) {
        this.caseNamespace = value;
    }

    public boolean isSetCaseNamespace() {
        return (this.caseNamespace != null);
    }

    /**
     * Gets the value of the identificationKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentificationKey() {
        return identificationKey;
    }

    /**
     * Sets the value of the identificationKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentificationKey(String value) {
        this.identificationKey = value;
    }

    public boolean isSetIdentificationKey() {
        return (this.identificationKey != null);
    }

    /**
     * Gets the value of the category property.
     *
     * @return
     *     possible object is
     *     {@link TCategory }
     *
     */
    public TCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value
     *     allowed object is
     *     {@link TCategory }
     *
     */
    public void setCategory(TCategory value) {
        this.category = value;
    }

    public boolean isSetCategory() {
        return (this.category != null);
    }

    /**
     * Gets the value of the outcome property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOutcome(String value) {
        this.outcome = value;
    }

    public boolean isSetOutcome() {
        return (this.outcome != null);
    }

    /**
     * Gets the value of the outcomeDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOutcomeDisplayName() {
        return outcomeDisplayName;
    }

    /**
     * Sets the value of the outcomeDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOutcomeDisplayName(String value) {
        this.outcomeDisplayName = value;
    }

    public boolean isSetOutcomeDisplayName() {
        return (this.outcomeDisplayName != null);
    }

    /**
     * Gets the value of the sca property.
     *
     * @return
     *     possible object is
     *     {@link TSca }
     *
     */
    public TSca getSca() {
        return sca;
    }

    /**
     * Sets the value of the sca property.
     *
     * @param value
     *     allowed object is
     *     {@link TSca }
     *
     */
    public void setSca(TSca value) {
        this.sca = value;
    }

    public boolean isSetSca() {
        return (this.sca != null);
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
     * Gets the value of the caseSummaryFormURI property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseSummaryFormURI() {
        return caseSummaryFormURI;
    }

    /**
     * Sets the value of the caseSummaryFormURI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseSummaryFormURI(String value) {
        this.caseSummaryFormURI = value;
    }

    public boolean isSetCaseSummaryFormURI() {
        return (this.caseSummaryFormURI != null);
    }

    /**
     * Gets the value of the organizationalUnitId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizationalUnitId() {
        return organizationalUnitId;
    }

    /**
     * Sets the value of the organizationalUnitId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizationalUnitId(String value) {
        this.organizationalUnitId = value;
    }

    public boolean isSetOrganizationalUnitId() {
        return (this.organizationalUnitId != null);
    }

    /**
     * Gets the value of the completedCaseActivityList property.
     *
     * @return
     *     possible object is
     *     {@link TCompletedCaseActivityList }
     *
     */
    public TCompletedCaseActivityList getCompletedCaseActivityList() {
        return completedCaseActivityList;
    }

    /**
     * Sets the value of the completedCaseActivityList property.
     *
     * @param value
     *     allowed object is
     *     {@link TCompletedCaseActivityList }
     *
     */
    public void setCompletedCaseActivityList(TCompletedCaseActivityList value) {
        this.completedCaseActivityList = value;
    }

    public boolean isSetCompletedCaseActivityList() {
        return (this.completedCaseActivityList != null);
    }

    /**
     * Gets the value of the userPermissions property.
     *
     * @return
     *     possible object is
     *     {@link TUserPermissions }
     *
     */
    public TUserPermissions getUserPermissions() {
        return userPermissions;
    }

    /**
     * Sets the value of the userPermissions property.
     *
     * @param value
     *     allowed object is
     *     {@link TUserPermissions }
     *
     */
    public void setUserPermissions(TUserPermissions value) {
        this.userPermissions = value;
    }

    public boolean isSetUserPermissions() {
        return (this.userPermissions != null);
    }

    /**
     * Gets the value of the userActions property.
     *
     * @return
     *     possible object is
     *     {@link TUserActions }
     *
     */
    public TUserActions getUserActions() {
        return userActions;
    }

    /**
     * Sets the value of the userActions property.
     *
     * @param value
     *     allowed object is
     *     {@link TUserActions }
     *
     */
    public void setUserActions(TUserActions value) {
        this.userActions = value;
    }

    public boolean isSetUserActions() {
        return (this.userActions != null);
    }

}
