
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RevokeMilestoneOutputMessage extends JAXBElement<TMilestoneOutputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "revokeMilestoneOutputMessage");

    public RevokeMilestoneOutputMessage(TMilestoneOutputMessage value) {
        super(NAME, ((Class) TMilestoneOutputMessage.class), null, value);
    }

    public RevokeMilestoneOutputMessage() {
        super(NAME, ((Class) TMilestoneOutputMessage.class), null, null);
    }

}
