package org.shaolin.uimaster.datamodel.page.presentation;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.shaolin.uimaster.datamodel.page.UIEntityType;

public class UIMappingPanel extends Composite {

	private UIEntityType model;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public UIMappingPanel(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, false));

	}
	
	public void init(UIEntityType model) {
		this.model = model;
		model.getEventHandler();
		model.getReconfigurableProperty();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
