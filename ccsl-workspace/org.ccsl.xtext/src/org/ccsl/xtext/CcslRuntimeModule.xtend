/*
 * generated by Xtext 2.18.0.M3
 */
package org.ccsl.xtext

import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class CcslRuntimeModule extends AbstractCcslRuntimeModule {
	
	
	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return CcslQualifiedNameProvider;
    }
}