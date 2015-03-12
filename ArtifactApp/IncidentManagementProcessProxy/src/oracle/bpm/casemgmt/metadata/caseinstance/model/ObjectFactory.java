
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the oracle.bpm.casemgmt.metadata.caseinstance.model package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TCaseHeaderExpirationDate_QNAME =
        new QName("http://xmlns.oracle.com/bpm/case", "expirationDate");
    private final static QName _TCaseHeaderEndDate_QNAME = new QName("http://xmlns.oracle.com/bpm/case", "endDate");
    private final static QName _TCaseHeaderDueDate_QNAME = new QName("http://xmlns.oracle.com/bpm/case", "dueDate");
    private final static QName _TScaCompositeCreatedTime_QNAME =
        new QName("http://xmlns.oracle.com/bpm/case", "compositeCreatedTime");
    private final static QName _TMilestoneDeadline_QNAME = new QName("http://xmlns.oracle.com/bpm/case", "deadline");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.bpm.casemgmt.metadata.caseinstance.model
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TMilestone }
     *
     */
    public TMilestone createTMilestone() {
        return new TMilestone();
    }

    /**
     * Create an instance of {@link TCase }
     *
     */
    public TCase createTCase() {
        return new TCase();
    }

    /**
     * Create an instance of {@link TComment }
     *
     */
    public TComment createTComment() {
        return new TComment();
    }

    /**
     * Create an instance of {@link TSca }
     *
     */
    public TSca createTSca() {
        return new TSca();
    }

    /**
     * Create an instance of {@link TCompletedCaseActivityList }
     *
     */
    public TCompletedCaseActivityList createTCompletedCaseActivityList() {
        return new TCompletedCaseActivityList();
    }

    /**
     * Create an instance of {@link TStakeHolder }
     *
     */
    public TStakeHolder createTStakeHolder() {
        return new TStakeHolder();
    }

    /**
     * Create an instance of {@link TMilestones }
     *
     */
    public TMilestones createTMilestones() {
        return new TMilestones();
    }

    /**
     * Create an instance of {@link TData }
     *
     */
    public TData createTData() {
        return new TData();
    }

    /**
     * Create an instance of {@link TUserActions }
     *
     */
    public TUserActions createTUserActions() {
        return new TUserActions();
    }

    /**
     * Create an instance of {@link TStakeHolders }
     *
     */
    public TStakeHolders createTStakeHolders() {
        return new TStakeHolders();
    }

    /**
     * Create an instance of {@link TIdentity }
     *
     */
    public TIdentity createTIdentity() {
        return new TIdentity();
    }

    /**
     * Create an instance of {@link TCaseFabricHeaderProperty }
     *
     */
    public TCaseFabricHeaderProperty createTCaseFabricHeaderProperty() {
        return new TCaseFabricHeaderProperty();
    }

    /**
     * Create an instance of {@link TStakeHolderMembers }
     *
     */
    public TStakeHolderMembers createTStakeHolderMembers() {
        return new TStakeHolderMembers();
    }

    /**
     * Create an instance of {@link TUserPermissions }
     *
     */
    public TUserPermissions createTUserPermissions() {
        return new TUserPermissions();
    }

    /**
     * Create an instance of {@link TLinks }
     *
     */
    public TLinks createTLinks() {
        return new TLinks();
    }

    /**
     * Create an instance of {@link TCompletedCaseActivity }
     *
     */
    public TCompletedCaseActivity createTCompletedCaseActivity() {
        return new TCompletedCaseActivity();
    }

    /**
     * Create an instance of {@link TLink }
     *
     */
    public TLink createTLink() {
        return new TLink();
    }

    /**
     * Create an instance of {@link TActionUserCanPerform }
     *
     */
    public TActionUserCanPerform createTActionUserCanPerform() {
        return new TActionUserCanPerform();
    }

    /**
     * Create an instance of {@link TPermissionTag }
     *
     */
    public TPermissionTag createTPermissionTag() {
        return new TPermissionTag();
    }

    /**
     * Create an instance of {@link TCategory }
     *
     */
    public TCategory createTCategory() {
        return new TCategory();
    }

    /**
     * Create an instance of {@link TCaseObjectPermission }
     *
     */
    public TCaseObjectPermission createTCaseObjectPermission() {
        return new TCaseObjectPermission();
    }

    /**
     * Create an instance of {@link TActionsPermittedForCaseObject }
     *
     */
    public TActionsPermittedForCaseObject createTActionsPermittedForCaseObject() {
        return new TActionsPermittedForCaseObject();
    }

    /**
     * Create an instance of {@link TCaseHeader }
     *
     */
    public TCaseHeader createTCaseHeader() {
        return new TCaseHeader();
    }

    /**
     * Create an instance of {@link TComments }
     *
     */
    public TComments createTComments() {
        return new TComments();
    }

    /**
     * Create an instance of {@link TStakeHolderMember }
     *
     */
    public TStakeHolderMember createTStakeHolderMember() {
        return new TStakeHolderMember();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case", name = "expirationDate", scope = TCaseHeader.class)
    public JAXBElement<XMLGregorianCalendar> createTCaseHeaderExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TCaseHeaderExpirationDate_QNAME, XMLGregorianCalendar.class,
                                                     TCaseHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case", name = "endDate", scope = TCaseHeader.class)
    public JAXBElement<XMLGregorianCalendar> createTCaseHeaderEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TCaseHeaderEndDate_QNAME, XMLGregorianCalendar.class,
                                                     TCaseHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case", name = "dueDate", scope = TCaseHeader.class)
    public JAXBElement<XMLGregorianCalendar> createTCaseHeaderDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TCaseHeaderDueDate_QNAME, XMLGregorianCalendar.class,
                                                     TCaseHeader.class, value);
    }

    /**
     * Create an instance of {@link Milestone }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case", name = "milestone")
    public Milestone createMilestone(TMilestone value) {
        return new Milestone(value);
    }

    /**
     * Create an instance of {@link Case }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case", name = "case")
    public Case createCase(TCase value) {
        return new Case(value);
    }

    /**
     * Create an instance of {@link Comment }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case", name = "comment")
    public Comment createComment(TComment value) {
        return new Comment(value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case", name = "compositeCreatedTime", scope = TSca.class)
    public JAXBElement<XMLGregorianCalendar> createTScaCompositeCreatedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TScaCompositeCreatedTime_QNAME, XMLGregorianCalendar.class,
                                                     TSca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case", name = "deadline", scope = TMilestone.class)
    public JAXBElement<XMLGregorianCalendar> createTMilestoneDeadline(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TMilestoneDeadline_QNAME, XMLGregorianCalendar.class,
                                                     TMilestone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case", name = "compositeCreatedTime",
                    scope = TCaseFabricHeaderProperty.class)
    public JAXBElement<XMLGregorianCalendar> createTCaseFabricHeaderPropertyCompositeCreatedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TScaCompositeCreatedTime_QNAME, XMLGregorianCalendar.class,
                                                     TCaseFabricHeaderProperty.class, value);
    }

}
