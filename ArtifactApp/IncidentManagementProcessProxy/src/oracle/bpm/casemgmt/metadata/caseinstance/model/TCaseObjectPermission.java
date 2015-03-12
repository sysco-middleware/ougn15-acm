
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tCaseObjectPermission complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tCaseObjectPermission">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="caseObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="actionUserCanPerform" type="{http://xmlns.oracle.com/bpm/case}tActionUserCanPerform" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCaseObjectPermission", propOrder = { "caseObject", "actionUserCanPerform" })
public class TCaseObjectPermission extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected String caseObject;
    protected List<TActionUserCanPerform> actionUserCanPerform;

    /**
     * Gets the value of the caseObject property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseObject() {
        return caseObject;
    }

    /**
     * Sets the value of the caseObject property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseObject(String value) {
        this.caseObject = value;
    }

    public boolean isSetCaseObject() {
        return (this.caseObject != null);
    }

    /**
     * Gets the value of the actionUserCanPerform property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionUserCanPerform property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionUserCanPerform().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TActionUserCanPerform }
     *
     *
     */
    public List<TActionUserCanPerform> getActionUserCanPerform() {
        if (actionUserCanPerform == null) {
            actionUserCanPerform = new ArrayList<TActionUserCanPerform>();
        }
        return this.actionUserCanPerform;
    }

    public boolean isSetActionUserCanPerform() {
        return ((this.actionUserCanPerform != null) && (!this.actionUserCanPerform.isEmpty()));
    }

    public void unsetActionUserCanPerform() {
        this.actionUserCanPerform = null;
    }

}
