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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für EntityRule complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntityRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="References" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Template" type="{http://buildingsmart-tech.org/mvd/XML/1.1}GenericReference"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="IdPrefix" type="{http://buildingsmart-tech.org/mvd/XML/1.1}ruleId" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AttributeRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}AttributeRule"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Constraints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="Constraint">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="EntityName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RuleID" type="{http://buildingsmart-tech.org/mvd/XML/1.1}ruleId" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityRule", propOrder = {
    "references",
    "attributeRules",
    "constraints"
})
public class EntityRule {

    @XmlElement(name = "References")
    protected EntityRule.References references;
    @XmlElement(name = "AttributeRules")
    protected EntityRule.AttributeRules attributeRules;
    @XmlElement(name = "Constraints")
    protected EntityRule.Constraints constraints;
    @XmlAttribute(name = "EntityName", required = true)
    protected String entityName;
    @XmlAttribute(name = "RuleID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ruleID;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Ruft den Wert der references-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntityRule.References }
     *     
     */
    public EntityRule.References getReferences() {
        return references;
    }

    /**
     * Legt den Wert der references-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRule.References }
     *     
     */
    public void setReferences(EntityRule.References value) {
        this.references = value;
    }

    /**
     * Ruft den Wert der attributeRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntityRule.AttributeRules }
     *     
     */
    public EntityRule.AttributeRules getAttributeRules() {
        return attributeRules;
    }

    /**
     * Legt den Wert der attributeRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRule.AttributeRules }
     *     
     */
    public void setAttributeRules(EntityRule.AttributeRules value) {
        this.attributeRules = value;
    }

    /**
     * Ruft den Wert der constraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntityRule.Constraints }
     *     
     */
    public EntityRule.Constraints getConstraints() {
        return constraints;
    }

    /**
     * Legt den Wert der constraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRule.Constraints }
     *     
     */
    public void setConstraints(EntityRule.Constraints value) {
        this.constraints = value;
    }

    /**
     * Ruft den Wert der entityName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Legt den Wert der entityName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Ruft den Wert der ruleID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * Legt den Wert der ruleID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleID(String value) {
        this.ruleID = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}AttributeRule"/>
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
    public static class AttributeRules {

        @XmlElement(name = "AttributeRule", required = true, nillable = true)
        protected List<AttributeRule> attributeRule;

        /**
         * Gets the value of the attributeRule property.
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Constraint">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "constraint"
    })
    public static class Constraints {

        @XmlElement(name = "Constraint", required = true)
        protected List<EntityRule.Constraints.Constraint> constraint;

        /**
         * Gets the value of the constraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConstraint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityRule.Constraints.Constraint }
         * 
         * 
         */
        public List<EntityRule.Constraints.Constraint> getConstraint() {
            if (constraint == null) {
                constraint = new ArrayList<EntityRule.Constraints.Constraint>();
            }
            return this.constraint;
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
         *       &lt;attribute name="Expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Constraint {

            @XmlAttribute(name = "Expression", required = true)
            protected String expression;

            /**
             * Ruft den Wert der expression-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpression() {
                return expression;
            }

            /**
             * Legt den Wert der expression-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpression(String value) {
                this.expression = value;
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
     *         &lt;element name="Template" type="{http://buildingsmart-tech.org/mvd/XML/1.1}GenericReference"/>
     *       &lt;/sequence>
     *       &lt;attribute name="IdPrefix" type="{http://buildingsmart-tech.org/mvd/XML/1.1}ruleId" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "template"
    })
    public static class References {

        @XmlElement(name = "Template", required = true)
        protected GenericReference template;
        @XmlAttribute(name = "IdPrefix")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String idPrefix;

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
         * Ruft den Wert der idPrefix-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdPrefix() {
            return idPrefix;
        }

        /**
         * Legt den Wert der idPrefix-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdPrefix(String value) {
            this.idPrefix = value;
        }

    }

}
