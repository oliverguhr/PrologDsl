/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog.impl;

import de.htwdd.sf.beleg.s74838.prolog.PrologDsl;
import de.htwdd.sf.beleg.s74838.prolog.PrologFactory;
import de.htwdd.sf.beleg.s74838.prolog.PrologPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrologPackageImpl extends EPackageImpl implements PrologPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prologDslEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PrologPackageImpl()
  {
    super(eNS_URI, PrologFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PrologPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PrologPackage init()
  {
    if (isInited) return (PrologPackage)EPackage.Registry.INSTANCE.getEPackage(PrologPackage.eNS_URI);

    // Obtain or create and register package
    PrologPackageImpl thePrologPackage = (PrologPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrologPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrologPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePrologPackage.createPackageContents();

    // Initialize created meta-data
    thePrologPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePrologPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PrologPackage.eNS_URI, thePrologPackage);
    return thePrologPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrologDsl()
  {
    return prologDslEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrologDsl_Program()
  {
    return (EAttribute)prologDslEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrologDsl_Exquery()
  {
    return (EAttribute)prologDslEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrologFactory getPrologFactory()
  {
    return (PrologFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    prologDslEClass = createEClass(PROLOG_DSL);
    createEAttribute(prologDslEClass, PROLOG_DSL__PROGRAM);
    createEAttribute(prologDslEClass, PROLOG_DSL__EXQUERY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(prologDslEClass, PrologDsl.class, "PrologDsl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrologDsl_Program(), ecorePackage.getEString(), "program", null, 0, 1, PrologDsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrologDsl_Exquery(), ecorePackage.getEString(), "exquery", null, 0, 1, PrologDsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PrologPackageImpl
