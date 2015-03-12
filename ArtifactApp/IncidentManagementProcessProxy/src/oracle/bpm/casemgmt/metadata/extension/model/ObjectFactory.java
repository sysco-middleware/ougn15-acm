
package oracle.bpm.casemgmt.metadata.extension.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the oracle.bpm.casemgmt.metadata.extension.model package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TExtensibleMixedContentElementsDocumentation_QNAME =
        new QName("http://xmlns.oracle.com/bpm/case/metadata/extension", "documentation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.bpm.casemgmt.metadata.extension.model
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TExtensibleElements }
     *
     */
    public TExtensibleElements createTExtensibleElements() {
        return new TExtensibleElements();
    }

    /**
     * Create an instance of {@link TDocumentation }
     *
     */
    public TDocumentation createTDocumentation() {
        return new TDocumentation();
    }

    /**
     * Create an instance of {@link TExtensibleMixedContentElements }
     *
     */
    public TExtensibleMixedContentElements createTExtensibleMixedContentElements() {
        return new TExtensibleMixedContentElements();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDocumentation }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/case/metadata/extension", name = "documentation",
                    scope = TExtensibleMixedContentElements.class)
    public JAXBElement<TDocumentation> createTExtensibleMixedContentElementsDocumentation(TDocumentation value) {
        return new JAXBElement<TDocumentation>(_TExtensibleMixedContentElementsDocumentation_QNAME,
                                               TDocumentation.class, TExtensibleMixedContentElements.class, value);
    }

}
