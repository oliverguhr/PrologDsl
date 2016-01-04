/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Clause#getFact <em>Fact</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Clause#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends EObject
{
  /**
   * Returns the value of the '<em><b>Fact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact</em>' containment reference.
   * @see #setFact(Fact)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getClause_Fact()
   * @model containment="true"
   * @generated
   */
  Fact getFact();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Clause#getFact <em>Fact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact</em>' containment reference.
   * @see #getFact()
   * @generated
   */
  void setFact(Fact value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(Rule)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getClause_Rule()
   * @model containment="true"
   * @generated
   */
  Rule getRule();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Clause#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(Rule value);

} // Clause
