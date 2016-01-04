/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getProgram <em>Program</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getExquery <em>Exquery</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getPrologDsl()
 * @model
 * @generated
 */
public interface PrologDsl extends EObject
{
  /**
   * Returns the value of the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' containment reference.
   * @see #setProgram(Program)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getPrologDsl_Program()
   * @model containment="true"
   * @generated
   */
  Program getProgram();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getProgram <em>Program</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Program</em>' containment reference.
   * @see #getProgram()
   * @generated
   */
  void setProgram(Program value);

  /**
   * Returns the value of the '<em><b>Exquery</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exquery</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exquery</em>' containment reference.
   * @see #setExquery(Exquery)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getPrologDsl_Exquery()
   * @model containment="true"
   * @generated
   */
  Exquery getExquery();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getExquery <em>Exquery</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exquery</em>' containment reference.
   * @see #getExquery()
   * @generated
   */
  void setExquery(Exquery value);

} // PrologDsl
