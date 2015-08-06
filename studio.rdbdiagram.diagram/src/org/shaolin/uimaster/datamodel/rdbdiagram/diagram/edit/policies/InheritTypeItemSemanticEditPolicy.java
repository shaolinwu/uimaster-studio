package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies;

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
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers.RdbdiagramElementTypes;

/**
 * @generated
 */
public class InheritTypeItemSemanticEditPolicy extends
		RdbdiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InheritTypeItemSemanticEditPolicy() {
		super(RdbdiagramElementTypes.TableType_Inherit_4004);
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
		    	TableType diagram = (TableType)obj.eContainer();
		    	diagram.setInheritAsscociation(null);
		    	
		    	getHost().setSelected(EditPart.SELECTED_NONE);
		    	ViewUtil.destroy(link);
		    	
		        return CommandResult.newOKCommandResult();
		    }
		};
		return new ICommandProxy(command);
	}

}
