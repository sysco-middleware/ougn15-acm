
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AttainMilestoneInputMessage extends JAXBElement<TMilestoneInputMessage> {

    protected final static QName NAME =
        new QName("http://xmlns.oracle.com/CaseService/types", "attainMilestoneInputMessage");

    public AttainMilestoneInputMessage(TMilestoneInputMessage value) {
        super(NAME, ((Class) TMilestoneInputMessage.class), null, value);
    }

    public AttainMilestoneInputMessage() {
        super(NAME, ((Class) TMilestoneInputMessage.class), null, null);
    }

}
