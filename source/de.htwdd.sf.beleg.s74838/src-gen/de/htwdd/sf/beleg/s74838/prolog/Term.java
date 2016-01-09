/**
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Term#getAtom <em>Atom</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.Term#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject
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
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getTerm_Atom()
   * @model containment="true"
   * @generated
   */
  Atom getAtom();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Term#getAtom <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' containment reference.
   * @see #getAtom()
   * @generated
   */
  void setAtom(Atom value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(List)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getTerm_List()
   * @model containment="true"
   * @generated
   */
  List getList();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.Term#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(List value);

} // Term
