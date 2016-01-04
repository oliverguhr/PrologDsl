package de.htwdd.sf.beleg.s74838.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htwdd.sf.beleg.s74838.services.PrologGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPrologParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_VARIABLE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?-'", "'.'", "','", "':-'", "'('", "')'", "'[]'", "'['", "']'"
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
    public static final int RULE_VARIABLE=5;
    public static final int RULE_IDENT=4;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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
    public String getGrammarFileName() { return "../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g"; }



     	private PrologGrammarAccess grammarAccess;
     	
        public InternalPrologParser(TokenStream input, PrologGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PrologDsl";	
       	}
       	
       	@Override
       	protected PrologGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePrologDsl"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:67:1: entryRulePrologDsl returns [EObject current=null] : iv_rulePrologDsl= rulePrologDsl EOF ;
    public final EObject entryRulePrologDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrologDsl = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:68:2: (iv_rulePrologDsl= rulePrologDsl EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:69:2: iv_rulePrologDsl= rulePrologDsl EOF
            {
             newCompositeNode(grammarAccess.getPrologDslRule()); 
            pushFollow(FOLLOW_rulePrologDsl_in_entryRulePrologDsl75);
            iv_rulePrologDsl=rulePrologDsl();

            state._fsp--;

             current =iv_rulePrologDsl; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrologDsl85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrologDsl"


    // $ANTLR start "rulePrologDsl"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:76:1: rulePrologDsl returns [EObject current=null] : ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) ) ) ;
    public final EObject rulePrologDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;

        EObject lv_exquery_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:79:28: ( ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) ) ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:80:1: ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) ) )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:80:1: ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:80:2: ( (lv_program_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:80:2: ( (lv_program_0_0= ruleProgram ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:81:1: (lv_program_0_0= ruleProgram )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:81:1: (lv_program_0_0= ruleProgram )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:82:3: lv_program_0_0= ruleProgram
            {
             
            	        newCompositeNode(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleProgram_in_rulePrologDsl131);
            lv_program_0_0=ruleProgram();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrologDslRule());
            	        }
                   		set(
                   			current, 
                   			"program",
                    		lv_program_0_0, 
                    		"Program");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:98:2: ( (lv_exquery_1_0= ruleExquery ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:99:1: (lv_exquery_1_0= ruleExquery )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:99:1: (lv_exquery_1_0= ruleExquery )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:100:3: lv_exquery_1_0= ruleExquery
            {
             
            	        newCompositeNode(grammarAccess.getPrologDslAccess().getExqueryExqueryParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExquery_in_rulePrologDsl152);
            lv_exquery_1_0=ruleExquery();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrologDslRule());
            	        }
                   		set(
                   			current, 
                   			"exquery",
                    		lv_exquery_1_0, 
                    		"Exquery");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrologDsl"


    // $ANTLR start "entryRuleProgram"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:124:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:125:2: (iv_ruleProgram= ruleProgram EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:126:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram188);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:133:1: ruleProgram returns [EObject current=null] : ( (lv_clause_0_0= ruleClause ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_clause_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:136:28: ( ( (lv_clause_0_0= ruleClause ) )+ )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:137:1: ( (lv_clause_0_0= ruleClause ) )+
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:137:1: ( (lv_clause_0_0= ruleClause ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:138:1: (lv_clause_0_0= ruleClause )
            	    {
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:138:1: (lv_clause_0_0= ruleClause )
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:139:3: lv_clause_0_0= ruleClause
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getClauseClauseParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClause_in_ruleProgram243);
            	    lv_clause_0_0=ruleClause();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"clause",
            	            		lv_clause_0_0, 
            	            		"Clause");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExquery"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:163:1: entryRuleExquery returns [EObject current=null] : iv_ruleExquery= ruleExquery EOF ;
    public final EObject entryRuleExquery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExquery = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:164:2: (iv_ruleExquery= ruleExquery EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:165:2: iv_ruleExquery= ruleExquery EOF
            {
             newCompositeNode(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_ruleExquery_in_entryRuleExquery279);
            iv_ruleExquery=ruleExquery();

            state._fsp--;

             current =iv_ruleExquery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExquery289); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExquery"


    // $ANTLR start "ruleExquery"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:172:1: ruleExquery returns [EObject current=null] : (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) ;
    public final EObject ruleExquery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:175:28: ( (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:176:1: (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:176:1: (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:176:3: otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleExquery326); 

                	newLeafNode(otherlv_0, grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0());
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:180:1: ( (lv_query_1_0= ruleQuery ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:181:1: (lv_query_1_0= ruleQuery )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:181:1: (lv_query_1_0= ruleQuery )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:182:3: lv_query_1_0= ruleQuery
            {
             
            	        newCompositeNode(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQuery_in_ruleExquery347);
            lv_query_1_0=ruleQuery();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExqueryRule());
            	        }
                   		set(
                   			current, 
                   			"query",
                    		lv_query_1_0, 
                    		"Query");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleExquery359); 

                	newLeafNode(otherlv_2, grammarAccess.getExqueryAccess().getFullStopKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExquery"


    // $ANTLR start "entryRuleQuery"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:210:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:211:2: (iv_ruleQuery= ruleQuery EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:212:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery395);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery405); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:219:1: ruleQuery returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nthPredicate_2_0= rulePredicate ) ) )* ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_predicate_0_0 = null;

        EObject lv_nthPredicate_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:222:28: ( ( ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nthPredicate_2_0= rulePredicate ) ) )* ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:223:1: ( ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nthPredicate_2_0= rulePredicate ) ) )* )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:223:1: ( ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nthPredicate_2_0= rulePredicate ) ) )* )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:223:2: ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nthPredicate_2_0= rulePredicate ) ) )*
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:223:2: ( (lv_predicate_0_0= rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:224:1: (lv_predicate_0_0= rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:224:1: (lv_predicate_0_0= rulePredicate )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:225:3: lv_predicate_0_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getQueryAccess().getPredicatePredicateParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_ruleQuery451);
            lv_predicate_0_0=rulePredicate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQueryRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_0_0, 
                    		"Predicate");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:241:2: (otherlv_1= ',' ( (lv_nthPredicate_2_0= rulePredicate ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:241:4: otherlv_1= ',' ( (lv_nthPredicate_2_0= rulePredicate ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleQuery464); 

            	        	newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getCommaKeyword_1_0());
            	        
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:245:1: ( (lv_nthPredicate_2_0= rulePredicate ) )
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:246:1: (lv_nthPredicate_2_0= rulePredicate )
            	    {
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:246:1: (lv_nthPredicate_2_0= rulePredicate )
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:247:3: lv_nthPredicate_2_0= rulePredicate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQueryAccess().getNthPredicatePredicateParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicate_in_ruleQuery485);
            	    lv_nthPredicate_2_0=rulePredicate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQueryRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"nthPredicate",
            	            		lv_nthPredicate_2_0, 
            	            		"Predicate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleClause"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:271:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:272:2: (iv_ruleClause= ruleClause EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:273:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause523);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:280:1: ruleClause returns [EObject current=null] : ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        EObject lv_fact_0_0 = null;

        EObject lv_rule_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:283:28: ( ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:284:1: ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:284:1: ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:284:2: ( (lv_fact_0_0= ruleFact ) )
                    {
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:284:2: ( (lv_fact_0_0= ruleFact ) )
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:285:1: (lv_fact_0_0= ruleFact )
                    {
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:285:1: (lv_fact_0_0= ruleFact )
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:286:3: lv_fact_0_0= ruleFact
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getFactFactParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFact_in_ruleClause579);
                    lv_fact_0_0=ruleFact();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"fact",
                            		lv_fact_0_0, 
                            		"Fact");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:303:6: ( (lv_rule_1_0= ruleRule ) )
                    {
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:303:6: ( (lv_rule_1_0= ruleRule ) )
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:304:1: (lv_rule_1_0= ruleRule )
                    {
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:304:1: (lv_rule_1_0= ruleRule )
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:305:3: lv_rule_1_0= ruleRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getRuleRuleParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRule_in_ruleClause606);
                    lv_rule_1_0=ruleRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"rule",
                            		lv_rule_1_0, 
                            		"Rule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleFact"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:329:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:330:2: (iv_ruleFact= ruleFact EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:331:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact642);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:338:1: ruleFact returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.' ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_predicate_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:341:28: ( ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:342:1: ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:342:1: ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:342:2: ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.'
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:342:2: ( (lv_predicate_0_0= rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:343:1: (lv_predicate_0_0= rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:343:1: (lv_predicate_0_0= rulePredicate )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:344:3: lv_predicate_0_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getFactAccess().getPredicatePredicateParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_ruleFact698);
            lv_predicate_0_0=rulePredicate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFactRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_0_0, 
                    		"Predicate");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleFact710); 

                	newLeafNode(otherlv_1, grammarAccess.getFactAccess().getFullStopKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleRule"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:372:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:373:2: (iv_ruleRule= ruleRule EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:374:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule746);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule756); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:381:1: ruleRule returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicate_0_0 = null;

        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:384:28: ( ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:385:1: ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:385:1: ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:385:2: ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.'
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:385:2: ( (lv_predicate_0_0= rulePredicate ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:386:1: (lv_predicate_0_0= rulePredicate )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:386:1: (lv_predicate_0_0= rulePredicate )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:387:3: lv_predicate_0_0= rulePredicate
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getPredicatePredicateParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePredicate_in_ruleRule802);
            lv_predicate_0_0=rulePredicate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_0_0, 
                    		"Predicate");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleRule814); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1());
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:407:1: ( (lv_query_2_0= ruleQuery ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:408:1: (lv_query_2_0= ruleQuery )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:408:1: (lv_query_2_0= ruleQuery )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:409:3: lv_query_2_0= ruleQuery
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQuery_in_ruleRule835);
            lv_query_2_0=ruleQuery();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"query",
                    		lv_query_2_0, 
                    		"Query");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleRule847); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getFullStopKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePredicate"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:437:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:438:2: (iv_rulePredicate= rulePredicate EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:439:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate883);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate893); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:446:1: rulePredicate returns [EObject current=null] : ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nthTerm_4_0= ruleTerm ) ) )* otherlv_5= ')' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_functor_0_0 = null;

        EObject lv_term_2_0 = null;

        EObject lv_nthTerm_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:449:28: ( ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nthTerm_4_0= ruleTerm ) ) )* otherlv_5= ')' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:450:1: ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nthTerm_4_0= ruleTerm ) ) )* otherlv_5= ')' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:450:1: ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nthTerm_4_0= ruleTerm ) ) )* otherlv_5= ')' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:450:2: ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nthTerm_4_0= ruleTerm ) ) )* otherlv_5= ')'
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:450:2: ( (lv_functor_0_0= ruleFunctor ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:451:1: (lv_functor_0_0= ruleFunctor )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:451:1: (lv_functor_0_0= ruleFunctor )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:452:3: lv_functor_0_0= ruleFunctor
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getFunctorFunctorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctor_in_rulePredicate939);
            lv_functor_0_0=ruleFunctor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateRule());
            	        }
                   		set(
                   			current, 
                   			"functor",
                    		lv_functor_0_0, 
                    		"Functor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePredicate951); 

                	newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1());
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:472:1: ( (lv_term_2_0= ruleTerm ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:473:1: (lv_term_2_0= ruleTerm )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:473:1: (lv_term_2_0= ruleTerm )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:474:3: lv_term_2_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getTermTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_rulePredicate972);
            lv_term_2_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateRule());
            	        }
                   		set(
                   			current, 
                   			"term",
                    		lv_term_2_0, 
                    		"Term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:490:2: (otherlv_3= ',' ( (lv_nthTerm_4_0= ruleTerm ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:490:4: otherlv_3= ',' ( (lv_nthTerm_4_0= ruleTerm ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePredicate985); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPredicateAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:494:1: ( (lv_nthTerm_4_0= ruleTerm ) )
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:495:1: (lv_nthTerm_4_0= ruleTerm )
            	    {
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:495:1: (lv_nthTerm_4_0= ruleTerm )
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:496:3: lv_nthTerm_4_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateAccess().getNthTermTermParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_rulePredicate1006);
            	    lv_nthTerm_4_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"nthTerm",
            	            		lv_nthTerm_4_0, 
            	            		"Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulePredicate1020); 

                	newLeafNode(otherlv_5, grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleFunctor"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:524:1: entryRuleFunctor returns [String current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final String entryRuleFunctor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctor = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:525:2: (iv_ruleFunctor= ruleFunctor EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:526:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor1057);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor1068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:533:1: ruleFunctor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ident_0= RULE_IDENT ;
    public final AntlrDatatypeRuleToken ruleFunctor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ident_0=null;

         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:536:28: (this_ident_0= RULE_IDENT )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:537:5: this_ident_0= RULE_IDENT
            {
            this_ident_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFunctor1107); 

            		current.merge(this_ident_0);
                
             
                newLeafNode(this_ident_0, grammarAccess.getFunctorAccess().getIdentTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleTerm"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:552:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:553:2: (iv_ruleTerm= ruleTerm EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:554:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1151);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1161); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:561:1: ruleTerm returns [EObject current=null] : ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_1 = null;

        EObject lv_term_0_2 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:564:28: ( ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:565:1: ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:565:1: ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:566:1: ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:566:1: ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:567:1: (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:567:1: (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_IDENT && LA5_0<=RULE_INT)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=19 && LA5_0<=20)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:568:3: lv_term_0_1= ruleAtom
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getTermAtomParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtom_in_ruleTerm1208);
                    lv_term_0_1=ruleAtom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"term",
                            		lv_term_0_1, 
                            		"Atom");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:583:8: lv_term_0_2= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getTermListParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleTerm1227);
                    lv_term_0_2=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"term",
                            		lv_term_0_2, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:609:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:610:2: (iv_ruleAtom= ruleAtom EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:611:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom1265);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom1275); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:618:1: ruleAtom returns [EObject current=null] : ( ( (lv_atom_0_1= RULE_IDENT | lv_atom_0_2= RULE_VARIABLE | lv_atom_0_3= ruleNumber ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_atom_0_1=null;
        Token lv_atom_0_2=null;
        AntlrDatatypeRuleToken lv_atom_0_3 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:621:28: ( ( ( (lv_atom_0_1= RULE_IDENT | lv_atom_0_2= RULE_VARIABLE | lv_atom_0_3= ruleNumber ) ) ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:622:1: ( ( (lv_atom_0_1= RULE_IDENT | lv_atom_0_2= RULE_VARIABLE | lv_atom_0_3= ruleNumber ) ) )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:622:1: ( ( (lv_atom_0_1= RULE_IDENT | lv_atom_0_2= RULE_VARIABLE | lv_atom_0_3= ruleNumber ) ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:623:1: ( (lv_atom_0_1= RULE_IDENT | lv_atom_0_2= RULE_VARIABLE | lv_atom_0_3= ruleNumber ) )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:623:1: ( (lv_atom_0_1= RULE_IDENT | lv_atom_0_2= RULE_VARIABLE | lv_atom_0_3= ruleNumber ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:624:1: (lv_atom_0_1= RULE_IDENT | lv_atom_0_2= RULE_VARIABLE | lv_atom_0_3= ruleNumber )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:624:1: (lv_atom_0_1= RULE_IDENT | lv_atom_0_2= RULE_VARIABLE | lv_atom_0_3= ruleNumber )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt6=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:625:3: lv_atom_0_1= RULE_IDENT
                    {
                    lv_atom_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAtom1318); 

                    			newLeafNode(lv_atom_0_1, grammarAccess.getAtomAccess().getAtomIdentTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"atom",
                            		lv_atom_0_1, 
                            		"ident");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:640:8: lv_atom_0_2= RULE_VARIABLE
                    {
                    lv_atom_0_2=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleAtom1338); 

                    			newLeafNode(lv_atom_0_2, grammarAccess.getAtomAccess().getAtomVariableTerminalRuleCall_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"atom",
                            		lv_atom_0_2, 
                            		"variable");
                    	    

                    }
                    break;
                case 3 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:655:8: lv_atom_0_3= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomAccess().getAtomNumberParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleAtom1362);
                    lv_atom_0_3=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomRule());
                    	        }
                           		set(
                           			current, 
                           			"atom",
                            		lv_atom_0_3, 
                            		"Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:681:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:682:2: (iv_ruleList= ruleList EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:683:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList1400);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList1410); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:690:1: ruleList returns [EObject current=null] : ( ( (lv_list_0_0= '[]' ) ) | this_NotEmptyList_1= ruleNotEmptyList ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token lv_list_0_0=null;
        EObject this_NotEmptyList_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:693:28: ( ( ( (lv_list_0_0= '[]' ) ) | this_NotEmptyList_1= ruleNotEmptyList ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:694:1: ( ( (lv_list_0_0= '[]' ) ) | this_NotEmptyList_1= ruleNotEmptyList )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:694:1: ( ( (lv_list_0_0= '[]' ) ) | this_NotEmptyList_1= ruleNotEmptyList )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:694:2: ( (lv_list_0_0= '[]' ) )
                    {
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:694:2: ( (lv_list_0_0= '[]' ) )
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:695:1: (lv_list_0_0= '[]' )
                    {
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:695:1: (lv_list_0_0= '[]' )
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:696:3: lv_list_0_0= '[]'
                    {
                    lv_list_0_0=(Token)match(input,19,FOLLOW_19_in_ruleList1453); 

                            newLeafNode(lv_list_0_0, grammarAccess.getListAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getListRule());
                    	        }
                           		setWithLastConsumed(current, "list", lv_list_0_0, "[]");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:711:5: this_NotEmptyList_1= ruleNotEmptyList
                    {
                     
                            newCompositeNode(grammarAccess.getListAccess().getNotEmptyListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNotEmptyList_in_ruleList1494);
                    this_NotEmptyList_1=ruleNotEmptyList();

                    state._fsp--;

                     
                            current = this_NotEmptyList_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleNotEmptyList"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:727:1: entryRuleNotEmptyList returns [EObject current=null] : iv_ruleNotEmptyList= ruleNotEmptyList EOF ;
    public final EObject entryRuleNotEmptyList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEmptyList = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:728:2: (iv_ruleNotEmptyList= ruleNotEmptyList EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:729:2: iv_ruleNotEmptyList= ruleNotEmptyList EOF
            {
             newCompositeNode(grammarAccess.getNotEmptyListRule()); 
            pushFollow(FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList1529);
            iv_ruleNotEmptyList=ruleNotEmptyList();

            state._fsp--;

             current =iv_ruleNotEmptyList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyList1539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotEmptyList"


    // $ANTLR start "ruleNotEmptyList"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:736:1: ruleNotEmptyList returns [EObject current=null] : (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) ;
    public final EObject ruleNotEmptyList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_folge_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:739:28: ( (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:740:1: (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:740:1: (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:740:3: otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNotEmptyList1576); 

                	newLeafNode(otherlv_0, grammarAccess.getNotEmptyListAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:744:1: ( (lv_folge_1_0= ruleFolge ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:745:1: (lv_folge_1_0= ruleFolge )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:745:1: (lv_folge_1_0= ruleFolge )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:746:3: lv_folge_1_0= ruleFolge
            {
             
            	        newCompositeNode(grammarAccess.getNotEmptyListAccess().getFolgeFolgeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFolge_in_ruleNotEmptyList1597);
            lv_folge_1_0=ruleFolge();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNotEmptyListRule());
            	        }
                   		set(
                   			current, 
                   			"folge",
                    		lv_folge_1_0, 
                    		"Folge");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleNotEmptyList1609); 

                	newLeafNode(otherlv_2, grammarAccess.getNotEmptyListAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotEmptyList"


    // $ANTLR start "entryRuleFolge"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:774:1: entryRuleFolge returns [EObject current=null] : iv_ruleFolge= ruleFolge EOF ;
    public final EObject entryRuleFolge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolge = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:775:2: (iv_ruleFolge= ruleFolge EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:776:2: iv_ruleFolge= ruleFolge EOF
            {
             newCompositeNode(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_ruleFolge_in_entryRuleFolge1645);
            iv_ruleFolge=ruleFolge();

            state._fsp--;

             current =iv_ruleFolge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFolge1655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFolge"


    // $ANTLR start "ruleFolge"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:783:1: ruleFolge returns [EObject current=null] : ( ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_nthAtom_2_0= ruleAtom ) ) )* ) ;
    public final EObject ruleFolge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_atom_0_0 = null;

        EObject lv_nthAtom_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:786:28: ( ( ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_nthAtom_2_0= ruleAtom ) ) )* ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:787:1: ( ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_nthAtom_2_0= ruleAtom ) ) )* )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:787:1: ( ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_nthAtom_2_0= ruleAtom ) ) )* )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:787:2: ( (lv_atom_0_0= ruleAtom ) ) (otherlv_1= ',' ( (lv_nthAtom_2_0= ruleAtom ) ) )*
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:787:2: ( (lv_atom_0_0= ruleAtom ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:788:1: (lv_atom_0_0= ruleAtom )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:788:1: (lv_atom_0_0= ruleAtom )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:789:3: lv_atom_0_0= ruleAtom
            {
             
            	        newCompositeNode(grammarAccess.getFolgeAccess().getAtomAtomParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAtom_in_ruleFolge1701);
            lv_atom_0_0=ruleAtom();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFolgeRule());
            	        }
                   		set(
                   			current, 
                   			"atom",
                    		lv_atom_0_0, 
                    		"Atom");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:805:2: (otherlv_1= ',' ( (lv_nthAtom_2_0= ruleAtom ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:805:4: otherlv_1= ',' ( (lv_nthAtom_2_0= ruleAtom ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleFolge1714); 

            	        	newLeafNode(otherlv_1, grammarAccess.getFolgeAccess().getCommaKeyword_1_0());
            	        
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:809:1: ( (lv_nthAtom_2_0= ruleAtom ) )
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:810:1: (lv_nthAtom_2_0= ruleAtom )
            	    {
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:810:1: (lv_nthAtom_2_0= ruleAtom )
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:811:3: lv_nthAtom_2_0= ruleAtom
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFolgeAccess().getNthAtomAtomParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtom_in_ruleFolge1735);
            	    lv_nthAtom_2_0=ruleAtom();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFolgeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"nthAtom",
            	            		lv_nthAtom_2_0, 
            	            		"Atom");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFolge"


    // $ANTLR start "entryRuleNumber"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:835:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:836:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:837:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1774);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1785); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:844:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:847:28: (this_INT_0= RULE_INT )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:848:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1824); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\41\uffff";
    static final String DFA3_eofS =
        "\41\uffff";
    static final String DFA3_minS =
        "\1\4\1\21\1\4\4\17\2\4\1\16\7\17\1\4\2\uffff\1\4\7\17\1\4\4\17";
    static final String DFA3_maxS =
        "\1\4\1\21\1\24\4\22\1\6\1\24\1\20\3\25\4\22\1\6\2\uffff\1\6\1\22"+
        "\6\25\1\6\1\22\3\25";
    static final String DFA3_acceptS =
        "\22\uffff\1\2\1\1\15\uffff";
    static final String DFA3_specialS =
        "\41\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\14\uffff\1\6\1\7",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\12\1\13\1\14",
            "\1\15\1\16\1\17\14\uffff\1\20\1\21",
            "\1\23\1\uffff\1\22",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\26\1\27\1\30",
            "",
            "",
            "\1\31\1\32\1\33",
            "\1\10\2\uffff\1\11",
            "\1\34\5\uffff\1\35",
            "\1\34\5\uffff\1\35",
            "\1\34\5\uffff\1\35",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\36\1\37\1\40",
            "\1\10\2\uffff\1\11",
            "\1\34\5\uffff\1\35",
            "\1\34\5\uffff\1\35",
            "\1\34\5\uffff\1\35"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "284:1: ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulePrologDsl_in_entryRulePrologDsl75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrologDsl85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rulePrologDsl131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleExquery_in_rulePrologDsl152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClause_in_ruleProgram243 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleExquery_in_entryRuleExquery279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExquery289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExquery326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleExquery347 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExquery359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleQuery451 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQuery464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleQuery485 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_ruleClause579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleClause606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleFact698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFact710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleRule802 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRule814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleRule835 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRule847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_rulePredicate939 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePredicate951 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_ruleTerm_in_rulePredicate972 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_rulePredicate985 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_ruleTerm_in_rulePredicate1006 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_rulePredicate1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFunctor1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleTerm1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleTerm1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAtom1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleAtom1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleAtom1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleList1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_ruleList1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList1529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyList1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNotEmptyList1576 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleFolge_in_ruleNotEmptyList1597 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNotEmptyList1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolge_in_entryRuleFolge1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFolge1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleFolge1701 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFolge1714 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleFolge1735 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1824 = new BitSet(new long[]{0x0000000000000002L});

}