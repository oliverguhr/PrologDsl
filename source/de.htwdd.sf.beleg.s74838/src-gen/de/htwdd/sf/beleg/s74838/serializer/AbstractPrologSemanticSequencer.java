package de.htwdd.sf.beleg.s74838.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.htwdd.sf.beleg.s74838.prolog.PrologDsl;
import de.htwdd.sf.beleg.s74838.prolog.PrologPackage;
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
			case PrologPackage.PROLOG_DSL:
				if(context == grammarAccess.getPrologDslRule()) {
					sequence_PrologDsl(context, (PrologDsl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
}
