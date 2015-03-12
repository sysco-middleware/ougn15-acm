
package com.oracle.xmlns.caseservice;

import javax.xml.ws.WebFault;

import com.oracle.xmlns.caseservice.types.TCaseServiceFaultMessage;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 *
 */
@WebFault(name = "caseServiceFaultMessage", targetNamespace = "http://xmlns.oracle.com/CaseService/types")
public class CaseServiceFaultMessage extends Exception {

    /**
     * Java type that goes as soapenv:Fault detail element.
     *
     */
    private TCaseServiceFaultMessage faultInfo;

    /**
     *
     * @param message
     * @param faultInfo
     */
    public CaseServiceFaultMessage(String message, TCaseServiceFaultMessage faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CaseServiceFaultMessage(String message, TCaseServiceFaultMessage faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: com.oracle.xmlns.caseservice.types.TCaseServiceFaultMessage
     */
    public TCaseServiceFaultMessage getFaultInfo() {
        return faultInfo;
    }

}
