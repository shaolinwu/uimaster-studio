package org.shaolin.uimaster.datamodel.rdbdiagram.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.shaolin.uimaster.datamodel.bediagram.impl.BEListTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.BEMapTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.BEObjRefTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.BESetTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.BinaryTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.BooleanTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.CEObjRefTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.DateTimeTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.DoubleTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.FileTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.IntTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.JavaObjRefTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.LongTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.StringTypeImpl;
import org.shaolin.uimaster.datamodel.bediagram.impl.TimeTypeImpl;
import org.shaolin.uimaster.datamodel.rdbdiagram.RDBDiagramPackage;
import org.shaolin.uimaster.datamodel.rdbdiagram.TypeType;
import org.shaolin.uimaster.datamodel.rdbdiagram.impl.FieldMappingTypeImpl;
import org.shaolin.uimaster.datamodel.rdbdiagram.impl.ListFieldMappingTypeImpl;

public class RDBTypeConverter {

	public final static List<String> MappingTYPES = new ArrayList<String>();
	
	public final static Map<String, EClass> MappingMap = new HashMap<String, EClass>();
	
	
	/**
	 * default mapping
	 */
	public final static Map<Class<?>, TypeType> TYPES = new HashMap<Class<?>, TypeType>();
	
	static {
		TYPES.put(IntTypeImpl.class, TypeType.INTEGER);
		TYPES.put(LongTypeImpl.class, TypeType.BIGINT);
		TYPES.put(StringTypeImpl.class, TypeType.VARCHAR);
		TYPES.put(BinaryTypeImpl.class, TypeType.BLOB);
		TYPES.put(BooleanTypeImpl.class, TypeType.BIT);
		TYPES.put(DoubleTypeImpl.class, TypeType.DECIMAL);
		TYPES.put(DateTimeTypeImpl.class, TypeType.DATETIME);
		TYPES.put(TimeTypeImpl.class, TypeType.TIMESTAMP);
		TYPES.put(FileTypeImpl.class, TypeType.BLOB);
		TYPES.put(BEListTypeImpl.class, TypeType.BIGINT);
		TYPES.put(BESetTypeImpl.class, TypeType.BIGINT);
		TYPES.put(BEMapTypeImpl.class, TypeType.CLOB);
		TYPES.put(CEObjRefTypeImpl.class, TypeType.INTEGER);
		TYPES.put(BEObjRefTypeImpl.class, TypeType.BIGINT);
		TYPES.put(JavaObjRefTypeImpl.class, TypeType.VARCHAR);
		
		MappingTYPES.add(FieldMappingTypeImpl.class.getName());
		MappingTYPES.add(ListFieldMappingTypeImpl.class.getName());
		
		MappingMap.put(FieldMappingTypeImpl.class.getName(), 
				RDBDiagramPackage.eINSTANCE.getFieldMappingType());
		MappingMap.put(ListFieldMappingTypeImpl.class.getName(), 
				RDBDiagramPackage.eINSTANCE.getListFieldMappingType());
	}
	
	public static TypeType getColumnType(Class<?> beFieldType) {
		if ( TYPES.containsKey(beFieldType) ) {
			return TYPES.get(beFieldType);
		}
		// by default.
		return TypeType.VARCHAR;
	}
	
	public static String[] getAllTypes() {
		String[] types = new String[MappingTYPES.size()];
		MappingTYPES.toArray(types);
		return types;
	}
	
	public static EClass getMappingClass(String mappingType) {
		return MappingMap.get(mappingType);
	}
	
}
