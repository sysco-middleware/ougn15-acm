
package com.oracle.xmlns.caseservice.types;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCredential complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tCredential">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identityContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onBehalfOfUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCredential", propOrder = { "login", "password", "identityContext", "onBehalfOfUser" })
public class TCredential implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String password;
    protected String identityContext;
    protected String onBehalfOfUser;

    /**
     * Gets the value of the login property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLogin(String value) {
        this.login = value;
    }

    public boolean isSetLogin() {
        return (this.login != null);
    }

    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

    public boolean isSetPassword() {
        return (this.password != null);
    }

    /**
     * Gets the value of the identityContext property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentityContext() {
        return identityContext;
    }

    /**
     * Sets the value of the identityContext property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentityContext(String value) {
        this.identityContext = value;
    }

    public boolean isSetIdentityContext() {
        return (this.identityContext != null);
    }

    /**
     * Gets the value of the onBehalfOfUser property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnBehalfOfUser() {
        return onBehalfOfUser;
    }

    /**
     * Sets the value of the onBehalfOfUser property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnBehalfOfUser(String value) {
        this.onBehalfOfUser = value;
    }

    public boolean isSetOnBehalfOfUser() {
        return (this.onBehalfOfUser != null);
    }

}
