
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tComments complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tComments">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://xmlns.oracle.com/bpm/case}tComment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tComments", propOrder = { "comment" })
public class TComments extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    protected List<TComment> comment;

    /**
     * Gets the value of the comment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TComment }
     *
     *
     */
    public List<TComment> getComment() {
        if (comment == null) {
            comment = new ArrayList<TComment>();
        }
        return this.comment;
    }

    public boolean isSetComment() {
        return ((this.comment != null) && (!this.comment.isEmpty()));
    }

    public void unsetComment() {
        this.comment = null;
    }

}
