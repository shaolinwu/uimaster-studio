package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies;

import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramViewProvider;

/**
 * @generated
 */
public class BEFieldTypeItemSemanticEditPolicy extends
		BediagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BEFieldTypeItemSemanticEditPolicy() {
		super(BediagramElementTypes.BENodeType_MemberType_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}
	
	public static void addField(final BEMemberContainerEditPart self) {
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	MemberType newElement = BEDiagramFactory.eINSTANCE.createMemberType();
				newElement.setName("field" + self.getBENode().getMember().size());
				newElement.setType(BEDiagramFactory.eINSTANCE.createStringType());
				self.getBENode().getMember().add(newElement);
				
				// update ui.
				PreferencesHint preferencesHint = new PreferencesHint("2003");
				BediagramViewProvider viewProvider = new BediagramViewProvider();
				Node node = viewProvider.createBENodeMemberType_2003(newElement, 
						((View) self.getModel()), true, preferencesHint);
				((View) self.getModel()).insertChild(node);
		    }
		});
	}

	public static void insert(final BEMemberTypeEditPart self, final EditPart parent) {
		final MemberType selfModel = self.getMemberType();
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	BusinessEntityType be = (BusinessEntityType)selfModel.eContainer();
		    	int selfIndex = be.getMember().indexOf(selfModel);
		    	MemberType newElement = BEDiagramFactory.eINSTANCE.createMemberType();
				newElement.setName("field" + be.getMember().size());
				newElement.setType(BEDiagramFactory.eINSTANCE.createStringType());
				be.getMember().add(selfIndex + 1, newElement);
				
				// update ui.
				PreferencesHint preferencesHint = new PreferencesHint("2003");
				BediagramViewProvider viewProvider = new BediagramViewProvider();
				Node node = viewProvider.createBENodeMemberType_2003(newElement, 
						((View) parent.getModel()), be.getMember().size(), 
						true, preferencesHint);
				((View) parent.getModel()).insertChildAt(node, selfIndex + 1);
				
		    }
		});
	}
	
	public static void up(final BEMemberTypeEditPart self, final EditPart parent) {
		BEMemberTypeEditPart upSibling = null;
		List<EditPart> children = parent.getChildren();
		if (children.size() <= 1) {
			return;
		}
		for (int i=0; i<children.size(); i++) {
			if (children.get(i) == self) {
				if (i == 0) {
					return;
				}
				upSibling = (BEMemberTypeEditPart)children.get(i-1);
				break;
			}
		}
		if (upSibling == null) {
			return;
		}
		
		final MemberType selfModel = self.getMemberType();
		final MemberType upSiblingModel = upSibling.getMemberType();
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	BusinessEntityType be = (BusinessEntityType)selfModel.eContainer();
		    	int siblingIndex = be.getMember().indexOf(upSiblingModel);
		    	be.getMember().move(siblingIndex, selfModel);
		    	
		    	EditPart compartment = self.getParent();
				ViewUtil.repositionChildAt((View) compartment.getModel(),
						(View) self.getModel(), siblingIndex);
				compartment.refresh();
		    }
		});
	}
	
	public static void down(final BEMemberTypeEditPart self, final EditPart parent) {
		BEMemberTypeEditPart downSibling = null;
		List<EditPart> children = parent.getChildren();
		if (children.size() <= 1) {
			return;
		}
		for (int i=0; i<children.size(); i++) {
			if (children.get(i) == self) {
				if (i == children.size()-1) {
					return;
				}
				downSibling = (BEMemberTypeEditPart)children.get(i+1);
				break;
			}
		}
		if (downSibling == null) {
			return;
		}
		
		final MemberType selfModel = self.getMemberType();
		final MemberType downSiblingModel = downSibling.getMemberType();
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	BusinessEntityType be = (BusinessEntityType)selfModel.eContainer();
		    	int siblingIndex = be.getMember().indexOf(downSiblingModel);
		    	be.getMember().move(siblingIndex, selfModel);
		    	
		    	EditPart compartment = self.getParent();
				ViewUtil.repositionChildAt((View) compartment.getModel(),
						(View) self.getModel(), siblingIndex);
				compartment.refresh();
		    }
		});
	}
}
