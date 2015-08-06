package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;

/**
 * @generated
 */
public class BEConnectionItemSemanticEditPolicy extends
	BediagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BEConnectionItemSemanticEditPolicy() {
		super(BediagramElementTypes.BEExtConnectionType_2005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
