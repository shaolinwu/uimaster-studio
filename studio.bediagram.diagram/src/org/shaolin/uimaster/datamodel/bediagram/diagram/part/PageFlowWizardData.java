package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.ParamScopeType;
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.common.VariableCategoryType;
import org.shaolin.uimaster.datamodel.pagediagram.util.UITypeConvertor;

public class PageFlowWizardData {
	
	private String flowName = "";
	
	private final Map<String, List<ParamType>> inputParams 
		= new LinkedHashMap<String, List<ParamType>>();

	private final List<BusinessEntityType> beList = new LinkedList<BusinessEntityType>();

	private final List<UIFieldItem> uifields = new LinkedList<UIFieldItem>();

	private final List<PageItem> pages = new LinkedList<PageItem>();

	public PageFlowWizardData() {
	}
	
	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public Map<String, List<ParamType>> getInputParams() {
		return inputParams;
	}
	
	public void clearVars() {
		inputParams.clear();
	}
	
	public void addParameter(String pageName, ParamType param) {
		if (!this.inputParams.containsKey(pageName)) {
			this.inputParams.put(pageName, new ArrayList<ParamType>());
		}
		this.inputParams.get(pageName).add(param);
	}
	
	public BusinessEntityType getBeEntity(String name) {
		for (BusinessEntityType be : beList) {
			if (be.getEntityName().equals(name)) {
				return be;
			}
		}
		return null;
	}
	
	public List<BusinessEntityType> getBeList() {
		return beList;
	}

	public void setBeList(List<BusinessEntityType> beList) {
		this.beList.clear();
		this.inputParams.clear();
		this.uifields.clear();
		this.pages.clear();
		
		this.beList.addAll(beList);

		for (BusinessEntityType be : beList) {
			String beName = be.getEntityName();
			String beVar = beName.substring(beName.lastIndexOf('.')+1);
			beVar = UITypeConvertor.lowerCaseFristWord(beVar);
			EList<MemberType> members = be.getMember();
			for (MemberType m : members) {
				UIFieldItem item = createUIFieldItem();
				item.befield = beVar + "." + m.getName();
				item.beType = m.getType().getClass().getName();
				item.uiid = "ui" + UITypeConvertor.upperCaseFristWord(m.getName());
				item.uidesc = m.getDescription() != null ? m.getDescription() : m.getName();
				item.uiType = UITypeConvertor.getDefaultUIType(m.getType());
				item.odType = UITypeConvertor.getDefaultODRuleType(m.getType());
				this.uifields.add(item);
			}
		}

		for (BusinessEntityType be : beList) {
			String beName = be.getEntityName();
			String beVar = beName.substring(beName.lastIndexOf('.')+1);
			beVar = UITypeConvertor.lowerCaseFristWord(beVar);
			PageItem item = createPageItem();
			item.beName = be.getEntityName();
			item.beVarName = beVar;
			item.pageName = be.getEntityName().substring(beName.lastIndexOf('.')+1);
			this.pages.add(item);
			
			ParamType var = CommonFactory.eINSTANCE.createParamType();
			var.setName(item.beVarName);
			var.setCategory(VariableCategoryType.BUSINESS_ENTITY);
			var.setType(CommonFactory.eINSTANCE.createTargetEntityType());
			var.getType().setEntityName(be.getEntityName());
			var.setScope(ParamScopeType.IN_OUT);
			addParameter(item.pageName, var);
		}
		
	}

	public List<UIFieldItem> getUifields() {
		return uifields;
	}

	public UIFieldItem getUifield(String befield) {
		for (UIFieldItem item : uifields) {
			if (item.befield.equals(befield)) {
				return item;
			}
		}
		return null;
	}

	public List<PageItem> getPageItems() {
		return pages;
	}

	public UIFieldItem createUIFieldItem() {
		return this.new UIFieldItem();
	}

	public PageItem createPageItem() {
		return this.new PageItem();
	}

	public class UIFieldItem {
		String befield;
		String beType;
		String uiid;
		String uidesc;
		String uiType;
		String odType;

		public UIFieldItem() {
		}

		public String toString() {
			return "befield: " + befield + ",uiid: " 
					+ uiid + ",uiType: " + uiType;
		}
	}

	public class PageItem {
		String beName;
		String beVarName;
		String pageName;
		boolean genUIEntity = true;
		boolean genSearchPage = false;

		public PageItem() {
		}
		
		public String toString() {
			return "beName: " + beName
					+ ",beVarName: " + beVarName
					+ ",pageName: " + pageName
					+ ",genUIEntity: " + genUIEntity
					+ ",genSearchPage: " + genSearchPage;
		}
	}
}
