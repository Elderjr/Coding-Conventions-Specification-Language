/**
 */
package codingConvetionMetamodel.filters.impl;

import codingConvetionMetamodel.filters.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiltersFactoryImpl extends EFactoryImpl implements FiltersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FiltersFactory init() {
		try {
			FiltersFactory theFiltersFactory = (FiltersFactory) EPackage.Registry.INSTANCE
					.getEFactory(FiltersPackage.eNS_URI);
			if (theFiltersFactory != null) {
				return theFiltersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FiltersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FiltersPackage.COMPOSITE_FILTER:
			return createCompositeFilter();
		case FiltersPackage.PROPERTY_FILTER:
			return createPropertyFilter();
		case FiltersPackage.TEMPLATE_FILTER:
			return createTemplateFilter();
		case FiltersPackage.DEFINES_METHOD:
			return createDefinesMethod();
		case FiltersPackage.EQUALS_NAMED_ELEMENT:
			return createEqualsNamedElement();
		case FiltersPackage.REGEX_LITERAL_VALUE_FILTER:
			return createRegexLiteralValueFilter();
		case FiltersPackage.COUNT_BLOCK_STATEMENTS_FILTER:
			return createCountBlockStatementsFilter();
		case FiltersPackage.EQUALS_NAMED_ELEMENT_WITH_LITERALS:
			return createEqualsNamedElementWithLiterals();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeFilter createCompositeFilter() {
		CompositeFilterImpl compositeFilter = new CompositeFilterImpl();
		return compositeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFilter createPropertyFilter() {
		PropertyFilterImpl propertyFilter = new PropertyFilterImpl();
		return propertyFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateFilter createTemplateFilter() {
		TemplateFilterImpl templateFilter = new TemplateFilterImpl();
		return templateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinesMethod createDefinesMethod() {
		DefinesMethodImpl definesMethod = new DefinesMethodImpl();
		return definesMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualsNamedElement createEqualsNamedElement() {
		EqualsNamedElementImpl equalsNamedElement = new EqualsNamedElementImpl();
		return equalsNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegexLiteralValueFilter createRegexLiteralValueFilter() {
		RegexLiteralValueFilterImpl regexLiteralValueFilter = new RegexLiteralValueFilterImpl();
		return regexLiteralValueFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountBlockStatementsFilter createCountBlockStatementsFilter() {
		CountBlockStatementsFilterImpl countBlockStatementsFilter = new CountBlockStatementsFilterImpl();
		return countBlockStatementsFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualsNamedElementWithLiterals createEqualsNamedElementWithLiterals() {
		EqualsNamedElementWithLiteralsImpl equalsNamedElementWithLiterals = new EqualsNamedElementWithLiteralsImpl();
		return equalsNamedElementWithLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersPackage getFiltersPackage() {
		return (FiltersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static FiltersPackage getPackage() {
		return FiltersPackage.eINSTANCE;
	}

} //FiltersFactoryImpl
