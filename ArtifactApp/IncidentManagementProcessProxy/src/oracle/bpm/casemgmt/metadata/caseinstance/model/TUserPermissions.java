
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tUserPermissions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tUserPermissions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="caseObjectPermission" type="{http://xmlns.oracle.com/bpm/case}tCaseObjectPermission" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tUserPermissions", propOrder = { "userId", "caseObjectPermission" })
public class TUserPermissions extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected String userId;
    protected List<TCaseObjectPermission> caseObjectPermission;

    /**
     * Gets the value of the userId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    public boolean isSetUserId() {
        return (this.userId != null);
    }

    /**
     * Gets the value of the caseObjectPermission property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseObjectPermission property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseObjectPermission().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCaseObjectPermission }
     *
     *
     */
    public List<TCaseObjectPermission> getCaseObjectPermission() {
        if (caseObjectPermission == null) {
            caseObjectPermission = new ArrayList<TCaseObjectPermission>();
        }
        return this.caseObjectPermission;
    }

    public boolean isSetCaseObjectPermission() {
        return ((this.caseObjectPermission != null) && (!this.caseObjectPermission.isEmpty()));
    }

    public void unsetCaseObjectPermission() {
        this.caseObjectPermission = null;
    }

}
