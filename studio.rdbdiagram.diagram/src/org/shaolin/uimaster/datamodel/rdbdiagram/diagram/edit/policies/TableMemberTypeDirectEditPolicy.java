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
package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies;

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
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberTypeEditPart;

/**
 * EditPolicy for the direct editing of Activity names.
 * 
 * @author Daniel Lee
 */
public class TableMemberTypeDirectEditPolicy extends DirectEditPolicy {

	/**
	 * @see DirectEditPolicy#getDirectEditCommand(org.eclipse.gef.requests.DirectEditRequest)
	 */
	protected Command getDirectEditCommand(DirectEditRequest request) {
		final TableMemberTypeEditPart.FieldTypeEditPart host = 
				(TableMemberTypeEditPart.FieldTypeEditPart) getHost();
		final String index = String.valueOf(request.getCellEditor().getValue());
		String[] items = ((ComboBoxCellEditor)request.getCellEditor()).getItems();
		final TypeType colType = TypeType.get(items[Integer.valueOf(index)]);
		
		AbstractTransactionalCommand command = 
				new AbstractTransactionalCommand(TransactionUtil
		        .getEditingDomain(host.getColumnType0()), 
		        request.getType().toString(), Collections.EMPTY_LIST) {
		    @Override
		    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
		    	ColumnType source = host.getColumnType0();
		    	source.setType(colType);
		    	
		    	//update ui.
		    	host.setFieldType0(colType.getName());
		    	
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
//		BENodeMemberTypeEditPart editPart = (BENodeMemberTypeEditPart)this.getHost();
//		editPart.setFieldType(value);
		// hack to prevent async layout from placing the cell editor twice.
		// getHostFigure().getUpdateManager().performUpdate();
	}

}
