
package com.oracle.xmlns.caseservice.types;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.caseinstance.model.Comment;


/**
 * <p>Java class for tSuspendResumeAbortCaseInputMessage complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tSuspendResumeAbortCaseInputMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/CaseService/types}caseIdentifier"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpm/case}comment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSuspendResumeAbortCaseInputMessage", propOrder = { "caseIdentifier", "comment" })
public class TSuspendResumeAbortCaseInputMessage implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElementRef(name = "caseIdentifier", namespace = "http://xmlns.oracle.com/CaseService/types",
                   type = CaseIdentifier.class)
    protected CaseIdentifier caseIdentifier;
    @XmlElementRef(name = "comment", namespace = "http://xmlns.oracle.com/bpm/case", type = Comment.class)
    protected Comment comment;

    /**
     * Gets the value of the caseIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link CaseIdentifier }
     *
     */
    public CaseIdentifier getCaseIdentifier() {
        return caseIdentifier;
    }

    /**
     * Sets the value of the caseIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link CaseIdentifier }
     *
     */
    public void setCaseIdentifier(CaseIdentifier value) {
        this.caseIdentifier = value;
    }

    public boolean isSetCaseIdentifier() {
        return (this.caseIdentifier != null);
    }

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link Comment }
     *
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link Comment }
     *
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    public boolean isSetComment() {
        return (this.comment != null);
    }

}
