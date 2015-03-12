
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StartCaseInputMessage extends JAXBElement<TStartCaseInputMessage> {

    protected final static QName NAME = new QName("http://xmlns.oracle.com/CaseService/types", "startCaseInputMessage");

    public StartCaseInputMessage(TStartCaseInputMessage value) {
        super(NAME, ((Class) TStartCaseInputMessage.class), null, value);
    }

    public StartCaseInputMessage() {
        super(NAME, ((Class) TStartCaseInputMessage.class), null, null);
    }

}
