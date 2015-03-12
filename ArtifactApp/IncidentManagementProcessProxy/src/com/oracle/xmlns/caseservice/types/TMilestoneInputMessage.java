
package com.oracle.xmlns.caseservice.types;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.caseinstance.model.Milestone;


/**
 * <p>Java class for tMilestoneInputMessage complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tMilestoneInputMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpm/case}milestone"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMilestoneInputMessage", propOrder = { "milestone" })
public class TMilestoneInputMessage implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElementRef(name = "milestone", namespace = "http://xmlns.oracle.com/bpm/case", type = Milestone.class)
    protected Milestone milestone;

    /**
     * Gets the value of the milestone property.
     *
     * @return
     *     possible object is
     *     {@link Milestone }
     *
     */
    public Milestone getMilestone() {
        return milestone;
    }

    /**
     * Sets the value of the milestone property.
     *
     * @param value
     *     allowed object is
     *     {@link Milestone }
     *
     */
    public void setMilestone(Milestone value) {
        this.milestone = value;
    }

    public boolean isSetMilestone() {
        return (this.milestone != null);
    }

}
