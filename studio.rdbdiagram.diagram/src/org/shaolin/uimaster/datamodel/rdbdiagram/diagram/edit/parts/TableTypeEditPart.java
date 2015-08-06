package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.parts;

import java.util.List;

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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editpolicies.ContainerEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.edit.policies.TableTypeItemSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers.RdbdiagramElementTypes;

/**
 * @generated
 */
public class TableTypeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected TableTypeFigure primaryShape;

	/**
	 * @generated
	 */
	public TableTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TableTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.CONTAINER_ROLE, 
				createContainerEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
//		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE,
//				new NodeContainerHighlightEditPolicy());
	}

	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep
			= new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}
	
	protected ContainerEditPolicy createContainerEditPolicy() {
		ContainerEditPolicy policy = new ContainerEditPolicy() {
			@Override
			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return policy;
	}
	
	public TableType getTableNode() {
		TableType impl = null;
		Shape model = ((Shape) getModel());
		impl = (TableType)model.getElement();
		
		return impl;
	}
	
	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new TableTypeFigure(getTableNode());
	}

	/**
	 * @generated
	 */
	public TableTypeFigure getPrimaryShape() {
		return (TableTypeFigure) primaryShape;
	}

	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (childEditPart instanceof TableMemberContainerEditPart) {
			IFigure pane = this.getPrimaryShape().getFieldPanel();
			this.setupContentPane(pane);
			pane.add(((TableMemberContainerEditPart)childEditPart).getFigure());
			return;
		}
		
		super.addChildVisual(childEditPart, index);
	}
	
	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		if (childEditPart instanceof TableMemberContainerEditPart) {
			IFigure pane = this.getPrimaryShape().getFieldPanel();
			pane.remove(((TableMemberContainerEditPart)childEditPart).getFigure());
			return;
		}
		
		super.removeChildVisual(childEditPart);
	}
	
	@Override
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof TableMemberContainerEditPart) {
			return this.getPrimaryShape().getFieldPanel();
		}
		
		return this.getContentPane();
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
		return primaryShape.getFieldPanel();
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
	
	protected void setFontColor(Color color) {
		primaryShape.getFigureTableTypeEntityNameFigure().setForegroundColor(color);
    }
	
	protected void refreshVisuals() {
		super.refreshVisuals();
		// font color must be manually refreshed. shit!
		refreshFontColor();
	}
	
	public Command getCommand(final Request _request) {
		if (_request instanceof ReconnectRequest) {
			CompoundCommand cc = new CompoundCommand();
			cc.add(super.getCommand(_request));
			cc.add(new Command() {
				public void execute() {
					((ReconnectRequest) _request).getConnectionEditPart().refresh();
				}
			});
			return cc;
		} else {
			return super.getCommand(_request);
		}
	}
	
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (feature instanceof EAttribute) {
			EAttribute attr = (EAttribute)feature;
			if ("entityName".equals(attr.getName())){
				this.setEntityName(event.getNewStringValue());
				return;
			}
		} else if (feature instanceof EReference) {
			EReference ref = (EReference)feature;
			if ("primaryKey".equals(ref.getName())
					|| "foreignKey".equals(ref.getName())){
				TableMemberContainerEditPart container = null;
				List<AbstractEditPart> children = this.getChildren();
				for (AbstractEditPart ep : children) {
					if (ep instanceof TableMemberContainerEditPart) {
						container = (TableMemberContainerEditPart)ep;
						break;
					}
					
				}
				List<TableMemberTypeEditPart> children1 = container.getChildren();
				for (TableMemberTypeEditPart child: children1) {
					child.refreshItem();
				}
			}
			
		}
		super.handleNotificationEvent(event);
	}
	
	public void setEntityName(String value) {
		primaryShape.setEntityName(value);
	}
	
	/**
	 * @generated
	 */
	public class TableTypeFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private Label entityNameFigure;

		private final TableType model;
		
		private final Panel headPanel;
		
		private final Panel fieldPanel;
		
		/**
		 * @generated
		 */
		public TableTypeFigure(TableType model) {
			this.model = model;
			
			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 10;
			
			this.setLayoutManager(layoutThis);
			this.setCornerDimensions(new Dimension(10, 10));
			this.setPreferredSize(60, 40);
			
			headPanel = new Panel();
			headPanel.setBorder(new LineBorder(1));
			headPanel.setLayoutManager(createGridLayout());
			this.add(headPanel, createHeaderPanelConstraint());
			
			fieldPanel = new Panel();
			fieldPanel.setLayoutManager(new ConstrainedToolbarLayout());
			fieldPanel.setBackgroundColor(ColorConstants.lightBlue);
			fieldPanel.setForegroundColor(ColorConstants.black);
			this.add(fieldPanel, createFieldPanelConstraint());
			
			this.createContents();
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
			constraintHeadPanel.horizontalIndent = 0;
			constraintHeadPanel.horizontalSpan = 0;
			constraintHeadPanel.verticalSpan = 5;
//			constraintHeadPanel.heightHint = 80;
			constraintHeadPanel.grabExcessHorizontalSpace = true;
			constraintHeadPanel.grabExcessVerticalSpace = true;
			return constraintHeadPanel;
		}
		
		private GridData createPanelConstraint() {
			GridData constraintHeadPanel = new GridData();
			constraintHeadPanel.verticalAlignment = GridData.CENTER;
			constraintHeadPanel.horizontalAlignment = GridData.FILL;
			constraintHeadPanel.horizontalIndent = 0;
			constraintHeadPanel.horizontalSpan = 1;
			constraintHeadPanel.verticalSpan = 1;
			constraintHeadPanel.grabExcessHorizontalSpace = true;
			constraintHeadPanel.grabExcessVerticalSpace = true;
			return constraintHeadPanel;
		}

		private GridData createLayoutConstraint() {
			GridData constraint = new GridData();
			constraint.verticalAlignment = GridData.CENTER;
			constraint.horizontalAlignment = GridData.BEGINNING;
			constraint.horizontalIndent = 0;
			constraint.horizontalSpan = 1;
			constraint.verticalSpan = 1;
			constraint.grabExcessHorizontalSpace = true;
			constraint.grabExcessVerticalSpace = true;
			return constraint;
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
		
		/**
		 * @generated
		 */
		private void createContents() {
			entityNameFigure = new Label(RdbdiagramElementTypes.getImage(
					RdbdiagramElementTypes.TableType_2001));
			entityNameFigure.setText(model.getEntityName());

			headPanel.add(entityNameFigure, createPanelConstraint());

		}
		
		public void setEntityName(String value){
			this.entityNameFigure.setText(value);
		}

		/**
		 * @generated
		 */
		public Label getFigureTableTypeEntityNameFigure() {
			return entityNameFigure;
		}

		public Panel getFieldPanel() {
			return fieldPanel;
		}
		
	}

}
