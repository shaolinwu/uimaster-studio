package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.common.CommonFactory;
import org.shaolin.uimaster.datamodel.common.DiagramInfo;
import org.shaolin.uimaster.datamodel.rdbdiagram.ClassMappingType;
import org.shaolin.uimaster.datamodel.rdbdiagram.DocumentRoot;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramFactory;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramType;
import org.shaolin.uimaster.datamodel.rdbdiagram.TableType;

public class RDBSchemaWizard extends Wizard {

	protected IStructuredSelection selection;
	
	private final BEDiagramType modelElement;
	
	public RDBSchemaWizard(BEDiagramType modelElement, IStructuredSelection selection) {
		this.modelElement = modelElement;
		this.selection = selection;
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
		addPage(new RDBSchemaWizardPage(modelElement));
		addPage(new RDBSchemaWizardPage2());
	}

	@Override
	public boolean performFinish() {
		RDBSchemaWizardPage2 endPage = (RDBSchemaWizardPage2)this.getPage("wizardPage2");
		String rdbDiagramName = endPage.getRDBDiagramName();
		final RDBDiagramType diagram = endPage.getSelectionResult();
		String packageName = modelElement.getDiagramPackage();
		packageName = packageName.substring(0, packageName.lastIndexOf('.'));
		diagram.setDaoPackage(packageName + ".dao");
		diagram.setDiagramPackage(packageName + ".diagram." + rdbDiagramName);
		
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		BediagramDiagramEditor editor = ((BediagramDiagramEditor)page.getActiveEditor());
		IFile beDiagramFile = ((FileEditorInput)editor.getEditorInput()).getFile();
		String projectName = beDiagramFile.getProject().getName();
		String name = diagram.getDiagramPackage().replace('.', '/');
		String currentPath = "/" + projectName + "/src/main/resources/entities/" + name;

		URI uri = URI.createPlatformResourceURI(beDiagramFile.getFullPath().toString(), true);
		String bediagramPath = uri.toPlatformString(true);
		bediagramPath = bediagramPath.replace(".bediagram_diagram", ".bediagram");
		for(TableType table : diagram.getTable()) {
			ClassMappingType mapping = table.getMapping();
			DiagramInfo diagramInfo = CommonFactory.eINSTANCE.createDiagramInfo();
			mapping.getBusinessEntity().setDiagramInfo(diagramInfo);
			diagramInfo.setEntityName(modelElement.getDiagramPackage());
			diagramInfo.setLocation(bediagramPath);
		}
		
		final URI diagramURI = URI.createPlatformResourceURI(currentPath + ".rdbdiagram_diagram", true);
		final URI modelURI = URI.createPlatformResourceURI(currentPath + ".rdbdiagram", true);
		
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				Resource resource = createRBDDiagram(diagramURI, modelURI, diagram);
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
	
	/**
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 * 
	 * @generated
	 */
	public static Resource createRBDDiagram(URI diagramURI, URI modelURI,
			final RDBDiagramType model) {
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
						"Rdbdiagram",
						new PreferencesHint("studio.rdbdiagram.diagram"));
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

	public static Map<String, Object> getSaveOptions() {
		HashMap<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		return saveOptions;
	}
	
	private static void attachModelToResource(RDBDiagramType model,
			Resource resource) {
		resource.getContents().add(createDocumentRoot(model));
	}

	private static DocumentRoot createDocumentRoot(RDBDiagramType model) {
		DocumentRoot docRoot = RDBDiagramFactory.eINSTANCE.createDocumentRoot();
		docRoot.setRDBDiagram(model);
		return docRoot;
	}

	public static void setCharset(IFile file) {
		if (file == null) {
			return;
		}
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
							"org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part.RdbdiagramDiagramEditorID");
		}
		return false;
	}
	
	private static IProject getCurrentProject() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window
					.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				IProject project = (IProject) ((IAdaptable) firstElement)
						.getAdapter(IProject.class);
				IPath path = project.getFullPath();
				System.out.println(path);
				return project;
			}
		}
		return null;
	}
}
