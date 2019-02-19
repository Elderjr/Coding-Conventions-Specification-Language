/**
 */
package codingConvetionMetamodel.filters.util;

import codingConvetionMetamodel.filters.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see codingConvetionMetamodel.filters.FiltersPackage
 * @generated
 */
public class FiltersSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FiltersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersSwitch() {
		if (modelPackage == null) {
			modelPackage = FiltersPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case FiltersPackage.FILTER: {
			Filter filter = (Filter) theEObject;
			Object result = caseFilter(filter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.ATOMIC_FILTER: {
			AtomicFilter atomicFilter = (AtomicFilter) theEObject;
			Object result = caseAtomicFilter(atomicFilter);
			if (result == null)
				result = caseFilter(atomicFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.COMPOSITE_FILTER: {
			CompositeFilter compositeFilter = (CompositeFilter) theEObject;
			Object result = caseCompositeFilter(compositeFilter);
			if (result == null)
				result = caseFilter(compositeFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.PROPERTY_FILTER: {
			PropertyFilter propertyFilter = (PropertyFilter) theEObject;
			Object result = casePropertyFilter(propertyFilter);
			if (result == null)
				result = caseAtomicFilter(propertyFilter);
			if (result == null)
				result = caseFilter(propertyFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.TEMPLATE_FILTER: {
			TemplateFilter templateFilter = (TemplateFilter) theEObject;
			Object result = caseTemplateFilter(templateFilter);
			if (result == null)
				result = caseAtomicFilter(templateFilter);
			if (result == null)
				result = caseFilter(templateFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.DEFINES_METHOD: {
			DefinesMethod definesMethod = (DefinesMethod) theEObject;
			Object result = caseDefinesMethod(definesMethod);
			if (result == null)
				result = caseAtomicFilter(definesMethod);
			if (result == null)
				result = caseFilter(definesMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.EQUALS_NAMED_ELEMENT: {
			EqualsNamedElement equalsNamedElement = (EqualsNamedElement) theEObject;
			Object result = caseEqualsNamedElement(equalsNamedElement);
			if (result == null)
				result = caseAtomicFilter(equalsNamedElement);
			if (result == null)
				result = caseFilter(equalsNamedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.REGEX_LITERAL_VALUE_FILTER: {
			RegexLiteralValueFilter regexLiteralValueFilter = (RegexLiteralValueFilter) theEObject;
			Object result = caseRegexLiteralValueFilter(regexLiteralValueFilter);
			if (result == null)
				result = caseAtomicFilter(regexLiteralValueFilter);
			if (result == null)
				result = caseFilter(regexLiteralValueFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.COUNT_BLOCK_STATEMENTS_FILTER: {
			CountBlockStatementsFilter countBlockStatementsFilter = (CountBlockStatementsFilter) theEObject;
			Object result = caseCountBlockStatementsFilter(countBlockStatementsFilter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FiltersPackage.EQUALS_NAMED_ELEMENT_WITH_LITERALS: {
			EqualsNamedElementWithLiterals equalsNamedElementWithLiterals = (EqualsNamedElementWithLiterals) theEObject;
			Object result = caseEqualsNamedElementWithLiterals(equalsNamedElementWithLiterals);
			if (result == null)
				result = caseAtomicFilter(equalsNamedElementWithLiterals);
			if (result == null)
				result = caseFilter(equalsNamedElementWithLiterals);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAtomicFilter(AtomicFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompositeFilter(CompositeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertyFilter(PropertyFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateFilter(TemplateFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defines Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defines Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefinesMethod(DefinesMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEqualsNamedElement(EqualsNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regex Literal Value Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regex Literal Value Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegexLiteralValueFilter(RegexLiteralValueFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Block Statements Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Block Statements Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCountBlockStatementsFilter(CountBlockStatementsFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals Named Element With Literals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals Named Element With Literals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEqualsNamedElementWithLiterals(EqualsNamedElementWithLiterals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //FiltersSwitch
