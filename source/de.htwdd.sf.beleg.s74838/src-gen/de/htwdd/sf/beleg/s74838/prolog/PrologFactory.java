/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage
 * @generated
 */
public interface PrologFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PrologFactory eINSTANCE = de.htwdd.sf.beleg.s74838.prolog.impl.PrologFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Dsl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl</em>'.
   * @generated
   */
  PrologDsl createPrologDsl();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PrologPackage getPrologPackage();

} //PrologFactory
