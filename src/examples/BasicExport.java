package examples;

import java.util.UUID;

import org.buildingsmart_tech.mvd.xml._1.Applicability;
import org.buildingsmart_tech.mvd.xml._1.AttributeRule;
import org.buildingsmart_tech.mvd.xml._1.AttributeRule.EntityRules;
import org.buildingsmart_tech.mvd.xml._1.Concept;
import org.buildingsmart_tech.mvd.xml._1.ConceptRoot;
import org.buildingsmart_tech.mvd.xml._1.ConceptRoot.Concepts;
import org.buildingsmart_tech.mvd.xml._1.ConceptTemplate;
import org.buildingsmart_tech.mvd.xml._1.ConceptTemplate.Rules;
import org.buildingsmart_tech.mvd.xml._1.Definitions;
import org.buildingsmart_tech.mvd.xml._1.EntityRule;
import org.buildingsmart_tech.mvd.xml._1.EntityRule.AttributeRules;
import org.buildingsmart_tech.mvd.xml._1.GenericReference;
import org.buildingsmart_tech.mvd.xml._1.ModelView;
import org.buildingsmart_tech.mvd.xml._1.ModelView.ExchangeRequirements;
import org.buildingsmart_tech.mvd.xml._1.ModelView.ExchangeRequirements.ExchangeRequirement;
import org.buildingsmart_tech.mvd.xml._1.ModelView.Roots;
import org.buildingsmart_tech.mvd.xml._1.Definitions.Definition;
import org.buildingsmart_tech.mvd.xml._1.Definitions.Definition.Body;
import org.buildingsmart_tech.mvd.xml._1.MvdXML;
import org.buildingsmart_tech.mvd.xml._1.MvdXML.Templates;
import org.buildingsmart_tech.mvd.xml._1.MvdXML.Views;
import org.buildingsmart_tech.mvd.xml._1.Requirements;
import org.buildingsmart_tech.mvd.xml._1.Requirements.Requirement;
import org.buildingsmart_tech.mvd.xml._1.TemplateRules;
import org.buildingsmart_tech.mvd.xml._1.TemplateRules.TemplateRule;

import factory.ModelViewFactory;
import factory.TemplateFactory;
import io.MvdExporter;

public class BasicExport {
	
	public static void main(String[] args) {
		MvdXML mvdXML = new MvdXML();
		mvdXML.setUuid("cb830d34-5696-4263-a7e9-2259ea343117");
		
		Templates templates = new Templates();
		mvdXML.setTemplates(templates);
	
		//Create Project Concept Template
		ConceptTemplate projectConceptTemplate = TemplateFactory.createConceptTemplate(
				"ProjectPropertyAssignment", "IFC4", "IfcProject");
		
		templates.getConceptTemplate().add(projectConceptTemplate);
		
		//Create Rules for the Concept Template
		
		AttributeRule relatingPropertyDefinitionRule = 
				TemplateFactory.createRelatingPropertyDefinitionRuleTree(
						projectConceptTemplate.getRules());
		AttributeRule hasPropertiesRule = TemplateFactory.defaultPropertySetRuleTree(
				relatingPropertyDefinitionRule);
		
		TemplateFactory.assignPropertyRequirement(hasPropertiesRule, 
				"IfcPropertySingleValue", "Name", "PropName", null, null, "IfcLabel");
		TemplateFactory.assignPropertyRequirement(hasPropertiesRule, 
				"IfcPropertyEnumeratedValue", "Name", "EnumPropName", null, null, null);
		
		
		//create spaceConceptTemplate
		ConceptTemplate spaceConceptTemplate = TemplateFactory.createConceptTemplate(
				"Space Properties Requirement", "IFC4", "IfcObject");
		
		templates.getConceptTemplate().add(spaceConceptTemplate);
		
		relatingPropertyDefinitionRule = TemplateFactory.createRelatingPropertyDefinitionRuleTree(
				spaceConceptTemplate.getRules());
		AttributeRule spaceConceptTemplateHasPropertiesRule = TemplateFactory.defaultPropertySetRuleTree(relatingPropertyDefinitionRule);
		
		TemplateFactory.assignPropertyRequirement(spaceConceptTemplateHasPropertiesRule, 
				"IfcPropertyEnumeratedValue", 
				"Name", "EnumPropName", 
				"EnumerationValues", "EnumPropValue", 
				null);
		
		
		TemplateFactory.quantitesRuleTree(relatingPropertyDefinitionRule);
		
		
		//Create Views
		Views views = new Views();
		mvdXML.setViews(views);
		
		ModelView modelView = ModelViewFactory.createModelView(
				"Bauantrag View", "IFC4");	
		views.getModelView().add(modelView);
		
		ExchangeRequirement exchangeRequirement = ModelViewFactory.createExchangeRequirement(
				"ERM1", "Bauantrag Exchange Requirement", Applicability.EXPORT);
		modelView.getExchangeRequirements().getExchangeRequirement().add(exchangeRequirement);
//		
		ConceptRoot conceptRoot = ModelViewFactory.createConceptRoot(
				"Project Properties", "IfcProject", projectConceptTemplate);
		conceptRoot.getApplicability().getTemplateRules().
			getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("SetName[Value]='BauantragAllgemein'"));
		modelView.getRoots().getConceptRoot().add(conceptRoot);
		
		Concept concept = ModelViewFactory.createConcept(
				"Project Concept", projectConceptTemplate);
		concept.getTemplateRules().setOperator("and");
		conceptRoot.getConcepts().getConcept().add(concept);
//		
		Requirement requirement = ModelViewFactory.createRequirement(
				Applicability.EXPORT, exchangeRequirement, "mandatory");
		concept.getRequirements().getRequirement().add(requirement);
//	
		concept.getTemplateRules().getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("SetName[Value]='BauantragAllgemein' AND PropName[Value]='Bezeichnung des Bauvorhabens'"));
		concept.getTemplateRules().getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("SetName[Value]='BauantragAllgemein' AND EnumPropName[Value]='Art der Maﬂnahme'"));
		concept.getTemplateRules().getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("SetName[Value]='BauantragAllgemein' AND PropName[Value]='Art des Geb‰udes'"));
		concept.getTemplateRules().getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("SetName[Value]='BauantragAllgemein' AND EnumPropName[Value]='Geb‰udeklasse'"));
		concept.getTemplateRules().getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("SetName[Value]='BauantragAllgemein' AND EnumPropName[Value]='Bauweise'"));
//		
		
		
		
		conceptRoot = new ConceptRoot();
		conceptRoot.setUuid(UUID.randomUUID().toString());
		conceptRoot.setName("Nettofl‰chen");
		conceptRoot.setApplicableRootEntity("IfcSpace");
		conceptRoot.setApplicability(new ConceptRoot.Applicability());
		conceptRoot.getApplicability().setTemplate(new GenericReference());
		conceptRoot.getApplicability().getTemplate().setRef(spaceConceptTemplate.getUuid());
		
		
		
		TemplateRules templateRules = new TemplateRules();
		conceptRoot.getApplicability().setTemplateRules(templateRules);
	
		TemplateRule applicibilityRule = new TemplateRule();
	    applicibilityRule.setParameters("SetName[Value]='BauantragNettofl‰chen'");	
		templateRules.getTemplateRulesOrTemplateRule().add(applicibilityRule);
		
		conceptRoot.setConcepts(new Concepts());
		
		modelView.getRoots().getConceptRoot().add(conceptRoot);
		
		concept = new Concept();
		concept.setUuid(UUID.randomUUID().toString());
		concept.setName("Space Concept");
		concept.setTemplate(new GenericReference());
		concept.getTemplate().setRef(spaceConceptTemplate.getUuid());
		concept.setRequirements(new Requirements());
		concept.setTemplateRules(new TemplateRules());
		concept.getTemplateRules().setOperator("and");
		conceptRoot.getConcepts().getConcept().add(concept);
		
		
		requirement = new Requirement();
		requirement.setApplicability(Applicability.EXPORT);
		requirement.setExchangeRequirement(exchangeRequirement.getUuid());
		requirement.setRequirement("mandatory");
		concept.getRequirements().getRequirement().add(requirement);
	
		TemplateRules andTemplateRules = new TemplateRules();
		andTemplateRules.setOperator("and");
		concept.getTemplateRules().getTemplateRulesOrTemplateRule().add(andTemplateRules);
		
		
		concept.getTemplateRules().getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("SetName[Value]='BauantragNettofl‰chen'"));
		
		
		andTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropName[Value]='Art'"));
		
		TemplateRules orTemplateRules = new TemplateRules();
		orTemplateRules.setOperator("or");
		andTemplateRules.getTemplateRulesOrTemplateRule().add(orTemplateRules);
		
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='NUF1'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='NUF2'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='NUF3'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='NUF4'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='NUF5'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='NUF6'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='NUF7'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='VF'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='TF'"));
		
		
		andTemplateRules = new TemplateRules();
		andTemplateRules.setOperator("and");
		concept.getTemplateRules().getTemplateRulesOrTemplateRule().add(andTemplateRules);
		
		andTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropName[Value]='Raumumschlieﬂung'"));
	
		orTemplateRules = new TemplateRules();
		orTemplateRules.setOperator("or");
		andTemplateRules.getTemplateRulesOrTemplateRule().add(orTemplateRules);
		
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='REGELFALL'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("EnumPropValue[Value]='SONDERFALL'"));
	

		
		Concept quantitiesConcept = new Concept();
		quantitiesConcept.setUuid(UUID.randomUUID().toString());
		quantitiesConcept.setName("QuantitiesConcept");
		conceptRoot.getConcepts().getConcept().add(quantitiesConcept);
		
		quantitiesConcept.setTemplate(new GenericReference());
	    quantitiesConcept.getTemplate().setRef(spaceConceptTemplate.getUuid());
	    
	    quantitiesConcept.setRequirements(new Requirements());
		quantitiesConcept.getRequirements().getRequirement().add(requirement);
		
		quantitiesConcept.setTemplateRules(new TemplateRules());
		quantitiesConcept.getTemplateRules().setOperator("and");
		
		orTemplateRules = new TemplateRules();
		orTemplateRules.setOperator("or");
		quantitiesConcept.getTemplateRules().getTemplateRulesOrTemplateRule().add(orTemplateRules);
		orTemplateRules.getTemplateRulesOrTemplateRule().add(ModelViewFactory.newTemplateRule("QSetName[Value]='BaseQuantities'"));
		orTemplateRules.getTemplateRulesOrTemplateRule().add(ModelViewFactory.newTemplateRule("QSetName[Value]='Qto_SpaceBaseQuantities'"));
		
		
		quantitiesConcept.getTemplateRules().getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("AreaName[Value]='GrossFloorArea' AND AreaValue[Exists]=TRUE"));
		quantitiesConcept.getTemplateRules().getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("LengthName[Value]='Height' AND LengthValue[Exists]=TRUE"));
		quantitiesConcept.getTemplateRules().getTemplateRulesOrTemplateRule().add(
				ModelViewFactory.newTemplateRule("VolumeName[Value]='GrossVolume' AND VolumeValue[Exists]=TRUE"));
		
		
		
		
	    MvdExporter exporter  = new MvdExporter();
	    exporter.saveToFile("testMVD.mvdxml", mvdXML); 
	} 
	

	
	
	
}
