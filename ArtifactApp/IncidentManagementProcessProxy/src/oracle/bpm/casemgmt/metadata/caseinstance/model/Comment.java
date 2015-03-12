
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Comment extends JAXBElement<TComment> {

    protected final static QName NAME = new QName("http://xmlns.oracle.com/bpm/case", "comment");

    public Comment(TComment value) {
        super(NAME, ((Class) TComment.class), null, value);
    }

    public Comment() {
        super(NAME, ((Class) TComment.class), null, null);
    }

}
