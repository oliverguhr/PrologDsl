/**
 */
package de.htwdd.sf.beleg.s74838.prolog.impl;

import de.htwdd.sf.beleg.s74838.prolog.Folge;
import de.htwdd.sf.beleg.s74838.prolog.NotEmptyList;
import de.htwdd.sf.beleg.s74838.prolog.PrologPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Empty List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.impl.NotEmptyListImpl#getFolge <em>Folge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotEmptyListImpl extends MinimalEObjectImpl.Container implements NotEmptyList
{
  /**
   * The cached value of the '{@link #getFolge() <em>Folge</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFolge()
   * @generated
   * @ordered
   */
  protected Folge folge;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotEmptyListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PrologPackage.Literals.NOT_EMPTY_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Folge getFolge()
  {
    return folge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFolge(Folge newFolge, NotificationChain msgs)
  {
    Folge oldFolge = folge;
    folge = newFolge;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrologPackage.NOT_EMPTY_LIST__FOLGE, oldFolge, newFolge);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFolge(Folge newFolge)
  {
    if (newFolge != folge)
    {
      NotificationChain msgs = null;
      if (folge != null)
        msgs = ((InternalEObject)folge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrologPackage.NOT_EMPTY_LIST__FOLGE, null, msgs);
      if (newFolge != null)
        msgs = ((InternalEObject)newFolge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrologPackage.NOT_EMPTY_LIST__FOLGE, null, msgs);
      msgs = basicSetFolge(newFolge, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.NOT_EMPTY_LIST__FOLGE, newFolge, newFolge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PrologPackage.NOT_EMPTY_LIST__FOLGE:
        return basicSetFolge(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PrologPackage.NOT_EMPTY_LIST__FOLGE:
        return getFolge();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PrologPackage.NOT_EMPTY_LIST__FOLGE:
        setFolge((Folge)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PrologPackage.NOT_EMPTY_LIST__FOLGE:
        setFolge((Folge)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PrologPackage.NOT_EMPTY_LIST__FOLGE:
        return folge != null;
    }
    return super.eIsSet(featureID);
  }

} //NotEmptyListImpl
