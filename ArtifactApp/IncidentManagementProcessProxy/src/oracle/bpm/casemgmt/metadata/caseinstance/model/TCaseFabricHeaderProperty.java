
package oracle.bpm.casemgmt.metadata.caseinstance.model;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import oracle.bpm.casemgmt.metadata.extension.model.TExtensibleElements;


/**
 * <p>Java class for tCaseFabricHeaderProperty complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tCaseFabricHeaderProperty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpm/case/metadata/extension}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="compositeCreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCaseFabricHeaderProperty", propOrder = { "compositeCreatedTime" })
public class TCaseFabricHeaderProperty extends TExtensibleElements implements Serializable {

    private final static long serialVersionUID = 123456L;
    @XmlElementRef(name = "compositeCreatedTime", namespace = "http://xmlns.oracle.com/bpm/case",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> compositeCreatedTime;

    /**
     * Gets the value of the compositeCreatedTime property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getCompositeCreatedTime() {
        return compositeCreatedTime;
    }

    /**
     * Sets the value of the compositeCreatedTime property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setCompositeCreatedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.compositeCreatedTime = value;
    }

    public boolean isSetCompositeCreatedTime() {
        return (this.compositeCreatedTime != null);
    }

}
