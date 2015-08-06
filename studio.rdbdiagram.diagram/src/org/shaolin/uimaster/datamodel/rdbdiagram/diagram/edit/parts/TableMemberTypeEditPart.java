package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts;

import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.label.ILabelDelegate;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.CellEditorEx;
import org.eclipse.gmf.tooling.runtime.directedit.ComboDirectEditManager;
import org.eclipse.gmf.tooling.runtime.directedit.locator.LabelCellEditorLocator;
import org.eclipse.gmf.tooling.runtime.draw2d.labels.SimpleLabelDelegate;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.shaolin.uimaster.datamodel.rdbdiagram.ColumnType;
import org.shaolin.uimaster.datamodel.rdbdiagram.FKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.PKType;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.TableMemberNameDirectEditPolicy;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.TableMemberTypeDirectEditPolicy;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.TableMemberTypeItemSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers.RdbdiagramElementTypes;

/**
 * @generated
 */
public class TableMemberTypeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;
	
	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected TableMemberTypeFigure primaryShape;
	
	/**
	 * @generated
	 */
	public TableMemberTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TableMemberTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new TableMemberNameDirectEditPolicy());
	}

	public ColumnType getColumnType() {
		Object model = getModel();
		ColumnType impl = null;
		if (model instanceof Shape) {
			impl = (ColumnType) ((Shape) getModel())
					.getElement();
		}
		return impl;
	}
	
	@Override
	protected NodeFigure createNodeFigure() {
		IFigure shape = createNodeShape();
		contentPane = shape;
		
		NodeFigure figure = new Plate();
		figure.setLayoutManager(new StackLayout());
		figure.add(shape);
		return figure;
	}
	
	public IFigure createNodeShape() {
		primaryShape = new TableMemberTypeFigure(getColumnType());
		primaryShape.setTitleVisibility(true);
		primaryShape.setBorder(null);
		
		ConstrainedToolbarLayout layoutMgr = 
				(ConstrainedToolbarLayout) primaryShape.getLayoutManager();
		layoutMgr.setHorizontal(true);
		layoutMgr.setStretchMajorAxis(false); 
		layoutMgr.setStretchMinorAxis(false);
		layoutMgr.setSpacing(5);
		
		return primaryShape;
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	@Override
	public void setSelected(int value) {
		super.setSelected(value);
//		if (value == SELECTED_NONE) {
//			setBackgroundColor(ColorConstants.lightBlue);
//		} else {
//			setBackgroundColor(ColorConstants.white);
//		}
	}
	
	@Override
	public void setFocus(boolean value) {
		super.setFocus(value);
	}
	
	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}
	
	protected void setFontColor(Color color) {
		primaryShape.getFieldLabel().setForegroundColor(color);
		primaryShape.getTypeLabel().setForegroundColor(color);
    }
	
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshFontColor();
	}
	
	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			this.primaryShape.refreshModel();
		}
		super.handleNotificationEvent(event);
	}
	
	public void insert() {
		TableMemberTypeItemSemanticEditPolicy.insert(this, this.getParent());
	}
	
	public void up() {
		TableMemberTypeItemSemanticEditPolicy.up(this, this.getParent());
	}
	
	public void down() {
		TableMemberTypeItemSemanticEditPolicy.down(this, this.getParent());
	}
	
	public void setFieldName(String value) {
		primaryShape.getFieldLabel().setText(value);
	}
	
	public void setFieldType(String value) {
		primaryShape.getTypeLabel().setText(value);
	}
	
	public void refreshItem() {
		primaryShape.refresh();
	}

	protected ComboDirectEditManager manager;
	
	protected DirectEditManager manager1;
	
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			if (primaryShape.isSelectedLabel()) {
				if (manager1 == null) {
					Label l = primaryShape.getFieldLabel();
					manager1 = new TableNameDirectEditManager(this, 
							TextCellEditor.class, new LabelCellEditorLocator(l), l);
				}
				manager1.show();
			} else {
				if (manager == null) {
					FieldsParser parser = new FieldsParser(RDBDiagramPackage.eINSTANCE.getColumnType_Type()); 
					ListItemEditPart listItemEP = new FieldTypeEditPart(
							(EObject)this.getModel(), this.primaryShape, parser);
					listItemEP.installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
							new TableMemberTypeDirectEditPolicy());
					listItemEP.setParent(this);
					manager = new FieldTypesDEManager(listItemEP, parser);
				}
				manager.show();
			}
		} else {
			super.performRequest(request);
		}
	}
	
	private class FieldTypesDEManager extends ComboDirectEditManager {

		private final IChoiceParser choiceParser;
		
		public FieldTypesDEManager(ITextAwareEditPart source, IChoiceParser choiceParser) {
			super(source);
			this.choiceParser = choiceParser;
		}
		
		@Override
		protected CellEditor doCreateCellEditorOn(Composite composite) {
			EObject parserElement = ((IGraphicalEditPart) getEditPart()).resolveSemanticElement();
			List<String> editChoices = choiceParser.getEditChoices(new EObjectAdapter(parserElement));
			return new ComboBoxCellEditor(composite, editChoices.toArray(new String[editChoices.size()]));
		}
		
		public void setEditText(String toEdit) {
			CellEditor cellEditor = getCellEditor();
			if (cellEditor == null) {
				return;
			}

			ITextAwareEditPart textEP = (ITextAwareEditPart) getEditPart();
			textEP.setLabelText(toEdit);

			if (cellEditor instanceof CellEditorEx) {
				((CellEditorEx) cellEditor).setValueAndProcessEditOccured(toEdit);
			} else {
				cellEditor.setValue(TypeType.getByName(toEdit).getValue());
			}
		}
		
		protected boolean isDirty() {
			return true;
		}
	}
	
	public class FieldTypeEditPart extends ListItemEditPart {

		private final TableMemberTypeFigure fieldsFigure;
		
		private final FieldsParser parser;
		
		public FieldTypeEditPart(EObject model, TableMemberTypeFigure fieldsFigure, 
				FieldsParser parser) {
			super(model);
			this.fieldsFigure = fieldsFigure;
			this.parser = parser;
		}
		
		protected IFigure createFigure() {
			return fieldsFigure.getTypeLabel();
		}
		
		public IParser getParser() {
			return parser;
		}
		
		public void setFieldName0(String value) {
			setFieldName(value);
		}
		
		public void setFieldType0(String value) {
			setFieldType(value);
		}
		
		public ColumnType getColumnType0() {
			return getColumnType();
		}
		
		@Override
		protected ILabelDelegate createLabelDelegate() {
			ILabelDelegate newLabelDelegate = new SimpleLabelDelegate(fieldsFigure.getTypeLabel());
			newLabelDelegate.setTextJustification(PositionConstants.CENTER);
	        newLabelDelegate.setAlignment(PositionConstants.CENTER);
	        newLabelDelegate.setTextAlignment(PositionConstants.TOP);
	        return newLabelDelegate;
		}
	}
	
	private class FieldsParser extends EnumParser {

		public FieldsParser(EAttribute feature){
			super(feature);
		}
		
		@Override
		protected Collection getItems(EObject element) {
			return TypeType.VALUES;
		}

		@Override
		protected String getEditChoice(EObject element, Object item) {
			if (item instanceof TypeType) {
				return ((TypeType)item).getName();
			}
			return item.toString();
		}
	}
	
	class Plate extends ResizableCompartmentFigure {
		
		public Plate() {
			super("", getMapMode());
			this.setBorder(null);
		}
		
		public void setFont(Font f) {
			super.setFont(f);
			primaryShape.getTypeLabel().setFont(f);
			primaryShape.getFieldLabel().setFont(f);
		}
		
		public void setFontColor(Color c) {
			super.setForegroundColor(c);
			primaryShape.getTypeLabel().setForegroundColor(c);
			primaryShape.getFieldLabel().setForegroundColor(c);
		}
	}
	
	/**
	 * @generated
	 */
	public class TableMemberTypeFigure extends ResizableCompartmentFigure {
		
		private Label pkFigure;
		
		private Label fkFigure;
		
		private Label plusFigure;
		
		private Label fieldFigure;
		
		private Label typeFigure;
		
		private final ColumnType model;
		
		private boolean isSelectedName = true;
		
		public TableMemberTypeFigure(ColumnType impl) {
			super("", getMapMode());
			this.model = impl;

			this.createContents();
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("deprecation")
		private void createContents() {
			String typeName = model.getType().getName();
			fieldFigure = new Label(model.getName());
			typeFigure = new Label(typeName);
			fieldFigure.addMouseListener(new MouseListener() {
				@Override
				public void mousePressed(MouseEvent me) {
					isSelectedName = true;
				}
				@Override
				public void mouseReleased(MouseEvent me) {
				}
				@Override
				public void mouseDoubleClicked(MouseEvent me) {
				}
			});
			typeFigure.addMouseListener(new MouseListener() {
				@Override
				public void mousePressed(MouseEvent me) {
					isSelectedName = false;
				}
				@Override
				public void mouseReleased(MouseEvent me) {
				}
				@Override
				public void mouseDoubleClicked(MouseEvent me) {
				}
			});
			pkFigure = new Label(RdbdiagramElementTypes.getImage(
					RdbdiagramElementTypes.PKType_4005));
			fkFigure = new Label(RdbdiagramElementTypes.getImage(
					RdbdiagramElementTypes.FKType_4001));
			plusFigure = new Label("+");
			this.add(pkFigure);
			this.add(fkFigure);
			this.add(plusFigure);
			
			refresh();
			
			this.add(fieldFigure);
			this.add(new Label(" : "));
			this.add(typeFigure);
		}
		
		public void refresh() {
			if (isPrimaryKey()) {
				pkFigure.setVisible(true);
				fkFigure.setVisible(false);
				plusFigure.setVisible(false);
			} else if (isForeignKey()) {
				pkFigure.setVisible(false);
				fkFigure.setVisible(true);
				plusFigure.setVisible(false);
			} else {
				pkFigure.setVisible(false);
				fkFigure.setVisible(false);
				plusFigure.setVisible(true);
			}
		}
		
		public boolean isPrimaryKey() {
			TableType table = (TableType) model.eContainer();
			EList<PKType> pks = table.getPrimaryKey();
			for (PKType pk : pks) {
				if (pk.getColumnName() != null
						&& pk.getColumnName().equals(model.getName())) {
					return true;
				}
			}
			return false;
		}
		
		public boolean isForeignKey() {
			TableType table = (TableType) model.eContainer();
			EList<FKType> fks = table.getForeignKey();
			for (FKType fk : fks) {
				if (fk.getName() != null
						&& fk.getName().equals(model.getName())) {
					return true;
				}
			}
			return false;
		}
		
		public void refreshModel() {
			fieldFigure.setText(model.getName());
			typeFigure.setText(model.getType().getName());
		}
		
		public Label getFieldLabel() {
			return fieldFigure;
		}
		
		public Label getTypeLabel() {
			return typeFigure;
		}
		
		public boolean isSelectedLabel() {
			return isSelectedName;
		}

	}
	
}
