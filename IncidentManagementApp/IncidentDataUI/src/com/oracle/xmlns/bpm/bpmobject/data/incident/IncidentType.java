
package com.oracle.xmlns.bpm.bpmobject.data.incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpm.datacontrol.caseservice.DataObject;


/**
 * <p>Java class for IncidentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incidentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attentionApprovelOutcome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentType", propOrder = {
    "incidentId",
    "attentionApprovelOutcome"
})
public class IncidentType
    extends DataObject
{

    @XmlElement(required = true, nillable = true)
    protected String incidentId;
    @XmlElement(required = true, nillable = true)
    protected String attentionApprovelOutcome;

    /**
     * Gets the value of the incidentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentId() {
        return incidentId;
    }

    /**
     * Sets the value of the incidentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentId(String value) {
        this.incidentId = value;
    }

    /**
     * Gets the value of the attentionApprovelOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttentionApprovelOutcome() {
        return attentionApprovelOutcome;
    }

    /**
     * Sets the value of the attentionApprovelOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttentionApprovelOutcome(String value) {
        this.attentionApprovelOutcome = value;
    }

}
