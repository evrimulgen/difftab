//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.04 at 07:34:19 PM EET 
//


package mse.difftab.config;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mse.difftab.config package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mse.difftab.config
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Config }
     * 
     */
    public Config createConfig() {
        return new Config();
    }

    /**
     * Create an instance of {@link Config.SourceDb }
     * 
     */
    public Config.SourceDb createConfigSourceDb() {
        return new Config.SourceDb();
    }

    /**
     * Create an instance of {@link Config.SourceDb.Table }
     * 
     */
    public Config.SourceDb.Table createConfigSourceDbTable() {
        return new Config.SourceDb.Table();
    }

    /**
     * Create an instance of {@link Config.SourcePrepared }
     * 
     */
    public Config.SourcePrepared createConfigSourcePrepared() {
        return new Config.SourcePrepared();
    }

    /**
     * Create an instance of {@link Config.SourceDb.Table.Column }
     * 
     */
    public Config.SourceDb.Table.Column createConfigSourceDbTableColumn() {
        return new Config.SourceDb.Table.Column();
    }

}
