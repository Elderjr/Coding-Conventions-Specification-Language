/**
 * generated by Xtext 2.18.0.M3
 */
package org.ccsl.xtext;

import org.ccsl.xtext.CcslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class CcslStandaloneSetup extends CcslStandaloneSetupGenerated {
  public static void doSetup() {
    new CcslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
