/*
* generated by Xtext
*/
grammar InternalProlog;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package de.htwdd.sf.beleg.s74838.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.htwdd.sf.beleg.s74838.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.htwdd.sf.beleg.s74838.services.PrologGrammarAccess;

}

@parser::members {
 
 	private PrologGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PrologGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRulePrologDsl
entryRulePrologDsl 
:
{ before(grammarAccess.getPrologDslRule()); }
	 rulePrologDsl
{ after(grammarAccess.getPrologDslRule()); } 
	 EOF 
;

// Rule PrologDsl
rulePrologDsl
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPrologDslAccess().getGroup()); }
(rule__PrologDsl__Group__0)
{ after(grammarAccess.getPrologDslAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProgram
entryRuleProgram 
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProgramAccess().getGroup()); }
(rule__Program__Group__0)
{ after(grammarAccess.getProgramAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExquery
entryRuleExquery 
:
{ before(grammarAccess.getExqueryRule()); }
	 ruleExquery
{ after(grammarAccess.getExqueryRule()); } 
	 EOF 
;

// Rule Exquery
ruleExquery
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExqueryAccess().getGroup()); }
(rule__Exquery__Group__0)
{ after(grammarAccess.getExqueryAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQuery
entryRuleQuery 
:
{ before(grammarAccess.getQueryRule()); }
	 ruleQuery
{ after(grammarAccess.getQueryRule()); } 
	 EOF 
;

// Rule Query
ruleQuery
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQueryAccess().getGroup()); }
(rule__Query__Group__0)
{ after(grammarAccess.getQueryAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleClause
entryRuleClause 
:
{ before(grammarAccess.getClauseRule()); }
	 ruleClause
{ after(grammarAccess.getClauseRule()); } 
	 EOF 
;

// Rule Clause
ruleClause
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getClauseAccess().getAlternatives()); }
(rule__Clause__Alternatives)
{ after(grammarAccess.getClauseAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFact
entryRuleFact 
:
{ before(grammarAccess.getFactRule()); }
	 ruleFact
{ after(grammarAccess.getFactRule()); } 
	 EOF 
;

// Rule Fact
ruleFact
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFactAccess().getGroup()); }
(rule__Fact__Group__0)
{ after(grammarAccess.getFactAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRule
entryRuleRule 
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRuleAccess().getGroup()); }
(rule__Rule__Group__0)
{ after(grammarAccess.getRuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePredicate
entryRulePredicate 
:
{ before(grammarAccess.getPredicateRule()); }
	 rulePredicate
{ after(grammarAccess.getPredicateRule()); } 
	 EOF 
;

// Rule Predicate
rulePredicate
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPredicateAccess().getGroup()); }
(rule__Predicate__Group__0)
{ after(grammarAccess.getPredicateAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFunctor
entryRuleFunctor 
:
{ before(grammarAccess.getFunctorRule()); }
	 ruleFunctor
{ after(grammarAccess.getFunctorRule()); } 
	 EOF 
;

// Rule Functor
ruleFunctor
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFunctorAccess().getIdentTerminalRuleCall()); }
	RULE_IDENT
{ after(grammarAccess.getFunctorAccess().getIdentTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTerm
entryRuleTerm 
:
{ before(grammarAccess.getTermRule()); }
	 ruleTerm
{ after(grammarAccess.getTermRule()); } 
	 EOF 
;

// Rule Term
ruleTerm
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTermAccess().getAlternatives()); }
(rule__Term__Alternatives)
{ after(grammarAccess.getTermAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAtom
entryRuleAtom 
:
{ before(grammarAccess.getAtomRule()); }
	 ruleAtom
{ after(grammarAccess.getAtomRule()); } 
	 EOF 
;

// Rule Atom
ruleAtom
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAtomAccess().getAlternatives()); }
(rule__Atom__Alternatives)
{ after(grammarAccess.getAtomAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleList
entryRuleList 
:
{ before(grammarAccess.getListRule()); }
	 ruleList
{ after(grammarAccess.getListRule()); } 
	 EOF 
;

// Rule List
ruleList
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getListAccess().getAlternatives()); }
(rule__List__Alternatives)
{ after(grammarAccess.getListAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNotEmptyList
entryRuleNotEmptyList 
:
{ before(grammarAccess.getNotEmptyListRule()); }
	 ruleNotEmptyList
{ after(grammarAccess.getNotEmptyListRule()); } 
	 EOF 
;

// Rule NotEmptyList
ruleNotEmptyList
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNotEmptyListAccess().getGroup()); }
(rule__NotEmptyList__Group__0)
{ after(grammarAccess.getNotEmptyListAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFolge
entryRuleFolge 
:
{ before(grammarAccess.getFolgeRule()); }
	 ruleFolge
{ after(grammarAccess.getFolgeRule()); } 
	 EOF 
;

// Rule Folge
ruleFolge
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFolgeAccess().getGroup()); }
(rule__Folge__Group__0)
{ after(grammarAccess.getFolgeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNumber
entryRuleNumber 
:
{ before(grammarAccess.getNumberRule()); }
	 ruleNumber
{ after(grammarAccess.getNumberRule()); } 
	 EOF 
;

// Rule Number
ruleNumber
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); }
	RULE_INT
{ after(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Clause__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClauseAccess().getFactParserRuleCall_0()); }
	ruleFact
{ after(grammarAccess.getClauseAccess().getFactParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getClauseAccess().getRuleParserRuleCall_1()); }
	ruleRule
{ after(grammarAccess.getClauseAccess().getRuleParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTermAccess().getAtomParserRuleCall_0()); }
	ruleAtom
{ after(grammarAccess.getTermAccess().getAtomParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTermAccess().getListParserRuleCall_1()); }
	ruleList
{ after(grammarAccess.getTermAccess().getListParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomAccess().getIdentTerminalRuleCall_0()); }
	RULE_IDENT
{ after(grammarAccess.getAtomAccess().getIdentTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAtomAccess().getVariableTerminalRuleCall_1()); }
	RULE_VARIABLE
{ after(grammarAccess.getAtomAccess().getVariableTerminalRuleCall_1()); }
)

    |(
{ before(grammarAccess.getAtomAccess().getNumberParserRuleCall_2()); }
	ruleNumber
{ after(grammarAccess.getAtomAccess().getNumberParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__List__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); }

	'[]' 

{ after(grammarAccess.getListAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); }
)

    |(
{ before(grammarAccess.getListAccess().getNotEmptyListParserRuleCall_1()); }
	ruleNotEmptyList
{ after(grammarAccess.getListAccess().getNotEmptyListParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__PrologDsl__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PrologDsl__Group__0__Impl
	rule__PrologDsl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrologDsl__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrologDslAccess().getProgramAssignment_0()); }
(rule__PrologDsl__ProgramAssignment_0)
{ after(grammarAccess.getPrologDslAccess().getProgramAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PrologDsl__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PrologDsl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrologDsl__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrologDslAccess().getExqueryAssignment_1()); }
(rule__PrologDsl__ExqueryAssignment_1)
{ after(grammarAccess.getPrologDslAccess().getExqueryAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Program__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Program__Group__0__Impl
	rule__Program__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProgramAccess().getClauseParserRuleCall_0()); }
	ruleClause
{ after(grammarAccess.getProgramAccess().getClauseParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Program__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Program__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProgramAccess().getClauseParserRuleCall_1()); }
(	ruleClause)*
{ after(grammarAccess.getProgramAccess().getClauseParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Exquery__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Exquery__Group__0__Impl
	rule__Exquery__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exquery__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); }

	'?-' 

{ after(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Exquery__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Exquery__Group__1__Impl
	rule__Exquery__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Exquery__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExqueryAccess().getQueryParserRuleCall_1()); }
	ruleQuery
{ after(grammarAccess.getExqueryAccess().getQueryParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Exquery__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Exquery__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exquery__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); }

	'.' 

{ after(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Query__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Query__Group__0__Impl
	rule__Query__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQueryAccess().getPredicateParserRuleCall_0()); }
	rulePredicate
{ after(grammarAccess.getQueryAccess().getPredicateParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Query__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Query__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQueryAccess().getGroup_1()); }
(rule__Query__Group_1__0)*
{ after(grammarAccess.getQueryAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Query__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Query__Group_1__0__Impl
	rule__Query__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQueryAccess().getCommaKeyword_1_0()); }

	',' 

{ after(grammarAccess.getQueryAccess().getCommaKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Query__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Query__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQueryAccess().getPredicateParserRuleCall_1_1()); }
	rulePredicate
{ after(grammarAccess.getQueryAccess().getPredicateParserRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Fact__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Fact__Group__0__Impl
	rule__Fact__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Fact__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFactAccess().getPredicateParserRuleCall_0()); }
	rulePredicate
{ after(grammarAccess.getFactAccess().getPredicateParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Fact__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Fact__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Fact__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFactAccess().getFullStopKeyword_1()); }

	'.' 

{ after(grammarAccess.getFactAccess().getFullStopKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Rule__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getPredicateParserRuleCall_0()); }
	rulePredicate
{ after(grammarAccess.getRuleAccess().getPredicateParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1()); }

	':-' 

{ after(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__2__Impl
	rule__Rule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getQueryParserRuleCall_2()); }
	ruleQuery
{ after(grammarAccess.getRuleAccess().getQueryParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rule__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRuleAccess().getFullStopKeyword_3()); }

	'.' 

{ after(grammarAccess.getRuleAccess().getFullStopKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Predicate__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Predicate__Group__0__Impl
	rule__Predicate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Predicate__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPredicateAccess().getFunctorParserRuleCall_0()); }
	ruleFunctor
{ after(grammarAccess.getPredicateAccess().getFunctorParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Predicate__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Predicate__Group__1__Impl
	rule__Predicate__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Predicate__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Predicate__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Predicate__Group__2__Impl
	rule__Predicate__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Predicate__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPredicateAccess().getTermParserRuleCall_2()); }
	ruleTerm
{ after(grammarAccess.getPredicateAccess().getTermParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Predicate__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Predicate__Group__3__Impl
	rule__Predicate__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Predicate__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPredicateAccess().getGroup_3()); }
(rule__Predicate__Group_3__0)*
{ after(grammarAccess.getPredicateAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Predicate__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Predicate__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Predicate__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); }

	')' 

{ after(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Predicate__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Predicate__Group_3__0__Impl
	rule__Predicate__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Predicate__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); }

	',' 

{ after(grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Predicate__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Predicate__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Predicate__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPredicateAccess().getTermParserRuleCall_3_1()); }
	ruleTerm
{ after(grammarAccess.getPredicateAccess().getTermParserRuleCall_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__NotEmptyList__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NotEmptyList__Group__0__Impl
	rule__NotEmptyList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NotEmptyList__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotEmptyListAccess().getLeftSquareBracketKeyword_0()); }

	'[' 

{ after(grammarAccess.getNotEmptyListAccess().getLeftSquareBracketKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NotEmptyList__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NotEmptyList__Group__1__Impl
	rule__NotEmptyList__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NotEmptyList__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotEmptyListAccess().getFolgeParserRuleCall_1()); }
	ruleFolge
{ after(grammarAccess.getNotEmptyListAccess().getFolgeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NotEmptyList__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NotEmptyList__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NotEmptyList__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNotEmptyListAccess().getRightSquareBracketKeyword_2()); }

	']' 

{ after(grammarAccess.getNotEmptyListAccess().getRightSquareBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Folge__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folge__Group__0__Impl
	rule__Folge__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Folge__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolgeAccess().getAtomParserRuleCall_0()); }
	ruleAtom
{ after(grammarAccess.getFolgeAccess().getAtomParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folge__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folge__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Folge__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolgeAccess().getGroup_1()); }
(rule__Folge__Group_1__0)*
{ after(grammarAccess.getFolgeAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Folge__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folge__Group_1__0__Impl
	rule__Folge__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Folge__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); }

	',' 

{ after(grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folge__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folge__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Folge__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolgeAccess().getAtomParserRuleCall_1_1()); }
	ruleAtom
{ after(grammarAccess.getFolgeAccess().getAtomParserRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__PrologDsl__ProgramAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0()); }
	ruleProgram{ after(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PrologDsl__ExqueryAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrologDslAccess().getExqueryExqueryParserRuleCall_1_0()); }
	ruleExquery{ after(grammarAccess.getPrologDslAccess().getExqueryExqueryParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_VARIABLE : 'A'..'Z';

RULE_IDENT : 'a'..'z' ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


