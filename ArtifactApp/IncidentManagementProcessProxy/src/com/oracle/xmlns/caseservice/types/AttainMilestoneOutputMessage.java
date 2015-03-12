
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AttainMilestoneOutputMessage extends JAXBElement<TMilestoneOutputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "attainMilestoneOutputMessage");

    public AttainMilestoneOutputMessage(TMilestoneOutputMessage value) {
        super(NAME, ((Class) TMilestoneOutputMessage.class), null, value);
    }

    public AttainMilestoneOutputMessage() {
        super(NAME, ((Class) TMilestoneOutputMessage.class), null, null);
    }

}
