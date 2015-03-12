
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tActionUserCanPerform complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tActionUserCanPerform">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="permissionTag" type="{http://xmlns.oracle.com/bpm/case}tPermissionTag" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tActionUserCanPerform", propOrder = { "action", "permissionTag" })
public class TActionUserCanPerform extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected String action;
    protected List<TPermissionTag> permissionTag;

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAction(String value) {
        this.action = value;
    }

    public boolean isSetAction() {
        return (this.action != null);
    }

    /**
     * Gets the value of the permissionTag property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissionTag property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissionTag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPermissionTag }
     *
     *
     */
    public List<TPermissionTag> getPermissionTag() {
        if (permissionTag == null) {
            permissionTag = new ArrayList<TPermissionTag>();
        }
        return this.permissionTag;
    }

    public boolean isSetPermissionTag() {
        return ((this.permissionTag != null) && (!this.permissionTag.isEmpty()));
    }

    public void unsetPermissionTag() {
        this.permissionTag = null;
    }

}
