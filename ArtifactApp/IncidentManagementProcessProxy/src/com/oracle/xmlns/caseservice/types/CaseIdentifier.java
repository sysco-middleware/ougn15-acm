
package com.oracle.xmlns.caseservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CaseIdentifier extends JAXBElement<TCaseIdentifier> {

    protected final static QName NAME = new QName("http://xmlns.oracle.com/CaseService/types", "caseIdentifier");

    public CaseIdentifier(TCaseIdentifier value) {
        super(NAME, ((Class) TCaseIdentifier.class), null, value);
    }

    public CaseIdentifier() {
        super(NAME, ((Class) TCaseIdentifier.class), null, null);
    }

}
