/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog.impl;

import de.htwdd.sf.beleg.s74838.prolog.PrologDsl;
import de.htwdd.sf.beleg.s74838.prolog.PrologPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
   * The default value of the '{@link #getProgram() <em>Program</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
  protected static final String PROGRAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProgram() <em>Program</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
  protected String program = PROGRAM_EDEFAULT;

  /**
   * The default value of the '{@link #getExquery() <em>Exquery</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExquery()
   * @generated
   * @ordered
   */
  protected static final String EXQUERY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExquery() <em>Exquery</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExquery()
   * @generated
   * @ordered
   */
  protected String exquery = EXQUERY_EDEFAULT;

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
  public String getProgram()
  {
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProgram(String newProgram)
  {
    String oldProgram = program;
    program = newProgram;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.PROLOG_DSL__PROGRAM, oldProgram, program));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExquery()
  {
    return exquery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExquery(String newExquery)
  {
    String oldExquery = exquery;
    exquery = newExquery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrologPackage.PROLOG_DSL__EXQUERY, oldExquery, exquery));
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
        setProgram((String)newValue);
        return;
      case PrologPackage.PROLOG_DSL__EXQUERY:
        setExquery((String)newValue);
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
        setProgram(PROGRAM_EDEFAULT);
        return;
      case PrologPackage.PROLOG_DSL__EXQUERY:
        setExquery(EXQUERY_EDEFAULT);
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
        return PROGRAM_EDEFAULT == null ? program != null : !PROGRAM_EDEFAULT.equals(program);
      case PrologPackage.PROLOG_DSL__EXQUERY:
        return EXQUERY_EDEFAULT == null ? exquery != null : !EXQUERY_EDEFAULT.equals(exquery);
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
    result.append(" (program: ");
    result.append(program);
    result.append(", exquery: ");
    result.append(exquery);
    result.append(')');
    return result.toString();
  }

} //PrologDslImpl
