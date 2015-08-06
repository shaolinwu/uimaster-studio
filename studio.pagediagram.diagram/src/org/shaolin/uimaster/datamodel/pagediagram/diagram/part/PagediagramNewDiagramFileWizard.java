package org.shaolin.uimaster.datamodel.pagediagram.diagram.part;

/**
 * @generated
 */
public class PagediagramNewDiagramFileWizard extends org.eclipse.jface.wizard.Wizard {

	/**
 * @generated
 */
	private 
org.eclipse.ui.dialogs.WizardNewFileCreationPage myFileCreationPage;

	/**
 * @generated
 */
	private org.shaolin.uimaster.datamodel.pagediagram.diagram.part.ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
 * @generated
 */
	private org.eclipse.emf.transaction.TransactionalEditingDomain myEditingDomain;

	/**
 * @generated
 */
	public PagediagramNewDiagramFileWizard(org.eclipse.emf.common.util.URI domainModelURI,
			org.eclipse.emf.ecore.EObject diagramRoot,
			org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
	    assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
	    assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new 
org.eclipse.ui.dialogs.WizardNewFileCreationPage(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_CreationPageName, org.eclipse.jface.viewers.StructuredSelection.EMPTY);
		myFileCreationPage.setTitle(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(org.eclipse.osgi.util.NLS.bind(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_CreationPageDescription, 
				org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID));
		org.eclipse.core.runtime.IPath filePath;
		String fileName = org.eclipse.emf.common.util.URI.decode(domainModelURI.trimFileExtension().lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new org.eclipse.core.runtime.Path(domainModelURI.trimSegments(1).toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new org.eclipse.core.runtime.Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException("Unsupported URI: " + domainModelURI);  //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorUtil.getUniqueFileName(
				filePath, fileName, "pagediagram_diagram"));  //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage.setTitle(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage.setDescription(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

	   	myEditingDomain = editingDomain;
	}

	/**
 * @generated
 */
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	/**
 * @generated
 */
	public boolean performFinish() {
		java.util.LinkedList<org.eclipse.core.resources.IFile> affectedFiles = new java.util.LinkedList<org.eclipse.core.resources.IFile>();
				org.eclipse.core.resources.IFile diagramFile = myFileCreationPage.createNewFile();
		org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorUtil.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		org.eclipse.emf.common.util.URI diagramModelURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final org.eclipse.emf.ecore.resource.Resource diagramResource = resourceSet.createResource(diagramModelURI);
		org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand command =
			new org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand(
				myEditingDomain, org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_InitDiagramCommand, affectedFiles) {

			protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(
					org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info)
						throws org.eclipse.core.commands.ExecutionException {
				int diagramVID = org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramVisualIDRegistry.getDiagramVisualID(diagramRootElementSelectionPage.getModelElement());
				if (diagramVID != org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.VISUAL_ID) {
					return org.eclipse.gmf.runtime.common.core.command.CommandResult.newErrorCommandResult(
						org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_IncorrectRootError);
				}
				org.eclipse.gmf.runtime.notation.Diagram diagram =
					org.eclipse.gmf.runtime.diagram.core.services.ViewService.createDiagram(
						diagramRootElementSelectionPage.getModelElement(), org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID,
						org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
												return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();
			}
		};
		try {
			org.eclipse.core.commands.operations.OperationHistoryFactory.getOperationHistory().execute(
				command, new org.eclipse.core.runtime.NullProgressMonitor(), null);
			diagramResource.save(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorUtil.getSaveOptions());
			org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorUtil.openDiagram(diagramResource);
		} catch (org.eclipse.core.commands.ExecutionException e) {
			org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin.getInstance().logError(
				"Unable to create model and diagram", e);  //$NON-NLS-1$
		} catch (java.io.IOException ex) {
			org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin.getInstance().logError(
				"Save operation failed for: " + diagramModelURI, ex);  //$NON-NLS-1$
		} catch (org.eclipse.ui.PartInitException ex) {
			org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin.getInstance().logError(
				"Unable to open editor", ex);  //$NON-NLS-1$
		}			
		return true;
	}

	/**
 * @generated
 */
	private static class DiagramRootElementSelectionPage extends org.shaolin.uimaster.datamodel.pagediagram.diagram.part.ModelElementSelectionPage {

		/**
 * @generated
 */
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
 * @generated
 */
		protected String getSelectionTitle() {
			return org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
 * @generated
 */
		protected boolean validatePage() {
			if (selectedModelElement == null) {
				setErrorMessage(org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().provides(
				new org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation(
					new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(selectedModelElement),
					org.shaolin.uimaster.datamodel.pagediagram.diagram.edit.parts.WebChunkTypeEditPart.MODEL_ID, org.shaolin.uimaster.datamodel.pagediagram.diagram.part.PagediagramDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null : org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PagediagramNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
