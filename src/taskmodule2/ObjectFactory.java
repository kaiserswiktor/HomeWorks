//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.15 at 08:46:58 PM MSK 
//


package taskmodule2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Greenhouse }
     * 
     */
    public Greenhouse createGreenhouse() {
        return new Greenhouse();
    }

    /**
     * Create an instance of {@link Greenhouse.Plants }
     * 
     */
    public Greenhouse.Plants createGreenhousePlants() {
        return new Greenhouse.Plants();
    }

    /**
     * Create an instance of {@link Greenhouse.Plants.VisualParameters }
     * 
     */
    public Greenhouse.Plants.VisualParameters createGreenhousePlantsVisualParameters() {
        return new Greenhouse.Plants.VisualParameters();
    }

    /**
     * Create an instance of {@link Greenhouse.Plants.GrowTips }
     * 
     */
    public Greenhouse.Plants.GrowTips createGreenhousePlantsGrowTips() {
        return new Greenhouse.Plants.GrowTips();
    }

}
