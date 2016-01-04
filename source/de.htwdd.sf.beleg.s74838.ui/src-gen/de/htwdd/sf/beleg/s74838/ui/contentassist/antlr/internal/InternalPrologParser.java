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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPrologParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_INT", "RULE_VARIABLE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?-'", "'.'", "','", "':-'", "'('", "')'", "'['", "']'", "'[]'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_VARIABLE=6;
    public static final int RULE_IDENT=4;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalPrologParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPrologParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPrologParser.tokenNames; }
    public String getGrammarFileName() { return "../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g"; }


     
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




    // $ANTLR start "entryRulePrologDsl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:60:1: entryRulePrologDsl : rulePrologDsl EOF ;
    public final void entryRulePrologDsl() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:61:1: ( rulePrologDsl EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:62:1: rulePrologDsl EOF
            {
             before(grammarAccess.getPrologDslRule()); 
            pushFollow(FOLLOW_rulePrologDsl_in_entryRulePrologDsl61);
            rulePrologDsl();

            state._fsp--;

             after(grammarAccess.getPrologDslRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrologDsl68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrologDsl"


    // $ANTLR start "rulePrologDsl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:69:1: rulePrologDsl : ( ( rule__PrologDsl__Group__0 ) ) ;
    public final void rulePrologDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:73:2: ( ( ( rule__PrologDsl__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:74:1: ( ( rule__PrologDsl__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:74:1: ( ( rule__PrologDsl__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:75:1: ( rule__PrologDsl__Group__0 )
            {
             before(grammarAccess.getPrologDslAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:76:1: ( rule__PrologDsl__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:76:2: rule__PrologDsl__Group__0
            {
            pushFollow(FOLLOW_rule__PrologDsl__Group__0_in_rulePrologDsl94);
            rule__PrologDsl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrologDslAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrologDsl"


    // $ANTLR start "entryRuleProgram"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:88:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:89:1: ( ruleProgram EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:90:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram121);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:97:1: ruleProgram : ( ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:101:2: ( ( ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:102:1: ( ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:102:1: ( ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:103:1: ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:103:1: ( ( rule__Program__ClauseAssignment ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:104:1: ( rule__Program__ClauseAssignment )
            {
             before(grammarAccess.getProgramAccess().getClauseAssignment()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:105:1: ( rule__Program__ClauseAssignment )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:105:2: rule__Program__ClauseAssignment
            {
            pushFollow(FOLLOW_rule__Program__ClauseAssignment_in_ruleProgram156);
            rule__Program__ClauseAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getClauseAssignment()); 

            }

            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:108:1: ( ( rule__Program__ClauseAssignment )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:109:1: ( rule__Program__ClauseAssignment )*
            {
             before(grammarAccess.getProgramAccess().getClauseAssignment()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:110:1: ( rule__Program__ClauseAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:110:2: rule__Program__ClauseAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__ClauseAssignment_in_ruleProgram168);
            	    rule__Program__ClauseAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getClauseAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExquery"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:123:1: entryRuleExquery : ruleExquery EOF ;
    public final void entryRuleExquery() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:124:1: ( ruleExquery EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:125:1: ruleExquery EOF
            {
             before(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_ruleExquery_in_entryRuleExquery198);
            ruleExquery();

            state._fsp--;

             after(grammarAccess.getExqueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExquery205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExquery"


    // $ANTLR start "ruleExquery"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:132:1: ruleExquery : ( ( rule__Exquery__Group__0 ) ) ;
    public final void ruleExquery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:136:2: ( ( ( rule__Exquery__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:137:1: ( ( rule__Exquery__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:137:1: ( ( rule__Exquery__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:138:1: ( rule__Exquery__Group__0 )
            {
             before(grammarAccess.getExqueryAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:139:1: ( rule__Exquery__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:139:2: rule__Exquery__Group__0
            {
            pushFollow(FOLLOW_rule__Exquery__Group__0_in_ruleExquery231);
            rule__Exquery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExqueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExquery"


    // $ANTLR start "entryRuleQuery"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:151:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:152:1: ( ruleQuery EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:153:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery258);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery265); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:160:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:164:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:165:1: ( ( rule__Query__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:165:1: ( ( rule__Query__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:166:1: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:167:1: ( rule__Query__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:167:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery291);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleClause"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:179:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:180:1: ( ruleClause EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:181:1: ruleClause EOF
            {
             before(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause318);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:188:1: ruleClause : ( ( rule__Clause__Alternatives ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:192:2: ( ( ( rule__Clause__Alternatives ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:193:1: ( ( rule__Clause__Alternatives ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:193:1: ( ( rule__Clause__Alternatives ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:194:1: ( rule__Clause__Alternatives )
            {
             before(grammarAccess.getClauseAccess().getAlternatives()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:195:1: ( rule__Clause__Alternatives )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:195:2: rule__Clause__Alternatives
            {
            pushFollow(FOLLOW_rule__Clause__Alternatives_in_ruleClause351);
            rule__Clause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleFact"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:207:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:208:1: ( ruleFact EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:209:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact378);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact385); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:216:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:220:2: ( ( ( rule__Fact__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:221:1: ( ( rule__Fact__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:221:1: ( ( rule__Fact__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:222:1: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:223:1: ( rule__Fact__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:223:2: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_rule__Fact__Group__0_in_ruleFact411);
            rule__Fact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleRule"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:235:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:236:1: ( ruleRule EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:237:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule438);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule445); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:244:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:248:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:249:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:249:1: ( ( rule__Rule__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:250:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:251:1: ( rule__Rule__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:251:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule471);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePredicate"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:263:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:264:1: ( rulePredicate EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:265:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate498);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate505); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:272:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:276:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:277:1: ( ( rule__Predicate__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:277:1: ( ( rule__Predicate__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:278:1: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:279:1: ( rule__Predicate__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:279:2: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0_in_rulePredicate531);
            rule__Predicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleFunctor"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:291:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:292:1: ( ruleFunctor EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:293:1: ruleFunctor EOF
            {
             before(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor558);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getFunctorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor565); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:300:1: ruleFunctor : ( RULE_IDENT ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:304:2: ( ( RULE_IDENT ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:305:1: ( RULE_IDENT )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:305:1: ( RULE_IDENT )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:306:1: RULE_IDENT
            {
             before(grammarAccess.getFunctorAccess().getIdentTerminalRuleCall()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFunctor591); 
             after(grammarAccess.getFunctorAccess().getIdentTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleTerm"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:319:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:320:1: ( ruleTerm EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:321:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm617);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm624); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:328:1: ruleTerm : ( ( rule__Term__TermAssignment ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:332:2: ( ( ( rule__Term__TermAssignment ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:333:1: ( ( rule__Term__TermAssignment ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:333:1: ( ( rule__Term__TermAssignment ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:334:1: ( rule__Term__TermAssignment )
            {
             before(grammarAccess.getTermAccess().getTermAssignment()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:335:1: ( rule__Term__TermAssignment )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:335:2: rule__Term__TermAssignment
            {
            pushFollow(FOLLOW_rule__Term__TermAssignment_in_ruleTerm650);
            rule__Term__TermAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getTermAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:347:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:348:1: ( ruleAtom EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:349:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom677);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom684); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:356:1: ruleAtom : ( ( rule__Atom__AtomAssignment ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:360:2: ( ( ( rule__Atom__AtomAssignment ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:361:1: ( ( rule__Atom__AtomAssignment ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:361:1: ( ( rule__Atom__AtomAssignment ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:362:1: ( rule__Atom__AtomAssignment )
            {
             before(grammarAccess.getAtomAccess().getAtomAssignment()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:363:1: ( rule__Atom__AtomAssignment )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:363:2: rule__Atom__AtomAssignment
            {
            pushFollow(FOLLOW_rule__Atom__AtomAssignment_in_ruleAtom710);
            rule__Atom__AtomAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAtomAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:375:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:376:1: ( ruleList EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:377:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList737);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList744); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:384:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:388:2: ( ( ( rule__List__Alternatives ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:389:1: ( ( rule__List__Alternatives ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:389:1: ( ( rule__List__Alternatives ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:390:1: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:391:1: ( rule__List__Alternatives )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:391:2: rule__List__Alternatives
            {
            pushFollow(FOLLOW_rule__List__Alternatives_in_ruleList770);
            rule__List__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleNotEmptyList"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:403:1: entryRuleNotEmptyList : ruleNotEmptyList EOF ;
    public final void entryRuleNotEmptyList() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:404:1: ( ruleNotEmptyList EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:405:1: ruleNotEmptyList EOF
            {
             before(grammarAccess.getNotEmptyListRule()); 
            pushFollow(FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList797);
            ruleNotEmptyList();

            state._fsp--;

             after(grammarAccess.getNotEmptyListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyList804); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotEmptyList"


    // $ANTLR start "ruleNotEmptyList"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:412:1: ruleNotEmptyList : ( ( rule__NotEmptyList__Group__0 ) ) ;
    public final void ruleNotEmptyList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:416:2: ( ( ( rule__NotEmptyList__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:417:1: ( ( rule__NotEmptyList__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:417:1: ( ( rule__NotEmptyList__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:418:1: ( rule__NotEmptyList__Group__0 )
            {
             before(grammarAccess.getNotEmptyListAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:419:1: ( rule__NotEmptyList__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:419:2: rule__NotEmptyList__Group__0
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__0_in_ruleNotEmptyList830);
            rule__NotEmptyList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotEmptyListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotEmptyList"


    // $ANTLR start "entryRuleFolge"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:431:1: entryRuleFolge : ruleFolge EOF ;
    public final void entryRuleFolge() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:432:1: ( ruleFolge EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:433:1: ruleFolge EOF
            {
             before(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_ruleFolge_in_entryRuleFolge857);
            ruleFolge();

            state._fsp--;

             after(grammarAccess.getFolgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFolge864); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFolge"


    // $ANTLR start "ruleFolge"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:440:1: ruleFolge : ( ( rule__Folge__Group__0 ) ) ;
    public final void ruleFolge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:444:2: ( ( ( rule__Folge__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:445:1: ( ( rule__Folge__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:445:1: ( ( rule__Folge__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:446:1: ( rule__Folge__Group__0 )
            {
             before(grammarAccess.getFolgeAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:447:1: ( rule__Folge__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:447:2: rule__Folge__Group__0
            {
            pushFollow(FOLLOW_rule__Folge__Group__0_in_ruleFolge890);
            rule__Folge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFolgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFolge"


    // $ANTLR start "entryRuleNumber"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:459:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:460:1: ( ruleNumber EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:461:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber917);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber924); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:468:1: ruleNumber : ( RULE_INT ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:472:2: ( ( RULE_INT ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:473:1: ( RULE_INT )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:473:1: ( RULE_INT )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:474:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber950); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Clause__Alternatives"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:487:1: rule__Clause__Alternatives : ( ( ( rule__Clause__FactAssignment_0 ) ) | ( ( rule__Clause__RuleAssignment_1 ) ) );
    public final void rule__Clause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:491:1: ( ( ( rule__Clause__FactAssignment_0 ) ) | ( ( rule__Clause__RuleAssignment_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:492:1: ( ( rule__Clause__FactAssignment_0 ) )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:492:1: ( ( rule__Clause__FactAssignment_0 ) )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:493:1: ( rule__Clause__FactAssignment_0 )
                    {
                     before(grammarAccess.getClauseAccess().getFactAssignment_0()); 
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:494:1: ( rule__Clause__FactAssignment_0 )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:494:2: rule__Clause__FactAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Clause__FactAssignment_0_in_rule__Clause__Alternatives985);
                    rule__Clause__FactAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseAccess().getFactAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:498:6: ( ( rule__Clause__RuleAssignment_1 ) )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:498:6: ( ( rule__Clause__RuleAssignment_1 ) )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:499:1: ( rule__Clause__RuleAssignment_1 )
                    {
                     before(grammarAccess.getClauseAccess().getRuleAssignment_1()); 
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:500:1: ( rule__Clause__RuleAssignment_1 )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:500:2: rule__Clause__RuleAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Clause__RuleAssignment_1_in_rule__Clause__Alternatives1003);
                    rule__Clause__RuleAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseAccess().getRuleAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Alternatives"


    // $ANTLR start "rule__Term__TermAlternatives_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:509:1: rule__Term__TermAlternatives_0 : ( ( ruleAtom ) | ( ruleList ) );
    public final void rule__Term__TermAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:513:1: ( ( ruleAtom ) | ( ruleList ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_IDENT && LA3_0<=RULE_VARIABLE)) ) {
                alt3=1;
            }
            else if ( (LA3_0==19||LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:514:1: ( ruleAtom )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:514:1: ( ruleAtom )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:515:1: ruleAtom
                    {
                     before(grammarAccess.getTermAccess().getTermAtomParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleAtom_in_rule__Term__TermAlternatives_01036);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getTermAtomParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:520:6: ( ruleList )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:520:6: ( ruleList )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:521:1: ruleList
                    {
                     before(grammarAccess.getTermAccess().getTermListParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleList_in_rule__Term__TermAlternatives_01053);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getTermListParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TermAlternatives_0"


    // $ANTLR start "rule__Atom__AtomAlternatives_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:531:1: rule__Atom__AtomAlternatives_0 : ( ( RULE_IDENT ) | ( RULE_VARIABLE ) | ( ruleNumber ) );
    public final void rule__Atom__AtomAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:535:1: ( ( RULE_IDENT ) | ( RULE_VARIABLE ) | ( ruleNumber ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt4=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:536:1: ( RULE_IDENT )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:536:1: ( RULE_IDENT )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:537:1: RULE_IDENT
                    {
                     before(grammarAccess.getAtomAccess().getAtomIdentTerminalRuleCall_0_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Atom__AtomAlternatives_01085); 
                     after(grammarAccess.getAtomAccess().getAtomIdentTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:542:6: ( RULE_VARIABLE )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:542:6: ( RULE_VARIABLE )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:543:1: RULE_VARIABLE
                    {
                     before(grammarAccess.getAtomAccess().getAtomVariableTerminalRuleCall_0_1()); 
                    match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Atom__AtomAlternatives_01102); 
                     after(grammarAccess.getAtomAccess().getAtomVariableTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:548:6: ( ruleNumber )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:548:6: ( ruleNumber )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:549:1: ruleNumber
                    {
                     before(grammarAccess.getAtomAccess().getAtomNumberParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Atom__AtomAlternatives_01119);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getAtomNumberParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__AtomAlternatives_0"


    // $ANTLR start "rule__List__Alternatives"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:559:1: rule__List__Alternatives : ( ( ( rule__List__ListAssignment_0 ) ) | ( ruleNotEmptyList ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:563:1: ( ( ( rule__List__ListAssignment_0 ) ) | ( ruleNotEmptyList ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:564:1: ( ( rule__List__ListAssignment_0 ) )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:564:1: ( ( rule__List__ListAssignment_0 ) )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:565:1: ( rule__List__ListAssignment_0 )
                    {
                     before(grammarAccess.getListAccess().getListAssignment_0()); 
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:566:1: ( rule__List__ListAssignment_0 )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:566:2: rule__List__ListAssignment_0
                    {
                    pushFollow(FOLLOW_rule__List__ListAssignment_0_in_rule__List__Alternatives1151);
                    rule__List__ListAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getListAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:570:6: ( ruleNotEmptyList )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:570:6: ( ruleNotEmptyList )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:571:1: ruleNotEmptyList
                    {
                     before(grammarAccess.getListAccess().getNotEmptyListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNotEmptyList_in_rule__List__Alternatives1169);
                    ruleNotEmptyList();

                    state._fsp--;

                     after(grammarAccess.getListAccess().getNotEmptyListParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Alternatives"


    // $ANTLR start "rule__PrologDsl__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:583:1: rule__PrologDsl__Group__0 : rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1 ;
    public final void rule__PrologDsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:587:1: ( rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:588:2: rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1
            {
            pushFollow(FOLLOW_rule__PrologDsl__Group__0__Impl_in_rule__PrologDsl__Group__01199);
            rule__PrologDsl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrologDsl__Group__1_in_rule__PrologDsl__Group__01202);
            rule__PrologDsl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrologDsl__Group__0"


    // $ANTLR start "rule__PrologDsl__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:595:1: rule__PrologDsl__Group__0__Impl : ( ( rule__PrologDsl__ProgramAssignment_0 ) ) ;
    public final void rule__PrologDsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:599:1: ( ( ( rule__PrologDsl__ProgramAssignment_0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:600:1: ( ( rule__PrologDsl__ProgramAssignment_0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:600:1: ( ( rule__PrologDsl__ProgramAssignment_0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:601:1: ( rule__PrologDsl__ProgramAssignment_0 )
            {
             before(grammarAccess.getPrologDslAccess().getProgramAssignment_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:602:1: ( rule__PrologDsl__ProgramAssignment_0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:602:2: rule__PrologDsl__ProgramAssignment_0
            {
            pushFollow(FOLLOW_rule__PrologDsl__ProgramAssignment_0_in_rule__PrologDsl__Group__0__Impl1229);
            rule__PrologDsl__ProgramAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrologDslAccess().getProgramAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrologDsl__Group__0__Impl"


    // $ANTLR start "rule__PrologDsl__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:612:1: rule__PrologDsl__Group__1 : rule__PrologDsl__Group__1__Impl ;
    public final void rule__PrologDsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:616:1: ( rule__PrologDsl__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:617:2: rule__PrologDsl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PrologDsl__Group__1__Impl_in_rule__PrologDsl__Group__11259);
            rule__PrologDsl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrologDsl__Group__1"


    // $ANTLR start "rule__PrologDsl__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:623:1: rule__PrologDsl__Group__1__Impl : ( ( rule__PrologDsl__ExqueryAssignment_1 ) ) ;
    public final void rule__PrologDsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:627:1: ( ( ( rule__PrologDsl__ExqueryAssignment_1 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:628:1: ( ( rule__PrologDsl__ExqueryAssignment_1 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:628:1: ( ( rule__PrologDsl__ExqueryAssignment_1 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:629:1: ( rule__PrologDsl__ExqueryAssignment_1 )
            {
             before(grammarAccess.getPrologDslAccess().getExqueryAssignment_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:630:1: ( rule__PrologDsl__ExqueryAssignment_1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:630:2: rule__PrologDsl__ExqueryAssignment_1
            {
            pushFollow(FOLLOW_rule__PrologDsl__ExqueryAssignment_1_in_rule__PrologDsl__Group__1__Impl1286);
            rule__PrologDsl__ExqueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrologDslAccess().getExqueryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrologDsl__Group__1__Impl"


    // $ANTLR start "rule__Exquery__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:644:1: rule__Exquery__Group__0 : rule__Exquery__Group__0__Impl rule__Exquery__Group__1 ;
    public final void rule__Exquery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:648:1: ( rule__Exquery__Group__0__Impl rule__Exquery__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:649:2: rule__Exquery__Group__0__Impl rule__Exquery__Group__1
            {
            pushFollow(FOLLOW_rule__Exquery__Group__0__Impl_in_rule__Exquery__Group__01320);
            rule__Exquery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exquery__Group__1_in_rule__Exquery__Group__01323);
            rule__Exquery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__0"


    // $ANTLR start "rule__Exquery__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:656:1: rule__Exquery__Group__0__Impl : ( '?-' ) ;
    public final void rule__Exquery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:660:1: ( ( '?-' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:661:1: ( '?-' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:661:1: ( '?-' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:662:1: '?-'
            {
             before(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Exquery__Group__0__Impl1351); 
             after(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__0__Impl"


    // $ANTLR start "rule__Exquery__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:675:1: rule__Exquery__Group__1 : rule__Exquery__Group__1__Impl rule__Exquery__Group__2 ;
    public final void rule__Exquery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:679:1: ( rule__Exquery__Group__1__Impl rule__Exquery__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:680:2: rule__Exquery__Group__1__Impl rule__Exquery__Group__2
            {
            pushFollow(FOLLOW_rule__Exquery__Group__1__Impl_in_rule__Exquery__Group__11382);
            rule__Exquery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exquery__Group__2_in_rule__Exquery__Group__11385);
            rule__Exquery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__1"


    // $ANTLR start "rule__Exquery__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:687:1: rule__Exquery__Group__1__Impl : ( ( rule__Exquery__QueryAssignment_1 ) ) ;
    public final void rule__Exquery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:691:1: ( ( ( rule__Exquery__QueryAssignment_1 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:692:1: ( ( rule__Exquery__QueryAssignment_1 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:692:1: ( ( rule__Exquery__QueryAssignment_1 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:693:1: ( rule__Exquery__QueryAssignment_1 )
            {
             before(grammarAccess.getExqueryAccess().getQueryAssignment_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:694:1: ( rule__Exquery__QueryAssignment_1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:694:2: rule__Exquery__QueryAssignment_1
            {
            pushFollow(FOLLOW_rule__Exquery__QueryAssignment_1_in_rule__Exquery__Group__1__Impl1412);
            rule__Exquery__QueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExqueryAccess().getQueryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__1__Impl"


    // $ANTLR start "rule__Exquery__Group__2"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:704:1: rule__Exquery__Group__2 : rule__Exquery__Group__2__Impl ;
    public final void rule__Exquery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:708:1: ( rule__Exquery__Group__2__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:709:2: rule__Exquery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Exquery__Group__2__Impl_in_rule__Exquery__Group__21442);
            rule__Exquery__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__2"


    // $ANTLR start "rule__Exquery__Group__2__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:715:1: rule__Exquery__Group__2__Impl : ( '.' ) ;
    public final void rule__Exquery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:719:1: ( ( '.' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:720:1: ( '.' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:720:1: ( '.' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:721:1: '.'
            {
             before(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Exquery__Group__2__Impl1470); 
             after(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:740:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:744:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:745:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01507);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01510);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:752:1: rule__Query__Group__0__Impl : ( ( rule__Query__PredicateAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:756:1: ( ( ( rule__Query__PredicateAssignment_0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:757:1: ( ( rule__Query__PredicateAssignment_0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:757:1: ( ( rule__Query__PredicateAssignment_0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:758:1: ( rule__Query__PredicateAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getPredicateAssignment_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:759:1: ( rule__Query__PredicateAssignment_0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:759:2: rule__Query__PredicateAssignment_0
            {
            pushFollow(FOLLOW_rule__Query__PredicateAssignment_0_in_rule__Query__Group__0__Impl1537);
            rule__Query__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getPredicateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:769:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:773:1: ( rule__Query__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:774:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11567);
            rule__Query__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:780:1: rule__Query__Group__1__Impl : ( ( rule__Query__Group_1__0 )* ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:784:1: ( ( ( rule__Query__Group_1__0 )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:785:1: ( ( rule__Query__Group_1__0 )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:785:1: ( ( rule__Query__Group_1__0 )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:786:1: ( rule__Query__Group_1__0 )*
            {
             before(grammarAccess.getQueryAccess().getGroup_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:787:1: ( rule__Query__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:787:2: rule__Query__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl1594);
            	    rule__Query__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group_1__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:801:1: rule__Query__Group_1__0 : rule__Query__Group_1__0__Impl rule__Query__Group_1__1 ;
    public final void rule__Query__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:805:1: ( rule__Query__Group_1__0__Impl rule__Query__Group_1__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:806:2: rule__Query__Group_1__0__Impl rule__Query__Group_1__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__01629);
            rule__Query__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__01632);
            rule__Query__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__0"


    // $ANTLR start "rule__Query__Group_1__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:813:1: rule__Query__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:817:1: ( ( ',' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:818:1: ( ',' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:818:1: ( ',' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:819:1: ','
            {
             before(grammarAccess.getQueryAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Query__Group_1__0__Impl1660); 
             after(grammarAccess.getQueryAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__0__Impl"


    // $ANTLR start "rule__Query__Group_1__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:832:1: rule__Query__Group_1__1 : rule__Query__Group_1__1__Impl ;
    public final void rule__Query__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:836:1: ( rule__Query__Group_1__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:837:2: rule__Query__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__11691);
            rule__Query__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__1"


    // $ANTLR start "rule__Query__Group_1__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:843:1: rule__Query__Group_1__1__Impl : ( ( rule__Query__NthPredicateAssignment_1_1 ) ) ;
    public final void rule__Query__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:847:1: ( ( ( rule__Query__NthPredicateAssignment_1_1 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:848:1: ( ( rule__Query__NthPredicateAssignment_1_1 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:848:1: ( ( rule__Query__NthPredicateAssignment_1_1 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:849:1: ( rule__Query__NthPredicateAssignment_1_1 )
            {
             before(grammarAccess.getQueryAccess().getNthPredicateAssignment_1_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:850:1: ( rule__Query__NthPredicateAssignment_1_1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:850:2: rule__Query__NthPredicateAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Query__NthPredicateAssignment_1_1_in_rule__Query__Group_1__1__Impl1718);
            rule__Query__NthPredicateAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNthPredicateAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__1__Impl"


    // $ANTLR start "rule__Fact__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:864:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:868:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:869:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__01752);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__01755);
            rule__Fact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0"


    // $ANTLR start "rule__Fact__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:876:1: rule__Fact__Group__0__Impl : ( ( rule__Fact__PredicateAssignment_0 ) ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:880:1: ( ( ( rule__Fact__PredicateAssignment_0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:881:1: ( ( rule__Fact__PredicateAssignment_0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:881:1: ( ( rule__Fact__PredicateAssignment_0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:882:1: ( rule__Fact__PredicateAssignment_0 )
            {
             before(grammarAccess.getFactAccess().getPredicateAssignment_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:883:1: ( rule__Fact__PredicateAssignment_0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:883:2: rule__Fact__PredicateAssignment_0
            {
            pushFollow(FOLLOW_rule__Fact__PredicateAssignment_0_in_rule__Fact__Group__0__Impl1782);
            rule__Fact__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getPredicateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0__Impl"


    // $ANTLR start "rule__Fact__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:893:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:897:1: ( rule__Fact__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:898:2: rule__Fact__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__11812);
            rule__Fact__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1"


    // $ANTLR start "rule__Fact__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:904:1: rule__Fact__Group__1__Impl : ( '.' ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:908:1: ( ( '.' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:909:1: ( '.' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:909:1: ( '.' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:910:1: '.'
            {
             before(grammarAccess.getFactAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Fact__Group__1__Impl1840); 
             after(grammarAccess.getFactAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:927:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:931:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:932:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01875);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01878);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:939:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__PredicateAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:943:1: ( ( ( rule__Rule__PredicateAssignment_0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:944:1: ( ( rule__Rule__PredicateAssignment_0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:944:1: ( ( rule__Rule__PredicateAssignment_0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:945:1: ( rule__Rule__PredicateAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getPredicateAssignment_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:946:1: ( rule__Rule__PredicateAssignment_0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:946:2: rule__Rule__PredicateAssignment_0
            {
            pushFollow(FOLLOW_rule__Rule__PredicateAssignment_0_in_rule__Rule__Group__0__Impl1905);
            rule__Rule__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:956:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:960:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:961:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11935);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11938);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:968:1: rule__Rule__Group__1__Impl : ( ':-' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:972:1: ( ( ':-' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:973:1: ( ':-' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:973:1: ( ':-' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:974:1: ':-'
            {
             before(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Rule__Group__1__Impl1966); 
             after(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:987:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:991:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:992:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21997);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22000);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:999:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__QueryAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1003:1: ( ( ( rule__Rule__QueryAssignment_2 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1004:1: ( ( rule__Rule__QueryAssignment_2 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1004:1: ( ( rule__Rule__QueryAssignment_2 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1005:1: ( rule__Rule__QueryAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getQueryAssignment_2()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1006:1: ( rule__Rule__QueryAssignment_2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1006:2: rule__Rule__QueryAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__QueryAssignment_2_in_rule__Rule__Group__2__Impl2027);
            rule__Rule__QueryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQueryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1016:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1020:1: ( rule__Rule__Group__3__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1021:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32057);
            rule__Rule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1027:1: rule__Rule__Group__3__Impl : ( '.' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1031:1: ( ( '.' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1032:1: ( '.' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1032:1: ( '.' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1033:1: '.'
            {
             before(grammarAccess.getRuleAccess().getFullStopKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Rule__Group__3__Impl2085); 
             after(grammarAccess.getRuleAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1054:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1058:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1059:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__02124);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__02127);
            rule__Predicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1066:1: rule__Predicate__Group__0__Impl : ( ( rule__Predicate__FunctorAssignment_0 ) ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1070:1: ( ( ( rule__Predicate__FunctorAssignment_0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1071:1: ( ( rule__Predicate__FunctorAssignment_0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1071:1: ( ( rule__Predicate__FunctorAssignment_0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1072:1: ( rule__Predicate__FunctorAssignment_0 )
            {
             before(grammarAccess.getPredicateAccess().getFunctorAssignment_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1073:1: ( rule__Predicate__FunctorAssignment_0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1073:2: rule__Predicate__FunctorAssignment_0
            {
            pushFollow(FOLLOW_rule__Predicate__FunctorAssignment_0_in_rule__Predicate__Group__0__Impl2154);
            rule__Predicate__FunctorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getFunctorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1083:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1087:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1088:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__12184);
            rule__Predicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__12187);
            rule__Predicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1095:1: rule__Predicate__Group__1__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1099:1: ( ( '(' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1100:1: ( '(' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1100:1: ( '(' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1101:1: '('
            {
             before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Predicate__Group__1__Impl2215); 
             after(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__2"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1114:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1118:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1119:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__22246);
            rule__Predicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__22249);
            rule__Predicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2"


    // $ANTLR start "rule__Predicate__Group__2__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1126:1: rule__Predicate__Group__2__Impl : ( ( rule__Predicate__TermAssignment_2 ) ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1130:1: ( ( ( rule__Predicate__TermAssignment_2 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1131:1: ( ( rule__Predicate__TermAssignment_2 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1131:1: ( ( rule__Predicate__TermAssignment_2 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1132:1: ( rule__Predicate__TermAssignment_2 )
            {
             before(grammarAccess.getPredicateAccess().getTermAssignment_2()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1133:1: ( rule__Predicate__TermAssignment_2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1133:2: rule__Predicate__TermAssignment_2
            {
            pushFollow(FOLLOW_rule__Predicate__TermAssignment_2_in_rule__Predicate__Group__2__Impl2276);
            rule__Predicate__TermAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getTermAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__3"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1143:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1147:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1148:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__32306);
            rule__Predicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__32309);
            rule__Predicate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3"


    // $ANTLR start "rule__Predicate__Group__3__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1155:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__Group_3__0 )* ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1159:1: ( ( ( rule__Predicate__Group_3__0 )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1160:1: ( ( rule__Predicate__Group_3__0 )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1160:1: ( ( rule__Predicate__Group_3__0 )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1161:1: ( rule__Predicate__Group_3__0 )*
            {
             before(grammarAccess.getPredicateAccess().getGroup_3()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1162:1: ( rule__Predicate__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1162:2: rule__Predicate__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl2336);
            	    rule__Predicate__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPredicateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3__Impl"


    // $ANTLR start "rule__Predicate__Group__4"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1172:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1176:1: ( rule__Predicate__Group__4__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1177:2: rule__Predicate__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__42367);
            rule__Predicate__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__4"


    // $ANTLR start "rule__Predicate__Group__4__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1183:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1187:1: ( ( ')' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1188:1: ( ')' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1188:1: ( ')' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1189:1: ')'
            {
             before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Predicate__Group__4__Impl2395); 
             after(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__4__Impl"


    // $ANTLR start "rule__Predicate__Group_3__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1212:1: rule__Predicate__Group_3__0 : rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 ;
    public final void rule__Predicate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1216:1: ( rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1217:2: rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__02436);
            rule__Predicate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__02439);
            rule__Predicate__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__0"


    // $ANTLR start "rule__Predicate__Group_3__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1224:1: rule__Predicate__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Predicate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1228:1: ( ( ',' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1229:1: ( ',' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1229:1: ( ',' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1230:1: ','
            {
             before(grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Predicate__Group_3__0__Impl2467); 
             after(grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__0__Impl"


    // $ANTLR start "rule__Predicate__Group_3__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1243:1: rule__Predicate__Group_3__1 : rule__Predicate__Group_3__1__Impl ;
    public final void rule__Predicate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1247:1: ( rule__Predicate__Group_3__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1248:2: rule__Predicate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__12498);
            rule__Predicate__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__1"


    // $ANTLR start "rule__Predicate__Group_3__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1254:1: rule__Predicate__Group_3__1__Impl : ( ( rule__Predicate__NthTermAssignment_3_1 ) ) ;
    public final void rule__Predicate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1258:1: ( ( ( rule__Predicate__NthTermAssignment_3_1 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1259:1: ( ( rule__Predicate__NthTermAssignment_3_1 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1259:1: ( ( rule__Predicate__NthTermAssignment_3_1 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1260:1: ( rule__Predicate__NthTermAssignment_3_1 )
            {
             before(grammarAccess.getPredicateAccess().getNthTermAssignment_3_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1261:1: ( rule__Predicate__NthTermAssignment_3_1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1261:2: rule__Predicate__NthTermAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Predicate__NthTermAssignment_3_1_in_rule__Predicate__Group_3__1__Impl2525);
            rule__Predicate__NthTermAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getNthTermAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__1__Impl"


    // $ANTLR start "rule__NotEmptyList__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1275:1: rule__NotEmptyList__Group__0 : rule__NotEmptyList__Group__0__Impl rule__NotEmptyList__Group__1 ;
    public final void rule__NotEmptyList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1279:1: ( rule__NotEmptyList__Group__0__Impl rule__NotEmptyList__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1280:2: rule__NotEmptyList__Group__0__Impl rule__NotEmptyList__Group__1
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__0__Impl_in_rule__NotEmptyList__Group__02559);
            rule__NotEmptyList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyList__Group__1_in_rule__NotEmptyList__Group__02562);
            rule__NotEmptyList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyList__Group__0"


    // $ANTLR start "rule__NotEmptyList__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1287:1: rule__NotEmptyList__Group__0__Impl : ( '[' ) ;
    public final void rule__NotEmptyList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1291:1: ( ( '[' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1292:1: ( '[' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1292:1: ( '[' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1293:1: '['
            {
             before(grammarAccess.getNotEmptyListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__NotEmptyList__Group__0__Impl2590); 
             after(grammarAccess.getNotEmptyListAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyList__Group__0__Impl"


    // $ANTLR start "rule__NotEmptyList__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1306:1: rule__NotEmptyList__Group__1 : rule__NotEmptyList__Group__1__Impl rule__NotEmptyList__Group__2 ;
    public final void rule__NotEmptyList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1310:1: ( rule__NotEmptyList__Group__1__Impl rule__NotEmptyList__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1311:2: rule__NotEmptyList__Group__1__Impl rule__NotEmptyList__Group__2
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__1__Impl_in_rule__NotEmptyList__Group__12621);
            rule__NotEmptyList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyList__Group__2_in_rule__NotEmptyList__Group__12624);
            rule__NotEmptyList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyList__Group__1"


    // $ANTLR start "rule__NotEmptyList__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1318:1: rule__NotEmptyList__Group__1__Impl : ( ( rule__NotEmptyList__FolgeAssignment_1 ) ) ;
    public final void rule__NotEmptyList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1322:1: ( ( ( rule__NotEmptyList__FolgeAssignment_1 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1323:1: ( ( rule__NotEmptyList__FolgeAssignment_1 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1323:1: ( ( rule__NotEmptyList__FolgeAssignment_1 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1324:1: ( rule__NotEmptyList__FolgeAssignment_1 )
            {
             before(grammarAccess.getNotEmptyListAccess().getFolgeAssignment_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1325:1: ( rule__NotEmptyList__FolgeAssignment_1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1325:2: rule__NotEmptyList__FolgeAssignment_1
            {
            pushFollow(FOLLOW_rule__NotEmptyList__FolgeAssignment_1_in_rule__NotEmptyList__Group__1__Impl2651);
            rule__NotEmptyList__FolgeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotEmptyListAccess().getFolgeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyList__Group__1__Impl"


    // $ANTLR start "rule__NotEmptyList__Group__2"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1335:1: rule__NotEmptyList__Group__2 : rule__NotEmptyList__Group__2__Impl ;
    public final void rule__NotEmptyList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1339:1: ( rule__NotEmptyList__Group__2__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1340:2: rule__NotEmptyList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__2__Impl_in_rule__NotEmptyList__Group__22681);
            rule__NotEmptyList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyList__Group__2"


    // $ANTLR start "rule__NotEmptyList__Group__2__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1346:1: rule__NotEmptyList__Group__2__Impl : ( ']' ) ;
    public final void rule__NotEmptyList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1350:1: ( ( ']' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1351:1: ( ']' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1351:1: ( ']' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1352:1: ']'
            {
             before(grammarAccess.getNotEmptyListAccess().getRightSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__NotEmptyList__Group__2__Impl2709); 
             after(grammarAccess.getNotEmptyListAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyList__Group__2__Impl"


    // $ANTLR start "rule__Folge__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1371:1: rule__Folge__Group__0 : rule__Folge__Group__0__Impl rule__Folge__Group__1 ;
    public final void rule__Folge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1375:1: ( rule__Folge__Group__0__Impl rule__Folge__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1376:2: rule__Folge__Group__0__Impl rule__Folge__Group__1
            {
            pushFollow(FOLLOW_rule__Folge__Group__0__Impl_in_rule__Folge__Group__02746);
            rule__Folge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folge__Group__1_in_rule__Folge__Group__02749);
            rule__Folge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group__0"


    // $ANTLR start "rule__Folge__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1383:1: rule__Folge__Group__0__Impl : ( ( rule__Folge__AtomAssignment_0 ) ) ;
    public final void rule__Folge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1387:1: ( ( ( rule__Folge__AtomAssignment_0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1388:1: ( ( rule__Folge__AtomAssignment_0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1388:1: ( ( rule__Folge__AtomAssignment_0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1389:1: ( rule__Folge__AtomAssignment_0 )
            {
             before(grammarAccess.getFolgeAccess().getAtomAssignment_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1390:1: ( rule__Folge__AtomAssignment_0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1390:2: rule__Folge__AtomAssignment_0
            {
            pushFollow(FOLLOW_rule__Folge__AtomAssignment_0_in_rule__Folge__Group__0__Impl2776);
            rule__Folge__AtomAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFolgeAccess().getAtomAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group__0__Impl"


    // $ANTLR start "rule__Folge__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1400:1: rule__Folge__Group__1 : rule__Folge__Group__1__Impl ;
    public final void rule__Folge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1404:1: ( rule__Folge__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1405:2: rule__Folge__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Folge__Group__1__Impl_in_rule__Folge__Group__12806);
            rule__Folge__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group__1"


    // $ANTLR start "rule__Folge__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1411:1: rule__Folge__Group__1__Impl : ( ( rule__Folge__Group_1__0 )* ) ;
    public final void rule__Folge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1415:1: ( ( ( rule__Folge__Group_1__0 )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1416:1: ( ( rule__Folge__Group_1__0 )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1416:1: ( ( rule__Folge__Group_1__0 )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1417:1: ( rule__Folge__Group_1__0 )*
            {
             before(grammarAccess.getFolgeAccess().getGroup_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1418:1: ( rule__Folge__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1418:2: rule__Folge__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Folge__Group_1__0_in_rule__Folge__Group__1__Impl2833);
            	    rule__Folge__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFolgeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group__1__Impl"


    // $ANTLR start "rule__Folge__Group_1__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1432:1: rule__Folge__Group_1__0 : rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1 ;
    public final void rule__Folge__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1436:1: ( rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1437:2: rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1
            {
            pushFollow(FOLLOW_rule__Folge__Group_1__0__Impl_in_rule__Folge__Group_1__02868);
            rule__Folge__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folge__Group_1__1_in_rule__Folge__Group_1__02871);
            rule__Folge__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group_1__0"


    // $ANTLR start "rule__Folge__Group_1__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1444:1: rule__Folge__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Folge__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1448:1: ( ( ',' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1449:1: ( ',' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1449:1: ( ',' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1450:1: ','
            {
             before(grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Folge__Group_1__0__Impl2899); 
             after(grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group_1__0__Impl"


    // $ANTLR start "rule__Folge__Group_1__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1463:1: rule__Folge__Group_1__1 : rule__Folge__Group_1__1__Impl ;
    public final void rule__Folge__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1467:1: ( rule__Folge__Group_1__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1468:2: rule__Folge__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Folge__Group_1__1__Impl_in_rule__Folge__Group_1__12930);
            rule__Folge__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group_1__1"


    // $ANTLR start "rule__Folge__Group_1__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1474:1: rule__Folge__Group_1__1__Impl : ( ( rule__Folge__NthAtomAssignment_1_1 ) ) ;
    public final void rule__Folge__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1478:1: ( ( ( rule__Folge__NthAtomAssignment_1_1 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1479:1: ( ( rule__Folge__NthAtomAssignment_1_1 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1479:1: ( ( rule__Folge__NthAtomAssignment_1_1 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1480:1: ( rule__Folge__NthAtomAssignment_1_1 )
            {
             before(grammarAccess.getFolgeAccess().getNthAtomAssignment_1_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1481:1: ( rule__Folge__NthAtomAssignment_1_1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1481:2: rule__Folge__NthAtomAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Folge__NthAtomAssignment_1_1_in_rule__Folge__Group_1__1__Impl2957);
            rule__Folge__NthAtomAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFolgeAccess().getNthAtomAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__Group_1__1__Impl"


    // $ANTLR start "rule__PrologDsl__ProgramAssignment_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1496:1: rule__PrologDsl__ProgramAssignment_0 : ( ruleProgram ) ;
    public final void rule__PrologDsl__ProgramAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1500:1: ( ( ruleProgram ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1501:1: ( ruleProgram )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1501:1: ( ruleProgram )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1502:1: ruleProgram
            {
             before(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProgram_in_rule__PrologDsl__ProgramAssignment_02996);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrologDsl__ProgramAssignment_0"


    // $ANTLR start "rule__PrologDsl__ExqueryAssignment_1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1511:1: rule__PrologDsl__ExqueryAssignment_1 : ( ruleExquery ) ;
    public final void rule__PrologDsl__ExqueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1515:1: ( ( ruleExquery ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1516:1: ( ruleExquery )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1516:1: ( ruleExquery )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1517:1: ruleExquery
            {
             before(grammarAccess.getPrologDslAccess().getExqueryExqueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExquery_in_rule__PrologDsl__ExqueryAssignment_13027);
            ruleExquery();

            state._fsp--;

             after(grammarAccess.getPrologDslAccess().getExqueryExqueryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrologDsl__ExqueryAssignment_1"


    // $ANTLR start "rule__Program__ClauseAssignment"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1526:1: rule__Program__ClauseAssignment : ( ruleClause ) ;
    public final void rule__Program__ClauseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1530:1: ( ( ruleClause ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1531:1: ( ruleClause )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1531:1: ( ruleClause )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1532:1: ruleClause
            {
             before(grammarAccess.getProgramAccess().getClauseClauseParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClause_in_rule__Program__ClauseAssignment3058);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getClauseClauseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ClauseAssignment"


    // $ANTLR start "rule__Exquery__QueryAssignment_1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1541:1: rule__Exquery__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__Exquery__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1545:1: ( ( ruleQuery ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1546:1: ( ruleQuery )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1546:1: ( ruleQuery )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1547:1: ruleQuery
            {
             before(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQuery_in_rule__Exquery__QueryAssignment_13089);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__QueryAssignment_1"


    // $ANTLR start "rule__Query__PredicateAssignment_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1556:1: rule__Query__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Query__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1560:1: ( ( rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1561:1: ( rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1561:1: ( rulePredicate )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1562:1: rulePredicate
            {
             before(grammarAccess.getQueryAccess().getPredicatePredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__Query__PredicateAssignment_03120);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getPredicatePredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__PredicateAssignment_0"


    // $ANTLR start "rule__Query__NthPredicateAssignment_1_1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1571:1: rule__Query__NthPredicateAssignment_1_1 : ( rulePredicate ) ;
    public final void rule__Query__NthPredicateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1575:1: ( ( rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1576:1: ( rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1576:1: ( rulePredicate )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1577:1: rulePredicate
            {
             before(grammarAccess.getQueryAccess().getNthPredicatePredicateParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__Query__NthPredicateAssignment_1_13151);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getNthPredicatePredicateParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__NthPredicateAssignment_1_1"


    // $ANTLR start "rule__Clause__FactAssignment_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1586:1: rule__Clause__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__Clause__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1590:1: ( ( ruleFact ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1591:1: ( ruleFact )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1591:1: ( ruleFact )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1592:1: ruleFact
            {
             before(grammarAccess.getClauseAccess().getFactFactParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFact_in_rule__Clause__FactAssignment_03182);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getFactFactParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__FactAssignment_0"


    // $ANTLR start "rule__Clause__RuleAssignment_1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1601:1: rule__Clause__RuleAssignment_1 : ( ruleRule ) ;
    public final void rule__Clause__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1605:1: ( ( ruleRule ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1606:1: ( ruleRule )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1606:1: ( ruleRule )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1607:1: ruleRule
            {
             before(grammarAccess.getClauseAccess().getRuleRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Clause__RuleAssignment_13213);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getRuleRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__RuleAssignment_1"


    // $ANTLR start "rule__Fact__PredicateAssignment_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1616:1: rule__Fact__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Fact__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1620:1: ( ( rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1621:1: ( rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1621:1: ( rulePredicate )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1622:1: rulePredicate
            {
             before(grammarAccess.getFactAccess().getPredicatePredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__Fact__PredicateAssignment_03244);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getFactAccess().getPredicatePredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__PredicateAssignment_0"


    // $ANTLR start "rule__Rule__PredicateAssignment_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1631:1: rule__Rule__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Rule__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1635:1: ( ( rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1636:1: ( rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1636:1: ( rulePredicate )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1637:1: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPredicatePredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__Rule__PredicateAssignment_03275);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatePredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PredicateAssignment_0"


    // $ANTLR start "rule__Rule__QueryAssignment_2"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1646:1: rule__Rule__QueryAssignment_2 : ( ruleQuery ) ;
    public final void rule__Rule__QueryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1650:1: ( ( ruleQuery ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1651:1: ( ruleQuery )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1651:1: ( ruleQuery )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1652:1: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQuery_in_rule__Rule__QueryAssignment_23306);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__QueryAssignment_2"


    // $ANTLR start "rule__Predicate__FunctorAssignment_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1661:1: rule__Predicate__FunctorAssignment_0 : ( ruleFunctor ) ;
    public final void rule__Predicate__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1665:1: ( ( ruleFunctor ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1666:1: ( ruleFunctor )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1666:1: ( ruleFunctor )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1667:1: ruleFunctor
            {
             before(grammarAccess.getPredicateAccess().getFunctorFunctorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFunctor_in_rule__Predicate__FunctorAssignment_03337);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getFunctorFunctorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__FunctorAssignment_0"


    // $ANTLR start "rule__Predicate__TermAssignment_2"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1676:1: rule__Predicate__TermAssignment_2 : ( ruleTerm ) ;
    public final void rule__Predicate__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1680:1: ( ( ruleTerm ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1681:1: ( ruleTerm )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1681:1: ( ruleTerm )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1682:1: ruleTerm
            {
             before(grammarAccess.getPredicateAccess().getTermTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Predicate__TermAssignment_23368);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getTermTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__TermAssignment_2"


    // $ANTLR start "rule__Predicate__NthTermAssignment_3_1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1691:1: rule__Predicate__NthTermAssignment_3_1 : ( ruleTerm ) ;
    public final void rule__Predicate__NthTermAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1695:1: ( ( ruleTerm ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1696:1: ( ruleTerm )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1696:1: ( ruleTerm )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1697:1: ruleTerm
            {
             before(grammarAccess.getPredicateAccess().getNthTermTermParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Predicate__NthTermAssignment_3_13399);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getNthTermTermParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__NthTermAssignment_3_1"


    // $ANTLR start "rule__Term__TermAssignment"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1706:1: rule__Term__TermAssignment : ( ( rule__Term__TermAlternatives_0 ) ) ;
    public final void rule__Term__TermAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1710:1: ( ( ( rule__Term__TermAlternatives_0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1711:1: ( ( rule__Term__TermAlternatives_0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1711:1: ( ( rule__Term__TermAlternatives_0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1712:1: ( rule__Term__TermAlternatives_0 )
            {
             before(grammarAccess.getTermAccess().getTermAlternatives_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1713:1: ( rule__Term__TermAlternatives_0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1713:2: rule__Term__TermAlternatives_0
            {
            pushFollow(FOLLOW_rule__Term__TermAlternatives_0_in_rule__Term__TermAssignment3430);
            rule__Term__TermAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getTermAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TermAssignment"


    // $ANTLR start "rule__Atom__AtomAssignment"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1722:1: rule__Atom__AtomAssignment : ( ( rule__Atom__AtomAlternatives_0 ) ) ;
    public final void rule__Atom__AtomAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1726:1: ( ( ( rule__Atom__AtomAlternatives_0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1727:1: ( ( rule__Atom__AtomAlternatives_0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1727:1: ( ( rule__Atom__AtomAlternatives_0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1728:1: ( rule__Atom__AtomAlternatives_0 )
            {
             before(grammarAccess.getAtomAccess().getAtomAlternatives_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1729:1: ( rule__Atom__AtomAlternatives_0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1729:2: rule__Atom__AtomAlternatives_0
            {
            pushFollow(FOLLOW_rule__Atom__AtomAlternatives_0_in_rule__Atom__AtomAssignment3463);
            rule__Atom__AtomAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAtomAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__AtomAssignment"


    // $ANTLR start "rule__List__ListAssignment_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1738:1: rule__List__ListAssignment_0 : ( ( '[]' ) ) ;
    public final void rule__List__ListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1742:1: ( ( ( '[]' ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1743:1: ( ( '[]' ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1743:1: ( ( '[]' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1744:1: ( '[]' )
            {
             before(grammarAccess.getListAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1745:1: ( '[]' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1746:1: '[]'
            {
             before(grammarAccess.getListAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__List__ListAssignment_03501); 
             after(grammarAccess.getListAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0()); 

            }

             after(grammarAccess.getListAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ListAssignment_0"


    // $ANTLR start "rule__NotEmptyList__FolgeAssignment_1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1761:1: rule__NotEmptyList__FolgeAssignment_1 : ( ruleFolge ) ;
    public final void rule__NotEmptyList__FolgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1765:1: ( ( ruleFolge ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1766:1: ( ruleFolge )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1766:1: ( ruleFolge )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1767:1: ruleFolge
            {
             before(grammarAccess.getNotEmptyListAccess().getFolgeFolgeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFolge_in_rule__NotEmptyList__FolgeAssignment_13540);
            ruleFolge();

            state._fsp--;

             after(grammarAccess.getNotEmptyListAccess().getFolgeFolgeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyList__FolgeAssignment_1"


    // $ANTLR start "rule__Folge__AtomAssignment_0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1776:1: rule__Folge__AtomAssignment_0 : ( ruleAtom ) ;
    public final void rule__Folge__AtomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1780:1: ( ( ruleAtom ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1781:1: ( ruleAtom )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1781:1: ( ruleAtom )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1782:1: ruleAtom
            {
             before(grammarAccess.getFolgeAccess().getAtomAtomParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAtom_in_rule__Folge__AtomAssignment_03571);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFolgeAccess().getAtomAtomParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__AtomAssignment_0"


    // $ANTLR start "rule__Folge__NthAtomAssignment_1_1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1791:1: rule__Folge__NthAtomAssignment_1_1 : ( ruleAtom ) ;
    public final void rule__Folge__NthAtomAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1795:1: ( ( ruleAtom ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1796:1: ( ruleAtom )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1796:1: ( ruleAtom )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1797:1: ruleAtom
            {
             before(grammarAccess.getFolgeAccess().getNthAtomAtomParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAtom_in_rule__Folge__NthAtomAssignment_1_13602);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFolgeAccess().getNthAtomAtomParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folge__NthAtomAssignment_1_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\41\uffff";
    static final String DFA2_eofS =
        "\41\uffff";
    static final String DFA2_minS =
        "\1\4\1\21\1\4\4\17\2\4\1\16\7\17\1\4\2\uffff\1\4\7\17\1\4\4\17";
    static final String DFA2_maxS =
        "\1\4\1\21\1\25\4\22\1\6\1\25\1\20\3\24\4\22\1\6\2\uffff\1\6\1\22"+
        "\6\24\1\6\1\22\3\24";
    static final String DFA2_acceptS =
        "\22\uffff\1\2\1\1\15\uffff";
    static final String DFA2_specialS =
        "\41\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\5\1\4\14\uffff\1\7\1\uffff\1\6",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\12\1\14\1\13",
            "\1\15\1\17\1\16\14\uffff\1\21\1\uffff\1\20",
            "\1\23\1\uffff\1\22",
            "\1\24\4\uffff\1\25",
            "\1\24\4\uffff\1\25",
            "\1\24\4\uffff\1\25",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\26\1\30\1\27",
            "",
            "",
            "\1\31\1\33\1\32",
            "\1\10\2\uffff\1\11",
            "\1\34\4\uffff\1\35",
            "\1\34\4\uffff\1\35",
            "\1\34\4\uffff\1\35",
            "\1\24\4\uffff\1\25",
            "\1\24\4\uffff\1\25",
            "\1\24\4\uffff\1\25",
            "\1\36\1\40\1\37",
            "\1\10\2\uffff\1\11",
            "\1\34\4\uffff\1\35",
            "\1\34\4\uffff\1\35",
            "\1\34\4\uffff\1\35"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "487:1: rule__Clause__Alternatives : ( ( ( rule__Clause__FactAssignment_0 ) ) | ( ( rule__Clause__RuleAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulePrologDsl_in_entryRulePrologDsl61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrologDsl68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__Group__0_in_rulePrologDsl94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ClauseAssignment_in_ruleProgram156 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Program__ClauseAssignment_in_ruleProgram168 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleExquery_in_entryRuleExquery198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExquery205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exquery__Group__0_in_ruleExquery231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Clause__Alternatives_in_ruleClause351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0_in_ruleFact411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0_in_rulePredicate531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFunctor591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__TermAssignment_in_ruleTerm650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__AtomAssignment_in_ruleAtom710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Alternatives_in_ruleList770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyList804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__0_in_ruleNotEmptyList830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolge_in_entryRuleFolge857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFolge864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group__0_in_ruleFolge890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Clause__FactAssignment_0_in_rule__Clause__Alternatives985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Clause__RuleAssignment_1_in_rule__Clause__Alternatives1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Term__TermAlternatives_01036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__Term__TermAlternatives_01053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Atom__AtomAlternatives_01085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Atom__AtomAlternatives_01102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Atom__AtomAlternatives_01119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__ListAssignment_0_in_rule__List__Alternatives1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_rule__List__Alternatives1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__Group__0__Impl_in_rule__PrologDsl__Group__01199 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PrologDsl__Group__1_in_rule__PrologDsl__Group__01202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__ProgramAssignment_0_in_rule__PrologDsl__Group__0__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__Group__1__Impl_in_rule__PrologDsl__Group__11259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__ExqueryAssignment_1_in_rule__PrologDsl__Group__1__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exquery__Group__0__Impl_in_rule__Exquery__Group__01320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exquery__Group__1_in_rule__Exquery__Group__01323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Exquery__Group__0__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exquery__Group__1__Impl_in_rule__Exquery__Group__11382 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Exquery__Group__2_in_rule__Exquery__Group__11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exquery__QueryAssignment_1_in_rule__Exquery__Group__1__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exquery__Group__2__Impl_in_rule__Exquery__Group__21442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Exquery__Group__2__Impl1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01507 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__PredicateAssignment_0_in_rule__Query__Group__0__Impl1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl1594 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__01629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__01632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Query__Group_1__0__Impl1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__11691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__NthPredicateAssignment_1_1_in_rule__Query__Group_1__1__Impl1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__01752 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__01755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__PredicateAssignment_0_in_rule__Fact__Group__0__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Fact__Group__1__Impl1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01875 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__PredicateAssignment_0_in_rule__Rule__Group__0__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Rule__Group__1__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21997 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__QueryAssignment_2_in_rule__Rule__Group__2__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Rule__Group__3__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__02124 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__02127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__FunctorAssignment_0_in_rule__Predicate__Group__0__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__12184 = new BitSet(new long[]{0x0000000000280070L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__12187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Predicate__Group__1__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__22246 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__22249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__TermAssignment_2_in_rule__Predicate__Group__2__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__32306 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__32309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl2336 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__42367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Predicate__Group__4__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__02436 = new BitSet(new long[]{0x0000000000280070L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__02439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Predicate__Group_3__0__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__12498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__NthTermAssignment_3_1_in_rule__Predicate__Group_3__1__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__0__Impl_in_rule__NotEmptyList__Group__02559 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__1_in_rule__NotEmptyList__Group__02562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NotEmptyList__Group__0__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__1__Impl_in_rule__NotEmptyList__Group__12621 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__2_in_rule__NotEmptyList__Group__12624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__FolgeAssignment_1_in_rule__NotEmptyList__Group__1__Impl2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__2__Impl_in_rule__NotEmptyList__Group__22681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NotEmptyList__Group__2__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group__0__Impl_in_rule__Folge__Group__02746 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Folge__Group__1_in_rule__Folge__Group__02749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__AtomAssignment_0_in_rule__Folge__Group__0__Impl2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group__1__Impl_in_rule__Folge__Group__12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__0_in_rule__Folge__Group__1__Impl2833 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__0__Impl_in_rule__Folge__Group_1__02868 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__1_in_rule__Folge__Group_1__02871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Folge__Group_1__0__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__1__Impl_in_rule__Folge__Group_1__12930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__NthAtomAssignment_1_1_in_rule__Folge__Group_1__1__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__PrologDsl__ProgramAssignment_02996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExquery_in_rule__PrologDsl__ExqueryAssignment_13027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClause_in_rule__Program__ClauseAssignment3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Exquery__QueryAssignment_13089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__Query__PredicateAssignment_03120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__Query__NthPredicateAssignment_1_13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_rule__Clause__FactAssignment_03182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Clause__RuleAssignment_13213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__Fact__PredicateAssignment_03244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__Rule__PredicateAssignment_03275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Rule__QueryAssignment_23306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_rule__Predicate__FunctorAssignment_03337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Predicate__TermAssignment_23368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Predicate__NthTermAssignment_3_13399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__TermAlternatives_0_in_rule__Term__TermAssignment3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__AtomAlternatives_0_in_rule__Atom__AtomAssignment3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__List__ListAssignment_03501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolge_in_rule__NotEmptyList__FolgeAssignment_13540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Folge__AtomAssignment_03571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Folge__NthAtomAssignment_1_13602 = new BitSet(new long[]{0x0000000000000002L});

}