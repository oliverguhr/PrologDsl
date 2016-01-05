/**
 * <copyright>
 * </copyright>
 *
 */
package de.htwdd.sf.beleg.s74838.prolog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.htwdd.sf.beleg.s74838.prolog.PrologFactory
 * @model kind="package"
 * @generated
 */
public interface PrologPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "prolog";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.htwdd.de/sf/beleg/s74838/Prolog";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "prolog";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PrologPackage eINSTANCE = de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl.init();

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl <em>Dsl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getPrologDsl()
   * @generated
   */
  int PROLOG_DSL = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_DSL__PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Exquery</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_DSL__EXQUERY = 1;

  /**
   * The number of structural features of the '<em>Dsl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_DSL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.ProgramImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CLAUSE = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.ExqueryImpl <em>Exquery</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.ExqueryImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getExquery()
   * @generated
   */
  int EXQUERY = 2;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUERY__QUERY = 0;

  /**
   * The number of structural features of the '<em>Exquery</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXQUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.QueryImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 3;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__PREDICATE = 0;

  /**
   * The feature id for the '<em><b>Nth Predicate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__NTH_PREDICATE = 1;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.ClauseImpl <em>Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.ClauseImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getClause()
   * @generated
   */
  int CLAUSE = 4;

  /**
   * The feature id for the '<em><b>Fact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE__FACT = 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE__RULE = 1;

  /**
   * The number of structural features of the '<em>Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.FactImpl <em>Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.FactImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getFact()
   * @generated
   */
  int FACT = 5;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__PREDICATE = 0;

  /**
   * The number of structural features of the '<em>Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.RuleImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getRule()
   * @generated
   */
  int RULE = 6;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__PREDICATE = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__QUERY = 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PredicateImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 7;

  /**
   * The feature id for the '<em><b>Functor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__FUNCTOR = 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__TERM = 1;

  /**
   * The feature id for the '<em><b>Nth Term</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__NTH_TERM = 2;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.TermImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getTerm()
   * @generated
   */
  int TERM = 8;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__TERM = 0;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.AtomImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 9;

  /**
   * The feature id for the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__ATOM = 0;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.ListImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getList()
   * @generated
   */
  int LIST = 10;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__LIST = 0;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.NotEmptyListImpl <em>Not Empty List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.NotEmptyListImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getNotEmptyList()
   * @generated
   */
  int NOT_EMPTY_LIST = 11;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EMPTY_LIST__LIST = LIST__LIST;

  /**
   * The feature id for the '<em><b>Folge</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EMPTY_LIST__FOLGE = LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not Empty List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EMPTY_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.FolgeImpl <em>Folge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.FolgeImpl
   * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getFolge()
   * @generated
   */
  int FOLGE = 12;

  /**
   * The feature id for the '<em><b>Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLGE__ATOM = 0;

  /**
   * The feature id for the '<em><b>Nth Atom</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLGE__NTH_ATOM = 1;

  /**
   * The number of structural features of the '<em>Folge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLGE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl <em>Dsl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologDsl
   * @generated
   */
  EClass getPrologDsl();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getProgram()
   * @see #getPrologDsl()
   * @generated
   */
  EReference getPrologDsl_Program();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getExquery <em>Exquery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exquery</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.PrologDsl#getExquery()
   * @see #getPrologDsl()
   * @generated
   */
  EReference getPrologDsl_Exquery();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link de.htwdd.sf.beleg.s74838.prolog.Program#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clause</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Program#getClause()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Clause();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Exquery <em>Exquery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exquery</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Exquery
   * @generated
   */
  EClass getExquery();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Exquery#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Exquery#getQuery()
   * @see #getExquery()
   * @generated
   */
  EReference getExquery_Query();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Query#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Query#getPredicate()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Predicate();

  /**
   * Returns the meta object for the containment reference list '{@link de.htwdd.sf.beleg.s74838.prolog.Query#getNthPredicate <em>Nth Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nth Predicate</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Query#getNthPredicate()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_NthPredicate();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Clause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clause</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Clause
   * @generated
   */
  EClass getClause();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Clause#getFact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fact</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Clause#getFact()
   * @see #getClause()
   * @generated
   */
  EReference getClause_Fact();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Clause#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Clause#getRule()
   * @see #getClause()
   * @generated
   */
  EReference getClause_Rule();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Fact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fact</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Fact
   * @generated
   */
  EClass getFact();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Fact#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Fact#getPredicate()
   * @see #getFact()
   * @generated
   */
  EReference getFact_Predicate();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Rule#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Rule#getPredicate()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Rule#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Rule#getQuery()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Query();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s74838.prolog.Predicate#getFunctor <em>Functor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Functor</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Predicate#getFunctor()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_Functor();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Predicate#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Predicate#getTerm()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Term();

  /**
   * Returns the meta object for the containment reference list '{@link de.htwdd.sf.beleg.s74838.prolog.Predicate#getNthTerm <em>Nth Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nth Term</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Predicate#getNthTerm()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_NthTerm();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Term#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Term#getTerm()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Term();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s74838.prolog.Atom#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atom</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Atom#getAtom()
   * @see #getAtom()
   * @generated
   */
  EAttribute getAtom_Atom();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s74838.prolog.List#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.List#getList()
   * @see #getList()
   * @generated
   */
  EAttribute getList_List();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.NotEmptyList <em>Not Empty List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Empty List</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.NotEmptyList
   * @generated
   */
  EClass getNotEmptyList();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.NotEmptyList#getFolge <em>Folge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Folge</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.NotEmptyList#getFolge()
   * @see #getNotEmptyList()
   * @generated
   */
  EReference getNotEmptyList_Folge();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s74838.prolog.Folge <em>Folge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Folge</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Folge
   * @generated
   */
  EClass getFolge();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s74838.prolog.Folge#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atom</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Folge#getAtom()
   * @see #getFolge()
   * @generated
   */
  EReference getFolge_Atom();

  /**
   * Returns the meta object for the containment reference list '{@link de.htwdd.sf.beleg.s74838.prolog.Folge#getNthAtom <em>Nth Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nth Atom</em>'.
   * @see de.htwdd.sf.beleg.s74838.prolog.Folge#getNthAtom()
   * @see #getFolge()
   * @generated
   */
  EReference getFolge_NthAtom();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PrologFactory getPrologFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl <em>Dsl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologDslImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getPrologDsl()
     * @generated
     */
    EClass PROLOG_DSL = eINSTANCE.getPrologDsl();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROLOG_DSL__PROGRAM = eINSTANCE.getPrologDsl_Program();

    /**
     * The meta object literal for the '<em><b>Exquery</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROLOG_DSL__EXQUERY = eINSTANCE.getPrologDsl_Exquery();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.ProgramImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CLAUSE = eINSTANCE.getProgram_Clause();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.ExqueryImpl <em>Exquery</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.ExqueryImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getExquery()
     * @generated
     */
    EClass EXQUERY = eINSTANCE.getExquery();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXQUERY__QUERY = eINSTANCE.getExquery_Query();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.QueryImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__PREDICATE = eINSTANCE.getQuery_Predicate();

    /**
     * The meta object literal for the '<em><b>Nth Predicate</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__NTH_PREDICATE = eINSTANCE.getQuery_NthPredicate();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.ClauseImpl <em>Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.ClauseImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getClause()
     * @generated
     */
    EClass CLAUSE = eINSTANCE.getClause();

    /**
     * The meta object literal for the '<em><b>Fact</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAUSE__FACT = eINSTANCE.getClause_Fact();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAUSE__RULE = eINSTANCE.getClause_Rule();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.FactImpl <em>Fact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.FactImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getFact()
     * @generated
     */
    EClass FACT = eINSTANCE.getFact();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__PREDICATE = eINSTANCE.getFact_Predicate();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.RuleImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__PREDICATE = eINSTANCE.getRule_Predicate();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__QUERY = eINSTANCE.getRule_Query();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PredicateImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Functor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__FUNCTOR = eINSTANCE.getPredicate_Functor();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__TERM = eINSTANCE.getPredicate_Term();

    /**
     * The meta object literal for the '<em><b>Nth Term</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__NTH_TERM = eINSTANCE.getPredicate_NthTerm();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.TermImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__TERM = eINSTANCE.getTerm_Term();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.AtomImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM__ATOM = eINSTANCE.getAtom_Atom();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.ListImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__LIST = eINSTANCE.getList_List();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.NotEmptyListImpl <em>Not Empty List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.NotEmptyListImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getNotEmptyList()
     * @generated
     */
    EClass NOT_EMPTY_LIST = eINSTANCE.getNotEmptyList();

    /**
     * The meta object literal for the '<em><b>Folge</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EMPTY_LIST__FOLGE = eINSTANCE.getNotEmptyList_Folge();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s74838.prolog.impl.FolgeImpl <em>Folge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.FolgeImpl
     * @see de.htwdd.sf.beleg.s74838.prolog.impl.PrologPackageImpl#getFolge()
     * @generated
     */
    EClass FOLGE = eINSTANCE.getFolge();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOLGE__ATOM = eINSTANCE.getFolge_Atom();

    /**
     * The meta object literal for the '<em><b>Nth Atom</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOLGE__NTH_ATOM = eINSTANCE.getFolge_NthAtom();

  }

} //PrologPackage
