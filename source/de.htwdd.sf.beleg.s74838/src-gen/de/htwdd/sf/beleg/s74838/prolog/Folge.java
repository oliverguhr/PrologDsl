/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Folge#getAtom <em>Atom</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Folge#getNthAtom <em>Nth Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getFolge()
 * @model
 * @generated
 */
public interface Folge extends EObject
{
  /**
   * Returns the value of the '<em><b>Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' containment reference.
   * @see #setAtom(Atom)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getFolge_Atom()
   * @model containment="true"
   * @generated
   */
  Atom getAtom();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Folge#getAtom <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' containment reference.
   * @see #getAtom()
   * @generated
   */
  void setAtom(Atom value);

  /**
   * Returns the value of the '<em><b>Nth Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nth Atom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nth Atom</em>' containment reference.
   * @see #setNthAtom(Atom)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getFolge_NthAtom()
   * @model containment="true"
   * @generated
   */
  Atom getNthAtom();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Folge#getNthAtom <em>Nth Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nth Atom</em>' containment reference.
   * @see #getNthAtom()
   * @generated
   */
  void setNthAtom(Atom value);

} // Folge
