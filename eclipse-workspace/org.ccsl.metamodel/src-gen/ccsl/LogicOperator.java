/**
 */
package ccsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Logic Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsl.ccslPackage#getLogicOperator()
 * @model
 * @generated
 */
public final class LogicOperator extends AbstractEnumerator {
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
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @generated
	 * @ordered
	 */
	public static final LogicOperator AND_LITERAL = new LogicOperator(AND, "AND", "AND");

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @generated
	 * @ordered
	 */
	public static final LogicOperator OR_LITERAL = new LogicOperator(OR, "OR", "OR");

	/**
	 * The '<em><b>IF THEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF_THEN
	 * @generated
	 * @ordered
	 */
	public static final LogicOperator IF_THEN_LITERAL = new LogicOperator(IF_THEN, "IF_THEN", "IF_THEN");

	/**
	 * An array of all the '<em><b>Logic Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LogicOperator[] VALUES_ARRAY = new LogicOperator[] { AND_LITERAL, OR_LITERAL,
			IF_THEN_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Logic Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Logic Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogicOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogicOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logic Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogicOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogicOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logic Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogicOperator get(int value) {
		switch (value) {
		case AND:
			return AND_LITERAL;
		case OR:
			return OR_LITERAL;
		case IF_THEN:
			return IF_THEN_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LogicOperator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //LogicOperator
