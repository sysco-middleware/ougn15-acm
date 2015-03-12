
package com.oracle.xmlns.caseservice.types;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCaseIdentifier complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tCaseIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCaseIdentifier", propOrder = { "caseId", "caseNumber", "identificationKey" })
public class TCaseIdentifier implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected String caseId;
    protected String caseNumber;
    protected String identificationKey;

    /**
     * Gets the value of the caseId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseId(String value) {
        this.caseId = value;
    }

    public boolean isSetCaseId() {
        return (this.caseId != null);
    }

    /**
     * Gets the value of the caseNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    public boolean isSetCaseNumber() {
        return (this.caseNumber != null);
    }

    /**
     * Gets the value of the identificationKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentificationKey() {
        return identificationKey;
    }

    /**
     * Sets the value of the identificationKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentificationKey(String value) {
        this.identificationKey = value;
    }

    public boolean isSetIdentificationKey() {
        return (this.identificationKey != null);
    }

}
