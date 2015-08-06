package org.shaolin.uimaster.datamodel.pagediagram.diagram.part;

/**
 * @generated
 */
public class PagediagramPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(org.eclipse.gef.palette.PaletteRoot paletteRoot) {
		paletteRoot.add(createPagediagram1Group());
	}

	/**
	 * Creates "pagediagram" palette tool group
	 * 
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createPagediagram1Group() {
		org.eclipse.gef.palette.PaletteGroup paletteContainer = new org.eclipse.gef.palette.PaletteGroup(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.Pagediagram1Group_title);
		paletteContainer.setId("createPagediagram1Group"); //$NON-NLS-1$
		paletteContainer.add(createStartNodeType7CreationTool());
		paletteContainer.add(createLogicNodeType5CreationTool());
		paletteContainer.add(createPageNodeType6CreationTool());
		paletteContainer.add(createDisplayNodeType2CreationTool());
		paletteContainer.add(createFlowNodeType4CreationTool());
		
		paletteContainer.add(createDisplayOutType3CreationTool());
		paletteContainer.add(createConditionalOutType1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createConditionalOutType1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.ConditionalOutType1CreationTool_title,
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.ConditionalOutType1CreationTool_desc,
				java.util.Collections
						.singletonList(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.ConditionalOutType_4001));
		entry.setId("createConditionalOutType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
				.getImageDescriptor(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.ConditionalOutType_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createDisplayNodeType2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.DisplayNodeType2CreationTool_title,
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.DisplayNodeType2CreationTool_desc,
				java.util.Collections
						.singletonList(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.DisplayNodeType_2002));
		entry.setId("createDisplayNodeType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
				.getImageDescriptor(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.DisplayNodeType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createDisplayOutType3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.DisplayOutType3CreationTool_title,
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.DisplayOutType3CreationTool_desc,
				java.util.Collections
						.singletonList(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.DisplayOutType_4002));
		entry.setId("createDisplayOutType3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
				.getImageDescriptor(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.DisplayOutType_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createFlowNodeType4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.FlowNodeType4CreationTool_title,
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.FlowNodeType4CreationTool_desc,
				java.util.Collections
						.singletonList(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.FlowNodeType_2003));
		entry.setId("createFlowNodeType4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
				.getImageDescriptor(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.FlowNodeType_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createLogicNodeType5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.LogicNodeType5CreationTool_title,
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.LogicNodeType5CreationTool_desc,
				java.util.Collections
						.singletonList(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.LogicNodeType_2005));
		entry.setId("createLogicNodeType5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
				.getImageDescriptor(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.LogicNodeType_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createPageNodeType6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PageNodeType6CreationTool_title,
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.PageNodeType6CreationTool_desc,
				java.util.Collections
				.singletonList(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.PageNodeType_2004));
		entry.setId("createPageNodeType6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
				.getImageDescriptor(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.PageNodeType_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createStartNodeType7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.StartNodeType7CreationTool_title,
				org.shaolin.uimaster.datamodel.pagediagram.diagram.part.Messages.StartNodeType7CreationTool_desc,
				java.util.Collections
				.singletonList(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.StartNodeType_2001));
		entry.setId("createStartNodeType7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes
				.getImageDescriptor(org.shaolin.uimaster.datamodel.pagediagram.diagram.providers.PagediagramElementTypes.StartNodeType_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends
			org.eclipse.gef.palette.ToolEntry {

		/**
		 * @generated
		 */
		private final java.util.List<org.eclipse.gmf.runtime.emf.type.core.IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(
				String title,
				String description,
				java.util.List<org.eclipse.gmf.runtime.emf.type.core.IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public org.eclipse.gef.Tool createTool() {
			org.eclipse.gef.Tool tool = new org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool(
					elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends
			org.eclipse.gef.palette.ToolEntry {

		/**
		 * @generated
		 */
		private final java.util.List<org.eclipse.gmf.runtime.emf.type.core.IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(
				String title,
				String description,
				java.util.List<org.eclipse.gmf.runtime.emf.type.core.IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public org.eclipse.gef.Tool createTool() {
			org.eclipse.gef.Tool tool = new org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool(
					relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
