
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BpmContext extends JAXBElement<TBpmContext> {

    protected final static QName NAME = new QName("http://xmlns.oracle.com/CaseService/types", "bpmContext");

    public BpmContext(TBpmContext value) {
        super(NAME, ((Class) TBpmContext.class), null, value);
    }

    public BpmContext() {
        super(NAME, ((Class) TBpmContext.class), null, null);
    }

}
