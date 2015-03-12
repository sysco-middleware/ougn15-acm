
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SuspendCaseInputMessage extends JAXBElement<TSuspendResumeAbortCaseInputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "suspendCaseInputMessage");

    public SuspendCaseInputMessage(TSuspendResumeAbortCaseInputMessage value) {
        super(NAME, ((Class) TSuspendResumeAbortCaseInputMessage.class), null, value);
    }

    public SuspendCaseInputMessage() {
        super(NAME, ((Class) TSuspendResumeAbortCaseInputMessage.class), null, null);
    }

}
