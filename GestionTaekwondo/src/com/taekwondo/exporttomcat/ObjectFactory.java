
package com.taekwondo.exporttomcat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.taekwondo.exporttomcat package. 
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

    private final static QName _HelloWorldResponse_QNAME = new QName("http://exportTomcat.taekwondo.com/", "helloWorldResponse");
    private final static QName _RetrounePersonnes_QNAME = new QName("http://exportTomcat.taekwondo.com/", "retrounePersonnes");
    private final static QName _CalculResponse_QNAME = new QName("http://exportTomcat.taekwondo.com/", "calculResponse");
    private final static QName _AjoutePersonne_QNAME = new QName("http://exportTomcat.taekwondo.com/", "ajoutePersonne");
    private final static QName _Calcul_QNAME = new QName("http://exportTomcat.taekwondo.com/", "calcul");
    private final static QName _AjoutePersonneResponse_QNAME = new QName("http://exportTomcat.taekwondo.com/", "ajoutePersonneResponse");
    private final static QName _HelloWorld_QNAME = new QName("http://exportTomcat.taekwondo.com/", "helloWorld");
    private final static QName _RetrounePersonnesResponse_QNAME = new QName("http://exportTomcat.taekwondo.com/", "retrounePersonnesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.taekwondo.exporttomcat
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link RetrounePersonnes }
     * 
     */
    public RetrounePersonnes createRetrounePersonnes() {
        return new RetrounePersonnes();
    }

    /**
     * Create an instance of {@link CalculResponse }
     * 
     */
    public CalculResponse createCalculResponse() {
        return new CalculResponse();
    }

    /**
     * Create an instance of {@link AjoutePersonne }
     * 
     */
    public AjoutePersonne createAjoutePersonne() {
        return new AjoutePersonne();
    }

    /**
     * Create an instance of {@link Calcul }
     * 
     */
    public Calcul createCalcul() {
        return new Calcul();
    }

    /**
     * Create an instance of {@link AjoutePersonneResponse }
     * 
     */
    public AjoutePersonneResponse createAjoutePersonneResponse() {
        return new AjoutePersonneResponse();
    }

    /**
     * Create an instance of {@link HelloWorld_Type }
     * 
     */
    public HelloWorld_Type createHelloWorld_Type() {
        return new HelloWorld_Type();
    }

    /**
     * Create an instance of {@link RetrounePersonnesResponse }
     * 
     */
    public RetrounePersonnesResponse createRetrounePersonnesResponse() {
        return new RetrounePersonnesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exportTomcat.taekwondo.com/", name = "helloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrounePersonnes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exportTomcat.taekwondo.com/", name = "retrounePersonnes")
    public JAXBElement<RetrounePersonnes> createRetrounePersonnes(RetrounePersonnes value) {
        return new JAXBElement<RetrounePersonnes>(_RetrounePersonnes_QNAME, RetrounePersonnes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exportTomcat.taekwondo.com/", name = "calculResponse")
    public JAXBElement<CalculResponse> createCalculResponse(CalculResponse value) {
        return new JAXBElement<CalculResponse>(_CalculResponse_QNAME, CalculResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutePersonne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exportTomcat.taekwondo.com/", name = "ajoutePersonne")
    public JAXBElement<AjoutePersonne> createAjoutePersonne(AjoutePersonne value) {
        return new JAXBElement<AjoutePersonne>(_AjoutePersonne_QNAME, AjoutePersonne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exportTomcat.taekwondo.com/", name = "calcul")
    public JAXBElement<Calcul> createCalcul(Calcul value) {
        return new JAXBElement<Calcul>(_Calcul_QNAME, Calcul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutePersonneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exportTomcat.taekwondo.com/", name = "ajoutePersonneResponse")
    public JAXBElement<AjoutePersonneResponse> createAjoutePersonneResponse(AjoutePersonneResponse value) {
        return new JAXBElement<AjoutePersonneResponse>(_AjoutePersonneResponse_QNAME, AjoutePersonneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exportTomcat.taekwondo.com/", name = "helloWorld")
    public JAXBElement<HelloWorld_Type> createHelloWorld(HelloWorld_Type value) {
        return new JAXBElement<HelloWorld_Type>(_HelloWorld_QNAME, HelloWorld_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrounePersonnesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exportTomcat.taekwondo.com/", name = "retrounePersonnesResponse")
    public JAXBElement<RetrounePersonnesResponse> createRetrounePersonnesResponse(RetrounePersonnesResponse value) {
        return new JAXBElement<RetrounePersonnesResponse>(_RetrounePersonnesResponse_QNAME, RetrounePersonnesResponse.class, null, value);
    }

}
