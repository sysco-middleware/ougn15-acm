
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForceCloseCaseOutputMessage extends JAXBElement<TForceCloseCaseOutputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "forceCloseCaseOutputMessage");

    public ForceCloseCaseOutputMessage(TForceCloseCaseOutputMessage value) {
        super(NAME, ((Class) TForceCloseCaseOutputMessage.class), null, value);
    }

    public ForceCloseCaseOutputMessage() {
        super(NAME, ((Class) TForceCloseCaseOutputMessage.class), null, null);
    }

}
