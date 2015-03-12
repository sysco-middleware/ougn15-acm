
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AbortCaseOutputMessage extends JAXBElement<TSuspendResumeAbortCaseOutputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "abortCaseOutputMessage");

    public AbortCaseOutputMessage(TSuspendResumeAbortCaseOutputMessage value) {
        super(NAME, ((Class) TSuspendResumeAbortCaseOutputMessage.class), null, value);
    }

    public AbortCaseOutputMessage() {
        super(NAME, ((Class) TSuspendResumeAbortCaseOutputMessage.class), null, null);
    }

}
