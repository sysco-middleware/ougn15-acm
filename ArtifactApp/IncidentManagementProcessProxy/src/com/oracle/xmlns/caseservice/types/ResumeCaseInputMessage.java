
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ResumeCaseInputMessage extends JAXBElement<TSuspendResumeAbortCaseInputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "resumeCaseInputMessage");

    public ResumeCaseInputMessage(TSuspendResumeAbortCaseInputMessage value) {
        super(NAME, ((Class) TSuspendResumeAbortCaseInputMessage.class), null, value);
    }

    public ResumeCaseInputMessage() {
        super(NAME, ((Class) TSuspendResumeAbortCaseInputMessage.class), null, null);
    }

}
