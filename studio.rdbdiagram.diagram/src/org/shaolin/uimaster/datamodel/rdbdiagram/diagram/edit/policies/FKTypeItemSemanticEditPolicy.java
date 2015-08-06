package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers.RdbdiagramElementTypes;

/**
 * @generated
 */
public class FKTypeItemSemanticEditPolicy extends
		RdbdiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FKTypeItemSemanticEditPolicy() {
		super(RdbdiagramElementTypes.FKType_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
