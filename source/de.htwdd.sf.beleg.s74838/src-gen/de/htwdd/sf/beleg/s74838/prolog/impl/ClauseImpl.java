/**
 */
package de.htwdd.sf.beleg.s74838.prolog.impl;

import de.htwdd.sf.beleg.s74838.prolog.Clause;
import de.htwdd.sf.beleg.s74838.prolog.Fact;
import de.htwdd.sf.beleg.s74838.prolog.PrologPackage;
import de.htwdd.sf.beleg.s74838.prolog.Rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.impl.ClauseImpl#getFact <em>Fact</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s74838.prolog.impl.ClauseImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClauseImpl extends MinimalEObjectImpl.Container implements Clause
{
  /**
   * The cached value of the '{@link #getFact() <em>Fact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFact()
   * @generated
   * @ordered
   */
  protected Fact fact;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected Rule rule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClauseImpl()
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
    return PrologPackage.Literals.CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fact getFact()
  {
    return fact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFact(Fact newFact, NotificationChain msgs)
  {
    Fact oldFact = fact;
    fact = newFact;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrologPackage.CLAUSE__FACT, oldFact, newFact);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFact(Fact newFact)
  {
    if (newFact != fact)
    {
      NotificationChain msgs = null;
      if (fact != null)
        msgs = ((InternalEObject)fact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrologPackage.CLAUSE__FACT, null, msgs);
      if (newFact != null)
        msgs = ((InternalEObject)newFact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrologPackage.CLAUSE__FACT, null, msgs);
      msgs = basicSetFact(newFact, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.CLAUSE__FACT, newFact, newFact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs)
  {
    Rule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrologPackage.CLAUSE__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(Rule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrologPackage.CLAUSE__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrologPackage.CLAUSE__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.CLAUSE__RULE, newRule, newRule));
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
      case PrologPackage.CLAUSE__FACT:
        return basicSetFact(null, msgs);
      case PrologPackage.CLAUSE__RULE:
        return basicSetRule(null, msgs);
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
      case PrologPackage.CLAUSE__FACT:
        return getFact();
      case PrologPackage.CLAUSE__RULE:
        return getRule();
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
      case PrologPackage.CLAUSE__FACT:
        setFact((Fact)newValue);
        return;
      case PrologPackage.CLAUSE__RULE:
        setRule((Rule)newValue);
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
      case PrologPackage.CLAUSE__FACT:
        setFact((Fact)null);
        return;
      case PrologPackage.CLAUSE__RULE:
        setRule((Rule)null);
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
      case PrologPackage.CLAUSE__FACT:
        return fact != null;
      case PrologPackage.CLAUSE__RULE:
        return rule != null;
    }
    return super.eIsSet(featureID);
  }

} //ClauseImpl
