
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RevokeMilestoneInputMessage extends JAXBElement<TMilestoneInputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "revokeMilestoneInputMessage");

    public RevokeMilestoneInputMessage(TMilestoneInputMessage value) {
        super(NAME, ((Class) TMilestoneInputMessage.class), null, value);
    }

    public RevokeMilestoneInputMessage() {
        super(NAME, ((Class) TMilestoneInputMessage.class), null, null);
    }

}
