/*******************************************************************************
 * Copyright (c) 2003, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies;

import java.util.Collections;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.bediagram.util.BETypeConvertor;

/**
 * EditPolicy for the direct editing of Activity names.
 * 
 * @author Daniel Lee
 */
public class BEFieldTypeDirectEditPolicy extends DirectEditPolicy {

	/**
	 * @see DirectEditPolicy#getDirectEditCommand(org.eclipse.gef.requests.DirectEditRequest)
	 */
	protected Command getDirectEditCommand(DirectEditRequest request) {
		final BEMemberTypeEditPart.FieldTypeEditPart host = 
				(BEMemberTypeEditPart.FieldTypeEditPart) getHost();
		final String index = String.valueOf(request.getCellEditor().getValue());
		final String value = BEMemberTypeEditPart.getTypeByIndex(index);
		
		AbstractTransactionalCommand command = 
				new AbstractTransactionalCommand(TransactionUtil
		        .getEditingDomain(host.getMemberType0()), 
		        request.getType().toString(), Collections.EMPTY_LIST) {
		    @Override
		    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
		    	BEType type = (BEType)BEDiagramFactory.eINSTANCE.create(
		    			BETypeConvertor.TYPES.get(value));
		    	MemberType source = host.getMemberType0();
		    	source.setType(type);
		    	
		    	//update ui.
		    	host.setFieldType0(value);
		    	
		        return CommandResult.newOKCommandResult();
		    }
		};
		
		return new ICommandProxy(command);
	}

	/**
	 * @see DirectEditPolicy#showCurrentEditValue(org.eclipse.gef.requests.DirectEditRequest)
	 */
	protected void showCurrentEditValue(DirectEditRequest request) {
		String index = (String) request.getCellEditor().getValue();
		String value = BEMemberTypeEditPart.getTypeByIndex(index);
//		BENodeMemberTypeEditPart editPart = (BENodeMemberTypeEditPart)this.getHost();
//		editPart.setFieldType(value);
		// hack to prevent async layout from placing the cell editor twice.
		// getHostFigure().getUpdateManager().performUpdate();
	}

}
