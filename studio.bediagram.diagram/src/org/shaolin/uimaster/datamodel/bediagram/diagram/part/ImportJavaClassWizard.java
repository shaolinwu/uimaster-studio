package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.util.List;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;

public class ImportJavaClassWizard extends Wizard {

	protected IStructuredSelection selection;
	
	private final BEDiagramType modelElement;
	
	public ImportJavaClassWizard(BEDiagramType modelElement, IStructuredSelection selection) {
		this.modelElement = modelElement;
		this.selection = selection;
		setWindowTitle("Import Java Classes Wizard");
	}
	@Override
	public void addPages() {
		addPage(new ImportJavaClassWizardPage());
	}

	@Override
	public boolean performFinish() {
		ImportJavaClassWizardPage page = (ImportJavaClassWizardPage)this.getPages()[0];
		final List<BusinessEntityType> belist = page.getSelectionResult();
		
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(modelElement);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
		    @Override
		    protected void doExecute() {
		    	for (BusinessEntityType be: belist) {
		    		modelElement.getBeEntity().add(be);
		    	}
		    }
		});
		
		
		return true;
	}

}
