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
 * <p>Java-Klasse für AttributeRule complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AttributeRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}EntityRule"/>
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
 *       &lt;attribute name="AttributeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "AttributeRule", propOrder = {
    "entityRules",
    "constraints"
})
public class AttributeRule {

    @XmlElement(name = "EntityRules")
    protected AttributeRule.EntityRules entityRules;
    @XmlElement(name = "Constraints")
    protected AttributeRule.Constraints constraints;
    @XmlAttribute(name = "AttributeName", required = true)
    protected String attributeName;
    @XmlAttribute(name = "RuleID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ruleID;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Ruft den Wert der entityRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttributeRule.EntityRules }
     *     
     */
    public AttributeRule.EntityRules getEntityRules() {
        return entityRules;
    }

    /**
     * Legt den Wert der entityRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeRule.EntityRules }
     *     
     */
    public void setEntityRules(AttributeRule.EntityRules value) {
        this.entityRules = value;
    }

    /**
     * Ruft den Wert der constraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttributeRule.Constraints }
     *     
     */
    public AttributeRule.Constraints getConstraints() {
        return constraints;
    }

    /**
     * Legt den Wert der constraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeRule.Constraints }
     *     
     */
    public void setConstraints(AttributeRule.Constraints value) {
        this.constraints = value;
    }

    /**
     * Ruft den Wert der attributeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Legt den Wert der attributeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
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
        protected List<AttributeRule.Constraints.Constraint> constraint;

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
         * {@link AttributeRule.Constraints.Constraint }
         * 
         * 
         */
        public List<AttributeRule.Constraints.Constraint> getConstraint() {
            if (constraint == null) {
                constraint = new ArrayList<AttributeRule.Constraints.Constraint>();
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element ref="{http://buildingsmart-tech.org/mvd/XML/1.1}EntityRule"/>
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
        "entityRule"
    })
    public static class EntityRules {

        @XmlElement(name = "EntityRule", required = true)
        protected List<EntityRule> entityRule;

        /**
         * Gets the value of the entityRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entityRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntityRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityRule }
         * 
         * 
         */
        public List<EntityRule> getEntityRule() {
            if (entityRule == null) {
                entityRule = new ArrayList<EntityRule>();
            }
            return this.entityRule;
        }

    }

}
