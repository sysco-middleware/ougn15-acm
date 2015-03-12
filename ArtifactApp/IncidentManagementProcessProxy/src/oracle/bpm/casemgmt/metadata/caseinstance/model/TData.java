
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
 * <p>Java class for tData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="external" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updatedByDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseDataFormUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tData", propOrder = {
         "id", "caseId", "name", "displayName", "external", "state", "data", "updatedDate", "updatedBy",
         "updatedByDisplayName", "caseDataFormUrl", "actions", "comment"
    })
public class TData extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String caseId;
    @XmlElement(required = true)
    protected String name;
    protected String displayName;
    protected Boolean external;
    protected String state;
    @XmlElement(required = true)
    protected Object data;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    @XmlElement(required = true)
    protected String updatedBy;
    protected String updatedByDisplayName;
    protected String caseDataFormUrl;
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
     * Gets the value of the external property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setExternal(Boolean value) {
        this.external = value;
    }

    public boolean isSetExternal() {
        return (this.external != null);
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
     * Gets the value of the data property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setData(Object value) {
        this.data = value;
    }

    public boolean isSetData() {
        return (this.data != null);
    }

    /**
     * Gets the value of the updatedDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

    public boolean isSetUpdatedDate() {
        return (this.updatedDate != null);
    }

    /**
     * Gets the value of the updatedBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    public boolean isSetUpdatedBy() {
        return (this.updatedBy != null);
    }

    /**
     * Gets the value of the updatedByDisplayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUpdatedByDisplayName() {
        return updatedByDisplayName;
    }

    /**
     * Sets the value of the updatedByDisplayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUpdatedByDisplayName(String value) {
        this.updatedByDisplayName = value;
    }

    public boolean isSetUpdatedByDisplayName() {
        return (this.updatedByDisplayName != null);
    }

    /**
     * Gets the value of the caseDataFormUrl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseDataFormUrl() {
        return caseDataFormUrl;
    }

    /**
     * Sets the value of the caseDataFormUrl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseDataFormUrl(String value) {
        this.caseDataFormUrl = value;
    }

    public boolean isSetCaseDataFormUrl() {
        return (this.caseDataFormUrl != null);
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
