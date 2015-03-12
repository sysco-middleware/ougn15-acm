
package com.oracle.xmlns.caseservice.types;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCloseCaseOutputMessage complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tCloseCaseOutputMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCloseCaseOutputMessage", propOrder = { "result" })
public class TCloseCaseOutputMessage implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected boolean result;

    /**
     * Gets the value of the result property.
     *
     */
    public boolean isResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     */
    public void setResult(boolean value) {
        this.result = value;
    }

    public boolean isSetResult() {
        return true;
    }

}
