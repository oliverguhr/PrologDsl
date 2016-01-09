/**
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.List#getEmptyList <em>Empty List</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.List#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getList()
 * @model
 * @generated
 */
public interface List extends EObject
{
  /**
   * Returns the value of the '<em><b>Empty List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty List</em>' attribute.
   * @see #setEmptyList(String)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getList_EmptyList()
   * @model
   * @generated
   */
  String getEmptyList();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.List#getEmptyList <em>Empty List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty List</em>' attribute.
   * @see #getEmptyList()
   * @generated
   */
  void setEmptyList(String value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(NotEmptyList)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getList_List()
   * @model containment="true"
   * @generated
   */
  NotEmptyList getList();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.List#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(NotEmptyList value);

} // List
