
package de.htwdd.sf.beleg.s74838;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PrologStandaloneSetup extends PrologStandaloneSetupGenerated{

	public static void doSetup() {
		new PrologStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

