/**
 */
package codingConvention.filters;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codingConvention.filters.FiltersPackage
 * @generated
 */
public interface FiltersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiltersFactory eINSTANCE = codingConvention.filters.impl.FiltersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Filter</em>'.
	 * @generated
	 */
	CompositeFilter createCompositeFilter();

	/**
	 * Returns a new object of class '<em>Property Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Filter</em>'.
	 * @generated
	 */
	PropertyFilter createPropertyFilter();

	/**
	 * Returns a new object of class '<em>Template Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Filter</em>'.
	 * @generated
	 */
	TemplateFilter createTemplateFilter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FiltersPackage getFiltersPackage();

} //FiltersFactory
