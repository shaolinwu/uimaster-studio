package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.CellEditorEx;
import org.eclipse.gmf.tooling.runtime.directedit.ComboDirectEditManager;
import org.eclipse.gmf.tooling.runtime.draw2d.labels.SimpleLabelDelegate;
import org.eclipse.gmf.tooling.runtime.parsers.ChoiceParserBase;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BEFieldNameDirectEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BEFieldTypeDirectEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BEFieldTypeItemSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;
import org.shaolin.uimaster.datamodel.bediagram.util.BETypeConvertor;

/**
 * @generated
 */
public class BEMemberTypeEditPart extends ShapeNodeEditPart {

	public static final int VISUAL_ID = 2003;

	protected IFigure contentPane;
	
	protected BENodeMemberTypeFigure primaryShape;
	
	public BEMemberTypeEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BEFieldTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new BEFieldNameDirectEditPolicy());
		
	}

	public MemberType getMemberType() {
		Object model = getModel();
		MemberType impl = null;
		if (model instanceof Shape) {
			impl = (MemberType) ((Shape) getModel())
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
		primaryShape = new BENodeMemberTypeFigure(getMemberType());
		primaryShape.setTitleVisibility(false);
		primaryShape.setBorder(null);
		
		ConstrainedToolbarLayout layoutMgr = 
				(ConstrainedToolbarLayout) primaryShape.getLayoutManager();
		layoutMgr.setHorizontal(true);
		layoutMgr.setStretchMajorAxis(false); 
		layoutMgr.setStretchMinorAxis(false);
		layoutMgr.setSpacing(5);
		
		return primaryShape;
	}
	
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}
	
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}
	
	protected void setFontColor(Color color) {
		primaryShape.getFieldLabel().setForegroundColor(color);
		primaryShape.getTypeLabel().setForegroundColor(color);
    }

	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}
	
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshFontColor();
	}
	
	public void refreshItem() {
		primaryShape.refresh();
	}
	
	protected void handleNotificationEvent(Notification event) {
		if (event.getOldValue() != event.getNewValue()) {
			refreshItem();
		}
		
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			EAttribute attr = (EAttribute)feature;
			if ("name".equals(attr.getName())){
				this.setFieldName(event.getNewStringValue());
				return;
			}
		} 
		super.handleNotificationEvent(event);
	}

	public void insert() {
		BEMemberTypeEditPart self = this;
		BEFieldTypeItemSemanticEditPolicy.insert(self, this.getParent());
	}
	
	public void up() {
		final BEMemberTypeEditPart self = this;
		BEFieldTypeItemSemanticEditPolicy.up(self, this.getParent());
	}
	
	public void down() {
		final BEMemberTypeEditPart self = this;
		BEFieldTypeItemSemanticEditPolicy.down(self, this.getParent());
	}
	
	public void setFieldName(String value) {
		primaryShape.getFieldLabel().setText(value);
	}
	
	public void setFieldType(String value) {
		primaryShape.getTypeLabel().setText(value);
	}
	
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(BediagramElementTypes.OaOAssociationType_2006);
		types.add(BediagramElementTypes.BEListAssociationType_2007);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof BENodeTypeEditPart) {
			types.add(BediagramElementTypes.OaOAssociationType_2006);
			types.add(BediagramElementTypes.BEListAssociationType_2007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == BediagramElementTypes.OaOAssociationType_2006
				|| relationshipType == BediagramElementTypes.BEListAssociationType_2007) {
			types.add(BediagramElementTypes.CENodeType_2001);
			types.add(BediagramElementTypes.BENodeType_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(BediagramElementTypes.OaOAssociationType_2006);
		types.add(BediagramElementTypes.BEListAssociationType_2007);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == BediagramElementTypes.OaOAssociationType_2006
				|| relationshipType == BediagramElementTypes.BEListAssociationType_2007) {
			types.add(BediagramElementTypes.BENodeType_MemberType_2003);
		}
		return types;
	}
	

	protected ComboDirectEditManager manager;
	
	protected DirectEditManager manager1;
	
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			if (primaryShape.isSelectedLabel()) {
				if (manager1 == null) {
					Label l = primaryShape.getFieldLabel();
					manager1 = new BENodeDirectEditManager(this, 
							TextCellEditor.class, new LabelCellEditorLocator(l), l);
				}
				manager1.show();
			} else {
				if (manager == null) {
					EStructuralFeature structure = BEDiagramFactory.eINSTANCE.createStringType().eContainingFeature();
					if (getMemberType().getType() != null) {
						structure = getMemberType().getType().eContainingFeature();
					}
					FieldsParser parser = new FieldsParser(structure); 
					ListItemEditPart listItemEP = new FieldTypeEditPart(
							(EObject)this.getModel(), this.primaryShape, parser);
					listItemEP.installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
							new BEFieldTypeDirectEditPolicy());
					listItemEP.setParent(this);
					manager = new FieldTypesDEManager(listItemEP, parser);
				}
				manager.show();
			}
		} else {
			super.performRequest(request);
		}
	}
	
	public static String getTypeByIndex(String index) {
		Iterator<Entry<String, String>> i = 
				BETypeConvertor.TYPE_INDEXS.entrySet().iterator();
		while(i.hasNext()){
			Entry<String, String> entry = i.next();
			if (entry.getValue().equals(index)) {
				return entry.getKey();
			}
		}
		return null;
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
				cellEditor.setValue(Integer.valueOf(
						BETypeConvertor.TYPE_INDEXS.get(toEdit)));
			}
		}
		
		protected boolean isDirty() {
			return true;
		}
	}
	
	public class FieldTypeEditPart extends ListItemEditPart {

		private final BENodeMemberTypeFigure fieldsFigure;
		
		private final FieldsParser parser;
		
		public FieldTypeEditPart(EObject model, BENodeMemberTypeFigure fieldsFigure, 
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
		
		public MemberType getMemberType0() {
			return getMemberType();
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
	
	private class FieldsParser extends ChoiceParserBase {

		public FieldsParser(EStructuralFeature feature){
			super(feature);
		}
		
		@Override
		protected Collection getItems(EObject element) {
			return BETypeConvertor.TYPE_NAMES;
		}

		@Override
		protected String getEditChoice(EObject element, Object item) {
			if (item instanceof String) {
				return item.toString();
			}
			if (item instanceof EObject) {
				return BETypeConvertor.TYPE_CLASSES.get(item.getClass());
			}
			return null;
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
	public class BENodeMemberTypeFigure extends ResizableCompartmentFigure {
		
		private Label fieldFigure;
		
		private Label typeFigure;
		
		private Label fitFigure;
		
		private final MemberType impl;
		
		private boolean isSelectedName = true;
		
		public BENodeMemberTypeFigure(MemberType impl) {
			super("", getMapMode());
			this.impl = impl;

			this.createContents();
		}

		private void createContents() {
			String typeName = "unknown";
			if (impl.getType() != null) {
				// must not going to here.
				String className = impl.getType().getClass().getName();
				typeName = className.substring(
						className.lastIndexOf('.') + 1, 
						className.length() - 4);
			} 
			fieldFigure = new Label(impl.getName());
			typeFigure = new Label(typeName);
			fitFigure = new Label(" ");
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
			
			this.add(new Label("+"));
			this.add(fieldFigure);
			this.add(new Label(" : "));
			this.add(typeFigure);
			this.add(fitFigure);
		}
		
		public void refresh() {
			String className = impl.getType().getClass().getName();
			String typeName = className.substring(
					className.lastIndexOf('.') + 1, 
					className.length() - 4);
			fieldFigure.setText(impl.getName());
			typeFigure.setText(typeName);
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
