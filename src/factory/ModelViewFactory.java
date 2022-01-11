package factory;

import java.util.UUID;

import org.buildingsmart_tech.mvd.xml._1.Applicability;
import org.buildingsmart_tech.mvd.xml._1.Concept;
import org.buildingsmart_tech.mvd.xml._1.ConceptRoot;
import org.buildingsmart_tech.mvd.xml._1.GenericReference;
import org.buildingsmart_tech.mvd.xml._1.ModelView;
import org.buildingsmart_tech.mvd.xml._1.Requirements;
import org.buildingsmart_tech.mvd.xml._1.TemplateRules;
import org.buildingsmart_tech.mvd.xml._1.ConceptRoot.Concepts;
import org.buildingsmart_tech.mvd.xml._1.ConceptTemplate;
import org.buildingsmart_tech.mvd.xml._1.ModelView.ExchangeRequirements;
import org.buildingsmart_tech.mvd.xml._1.ModelView.ExchangeRequirements.ExchangeRequirement;
import org.buildingsmart_tech.mvd.xml._1.Requirements.Requirement;
import org.buildingsmart_tech.mvd.xml._1.TemplateRules.TemplateRule;
import org.buildingsmart_tech.mvd.xml._1.ModelView.Roots;

public class ModelViewFactory {
	
	public static ModelView createModelView(
			String name, String applicableSchema) {
		ModelView modelView = new ModelView();
		modelView.setName(name);
		modelView.setUuid(UUID.randomUUID().toString());
		modelView.setExchangeRequirements(new ExchangeRequirements());
		modelView.setApplicableSchema(applicableSchema);
		modelView.setRoots(new Roots());
		
		return modelView;
	}
	
	public static ExchangeRequirement createExchangeRequirement(
			String code, String name, Applicability applicability) {
		ExchangeRequirement exchangeRequirement = new ExchangeRequirement();
		exchangeRequirement.setCode(code);
		exchangeRequirement.setName(name);
		exchangeRequirement.setApplicability(applicability);
		exchangeRequirement.setUuid(UUID.randomUUID().toString());
		return exchangeRequirement;
	}
	
	public static ConceptRoot createConceptRoot(
			String name,
			String applicableRootEntity,
			ConceptTemplate conceptTemplate) {
		
		ConceptRoot conceptRoot = new ConceptRoot();
		conceptRoot.setUuid(UUID.randomUUID().toString());
		conceptRoot.setName(name);
		conceptRoot.setApplicableRootEntity(applicableRootEntity);
		conceptRoot.setApplicability(new ConceptRoot.Applicability());
		conceptRoot.getApplicability().setTemplate(new GenericReference());
		conceptRoot.getApplicability().getTemplate().setRef(conceptTemplate.getUuid());
		conceptRoot.getApplicability().setTemplateRules(new TemplateRules());
		conceptRoot.setConcepts(new Concepts());
		
		return conceptRoot;
	}
	
	public static Concept createConcept(
			String name, ConceptTemplate conceptTemplate ) {
		Concept concept = new Concept();
		concept.setUuid(UUID.randomUUID().toString());
		concept.setName(name);
		concept.setTemplate(new GenericReference());
		concept.getTemplate().setRef(conceptTemplate.getUuid());
		concept.setRequirements(new Requirements());
		concept.setTemplateRules(new TemplateRules());
		
		return concept;
	}
	
	public static Requirement createRequirement(
			Applicability applicability,
			ExchangeRequirement exchangeRequirement,
			String requirement) {
		
		Requirement requirementObject = new Requirement();
		requirementObject.setApplicability(applicability);
		requirementObject.setExchangeRequirement(exchangeRequirement.getUuid());
		requirementObject.setRequirement(requirement);
		return requirementObject;
	}
	
	public static TemplateRule newTemplateRule(String parameters) {
		TemplateRule templateRule = new TemplateRule();
		templateRule.setParameters(parameters);
		return templateRule;
	}
}
