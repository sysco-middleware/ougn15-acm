
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tStakeHolders complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tStakeHolders">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="stakeHolder" type="{http://xmlns.oracle.com/bpm/case}tStakeHolder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStakeHolders", propOrder = { "stakeHolder" })
public class TStakeHolders extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected List<TStakeHolder> stakeHolder;

    /**
     * Gets the value of the stakeHolder property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stakeHolder property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStakeHolder().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TStakeHolder }
     *
     *
     */
    public List<TStakeHolder> getStakeHolder() {
        if (stakeHolder == null) {
            stakeHolder = new ArrayList<TStakeHolder>();
        }
        return this.stakeHolder;
    }

    public boolean isSetStakeHolder() {
        return ((this.stakeHolder != null) && (!this.stakeHolder.isEmpty()));
    }

    public void unsetStakeHolder() {
        this.stakeHolder = null;
    }

}
