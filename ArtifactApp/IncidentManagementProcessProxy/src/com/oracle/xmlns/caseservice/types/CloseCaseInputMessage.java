
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CloseCaseInputMessage extends JAXBElement<TCloseCaseInputMessage> {

    protected final static QName NAME = new QName("http://xmlns.oracle.com/CaseService/types", "closeCaseInputMessage");

    public CloseCaseInputMessage(TCloseCaseInputMessage value) {
        super(NAME, ((Class) TCloseCaseInputMessage.class), null, value);
    }

    public CloseCaseInputMessage() {
        super(NAME, ((Class) TCloseCaseInputMessage.class), null, null);
    }

}
