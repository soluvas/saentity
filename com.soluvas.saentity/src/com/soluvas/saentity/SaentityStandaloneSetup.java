
package com.soluvas.saentity;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SaentityStandaloneSetup extends SaentityStandaloneSetupGenerated{

	public static void doSetup() {
		new SaentityStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

