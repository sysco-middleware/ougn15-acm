
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CaseServiceFaultMessage extends JAXBElement<TCaseServiceFaultMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "caseServiceFaultMessage");

    public CaseServiceFaultMessage(TCaseServiceFaultMessage value) {
        super(NAME, ((Class) TCaseServiceFaultMessage.class), null, value);
    }

    public CaseServiceFaultMessage() {
        super(NAME, ((Class) TCaseServiceFaultMessage.class), null, null);
    }

}
