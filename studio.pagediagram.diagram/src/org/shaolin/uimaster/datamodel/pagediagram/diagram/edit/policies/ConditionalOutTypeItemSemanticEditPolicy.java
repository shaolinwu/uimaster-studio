package org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes;

/**
 * @generated
 */
public class ConditionalOutTypeItemSemanticEditPolicy extends
		PagediagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionalOutTypeItemSemanticEditPolicy() {
		super(PagediagramElementTypes.ConditionalOutType_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
