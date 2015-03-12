
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tUserActions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tUserActions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="actionsPermittedForCaseObject" type="{http://xmlns.oracle.com/bpm/case}tActionsPermittedForCaseObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUserActions", propOrder = { "actionsPermittedForCaseObject" })
public class TUserActions extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected List<TActionsPermittedForCaseObject> actionsPermittedForCaseObject;

    /**
     * Gets the value of the actionsPermittedForCaseObject property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionsPermittedForCaseObject property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionsPermittedForCaseObject().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TActionsPermittedForCaseObject }
     *
     *
     */
    public List<TActionsPermittedForCaseObject> getActionsPermittedForCaseObject() {
        if (actionsPermittedForCaseObject == null) {
            actionsPermittedForCaseObject = new ArrayList<TActionsPermittedForCaseObject>();
        }
        return this.actionsPermittedForCaseObject;
    }

    public boolean isSetActionsPermittedForCaseObject() {
        return ((this.actionsPermittedForCaseObject != null) && (!this.actionsPermittedForCaseObject.isEmpty()));
    }

    public void unsetActionsPermittedForCaseObject() {
        this.actionsPermittedForCaseObject = null;
    }

}
