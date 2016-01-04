/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Predicate#getFunctor <em>Functor</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Predicate#getTerm <em>Term</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Predicate#getNthTerm <em>Nth Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Functor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functor</em>' attribute.
   * @see #setFunctor(String)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getPredicate_Functor()
   * @model
   * @generated
   */
  String getFunctor();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Predicate#getFunctor <em>Functor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor</em>' attribute.
   * @see #getFunctor()
   * @generated
   */
  void setFunctor(String value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(Term)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getPredicate_Term()
   * @model containment="true"
   * @generated
   */
  Term getTerm();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Predicate#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Term value);

  /**
   * Returns the value of the '<em><b>Nth Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nth Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nth Term</em>' containment reference.
   * @see #setNthTerm(Term)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getPredicate_NthTerm()
   * @model containment="true"
   * @generated
   */
  Term getNthTerm();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Predicate#getNthTerm <em>Nth Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nth Term</em>' containment reference.
   * @see #getNthTerm()
   * @generated
   */
  void setNthTerm(Term value);

} // Predicate
