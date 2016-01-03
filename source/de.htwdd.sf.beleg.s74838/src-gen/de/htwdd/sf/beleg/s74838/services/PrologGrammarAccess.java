/*
* generated by Xtext
*/

package de.htwdd.sf.beleg.s74838.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PrologGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PrologDslElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PrologDsl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cProgramAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cProgramProgramParserRuleCall_0_0 = (RuleCall)cProgramAssignment_0.eContents().get(0);
		private final Assignment cExqueryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExqueryExqueryParserRuleCall_1_0 = (RuleCall)cExqueryAssignment_1.eContents().get(0);
		
		//PrologDsl:
		//	program=Program exquery=Exquery;
		public ParserRule getRule() { return rule; }

		//program=Program exquery=Exquery
		public Group getGroup() { return cGroup; }

		//program=Program
		public Assignment getProgramAssignment_0() { return cProgramAssignment_0; }

		//Program
		public RuleCall getProgramProgramParserRuleCall_0_0() { return cProgramProgramParserRuleCall_0_0; }

		//exquery=Exquery
		public Assignment getExqueryAssignment_1() { return cExqueryAssignment_1; }

		//Exquery
		public RuleCall getExqueryExqueryParserRuleCall_1_0() { return cExqueryExqueryParserRuleCall_1_0; }
	}

	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cClauseParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cClauseParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Program:
		//	Clause Clause*;
		public ParserRule getRule() { return rule; }

		//Clause Clause*
		public Group getGroup() { return cGroup; }

		//Clause
		public RuleCall getClauseParserRuleCall_0() { return cClauseParserRuleCall_0; }

		//Clause*
		public RuleCall getClauseParserRuleCall_1() { return cClauseParserRuleCall_1; }
	}

	public class ExqueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Exquery");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionMarkHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cQueryParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Exquery:
		//	"?-" Query ".";
		public ParserRule getRule() { return rule; }

		//"?-" Query "."
		public Group getGroup() { return cGroup; }

		//"?-"
		public Keyword getQuestionMarkHyphenMinusKeyword_0() { return cQuestionMarkHyphenMinusKeyword_0; }

		//Query
		public RuleCall getQueryParserRuleCall_1() { return cQueryParserRuleCall_1; }

		//"."
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
	}

	public class QueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Query");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPredicateParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cPredicateParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Query:
		//	Predicate ("," Predicate)*;
		public ParserRule getRule() { return rule; }

		//Predicate ("," Predicate)*
		public Group getGroup() { return cGroup; }

		//Predicate
		public RuleCall getPredicateParserRuleCall_0() { return cPredicateParserRuleCall_0; }

		//("," Predicate)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//Predicate
		public RuleCall getPredicateParserRuleCall_1_1() { return cPredicateParserRuleCall_1_1; }
	}

	public class ClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Clause");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFactParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Clause:
		//	Fact | Rule;
		public ParserRule getRule() { return rule; }

		//Fact | Rule
		public Alternatives getAlternatives() { return cAlternatives; }

		//Fact
		public RuleCall getFactParserRuleCall_0() { return cFactParserRuleCall_0; }

		//Rule
		public RuleCall getRuleParserRuleCall_1() { return cRuleParserRuleCall_1; }
	}

	public class FactElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Fact");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPredicateParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Fact:
		//	Predicate ".";
		public ParserRule getRule() { return rule; }

		//Predicate "."
		public Group getGroup() { return cGroup; }

		//Predicate
		public RuleCall getPredicateParserRuleCall_0() { return cPredicateParserRuleCall_0; }

		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
	}

	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPredicateParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cQueryParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Rule:
		//	Predicate ":-" Query ".";
		public ParserRule getRule() { return rule; }

		//Predicate ":-" Query "."
		public Group getGroup() { return cGroup; }

		//Predicate
		public RuleCall getPredicateParserRuleCall_0() { return cPredicateParserRuleCall_0; }

		//":-"
		public Keyword getColonHyphenMinusKeyword_1() { return cColonHyphenMinusKeyword_1; }

		//Query
		public RuleCall getQueryParserRuleCall_2() { return cQueryParserRuleCall_2; }

		//"."
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
	}

	public class PredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Predicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFunctorParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cTermParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final RuleCall cTermParserRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Predicate:
		//	Functor "(" Term ("," Term)* ")";
		public ParserRule getRule() { return rule; }

		//Functor "(" Term ("," Term)* ")"
		public Group getGroup() { return cGroup; }

		//Functor
		public RuleCall getFunctorParserRuleCall_0() { return cFunctorParserRuleCall_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//Term
		public RuleCall getTermParserRuleCall_2() { return cTermParserRuleCall_2; }

		//("," Term)*
		public Group getGroup_3() { return cGroup_3; }

		//","
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }

		//Term
		public RuleCall getTermParserRuleCall_3_1() { return cTermParserRuleCall_3_1; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class FunctorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Functor");
		private final RuleCall cIdentTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Functor:
		//	ident;
		public ParserRule getRule() { return rule; }

		//ident
		public RuleCall getIdentTerminalRuleCall() { return cIdentTerminalRuleCall; }
	}

	public class TermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Term");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAtomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cListParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Term:
		//	Atom | List;
		public ParserRule getRule() { return rule; }

		//Atom | List
		public Alternatives getAlternatives() { return cAlternatives; }

		//Atom
		public RuleCall getAtomParserRuleCall_0() { return cAtomParserRuleCall_0; }

		//List
		public RuleCall getListParserRuleCall_1() { return cListParserRuleCall_1; }
	}

	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Atom");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIdentTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVariableTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Atom:
		//	ident | variable | Number;
		public ParserRule getRule() { return rule; }

		//ident | variable | Number
		public Alternatives getAlternatives() { return cAlternatives; }

		//ident
		public RuleCall getIdentTerminalRuleCall_0() { return cIdentTerminalRuleCall_0; }

		//variable
		public RuleCall getVariableTerminalRuleCall_1() { return cVariableTerminalRuleCall_1; }

		//Number
		public RuleCall getNumberParserRuleCall_2() { return cNumberParserRuleCall_2; }
	}

	public class ListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "List");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketRightSquareBracketKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final RuleCall cNotEmptyListParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//List:
		//	"[]" | NotEmptyList;
		public ParserRule getRule() { return rule; }

		//"[]" | NotEmptyList
		public Alternatives getAlternatives() { return cAlternatives; }

		//"[]"
		public Keyword getLeftSquareBracketRightSquareBracketKeyword_0() { return cLeftSquareBracketRightSquareBracketKeyword_0; }

		//NotEmptyList
		public RuleCall getNotEmptyListParserRuleCall_1() { return cNotEmptyListParserRuleCall_1; }
	}

	public class NotEmptyListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NotEmptyList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cFolgeParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//NotEmptyList:
		//	"[" Folge "]";
		public ParserRule getRule() { return rule; }

		//"[" Folge "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//Folge
		public RuleCall getFolgeParserRuleCall_1() { return cFolgeParserRuleCall_1; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}

	public class FolgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Folge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAtomParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cAtomParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Folge:
		//	Atom ("," Atom)*;
		public ParserRule getRule() { return rule; }

		//Atom ("," Atom)*
		public Group getGroup() { return cGroup; }

		//Atom
		public RuleCall getAtomParserRuleCall_0() { return cAtomParserRuleCall_0; }

		//("," Atom)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//Atom
		public RuleCall getAtomParserRuleCall_1_1() { return cAtomParserRuleCall_1_1; }
	}

	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Number");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Number:
		//	INT;
		public ParserRule getRule() { return rule; }

		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	
	
	private PrologDslElements pPrologDsl;
	private ProgramElements pProgram;
	private ExqueryElements pExquery;
	private QueryElements pQuery;
	private ClauseElements pClause;
	private FactElements pFact;
	private RuleElements pRule;
	private PredicateElements pPredicate;
	private FunctorElements pFunctor;
	private TermElements pTerm;
	private AtomElements pAtom;
	private ListElements pList;
	private NotEmptyListElements pNotEmptyList;
	private FolgeElements pFolge;
	private NumberElements pNumber;
	private TerminalRule tVariable;
	private TerminalRule tIdent;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public PrologGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PrologDsl:
	//	program=Program exquery=Exquery;
	public PrologDslElements getPrologDslAccess() {
		return (pPrologDsl != null) ? pPrologDsl : (pPrologDsl = new PrologDslElements());
	}
	
	public ParserRule getPrologDslRule() {
		return getPrologDslAccess().getRule();
	}

	//Program:
	//	Clause Clause*;
	public ProgramElements getProgramAccess() {
		return (pProgram != null) ? pProgram : (pProgram = new ProgramElements());
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}

	//Exquery:
	//	"?-" Query ".";
	public ExqueryElements getExqueryAccess() {
		return (pExquery != null) ? pExquery : (pExquery = new ExqueryElements());
	}
	
	public ParserRule getExqueryRule() {
		return getExqueryAccess().getRule();
	}

	//Query:
	//	Predicate ("," Predicate)*;
	public QueryElements getQueryAccess() {
		return (pQuery != null) ? pQuery : (pQuery = new QueryElements());
	}
	
	public ParserRule getQueryRule() {
		return getQueryAccess().getRule();
	}

	//Clause:
	//	Fact | Rule;
	public ClauseElements getClauseAccess() {
		return (pClause != null) ? pClause : (pClause = new ClauseElements());
	}
	
	public ParserRule getClauseRule() {
		return getClauseAccess().getRule();
	}

	//Fact:
	//	Predicate ".";
	public FactElements getFactAccess() {
		return (pFact != null) ? pFact : (pFact = new FactElements());
	}
	
	public ParserRule getFactRule() {
		return getFactAccess().getRule();
	}

	//Rule:
	//	Predicate ":-" Query ".";
	public RuleElements getRuleAccess() {
		return (pRule != null) ? pRule : (pRule = new RuleElements());
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}

	//Predicate:
	//	Functor "(" Term ("," Term)* ")";
	public PredicateElements getPredicateAccess() {
		return (pPredicate != null) ? pPredicate : (pPredicate = new PredicateElements());
	}
	
	public ParserRule getPredicateRule() {
		return getPredicateAccess().getRule();
	}

	//Functor:
	//	ident;
	public FunctorElements getFunctorAccess() {
		return (pFunctor != null) ? pFunctor : (pFunctor = new FunctorElements());
	}
	
	public ParserRule getFunctorRule() {
		return getFunctorAccess().getRule();
	}

	//Term:
	//	Atom | List;
	public TermElements getTermAccess() {
		return (pTerm != null) ? pTerm : (pTerm = new TermElements());
	}
	
	public ParserRule getTermRule() {
		return getTermAccess().getRule();
	}

	//Atom:
	//	ident | variable | Number;
	public AtomElements getAtomAccess() {
		return (pAtom != null) ? pAtom : (pAtom = new AtomElements());
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}

	//List:
	//	"[]" | NotEmptyList;
	public ListElements getListAccess() {
		return (pList != null) ? pList : (pList = new ListElements());
	}
	
	public ParserRule getListRule() {
		return getListAccess().getRule();
	}

	//NotEmptyList:
	//	"[" Folge "]";
	public NotEmptyListElements getNotEmptyListAccess() {
		return (pNotEmptyList != null) ? pNotEmptyList : (pNotEmptyList = new NotEmptyListElements());
	}
	
	public ParserRule getNotEmptyListRule() {
		return getNotEmptyListAccess().getRule();
	}

	//Folge:
	//	Atom ("," Atom)*;
	public FolgeElements getFolgeAccess() {
		return (pFolge != null) ? pFolge : (pFolge = new FolgeElements());
	}
	
	public ParserRule getFolgeRule() {
		return getFolgeAccess().getRule();
	}

	//Number:
	//	INT;
	public NumberElements getNumberAccess() {
		return (pNumber != null) ? pNumber : (pNumber = new NumberElements());
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	//terminal variable:
	//	"A".."Z";
	public TerminalRule getVariableRule() {
		return (tVariable != null) ? tVariable : (tVariable = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "variable"));
	} 

	//terminal ident:
	//	"a".."z" ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIdentRule() {
		return (tIdent != null) ? tIdent : (tIdent = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ident"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
