package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.ConstantEntityType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.CENameTypeDirectEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.CENodeTypeItemSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.FieldCompartmentEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;

/**
 * @generated
 */
public class CENodeTypeEditPart extends ShapeNodeEditPart {

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
	protected CENodeTypeFigure primaryShape;

	/**
	 * @generated
	 */
	public CENodeTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CENodeTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new CENameTypeDirectEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, 
				new FieldCompartmentEditPolicy(
						BEDiagramPackage.Literals.CONSTANT_ENTITY_TYPE__CONSTANT_VALUE));
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		ConstantEntityType impl = getCENode();
		
		return primaryShape = new CENodeTypeFigure(impl);
	}

	public ConstantEntityType getCENode() {
		Object model = getModel();
		ConstantEntityType impl = null;
		if (model instanceof org.eclipse.gmf.runtime.notation.Shape) {
			impl = (ConstantEntityType) ((org.eclipse.gmf.runtime.notation.Shape) getModel())
					.getElement();
		}
		return impl;
	}

	/**
	 * @generated
	 */
	public RoundedRectangle getPrimaryShape() {
		return primaryShape;
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
	
	@Override
	public void setSelected(int value) {
		super.setSelected(value);
//		if(value != SELECTED_NONE) {
//			setBackgroundColor(ColorConstants.lightGreen);
//		} else {
//			setBackgroundColor(ColorConstants.white);
//		}
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
		primaryShape.getEntityNameFigure().setForegroundColor(color);
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
			// bug fixed!
			cc.add(new Command() {
				public void execute() {
					((ReconnectRequest) _request).getConnectionEditPart().refresh();
				}
			});
			//ConnectionEndpointTracker
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
				primaryShape.getEntityNameFigure().setText(
						event.getNewStringValue());
				return;
			}
		}
		super.handleNotificationEvent(event);
	}
	
	public void activate() {
		super.activate();
		this.getViewer().addSelectionChangedListener(new ISelectionChangedListener(){
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				primaryShape.clearSelected();
			}
		});
	}
	
	protected DirectEditManager manager1;
	
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			if (primaryShape.isSelectedEntityName()) {
				if (manager1 == null) {
					Label l = primaryShape.getEntityNameFigure();
					manager1 = new BENodeDirectEditManager(this, 
							TextCellEditor.class, new LabelCellEditorLocator(l), l);
				}
				manager1.show();
			}
		} else {
			super.performRequest(request);
		}
	}
	
	/**
	 * @generated
	 */
	public class CENodeTypeFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private Label entityNameFigure;

		private final Panel headPanel;
		
		private final Panel fieldPanel;
		
		private Label selectedField = null;
		
		private final ConstantEntityType entity;
		
		/**
		 * @generated
		 */
		public CENodeTypeFigure(ConstantEntityType impl) {
			this.entity = impl;
			
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
			
			GridLayout layoutThis2 = new GridLayout();
			layoutThis2.numColumns = 1;
			layoutThis2.makeColumnsEqualWidth = true;
			layoutThis2.horizontalSpacing = 0;
			layoutThis2.verticalSpacing = 0;
			layoutThis2.marginWidth = 0;
			layoutThis2.marginHeight = 0;
			
			headPanel = new Panel();
			headPanel.setBorder(new LineBorder(2));
			headPanel.setForegroundColor(ColorConstants.lightGreen);
			headPanel.setLayoutManager(layoutThis2);
			
			fieldPanel = new Panel();
			fieldPanel.setLayoutManager(new ConstrainedToolbarLayout());
			fieldPanel.setBackgroundColor(ColorConstants.lightGreen);
			fieldPanel.setForegroundColor(ColorConstants.black);
			
			GridData constraintHeadPanel = new GridData();
			constraintHeadPanel.verticalAlignment = GridData.VERTICAL_ALIGN_BEGINNING;
			constraintHeadPanel.horizontalAlignment = GridData.FILL;
			constraintHeadPanel.horizontalIndent = 0;
			constraintHeadPanel.horizontalSpan = 1;
			constraintHeadPanel.verticalSpan = 1;
			constraintHeadPanel.heightHint = 20;
			constraintHeadPanel.grabExcessHorizontalSpace = true;
			constraintHeadPanel.grabExcessVerticalSpace = true;
			this.add(headPanel, constraintHeadPanel);
			
			GridData constraintFieldPanel = new GridData();
			constraintFieldPanel.verticalAlignment = GridData.BEGINNING;
			constraintFieldPanel.horizontalAlignment = GridData.FILL;
			constraintFieldPanel.horizontalIndent = 0;
			constraintFieldPanel.horizontalSpan = 1;
			constraintFieldPanel.verticalSpan = 1;
			constraintFieldPanel.grabExcessHorizontalSpace = true;
			constraintFieldPanel.grabExcessVerticalSpace = true;
			this.add(fieldPanel, constraintFieldPanel);

			createContents();
			setup();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			entityNameFigure = new Label(BediagramElementTypes.getImage(
					BediagramElementTypes.CENodeType_2001));
			entityNameFigure.setCursor(Display.getDefault()
					.getSystemCursor(SWT.CURSOR_HAND));
			entityNameFigure.addMouseListener(new MouseListener() {
				@Override
				public void mousePressed(MouseEvent me) {
					if (me.getSource() instanceof Label) {
						setSelected((Label) me.getSource());
					}
				}
				@Override
				public void mouseReleased(MouseEvent me) {
				}
				@Override
				public void mouseDoubleClicked(MouseEvent me) {
				}
			});
			GridData constraintFFigureNodeTypeEntityNameFigure = new GridData();
			constraintFFigureNodeTypeEntityNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureNodeTypeEntityNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureNodeTypeEntityNameFigure.horizontalIndent = 0;
			constraintFFigureNodeTypeEntityNameFigure.horizontalSpan = 1;
			constraintFFigureNodeTypeEntityNameFigure.verticalSpan = 1;
			constraintFFigureNodeTypeEntityNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureNodeTypeEntityNameFigure.grabExcessVerticalSpace = true;
			headPanel.add(entityNameFigure,
					constraintFFigureNodeTypeEntityNameFigure);
			
		}
		
		public void setup() {
			entityNameFigure.setText(entity.getEntityName());
		}
		
		public void clearSelected() {
			if (selectedField != null) {
				selectedField.getParent().setBackgroundColor(null);
				selectedField = null;
			}
		}
		
		public void setSelected(Label l) {
			clearSelected();
			selectedField = l;
		}
		
		
		public boolean isSelectedEntityName() {
			return selectedField == this.entityNameFigure;
		}

		/**
		 * @generated
		 */
		public Label getEntityNameFigure() {
			return entityNameFigure;
		}

		public Panel getFieldPanel() {
			return fieldPanel;
		}
	}
	
}
