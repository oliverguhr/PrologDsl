/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologFactory
 * @model kind="package"
 * @generated
 */
public interface PrologPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "prolog";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.htwdd.de/sf/beleg/s74838/Prolog";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "prolog";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PrologPackage eINSTANCE = de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl.init();

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl <em>Dsl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getPrologDsl()
   * @generated
   */
  int PROLOG_DSL = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_DSL__PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Exquery</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_DSL__EXQUERY = 1;

  /**
   * The number of structural features of the '<em>Dsl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_DSL_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl <em>Dsl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologDsl
   * @generated
   */
  EClass getPrologDsl();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Program</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getProgram()
   * @see #getPrologDsl()
   * @generated
   */
  EAttribute getPrologDsl_Program();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getExquery <em>Exquery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exquery</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getExquery()
   * @see #getPrologDsl()
   * @generated
   */
  EAttribute getPrologDsl_Exquery();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PrologFactory getPrologFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl <em>Dsl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getPrologDsl()
     * @generated
     */
    EClass PROLOG_DSL = eINSTANCE.getPrologDsl();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROLOG_DSL__PROGRAM = eINSTANCE.getPrologDsl_Program();

    /**
     * The meta object literal for the '<em><b>Exquery</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROLOG_DSL__EXQUERY = eINSTANCE.getPrologDsl_Exquery();

  }

} //PrologPackage
