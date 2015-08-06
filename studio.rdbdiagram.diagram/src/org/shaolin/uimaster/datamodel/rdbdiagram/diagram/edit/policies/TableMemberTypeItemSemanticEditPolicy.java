package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies;

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
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberContainerEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts.TableMemberTypeEditPart;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers.RdbdiagramElementTypes;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers.RdbdiagramViewProvider;

/**
 * @generated
 */
public class TableMemberTypeItemSemanticEditPolicy extends
		RdbdiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TableMemberTypeItemSemanticEditPolicy() {
		super(RdbdiagramElementTypes.TableType_ColumnType_4002);
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

	public static void addColumn(final TableMemberContainerEditPart editPart) {
		TransactionalEditingDomain domain = editPart.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	ColumnType newElement = RDBDiagramFactory.eINSTANCE.createColumnType();
				newElement.setName("COLUMN" + editPart.getTableNode().getColumn().size());
				newElement.setType(TypeType.VARCHAR);
				editPart.getTableNode().getColumn().add(newElement);
				
				// update ui.
				PreferencesHint preferencesHint = new PreferencesHint("4002");
				RdbdiagramViewProvider viewProvider = new RdbdiagramViewProvider();
				viewProvider.createTableColumnType_4002(newElement, 
						((View) editPart.getModel()), true, preferencesHint);
		    }
		});
	}
	
	public static void insert(final TableMemberTypeEditPart self, final EditPart parent) {
		final ColumnType selfModel = self.getColumnType();
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	TableType table = (TableType)selfModel.eContainer();
		    	int selfIndex = table.getColumn().indexOf(selfModel);
		    	ColumnType newElement = RDBDiagramFactory.eINSTANCE.createColumnType();
		    	newElement.setName("COLUMN" + table.getColumn().size());
				newElement.setType(TypeType.VARCHAR);
				table.getColumn().add(selfIndex + 1, newElement);
				
				// update ui.
				PreferencesHint preferencesHint = new PreferencesHint("4002");
				RdbdiagramViewProvider viewProvider = new RdbdiagramViewProvider();
				Node node = viewProvider.createTableColumnType_4002(newElement, 
						((View) parent.getModel()), table.getColumn().size(), 
						true, preferencesHint);
				((View) parent.getModel()).insertChildAt(node, selfIndex + 1);
				
		    }
		});
	}
	
	public static void up(final TableMemberTypeEditPart self, final EditPart parent) {
		TableMemberTypeEditPart upSibling = null;
		List<EditPart> children = parent.getChildren();
		if (children.size() <= 1) {
			return;
		}
		for (int i=0; i<children.size(); i++) {
			if (children.get(i) == self) {
				if (i == 0) {
					return;
				}
				upSibling = (TableMemberTypeEditPart)children.get(i-1);
				break;
			}
		}
		if (upSibling == null) {
			return;
		}
		
		final ColumnType selfModel = self.getColumnType();
		final ColumnType upSiblingModel = upSibling.getColumnType();
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	TableType table = (TableType)selfModel.eContainer();
		    	int siblingIndex = table.getColumn().indexOf(upSiblingModel);
		    	table.getColumn().move(siblingIndex, selfModel);
		    	
		    	EditPart compartment = self.getParent();
				ViewUtil.repositionChildAt((View) compartment.getModel(),
						(View) self.getModel(), siblingIndex);
				compartment.refresh();
		    }
		});
	}
	
	public static void down(final TableMemberTypeEditPart self, final EditPart parent) {
		TableMemberTypeEditPart downSibling = null;
		List<EditPart> children = parent.getChildren();
		if (children.size() <= 1) {
			return;
		}
		for (int i=0; i<children.size(); i++) {
			if (children.get(i) == self) {
				if (i == children.size()-1) {
					return;
				}
				downSibling = (TableMemberTypeEditPart)children.get(i+1);
				break;
			}
		}
		if (downSibling == null) {
			return;
		}
		
		final ColumnType selfModel = self.getColumnType();
		final ColumnType downSiblingModel = downSibling.getColumnType();
		TransactionalEditingDomain domain = self.getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	TableType table = (TableType)selfModel.eContainer();
		    	int siblingIndex = table.getColumn().indexOf(downSiblingModel);
		    	table.getColumn().move(siblingIndex, selfModel);
		    	
		    	EditPart compartment = self.getParent();
				ViewUtil.repositionChildAt((View) compartment.getModel(),
						(View) self.getModel(), siblingIndex);
				compartment.refresh();
		    }
		});
	}
}
