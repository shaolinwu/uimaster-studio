package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.shaolin.uimaster.datamodel.bediagram.ConstantValueType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.CEFieldNameDirectEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.CEFieldTypeItemSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.CENodeTypeItemSemanticEditPolicy;

/**
 * @generated
 */
public class CEMemberTypeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;
	
	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected CENodeMemberTypeFigure primaryShape;
	
	
	/**
	 * @generated
	 */
	public CEMemberTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CEFieldTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new CEFieldNameDirectEditPolicy());
	}

	public ConstantValueType getConstantValue() {
		Object model = getModel();
		ConstantValueType impl = null;
		if (model instanceof Shape) {
			impl = (ConstantValueType) ((Shape) getModel())
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
		primaryShape = new CENodeMemberTypeFigure(getConstantValue());
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
	
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}
	
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshFontColor();
	}
	
	protected void setFontColor(Color color) {
		primaryShape.getFieldLabel().setForegroundColor(color);
		primaryShape.getIndexLabel().setForegroundColor(color);
    }
	
	
	
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			EAttribute attr = (EAttribute)feature;
			if ("value".equals(attr.getName())){
				setFieldName(event.getNewStringValue());
				return;
			}
			if ("intValue".equals(attr.getName())){
				setIndex(event.getNewStringValue());
				return;
			}
		}
		super.handleNotificationEvent(event);
	}

	public void up() {
		final CEMemberTypeEditPart self = this;
		CENodeTypeItemSemanticEditPolicy.up(self, this.getParent());
	}

	public void down() {
		final CEMemberTypeEditPart self = this;
		CENodeTypeItemSemanticEditPolicy.down(self, this.getParent());
	}

	public void insert() {
		CEMemberTypeEditPart self = this;
		CENodeTypeItemSemanticEditPolicy.insert(self, this.getParent());
	}
	
	public void setFieldName(String value) {
		primaryShape.getFieldLabel().setText(value);
	}
	
	public void setIndex(String value) {
		primaryShape.getIndexLabel().setText(value);
	}
	
	public Label getFieldLabel() {
		return primaryShape.getFieldLabel();
	}
	
	public Label getSelectedLabel() {
		return primaryShape.getSelectedLabel();
	}

	protected DirectEditManager manager1;
	
	protected DirectEditManager manager2;
	
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			if (primaryShape.hasSelectedLabel()) {
				if (manager1 == null) {
					Label l = primaryShape.getFieldLabel();
					manager1 = new BENodeDirectEditManager(this, 
							TextCellEditor.class, new LabelCellEditorLocator(l), l);
				}
				if (manager2 == null) {
					Label l = primaryShape.getIndexLabel();
					manager2 = new BENodeDirectEditManager(this, 
							TextCellEditor.class, new LabelCellEditorLocator(l), l);
				}
				
				if (primaryShape.getSelectedLabel() == primaryShape.getFieldLabel()) {
					manager1.show();
				} else {
					manager2.show();
				}
			}
		} else {
			super.performRequest(request);
		}
	}
	
	class Plate extends ResizableCompartmentFigure {
		
		public Plate() {
			super("", getMapMode());
			this.setBorder(null);
		}
		
		public void setFont(Font f) {
			super.setFont(f);
			primaryShape.getIndexLabel().setFont(f);
			primaryShape.getFieldLabel().setFont(f);
		}
		
		public void setFontColor(Color c) {
			super.setForegroundColor(c);
			primaryShape.getIndexLabel().setForegroundColor(c);
			primaryShape.getFieldLabel().setForegroundColor(c);
		}
	}
	
	/**
	 * @generated
	 */
	public class CENodeMemberTypeFigure extends ResizableCompartmentFigure {
		
		private Label fieldFigure;
		
		private Label indexFigure;
		
		private final ConstantValueType impl;
		
		private Label selectedLabel;
		
		public CENodeMemberTypeFigure(ConstantValueType impl) {
			super("", getMapMode());
			this.impl = impl;

			this.createContents();
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("deprecation")
		private void createContents() {
			indexFigure = new Label(impl.getIntValue()+"");
			fieldFigure = new Label(impl.getValue());
			fieldFigure.addMouseListener(new MouseListener() {
				@Override
				public void mousePressed(MouseEvent me) {
					selectedLabel = fieldFigure;
				}
				@Override
				public void mouseReleased(MouseEvent me) {
				}
				@Override
				public void mouseDoubleClicked(MouseEvent me) {
				}
			});
			indexFigure.addMouseListener(new MouseListener() {
				@Override
				public void mousePressed(MouseEvent me) {
					selectedLabel = indexFigure;
				}
				@Override
				public void mouseReleased(MouseEvent me) {
				}
				@Override
				public void mouseDoubleClicked(MouseEvent me) {
				}
			});
			this.addMouseListener(new MouseListener() {
				@Override
				public void mousePressed(MouseEvent me) {
					selectedLabel = null;
				}
				@Override
				public void mouseReleased(MouseEvent me) {
				}
				@Override
				public void mouseDoubleClicked(MouseEvent me) {
				}
			});
			
			this.add(new Label(" ("));
			this.add(indexFigure);
			this.add(new Label(")"));
			this.add(fieldFigure);
			this.add(new Label("  "));
		}
		
		public Label getFieldLabel() {
			return fieldFigure;
		}
		
		public Label getIndexLabel() {
			return indexFigure;
		}
		
		public boolean hasSelectedLabel() {
			return selectedLabel != null;
		}
		
		public Label getSelectedLabel() {
			return selectedLabel;
		}

	}

}
