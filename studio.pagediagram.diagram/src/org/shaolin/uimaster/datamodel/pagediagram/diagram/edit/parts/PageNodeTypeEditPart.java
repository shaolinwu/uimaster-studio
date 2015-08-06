package org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
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
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.pagediagram.PageNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.policies.PageNodeTypeItemSemanticEditPolicy;

/**
 * @generated
 */
public class PageNodeTypeEditPart extends ShapeNodeEditPart {

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
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PageNodeTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PageNodeTypeItemSemanticEditPolicy());
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
		return primaryShape = new PageNodeTypeFigure(getPageNode());
	}

	/**
	 * @generated
	 */
	public PageNodeTypeFigure getPrimaryShape() {
		return (PageNodeTypeFigure) primaryShape;
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
	
	public PageNodeType getPageNode() {
		PageNodeType impl = null;
		Shape model = ((Shape) getModel());
		impl = (PageNodeType)model.getElement();
		
		return impl;
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

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof RoundedRectangle) {
			((RoundedRectangle) primaryShape).setLineStyle(style);
		}
	}

	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			((PageNodeTypeFigure) primaryShape).refreshBody();
		}
		super.handleNotificationEvent(event);
	}
	
	/**
	 * @generated
	 */
	public class PageNodeTypeFigure extends RoundedRectangle {

		private Panel headPanel;
		
		private Panel fieldPanel;
		
		private final PageNodeType node;
		
		private WrappingLabel nameLabel;

		public PageNodeTypeFigure(PageNodeType node) {
			this.node = node;
			
			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 5;

			this.setLayoutManager(layoutThis);
			this.setCornerDimensions(new Dimension(10, 10));
			this.setPreferredSize(60, 40);

			createContents();
		}

		private GridData createHeaderPanelConstraint() {
			GridData constraintHeadPanel = new GridData();
			constraintHeadPanel.verticalAlignment = GridData.VERTICAL_ALIGN_BEGINNING;
			constraintHeadPanel.horizontalAlignment = GridData.FILL;
			constraintHeadPanel.horizontalIndent = 0;
			constraintHeadPanel.horizontalSpan = 1;
			constraintHeadPanel.verticalSpan = 0;
			constraintHeadPanel.grabExcessHorizontalSpace = true;
			constraintHeadPanel.grabExcessVerticalSpace = false;
			return constraintHeadPanel;
		}
		
		private GridData createFieldPanelConstraint() {
			GridData constraintHeadPanel = new GridData();
			constraintHeadPanel.verticalAlignment = GridData.VERTICAL_ALIGN_BEGINNING;
			constraintHeadPanel.horizontalAlignment = GridData.FILL;
			constraintHeadPanel.horizontalIndent = 5;
			constraintHeadPanel.horizontalSpan = 5;
			constraintHeadPanel.verticalSpan = 0;
			constraintHeadPanel.grabExcessHorizontalSpace = false;
			constraintHeadPanel.grabExcessVerticalSpace = true;
			return constraintHeadPanel;
		}
		
		private GridLayout createGridLayout() {
			GridLayout layoutThis2 = new GridLayout();
			layoutThis2.numColumns = 1;
			layoutThis2.makeColumnsEqualWidth = true;
			layoutThis2.horizontalSpacing = 0;
			layoutThis2.verticalSpacing = 0;
			layoutThis2.marginWidth = 0;
			layoutThis2.marginHeight = 0;
			return layoutThis2;
		}
		
		private GridData createPanelConstraint() {
			return createPanelConstraint(GridData.FILL, 0);
		}
		
		private GridData createPanelConstraint(int horizontalAlignment, int indent) {
			GridData constraintHeadPanel = new GridData();
			constraintHeadPanel.verticalAlignment = GridData.CENTER;
			constraintHeadPanel.horizontalAlignment = horizontalAlignment;
			constraintHeadPanel.horizontalIndent = indent;
			constraintHeadPanel.horizontalSpan = 1;
			constraintHeadPanel.verticalSpan = 1;
			constraintHeadPanel.grabExcessHorizontalSpace = true;
			constraintHeadPanel.grabExcessVerticalSpace = true;
			return constraintHeadPanel;
		}
		
		/**
		 * @generated
		 */
		private void createContents() {
			headPanel = new Panel();
			headPanel.setBorder(new LineBorder(1));
			headPanel.setLayoutManager(createGridLayout());
			headPanel.setBackgroundColor(ColorConstants.orange);
			this.add(headPanel, createHeaderPanelConstraint());
			
			nameLabel = new WrappingLabel();
			nameLabel.setText(node.getName());
			headPanel.add(nameLabel, createPanelConstraint());
			
			Label inputInfo = new Label("Input Variables: ");
			this.add(inputInfo, createPanelConstraint(GridData.BEGINNING, 5));
			
			fieldPanel = new Panel();
			fieldPanel.setLayoutManager(createGridLayout());
			fieldPanel.setBorder(new LineBorder(1));
			this.add(fieldPanel, createFieldPanelConstraint());
			
			EList<ParamType> params = node.getVariables();
			for (ParamType p: params) {
				String info = p.getName() +" : "+ p.getCategory().getLiteral();
				WrappingLabel var = new WrappingLabel(info);
				fieldPanel.add(var, createPanelConstraint());
			}
		}

		public void refreshBody() {
			nameLabel.setText(node.getName());
			fieldPanel.removeAll();
			
			EList<ParamType> params = node.getVariables();
			for (ParamType p: params) {
				String info = p.getName() +" : "+ p.getCategory().getLiteral();
				WrappingLabel var = new WrappingLabel(info);
				fieldPanel.add(var, createPanelConstraint());
			}
		}
		
		/**
		 * @generated
		 */
		public WrappingLabel getFigurePageNodeTypeNameFigure() {
			return nameLabel;
		}

	}

}
