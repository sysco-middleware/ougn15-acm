
package com.oracle.xmlns.caseservice.types;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.caseinstance.model.Case;


/**
 * <p>Java class for tStartCaseInputMessage complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tStartCaseInputMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpm/case}case"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStartCaseInputMessage", propOrder = { "_case" })
public class TStartCaseInputMessage implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElementRef(name = "case", namespace = "http://xmlns.oracle.com/bpm/case", type = Case.class)
    protected Case _case;

    /**
     * Gets the value of the case property.
     *
     * @return
     *     possible object is
     *     {@link Case }
     *
     */
    public Case getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     *
     * @param value
     *     allowed object is
     *     {@link Case }
     *
     */
    public void setCase(Case value) {
        this._case = value;
    }

    public boolean isSetCase() {
        return (this._case != null);
    }

}
