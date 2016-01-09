/**
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Rule#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Rule#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Predicate)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getRule_Predicate()
   * @model containment="true"
   * @generated
   */
  Predicate getPredicate();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Rule#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Predicate value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(Query)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getRule_Query()
   * @model containment="true"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Rule#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

} // Rule
