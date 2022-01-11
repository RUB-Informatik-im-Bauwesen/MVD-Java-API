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
 * <p>Java-Klasse für ConceptTemplate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConceptTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Definitions" type="{http://buildingsmart-tech.org/mvd/XML/1.1}Definitions" minOccurs="0"/>
 *         &lt;element name="Rules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}AttributeRule" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubTemplates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}ConceptTemplate" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://buildingsmart-tech.org/mvd/XML/1.1}identity"/>
 *       &lt;attribute name="applicableSchema" use="required">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://buildingsmart-tech.org/mvd/XML/1.1}schemaName" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="applicableEntity">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isPartial" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptTemplate", propOrder = {
    "definitions",
    "rules",
    "subTemplates"
})
public class ConceptTemplate {

    @XmlElement(name = "Definitions")
    protected Definitions definitions;
    @XmlElement(name = "Rules")
    protected ConceptTemplate.Rules rules;
    @XmlElement(name = "SubTemplates")
    protected ConceptTemplate.SubTemplates subTemplates;
    @XmlAttribute(name = "applicableSchema", required = true)
    protected List<String> applicableSchema;
    @XmlAttribute(name = "applicableEntity")
    protected List<String> applicableEntity;
    @XmlAttribute(name = "isPartial")
    protected Boolean isPartial;
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
     * Ruft den Wert der rules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConceptTemplate.Rules }
     *     
     */
    public ConceptTemplate.Rules getRules() {
        return rules;
    }

    /**
     * Legt den Wert der rules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptTemplate.Rules }
     *     
     */
    public void setRules(ConceptTemplate.Rules value) {
        this.rules = value;
    }

    /**
     * Ruft den Wert der subTemplates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConceptTemplate.SubTemplates }
     *     
     */
    public ConceptTemplate.SubTemplates getSubTemplates() {
        return subTemplates;
    }

    /**
     * Legt den Wert der subTemplates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptTemplate.SubTemplates }
     *     
     */
    public void setSubTemplates(ConceptTemplate.SubTemplates value) {
        this.subTemplates = value;
    }

    /**
     * Gets the value of the applicableSchema property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableSchema property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableSchema().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableSchema() {
        if (applicableSchema == null) {
            applicableSchema = new ArrayList<String>();
        }
        return this.applicableSchema;
    }

    /**
     * Gets the value of the applicableEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableEntity() {
        if (applicableEntity == null) {
            applicableEntity = new ArrayList<String>();
        }
        return this.applicableEntity;
    }

    /**
     * Ruft den Wert der isPartial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsPartial() {
        if (isPartial == null) {
            return false;
        } else {
            return isPartial;
        }
    }

    /**
     * Legt den Wert der isPartial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartial(Boolean value) {
        this.isPartial = value;
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
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}AttributeRule" maxOccurs="unbounded"/>
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
        "attributeRule"
    })
    public static class Rules {

        @XmlElement(name = "AttributeRule", required = true, nillable = true)
        protected List<AttributeRule> attributeRule;

        /**
         * An atribute rule, defined for an attribute of the applicable entity. It declares the root element of the rule tree. It is allowed to define rules for attributes that are defined at subtypes of the applicable entity.Gets the value of the attributeRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeRule }
         * 
         * 
         */
        public List<AttributeRule> getAttributeRule() {
            if (attributeRule == null) {
                attributeRule = new ArrayList<AttributeRule>();
            }
            return this.attributeRule;
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
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}ConceptTemplate" maxOccurs="unbounded"/>
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
        "conceptTemplate"
    })
    public static class SubTemplates {

        @XmlElement(name = "ConceptTemplate", required = true)
        protected List<ConceptTemplate> conceptTemplate;

        /**
         * Gets the value of the conceptTemplate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conceptTemplate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConceptTemplate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConceptTemplate }
         * 
         * 
         */
        public List<ConceptTemplate> getConceptTemplate() {
            if (conceptTemplate == null) {
                conceptTemplate = new ArrayList<ConceptTemplate>();
            }
            return this.conceptTemplate;
        }

    }

}
