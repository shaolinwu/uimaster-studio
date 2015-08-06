package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ActionEvent;
import org.eclipse.draw2d.ActionListener;
import org.eclipse.draw2d.CheckBox;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editpolicies.ContainerEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.ObjectRefType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BENameTypeDirectEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.BENodeTypeItemSemanticEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies.FieldCompartmentEditPolicy;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;

/**
 * @generated
 */
public class BENodeTypeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;
	
	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected BENodeTypeFigure primaryShape;

	private int fieldCount;
	
	/**
	 * @generated
	 */
	public BENodeTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BENodeTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.CONTAINER_ROLE, 
				createContainerEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new BENameTypeDirectEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, 
				new FieldCompartmentEditPolicy(
						BEDiagramPackage.Literals.BUSINESS_ENTITY_TYPE__MEMBER));
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

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		BusinessEntityType impl = getBENode();
		fieldCount = impl.getMember().size();
		primaryShape = new BENodeTypeFigure(impl);
		return primaryShape;
	}

	public BusinessEntityType getBENode() {
		BusinessEntityType impl = null;
		Shape model = ((Shape) getModel());
		impl = (BusinessEntityType)model.getElement();
		
		return impl;
	}

	public int increaseFieldId(){
		return fieldCount++;
	}
	
	/**
	 * @generated
	 */
	public IFigure getPrimaryShape() {
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
		
		figure.setTransparency(80);
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
	
	public void setEntityName(String value) {
		primaryShape.setEntityName(value);
	}

	@Override
	public void setSelected(int value) {
		super.setSelected(value);
		if(value != SELECTED_NONE) {
			//setBackgroundColor(ColorConstants.lightGreen);
		} else {
			//setBackgroundColor(ColorConstants.white);
		}
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

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof org.eclipse.draw2d.Shape) {
			((org.eclipse.draw2d.Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof org.eclipse.draw2d.Shape) {
			((org.eclipse.draw2d.Shape) primaryShape).setLineStyle(style);
		}
	}
	
	protected void setFontColor(Color color) {
		primaryShape.getFigureNodeTypeEntityNameFigure().setForegroundColor(color);
		primaryShape.getHistoryFigure().setForegroundColor(color);
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
				this.setEntityName(event.getNewStringValue());
				return;
			} 
		} else if (feature instanceof EReference) {
			EReference ref = (EReference)feature;
			if (!"targetEdges".equals(ref.getName())) {
				BEMemberContainerEditPart container = null;
				List<AbstractEditPart> children = this.getChildren();
				for (AbstractEditPart ep : children) {
					if (ep instanceof BEMemberContainerEditPart) {
						container = (BEMemberContainerEditPart)ep;
						break;
					}
					
				}
				List<BEMemberTypeEditPart> children1 = container.getChildren();
				for (BEMemberTypeEditPart child: children1) {
					child.refreshItem();
				}
			}
		}
		super.handleNotificationEvent(event);
	}
	
	/**
	 * @see org.eclipse.gef.EditPart#activate()
	 */
	public void activate() {
		super.activate();
		this.getViewer().addSelectionChangedListener(new ISelectionChangedListener(){
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				primaryShape.clearSelected();
			}
		});
	}
	
	/**
	 * @see org.eclipse.gef.EditPart#deactivate()
	 */
	public void deactivate() {
		super.deactivate();
	}
	
	protected DirectEditManager manager;
	
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_DIRECT_EDIT
				&& primaryShape.isSelectedEntityName()) {
			if (manager == null) {
				Label l = primaryShape.getFigureNodeTypeEntityNameFigure();
				manager = new BENodeDirectEditManager(this, TextCellEditor.class,
						new LabelCellEditorLocator(l), l);
			}
			manager.show();
		} else {
			super.performRequest(request);
		}
	}
	
	
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(BediagramElementTypes.BEExtConnectionType_2005);
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
			types.add(BediagramElementTypes.BEExtConnectionType_2005);
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
		if (relationshipType == BediagramElementTypes.BEExtConnectionType_2005) {
			types.add(BediagramElementTypes.BENodeType_2002);
		} else if (relationshipType == BediagramElementTypes.OaOAssociationType_2006
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(BediagramElementTypes.BEExtConnectionType_2005);
		types.add(BediagramElementTypes.OaOAssociationType_2006);
		types.add(BediagramElementTypes.BEListAssociationType_2007);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == BediagramElementTypes.BEExtConnectionType_2005) {
			types.add(BediagramElementTypes.BENodeType_2002);
		} else if (relationshipType == BediagramElementTypes.OaOAssociationType_2006
				|| relationshipType == BediagramElementTypes.BEListAssociationType_2007) {
			types.add(BediagramElementTypes.BENodeType_MemberType_2003);
		}
		return types;
	}
	
	public class BENodeTypeFigure extends RoundedRectangle {
		
		private Label entityNameFigure;
		
		private CheckBox needsHistoryFigure;
		
		private final Panel headPanel;
		
		private final Panel toolPanel;
		
		private final Panel fieldPanel;

		private Label selectedField = null;
		
		private final BusinessEntityType entity;
		
		/**
		 * @generated
		 */
		public BENodeTypeFigure(BusinessEntityType impl) {
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
			this.setForegroundColor(ColorConstants.black);
			
			headPanel = new Panel();
			headPanel.setBorder(new LineBorder(1));
			headPanel.setLayoutManager(createGridLayout());
			headPanel.setForegroundColor(ColorConstants.blue);
			this.add(headPanel, createHeaderPanelConstraint(20));
			
			toolPanel = new Panel();
			toolPanel.setBorder(new LineBorder(1));
			toolPanel.setLayoutManager(createGridLayout());
			toolPanel.setForegroundColor(ColorConstants.blue);
			this.add(toolPanel, createHeaderPanelConstraint(20));
			
			fieldPanel = new Panel();
			fieldPanel.setLayoutManager(new ConstrainedToolbarLayout());
			fieldPanel.setBackgroundColor(ColorConstants.lightBlue);
			fieldPanel.setForegroundColor(ColorConstants.black);
			this.add(fieldPanel, createFieldPanelConstraint());
			
			createContents();
		}

		private GridData createHeaderPanelConstraint(int minHeight) {
			GridData constraintHeadPanel = new GridData();
			constraintHeadPanel.verticalAlignment = GridData.VERTICAL_ALIGN_BEGINNING;
			constraintHeadPanel.horizontalAlignment = GridData.FILL;
			constraintHeadPanel.horizontalIndent = 0;
			constraintHeadPanel.horizontalSpan = 1;
			constraintHeadPanel.verticalSpan = 0;
			constraintHeadPanel.heightHint = minHeight;
			constraintHeadPanel.grabExcessHorizontalSpace = false;
			constraintHeadPanel.grabExcessVerticalSpace = false;
			return constraintHeadPanel;
		}
		
		private GridData createFieldPanelConstraint() {
			GridData constraintHeadPanel = new GridData();
			constraintHeadPanel.verticalAlignment = GridData.VERTICAL_ALIGN_BEGINNING;
			constraintHeadPanel.horizontalAlignment = GridData.FILL;
			constraintHeadPanel.horizontalIndent = 0;
			constraintHeadPanel.horizontalSpan = 1;
			constraintHeadPanel.verticalSpan = 5;
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

		public void retrieve() {
			entity.setEntityName(entityNameFigure.getText());
		}

		public void setup() {
			entityNameFigure.setText(entity.getEntityName());
			needsHistoryFigure.setSelected(entity.isNeedHistory());
		}
		
		/**
		 * @generated
		 */
		private void createContents() {
			entityNameFigure = new Label(BediagramElementTypes.getImage(
					BediagramElementTypes.BENodeType_2002));
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
			headPanel.add(entityNameFigure, createPanelConstraint());

			needsHistoryFigure = new CheckBox("History");
			needsHistoryFigure.setToolTip(new Label("Support History Table."));
			needsHistoryFigure.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent event) {
					TransactionalEditingDomain domain = getEditingDomain();
					domain.getCommandStack().execute(new RecordingCommand(domain) {
					    @Override
					    protected void doExecute() {
					    	getBENode().setNeedHistory(needsHistoryFigure.isSelected());
					    }
					});
				}
			});
			toolPanel.add(needsHistoryFigure, createLayoutConstraint());
			
			this.setup();
		}
		
		private void createConnections() {
			ObjectRefType parentObject = getBENode().getParentObject();
			if (parentObject != null) {
				if (parentObject instanceof BEObjRefType) {
					String beEntity = ((BEObjRefType)parentObject)
							.getTargetEntity().getEntityName();
					PolylineConnection connection = new PolylineConnection();
					connection.setSourceAnchor(new ChopboxAnchor(primaryShape));
					connection.setTargetAnchor(new ChopboxAnchor(primaryShape));
				} else if (parentObject instanceof JavaObjRefType) {
					//No need to support.
				}
			}
		}
		
		public Panel getFieldPanel() {
			return fieldPanel;
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
		
		protected void fillShape1(Graphics graphics) {
			// Backup the graphics colors
			Color bgColor = graphics.getBackgroundColor();
			Color fgColor = graphics.getForegroundColor();
			// Set the graphics color
			graphics.setBackgroundColor(ColorConstants.blue);
			graphics.setForegroundColor(getBackgroundColor());
			// Restore the original colors
			graphics.fillGradient(getBounds(), true);
			graphics.setBackgroundColor(bgColor);
			graphics.setForegroundColor(fgColor);
		}
		
		public boolean isSelectedEntityName() {
			return selectedField == this.entityNameFigure;
		}
		
		public Label getFigureNodeTypeEntityNameFigure() {
			return entityNameFigure;
		}
		
		public void setEntityName(String value){
			this.entityNameFigure.setText(value);
		}

		public CheckBox getHistoryFigure() {
			return needsHistoryFigure;
		}
		
	}
}
