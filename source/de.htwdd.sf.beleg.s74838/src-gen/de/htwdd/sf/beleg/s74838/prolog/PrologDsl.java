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
   * Returns the value of the '<em><b>Program</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' attribute.
   * @see #setProgram(String)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getPrologDsl_Program()
   * @model
   * @generated
   */
  String getProgram();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getProgram <em>Program</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Program</em>' attribute.
   * @see #getProgram()
   * @generated
   */
  void setProgram(String value);

  /**
   * Returns the value of the '<em><b>Exquery</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exquery</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exquery</em>' attribute.
   * @see #setExquery(String)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getPrologDsl_Exquery()
   * @model
   * @generated
   */
  String getExquery();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getExquery <em>Exquery</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exquery</em>' attribute.
   * @see #getExquery()
   * @generated
   */
  void setExquery(String value);

} // PrologDsl
