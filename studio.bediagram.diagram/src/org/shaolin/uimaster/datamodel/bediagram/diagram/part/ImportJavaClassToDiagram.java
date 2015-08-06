package org.shaolin.uimaster.datamodel.bediagram.diagram.part;

import japa.parser.JavaParser;
import japa.parser.ParseException;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.ClassOrInterfaceDeclaration;
import japa.parser.ast.body.FieldDeclaration;
import japa.parser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.shaolin.uimaster.datamodel.bediagram.BEDiagramFactory;
import org.shaolin.uimaster.datamodel.bediagram.BEListType;
import org.shaolin.uimaster.datamodel.bediagram.BEMapType;
import org.shaolin.uimaster.datamodel.bediagram.BEObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.BESetType;
import org.shaolin.uimaster.datamodel.bediagram.BEType;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.JavaObjRefType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;
import org.shaolin.uimaster.datamodel.common.CommonFactory;

public class ImportJavaClassToDiagram {
	
	public static void loadPath(File path, final List<BusinessEntityType> list) throws Exception {
		if (path.isDirectory()) {
            final String[] files = path.list();
            for (final String file : files) {
            	if (file.endsWith(".java")) {
            		loadPath(new File(path, file), list);
            	}
            }
        } else {
            if (!path.exists()) {
                throw new IOException("The source file does not exist! path: " + path);
			} else {
				FileInputStream in = null;
				try {
					in = new FileInputStream(path);
					BusinessEntityType be = load(in);
					if (be != null) {
						list.add(be);
					}
				} finally {
					try {
						if (in != null) {
							in.close();
						}
					} catch (final IOException e) {
						// empty.
					}
				}
			}
        }
		
    }
	
	private static BusinessEntityType load(FileInputStream in) throws ParseException {
        CompilationUnit cu = JavaParser.parse(in);
        
        BusinessEntityType be = BEDiagramFactory.eINSTANCE.createBusinessEntityType();
        ClassVisitor visitor = new ClassVisitor(be);
        visitor.visit(cu, null);
        if (visitor.isInterface()) {
        	// skip interface.
        	return null;
        }
        
        return be;
	}
	
	private static BEType createBEType(String type) {
		if ("boolean".equals(type) || "Boolean".equals(type)) {
			return BEDiagramFactory.eINSTANCE.createBooleanType();
		}
		if ("int".equals(type) || "Integer".equals(type)) {
			return BEDiagramFactory.eINSTANCE.createIntType();
		}
		if ("long".equals(type) || "Long".equals(type)) {
			return BEDiagramFactory.eINSTANCE.createLongType();
		}
		if ("double".equals(type) || "Double".equals(type)
				|| "float".equals(type) || "Float".equals(type)) {
			return BEDiagramFactory.eINSTANCE.createDoubleType();
		}
		if ("byte[]".equals(type)) {
			return BEDiagramFactory.eINSTANCE.createBinaryType();
		}
		if ("java.lang.String".equals(type) || "String".equals(type)) {
			return BEDiagramFactory.eINSTANCE.createStringType();
		}
		if ("java.util.Date".equals(type) || "Date".equals(type)) {
			return BEDiagramFactory.eINSTANCE.createDateTimeType();
		}
		if ("java.util.Map".equals(type) || "Map".equals(type)) {
			BEMapType mapType = BEDiagramFactory.eINSTANCE.createBEMapType();
			BEObjRefType beRef = BEDiagramFactory.eINSTANCE.createBEObjRefType();
			beRef.setTargetEntity(CommonFactory.eINSTANCE.createTargetEntityType());
			beRef.getTargetEntity().setEntityName(type);
			mapType.setElementType(beRef);
			
			return mapType;
		}
		if ("java.util.List".equals(type) || "List".equals(type)) {
			BEListType listType = BEDiagramFactory.eINSTANCE.createBEListType();
			BEObjRefType beRef = BEDiagramFactory.eINSTANCE.createBEObjRefType();
			beRef.setTargetEntity(CommonFactory.eINSTANCE.createTargetEntityType());
			beRef.getTargetEntity().setEntityName(type);
			listType.setElementType(beRef);
			
			return listType;
		}
		if ("java.util.Set".equals(type) || "Set".equals(type)) {
			BESetType setType = BEDiagramFactory.eINSTANCE.createBESetType();
			BEObjRefType beRef = BEDiagramFactory.eINSTANCE.createBEObjRefType();
			beRef.setTargetEntity(CommonFactory.eINSTANCE.createTargetEntityType());
			beRef.getTargetEntity().setEntityName(type);
			setType.setElementType(beRef);
			
			return setType;
		}
		if ("java.sql.Time".equals(type) || "Time".equals(type)) {
			return BEDiagramFactory.eINSTANCE.createTimeType();
		}
		
		JavaObjRefType refType = BEDiagramFactory.eINSTANCE.createJavaObjRefType();
		refType.setTargetJava(CommonFactory.eINSTANCE.createTargetJavaType());
		refType.getTargetJava().setName(type);
		return refType;
	}
	
	private static class ClassVisitor extends VoidVisitorAdapter {

		private final BusinessEntityType be;
		
		private boolean isInterface = false;
		
		public ClassVisitor(BusinessEntityType be) {
			this.be = be;
		}
		
        public void visit(FieldDeclaration n, Object arg) {
        	super.visit(n, arg);
        	
        	String fieldName = n.getVariables().get(0).getId().getName();
        	String fieldType = n.getType().toString();
        	if ("serialVersionUID".equals(fieldName)) {
        		return;
        	}
        	if ("___REVISION___".equals(fieldName)) {
        		return;
        	}
        	
        	MemberType member = BEDiagramFactory.eINSTANCE.createMemberType();
        	be.getMember().add(member);
        	
        	member.setName(fieldName);
    		member.setType(createBEType(fieldType));
        }
        
        public void visit(ClassOrInterfaceDeclaration n, Object arg) {
        	super.visit(n, arg);
        	
        	if (n.getExtends() != null && n.getExtends().size() > 0) {
        		String parent = n.getExtends().get(0).getName();
        		BEObjRefType ref = BEDiagramFactory.eINSTANCE.createBEObjRefType();
        		ref.setTargetEntity(CommonFactory.eINSTANCE.createTargetEntityType());
        		ref.getTargetEntity().setEntityName(parent);
        		be.setParentObject(ref);
        	}
        	
        	be.setEntityName(n.getName());
    		isInterface = n.isInterface();
        }
        
        public boolean isInterface() {
        	return isInterface;
        }
    }
	
}
