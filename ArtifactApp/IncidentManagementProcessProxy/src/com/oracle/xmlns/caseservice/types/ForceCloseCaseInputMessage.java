
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForceCloseCaseInputMessage extends JAXBElement<TForceCloseCaseInputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "forceCloseCaseInputMessage");

    public ForceCloseCaseInputMessage(TForceCloseCaseInputMessage value) {
        super(NAME, ((Class) TForceCloseCaseInputMessage.class), null, value);
    }

    public ForceCloseCaseInputMessage() {
        super(NAME, ((Class) TForceCloseCaseInputMessage.class), null, null);
    }

}
