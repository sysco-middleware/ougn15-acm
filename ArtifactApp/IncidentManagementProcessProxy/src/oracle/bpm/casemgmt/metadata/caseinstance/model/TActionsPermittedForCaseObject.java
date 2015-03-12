
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
 * <p>Java class for tActionsPermittedForCaseObject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tActionsPermittedForCaseObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="caseObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;sequence>
 *           &lt;element name="permittedAction" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tActionsPermittedForCaseObject", propOrder = { "caseObjectType", "permittedAction" })
public class TActionsPermittedForCaseObject extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String caseObjectType;
    protected List<String> permittedAction;

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
     * Gets the value of the permittedAction property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permittedAction property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermittedAction().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getPermittedAction() {
        if (permittedAction == null) {
            permittedAction = new ArrayList<String>();
        }
        return this.permittedAction;
    }

    public boolean isSetPermittedAction() {
        return ((this.permittedAction != null) && (!this.permittedAction.isEmpty()));
    }

    public void unsetPermittedAction() {
        this.permittedAction = null;
    }

}
