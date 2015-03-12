
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SuspendCaseOutputMessage extends JAXBElement<TSuspendResumeAbortCaseOutputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "suspendCaseOutputMessage");

    public SuspendCaseOutputMessage(TSuspendResumeAbortCaseOutputMessage value) {
        super(NAME, ((Class) TSuspendResumeAbortCaseOutputMessage.class), null, value);
    }

    public SuspendCaseOutputMessage() {
        super(NAME, ((Class) TSuspendResumeAbortCaseOutputMessage.class), null, null);
    }

}
