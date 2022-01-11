package factory;

import java.util.UUID;

import org.buildingsmart_tech.mvd.xml._1.AttributeRule;
import org.buildingsmart_tech.mvd.xml._1.ConceptTemplate;
import org.buildingsmart_tech.mvd.xml._1.EntityRule;
import org.buildingsmart_tech.mvd.xml._1.AttributeRule.EntityRules;
import org.buildingsmart_tech.mvd.xml._1.ConceptTemplate.Rules;
import org.buildingsmart_tech.mvd.xml._1.EntityRule.AttributeRules;

public class TemplateFactory {
	
	public static ConceptTemplate createConceptTemplate(
			String name,
			String applicableSchema,
			String applicableEntity
			) {
		
		ConceptTemplate conceptTemplate = new ConceptTemplate();
		conceptTemplate.setUuid(UUID.randomUUID().toString());
		conceptTemplate.setName(name);
		conceptTemplate.getApplicableSchema().add(applicableSchema);
		conceptTemplate.getApplicableEntity().add(applicableEntity);		
	
		conceptTemplate.setRules(new Rules());
	
		return conceptTemplate;
	}
	
	public static EntityRule assignPropertyRequirement(
			AttributeRule hasPropertiesRule,
			String entityName,
			String attributeNameField,
			String attributeRuleID,
			String attributeValueField,
			String attributeValueRuleID,
			String attributeType) {
		
		EntityRule entityRule = new EntityRule();
		entityRule.setEntityName(entityName);
		entityRule.setAttributeRules(new AttributeRules());
		hasPropertiesRule.getEntityRules().getEntityRule().add(entityRule);
		
		AttributeRule nameRule = new AttributeRule();
		nameRule.setAttributeName(attributeNameField);
		nameRule.setRuleID(attributeRuleID);
		entityRule.getAttributeRules().getAttributeRule().add(nameRule);
		
		if(attributeValueField!=null && attributeValueField!="") {
			AttributeRule valueFieldRule = new AttributeRule();
			valueFieldRule.setAttributeName(attributeValueField);
			entityRule.getAttributeRules().getAttributeRule().add(valueFieldRule);
			
			if(attributeValueRuleID!=null) {
				valueFieldRule.setRuleID(attributeValueRuleID);
			}
		}
		
		if(attributeType!=null) {
			nameRule.setEntityRules(new EntityRules());
			EntityRule attributeTypeRule = new EntityRule();
			attributeTypeRule.setEntityName(attributeType);
			nameRule.getEntityRules().getEntityRule().add(attributeTypeRule);
		}
		
		return entityRule;
	}
	
	public static AttributeRule createRelatingPropertyDefinitionRuleTree(Rules rules) {
		AttributeRule attributeRule1 = new AttributeRule();
		attributeRule1.setAttributeName("IsDefinedBy");
		attributeRule1.setEntityRules(new EntityRules());
		rules.getAttributeRule().add(attributeRule1);
		
		EntityRule entityRule1 = new EntityRule();
		entityRule1.setEntityName("IfcRelDefinesByProperties");
		entityRule1.setAttributeRules(new AttributeRules());
		attributeRule1.getEntityRules().getEntityRule().add(entityRule1);
	
		AttributeRule attributeRule2 = new AttributeRule();
		attributeRule2.setAttributeName("RelatingPropertyDefinition");
		attributeRule2.setEntityRules(new EntityRules());
		entityRule1.getAttributeRules().getAttributeRule().add(attributeRule2);
		
		return attributeRule2;
	}
	
	public static AttributeRule defaultPropertySetRuleTree(AttributeRule relatingPropertyDefinitionRule) {
		
		EntityRule entityRule2 = new EntityRule();
		entityRule2.setEntityName("IfcPropertySet");
		entityRule2.setAttributeRules(new AttributeRules());
		relatingPropertyDefinitionRule.getEntityRules().getEntityRule().add(entityRule2);
		
		AttributeRule attributeRule3 = new AttributeRule();
		attributeRule3.setAttributeName("Name");
		attributeRule3.setRuleID("SetName");
		attributeRule3.setEntityRules(new EntityRules());
		entityRule2.getAttributeRules().getAttributeRule().add(attributeRule3);
		
		EntityRule ifcLabelTypeRule = new EntityRule();
		ifcLabelTypeRule.setEntityName("IfcLabel");
		attributeRule3.getEntityRules().getEntityRule().add(ifcLabelTypeRule);
		
		AttributeRule hasPropertiesRule = new AttributeRule();
		hasPropertiesRule.setAttributeName("HasProperties");
		hasPropertiesRule.setEntityRules(new EntityRules());
		entityRule2.getAttributeRules().getAttributeRule().add(hasPropertiesRule);
		
		return hasPropertiesRule;
	}
	
    public static AttributeRule quantitesRuleTree(AttributeRule relatingPropertyDefinitionRule){
    			
		EntityRule entityRule2 = new EntityRule();
		entityRule2.setEntityName("IfcElementQuantity");
		entityRule2.setAttributeRules(new AttributeRules());
		relatingPropertyDefinitionRule.getEntityRules().getEntityRule().add(entityRule2);
		
		AttributeRule attributeRule3 = new AttributeRule();
		attributeRule3.setAttributeName("Name");
		attributeRule3.setRuleID("QSetName");
		attributeRule3.setEntityRules(new EntityRules());
		entityRule2.getAttributeRules().getAttributeRule().add(attributeRule3);
		
		EntityRule ifcLabelTypeRule = new EntityRule();
		ifcLabelTypeRule.setEntityName("IfcLabel");
		attributeRule3.getEntityRules().getEntityRule().add(ifcLabelTypeRule);
		
		AttributeRule quantitiesRule = new AttributeRule();
		quantitiesRule.setAttributeName("Quantities");
		quantitiesRule.setEntityRules(new EntityRules());
		entityRule2.getAttributeRules().getAttributeRule().add(quantitiesRule);
		
		EntityRule areaRule = new EntityRule();
		areaRule.setEntityName("IfcQuantityArea");
		areaRule.setAttributeRules(new AttributeRules());
		quantitiesRule.getEntityRules().getEntityRule().add(areaRule);
		
		AttributeRule areaNameRule = new AttributeRule();
		areaNameRule.setAttributeName("Name");
		areaNameRule.setRuleID("AreaName");
		areaRule.getAttributeRules().getAttributeRule().add(areaNameRule);
		
		AttributeRule areaValueRule = new AttributeRule();
		areaValueRule.setAttributeName("AreaValue");
		areaValueRule.setRuleID("AreaValue");
		areaRule.getAttributeRules().getAttributeRule().add(areaValueRule);
		
		EntityRule lengthRule = new EntityRule();
		lengthRule.setEntityName("IfcQuantityLength");
		lengthRule.setAttributeRules(new AttributeRules());
		quantitiesRule.getEntityRules().getEntityRule().add(lengthRule);
		
		AttributeRule lengthNameRule = new AttributeRule();
		lengthNameRule.setAttributeName("Name");
		lengthNameRule.setRuleID("LengthName");
		lengthRule.getAttributeRules().getAttributeRule().add(lengthNameRule);
		
		AttributeRule lengthValueRule = new AttributeRule();
		lengthValueRule.setAttributeName("LengthValue");
		lengthValueRule.setRuleID("LengthValue");
		lengthRule.getAttributeRules().getAttributeRule().add(lengthValueRule);
		
		EntityRule volumeRule = new EntityRule();
		volumeRule.setEntityName("IfcQuantityVolume");
		volumeRule.setAttributeRules(new AttributeRules());
		quantitiesRule.getEntityRules().getEntityRule().add(volumeRule);
		
		AttributeRule volumeNameRule = new AttributeRule();
		volumeNameRule.setAttributeName("Name");
		volumeNameRule.setRuleID("VolumeName");
		volumeRule.getAttributeRules().getAttributeRule().add(volumeNameRule);
		
		AttributeRule volumeValueRule = new AttributeRule();
		volumeValueRule.setAttributeName("VolumeValue");
		volumeValueRule.setRuleID("VolumeValue");
		volumeRule.getAttributeRules().getAttributeRule().add(volumeValueRule);

		
		return quantitiesRule;
    }

	

}
