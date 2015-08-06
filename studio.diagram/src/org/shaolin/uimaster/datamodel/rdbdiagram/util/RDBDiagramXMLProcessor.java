/**
 */
package org.shaolin.uimaster.datamodel.rdbdiagram.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RDBDiagramXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBDiagramXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		RDBDiagramPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the RDBDiagramResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new RDBDiagramResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new RDBDiagramResourceFactoryImpl());
		}
		return registrations;
	}

} //RDBDiagramXMLProcessor
