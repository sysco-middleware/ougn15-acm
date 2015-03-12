
package oracle.bpm.casemgmt.metadata.extension.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.caseinstance.model.TActionUserCanPerform;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TActionsPermittedForCaseObject;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TCase;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TCaseFabricHeaderProperty;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TCaseHeader;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TCaseObjectPermission;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TCategory;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TComment;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TComments;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TCompletedCaseActivity;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TCompletedCaseActivityList;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TData;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TIdentity;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TLink;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TLinks;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TMilestone;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TMilestones;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TPermissionTag;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TSca;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TStakeHolder;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TStakeHolderMember;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TStakeHolderMembers;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TStakeHolders;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TUserActions;
import oracle.bpm.casemgmt.metadata.caseinstance.model.TUserPermissions;


/**
 * <p>Java class for tExtensibleElements complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tExtensibleElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentation" type="{http://xmlns.oracle.com/bpm/case/metadata/extension}tDocumentation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tExtensibleElements", propOrder = { "documentation" })
@XmlSeeAlso({
            TMilestone.class, TCase.class, TComment.class, TSca.class, TCompletedCaseActivityList.class,
            TStakeHolder.class, TMilestones.class, TData.class, TUserActions.class, TStakeHolders.class,
            TIdentity.class, TCaseFabricHeaderProperty.class, TStakeHolderMembers.class, TUserPermissions.class,
            TLinks.class, TCompletedCaseActivity.class, TLink.class, TActionUserCanPerform.class, TPermissionTag.class,
            TCategory.class, TCaseObjectPermission.class, TActionsPermittedForCaseObject.class, TCaseHeader.class,
            TComments.class, TStakeHolderMember.class
    })
public class TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected List<TDocumentation> documentation;

    /**
     * Gets the value of the documentation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDocumentation }
     *
     *
     */
    public List<TDocumentation> getDocumentation() {
        if (documentation == null) {
            documentation = new ArrayList<TDocumentation>();
        }
        return this.documentation;
    }

    public boolean isSetDocumentation() {
        return ((this.documentation != null) && (!this.documentation.isEmpty()));
    }

    public void unsetDocumentation() {
        this.documentation = null;
    }

}
