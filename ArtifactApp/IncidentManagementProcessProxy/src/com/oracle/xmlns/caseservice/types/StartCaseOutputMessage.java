
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StartCaseOutputMessage extends JAXBElement<TStartCaseOutputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "startCaseOutputMessage");

    public StartCaseOutputMessage(TStartCaseOutputMessage value) {
        super(NAME, ((Class) TStartCaseOutputMessage.class), null, value);
    }

    public StartCaseOutputMessage() {
        super(NAME, ((Class) TStartCaseOutputMessage.class), null, null);
    }

}
