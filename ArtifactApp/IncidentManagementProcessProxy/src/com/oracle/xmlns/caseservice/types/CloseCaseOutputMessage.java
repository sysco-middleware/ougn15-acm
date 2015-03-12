
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CloseCaseOutputMessage extends JAXBElement<TCloseCaseOutputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "closeCaseOutputMessage");

    public CloseCaseOutputMessage(TCloseCaseOutputMessage value) {
        super(NAME, ((Class) TCloseCaseOutputMessage.class), null, value);
    }

    public CloseCaseOutputMessage() {
        super(NAME, ((Class) TCloseCaseOutputMessage.class), null, null);
    }

}
