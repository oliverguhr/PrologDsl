package de.htwdd.sf.beleg.s74838.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.htwdd.sf.beleg.s74838.prolog.Atom;
import de.htwdd.sf.beleg.s74838.prolog.Clause;
import de.htwdd.sf.beleg.s74838.prolog.Exquery;
import de.htwdd.sf.beleg.s74838.prolog.Fact;
import de.htwdd.sf.beleg.s74838.prolog.Folge;
import de.htwdd.sf.beleg.s74838.prolog.List;
import de.htwdd.sf.beleg.s74838.prolog.NotEmptyList;
import de.htwdd.sf.beleg.s74838.prolog.Predicate;
import de.htwdd.sf.beleg.s74838.prolog.Program;
import de.htwdd.sf.beleg.s74838.prolog.PrologDsl;
import de.htwdd.sf.beleg.s74838.prolog.PrologPackage;
import de.htwdd.sf.beleg.s74838.prolog.Query;
import de.htwdd.sf.beleg.s74838.prolog.Rule;
import de.htwdd.sf.beleg.s74838.prolog.Term;
import de.htwdd.sf.beleg.s74838.services.PrologGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractPrologSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected PrologGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PrologPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PrologPackage.ATOM:
				if(context == grammarAccess.getAtomRule()) {
					sequence_Atom(context, (Atom) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.CLAUSE:
				if(context == grammarAccess.getClauseRule()) {
					sequence_Clause(context, (Clause) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.EXQUERY:
				if(context == grammarAccess.getExqueryRule()) {
					sequence_Exquery(context, (Exquery) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.FACT:
				if(context == grammarAccess.getFactRule()) {
					sequence_Fact(context, (Fact) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.FOLGE:
				if(context == grammarAccess.getFolgeRule()) {
					sequence_Folge(context, (Folge) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.LIST:
				if(context == grammarAccess.getListRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.NOT_EMPTY_LIST:
				if(context == grammarAccess.getListRule() ||
				   context == grammarAccess.getNotEmptyListRule()) {
					sequence_NotEmptyList(context, (NotEmptyList) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.PREDICATE:
				if(context == grammarAccess.getPredicateRule()) {
					sequence_Predicate(context, (Predicate) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.PROLOG_DSL:
				if(context == grammarAccess.getPrologDslRule()) {
					sequence_PrologDsl(context, (PrologDsl) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.QUERY:
				if(context == grammarAccess.getQueryRule()) {
					sequence_Query(context, (Query) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case PrologPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (atom=ident | atom=variable | atom=Number)
	 *
	 * Features:
	 *    atom[0, 3]
	 */
	protected void sequence_Atom(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fact=Fact | rule=Rule)
	 *
	 * Features:
	 *    fact[0, 1]
	 *         EXCLUDE_IF_SET rule
	 *    rule[0, 1]
	 *         EXCLUDE_IF_SET fact
	 */
	protected void sequence_Clause(EObject context, Clause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     query=Query
	 *
	 * Features:
	 *    query[1, 1]
	 */
	protected void sequence_Exquery(EObject context, Exquery semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrologPackage.Literals.EXQUERY__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrologPackage.Literals.EXQUERY__QUERY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     predicate=Predicate
	 *
	 * Features:
	 *    predicate[1, 1]
	 */
	protected void sequence_Fact(EObject context, Fact semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrologPackage.Literals.FACT__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrologPackage.Literals.FACT__PREDICATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFactAccess().getPredicatePredicateParserRuleCall_0_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (atom=Atom nthAtom+=Atom*)
	 *
	 * Features:
	 *    atom[1, 1]
	 *    nthAtom[0, *]
	 */
	protected void sequence_Folge(EObject context, Folge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list='[]'
	 *
	 * Features:
	 *    list[1, 1]
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrologPackage.Literals.LIST__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrologPackage.Literals.LIST__LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     folge=Folge
	 *
	 * Features:
	 *    folge[1, 1]
	 */
	protected void sequence_NotEmptyList(EObject context, NotEmptyList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (functor=Functor term=Term nthTerm+=Term*)
	 *
	 * Features:
	 *    functor[1, 1]
	 *    term[1, 1]
	 *    nthTerm[0, *]
	 */
	protected void sequence_Predicate(EObject context, Predicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     clause+=Clause+
	 *
	 * Features:
	 *    clause[1, *]
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (program=Program exquery=Exquery)
	 *
	 * Features:
	 *    program[1, 1]
	 *    exquery[1, 1]
	 */
	protected void sequence_PrologDsl(EObject context, PrologDsl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrologPackage.Literals.PROLOG_DSL__PROGRAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrologPackage.Literals.PROLOG_DSL__PROGRAM));
			if(transientValues.isValueTransient(semanticObject, PrologPackage.Literals.PROLOG_DSL__EXQUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrologPackage.Literals.PROLOG_DSL__EXQUERY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0(), semanticObject.getProgram());
		feeder.accept(grammarAccess.getPrologDslAccess().getExqueryExqueryParserRuleCall_1_0(), semanticObject.getExquery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (predicate=Predicate nthPredicate+=Predicate*)
	 *
	 * Features:
	 *    predicate[1, 1]
	 *    nthPredicate[0, *]
	 */
	protected void sequence_Query(EObject context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (predicate=Predicate query=Query)
	 *
	 * Features:
	 *    predicate[1, 1]
	 *    query[1, 1]
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrologPackage.Literals.RULE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrologPackage.Literals.RULE__PREDICATE));
			if(transientValues.isValueTransient(semanticObject, PrologPackage.Literals.RULE__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrologPackage.Literals.RULE__QUERY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRuleAccess().getPredicatePredicateParserRuleCall_0_0(), semanticObject.getPredicate());
		feeder.accept(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (term=Atom | term=List)
	 *
	 * Features:
	 *    term[0, 2]
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
