/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog.impl;

import de.htwdd.sf.beleg.s74838.prolog.Exquery;
import de.htwdd.sf.beleg.s74838.prolog.Program;
import de.htwdd.sf.beleg.s74838.prolog.PrologDsl;
import de.htwdd.sf.beleg.s74838.prolog.PrologPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl#getExquery <em>Exquery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrologDslImpl extends MinimalEObjectImpl.Container implements PrologDsl
{
  /**
   * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
  protected Program program;

  /**
   * The cached value of the '{@link #getExquery() <em>Exquery</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExquery()
   * @generated
   * @ordered
   */
  protected Exquery exquery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrologDslImpl()
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
    return PrologPackage.Literals.PROLOG_DSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program getProgram()
  {
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs)
  {
    Program oldProgram = program;
    program = newProgram;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrologPackage.PROLOG_DSL__PROGRAM, oldProgram, newProgram);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProgram(Program newProgram)
  {
    if (newProgram != program)
    {
      NotificationChain msgs = null;
      if (program != null)
        msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrologPackage.PROLOG_DSL__PROGRAM, null, msgs);
      if (newProgram != null)
        msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrologPackage.PROLOG_DSL__PROGRAM, null, msgs);
      msgs = basicSetProgram(newProgram, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.PROLOG_DSL__PROGRAM, newProgram, newProgram));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exquery getExquery()
  {
    return exquery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExquery(Exquery newExquery, NotificationChain msgs)
  {
    Exquery oldExquery = exquery;
    exquery = newExquery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrologPackage.PROLOG_DSL__EXQUERY, oldExquery, newExquery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExquery(Exquery newExquery)
  {
    if (newExquery != exquery)
    {
      NotificationChain msgs = null;
      if (exquery != null)
        msgs = ((InternalEObject)exquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrologPackage.PROLOG_DSL__EXQUERY, null, msgs);
      if (newExquery != null)
        msgs = ((InternalEObject)newExquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrologPackage.PROLOG_DSL__EXQUERY, null, msgs);
      msgs = basicSetExquery(newExquery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.PROLOG_DSL__EXQUERY, newExquery, newExquery));
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
      case PrologPackage.PROLOG_DSL__PROGRAM:
        return basicSetProgram(null, msgs);
      case PrologPackage.PROLOG_DSL__EXQUERY:
        return basicSetExquery(null, msgs);
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
      case PrologPackage.PROLOG_DSL__PROGRAM:
        return getProgram();
      case PrologPackage.PROLOG_DSL__EXQUERY:
        return getExquery();
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
      case PrologPackage.PROLOG_DSL__PROGRAM:
        setProgram((Program)newValue);
        return;
      case PrologPackage.PROLOG_DSL__EXQUERY:
        setExquery((Exquery)newValue);
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
      case PrologPackage.PROLOG_DSL__PROGRAM:
        setProgram((Program)null);
        return;
      case PrologPackage.PROLOG_DSL__EXQUERY:
        setExquery((Exquery)null);
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
      case PrologPackage.PROLOG_DSL__PROGRAM:
        return program != null;
      case PrologPackage.PROLOG_DSL__EXQUERY:
        return exquery != null;
    }
    return super.eIsSet(featureID);
  }

} //PrologDslImpl
