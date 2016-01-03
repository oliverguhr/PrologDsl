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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_INT", "RULE_VARIABLE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[]'", "'?-'", "'.'", "','", "':-'", "'('", "')'", "'['", "']'"
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:97:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:101:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:102:1: ( ( rule__Program__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:102:1: ( ( rule__Program__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:103:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:104:1: ( rule__Program__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:104:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram154);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:116:1: entryRuleExquery : ruleExquery EOF ;
    public final void entryRuleExquery() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:117:1: ( ruleExquery EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:118:1: ruleExquery EOF
            {
             before(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_ruleExquery_in_entryRuleExquery181);
            ruleExquery();

            state._fsp--;

             after(grammarAccess.getExqueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExquery188); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:125:1: ruleExquery : ( ( rule__Exquery__Group__0 ) ) ;
    public final void ruleExquery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:129:2: ( ( ( rule__Exquery__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:130:1: ( ( rule__Exquery__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:130:1: ( ( rule__Exquery__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:131:1: ( rule__Exquery__Group__0 )
            {
             before(grammarAccess.getExqueryAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:132:1: ( rule__Exquery__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:132:2: rule__Exquery__Group__0
            {
            pushFollow(FOLLOW_rule__Exquery__Group__0_in_ruleExquery214);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:144:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:145:1: ( ruleQuery EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:146:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery241);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery248); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:153:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:157:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:158:1: ( ( rule__Query__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:158:1: ( ( rule__Query__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:159:1: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:160:1: ( rule__Query__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:160:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery274);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:172:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:173:1: ( ruleClause EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:174:1: ruleClause EOF
            {
             before(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause301);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause308); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:181:1: ruleClause : ( ( rule__Clause__Alternatives ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:185:2: ( ( ( rule__Clause__Alternatives ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:186:1: ( ( rule__Clause__Alternatives ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:186:1: ( ( rule__Clause__Alternatives ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:187:1: ( rule__Clause__Alternatives )
            {
             before(grammarAccess.getClauseAccess().getAlternatives()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:188:1: ( rule__Clause__Alternatives )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:188:2: rule__Clause__Alternatives
            {
            pushFollow(FOLLOW_rule__Clause__Alternatives_in_ruleClause334);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:200:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:201:1: ( ruleFact EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:202:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact361);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact368); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:209:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:213:2: ( ( ( rule__Fact__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:214:1: ( ( rule__Fact__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:214:1: ( ( rule__Fact__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:215:1: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:216:1: ( rule__Fact__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:216:2: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_rule__Fact__Group__0_in_ruleFact394);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:228:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:229:1: ( ruleRule EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:230:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule421);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule428); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:237:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:241:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:242:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:242:1: ( ( rule__Rule__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:243:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:244:1: ( rule__Rule__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:244:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule454);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:256:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:257:1: ( rulePredicate EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:258:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate481);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate488); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:265:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:269:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:270:1: ( ( rule__Predicate__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:270:1: ( ( rule__Predicate__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:271:1: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:272:1: ( rule__Predicate__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:272:2: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0_in_rulePredicate514);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:284:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:285:1: ( ruleFunctor EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:286:1: ruleFunctor EOF
            {
             before(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor541);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getFunctorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor548); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:293:1: ruleFunctor : ( RULE_IDENT ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:297:2: ( ( RULE_IDENT ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:298:1: ( RULE_IDENT )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:298:1: ( RULE_IDENT )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:299:1: RULE_IDENT
            {
             before(grammarAccess.getFunctorAccess().getIdentTerminalRuleCall()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFunctor574); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:312:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:313:1: ( ruleTerm EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:314:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm600);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm607); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:321:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:325:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:326:1: ( ( rule__Term__Alternatives ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:326:1: ( ( rule__Term__Alternatives ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:327:1: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:328:1: ( rule__Term__Alternatives )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:328:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm633);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:340:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:341:1: ( ruleAtom EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:342:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom660);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom667); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:349:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:353:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:354:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:354:1: ( ( rule__Atom__Alternatives ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:355:1: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:356:1: ( rule__Atom__Alternatives )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:356:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleAtom693);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:368:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:369:1: ( ruleList EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:370:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList720);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList727); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:377:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:381:2: ( ( ( rule__List__Alternatives ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:382:1: ( ( rule__List__Alternatives ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:382:1: ( ( rule__List__Alternatives ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:383:1: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:384:1: ( rule__List__Alternatives )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:384:2: rule__List__Alternatives
            {
            pushFollow(FOLLOW_rule__List__Alternatives_in_ruleList753);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:396:1: entryRuleNotEmptyList : ruleNotEmptyList EOF ;
    public final void entryRuleNotEmptyList() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:397:1: ( ruleNotEmptyList EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:398:1: ruleNotEmptyList EOF
            {
             before(grammarAccess.getNotEmptyListRule()); 
            pushFollow(FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList780);
            ruleNotEmptyList();

            state._fsp--;

             after(grammarAccess.getNotEmptyListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyList787); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:405:1: ruleNotEmptyList : ( ( rule__NotEmptyList__Group__0 ) ) ;
    public final void ruleNotEmptyList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:409:2: ( ( ( rule__NotEmptyList__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:410:1: ( ( rule__NotEmptyList__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:410:1: ( ( rule__NotEmptyList__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:411:1: ( rule__NotEmptyList__Group__0 )
            {
             before(grammarAccess.getNotEmptyListAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:412:1: ( rule__NotEmptyList__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:412:2: rule__NotEmptyList__Group__0
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__0_in_ruleNotEmptyList813);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:424:1: entryRuleFolge : ruleFolge EOF ;
    public final void entryRuleFolge() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:425:1: ( ruleFolge EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:426:1: ruleFolge EOF
            {
             before(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_ruleFolge_in_entryRuleFolge840);
            ruleFolge();

            state._fsp--;

             after(grammarAccess.getFolgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFolge847); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:433:1: ruleFolge : ( ( rule__Folge__Group__0 ) ) ;
    public final void ruleFolge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:437:2: ( ( ( rule__Folge__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:438:1: ( ( rule__Folge__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:438:1: ( ( rule__Folge__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:439:1: ( rule__Folge__Group__0 )
            {
             before(grammarAccess.getFolgeAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:440:1: ( rule__Folge__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:440:2: rule__Folge__Group__0
            {
            pushFollow(FOLLOW_rule__Folge__Group__0_in_ruleFolge873);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:452:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:453:1: ( ruleNumber EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:454:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber900);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber907); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:461:1: ruleNumber : ( RULE_INT ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:465:2: ( ( RULE_INT ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:466:1: ( RULE_INT )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:466:1: ( RULE_INT )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:467:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber933); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:480:1: rule__Clause__Alternatives : ( ( ruleFact ) | ( ruleRule ) );
    public final void rule__Clause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:484:1: ( ( ruleFact ) | ( ruleRule ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:485:1: ( ruleFact )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:485:1: ( ruleFact )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:486:1: ruleFact
                    {
                     before(grammarAccess.getClauseAccess().getFactParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFact_in_rule__Clause__Alternatives968);
                    ruleFact();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getFactParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:491:6: ( ruleRule )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:491:6: ( ruleRule )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:492:1: ruleRule
                    {
                     before(grammarAccess.getClauseAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__Clause__Alternatives985);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getRuleParserRuleCall_1()); 

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


    // $ANTLR start "rule__Term__Alternatives"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:502:1: rule__Term__Alternatives : ( ( ruleAtom ) | ( ruleList ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:506:1: ( ( ruleAtom ) | ( ruleList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_IDENT && LA2_0<=RULE_VARIABLE)) ) {
                alt2=1;
            }
            else if ( (LA2_0==13||LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:507:1: ( ruleAtom )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:507:1: ( ruleAtom )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:508:1: ruleAtom
                    {
                     before(grammarAccess.getTermAccess().getAtomParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtom_in_rule__Term__Alternatives1017);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getAtomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:513:6: ( ruleList )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:513:6: ( ruleList )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:514:1: ruleList
                    {
                     before(grammarAccess.getTermAccess().getListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleList_in_rule__Term__Alternatives1034);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getListParserRuleCall_1()); 

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
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:524:1: rule__Atom__Alternatives : ( ( RULE_IDENT ) | ( RULE_VARIABLE ) | ( ruleNumber ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:528:1: ( ( RULE_IDENT ) | ( RULE_VARIABLE ) | ( ruleNumber ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt3=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:529:1: ( RULE_IDENT )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:529:1: ( RULE_IDENT )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:530:1: RULE_IDENT
                    {
                     before(grammarAccess.getAtomAccess().getIdentTerminalRuleCall_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Atom__Alternatives1066); 
                     after(grammarAccess.getAtomAccess().getIdentTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:535:6: ( RULE_VARIABLE )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:535:6: ( RULE_VARIABLE )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:536:1: RULE_VARIABLE
                    {
                     before(grammarAccess.getAtomAccess().getVariableTerminalRuleCall_1()); 
                    match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Atom__Alternatives1083); 
                     after(grammarAccess.getAtomAccess().getVariableTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:541:6: ( ruleNumber )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:541:6: ( ruleNumber )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:542:1: ruleNumber
                    {
                     before(grammarAccess.getAtomAccess().getNumberParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Atom__Alternatives1100);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getNumberParserRuleCall_2()); 

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
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__List__Alternatives"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:552:1: rule__List__Alternatives : ( ( '[]' ) | ( ruleNotEmptyList ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:556:1: ( ( '[]' ) | ( ruleNotEmptyList ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:557:1: ( '[]' )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:557:1: ( '[]' )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:558:1: '[]'
                    {
                     before(grammarAccess.getListAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__List__Alternatives1133); 
                     after(grammarAccess.getListAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:565:6: ( ruleNotEmptyList )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:565:6: ( ruleNotEmptyList )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:566:1: ruleNotEmptyList
                    {
                     before(grammarAccess.getListAccess().getNotEmptyListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNotEmptyList_in_rule__List__Alternatives1152);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:578:1: rule__PrologDsl__Group__0 : rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1 ;
    public final void rule__PrologDsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:582:1: ( rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:583:2: rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1
            {
            pushFollow(FOLLOW_rule__PrologDsl__Group__0__Impl_in_rule__PrologDsl__Group__01182);
            rule__PrologDsl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrologDsl__Group__1_in_rule__PrologDsl__Group__01185);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:590:1: rule__PrologDsl__Group__0__Impl : ( ( rule__PrologDsl__ProgramAssignment_0 ) ) ;
    public final void rule__PrologDsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:594:1: ( ( ( rule__PrologDsl__ProgramAssignment_0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:595:1: ( ( rule__PrologDsl__ProgramAssignment_0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:595:1: ( ( rule__PrologDsl__ProgramAssignment_0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:596:1: ( rule__PrologDsl__ProgramAssignment_0 )
            {
             before(grammarAccess.getPrologDslAccess().getProgramAssignment_0()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:597:1: ( rule__PrologDsl__ProgramAssignment_0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:597:2: rule__PrologDsl__ProgramAssignment_0
            {
            pushFollow(FOLLOW_rule__PrologDsl__ProgramAssignment_0_in_rule__PrologDsl__Group__0__Impl1212);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:607:1: rule__PrologDsl__Group__1 : rule__PrologDsl__Group__1__Impl ;
    public final void rule__PrologDsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:611:1: ( rule__PrologDsl__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:612:2: rule__PrologDsl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PrologDsl__Group__1__Impl_in_rule__PrologDsl__Group__11242);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:618:1: rule__PrologDsl__Group__1__Impl : ( ( rule__PrologDsl__ExqueryAssignment_1 ) ) ;
    public final void rule__PrologDsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:622:1: ( ( ( rule__PrologDsl__ExqueryAssignment_1 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:623:1: ( ( rule__PrologDsl__ExqueryAssignment_1 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:623:1: ( ( rule__PrologDsl__ExqueryAssignment_1 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:624:1: ( rule__PrologDsl__ExqueryAssignment_1 )
            {
             before(grammarAccess.getPrologDslAccess().getExqueryAssignment_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:625:1: ( rule__PrologDsl__ExqueryAssignment_1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:625:2: rule__PrologDsl__ExqueryAssignment_1
            {
            pushFollow(FOLLOW_rule__PrologDsl__ExqueryAssignment_1_in_rule__PrologDsl__Group__1__Impl1269);
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


    // $ANTLR start "rule__Program__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:639:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:643:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:644:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01303);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01306);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:651:1: rule__Program__Group__0__Impl : ( ruleClause ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:655:1: ( ( ruleClause ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:656:1: ( ruleClause )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:656:1: ( ruleClause )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:657:1: ruleClause
            {
             before(grammarAccess.getProgramAccess().getClauseParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleClause_in_rule__Program__Group__0__Impl1333);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getClauseParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:668:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:672:1: ( rule__Program__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:673:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11362);
            rule__Program__Group__1__Impl();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:679:1: rule__Program__Group__1__Impl : ( ( ruleClause )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:683:1: ( ( ( ruleClause )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:684:1: ( ( ruleClause )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:684:1: ( ( ruleClause )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:685:1: ( ruleClause )*
            {
             before(grammarAccess.getProgramAccess().getClauseParserRuleCall_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:686:1: ( ruleClause )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_IDENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:686:3: ruleClause
            	    {
            	    pushFollow(FOLLOW_ruleClause_in_rule__Program__Group__1__Impl1390);
            	    ruleClause();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getClauseParserRuleCall_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Exquery__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:700:1: rule__Exquery__Group__0 : rule__Exquery__Group__0__Impl rule__Exquery__Group__1 ;
    public final void rule__Exquery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:704:1: ( rule__Exquery__Group__0__Impl rule__Exquery__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:705:2: rule__Exquery__Group__0__Impl rule__Exquery__Group__1
            {
            pushFollow(FOLLOW_rule__Exquery__Group__0__Impl_in_rule__Exquery__Group__01425);
            rule__Exquery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exquery__Group__1_in_rule__Exquery__Group__01428);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:712:1: rule__Exquery__Group__0__Impl : ( '?-' ) ;
    public final void rule__Exquery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:716:1: ( ( '?-' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:717:1: ( '?-' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:717:1: ( '?-' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:718:1: '?-'
            {
             before(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Exquery__Group__0__Impl1456); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:731:1: rule__Exquery__Group__1 : rule__Exquery__Group__1__Impl rule__Exquery__Group__2 ;
    public final void rule__Exquery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:735:1: ( rule__Exquery__Group__1__Impl rule__Exquery__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:736:2: rule__Exquery__Group__1__Impl rule__Exquery__Group__2
            {
            pushFollow(FOLLOW_rule__Exquery__Group__1__Impl_in_rule__Exquery__Group__11487);
            rule__Exquery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exquery__Group__2_in_rule__Exquery__Group__11490);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:743:1: rule__Exquery__Group__1__Impl : ( ruleQuery ) ;
    public final void rule__Exquery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:747:1: ( ( ruleQuery ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:748:1: ( ruleQuery )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:748:1: ( ruleQuery )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:749:1: ruleQuery
            {
             before(grammarAccess.getExqueryAccess().getQueryParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleQuery_in_rule__Exquery__Group__1__Impl1517);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getExqueryAccess().getQueryParserRuleCall_1()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:760:1: rule__Exquery__Group__2 : rule__Exquery__Group__2__Impl ;
    public final void rule__Exquery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:764:1: ( rule__Exquery__Group__2__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:765:2: rule__Exquery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Exquery__Group__2__Impl_in_rule__Exquery__Group__21546);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:771:1: rule__Exquery__Group__2__Impl : ( '.' ) ;
    public final void rule__Exquery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:775:1: ( ( '.' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:776:1: ( '.' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:776:1: ( '.' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:777:1: '.'
            {
             before(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Exquery__Group__2__Impl1574); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:796:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:800:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:801:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01611);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01614);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:808:1: rule__Query__Group__0__Impl : ( rulePredicate ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:812:1: ( ( rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:813:1: ( rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:813:1: ( rulePredicate )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:814:1: rulePredicate
            {
             before(grammarAccess.getQueryAccess().getPredicateParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__Query__Group__0__Impl1641);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getPredicateParserRuleCall_0()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:825:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:829:1: ( rule__Query__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:830:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11670);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:836:1: rule__Query__Group__1__Impl : ( ( rule__Query__Group_1__0 )* ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:840:1: ( ( ( rule__Query__Group_1__0 )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:841:1: ( ( rule__Query__Group_1__0 )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:841:1: ( ( rule__Query__Group_1__0 )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:842:1: ( rule__Query__Group_1__0 )*
            {
             before(grammarAccess.getQueryAccess().getGroup_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:843:1: ( rule__Query__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:843:2: rule__Query__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl1697);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:857:1: rule__Query__Group_1__0 : rule__Query__Group_1__0__Impl rule__Query__Group_1__1 ;
    public final void rule__Query__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:861:1: ( rule__Query__Group_1__0__Impl rule__Query__Group_1__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:862:2: rule__Query__Group_1__0__Impl rule__Query__Group_1__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__01732);
            rule__Query__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__01735);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:869:1: rule__Query__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:873:1: ( ( ',' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:874:1: ( ',' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:874:1: ( ',' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:875:1: ','
            {
             before(grammarAccess.getQueryAccess().getCommaKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Query__Group_1__0__Impl1763); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:888:1: rule__Query__Group_1__1 : rule__Query__Group_1__1__Impl ;
    public final void rule__Query__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:892:1: ( rule__Query__Group_1__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:893:2: rule__Query__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__11794);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:899:1: rule__Query__Group_1__1__Impl : ( rulePredicate ) ;
    public final void rule__Query__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:903:1: ( ( rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:904:1: ( rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:904:1: ( rulePredicate )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:905:1: rulePredicate
            {
             before(grammarAccess.getQueryAccess().getPredicateParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__Query__Group_1__1__Impl1821);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getPredicateParserRuleCall_1_1()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:920:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:924:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:925:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__01854);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__01857);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:932:1: rule__Fact__Group__0__Impl : ( rulePredicate ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:936:1: ( ( rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:937:1: ( rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:937:1: ( rulePredicate )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:938:1: rulePredicate
            {
             before(grammarAccess.getFactAccess().getPredicateParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__Fact__Group__0__Impl1884);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getFactAccess().getPredicateParserRuleCall_0()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:949:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:953:1: ( rule__Fact__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:954:2: rule__Fact__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__11913);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:960:1: rule__Fact__Group__1__Impl : ( '.' ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:964:1: ( ( '.' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:965:1: ( '.' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:965:1: ( '.' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:966:1: '.'
            {
             before(grammarAccess.getFactAccess().getFullStopKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Fact__Group__1__Impl1941); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:983:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:987:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:988:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01976);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01979);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:995:1: rule__Rule__Group__0__Impl : ( rulePredicate ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:999:1: ( ( rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1000:1: ( rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1000:1: ( rulePredicate )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1001:1: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPredicateParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__Rule__Group__0__Impl2006);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicateParserRuleCall_0()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1012:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1016:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1017:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12035);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12038);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1024:1: rule__Rule__Group__1__Impl : ( ':-' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1028:1: ( ( ':-' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1029:1: ( ':-' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1029:1: ( ':-' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1030:1: ':-'
            {
             before(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Rule__Group__1__Impl2066); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1043:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1047:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1048:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22097);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22100);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1055:1: rule__Rule__Group__2__Impl : ( ruleQuery ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1059:1: ( ( ruleQuery ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1060:1: ( ruleQuery )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1060:1: ( ruleQuery )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1061:1: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getQueryParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleQuery_in_rule__Rule__Group__2__Impl2127);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getQueryParserRuleCall_2()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1072:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1076:1: ( rule__Rule__Group__3__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1077:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32156);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1083:1: rule__Rule__Group__3__Impl : ( '.' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1087:1: ( ( '.' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1088:1: ( '.' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1088:1: ( '.' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1089:1: '.'
            {
             before(grammarAccess.getRuleAccess().getFullStopKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Rule__Group__3__Impl2184); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1110:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1114:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1115:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__02223);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__02226);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1122:1: rule__Predicate__Group__0__Impl : ( ruleFunctor ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1126:1: ( ( ruleFunctor ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1127:1: ( ruleFunctor )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1127:1: ( ruleFunctor )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1128:1: ruleFunctor
            {
             before(grammarAccess.getPredicateAccess().getFunctorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFunctor_in_rule__Predicate__Group__0__Impl2253);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getFunctorParserRuleCall_0()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1139:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1143:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1144:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__12282);
            rule__Predicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__12285);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1151:1: rule__Predicate__Group__1__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1155:1: ( ( '(' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1156:1: ( '(' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1156:1: ( '(' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1157:1: '('
            {
             before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Predicate__Group__1__Impl2313); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1170:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1174:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1175:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__22344);
            rule__Predicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__22347);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1182:1: rule__Predicate__Group__2__Impl : ( ruleTerm ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1186:1: ( ( ruleTerm ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1187:1: ( ruleTerm )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1187:1: ( ruleTerm )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1188:1: ruleTerm
            {
             before(grammarAccess.getPredicateAccess().getTermParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Predicate__Group__2__Impl2374);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getTermParserRuleCall_2()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1199:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1203:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1204:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__32403);
            rule__Predicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__32406);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1211:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__Group_3__0 )* ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1215:1: ( ( ( rule__Predicate__Group_3__0 )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1216:1: ( ( rule__Predicate__Group_3__0 )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1216:1: ( ( rule__Predicate__Group_3__0 )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1217:1: ( rule__Predicate__Group_3__0 )*
            {
             before(grammarAccess.getPredicateAccess().getGroup_3()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1218:1: ( rule__Predicate__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1218:2: rule__Predicate__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl2433);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1228:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1232:1: ( rule__Predicate__Group__4__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1233:2: rule__Predicate__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__42464);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1239:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1243:1: ( ( ')' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1244:1: ( ')' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1244:1: ( ')' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1245:1: ')'
            {
             before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Predicate__Group__4__Impl2492); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1268:1: rule__Predicate__Group_3__0 : rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 ;
    public final void rule__Predicate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1272:1: ( rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1273:2: rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__02533);
            rule__Predicate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__02536);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1280:1: rule__Predicate__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Predicate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1284:1: ( ( ',' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1285:1: ( ',' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1285:1: ( ',' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1286:1: ','
            {
             before(grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Predicate__Group_3__0__Impl2564); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1299:1: rule__Predicate__Group_3__1 : rule__Predicate__Group_3__1__Impl ;
    public final void rule__Predicate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1303:1: ( rule__Predicate__Group_3__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1304:2: rule__Predicate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__12595);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1310:1: rule__Predicate__Group_3__1__Impl : ( ruleTerm ) ;
    public final void rule__Predicate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1314:1: ( ( ruleTerm ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1315:1: ( ruleTerm )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1315:1: ( ruleTerm )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1316:1: ruleTerm
            {
             before(grammarAccess.getPredicateAccess().getTermParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Predicate__Group_3__1__Impl2622);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getTermParserRuleCall_3_1()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1331:1: rule__NotEmptyList__Group__0 : rule__NotEmptyList__Group__0__Impl rule__NotEmptyList__Group__1 ;
    public final void rule__NotEmptyList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1335:1: ( rule__NotEmptyList__Group__0__Impl rule__NotEmptyList__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1336:2: rule__NotEmptyList__Group__0__Impl rule__NotEmptyList__Group__1
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__0__Impl_in_rule__NotEmptyList__Group__02655);
            rule__NotEmptyList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyList__Group__1_in_rule__NotEmptyList__Group__02658);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1343:1: rule__NotEmptyList__Group__0__Impl : ( '[' ) ;
    public final void rule__NotEmptyList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1347:1: ( ( '[' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1348:1: ( '[' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1348:1: ( '[' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1349:1: '['
            {
             before(grammarAccess.getNotEmptyListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__NotEmptyList__Group__0__Impl2686); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1362:1: rule__NotEmptyList__Group__1 : rule__NotEmptyList__Group__1__Impl rule__NotEmptyList__Group__2 ;
    public final void rule__NotEmptyList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1366:1: ( rule__NotEmptyList__Group__1__Impl rule__NotEmptyList__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1367:2: rule__NotEmptyList__Group__1__Impl rule__NotEmptyList__Group__2
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__1__Impl_in_rule__NotEmptyList__Group__12717);
            rule__NotEmptyList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyList__Group__2_in_rule__NotEmptyList__Group__12720);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1374:1: rule__NotEmptyList__Group__1__Impl : ( ruleFolge ) ;
    public final void rule__NotEmptyList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1378:1: ( ( ruleFolge ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1379:1: ( ruleFolge )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1379:1: ( ruleFolge )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1380:1: ruleFolge
            {
             before(grammarAccess.getNotEmptyListAccess().getFolgeParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFolge_in_rule__NotEmptyList__Group__1__Impl2747);
            ruleFolge();

            state._fsp--;

             after(grammarAccess.getNotEmptyListAccess().getFolgeParserRuleCall_1()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1391:1: rule__NotEmptyList__Group__2 : rule__NotEmptyList__Group__2__Impl ;
    public final void rule__NotEmptyList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1395:1: ( rule__NotEmptyList__Group__2__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1396:2: rule__NotEmptyList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__2__Impl_in_rule__NotEmptyList__Group__22776);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1402:1: rule__NotEmptyList__Group__2__Impl : ( ']' ) ;
    public final void rule__NotEmptyList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1406:1: ( ( ']' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1407:1: ( ']' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1407:1: ( ']' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1408:1: ']'
            {
             before(grammarAccess.getNotEmptyListAccess().getRightSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__NotEmptyList__Group__2__Impl2804); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1427:1: rule__Folge__Group__0 : rule__Folge__Group__0__Impl rule__Folge__Group__1 ;
    public final void rule__Folge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1431:1: ( rule__Folge__Group__0__Impl rule__Folge__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1432:2: rule__Folge__Group__0__Impl rule__Folge__Group__1
            {
            pushFollow(FOLLOW_rule__Folge__Group__0__Impl_in_rule__Folge__Group__02841);
            rule__Folge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folge__Group__1_in_rule__Folge__Group__02844);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1439:1: rule__Folge__Group__0__Impl : ( ruleAtom ) ;
    public final void rule__Folge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1443:1: ( ( ruleAtom ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1444:1: ( ruleAtom )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1444:1: ( ruleAtom )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1445:1: ruleAtom
            {
             before(grammarAccess.getFolgeAccess().getAtomParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtom_in_rule__Folge__Group__0__Impl2871);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFolgeAccess().getAtomParserRuleCall_0()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1456:1: rule__Folge__Group__1 : rule__Folge__Group__1__Impl ;
    public final void rule__Folge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1460:1: ( rule__Folge__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1461:2: rule__Folge__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Folge__Group__1__Impl_in_rule__Folge__Group__12900);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1467:1: rule__Folge__Group__1__Impl : ( ( rule__Folge__Group_1__0 )* ) ;
    public final void rule__Folge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1471:1: ( ( ( rule__Folge__Group_1__0 )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1472:1: ( ( rule__Folge__Group_1__0 )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1472:1: ( ( rule__Folge__Group_1__0 )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1473:1: ( rule__Folge__Group_1__0 )*
            {
             before(grammarAccess.getFolgeAccess().getGroup_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1474:1: ( rule__Folge__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1474:2: rule__Folge__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Folge__Group_1__0_in_rule__Folge__Group__1__Impl2927);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1488:1: rule__Folge__Group_1__0 : rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1 ;
    public final void rule__Folge__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1492:1: ( rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1493:2: rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1
            {
            pushFollow(FOLLOW_rule__Folge__Group_1__0__Impl_in_rule__Folge__Group_1__02962);
            rule__Folge__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folge__Group_1__1_in_rule__Folge__Group_1__02965);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1500:1: rule__Folge__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Folge__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1504:1: ( ( ',' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1505:1: ( ',' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1505:1: ( ',' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1506:1: ','
            {
             before(grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Folge__Group_1__0__Impl2993); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1519:1: rule__Folge__Group_1__1 : rule__Folge__Group_1__1__Impl ;
    public final void rule__Folge__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1523:1: ( rule__Folge__Group_1__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1524:2: rule__Folge__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Folge__Group_1__1__Impl_in_rule__Folge__Group_1__13024);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1530:1: rule__Folge__Group_1__1__Impl : ( ruleAtom ) ;
    public final void rule__Folge__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1534:1: ( ( ruleAtom ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1535:1: ( ruleAtom )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1535:1: ( ruleAtom )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1536:1: ruleAtom
            {
             before(grammarAccess.getFolgeAccess().getAtomParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleAtom_in_rule__Folge__Group_1__1__Impl3051);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFolgeAccess().getAtomParserRuleCall_1_1()); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1552:1: rule__PrologDsl__ProgramAssignment_0 : ( ruleProgram ) ;
    public final void rule__PrologDsl__ProgramAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1556:1: ( ( ruleProgram ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1557:1: ( ruleProgram )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1557:1: ( ruleProgram )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1558:1: ruleProgram
            {
             before(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProgram_in_rule__PrologDsl__ProgramAssignment_03089);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1567:1: rule__PrologDsl__ExqueryAssignment_1 : ( ruleExquery ) ;
    public final void rule__PrologDsl__ExqueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1571:1: ( ( ruleExquery ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1572:1: ( ruleExquery )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1572:1: ( ruleExquery )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1573:1: ruleExquery
            {
             before(grammarAccess.getPrologDslAccess().getExqueryExqueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExquery_in_rule__PrologDsl__ExqueryAssignment_13120);
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\41\uffff";
    static final String DFA1_eofS =
        "\41\uffff";
    static final String DFA1_minS =
        "\1\4\1\22\1\4\4\20\2\4\1\17\7\20\1\4\2\uffff\1\4\7\20\1\4\4\20";
    static final String DFA1_maxS =
        "\1\4\1\22\1\24\4\23\1\6\1\24\1\21\3\25\4\23\1\6\2\uffff\1\6\1\23"+
        "\6\25\1\6\1\23\3\25";
    static final String DFA1_acceptS =
        "\22\uffff\1\2\1\1\15\uffff";
    static final String DFA1_specialS =
        "\41\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\5\1\4\6\uffff\1\6\6\uffff\1\7",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\12\1\14\1\13",
            "\1\15\1\17\1\16\6\uffff\1\20\6\uffff\1\21",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "480:1: rule__Clause__Alternatives : ( ( ruleFact ) | ( ruleRule ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulePrologDsl_in_entryRulePrologDsl61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrologDsl68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__Group__0_in_rulePrologDsl94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExquery_in_entryRuleExquery181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExquery188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exquery__Group__0_in_ruleExquery214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Clause__Alternatives_in_ruleClause334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0_in_ruleFact394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0_in_rulePredicate514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFunctor574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleAtom693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Alternatives_in_ruleList753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyList787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__0_in_ruleNotEmptyList813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolge_in_entryRuleFolge840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFolge847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group__0_in_ruleFolge873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_rule__Clause__Alternatives968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Clause__Alternatives985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Term__Alternatives1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__Term__Alternatives1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Atom__Alternatives1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Atom__Alternatives1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Atom__Alternatives1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__List__Alternatives1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_rule__List__Alternatives1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__Group__0__Impl_in_rule__PrologDsl__Group__01182 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PrologDsl__Group__1_in_rule__PrologDsl__Group__01185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__ProgramAssignment_0_in_rule__PrologDsl__Group__0__Impl1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__Group__1__Impl_in_rule__PrologDsl__Group__11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologDsl__ExqueryAssignment_1_in_rule__PrologDsl__Group__1__Impl1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClause_in_rule__Program__Group__0__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClause_in_rule__Program__Group__1__Impl1390 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Exquery__Group__0__Impl_in_rule__Exquery__Group__01425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exquery__Group__1_in_rule__Exquery__Group__01428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Exquery__Group__0__Impl1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exquery__Group__1__Impl_in_rule__Exquery__Group__11487 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Exquery__Group__2_in_rule__Exquery__Group__11490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Exquery__Group__1__Impl1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exquery__Group__2__Impl_in_rule__Exquery__Group__21546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Exquery__Group__2__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__01611 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__01614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__Query__Group__0__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__11670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl1697 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__01732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__01735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Query__Group_1__0__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__11794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__Query__Group_1__1__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__01854 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__01857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__Fact__Group__0__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__11913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Fact__Group__1__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01976 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__Rule__Group__0__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Rule__Group__1__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22097 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Rule__Group__2__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Rule__Group__3__Impl2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__02223 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__02226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_rule__Predicate__Group__0__Impl2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__12282 = new BitSet(new long[]{0x0000000000102070L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Predicate__Group__1__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__22344 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__22347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Predicate__Group__2__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__32403 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__32406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl2433 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__42464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Predicate__Group__4__Impl2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__02533 = new BitSet(new long[]{0x0000000000102070L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__02536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Predicate__Group_3__0__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__12595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Predicate__Group_3__1__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__0__Impl_in_rule__NotEmptyList__Group__02655 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__1_in_rule__NotEmptyList__Group__02658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NotEmptyList__Group__0__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__1__Impl_in_rule__NotEmptyList__Group__12717 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__2_in_rule__NotEmptyList__Group__12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolge_in_rule__NotEmptyList__Group__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__2__Impl_in_rule__NotEmptyList__Group__22776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NotEmptyList__Group__2__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group__0__Impl_in_rule__Folge__Group__02841 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Folge__Group__1_in_rule__Folge__Group__02844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Folge__Group__0__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group__1__Impl_in_rule__Folge__Group__12900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__0_in_rule__Folge__Group__1__Impl2927 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__0__Impl_in_rule__Folge__Group_1__02962 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__1_in_rule__Folge__Group_1__02965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Folge__Group_1__0__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__1__Impl_in_rule__Folge__Group_1__13024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Folge__Group_1__1__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__PrologDsl__ProgramAssignment_03089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExquery_in_rule__PrologDsl__ExqueryAssignment_13120 = new BitSet(new long[]{0x0000000000000002L});

}