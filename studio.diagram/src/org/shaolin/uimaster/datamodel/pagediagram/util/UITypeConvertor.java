package org.shaolin.uimaster.datamodel.pagediagram.util;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEListType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BEType;
import org.shaolin.uimaster.datamodel.bediagram.CEObjRefType;
import org.shaolin.uimaster.datamodel.common.ParamScopeType;
import org.shaolin.uimaster.datamodel.common.VariableCategoryType;
import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.UIComponentType;
import org.shaolin.uimaster.datamodel.page.UIRadioButtonGroupType;
import org.shaolin.uimaster.datamodel.page.impl.UICheckBoxGroupTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UICheckBoxTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIComboBoxTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIDateTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIFileTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIHiddenTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UILabelTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIListTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIObjectListTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIRadioButtonTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIReferenceEntityTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UITextAreaTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UITextFieldTypeImpl;

public class UITypeConvertor {

	public final static Map<String, Class<?>> BEFIELD_TYPES 
	= new LinkedHashMap<String, Class<?>>();
	
	public final static Map<String, Class<?>> ACTION_TYPES 
	= new LinkedHashMap<String, Class<?>>();
	
	public static final List<String> BASE_RULES 
	= new LinkedList<String>();
	
	private final static String[] CATEGORIES = new String[4];
	
	private final static String[] SCOPES = new String[4];
	
	static {
		BEFIELD_TYPES.put("UILabelType", UILabelTypeImpl.class);
		BEFIELD_TYPES.put("UITextFieldType", UITextFieldTypeImpl.class);
		BEFIELD_TYPES.put("UITextAreaType", UITextAreaTypeImpl.class);
		BEFIELD_TYPES.put("UIHiddenType", UIHiddenTypeImpl.class);
		BEFIELD_TYPES.put("UICheckBoxType", UICheckBoxTypeImpl.class);
		BEFIELD_TYPES.put("UIRadioButtonType", UIRadioButtonTypeImpl.class);
		BEFIELD_TYPES.put("UIComboBoxType", UIComboBoxTypeImpl.class);
		BEFIELD_TYPES.put("UIListType", UIListTypeImpl.class);
		BEFIELD_TYPES.put("UIRadioButtonGroupType", UIRadioButtonGroupType.class);
		BEFIELD_TYPES.put("UICheckBoxGroupType", UICheckBoxGroupTypeImpl.class);
		BEFIELD_TYPES.put("UIFileType", UIFileTypeImpl.class);
		BEFIELD_TYPES.put("UIDateType", UIDateTypeImpl.class);
		BEFIELD_TYPES.put("UIEntityType", UIReferenceEntityTypeImpl.class);
		BEFIELD_TYPES.put("UITableType", UIObjectListTypeImpl.class);
		
		CATEGORIES[0] = VariableCategoryType.BUSINESS_ENTITY.getLiteral();
		CATEGORIES[1] = VariableCategoryType.CONSTANT_ENTITY.getLiteral();
		CATEGORIES[2] = VariableCategoryType.UI_ENTITY.getLiteral();
		CATEGORIES[3] = VariableCategoryType.JAVA_CLASS.getLiteral();
		
		SCOPES[0] = ParamScopeType.IN.getLiteral();
		SCOPES[1] = ParamScopeType.OUT.getLiteral();
		SCOPES[2] = ParamScopeType.IN.getLiteral();
		SCOPES[3] = ParamScopeType.INTERNAL.getLiteral();
		
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UIFileComponentOD");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UIMultipleChoiceAndCE");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UIMultipleChoiceOD");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UISelectComponentOD");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UISingleChoiceAndCE");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UISingleChoiceOD");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UITextComponentAndCE");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UITextComponentAndCurrency");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UITextComponentAndDate");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UITextComponentAndDateOnly");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UITextComponentAndFloatNumber");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UITextComponentAndNumber");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UITextComponentAndString");
    	BASE_RULES.add("org.shaolin.uimaster.page.od.rules.UITable");
	}
	
	public static String[] getODBaseRules() {
		String[] rules = new String[BASE_RULES.size()];
		BASE_RULES.toArray(rules);
		return rules;
	}
	
	public static String getTypeByIndex(int i) {
		if (i == -1) {
			return "";
		}
		Set<String> typeNames = getBEFieldMappingTypes();
		String[] types = new String[typeNames.size()];
		typeNames.toArray(types);
		return types[i];
	}
	
	public static Set<String> getBEFieldMappingTypes() {
		return BEFIELD_TYPES.keySet();
	}
	
	public static Class<?> getMappingClass(String type) {
		return BEFIELD_TYPES.get(type);
	}
	
	public static String getDefaultODRuleType(BEType type) {
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBinaryType()) {
			return "org.shaolin.uimaster.page.od.rules.UITextComponentAndString";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getIntType()) {
			return "org.shaolin.uimaster.page.od.rules.UITextComponentAndNumber";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getLongType()) {
			return "org.shaolin.uimaster.page.od.rules.UITextComponentAndNumber";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getStringType()) {
			return "org.shaolin.uimaster.page.od.rules.UITextComponentAndString";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBooleanType()) {
			return "org.shaolin.uimaster.page.od.rules.UISelectComponentOD";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getDoubleType()) {
			return "org.shaolin.uimaster.page.od.rules.UITextComponentAndFloatNumber";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getFileType()) {
			return "org.shaolin.uimaster.page.od.rules.UIFileComponentOD";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getTimeType()) {
			return "org.shaolin.uimaster.page.od.rules.UITextComponentAndDate";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getDateTimeType()) {
			return "org.shaolin.uimaster.page.od.rules.UITextComponentAndDateOnly";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBEObjRefType()) {
			return ((BEObjRefType)type).getTargetEntity().getEntityName();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getCEObjRefType()) {
			return "org.shaolin.uimaster.page.od.rules.UITextComponentAndCE";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBEListType()) {
			if (((BEListType)type).getElementType() instanceof BEObjRefType) {
				return "org.shaolin.uimaster.page.od.rules.UITable";
			}
			if (((BEListType)type).getElementType() instanceof CEObjRefType) {
				return "org.shaolin.uimaster.page.od.rules.UISingleChoiceAndCE";
			} 
			return "org.shaolin.uimaster.page.od.rules.UISingleChoiceAndCE";
		}
		
		return "org.shaolin.uimaster.page.od.rules.UITextComponentAndString";
	}
	
	public static String getDefaultUIType(BEType type) {
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBinaryType()) {
			return "UILabelType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getIntType()) {
			return "UITextFieldType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getLongType()) {
			return "UITextFieldType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getStringType()) {
			return "UITextFieldType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBooleanType()) {
			return "UICheckBoxType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getDoubleType()) {
			return "UITextFieldType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getFileType()) {
			return "UIFileType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getTimeType()) {
			return "UIDateType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getDateTimeType()) {
			return "UIDateType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBEObjRefType()) {
			return "UIEntityType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getCEObjRefType()) {
			return "UIComboBoxType";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBEListType()) {
			if (((BEListType)type).getElementType() instanceof BEObjRefType) {
				return "UITableType";
			}
			if (((BEListType)type).getElementType() instanceof CEObjRefType) {
				return "UIComboBoxType";
			}
			return "UIComboBoxType";
		}
		
		return "UILabelType";
	}
	
	public static UIComponentType createUIComponent(String uitype) {
		if ("UILabelType".equals(uitype)) {
			return PageFactory.eINSTANCE.createUILabelType();
		}
		if ("UIHiddenType".equals(uitype)) {
			return PageFactory.eINSTANCE.createUIHiddenType();
		}
		if ("UITextAreaType".equals(uitype)) {
			return PageFactory.eINSTANCE.createUITextAreaType();
		}
		if ("UITextFieldType".equals(uitype)) {
			return PageFactory.eINSTANCE.createUITextFieldType();
		}
		if ("UIFileType".equals(uitype)) {
			return PageFactory.eINSTANCE.createUIFileType();
		}
		if ("UIComboBoxType".equals(uitype)) {
			return PageFactory.eINSTANCE.createUIComboBoxType();
		}
		if ("UICheckBoxType".equals(uitype)) {
			return PageFactory.eINSTANCE.createUICheckBoxType();
		}
		if ("UIDateType".equals(uitype)) {
			return PageFactory.eINSTANCE.createUIDateType();
		}
		if ("UIEntityType".equals(uitype)) {
			return PageFactory.eINSTANCE.createUIReferenceEntityType();
		}
		return PageFactory.eINSTANCE.createUILabelType();
	}
	
	public static String[] getVarCategories() {
		return CATEGORIES;
	}
	
	public static String[] getVarScopes() {
		return SCOPES;
	}
	
	public static String upperCaseFristWord(String name)
    {
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    } 
	
	public static String lowerCaseFristWord(String name)
    {
        return Character.toLowerCase(name.charAt(0)) + name.substring(1);
    } 
}
