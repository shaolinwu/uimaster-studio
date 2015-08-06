package org.shaolin.uimaster.datamodel.page.presentation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.shaolin.uimaster.datamodel.common.ParamScopeType;
import org.shaolin.uimaster.datamodel.common.VariableCategoryType;
import org.shaolin.uimaster.datamodel.page.UIRadioButtonGroupType;
import org.shaolin.uimaster.datamodel.page.impl.UICheckBoxGroupTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UICheckBoxTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIComboBoxTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIDateTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIEntityTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIFileTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIHiddenTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UILabelTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIListTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UIRadioButtonTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UITextAreaTypeImpl;
import org.shaolin.uimaster.datamodel.page.impl.UITextFieldTypeImpl;

public class UITypeConvertor {

	public final static Map<String, Class<?>> BEFIELD_TYPES 
	= new HashMap<String, Class<?>>();
	
	public final static Map<String, Class<?>> ACTION_TYPES 
	= new HashMap<String, Class<?>>();
	
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
		BEFIELD_TYPES.put("UIEntityType", UIEntityTypeImpl.class);
		
		CATEGORIES[0] = VariableCategoryType.BUSINESS_ENTITY.getLiteral();
		CATEGORIES[1] = VariableCategoryType.CONSTANT_ENTITY.getLiteral();
		CATEGORIES[2] = VariableCategoryType.UI_ENTITY.getLiteral();
		CATEGORIES[3] = VariableCategoryType.JAVA_CLASS.getLiteral();
		
		SCOPES[0] = ParamScopeType.IN.getLiteral();
		SCOPES[1] = ParamScopeType.OUT.getLiteral();
		SCOPES[2] = ParamScopeType.IN_OUT.getLiteral();
		SCOPES[3] = ParamScopeType.INTERNAL.getLiteral();
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
	
	public static String[] getVarCategories() {
		return CATEGORIES;
	}
	
	public static String[] getVarScopes() {
		return SCOPES;
	}
}
