
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tMilestones complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tMilestones">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="milestone" type="{http://xmlns.oracle.com/bpm/case}tMilestone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMilestones", propOrder = { "milestone" })
public class TMilestones extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected List<TMilestone> milestone;

    /**
     * Gets the value of the milestone property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the milestone property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilestone().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMilestone }
     *
     *
     */
    public List<TMilestone> getMilestone() {
        if (milestone == null) {
            milestone = new ArrayList<TMilestone>();
        }
        return this.milestone;
    }

    public boolean isSetMilestone() {
        return ((this.milestone != null) && (!this.milestone.isEmpty()));
    }

    public void unsetMilestone() {
        this.milestone = null;
    }

}
