package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

/**
 * @generated
 */
public class BediagramNewDiagramFileWizard extends org.eclipse.jface.wizard.Wizard {

	/**
 * @generated
 */
	private 
org.eclipse.ui.dialogs.WizardNewFileCreationPage myFileCreationPage;

	/**
 * @generated
 */
	private org.shaolin.uimaster.datamodel.bediagram.diagram.part.ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
 * @generated
 */
	private org.eclipse.emf.transaction.TransactionalEditingDomain myEditingDomain;

	/**
 * @generated
 */
	public BediagramNewDiagramFileWizard(org.eclipse.emf.common.util.URI domainModelURI,
			org.eclipse.emf.ecore.EObject diagramRoot,
			org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
	    assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
	    assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new 
org.eclipse.ui.dialogs.WizardNewFileCreationPage(org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_CreationPageName, org.eclipse.jface.viewers.StructuredSelection.EMPTY);
		myFileCreationPage.setTitle(org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(org.eclipse.osgi.util.NLS.bind(
				org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_CreationPageDescription, 
				org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart.MODEL_ID));
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
		myFileCreationPage.setFileName(org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorUtil.getUniqueFileName(
				filePath, fileName, "bediagram_diagram"));  //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage.setTitle(org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage.setDescription(org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_RootSelectionPageDescription);
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
		java.util.LinkedList/*[org.eclipse.core.resources.IFile]*/ affectedFiles = new java.util.LinkedList/*[org.eclipse.core.resources.IFile]*/();
				org.eclipse.core.resources.IFile diagramFile = myFileCreationPage.createNewFile();
		org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorUtil.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		org.eclipse.emf.common.util.URI diagramModelURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final org.eclipse.emf.ecore.resource.Resource diagramResource = resourceSet.createResource(diagramModelURI);
		org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand command =
			new org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand(
				myEditingDomain, org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_InitDiagramCommand, affectedFiles) {

			protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(
					org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info)
						throws org.eclipse.core.commands.ExecutionException {
				int diagramVID = org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramVisualIDRegistry.getDiagramVisualID(diagramRootElementSelectionPage.getModelElement());
				if (diagramVID != org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart.VISUAL_ID) {
					return org.eclipse.gmf.runtime.common.core.command.CommandResult.newErrorCommandResult(
						org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_IncorrectRootError);
				}
				org.eclipse.gmf.runtime.notation.Diagram diagram =
					org.eclipse.gmf.runtime.diagram.core.services.ViewService.createDiagram(
						diagramRootElementSelectionPage.getModelElement(), org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart.MODEL_ID,
						org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
												return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();
			}
		};
		try {
			org.eclipse.core.commands.operations.OperationHistoryFactory.getOperationHistory().execute(
				command, new org.eclipse.core.runtime.NullProgressMonitor(), null);
			diagramResource.save(org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorUtil.getSaveOptions());
			org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorUtil.openDiagram(diagramResource);
		} catch (org.eclipse.core.commands.ExecutionException e) {
			org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorPlugin.getInstance().logError(
				"Unable to create model and diagram", e);  //$NON-NLS-1$
		} catch (java.io.IOException ex) {
			org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorPlugin.getInstance().logError(
				"Save operation failed for: " + diagramModelURI, ex);  //$NON-NLS-1$
		} catch (org.eclipse.ui.PartInitException ex) {
			org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorPlugin.getInstance().logError(
				"Unable to open editor", ex);  //$NON-NLS-1$
		}			
		return true;
	}

	/**
 * @generated
 */
	private static class DiagramRootElementSelectionPage extends org.shaolin.uimaster.datamodel.bediagram.diagram.part.ModelElementSelectionPage {

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
			return org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
 * @generated
 */
		protected boolean validatePage() {
			if (selectedModelElement == null) {
				setErrorMessage(org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().provides(
				new org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation(
					new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(selectedModelElement),
					org.shaolin.uimaster.datamodel.bediagram.diagram.edit.parts.BEDiagramTypeEditPart.MODEL_ID, org.shaolin.uimaster.datamodel.bediagram.diagram.part.BediagramDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null : org.shaolin.uimaster.datamodel.bediagram.diagram.part.Messages.BediagramNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
