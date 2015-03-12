
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AbortCaseInputMessage extends JAXBElement<TSuspendResumeAbortCaseInputMessage> {

    protected final static QName NAME = new QName("http://xmlns.oracle.com/CaseService/types", "abortCaseInputMessage");

    public AbortCaseInputMessage(TSuspendResumeAbortCaseInputMessage value) {
        super(NAME, ((Class) TSuspendResumeAbortCaseInputMessage.class), null, value);
    }

    public AbortCaseInputMessage() {
        super(NAME, ((Class) TSuspendResumeAbortCaseInputMessage.class), null, null);
    }

}
