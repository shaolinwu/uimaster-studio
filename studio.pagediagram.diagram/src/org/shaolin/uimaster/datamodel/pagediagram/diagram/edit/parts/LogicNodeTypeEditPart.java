package org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.shaolin.uimaster.datamodel.pagediagram.LogicNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.policies.LogicNodeTypeItemSemanticEditPolicy;

/**
 * @generated
 */
public class LogicNodeTypeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected LogicNodeTypeFigure primaryShape;

	/**
	 * @generated
	 */
	public LogicNodeTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LogicNodeTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new LogicNodeTypeFigure(getLogicNode());
	}

	/**
	 * @generated
	 */
	public LogicNodeTypeFigure getPrimaryShape() {
		return (LogicNodeTypeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	public LogicNodeType getLogicNode() {
		LogicNodeType impl = null;
		Shape model = ((Shape) getModel());
		impl = (LogicNodeType)model.getElement();
		
		return impl;
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
			EAttribute attr = (EAttribute)feature;
			if ("name".equals(attr.getName())){
				primaryShape.setName(event.getNewStringValue());
				return;
			}
		}
		super.handleNotificationEvent(event);
	}
	
	/**
	 * @generated
	 */
	public class LogicNodeTypeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLogicNodeTypeNameFigure;

		private final LogicNodeType model;
		
		/**
		 * @generated
		 */
		public LogicNodeTypeFigure(LogicNodeType model) {
			this.model = model;
			
			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);
			
			this.setLayoutManager(layoutThis);
			
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			fFigureLogicNodeTypeNameFigure = new WrappingLabel();
			fFigureLogicNodeTypeNameFigure.setText(model.getName());

			this.add(fFigureLogicNodeTypeNameFigure);
		}
		
		public void setName(String name) {
			fFigureLogicNodeTypeNameFigure.setText(name);
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLogicNodeTypeNameFigure() {
			return fFigureLogicNodeTypeNameFigure;
		}

	}

}
