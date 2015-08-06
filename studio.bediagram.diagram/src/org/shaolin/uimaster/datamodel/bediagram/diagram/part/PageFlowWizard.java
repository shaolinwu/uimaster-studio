package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.shaolin.uimaster.datamodel.bediagram.BECollectionType;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BinaryType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.FileType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.PageFlowWizardData.PageItem;
import org.shaolin.uimaster.datamodel.bediagram.diagram.part.PageFlowWizardData.UIFieldItem;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.EntityType;
import org.shaolin.uimaster.datamodel.common.ParamType;
import org.shaolin.uimaster.datamodel.common.TargetEntityType;
import org.shaolin.uimaster.datamodel.page.AlignType;
import org.shaolin.uimaster.datamodel.page.ClickListenerType;
import org.shaolin.uimaster.datamodel.page.ComponentConstraintType;
import org.shaolin.uimaster.datamodel.page.ComponentMappingType;
import org.shaolin.uimaster.datamodel.page.ComponentParamType;
import org.shaolin.uimaster.datamodel.page.FunctionCallType;
import org.shaolin.uimaster.datamodel.page.FunctionType;
import org.shaolin.uimaster.datamodel.page.ODMappingType;
import org.shaolin.uimaster.datamodel.page.PageFactory;
import org.shaolin.uimaster.datamodel.page.PageInType;
import org.shaolin.uimaster.datamodel.page.PageODMappingType;
import org.shaolin.uimaster.datamodel.page.PageOutType;
import org.shaolin.uimaster.datamodel.page.SimpleComponentMappingType;
import org.shaolin.uimaster.datamodel.page.StringPropertyType;
import org.shaolin.uimaster.datamodel.page.TableLayoutConstraintType;
import org.shaolin.uimaster.datamodel.page.UIButtonType;
import org.shaolin.uimaster.datamodel.page.UIComponentParamType;
import org.shaolin.uimaster.datamodel.page.UIComponentType;
import org.shaolin.uimaster.datamodel.page.UIEntityType;
import org.shaolin.uimaster.datamodel.page.UILabelType;
import org.shaolin.uimaster.datamodel.page.UIObjectListType;
import org.shaolin.uimaster.datamodel.page.UIPageType;
import org.shaolin.uimaster.datamodel.page.UIPanelType;
import org.shaolin.uimaster.datamodel.page.util.UIComponentHelper;
import org.shaolin.uimaster.datamodel.pagediagram.DisplayOutType;
import org.shaolin.uimaster.datamodel.pagediagram.NextType;
import org.shaolin.uimaster.datamodel.pagediagram.PageDiagramFactory;
import org.shaolin.uimaster.datamodel.pagediagram.PageNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.StartNodeType;
import org.shaolin.uimaster.datamodel.pagediagram.WebChunkType;
import org.shaolin.uimaster.datamodel.pagediagram.util.UITypeConvertor;

public class PageFlowWizard extends Wizard {

	protected IStructuredSelection selection;

	private final BEDiagramType modelElement;
	
	private final PageFlowWizardData data;

	public PageFlowWizard(BEDiagramType modelElement,
			IStructuredSelection selection) {
		this.modelElement = modelElement;
		this.selection = selection;
		this.data = new PageFlowWizardData();
		setWindowTitle("New Wizard");
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	@Override
	public void addPages() {
		addPage(new PageFlowWizardPage(modelElement));
		addPage(new PageFlowWizardPage2(data));
		addPage(new PageFlowWizardPage3(data));
	}

	@Override
	public boolean performFinish() {
		PageFlowWizardPage3 endPage = (PageFlowWizardPage3) this
				.getPage("wizardPage3");
		endPage.getSelectionResult();
		
		// Generate entities
		List<PageItem> pages = data.getPageItems();
		for (PageItem page: pages) {
			if (page.genUIEntity) {
				UIEntityType uientity = PageFactory.eINSTANCE.createUIEntityType();
				String packageName = modelElement.getDiagramPackage();
				packageName = packageName.substring(0, packageName.lastIndexOf('.')) + ".uientity." + page.pageName;
				uientity.setEntityName(packageName);
				
				UIPanelType rootPanel = PageFactory.eINSTANCE.createUIPanelType();
	    		rootPanel.setUIID("Form");
	    		createUIEntityForm(page, rootPanel);
	    		uientity.setBody(rootPanel);
				
				ODMappingType odMapping = PageFactory.eINSTANCE.createODMappingType();
				List<ParamType> params = data.getInputParams().get(page.pageName);
				for (ParamType param: params) {
					ParamType var = CommonFactory.eINSTANCE.createParamType();
					odMapping.getDataEntity().add(var);
					var.setName(param.getName());
					var.setCategory(param.getCategory());
					TargetEntityType refBE = CommonFactory.eINSTANCE.createTargetEntityType();
					refBE.setEntityName(param.getType().getEntityName());
					var.setType(refBE);
					var.setScope(param.getScope());
				}
				//UI parameters?
				addODMapping(page, odMapping.getComponentMapping());
				
				odMapping.setDataToUIMappingOperation(CommonFactory.eINSTANCE.createExpressionType());
				odMapping.setUIToDataMappingOperation(CommonFactory.eINSTANCE.createExpressionType());
				odMapping.getDataToUIMappingOperation().setExpressionString("{\n\n}");
				odMapping.getUIToDataMappingOperation().setExpressionString("{\n\n}");
				
				uientity.setMapping(odMapping);

				createPage(uientity);
			}
		}
		
		// Generate pages
		for (PageItem page: pages) {
			if (page.genSearchPage) {
				UIPageType uipage = PageFactory.eINSTANCE.createUIPageType();
				String packageName = modelElement.getDiagramPackage();
				packageName = packageName.substring(0, packageName.lastIndexOf('.')) + ".page." + page.pageName;
				uipage.setEntityName(packageName);
				
				createPageForm(page, uipage);
				
				PageODMappingType odMappingType = PageFactory.eINSTANCE.createPageODMappingType();
				uipage.setODMapping(odMappingType);
				List<ParamType> params = data.getInputParams().get(page.pageName);
				for (ParamType param: params) {
					ParamType var = CommonFactory.eINSTANCE.createParamType();
					odMappingType.getDataEntity().add(var);
					var.setName(param.getName());
					var.setCategory(param.getCategory());
					TargetEntityType refBE = CommonFactory.eINSTANCE.createTargetEntityType();
					refBE.setEntityName(param.getType().getEntityName());
					var.setType(refBE);
					var.setScope(param.getScope());
				}
				addODMapping(page, odMappingType.getComponentMapping());
				
				PageInType pageIn = PageFactory.eINSTANCE.createPageInType();
				pageIn.setServerOperation(CommonFactory.eINSTANCE.createExpressionType());
				pageIn.getServerOperation().setExpressionString("{\n\n}");
				uipage.setIn(pageIn);
				
				PageOutType defaultOut = PageFactory.eINSTANCE.createPageOutType();
				defaultOut.setName("DefaultOut");
				defaultOut.setServerOperation(CommonFactory.eINSTANCE.createExpressionType());
				defaultOut.getServerOperation().setExpressionString("{\n\n}");
				uipage.getOut().add(defaultOut);
				
				createPage(uipage);
			}
		}
		
		// Generate flow
		WebChunkType webChunk = PageDiagramFactory.eINSTANCE.createWebChunkType();
		String packageName = modelElement.getDiagramPackage();
		packageName = packageName.substring(0, packageName.lastIndexOf('.')) + ".diagram." + data.getFlowName();
		webChunk.setEntityName(packageName);
		
		// add start node
		StartNodeType startNode = PageDiagramFactory.eINSTANCE.createStartNodeType();
		startNode.setName("Start");
		webChunk.getWebNode().add(startNode);
		
		boolean startFlag = false;
		for (PageItem page: pages) {
			// add page node.
			if (!page.genSearchPage) {
				continue;
			}
			PageNodeType pageNode = PageDiagramFactory.eINSTANCE.createPageNodeType();
			pageNode.setName(page.pageName);
			TargetEntityType refBE = CommonFactory.eINSTANCE.createTargetEntityType();
			refBE.setEntityName(page.beName);
			pageNode.setSourceEntity(refBE);
			
			if (!startFlag) {
				startFlag = true;
				DisplayOutType out = PageDiagramFactory.eINSTANCE.createDisplayOutType();
				NextType next = PageDiagramFactory.eINSTANCE.createNextType();
				next.setDestNode(pageNode.getName());
				out.setName("StartToPage");
				out.setNext(next);
				startNode.getOut().add(out);
			}
			webChunk.getWebNode().add(pageNode);
		}
		
		createPageFlow(webChunk);
		
		return true;
	}

	private void createPageForm(PageItem page, UIPageType uipage) {
		UIEntityType uiEntity = PageFactory.eINSTANCE.createUIEntityType();
		UIPanelType rootPanel = PageFactory.eINSTANCE.createUIPanelType();
		rootPanel.setUIID("Form");
		
		// add search criteria
		int row = 0;
		int col = 0;
		UIPanelType searchPanel = PageFactory.eINSTANCE.createUIPanelType();
		searchPanel.setUIID("searchPanel");
		BusinessEntityType beEntity = data.getBeEntity(page.beName);
		EList<MemberType> members = beEntity.getMember();		
		for (MemberType member: members) {
			if (member.getType() instanceof BECollectionType
					|| member.getType() instanceof BinaryType
					|| member.getType() instanceof FileType
					|| member.getType() instanceof BEObjRefType) {
				continue;
			}
			UIFieldItem fieldItem = data.getUifield(page.beVarName+"."+member.getName());
			if (fieldItem == null) {
				continue;
			}
			
			UIComponentType uiComponent = UITypeConvertor.createUIComponent(fieldItem.uiType);
			uiComponent.setUIID(fieldItem.uiid);
			searchPanel.getComponent().add(uiComponent);
			
			ComponentConstraintType cc = PageFactory.eINSTANCE.createComponentConstraintType();
			TableLayoutConstraintType c = PageFactory.eINSTANCE.createTableLayoutConstraintType();
			c.setX(row);
			c.setY(col);
			c.setAlign(AlignType.FULL);
			cc.setConstraint(c);
			cc.setComponentId(fieldItem.uiid);
			searchPanel.getLayoutConstraint().add(cc);
			
			if (++col > 3) {
				row ++;
				col = 0;
			}
		}
		// add search button.
		FunctionType function = PageFactory.eINSTANCE.createFunctionType();
		FunctionCallType funcCall = PageFactory.eINSTANCE.createFunctionCallType();
		ClickListenerType click = PageFactory.eINSTANCE.createClickListenerType();
		UIButtonType searchButton = PageFactory.eINSTANCE.createUIButtonType();
		StringPropertyType text = PageFactory.eINSTANCE.createStringPropertyType();
		text.setValue("Search");
		searchButton.setText(text);
		funcCall.setFunctionName("Search");
		click.setHandler(funcCall);
		function.setFunctionName("Search");
		function.getOps();//TODO:
		function.getVars();
		searchButton.getEventListener().add(click);
		uiEntity.getEventHandler().add(function);
		UIComponentHelper.createLayout(searchPanel, row + 1, 4);
		
		// add result table.
		UIPanelType resultPanel = PageFactory.eINSTANCE.createUIPanelType();
		resultPanel.setUIID("resultPanel");
		UIObjectListType uiTable = PageFactory.eINSTANCE.createUIObjectListType();
		uiTable.setUIID(page.beVarName + "UITable");
		//TODO: more details in table widget.
		resultPanel.getComponent().add(uiTable);
		UIComponentHelper.createLayout(resultPanel, 1, 1);
		
		rootPanel.getComponent().add(searchPanel);
		rootPanel.getComponent().add(resultPanel);
		
		ComponentConstraintType ccSearchPanel = PageFactory.eINSTANCE.createComponentConstraintType();
		TableLayoutConstraintType cSearchPanel = PageFactory.eINSTANCE.createTableLayoutConstraintType();
		cSearchPanel.setX(0);
		cSearchPanel.setY(0);
		cSearchPanel.setAlign(AlignType.FULL);
		ccSearchPanel.setConstraint(cSearchPanel);
		ccSearchPanel.setComponentId(searchPanel.getUIID());
		rootPanel.getLayoutConstraint().add(ccSearchPanel);
		
		ComponentConstraintType ccResultPanel = PageFactory.eINSTANCE.createComponentConstraintType();
		TableLayoutConstraintType cResultPanel = PageFactory.eINSTANCE.createTableLayoutConstraintType();
		cResultPanel.setX(0);
		cResultPanel.setY(1);
		cResultPanel.setAlign(AlignType.FULL);
		ccResultPanel.setConstraint(cResultPanel);
		ccResultPanel.setComponentId(resultPanel.getUIID());
		rootPanel.getLayoutConstraint().add(ccResultPanel);
		
		UIComponentHelper.createLayout(rootPanel, 2, 1);
		
		uiEntity.setBody(rootPanel);
		uipage.setUIEntity(uiEntity);
	}

	/**
	 * Create ui components n*2 matrix.
	 * 
	 * @param page
	 * @param parent
	 */
	private void createUIEntityForm(PageItem page, UIPanelType parent) {
		int row = 0;
		int col = 2;
		List<UIFieldItem> uiFields = data.getUifields();
		for (UIFieldItem field: uiFields) {
			if(field.befield.startsWith(page.beVarName + '.')) {
				// my field.
				UILabelType uiLabel = PageFactory.eINSTANCE.createUILabelType();
				StringPropertyType text = PageFactory.eINSTANCE.createStringPropertyType();
				text.setValue(field.uidesc);
				uiLabel.setText(text);
				uiLabel.setUIID(field.uiid + "Label");
				parent.getComponent().add(uiLabel);
				
				UIComponentType uiComponent = UITypeConvertor.createUIComponent(field.uiType);
				uiComponent.setUIID(field.uiid);
				parent.getComponent().add(uiComponent);
				
				ComponentConstraintType ccLabel = PageFactory.eINSTANCE.createComponentConstraintType();
				TableLayoutConstraintType cLabel = PageFactory.eINSTANCE.createTableLayoutConstraintType();
				cLabel.setX(row);
				cLabel.setY(0);
				cLabel.setAlign(AlignType.FULL);
				ccLabel.setConstraint(cLabel);
				ccLabel.setComponentId(field.uiid + "Label");
				parent.getLayoutConstraint().add(ccLabel);
				
				ComponentConstraintType ccValue = PageFactory.eINSTANCE.createComponentConstraintType();
				TableLayoutConstraintType cValue = PageFactory.eINSTANCE.createTableLayoutConstraintType();
				cValue.setX(row);
				cValue.setY(1);
				cValue.setAlign(AlignType.FULL);
				ccValue.setConstraint(cValue);
				ccValue.setComponentId(field.uiid);
				parent.getLayoutConstraint().add(ccValue);
				row ++;
			}
		}
		// create layout
		UIComponentHelper.createLayout(parent, row, col);
	}
	
	private void addODMapping(PageItem page, EList<ComponentMappingType> list) {
		int count = 0;
		List<UIFieldItem> uiFields = data.getUifields();
		for (UIFieldItem filed: uiFields) {
			if(filed.befield.startsWith(page.beVarName + '.')) {
				SimpleComponentMappingType scm = PageFactory.eINSTANCE.createSimpleComponentMappingType();
				TargetEntityType t = CommonFactory.eINSTANCE.createTargetEntityType();
				t.setEntityName(filed.odType);
				scm.setMappingRule(t);
				scm.setName("simpleMapping"+ count++);
				
				UIComponentParamType uiParam = PageFactory.eINSTANCE.createUIComponentParamType();
				uiParam.setParamName("UIComponent");
				uiParam.setComponentPath(filed.uiid);
				scm.getUIComponent().add(uiParam);
				
				ComponentParamType dataParam = PageFactory.eINSTANCE.createComponentParamType();
				dataParam.setParamName("Value");//TODO
				dataParam.setComponentPath(filed.befield);
				scm.getDataComponent().add(dataParam);
				
				list.add(scm);
			}
		}
	}
	
	private boolean createPage(final EntityType uipage) {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		String name = uipage.getEntityName().replace('.', '/');
		BediagramDiagramEditor editor = ((BediagramDiagramEditor)page.getActiveEditor());
		IFile beDiagramFile = ((FileEditorInput)editor.getEditorInput()).getFile();
		String projectName = beDiagramFile.getProject().getName();
		String destPath = "/" + projectName + "/entities/" + name + ".page";
		URI modelURI = URI.createPlatformResourceURI(destPath, true);
		
		return linkToPageResource(modelURI, uipage);
	}
	
	private boolean linkToPageResource(final URI modelURI, final EntityType entity) {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				createPageResource(modelURI, entity);
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						"Creation Problems", null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				BediagramDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return true;
	}
	
	private boolean createPageFlow(final WebChunkType diagram) {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		BediagramDiagramEditor editor = ((BediagramDiagramEditor)page.getActiveEditor());
		IFile beDiagramFile = ((FileEditorInput)editor.getEditorInput()).getFile();
		String projectName = beDiagramFile.getProject().getName();
		String relativePath = beDiagramFile.getProjectRelativePath().toString();
		relativePath = relativePath.substring(0, relativePath.lastIndexOf('/') + 1);
		String name = diagram.getEntityName().replace('.', '/');
		String currentPath = "/" + projectName + "/entities/" + name;
		final URI diagramURI = URI.createPlatformResourceURI(currentPath + ".pagediagram_diagram", true);
		final URI modelURI = URI.createPlatformResourceURI(currentPath + ".pagediagram", true);
		
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				Resource resource = createPageFlowDiagram(diagramURI, modelURI, diagram);
				openDiagram(resource);
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						"Creation Problems", null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				BediagramDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return true;
	}
	
	private Resource createPageFlowDiagram(URI diagramURI, URI modelURI,
			final WebChunkType model) {
		
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		editingDomain.getResourceSet();
		
		progressMonitor.beginTask("Creating diagram and model files", 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final Resource modelResource = editingDomain.getResourceSet()
				.createResource(modelURI);
		final String diagramName = diagramURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "Creating diagram and model",
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				attachModelToResource(model, modelResource);

				Diagram diagram = ViewService.createDiagram(model,
						"Pagediagram",
						new PreferencesHint("studio.pagediagram.diagram"));
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}

				try {
					modelResource.save(getSaveOptions());
					diagramResource.save(getSaveOptions());
				} catch (IOException e) {
					BediagramDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			BediagramDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		setCharset(WorkspaceSynchronizer.getFile(modelResource));
		setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		return diagramResource;
	}
	
	private Resource createPageResource(URI modelURI, final EntityType model) {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		editingDomain.getResourceSet();
		
		progressMonitor.beginTask("Creating diagram and model files", 3);
		final Resource modelResource = editingDomain.getResourceSet()
				.createResource(modelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "Creating diagram and model",
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				attachModelToResource(model, modelResource);

				Diagram diagram = ViewService.createDiagram(model,
						"pagediagram",
						new PreferencesHint("studio.pagediagram.diagram"));
				if (diagram != null) {
					diagram.setElement(model);
				}

				try {
					modelResource.save(getSaveOptions());
				} catch (IOException e) {
					BediagramDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			BediagramDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		setCharset(WorkspaceSynchronizer.getFile(modelResource));
		return modelResource;
	}
	
	private void attachModelToResource(EntityType model,
			Resource resource) {
		org.shaolin.uimaster.datamodel.page.DocumentRoot docRoot = 
				PageFactory.eINSTANCE.createDocumentRoot();
		if (model instanceof UIPageType) {
			docRoot.setUIPage((UIPageType) model);
		} else {
			docRoot.setUIEntity((UIEntityType) model);
		}
		resource.getContents().add(docRoot);
	}
	
	private void attachModelToResource(WebChunkType model,
			Resource resource) {
		org.shaolin.uimaster.datamodel.pagediagram.DocumentRoot docRoot 
			= PageDiagramFactory.eINSTANCE.createDocumentRoot();
		docRoot.setWebChunk(model);
		resource.getContents().add(docRoot);
	}
	
	public static void setCharset(IFile file) {
		if (file == null) {
			return;
		}
//		try {
//			file.setCharset("UTF-8", new NullProgressMonitor());
//		} catch (CoreException e) {
//			BediagramDiagramEditorPlugin.getInstance().logError(
//					"Unable to set charset for file " + file.getFullPath(), e);
//		}
	}
	
	public static Map<String, Object> getSaveOptions() {
		HashMap<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		return saveOptions;
	}

	public static boolean openDiagram(Resource diagram)
			throws PartInitException {
		String path = diagram.getURI().toPlatformString(true);
		IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(path));
		if (workspaceResource instanceof IFile) {
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			return null != page
					.openEditor(
							new FileEditorInput((IFile) workspaceResource),
							"org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorID");
		}
		return false;
	}
}
