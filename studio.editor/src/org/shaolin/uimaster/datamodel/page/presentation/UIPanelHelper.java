package org.shaolin.uimaster.datamodel.page.presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.shaolin.uimaster.datamodel.page.AlignType;
import org.shaolin.uimaster.datamodel.page.ComponentConstraintType;
import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.TableLayoutConstraintType;
import org.shaolin.uimaster.datamodel.page.TableLayoutType;
import org.shaolin.uimaster.datamodel.page.UIComponentType;
import org.shaolin.uimaster.datamodel.page.UIPanelType;

public class UIPanelHelper {

	public static void createLayout(UIPanelType parent, int rows, int columns) {
		TableLayoutType layout = PageFactory.eINSTANCE.createTableLayoutType();
		for (int i=0; i<rows; i++) {
			layout.getRowHeightWeight().add(new Double(-1.0));
			
			String uiid = parent.getUIID() + "_uiPanel" + i;
			UIPanelType newPanel = PageFactory.eINSTANCE.createUIPanelType();
			newPanel.setUIID(uiid);
			newPanel.setLayout(PageFactory.eINSTANCE.createTableLayoutType());
			parent.getComponent().add(newPanel);
			
			ComponentConstraintType cc = PageFactory.eINSTANCE.createComponentConstraintType();
			TableLayoutConstraintType c = PageFactory.eINSTANCE.createTableLayoutConstraintType();
			c.setX(i);
			c.setY(0);
			c.setAlign(AlignType.FULL);
			cc.setConstraint(c);
			cc.setComponentId(uiid);
			parent.getLayoutConstraint().add(cc);
			
			((TableLayoutType)newPanel.getLayout())
				.getRowHeightWeight().add(new Double(-1.0));
			for (int j=0; j<columns; j++) {
				((TableLayoutType)newPanel.getLayout())
					.getColumnWidthWeight().add(new Double(-1.0));
			}
		}
		parent.setLayout(layout);
	}

	public static List<String> fetchPanelElementsUIID(UIPanelType parent) {
		List<UIComponentType> list = fetchPanelElements(parent);
		
		List<String> uiids = new ArrayList<String>(list.size());
		for (UIComponentType comp: list) {
			uiids.add(comp.getUIID());
		}
		
		return uiids;
	}
	
	public static List<UIComponentType> fetchPanelElements(UIPanelType parent) {
		List<UIComponentType> list = new ArrayList<UIComponentType>();
		fetchPanelElements0(parent, list);
		return list;
	}
	
	private static void fetchPanelElements0(UIPanelType parent, List<UIComponentType> list) {
		EList<UIComponentType> subcomps = parent.getComponent();
		for (UIComponentType comp: subcomps) {
			if (comp instanceof UIPanelType) {
				fetchPanelElements0((UIPanelType)comp, list);
			} else {
				list.add(comp);
			}
		}
	}
	
	public static List<String> getAllRuleNames() {
		//BaseRulesHelper
		List<String> ruels = new ArrayList<String>();
		
		return ruels;
	}
	
	public static List<String> getRuleParameters() {
		return Collections.emptyList();
	}
}
