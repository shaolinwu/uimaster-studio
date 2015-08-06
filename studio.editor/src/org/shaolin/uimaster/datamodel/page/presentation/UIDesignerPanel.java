package org.shaolin.uimaster.datamodel.page.presentation;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;

public class UIDesignerPanel extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public UIDesignerPanel(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, false));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
