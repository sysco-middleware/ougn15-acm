
package com.oracle.xmlns.caseservice.types;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tStartCaseOutputMessage complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tStartCaseOutputMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/CaseService/types}caseIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStartCaseOutputMessage", propOrder = { "caseIdentifier" })
public class TStartCaseOutputMessage implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElementRef(name = "caseIdentifier", namespace = "http://xmlns.oracle.com/CaseService/types",
                   type = CaseIdentifier.class)
    protected CaseIdentifier caseIdentifier;

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

}
