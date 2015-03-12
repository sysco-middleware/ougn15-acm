
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReopenCaseOutputMessage extends JAXBElement<TSuspendResumeAbortCaseOutputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "reopenCaseOutputMessage");

    public ReopenCaseOutputMessage(TSuspendResumeAbortCaseOutputMessage value) {
        super(NAME, ((Class) TSuspendResumeAbortCaseOutputMessage.class), null, value);
    }

    public ReopenCaseOutputMessage() {
        super(NAME, ((Class) TSuspendResumeAbortCaseOutputMessage.class), null, null);
    }

}
