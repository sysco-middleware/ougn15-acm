
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tCompletedCaseActivityList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tCompletedCaseActivityList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="completedCaseActivity" type="{http://xmlns.oracle.com/bpm/case}tCompletedCaseActivity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCompletedCaseActivityList", propOrder = { "completedCaseActivity" })
public class TCompletedCaseActivityList extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected List<TCompletedCaseActivity> completedCaseActivity;

    /**
     * Gets the value of the completedCaseActivity property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the completedCaseActivity property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompletedCaseActivity().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCompletedCaseActivity }
     *
     *
     */
    public List<TCompletedCaseActivity> getCompletedCaseActivity() {
        if (completedCaseActivity == null) {
            completedCaseActivity = new ArrayList<TCompletedCaseActivity>();
        }
        return this.completedCaseActivity;
    }

    public boolean isSetCompletedCaseActivity() {
        return ((this.completedCaseActivity != null) && (!this.completedCaseActivity.isEmpty()));
    }

    public void unsetCompletedCaseActivity() {
        this.completedCaseActivity = null;
    }

}
