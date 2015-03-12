
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tCase complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tCase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="caseHeader" type="{http://xmlns.oracle.com/bpm/case}tCaseHeader"/>
 *         &lt;element name="stakeHolders" type="{http://xmlns.oracle.com/bpm/case}tStakeHolders" minOccurs="0"/>
 *         &lt;element name="milestones" type="{http://xmlns.oracle.com/bpm/case}tMilestones" minOccurs="0"/>
 *         &lt;element name="data" type="{http://xmlns.oracle.com/bpm/case}tData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="links" type="{http://xmlns.oracle.com/bpm/case}tLinks" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://xmlns.oracle.com/bpm/case}tComments" minOccurs="0"/>
 *         &lt;element name="caseFabricHeaderProperty" type="{http://xmlns.oracle.com/bpm/case}tCaseFabricHeaderProperty" minOccurs="0"/>
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
@XmlType(name = "tCase", propOrder = {
         "caseId", "caseHeader", "stakeHolders", "milestones", "data", "links", "comments", "caseFabricHeaderProperty",
         "actions"
    })
public class TCase extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String caseId;
    @XmlElement(required = true)
    protected TCaseHeader caseHeader;
    protected TStakeHolders stakeHolders;
    protected TMilestones milestones;
    protected List<TData> data;
    protected TLinks links;
    protected TComments comments;
    protected TCaseFabricHeaderProperty caseFabricHeaderProperty;
    protected List<String> actions;

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
     * Gets the value of the caseHeader property.
     *
     * @return
     *     possible object is
     *     {@link TCaseHeader }
     *
     */
    public TCaseHeader getCaseHeader() {
        return caseHeader;
    }

    /**
     * Sets the value of the caseHeader property.
     *
     * @param value
     *     allowed object is
     *     {@link TCaseHeader }
     *
     */
    public void setCaseHeader(TCaseHeader value) {
        this.caseHeader = value;
    }

    public boolean isSetCaseHeader() {
        return (this.caseHeader != null);
    }

    /**
     * Gets the value of the stakeHolders property.
     *
     * @return
     *     possible object is
     *     {@link TStakeHolders }
     *
     */
    public TStakeHolders getStakeHolders() {
        return stakeHolders;
    }

    /**
     * Sets the value of the stakeHolders property.
     *
     * @param value
     *     allowed object is
     *     {@link TStakeHolders }
     *
     */
    public void setStakeHolders(TStakeHolders value) {
        this.stakeHolders = value;
    }

    public boolean isSetStakeHolders() {
        return (this.stakeHolders != null);
    }

    /**
     * Gets the value of the milestones property.
     *
     * @return
     *     possible object is
     *     {@link TMilestones }
     *
     */
    public TMilestones getMilestones() {
        return milestones;
    }

    /**
     * Sets the value of the milestones property.
     *
     * @param value
     *     allowed object is
     *     {@link TMilestones }
     *
     */
    public void setMilestones(TMilestones value) {
        this.milestones = value;
    }

    public boolean isSetMilestones() {
        return (this.milestones != null);
    }

    /**
     * Gets the value of the data property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TData }
     *
     *
     */
    public List<TData> getData() {
        if (data == null) {
            data = new ArrayList<TData>();
        }
        return this.data;
    }

    public boolean isSetData() {
        return ((this.data != null) && (!this.data.isEmpty()));
    }

    public void unsetData() {
        this.data = null;
    }

    /**
     * Gets the value of the links property.
     *
     * @return
     *     possible object is
     *     {@link TLinks }
     *
     */
    public TLinks getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     *
     * @param value
     *     allowed object is
     *     {@link TLinks }
     *
     */
    public void setLinks(TLinks value) {
        this.links = value;
    }

    public boolean isSetLinks() {
        return (this.links != null);
    }

    /**
     * Gets the value of the comments property.
     *
     * @return
     *     possible object is
     *     {@link TComments }
     *
     */
    public TComments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value
     *     allowed object is
     *     {@link TComments }
     *
     */
    public void setComments(TComments value) {
        this.comments = value;
    }

    public boolean isSetComments() {
        return (this.comments != null);
    }

    /**
     * Gets the value of the caseFabricHeaderProperty property.
     *
     * @return
     *     possible object is
     *     {@link TCaseFabricHeaderProperty }
     *
     */
    public TCaseFabricHeaderProperty getCaseFabricHeaderProperty() {
        return caseFabricHeaderProperty;
    }

    /**
     * Sets the value of the caseFabricHeaderProperty property.
     *
     * @param value
     *     allowed object is
     *     {@link TCaseFabricHeaderProperty }
     *
     */
    public void setCaseFabricHeaderProperty(TCaseFabricHeaderProperty value) {
        this.caseFabricHeaderProperty = value;
    }

    public boolean isSetCaseFabricHeaderProperty() {
        return (this.caseFabricHeaderProperty != null);
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
