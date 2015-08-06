package org.shaolin.uimaster.datamodel.rdbdiagram.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.shaolin.uimaster.datamodel.rdbdiagram.diagram.providers.RdbdiagramElementTypes;

/**
 * @generated
 */
public class RdbdiagramPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createRdbdiagram1Group());
	}

	/**
	 * Creates "rdbdiagram" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createRdbdiagram1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Rdbdiagram1Group_title);
		paletteContainer.setId("createRdbdiagram1Group"); //$NON-NLS-1$
		paletteContainer.add(createTableType1CreationTool());
		//paletteContainer.add(createViewType3CreationTool());
		paletteContainer.add(createTableTypeInheritCreationTool());
		paletteContainer.add(createTableTypeJoinTableCreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTableType1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>();
		types.add(RdbdiagramElementTypes.TableType_2001);
		types.add(RdbdiagramElementTypes.TableType_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TableType1CreationTool_title,
				Messages.TableType1CreationTool_desc, types);
		entry.setId("createTableType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RdbdiagramElementTypes
				.getImageDescriptor(RdbdiagramElementTypes.TableType_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewType3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ViewType3CreationTool_title,
				Messages.ViewType3CreationTool_desc,
				Collections.singletonList(RdbdiagramElementTypes.ViewType_2002));
		entry.setId("createViewType3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RdbdiagramElementTypes
				.getImageDescriptor(RdbdiagramElementTypes.ViewType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTableTypeJoinTableCreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				"Join Tables", "Join Tables Association",
				Collections.singletonList(RdbdiagramElementTypes.TableType_JoinTable_4003));
		entry.setId("createTableTypeAssociationCreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RdbdiagramElementTypes
				.getImageDescriptor(RdbdiagramElementTypes.TableType_JoinTable_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	private ToolEntry createTableTypeInheritCreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				"Inherit", "Inherit Association",
				Collections.singletonList(RdbdiagramElementTypes.TableType_Inherit_4004));
		entry.setId("createTableTypeInheritCreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RdbdiagramElementTypes
				.getImageDescriptor(RdbdiagramElementTypes.TableType_Inherit_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
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
