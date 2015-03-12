
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Milestone extends JAXBElement<TMilestone> {

    protected final static QName NAME = new QName("http://xmlns.oracle.com/bpm/case", "milestone");

    public Milestone(TMilestone value) {
        super(NAME, ((Class) TMilestone.class), null, value);
    }

    public Milestone() {
        super(NAME, ((Class) TMilestone.class), null, null);
    }

}
