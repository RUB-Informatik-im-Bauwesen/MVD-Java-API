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
 * <p>Java-Klasse für ConceptRoot complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConceptRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.1}Definitions" minOccurs="0"/>
 *         &lt;element name="Applicability" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.1}Definitions" minOccurs="0"/>
 *                   &lt;element name="Template" type="{http://buildingsmart-tech.org/mvd/XML/1.1}GenericReference"/>
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}TemplateRules"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Concepts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}Concept" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://buildingsmart-tech.org/mvd/XML/1.1}identity"/>
 *       &lt;attribute name="applicableRootEntity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptRoot", propOrder = {
    "definitions",
    "applicability",
    "concepts"
})
public class ConceptRoot {

    @XmlElement(name = "Definitions")
    protected Definitions definitions;
    @XmlElement(name = "Applicability")
    protected ConceptRoot.Applicability applicability;
    @XmlElement(name = "Concepts")
    protected ConceptRoot.Concepts concepts;
    @XmlAttribute(name = "applicableRootEntity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String applicableRootEntity;
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
     *     {@link ConceptRoot.Applicability }
     *     
     */
    public ConceptRoot.Applicability getApplicability() {
        return applicability;
    }

    /**
     * Legt den Wert der applicability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptRoot.Applicability }
     *     
     */
    public void setApplicability(ConceptRoot.Applicability value) {
        this.applicability = value;
    }

    /**
     * Ruft den Wert der concepts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConceptRoot.Concepts }
     *     
     */
    public ConceptRoot.Concepts getConcepts() {
        return concepts;
    }

    /**
     * Legt den Wert der concepts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptRoot.Concepts }
     *     
     */
    public void setConcepts(ConceptRoot.Concepts value) {
        this.concepts = value;
    }

    /**
     * Ruft den Wert der applicableRootEntity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableRootEntity() {
        return applicableRootEntity;
    }

    /**
     * Legt den Wert der applicableRootEntity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableRootEntity(String value) {
        this.applicableRootEntity = value;
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
     *         &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.1}Definitions" minOccurs="0"/>
     *         &lt;element name="Template" type="{http://buildingsmart-tech.org/mvd/XML/1.1}GenericReference"/>
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}TemplateRules"/>
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
        "definitions",
        "template",
        "templateRules"
    })
    public static class Applicability {

        @XmlElement(name = "Definitions")
        protected Definitions definitions;
        @XmlElement(name = "Template", required = true)
        protected GenericReference template;
        @XmlElement(name = "TemplateRules", required = true)
        protected TemplateRules templateRules;

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
         * Ruft den Wert der template-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link GenericReference }
         *     
         */
        public GenericReference getTemplate() {
            return template;
        }

        /**
         * Legt den Wert der template-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link GenericReference }
         *     
         */
        public void setTemplate(GenericReference value) {
            this.template = value;
        }

        /**
         * Ruft den Wert der templateRules-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TemplateRules }
         *     
         */
        public TemplateRules getTemplateRules() {
            return templateRules;
        }

        /**
         * Legt den Wert der templateRules-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateRules }
         *     
         */
        public void setTemplateRules(TemplateRules value) {
            this.templateRules = value;
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
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}Concept" maxOccurs="unbounded"/>
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
        "concept"
    })
    public static class Concepts {

        @XmlElement(name = "Concept", required = true)
        protected List<Concept> concept;

        /**
         * Each Concept indicates use of a particular template for the applicable root entity.Gets the value of the concept property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the concept property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConcept().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Concept }
         * 
         * 
         */
        public List<Concept> getConcept() {
            if (concept == null) {
                concept = new ArrayList<Concept>();
            }
            return this.concept;
        }

    }

}
