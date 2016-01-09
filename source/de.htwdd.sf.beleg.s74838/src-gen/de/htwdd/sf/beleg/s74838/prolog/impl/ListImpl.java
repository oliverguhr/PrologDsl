/**
 */
package de.htwdd.sf.beleg.s74838.prolog.impl;

import de.htwdd.sf.beleg.s74838.prolog.List;
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
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.impl.ListImpl#getEmptyList <em>Empty List</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.impl.ListImpl#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends MinimalEObjectImpl.Container implements List
{
  /**
   * The default value of the '{@link #getEmptyList() <em>Empty List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptyList()
   * @generated
   * @ordered
   */
  protected static final String EMPTY_LIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmptyList() <em>Empty List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptyList()
   * @generated
   * @ordered
   */
  protected String emptyList = EMPTY_LIST_EDEFAULT;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected NotEmptyList list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListImpl()
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
    return PrologPackage.Literals.LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmptyList()
  {
    return emptyList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptyList(String newEmptyList)
  {
    String oldEmptyList = emptyList;
    emptyList = newEmptyList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.LIST__EMPTY_LIST, oldEmptyList, emptyList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotEmptyList getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList(NotEmptyList newList, NotificationChain msgs)
  {
    NotEmptyList oldList = list;
    list = newList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrologPackage.LIST__LIST, oldList, newList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(NotEmptyList newList)
  {
    if (newList != list)
    {
      NotificationChain msgs = null;
      if (list != null)
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrologPackage.LIST__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrologPackage.LIST__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.LIST__LIST, newList, newList));
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
      case PrologPackage.LIST__LIST:
        return basicSetList(null, msgs);
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
      case PrologPackage.LIST__EMPTY_LIST:
        return getEmptyList();
      case PrologPackage.LIST__LIST:
        return getList();
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
      case PrologPackage.LIST__EMPTY_LIST:
        setEmptyList((String)newValue);
        return;
      case PrologPackage.LIST__LIST:
        setList((NotEmptyList)newValue);
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
      case PrologPackage.LIST__EMPTY_LIST:
        setEmptyList(EMPTY_LIST_EDEFAULT);
        return;
      case PrologPackage.LIST__LIST:
        setList((NotEmptyList)null);
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
      case PrologPackage.LIST__EMPTY_LIST:
        return EMPTY_LIST_EDEFAULT == null ? emptyList != null : !EMPTY_LIST_EDEFAULT.equals(emptyList);
      case PrologPackage.LIST__LIST:
        return list != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (emptyList: ");
    result.append(emptyList);
    result.append(')');
    return result.toString();
  }

} //ListImpl
