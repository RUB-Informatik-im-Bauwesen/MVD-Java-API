//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.01.07 um 10:54:58 AM CET 
//


package org.buildingsmart_tech.mvd.xml._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für ModelView complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModelView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.1}Definitions" minOccurs="0"/>
 *         &lt;element name="BaseView" type="{http://buildingsmart-tech.org/mvd/XML/1.1}GenericReference" minOccurs="0"/>
 *         &lt;element name="ExchangeRequirements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExchangeRequirement" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.1}Definitions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://buildingsmart-tech.org/mvd/XML/1.1}identity"/>
 *                           &lt;attribute name="applicability" type="{http://buildingsmart-tech.org/mvd/XML/1.1}applicability" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Roots" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}ConceptRoot" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://buildingsmart-tech.org/mvd/XML/1.1}identity"/>
 *       &lt;attribute name="applicableSchema" use="required" type="{http://buildingsmart-tech.org/mvd/XML/1.1}schemaName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelView", propOrder = {
    "definitions",
    "baseView",
    "exchangeRequirements",
    "roots"
})
public class ModelView {

    @XmlElement(name = "Definitions")
    protected Definitions definitions;
    @XmlElement(name = "BaseView")
    protected GenericReference baseView;
    @XmlElement(name = "ExchangeRequirements")
    protected ModelView.ExchangeRequirements exchangeRequirements;
    @XmlElement(name = "Roots")
    protected ModelView.Roots roots;
    @XmlAttribute(name = "applicableSchema", required = true)
    protected String applicableSchema;
    @XmlAttribute(name = "uuid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String uuid;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlAttribute(name = "code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String code;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String version;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "author")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String author;
    @XmlAttribute(name = "owner")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String owner;
    @XmlAttribute(name = "copyright")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String copyright;

    /**
     * Ruft den Wert der definitions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Definitions }
     *     
     */
    public Definitions getDefinitions() {
        return definitions;
    }

    /**
     * Legt den Wert der definitions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Definitions }
     *     
     */
    public void setDefinitions(Definitions value) {
        this.definitions = value;
    }

    /**
     * Ruft den Wert der baseView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericReference }
     *     
     */
    public GenericReference getBaseView() {
        return baseView;
    }

    /**
     * Legt den Wert der baseView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericReference }
     *     
     */
    public void setBaseView(GenericReference value) {
        this.baseView = value;
    }

    /**
     * Ruft den Wert der exchangeRequirements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModelView.ExchangeRequirements }
     *     
     */
    public ModelView.ExchangeRequirements getExchangeRequirements() {
        return exchangeRequirements;
    }

    /**
     * Legt den Wert der exchangeRequirements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelView.ExchangeRequirements }
     *     
     */
    public void setExchangeRequirements(ModelView.ExchangeRequirements value) {
        this.exchangeRequirements = value;
    }

    /**
     * Ruft den Wert der roots-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModelView.Roots }
     *     
     */
    public ModelView.Roots getRoots() {
        return roots;
    }

    /**
     * Legt den Wert der roots-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelView.Roots }
     *     
     */
    public void setRoots(ModelView.Roots value) {
        this.roots = value;
    }

    /**
     * Ruft den Wert der applicableSchema-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableSchema() {
        return applicableSchema;
    }

    /**
     * Legt den Wert der applicableSchema-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableSchema(String value) {
        this.applicableSchema = value;
    }

    /**
     * Ruft den Wert der uuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Legt den Wert der uuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der author-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Legt den Wert der author-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Ruft den Wert der owner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Legt den Wert der owner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Ruft den Wert der copyright-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Legt den Wert der copyright-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ExchangeRequirement" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.1}Definitions" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://buildingsmart-tech.org/mvd/XML/1.1}identity"/>
     *                 &lt;attribute name="applicability" type="{http://buildingsmart-tech.org/mvd/XML/1.1}applicability" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exchangeRequirement"
    })
    public static class ExchangeRequirements {

        @XmlElement(name = "ExchangeRequirement", required = true)
        protected List<ModelView.ExchangeRequirements.ExchangeRequirement> exchangeRequirement;

        /**
         * Gets the value of the exchangeRequirement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exchangeRequirement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExchangeRequirement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModelView.ExchangeRequirements.ExchangeRequirement }
         * 
         * 
         */
        public List<ModelView.ExchangeRequirements.ExchangeRequirement> getExchangeRequirement() {
            if (exchangeRequirement == null) {
                exchangeRequirement = new ArrayList<ModelView.ExchangeRequirements.ExchangeRequirement>();
            }
            return this.exchangeRequirement;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.1}Definitions" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://buildingsmart-tech.org/mvd/XML/1.1}identity"/>
         *       &lt;attribute name="applicability" type="{http://buildingsmart-tech.org/mvd/XML/1.1}applicability" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "definitions"
        })
        public static class ExchangeRequirement {

            @XmlElement(name = "Definitions")
            protected Definitions definitions;
            @XmlAttribute(name = "applicability")
            protected Applicability applicability;
            @XmlAttribute(name = "uuid", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            protected String uuid;
            @XmlAttribute(name = "name", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String name;
            @XmlAttribute(name = "code")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String code;
            @XmlAttribute(name = "version")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String version;
            @XmlAttribute(name = "status")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            protected String status;
            @XmlAttribute(name = "author")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String author;
            @XmlAttribute(name = "owner")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String owner;
            @XmlAttribute(name = "copyright")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String copyright;

            /**
             * Ruft den Wert der definitions-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Definitions }
             *     
             */
            public Definitions getDefinitions() {
                return definitions;
            }

            /**
             * Legt den Wert der definitions-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Definitions }
             *     
             */
            public void setDefinitions(Definitions value) {
                this.definitions = value;
            }

            /**
             * Ruft den Wert der applicability-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Applicability }
             *     
             */
            public Applicability getApplicability() {
                return applicability;
            }

            /**
             * Legt den Wert der applicability-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Applicability }
             *     
             */
            public void setApplicability(Applicability value) {
                this.applicability = value;
            }

            /**
             * Ruft den Wert der uuid-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUuid() {
                return uuid;
            }

            /**
             * Legt den Wert der uuid-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUuid(String value) {
                this.uuid = value;
            }

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Ruft den Wert der code-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Legt den Wert der code-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Ruft den Wert der version-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVersion() {
                return version;
            }

            /**
             * Legt den Wert der version-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVersion(String value) {
                this.version = value;
            }

            /**
             * Ruft den Wert der status-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Legt den Wert der status-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Ruft den Wert der author-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthor() {
                return author;
            }

            /**
             * Legt den Wert der author-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthor(String value) {
                this.author = value;
            }

            /**
             * Ruft den Wert der owner-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Legt den Wert der owner-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Ruft den Wert der copyright-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCopyright() {
                return copyright;
            }

            /**
             * Legt den Wert der copyright-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCopyright(String value) {
                this.copyright = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}ConceptRoot" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conceptRoot"
    })
    public static class Roots {

        @XmlElement(name = "ConceptRoot", required = true)
        protected List<ConceptRoot> conceptRoot;

        /**
         * The ConceptRoot element represents the root element (other terms are "leaf node class", "variable concept") that represent the fundamental parts of an MVD that is represented by a collection of supported concepts. It has an applicable leaf-node IFC entity. Gets the value of the conceptRoot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conceptRoot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConceptRoot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConceptRoot }
         * 
         * 
         */
        public List<ConceptRoot> getConceptRoot() {
            if (conceptRoot == null) {
                conceptRoot = new ArrayList<ConceptRoot>();
            }
            return this.conceptRoot;
        }

    }

}
