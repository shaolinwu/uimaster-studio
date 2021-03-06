package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies;

import java.util.Collections;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;

/**
 * @generated
 */
public class BEListAssociationItemSemanticEditPolicy extends
	BediagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BEListAssociationItemSemanticEditPolicy() {
		super(BediagramElementTypes.BEListAssociationType_2007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		final Edge link = (Edge) getHost().getModel();
		final EObject obj = req.getElementToDestroy();
		AbstractTransactionalCommand command = 
				new AbstractTransactionalCommand(TransactionUtil
		        .getEditingDomain(obj), 
		        "delete oao link", Collections.EMPTY_LIST) {
		    @Override
		    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
		    	getHost().setSelected(EditPart.SELECTED_NONE);
		    	
		    	MemberType beType = (MemberType)obj.eContainer();
		    	beType.setType(BEDiagramFactory.eINSTANCE.createStringType());
		    	
		    	ViewUtil.destroy(link);
		    	
		        return CommandResult.newOKCommandResult();
		    }
		};
		
		return new ICommandProxy(command);
	}

}
