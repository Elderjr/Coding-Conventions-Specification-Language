/**
 */
package codingConvetionMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Logic Operators</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see codingConvetionMetamodel.CodingConventionsMetamodelPackage#getLogicOperators()
 * @model
 * @generated
 */
public final class LogicOperators extends AbstractEnumerator {
	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AND_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND = 0;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OR_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR = 1;

	/**
	 * The '<em><b>IF THEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IF THEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IF_THEN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IF_THEN = 2;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY = 3;

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @generated
	 * @ordered
	 */
	public static final LogicOperators AND_LITERAL = new LogicOperators(AND, "AND", "AND");

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @generated
	 * @ordered
	 */
	public static final LogicOperators OR_LITERAL = new LogicOperators(OR, "OR", "OR");

	/**
	 * The '<em><b>IF THEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF_THEN
	 * @generated
	 * @ordered
	 */
	public static final LogicOperators IF_THEN_LITERAL = new LogicOperators(IF_THEN, "IF_THEN", "IF_THEN");

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final LogicOperators ANY_LITERAL = new LogicOperators(ANY, "ANY", "ANY");

	/**
	 * An array of all the '<em><b>Logic Operators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LogicOperators[] VALUES_ARRAY = new LogicOperators[] { AND_LITERAL, OR_LITERAL,
			IF_THEN_LITERAL, ANY_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Logic Operators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Logic Operators</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogicOperators get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogicOperators result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logic Operators</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogicOperators getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogicOperators result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logic Operators</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogicOperators get(int value) {
		switch (value) {
		case AND:
			return AND_LITERAL;
		case OR:
			return OR_LITERAL;
		case IF_THEN:
			return IF_THEN_LITERAL;
		case ANY:
			return ANY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LogicOperators(int value, String name, String literal) {
		super(value, name, literal);
	}

} //LogicOperators
