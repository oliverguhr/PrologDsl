/**
 */
package de.htwdd.sf.beleg.s74838.prolog.impl;

import de.htwdd.sf.beleg.s74838.prolog.Atom;
import de.htwdd.sf.beleg.s74838.prolog.Folge;
import de.htwdd.sf.beleg.s74838.prolog.PrologPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.impl.FolgeImpl#getAtom <em>Atom</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.impl.FolgeImpl#getNthAtom <em>Nth Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FolgeImpl extends MinimalEObjectImpl.Container implements Folge
{
  /**
   * The cached value of the '{@link #getAtom() <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom()
   * @generated
   * @ordered
   */
  protected Atom atom;

  /**
   * The cached value of the '{@link #getNthAtom() <em>Nth Atom</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNthAtom()
   * @generated
   * @ordered
   */
  protected EList<Atom> nthAtom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FolgeImpl()
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
    return PrologPackage.Literals.FOLGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom getAtom()
  {
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtom(Atom newAtom, NotificationChain msgs)
  {
    Atom oldAtom = atom;
    atom = newAtom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrologPackage.FOLGE__ATOM, oldAtom, newAtom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtom(Atom newAtom)
  {
    if (newAtom != atom)
    {
      NotificationChain msgs = null;
      if (atom != null)
        msgs = ((InternalEObject)atom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrologPackage.FOLGE__ATOM, null, msgs);
      if (newAtom != null)
        msgs = ((InternalEObject)newAtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrologPackage.FOLGE__ATOM, null, msgs);
      msgs = basicSetAtom(newAtom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.FOLGE__ATOM, newAtom, newAtom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Atom> getNthAtom()
  {
    if (nthAtom == null)
    {
      nthAtom = new EObjectContainmentEList<Atom>(Atom.class, this, PrologPackage.FOLGE__NTH_ATOM);
    }
    return nthAtom;
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
      case PrologPackage.FOLGE__ATOM:
        return basicSetAtom(null, msgs);
      case PrologPackage.FOLGE__NTH_ATOM:
        return ((InternalEList<?>)getNthAtom()).basicRemove(otherEnd, msgs);
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
      case PrologPackage.FOLGE__ATOM:
        return getAtom();
      case PrologPackage.FOLGE__NTH_ATOM:
        return getNthAtom();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PrologPackage.FOLGE__ATOM:
        setAtom((Atom)newValue);
        return;
      case PrologPackage.FOLGE__NTH_ATOM:
        getNthAtom().clear();
        getNthAtom().addAll((Collection<? extends Atom>)newValue);
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
      case PrologPackage.FOLGE__ATOM:
        setAtom((Atom)null);
        return;
      case PrologPackage.FOLGE__NTH_ATOM:
        getNthAtom().clear();
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
      case PrologPackage.FOLGE__ATOM:
        return atom != null;
      case PrologPackage.FOLGE__NTH_ATOM:
        return nthAtom != null && !nthAtom.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FolgeImpl
