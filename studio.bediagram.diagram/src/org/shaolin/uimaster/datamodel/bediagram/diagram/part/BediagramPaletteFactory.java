package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.shaolin.uimaster.datamodel.bediagram.diagram.providers.BediagramElementTypes;

/**
 * @generated
 */
public class BediagramPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createBediagramGroup1());
		paletteRoot.add(createBediagramGroup2());
	}

	/**
	 * Creates "bediagram" palette tool group
	 * @generated
	 */
	private PaletteContainer createBediagramGroup1() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Bediagram1Group_title1);
		paletteContainer.setId("createBediagram1Group1"); //$NON-NLS-1$
		paletteContainer.add(createBENodeType1CreationTool());
		paletteContainer.add(createCENodeType2CreationTool());
		return paletteContainer;
	}
	
	private PaletteContainer createBediagramGroup2() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Bediagram1Group_title2);
		paletteContainer.setId("createBediagram1Group2"); //$NON-NLS-1$
		paletteContainer.add(createBEInheritConnectionCreationTool());
		paletteContainer.add(createOaOAssociationCreationTool());
		paletteContainer.add(createListAssociationCreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBENodeType1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BENodeType1CreationTool_title,
				Messages.BENodeType1CreationTool_desc,
				Collections
						.singletonList(BediagramElementTypes.BENodeType_2002));
		entry.setId("createBENodeType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BediagramElementTypes
				.getImageDescriptor(BediagramElementTypes.BENodeType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	private ToolEntry createBEInheritConnectionCreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				"BE Inherit",
				"Create new extension connection from the parent BE.",
				Collections
						.singletonList(BediagramElementTypes.BEExtConnectionType_2005));
		entry.setId("createBEExtConnectionCreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BediagramElementTypes
				.getImageDescriptor(BediagramElementTypes.BEExtConnectionType_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	private ToolEntry createOaOAssociationCreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				"BE/CE Association",
				"Create new extension connection between BEs or BE/CE.",
				Collections
						.singletonList(BediagramElementTypes.OaOAssociationType_2006));
		entry.setId("createOaOAssociationCreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BediagramElementTypes
				.getImageDescriptor(BediagramElementTypes.OaOAssociationType_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	private ToolEntry createListAssociationCreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				"List Association",
				"Create new extension connection between BEs.",
				Collections
						.singletonList(BediagramElementTypes.BEListAssociationType_2007));
		entry.setId("createListAssociationCreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BediagramElementTypes
				.getImageDescriptor(BediagramElementTypes.BEListAssociationType_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	 * @generated
	 */
	private ToolEntry createCENodeType2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CENodeType2CreationTool_title,
				Messages.CENodeType2CreationTool_desc,
				Collections
						.singletonList(BediagramElementTypes.CENodeType_2001));
		entry.setId("createCENodeType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BediagramElementTypes
				.getImageDescriptor(BediagramElementTypes.CENodeType_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	private static class NodeToolEntry extends ToolEntry {

		private final List elementTypes;

		private NodeToolEntry(
				String title,
				String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
	
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(
				String title,
				String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
