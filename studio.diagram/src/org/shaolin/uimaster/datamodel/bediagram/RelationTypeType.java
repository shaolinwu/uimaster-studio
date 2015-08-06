/**
 */
package org.shaolin.uimaster.datamodel.bediagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relation Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.shaolin.uimaster.datamodel.bediagram.BEDiagramPackage#getRelationTypeType()
 * @model extendedMetaData="name='RelationTypeType'"
 * @generated
 */
public enum RelationTypeType implements Enumerator {
	/**
	 * The '<em><b>One2 One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE2_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE2_ONE(0, "One2One", "One2One"),

	/**
	 * The '<em><b>One2 N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE2_N_VALUE
	 * @generated
	 * @ordered
	 */
	ONE2_N(1, "One2N", "One2N"),

	/**
	 * The '<em><b>N2 One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N2_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	N2_ONE(2, "N2One", "N2One"),

	/**
	 * The '<em><b>N2N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N2N_VALUE
	 * @generated
	 * @ordered
	 */
	N2N(3, "N2N", "N2N");

	/**
	 * The '<em><b>One2 One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One2 One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE2_ONE
	 * @model name="One2One"
	 * @generated
	 * @ordered
	 */
	public static final int ONE2_ONE_VALUE = 0;

	/**
	 * The '<em><b>One2 N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One2 N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE2_N
	 * @model name="One2N"
	 * @generated
	 * @ordered
	 */
	public static final int ONE2_N_VALUE = 1;

	/**
	 * The '<em><b>N2 One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N2 One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N2_ONE
	 * @model name="N2One"
	 * @generated
	 * @ordered
	 */
	public static final int N2_ONE_VALUE = 2;

	/**
	 * The '<em><b>N2N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N2N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N2N
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N2N_VALUE = 3;

	/**
	 * An array of all the '<em><b>Relation Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationTypeType[] VALUES_ARRAY =
		new RelationTypeType[] {
			ONE2_ONE,
			ONE2_N,
			N2_ONE,
			N2N,
		};

	/**
	 * A public read-only list of all the '<em><b>Relation Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relation Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationTypeType get(int value) {
		switch (value) {
			case ONE2_ONE_VALUE: return ONE2_ONE;
			case ONE2_N_VALUE: return ONE2_N;
			case N2_ONE_VALUE: return N2_ONE;
			case N2N_VALUE: return N2N;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationTypeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RelationTypeType
