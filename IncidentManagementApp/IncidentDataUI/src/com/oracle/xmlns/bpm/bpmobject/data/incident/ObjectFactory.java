
package com.oracle.xmlns.bpm.bpmobject.data.incident;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.bpm.bpmobject.data.incident package. 
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

    private final static QName _Incident_QNAME = new QName("http://xmlns.oracle.com/bpm/bpmobject/Data/Incident", "Incident");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.bpm.bpmobject.data.incident
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncidentType }
     * 
     */
    public IncidentType createIncidentType() {
        return new IncidentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpm/bpmobject/Data/Incident", name = "Incident")
    public JAXBElement<IncidentType> createIncident(IncidentType value) {
        return new JAXBElement<IncidentType>(_Incident_QNAME, IncidentType.class, null, value);
    }

}
