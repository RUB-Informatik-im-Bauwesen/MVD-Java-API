//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.01.07 um 10:54:58 AM CET 
//


package org.buildingsmart_tech.mvd.xml._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.buildingsmart_tech.mvd.xml._1 package. 
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

    private final static QName _EntityRule_QNAME = new QName("http://buildingsmart-tech.org/mvd/XML/1.1", "EntityRule");
    private final static QName _MvdXML_QNAME = new QName("http://buildingsmart-tech.org/mvd/XML/1.1", "mvdXML");
    private final static QName _Concept_QNAME = new QName("http://buildingsmart-tech.org/mvd/XML/1.1", "Concept");
    private final static QName _TemplateRules_QNAME = new QName("http://buildingsmart-tech.org/mvd/XML/1.1", "TemplateRules");
    private final static QName _AttributeRule_QNAME = new QName("http://buildingsmart-tech.org/mvd/XML/1.1", "AttributeRule");
    private final static QName _ConceptRoot_QNAME = new QName("http://buildingsmart-tech.org/mvd/XML/1.1", "ConceptRoot");
    private final static QName _ModelView_QNAME = new QName("http://buildingsmart-tech.org/mvd/XML/1.1", "ModelView");
    private final static QName _ConceptTemplate_QNAME = new QName("http://buildingsmart-tech.org/mvd/XML/1.1", "ConceptTemplate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.buildingsmart_tech.mvd.xml._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Requirements }
     * 
     */
    public Requirements createRequirements() {
        return new Requirements();
    }

    /**
     * Create an instance of {@link Definitions }
     * 
     */
    public Definitions createDefinitions() {
        return new Definitions();
    }

    /**
     * Create an instance of {@link Definitions.Definition }
     * 
     */
    public Definitions.Definition createDefinitionsDefinition() {
        return new Definitions.Definition();
    }

    /**
     * Create an instance of {@link ConceptTemplate }
     * 
     */
    public ConceptTemplate createConceptTemplate() {
        return new ConceptTemplate();
    }

    /**
     * Create an instance of {@link AttributeRule }
     * 
     */
    public AttributeRule createAttributeRule() {
        return new AttributeRule();
    }

    /**
     * Create an instance of {@link AttributeRule.Constraints }
     * 
     */
    public AttributeRule.Constraints createAttributeRuleConstraints() {
        return new AttributeRule.Constraints();
    }

    /**
     * Create an instance of {@link ConceptRoot }
     * 
     */
    public ConceptRoot createConceptRoot() {
        return new ConceptRoot();
    }

    /**
     * Create an instance of {@link ModelView }
     * 
     */
    public ModelView createModelView() {
        return new ModelView();
    }

    /**
     * Create an instance of {@link ModelView.ExchangeRequirements }
     * 
     */
    public ModelView.ExchangeRequirements createModelViewExchangeRequirements() {
        return new ModelView.ExchangeRequirements();
    }

    /**
     * Create an instance of {@link EntityRule }
     * 
     */
    public EntityRule createEntityRule() {
        return new EntityRule();
    }

    /**
     * Create an instance of {@link EntityRule.Constraints }
     * 
     */
    public EntityRule.Constraints createEntityRuleConstraints() {
        return new EntityRule.Constraints();
    }

    /**
     * Create an instance of {@link MvdXML }
     * 
     */
    public MvdXML createMvdXML() {
        return new MvdXML();
    }

    /**
     * Create an instance of {@link TemplateRules }
     * 
     */
    public TemplateRules createTemplateRules() {
        return new TemplateRules();
    }

    /**
     * Create an instance of {@link Concept }
     * 
     */
    public Concept createConcept() {
        return new Concept();
    }

    /**
     * Create an instance of {@link GenericReference }
     * 
     */
    public GenericReference createGenericReference() {
        return new GenericReference();
    }

    /**
     * Create an instance of {@link Requirements.Requirement }
     * 
     */
    public Requirements.Requirement createRequirementsRequirement() {
        return new Requirements.Requirement();
    }

    /**
     * Create an instance of {@link Definitions.Definition.Body }
     * 
     */
    public Definitions.Definition.Body createDefinitionsDefinitionBody() {
        return new Definitions.Definition.Body();
    }

    /**
     * Create an instance of {@link Definitions.Definition.Link }
     * 
     */
    public Definitions.Definition.Link createDefinitionsDefinitionLink() {
        return new Definitions.Definition.Link();
    }

    /**
     * Create an instance of {@link ConceptTemplate.Rules }
     * 
     */
    public ConceptTemplate.Rules createConceptTemplateRules() {
        return new ConceptTemplate.Rules();
    }

    /**
     * Create an instance of {@link ConceptTemplate.SubTemplates }
     * 
     */
    public ConceptTemplate.SubTemplates createConceptTemplateSubTemplates() {
        return new ConceptTemplate.SubTemplates();
    }

    /**
     * Create an instance of {@link AttributeRule.EntityRules }
     * 
     */
    public AttributeRule.EntityRules createAttributeRuleEntityRules() {
        return new AttributeRule.EntityRules();
    }

    /**
     * Create an instance of {@link AttributeRule.Constraints.Constraint }
     * 
     */
    public AttributeRule.Constraints.Constraint createAttributeRuleConstraintsConstraint() {
        return new AttributeRule.Constraints.Constraint();
    }

    /**
     * Create an instance of {@link ConceptRoot.Applicability }
     * 
     */
    public ConceptRoot.Applicability createConceptRootApplicability() {
        return new ConceptRoot.Applicability();
    }

    /**
     * Create an instance of {@link ConceptRoot.Concepts }
     * 
     */
    public ConceptRoot.Concepts createConceptRootConcepts() {
        return new ConceptRoot.Concepts();
    }

    /**
     * Create an instance of {@link ModelView.Roots }
     * 
     */
    public ModelView.Roots createModelViewRoots() {
        return new ModelView.Roots();
    }

    /**
     * Create an instance of {@link ModelView.ExchangeRequirements.ExchangeRequirement }
     * 
     */
    public ModelView.ExchangeRequirements.ExchangeRequirement createModelViewExchangeRequirementsExchangeRequirement() {
        return new ModelView.ExchangeRequirements.ExchangeRequirement();
    }

    /**
     * Create an instance of {@link EntityRule.References }
     * 
     */
    public EntityRule.References createEntityRuleReferences() {
        return new EntityRule.References();
    }

    /**
     * Create an instance of {@link EntityRule.AttributeRules }
     * 
     */
    public EntityRule.AttributeRules createEntityRuleAttributeRules() {
        return new EntityRule.AttributeRules();
    }

    /**
     * Create an instance of {@link EntityRule.Constraints.Constraint }
     * 
     */
    public EntityRule.Constraints.Constraint createEntityRuleConstraintsConstraint() {
        return new EntityRule.Constraints.Constraint();
    }

    /**
     * Create an instance of {@link MvdXML.Templates }
     * 
     */
    public MvdXML.Templates createMvdXMLTemplates() {
        return new MvdXML.Templates();
    }

    /**
     * Create an instance of {@link MvdXML.Views }
     * 
     */
    public MvdXML.Views createMvdXMLViews() {
        return new MvdXML.Views();
    }

    /**
     * Create an instance of {@link TemplateRules.TemplateRule }
     * 
     */
    public TemplateRules.TemplateRule createTemplateRulesTemplateRule() {
        return new TemplateRules.TemplateRule();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://buildingsmart-tech.org/mvd/XML/1.1", name = "EntityRule")
    public JAXBElement<EntityRule> createEntityRule(EntityRule value) {
        return new JAXBElement<EntityRule>(_EntityRule_QNAME, EntityRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MvdXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://buildingsmart-tech.org/mvd/XML/1.1", name = "mvdXML")
    public JAXBElement<MvdXML> createMvdXML(MvdXML value) {
        return new JAXBElement<MvdXML>(_MvdXML_QNAME, MvdXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Concept }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://buildingsmart-tech.org/mvd/XML/1.1", name = "Concept")
    public JAXBElement<Concept> createConcept(Concept value) {
        return new JAXBElement<Concept>(_Concept_QNAME, Concept.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://buildingsmart-tech.org/mvd/XML/1.1", name = "TemplateRules")
    public JAXBElement<TemplateRules> createTemplateRules(TemplateRules value) {
        return new JAXBElement<TemplateRules>(_TemplateRules_QNAME, TemplateRules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://buildingsmart-tech.org/mvd/XML/1.1", name = "AttributeRule")
    public JAXBElement<AttributeRule> createAttributeRule(AttributeRule value) {
        return new JAXBElement<AttributeRule>(_AttributeRule_QNAME, AttributeRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://buildingsmart-tech.org/mvd/XML/1.1", name = "ConceptRoot")
    public JAXBElement<ConceptRoot> createConceptRoot(ConceptRoot value) {
        return new JAXBElement<ConceptRoot>(_ConceptRoot_QNAME, ConceptRoot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelView }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://buildingsmart-tech.org/mvd/XML/1.1", name = "ModelView")
    public JAXBElement<ModelView> createModelView(ModelView value) {
        return new JAXBElement<ModelView>(_ModelView_QNAME, ModelView.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://buildingsmart-tech.org/mvd/XML/1.1", name = "ConceptTemplate")
    public JAXBElement<ConceptTemplate> createConceptTemplate(ConceptTemplate value) {
        return new JAXBElement<ConceptTemplate>(_ConceptTemplate_QNAME, ConceptTemplate.class, null, value);
    }

}
