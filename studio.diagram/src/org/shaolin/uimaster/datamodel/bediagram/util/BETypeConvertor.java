package org.shaolin.uimaster.datamodel.bediagram.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage;
import org.shaolin.uimaster.datamodel.bediagram.BEListType;
import org.shaolin.uimaster.datamodel.bediagram.BEMapType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BESetType;
import org.shaolin.uimaster.datamodel.bediagram.BEType;
import org.shaolin.uimaster.datamodel.bediagram.CEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType;
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
import org.shaolin.uimaster.datamodel.common.CommonFactory;

public class BETypeConvertor {

	public final static Map<String, EClass> TYPES = new HashMap<String, EClass>();
	
	public final static Map<Class<?>, String> TYPE_CLASSES = new HashMap<Class<?>, String>();
	
	public final static Map<String, String> TYPE_INDEXS = new HashMap<String, String>();
	
	public final static List<String> TYPE_NAMES = new ArrayList<String>();
	
	static {
		TYPE_NAMES.add("IntType");
		TYPE_NAMES.add("LongType");
		TYPE_NAMES.add("StringType");
		TYPE_NAMES.add("BinaryType");
		TYPE_NAMES.add("BooleanType");
		TYPE_NAMES.add("DoubleType");
		TYPE_NAMES.add("DateTimeType");
		TYPE_NAMES.add("TimeType");
		TYPE_NAMES.add("FileType");
		TYPE_NAMES.add("BEListType");
		TYPE_NAMES.add("BEMapType");
		TYPE_NAMES.add("BESetType");
		TYPE_NAMES.add("CEObjRefType");
		TYPE_NAMES.add("BEObjRefType");
		TYPE_NAMES.add("JavaObjRefType");
		
		TYPES.put("IntType", BEDiagramPackage.Literals.INT_TYPE);
		TYPES.put("LongType", BEDiagramPackage.Literals.LONG_TYPE);
		TYPES.put("StringType", BEDiagramPackage.Literals.STRING_TYPE);
		TYPES.put("BinaryType", BEDiagramPackage.Literals.BINARY_TYPE);
		TYPES.put("BooleanType", BEDiagramPackage.Literals.BOOLEAN_TYPE);
		TYPES.put("DoubleType", BEDiagramPackage.Literals.DOUBLE_TYPE);
		TYPES.put("DateTimeType", BEDiagramPackage.Literals.DATE_TIME_TYPE);
		TYPES.put("TimeType", BEDiagramPackage.Literals.TIME_TYPE);
		TYPES.put("FileType", BEDiagramPackage.Literals.FILE_TYPE);
		TYPES.put("BEListType", BEDiagramPackage.Literals.BE_LIST_TYPE);
		TYPES.put("BEMapType", BEDiagramPackage.Literals.BE_MAP_TYPE);
		TYPES.put("BESetType", BEDiagramPackage.Literals.BE_SET_TYPE);
		TYPES.put("CEObjRefType", BEDiagramPackage.Literals.CE_OBJ_REF_TYPE);
		TYPES.put("BEObjRefType", BEDiagramPackage.Literals.BE_OBJ_REF_TYPE);
		TYPES.put("JavaObjRefType", BEDiagramPackage.Literals.JAVA_OBJ_REF_TYPE);
		
		TYPE_CLASSES.put(IntTypeImpl.class, "IntType");
		TYPE_CLASSES.put(LongTypeImpl.class, "LongType");
		TYPE_CLASSES.put(StringTypeImpl.class, "StringType");
		TYPE_CLASSES.put(BinaryTypeImpl.class, "BinaryType");
		TYPE_CLASSES.put(BooleanTypeImpl.class, "BooleanType");
		TYPE_CLASSES.put(DoubleTypeImpl.class, "DoubleType");
		TYPE_CLASSES.put(DateTimeTypeImpl.class, "DateTimeType");
		TYPE_CLASSES.put(TimeTypeImpl.class, "TimeType");
		TYPE_CLASSES.put(FileTypeImpl.class, "FileType");
		TYPE_CLASSES.put(BEListTypeImpl.class, "BEListType");
		TYPE_CLASSES.put(BEMapTypeImpl.class, "BEMapType");
		TYPE_CLASSES.put(BESetTypeImpl.class, "BESetType");
		TYPE_CLASSES.put(CEObjRefTypeImpl.class, "CEObjRefType");
		TYPE_CLASSES.put(BEObjRefTypeImpl.class, "BEObjRefType");
		TYPE_CLASSES.put(JavaObjRefTypeImpl.class, "JavaObjRefType");
		
		TYPE_INDEXS.put("IntType", "0");
		TYPE_INDEXS.put("LongType", "1");
		TYPE_INDEXS.put("StringType", "2");
		TYPE_INDEXS.put("BinaryType", "3");
		TYPE_INDEXS.put("BooleanType", "4");
		TYPE_INDEXS.put("DoubleType", "5");
		TYPE_INDEXS.put("DateTimeType", "6");
		TYPE_INDEXS.put("TimeType", "7");
		TYPE_INDEXS.put("FileType", "8");
		TYPE_INDEXS.put("BEListType", "9");
		TYPE_INDEXS.put("BEMapType", "10");
		TYPE_INDEXS.put("BESetType", "11");
		TYPE_INDEXS.put("CEObjRefType", "12");
		TYPE_INDEXS.put("BEObjRefType", "13");
		TYPE_INDEXS.put("JavaObjRefType", "14");
	}
	
	/**
	 * Only for Map key currently.
	 * 
	 * @param javaClass
	 * @return
	 */
	public static BEType createType(String javaClass) {
		if ("byte".equals(javaClass) || "java.lang.Byte".equals(javaClass)) {
			return BEDiagramFactory.eINSTANCE.createBinaryType();
		}
		if ("java.lang.String".equals(javaClass)) {
			return BEDiagramFactory.eINSTANCE.createStringType();
		}
		if ("java.lang.Integer".equals(javaClass)) {
			return BEDiagramFactory.eINSTANCE.createIntType();
		}
		if ("java.lang.Long".equals(javaClass)) {
			return BEDiagramFactory.eINSTANCE.createLongType();
		}
		if ("java.lang.Boolean".equals(javaClass)) {
			return BEDiagramFactory.eINSTANCE.createBooleanType();
		}
		if ("java.lang.Double".equals(javaClass)) {
			return BEDiagramFactory.eINSTANCE.createDoubleType();
		}
		if ("java.io.File".equals(javaClass)) {
			return BEDiagramFactory.eINSTANCE.createFileType();
		}
		if ("java.sql.Timestamp".equals(javaClass)) {
			return BEDiagramFactory.eINSTANCE.createTimeType();
		}
		if ("java.util.Date".equals(javaClass)) {
			return BEDiagramFactory.eINSTANCE.createDateTimeType();
		}
		
		JavaObjRefType ref = BEDiagramFactory.eINSTANCE.createJavaObjRefType();
		ref.setTargetJava(CommonFactory.eINSTANCE.createTargetJavaType());
		ref.getTargetJava().setName(javaClass);
		return ref;
	}
	
	/**
	 * Only for Map key currently.
	 * 
	 * @param type
	 * @return
	 */
	public static String toJavaType(BEType type) {
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBinaryType()) {
			return "java.lang.Byte";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getIntType()) {
			return "java.lang.Integer";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getLongType()) {
			return "java.lang.Long";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getStringType()) {
			return "java.lang.String";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBooleanType()) {
			return "java.lang.Boolean";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getDoubleType()) {
			return "java.lang.Double";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getFileType()) {
			return "java.io.File";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getTimeType()) {
			return "java.sql.Timestamp";
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getDateTimeType()) {
			return "java.util.Date";
		}
		
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getJavaObjRefType()) {
			JavaObjRefType ref = (JavaObjRefType)type;
			return ref.getTargetJava().getName();
		}
		return "";
	}
	
	public static BEType copy(BEType type) {
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBinaryType()) {
			return BEDiagramFactory.eINSTANCE.createBinaryType();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getIntType()) {
			return BEDiagramFactory.eINSTANCE.createIntType();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getLongType()) {
			return BEDiagramFactory.eINSTANCE.createLongType();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getStringType()) {
			return BEDiagramFactory.eINSTANCE.createStringType();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBooleanType()) {
			return BEDiagramFactory.eINSTANCE.createBooleanType();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getDateTimeType()) {
			return BEDiagramFactory.eINSTANCE.createDateTimeType();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getDoubleType()) {
			return BEDiagramFactory.eINSTANCE.createDoubleType();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getFileType()) {
			return BEDiagramFactory.eINSTANCE.createFileType();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getTimeType()) {
			return BEDiagramFactory.eINSTANCE.createTimeType();
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getCEObjRefType()) {
			CEObjRefType ref = BEDiagramFactory.eINSTANCE.createCEObjRefType();
			ref.setTargetEntity(CommonFactory.eINSTANCE.createTargetEntityType());
			ref.getTargetEntity().setEntityName(((CEObjRefType)type).getTargetEntity().getEntityName());
			return ref;
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBEObjRefType()) {
			BEObjRefType ref = BEDiagramFactory.eINSTANCE.createBEObjRefType();
			ref.setTargetEntity(CommonFactory.eINSTANCE.createTargetEntityType());
			ref.getTargetEntity().setEntityName(((BEObjRefType)type).getTargetEntity().getEntityName());
			return ref;
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getJavaObjRefType()) {
			JavaObjRefType ref = BEDiagramFactory.eINSTANCE.createJavaObjRefType();
			ref.setTargetJava(CommonFactory.eINSTANCE.createTargetJavaType());
			ref.getTargetJava().setName(((JavaObjRefType)type).getTargetJava().getName());
			ref.getTargetJava().setPackageName(((JavaObjRefType)type).getTargetJava().getPackageName());
			
			return ref;
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBEListType()) {
			BEListType list = BEDiagramFactory.eINSTANCE.createBEListType();
			list.setElementType(copy(((BEListType)type).getElementType()));
			
			return list;
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBESetType()) {
			BESetType set = BEDiagramFactory.eINSTANCE.createBESetType();
			set.setElementType(copy(((BESetType)type).getElementType()));
			
			return set;
		}
		if (type.eClass() == BEDiagramPackage.eINSTANCE.getBEMapType()) {
			BEMapType map = BEDiagramFactory.eINSTANCE.createBEMapType();
			map.setElementType(copy(((BEMapType)type).getElementType()));
			map.setKeyType(copy(((BEMapType)type).getKeyType()));
			return map;
		}
		return (BEType)BEDiagramFactory.eINSTANCE.create(type.eClass());
	}
	
}
