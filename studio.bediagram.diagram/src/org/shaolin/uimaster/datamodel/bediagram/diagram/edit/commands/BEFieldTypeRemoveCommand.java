package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;

/**
 * @generated
 */
public class BEFieldTypeRemoveCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public BEFieldTypeRemoveCommand(DestroyElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		
		DestroyElementRequest destroyElementRequest = (DestroyElementRequest) getRequest();
		BusinessEntityType owner = (BusinessEntityType) destroyElementRequest.getContainer();
		owner.getMember().remove(destroyElementRequest.getElementToDestroy());

		return CommandResult.newOKCommandResult(owner);
	}

}
