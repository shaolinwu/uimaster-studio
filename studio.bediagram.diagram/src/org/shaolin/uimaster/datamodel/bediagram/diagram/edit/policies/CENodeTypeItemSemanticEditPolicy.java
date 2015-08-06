package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies;

import java.util.List;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantValueType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramViewProvider;

/**
 * @generated
 */
public class CENodeTypeItemSemanticEditPolicy extends
		BediagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CENodeTypeItemSemanticEditPolicy() {
		super(BediagramElementTypes.CENodeType_2001);
	}

	public static void addField(final CEMemberContainerEditPart self) {
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	ConstantEntityType owner = self.getCENode();
		    	int size = owner.getConstantValue().size();
				
				ConstantValueType newElement = BEDiagramFactory.eINSTANCE.createConstantValueType();
				newElement.setValue("Constant" + size);
				newElement.setIntValue(size);
				newElement.setDescription("This is Constant"+size+" item.");
				
				owner.getConstantValue().add(newElement);
				
				// update ui.
				PreferencesHint preferencesHint = new PreferencesHint("2004");
				BediagramViewProvider viewProvider = new BediagramViewProvider();
				Node node = viewProvider.createCEMemberType_2004(newElement, 
						((View) self.getModel()), true, preferencesHint);
				((View) self.getModel()).insertChild(node);
		    }
		});
	}
	
	public static void insert(final CEMemberTypeEditPart self, final EditPart parentEditPart) {
		final ConstantValueType selfModel = self.getConstantValue();
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	ConstantEntityType ce = (ConstantEntityType)selfModel.eContainer();
		    	int selfIndex = ce.getConstantValue().indexOf(selfModel);
		    	int size = ce.getConstantValue().size();
		    	ConstantValueType newElement = BEDiagramFactory.eINSTANCE.createConstantValueType();
		    	newElement.setValue("Constant" + size);
				newElement.setIntValue(size);
				newElement.setDescription("This is Constant"+size+" item.");
				
				ce.getConstantValue().add(selfIndex + 1, newElement);
				
				// update ui.
				PreferencesHint preferencesHint = new PreferencesHint("2004");
				BediagramViewProvider viewProvider = new BediagramViewProvider();
				Node node = viewProvider.createCEMemberType_2004(newElement, 
						((View) parentEditPart.getModel()), ce.getConstantValue().size(), 
						true, preferencesHint);
				((View) parentEditPart.getModel()).insertChildAt(node, selfIndex + 1);
				
		    }
		});
	}
	
	public static void up(final CEMemberTypeEditPart self, EditPart parent) {
		CEMemberTypeEditPart upSibling = null;
		List<EditPart> children = parent.getChildren();
		if (children.size() <= 1) {
			return;
		}
		for (int i=0; i<children.size(); i++) {
			if (children.get(i) == self) {
				if (i == 0) {
					return;
				}
				upSibling = (CEMemberTypeEditPart)children.get(i-1);
				break;
			}
		}
		if (upSibling == null) {
			return;
		}
		
		final ConstantValueType selfModel = self.getConstantValue();
		final ConstantValueType upSiblingModel = upSibling.getConstantValue();
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	ConstantEntityType ce = (ConstantEntityType)selfModel.eContainer();
		    	int siblingIndex = ce.getConstantValue().indexOf(upSiblingModel);
		    	ce.getConstantValue().move(siblingIndex, selfModel);
		    	
		    	EditPart compartment = self.getParent();
				ViewUtil.repositionChildAt((View) compartment.getModel(),
						(View) self.getModel(), siblingIndex);
				compartment.refresh();
		    }
		});
	}

	public static void down(final CEMemberTypeEditPart self, EditPart parent) {
		CEMemberTypeEditPart downSibling = null;
		List<EditPart> children = parent.getChildren();
		if (children.size() <= 1) {
			return;
		}
		for (int i=0; i<children.size(); i++) {
			if (children.get(i) == self) {
				if (i == children.size()-1) {
					return;
				}
				downSibling = (CEMemberTypeEditPart)children.get(i+1);
				break;
			}
		}
		if (downSibling == null) {
			return;
		}
		
		final ConstantValueType selfModel = self.getConstantValue();
		final ConstantValueType downSiblingModel = downSibling.getConstantValue();
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	ConstantEntityType be = (ConstantEntityType)selfModel.eContainer();
		    	int siblingIndex = be.getConstantValue().indexOf(downSiblingModel);
		    	be.getConstantValue().move(siblingIndex, selfModel);
		    	
		    	EditPart compartment = self.getParent();
				ViewUtil.repositionChildAt((View) compartment.getModel(),
						(View) self.getModel(), siblingIndex);
				compartment.refresh();
		    }
		});
	}
	
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return super.getDestroyElementCommand(req);
	}

}
