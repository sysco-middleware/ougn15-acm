
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ResumeCaseOutputMessage extends JAXBElement<TSuspendResumeAbortCaseOutputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "resumeCaseOutputMessage");

    public ResumeCaseOutputMessage(TSuspendResumeAbortCaseOutputMessage value) {
        super(NAME, ((Class) TSuspendResumeAbortCaseOutputMessage.class), null, value);
    }

    public ResumeCaseOutputMessage() {
        super(NAME, ((Class) TSuspendResumeAbortCaseOutputMessage.class), null, null);
    }

}
