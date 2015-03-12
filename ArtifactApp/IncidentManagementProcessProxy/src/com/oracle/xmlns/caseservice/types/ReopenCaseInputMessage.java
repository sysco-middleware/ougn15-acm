
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReopenCaseInputMessage extends JAXBElement<TSuspendResumeAbortCaseInputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "reopenCaseInputMessage");

    public ReopenCaseInputMessage(TSuspendResumeAbortCaseInputMessage value) {
        super(NAME, ((Class) TSuspendResumeAbortCaseInputMessage.class), null, value);
    }

    public ReopenCaseInputMessage() {
        super(NAME, ((Class) TSuspendResumeAbortCaseInputMessage.class), null, null);
    }

}
