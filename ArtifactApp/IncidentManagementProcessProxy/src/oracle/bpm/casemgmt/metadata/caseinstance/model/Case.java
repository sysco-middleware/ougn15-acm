
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Case extends JAXBElement<TCase> {

    protected final static QName NAME = new QName("http://xmlns.oracle.com/bpm/case", "case");

    public Case(TCase value) {
        super(NAME, ((Class) TCase.class), null, value);
    }

    public Case() {
        super(NAME, ((Class) TCase.class), null, null);
    }

}
