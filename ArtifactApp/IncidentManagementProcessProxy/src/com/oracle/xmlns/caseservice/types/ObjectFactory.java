
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.caseservice.types package.
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.caseservice.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TMilestoneInputMessage }
     *
     */
    public TMilestoneInputMessage createTMilestoneInputMessage() {
        return new TMilestoneInputMessage();
    }

    /**
     * Create an instance of {@link TStartCaseInputMessage }
     *
     */
    public TStartCaseInputMessage createTStartCaseInputMessage() {
        return new TStartCaseInputMessage();
    }

    /**
     * Create an instance of {@link TCloseCaseInputMessage }
     *
     */
    public TCloseCaseInputMessage createTCloseCaseInputMessage() {
        return new TCloseCaseInputMessage();
    }

    /**
     * Create an instance of {@link TSuspendResumeAbortCaseInputMessage }
     *
     */
    public TSuspendResumeAbortCaseInputMessage createTSuspendResumeAbortCaseInputMessage() {
        return new TSuspendResumeAbortCaseInputMessage();
    }

    /**
     * Create an instance of {@link TSuspendResumeAbortCaseOutputMessage }
     *
     */
    public TSuspendResumeAbortCaseOutputMessage createTSuspendResumeAbortCaseOutputMessage() {
        return new TSuspendResumeAbortCaseOutputMessage();
    }

    /**
     * Create an instance of {@link TCaseIdentifier }
     *
     */
    public TCaseIdentifier createTCaseIdentifier() {
        return new TCaseIdentifier();
    }

    /**
     * Create an instance of {@link TForceCloseCaseOutputMessage }
     *
     */
    public TForceCloseCaseOutputMessage createTForceCloseCaseOutputMessage() {
        return new TForceCloseCaseOutputMessage();
    }

    /**
     * Create an instance of {@link TStartCaseOutputMessage }
     *
     */
    public TStartCaseOutputMessage createTStartCaseOutputMessage() {
        return new TStartCaseOutputMessage();
    }

    /**
     * Create an instance of {@link TMilestoneOutputMessage }
     *
     */
    public TMilestoneOutputMessage createTMilestoneOutputMessage() {
        return new TMilestoneOutputMessage();
    }

    /**
     * Create an instance of {@link TCloseCaseOutputMessage }
     *
     */
    public TCloseCaseOutputMessage createTCloseCaseOutputMessage() {
        return new TCloseCaseOutputMessage();
    }

    /**
     * Create an instance of {@link TBpmContext }
     *
     */
    public TBpmContext createTBpmContext() {
        return new TBpmContext();
    }

    /**
     * Create an instance of {@link TForceCloseCaseInputMessage }
     *
     */
    public TForceCloseCaseInputMessage createTForceCloseCaseInputMessage() {
        return new TForceCloseCaseInputMessage();
    }

    /**
     * Create an instance of {@link TCaseServiceFaultMessage }
     *
     */
    public TCaseServiceFaultMessage createTCaseServiceFaultMessage() {
        return new TCaseServiceFaultMessage();
    }

    /**
     * Create an instance of {@link TCredential }
     *
     */
    public TCredential createTCredential() {
        return new TCredential();
    }

    /**
     * Create an instance of {@link RevokeMilestoneOutputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "revokeMilestoneOutputMessage")
    public RevokeMilestoneOutputMessage createRevokeMilestoneOutputMessage(TMilestoneOutputMessage value) {
        return new RevokeMilestoneOutputMessage(value);
    }

    /**
     * Create an instance of {@link CloseCaseOutputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "closeCaseOutputMessage")
    public CloseCaseOutputMessage createCloseCaseOutputMessage(TCloseCaseOutputMessage value) {
        return new CloseCaseOutputMessage(value);
    }

    /**
     * Create an instance of {@link StartCaseOutputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "startCaseOutputMessage")
    public StartCaseOutputMessage createStartCaseOutputMessage(TStartCaseOutputMessage value) {
        return new StartCaseOutputMessage(value);
    }

    /**
     * Create an instance of {@link AttainMilestoneOutputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "attainMilestoneOutputMessage")
    public AttainMilestoneOutputMessage createAttainMilestoneOutputMessage(TMilestoneOutputMessage value) {
        return new AttainMilestoneOutputMessage(value);
    }

    /**
     * Create an instance of {@link ReopenCaseOutputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "reopenCaseOutputMessage")
    public ReopenCaseOutputMessage createReopenCaseOutputMessage(TSuspendResumeAbortCaseOutputMessage value) {
        return new ReopenCaseOutputMessage(value);
    }

    /**
     * Create an instance of {@link ForceCloseCaseInputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "forceCloseCaseInputMessage")
    public ForceCloseCaseInputMessage createForceCloseCaseInputMessage(TForceCloseCaseInputMessage value) {
        return new ForceCloseCaseInputMessage(value);
    }

    /**
     * Create an instance of {@link ResumeCaseOutputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "resumeCaseOutputMessage")
    public ResumeCaseOutputMessage createResumeCaseOutputMessage(TSuspendResumeAbortCaseOutputMessage value) {
        return new ResumeCaseOutputMessage(value);
    }

    /**
     * Create an instance of {@link CaseServiceFaultMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "caseServiceFaultMessage")
    public CaseServiceFaultMessage createCaseServiceFaultMessage(TCaseServiceFaultMessage value) {
        return new CaseServiceFaultMessage(value);
    }

    /**
     * Create an instance of {@link BpmContext }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "bpmContext")
    public BpmContext createBpmContext(TBpmContext value) {
        return new BpmContext(value);
    }

    /**
     * Create an instance of {@link ResumeCaseInputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "resumeCaseInputMessage")
    public ResumeCaseInputMessage createResumeCaseInputMessage(TSuspendResumeAbortCaseInputMessage value) {
        return new ResumeCaseInputMessage(value);
    }

    /**
     * Create an instance of {@link SuspendCaseOutputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "suspendCaseOutputMessage")
    public SuspendCaseOutputMessage createSuspendCaseOutputMessage(TSuspendResumeAbortCaseOutputMessage value) {
        return new SuspendCaseOutputMessage(value);
    }

    /**
     * Create an instance of {@link CloseCaseInputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "closeCaseInputMessage")
    public CloseCaseInputMessage createCloseCaseInputMessage(TCloseCaseInputMessage value) {
        return new CloseCaseInputMessage(value);
    }

    /**
     * Create an instance of {@link StartCaseInputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "startCaseInputMessage")
    public StartCaseInputMessage createStartCaseInputMessage(TStartCaseInputMessage value) {
        return new StartCaseInputMessage(value);
    }

    /**
     * Create an instance of {@link AbortCaseInputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "abortCaseInputMessage")
    public AbortCaseInputMessage createAbortCaseInputMessage(TSuspendResumeAbortCaseInputMessage value) {
        return new AbortCaseInputMessage(value);
    }

    /**
     * Create an instance of {@link AbortCaseOutputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "abortCaseOutputMessage")
    public AbortCaseOutputMessage createAbortCaseOutputMessage(TSuspendResumeAbortCaseOutputMessage value) {
        return new AbortCaseOutputMessage(value);
    }

    /**
     * Create an instance of {@link RevokeMilestoneInputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "revokeMilestoneInputMessage")
    public RevokeMilestoneInputMessage createRevokeMilestoneInputMessage(TMilestoneInputMessage value) {
        return new RevokeMilestoneInputMessage(value);
    }

    /**
     * Create an instance of {@link CaseIdentifier }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "caseIdentifier")
    public CaseIdentifier createCaseIdentifier(TCaseIdentifier value) {
        return new CaseIdentifier(value);
    }

    /**
     * Create an instance of {@link ForceCloseCaseOutputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "forceCloseCaseOutputMessage")
    public ForceCloseCaseOutputMessage createForceCloseCaseOutputMessage(TForceCloseCaseOutputMessage value) {
        return new ForceCloseCaseOutputMessage(value);
    }

    /**
     * Create an instance of {@link ReopenCaseInputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "reopenCaseInputMessage")
    public ReopenCaseInputMessage createReopenCaseInputMessage(TSuspendResumeAbortCaseInputMessage value) {
        return new ReopenCaseInputMessage(value);
    }

    /**
     * Create an instance of {@link AttainMilestoneInputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "attainMilestoneInputMessage")
    public AttainMilestoneInputMessage createAttainMilestoneInputMessage(TMilestoneInputMessage value) {
        return new AttainMilestoneInputMessage(value);
    }

    /**
     * Create an instance of {@link SuspendCaseInputMessage }}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/CaseService/types", name = "suspendCaseInputMessage")
    public SuspendCaseInputMessage createSuspendCaseInputMessage(TSuspendResumeAbortCaseInputMessage value) {
        return new SuspendCaseInputMessage(value);
    }

}
