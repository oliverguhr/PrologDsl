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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_IDENT", "RULE_VARIABLE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[]'", "'Hello'", "'!'", "','", "'['", "']'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int RULE_VARIABLE=6;
    public static final int T__17=17;
    public static final int RULE_IDENT=5;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

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




    // $ANTLR start "entryRuleModel"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:61:1: ( ruleModel EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:89:1: ( ruleGreeting EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:97:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:101:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:102:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:102:1: ( ( rule__Greeting__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:103:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:104:1: ( rule__Greeting__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:104:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleAtom"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:120:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:121:1: ( ruleAtom EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:122:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom186);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom193); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:129:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:133:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:134:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:134:1: ( ( rule__Atom__Alternatives ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:135:1: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:136:1: ( rule__Atom__Alternatives )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:136:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleAtom219);
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


    // $ANTLR start "entryRuleNumber"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:148:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:149:1: ( ruleNumber EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:150:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber246);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber253); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:157:1: ruleNumber : ( RULE_INT ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:161:2: ( ( RULE_INT ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:162:1: ( RULE_INT )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:162:1: ( RULE_INT )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:163:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber279); 
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


    // $ANTLR start "entryRuleFolge"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:176:1: entryRuleFolge : ruleFolge EOF ;
    public final void entryRuleFolge() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:177:1: ( ruleFolge EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:178:1: ruleFolge EOF
            {
             before(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_ruleFolge_in_entryRuleFolge305);
            ruleFolge();

            state._fsp--;

             after(grammarAccess.getFolgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFolge312); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:185:1: ruleFolge : ( ( rule__Folge__Group__0 ) ) ;
    public final void ruleFolge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:189:2: ( ( ( rule__Folge__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:190:1: ( ( rule__Folge__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:190:1: ( ( rule__Folge__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:191:1: ( rule__Folge__Group__0 )
            {
             before(grammarAccess.getFolgeAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:192:1: ( rule__Folge__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:192:2: rule__Folge__Group__0
            {
            pushFollow(FOLLOW_rule__Folge__Group__0_in_ruleFolge338);
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


    // $ANTLR start "entryRuleNotEmptyList"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:204:1: entryRuleNotEmptyList : ruleNotEmptyList EOF ;
    public final void entryRuleNotEmptyList() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:205:1: ( ruleNotEmptyList EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:206:1: ruleNotEmptyList EOF
            {
             before(grammarAccess.getNotEmptyListRule()); 
            pushFollow(FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList365);
            ruleNotEmptyList();

            state._fsp--;

             after(grammarAccess.getNotEmptyListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyList372); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:213:1: ruleNotEmptyList : ( ( rule__NotEmptyList__Group__0 ) ) ;
    public final void ruleNotEmptyList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:217:2: ( ( ( rule__NotEmptyList__Group__0 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:218:1: ( ( rule__NotEmptyList__Group__0 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:218:1: ( ( rule__NotEmptyList__Group__0 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:219:1: ( rule__NotEmptyList__Group__0 )
            {
             before(grammarAccess.getNotEmptyListAccess().getGroup()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:220:1: ( rule__NotEmptyList__Group__0 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:220:2: rule__NotEmptyList__Group__0
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__0_in_ruleNotEmptyList398);
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


    // $ANTLR start "entryRuleList"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:232:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:233:1: ( ruleList EOF )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:234:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList425);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList432); 

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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:241:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:245:2: ( ( ( rule__List__Alternatives ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:246:1: ( ( rule__List__Alternatives ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:246:1: ( ( rule__List__Alternatives ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:247:1: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:248:1: ( rule__List__Alternatives )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:248:2: rule__List__Alternatives
            {
            pushFollow(FOLLOW_rule__List__Alternatives_in_ruleList458);
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


    // $ANTLR start "rule__Atom__Alternatives"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:261:1: rule__Atom__Alternatives : ( ( RULE_IDENT ) | ( RULE_VARIABLE ) | ( ruleNumber ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:265:1: ( ( RULE_IDENT ) | ( RULE_VARIABLE ) | ( ruleNumber ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt2=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt2=2;
                }
                break;
            case RULE_INT:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:266:1: ( RULE_IDENT )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:266:1: ( RULE_IDENT )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:267:1: RULE_IDENT
                    {
                     before(grammarAccess.getAtomAccess().getIdentTerminalRuleCall_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Atom__Alternatives495); 
                     after(grammarAccess.getAtomAccess().getIdentTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:272:6: ( RULE_VARIABLE )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:272:6: ( RULE_VARIABLE )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:273:1: RULE_VARIABLE
                    {
                     before(grammarAccess.getAtomAccess().getVariableTerminalRuleCall_1()); 
                    match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Atom__Alternatives512); 
                     after(grammarAccess.getAtomAccess().getVariableTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:278:6: ( ruleNumber )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:278:6: ( ruleNumber )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:279:1: ruleNumber
                    {
                     before(grammarAccess.getAtomAccess().getNumberParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Atom__Alternatives529);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:289:1: rule__List__Alternatives : ( ( '[]' ) | ( ruleNotEmptyList ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:293:1: ( ( '[]' ) | ( ruleNotEmptyList ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:294:1: ( '[]' )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:294:1: ( '[]' )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:295:1: '[]'
                    {
                     before(grammarAccess.getListAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__List__Alternatives562); 
                     after(grammarAccess.getListAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:302:6: ( ruleNotEmptyList )
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:302:6: ( ruleNotEmptyList )
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:303:1: ruleNotEmptyList
                    {
                     before(grammarAccess.getListAccess().getNotEmptyListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNotEmptyList_in_rule__List__Alternatives581);
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


    // $ANTLR start "rule__Greeting__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:315:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:319:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:320:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0611);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0614);
            rule__Greeting__Group__1();

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
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:327:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:331:1: ( ( 'Hello' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:332:1: ( 'Hello' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:332:1: ( 'Hello' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:333:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Greeting__Group__0__Impl642); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

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
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:346:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:350:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:351:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1673);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1676);
            rule__Greeting__Group__2();

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
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:358:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:362:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:363:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:363:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:364:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:365:1: ( rule__Greeting__NameAssignment_1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:365:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl703);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:375:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:379:1: ( rule__Greeting__Group__2__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:380:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2733);
            rule__Greeting__Group__2__Impl();

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
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:386:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:390:1: ( ( '!' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:391:1: ( '!' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:391:1: ( '!' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:392:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Greeting__Group__2__Impl761); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

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
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Folge__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:411:1: rule__Folge__Group__0 : rule__Folge__Group__0__Impl rule__Folge__Group__1 ;
    public final void rule__Folge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:415:1: ( rule__Folge__Group__0__Impl rule__Folge__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:416:2: rule__Folge__Group__0__Impl rule__Folge__Group__1
            {
            pushFollow(FOLLOW_rule__Folge__Group__0__Impl_in_rule__Folge__Group__0798);
            rule__Folge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folge__Group__1_in_rule__Folge__Group__0801);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:423:1: rule__Folge__Group__0__Impl : ( ruleAtom ) ;
    public final void rule__Folge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:427:1: ( ( ruleAtom ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:428:1: ( ruleAtom )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:428:1: ( ruleAtom )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:429:1: ruleAtom
            {
             before(grammarAccess.getFolgeAccess().getAtomParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtom_in_rule__Folge__Group__0__Impl828);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:440:1: rule__Folge__Group__1 : rule__Folge__Group__1__Impl ;
    public final void rule__Folge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:444:1: ( rule__Folge__Group__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:445:2: rule__Folge__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Folge__Group__1__Impl_in_rule__Folge__Group__1857);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:451:1: rule__Folge__Group__1__Impl : ( ( rule__Folge__Group_1__0 )* ) ;
    public final void rule__Folge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:455:1: ( ( ( rule__Folge__Group_1__0 )* ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:456:1: ( ( rule__Folge__Group_1__0 )* )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:456:1: ( ( rule__Folge__Group_1__0 )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:457:1: ( rule__Folge__Group_1__0 )*
            {
             before(grammarAccess.getFolgeAccess().getGroup_1()); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:458:1: ( rule__Folge__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:458:2: rule__Folge__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Folge__Group_1__0_in_rule__Folge__Group__1__Impl884);
            	    rule__Folge__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:472:1: rule__Folge__Group_1__0 : rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1 ;
    public final void rule__Folge__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:476:1: ( rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:477:2: rule__Folge__Group_1__0__Impl rule__Folge__Group_1__1
            {
            pushFollow(FOLLOW_rule__Folge__Group_1__0__Impl_in_rule__Folge__Group_1__0919);
            rule__Folge__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folge__Group_1__1_in_rule__Folge__Group_1__0922);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:484:1: rule__Folge__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Folge__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:488:1: ( ( ',' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:489:1: ( ',' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:489:1: ( ',' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:490:1: ','
            {
             before(grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Folge__Group_1__0__Impl950); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:503:1: rule__Folge__Group_1__1 : rule__Folge__Group_1__1__Impl ;
    public final void rule__Folge__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:507:1: ( rule__Folge__Group_1__1__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:508:2: rule__Folge__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Folge__Group_1__1__Impl_in_rule__Folge__Group_1__1981);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:514:1: rule__Folge__Group_1__1__Impl : ( ruleAtom ) ;
    public final void rule__Folge__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:518:1: ( ( ruleAtom ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:519:1: ( ruleAtom )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:519:1: ( ruleAtom )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:520:1: ruleAtom
            {
             before(grammarAccess.getFolgeAccess().getAtomParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleAtom_in_rule__Folge__Group_1__1__Impl1008);
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


    // $ANTLR start "rule__NotEmptyList__Group__0"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:535:1: rule__NotEmptyList__Group__0 : rule__NotEmptyList__Group__0__Impl rule__NotEmptyList__Group__1 ;
    public final void rule__NotEmptyList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:539:1: ( rule__NotEmptyList__Group__0__Impl rule__NotEmptyList__Group__1 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:540:2: rule__NotEmptyList__Group__0__Impl rule__NotEmptyList__Group__1
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__0__Impl_in_rule__NotEmptyList__Group__01041);
            rule__NotEmptyList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyList__Group__1_in_rule__NotEmptyList__Group__01044);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:547:1: rule__NotEmptyList__Group__0__Impl : ( '[' ) ;
    public final void rule__NotEmptyList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:551:1: ( ( '[' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:552:1: ( '[' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:552:1: ( '[' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:553:1: '['
            {
             before(grammarAccess.getNotEmptyListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__NotEmptyList__Group__0__Impl1072); 
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:566:1: rule__NotEmptyList__Group__1 : rule__NotEmptyList__Group__1__Impl rule__NotEmptyList__Group__2 ;
    public final void rule__NotEmptyList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:570:1: ( rule__NotEmptyList__Group__1__Impl rule__NotEmptyList__Group__2 )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:571:2: rule__NotEmptyList__Group__1__Impl rule__NotEmptyList__Group__2
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__1__Impl_in_rule__NotEmptyList__Group__11103);
            rule__NotEmptyList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyList__Group__2_in_rule__NotEmptyList__Group__11106);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:578:1: rule__NotEmptyList__Group__1__Impl : ( ruleFolge ) ;
    public final void rule__NotEmptyList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:582:1: ( ( ruleFolge ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:583:1: ( ruleFolge )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:583:1: ( ruleFolge )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:584:1: ruleFolge
            {
             before(grammarAccess.getNotEmptyListAccess().getFolgeParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFolge_in_rule__NotEmptyList__Group__1__Impl1133);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:595:1: rule__NotEmptyList__Group__2 : rule__NotEmptyList__Group__2__Impl ;
    public final void rule__NotEmptyList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:599:1: ( rule__NotEmptyList__Group__2__Impl )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:600:2: rule__NotEmptyList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NotEmptyList__Group__2__Impl_in_rule__NotEmptyList__Group__21162);
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
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:606:1: rule__NotEmptyList__Group__2__Impl : ( ']' ) ;
    public final void rule__NotEmptyList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:610:1: ( ( ']' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:611:1: ( ']' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:611:1: ( ']' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:612:1: ']'
            {
             before(grammarAccess.getNotEmptyListAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__NotEmptyList__Group__2__Impl1190); 
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


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:632:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:636:1: ( ( ruleGreeting ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:637:1: ( ruleGreeting )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:637:1: ( ruleGreeting )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:638:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment1232);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:647:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:651:1: ( ( RULE_ID ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:652:1: ( RULE_ID )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:652:1: ( RULE_ID )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:653:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11263); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleAtom219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolge_in_entryRuleFolge305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFolge312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group__0_in_ruleFolge338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyList372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__0_in_ruleNotEmptyList398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Alternatives_in_ruleList458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Atom__Alternatives495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Atom__Alternatives512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Atom__Alternatives529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__List__Alternatives562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_rule__List__Alternatives581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0611 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Greeting__Group__0__Impl642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1673 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Greeting__Group__2__Impl761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group__0__Impl_in_rule__Folge__Group__0798 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Folge__Group__1_in_rule__Folge__Group__0801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Folge__Group__0__Impl828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group__1__Impl_in_rule__Folge__Group__1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__0_in_rule__Folge__Group__1__Impl884 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__0__Impl_in_rule__Folge__Group_1__0919 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__1_in_rule__Folge__Group_1__0922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Folge__Group_1__0__Impl950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folge__Group_1__1__Impl_in_rule__Folge__Group_1__1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Folge__Group_1__1__Impl1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__0__Impl_in_rule__NotEmptyList__Group__01041 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__1_in_rule__NotEmptyList__Group__01044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NotEmptyList__Group__0__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__1__Impl_in_rule__NotEmptyList__Group__11103 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__2_in_rule__NotEmptyList__Group__11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolge_in_rule__NotEmptyList__Group__1__Impl1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyList__Group__2__Impl_in_rule__NotEmptyList__Group__21162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NotEmptyList__Group__2__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11263 = new BitSet(new long[]{0x0000000000000002L});

}