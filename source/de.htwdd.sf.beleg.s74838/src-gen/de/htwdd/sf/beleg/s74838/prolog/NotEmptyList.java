/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Empty List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.NotEmptyList#getFolge <em>Folge</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getNotEmptyList()
 * @model
 * @generated
 */
public interface NotEmptyList extends List
{
  /**
   * Returns the value of the '<em><b>Folge</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Folge</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Folge</em>' containment reference.
   * @see #setFolge(Folge)
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#getNotEmptyList_Folge()
   * @model containment="true"
   * @generated
   */
  Folge getFolge();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s74838.prolog.NotEmptyList#getFolge <em>Folge</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Folge</em>' containment reference.
   * @see #getFolge()
   * @generated
   */
  void setFolge(Folge value);

} // NotEmptyList
