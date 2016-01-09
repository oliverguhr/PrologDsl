/**
 */
package de.htwdd.sf.beleg.s74838.prolog.impl;

import de.htwdd.sf.beleg.s74838.prolog.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrologFactoryImpl extends EFactoryImpl implements PrologFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrologFactory init()
  {
    try
    {
      PrologFactory thePrologFactory = (PrologFactory)EPackage.Registry.INSTANCE.getEFactory(PrologPackage.eNS_URI);
      if (thePrologFactory != null)
      {
        return thePrologFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PrologFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrologFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PrologPackage.PROLOG_DSL: return createPrologDsl();
      case PrologPackage.PROGRAM: return createProgram();
      case PrologPackage.EXQUERY: return createExquery();
      case PrologPackage.QUERY: return createQuery();
      case PrologPackage.CLAUSE: return createClause();
      case PrologPackage.FACT: return createFact();
      case PrologPackage.RULE: return createRule();
      case PrologPackage.PREDICATE: return createPredicate();
      case PrologPackage.TERM: return createTerm();
      case PrologPackage.ATOM: return createAtom();
      case PrologPackage.LIST: return createList();
      case PrologPackage.NOT_EMPTY_LIST: return createNotEmptyList();
      case PrologPackage.FOLGE: return createFolge();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrologDsl createPrologDsl()
  {
    PrologDslImpl prologDsl = new PrologDslImpl();
    return prologDsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exquery createExquery()
  {
    ExqueryImpl exquery = new ExqueryImpl();
    return exquery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clause createClause()
  {
    ClauseImpl clause = new ClauseImpl();
    return clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fact createFact()
  {
    FactImpl fact = new FactImpl();
    return fact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate createPredicate()
  {
    PredicateImpl predicate = new PredicateImpl();
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotEmptyList createNotEmptyList()
  {
    NotEmptyListImpl notEmptyList = new NotEmptyListImpl();
    return notEmptyList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Folge createFolge()
  {
    FolgeImpl folge = new FolgeImpl();
    return folge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrologPackage getPrologPackage()
  {
    return (PrologPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PrologPackage getPackage()
  {
    return PrologPackage.eINSTANCE;
  }

} //PrologFactoryImpl
