
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tStakeHolderMembers complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tStakeHolderMembers">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="stakeHolderMember" type="{http://xmlns.oracle.com/bpm/case}tStakeHolderMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStakeHolderMembers", propOrder = { "stakeHolderMember" })
public class TStakeHolderMembers extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected List<TStakeHolderMember> stakeHolderMember;

    /**
     * Gets the value of the stakeHolderMember property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stakeHolderMember property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStakeHolderMember().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TStakeHolderMember }
     *
     *
     */
    public List<TStakeHolderMember> getStakeHolderMember() {
        if (stakeHolderMember == null) {
            stakeHolderMember = new ArrayList<TStakeHolderMember>();
        }
        return this.stakeHolderMember;
    }

    public boolean isSetStakeHolderMember() {
        return ((this.stakeHolderMember != null) && (!this.stakeHolderMember.isEmpty()));
    }

    public void unsetStakeHolderMember() {
        this.stakeHolderMember = null;
    }

}
