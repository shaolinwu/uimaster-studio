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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType;
import org.shaolin.uimaster.datamodel.bediagram.ConstantValueType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.CEMemberTypeEditPart;

/**
 * EditPolicy for the direct editing of Activity names.
 * 
 * @author Daniel Lee
 */
public class CEFieldNameDirectEditPolicy extends DirectEditPolicy {

	/**
	 * @see DirectEditPolicy#getDirectEditCommand(org.eclipse.gef.requests.DirectEditRequest)
	 */
	protected Command getDirectEditCommand(DirectEditRequest request) {
		final CEMemberTypeEditPart host = (CEMemberTypeEditPart) getHost();
		final String value = (String) request.getCellEditor().getValue();
		final boolean selectedIntValue;
		if (host.getFieldLabel() == host.getSelectedLabel()) {
			selectedIntValue = false;
		} else {
			selectedIntValue = true;
		}
		
		AbstractTransactionalCommand command = 
				new AbstractTransactionalCommand(TransactionUtil
		        .getEditingDomain(host.getConstantValue()), 
		        request.getType().toString(), Collections.EMPTY_LIST) {
		    @Override
		    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
		    	ConstantEntityType ce = (ConstantEntityType)host.getConstantValue().eContainer();
		    	EList<ConstantValueType> list = ce.getConstantValue();
		    	for (ConstantValueType item: list) {
		    		if (selectedIntValue) {
		    			if (item.getIntValue() == Integer.valueOf(value)){
		    				return CommandResult.newErrorCommandResult("Int value "+value+" has already existed!");
		    			}
			    	} else {
			    		if (item.getValue().equals(value)){
			    			return CommandResult.newErrorCommandResult("Value "+value+" has already existed!");
		    			}
			    	}
		    	}
		    	
		    	ConstantValueType source = host.getConstantValue();
		    	if (selectedIntValue) {
		    		source.setIntValue(Integer.valueOf(value));
		    	} else {
		    		source.setValue(value);
		    	}
		        return CommandResult.newOKCommandResult();
		    }
		};
		
		return new ICommandProxy(command);
	}

	/**
	 * @see DirectEditPolicy#showCurrentEditValue(org.eclipse.gef.requests.DirectEditRequest)
	 */
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
		CEMemberTypeEditPart editPart = (CEMemberTypeEditPart)this.getHost();
		//editPart.getSelectedLabel().setText(value);
		// hack to prevent async layout from placing the cell editor twice.
		// getHostFigure().getUpdateManager().performUpdate();
	}

}
