
package com.oracle.xmlns.caseservice.types;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tBpmContext complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tBpmContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credential" type="{http://xmlns.oracle.com/CaseService/types}tCredential" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBpmContext", propOrder = { "credential", "token", "locale", "timeZone" })
public class TBpmContext implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected TCredential credential;
    protected String token;
    protected String locale;
    protected String timeZone;

    /**
     * Gets the value of the credential property.
     *
     * @return
     *     possible object is
     *     {@link TCredential }
     *
     */
    public TCredential getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     *
     * @param value
     *     allowed object is
     *     {@link TCredential }
     *
     */
    public void setCredential(TCredential value) {
        this.credential = value;
    }

    public boolean isSetCredential() {
        return (this.credential != null);
    }

    /**
     * Gets the value of the token property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToken(String value) {
        this.token = value;
    }

    public boolean isSetToken() {
        return (this.token != null);
    }

    /**
     * Gets the value of the locale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    public boolean isSetLocale() {
        return (this.locale != null);
    }

    /**
     * Gets the value of the timeZone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    public boolean isSetTimeZone() {
        return (this.timeZone != null);
    }

}
