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

        AntlrDatatypeRuleToken lv_program_0_0 = null;

        AntlrDatatypeRuleToken lv_exquery_1_0 = null;


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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:124:1: entryRuleProgram returns [String current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final String entryRuleProgram() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProgram = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:125:2: (iv_ruleProgram= ruleProgram EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:126:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram189);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram200); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:133:1: ruleProgram returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Clause_0= ruleClause (this_Clause_1= ruleClause )* ) ;
    public final AntlrDatatypeRuleToken ruleProgram() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Clause_0 = null;

        AntlrDatatypeRuleToken this_Clause_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:136:28: ( (this_Clause_0= ruleClause (this_Clause_1= ruleClause )* ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:137:1: (this_Clause_0= ruleClause (this_Clause_1= ruleClause )* )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:137:1: (this_Clause_0= ruleClause (this_Clause_1= ruleClause )* )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:138:5: this_Clause_0= ruleClause (this_Clause_1= ruleClause )*
            {
             
                    newCompositeNode(grammarAccess.getProgramAccess().getClauseParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClause_in_ruleProgram247);
            this_Clause_0=ruleClause();

            state._fsp--;


            		current.merge(this_Clause_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:148:1: (this_Clause_1= ruleClause )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:149:5: this_Clause_1= ruleClause
            	    {
            	     
            	            newCompositeNode(grammarAccess.getProgramAccess().getClauseParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleClause_in_ruleProgram275);
            	    this_Clause_1=ruleClause();

            	    state._fsp--;


            	    		current.merge(this_Clause_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExquery"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:167:1: entryRuleExquery returns [String current=null] : iv_ruleExquery= ruleExquery EOF ;
    public final String entryRuleExquery() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExquery = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:168:2: (iv_ruleExquery= ruleExquery EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:169:2: iv_ruleExquery= ruleExquery EOF
            {
             newCompositeNode(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_ruleExquery_in_entryRuleExquery323);
            iv_ruleExquery=ruleExquery();

            state._fsp--;

             current =iv_ruleExquery.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExquery334); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:176:1: ruleExquery returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '?-' this_Query_1= ruleQuery kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleExquery() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Query_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:179:28: ( (kw= '?-' this_Query_1= ruleQuery kw= '.' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:180:1: (kw= '?-' this_Query_1= ruleQuery kw= '.' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:180:1: (kw= '?-' this_Query_1= ruleQuery kw= '.' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:181:2: kw= '?-' this_Query_1= ruleQuery kw= '.'
            {
            kw=(Token)match(input,13,FOLLOW_13_in_ruleExquery372); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getExqueryAccess().getQueryParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleQuery_in_ruleExquery394);
            this_Query_1=ruleQuery();

            state._fsp--;


            		current.merge(this_Query_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleExquery412); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 
                

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:211:1: entryRuleQuery returns [String current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final String entryRuleQuery() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuery = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:212:2: (iv_ruleQuery= ruleQuery EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:213:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery453);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery464); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:220:1: ruleQuery returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Predicate_0= rulePredicate (kw= ',' this_Predicate_2= rulePredicate )* ) ;
    public final AntlrDatatypeRuleToken ruleQuery() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Predicate_0 = null;

        AntlrDatatypeRuleToken this_Predicate_2 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:223:28: ( (this_Predicate_0= rulePredicate (kw= ',' this_Predicate_2= rulePredicate )* ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:224:1: (this_Predicate_0= rulePredicate (kw= ',' this_Predicate_2= rulePredicate )* )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:224:1: (this_Predicate_0= rulePredicate (kw= ',' this_Predicate_2= rulePredicate )* )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:225:5: this_Predicate_0= rulePredicate (kw= ',' this_Predicate_2= rulePredicate )*
            {
             
                    newCompositeNode(grammarAccess.getQueryAccess().getPredicateParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicate_in_ruleQuery511);
            this_Predicate_0=rulePredicate();

            state._fsp--;


            		current.merge(this_Predicate_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:235:1: (kw= ',' this_Predicate_2= rulePredicate )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:236:2: kw= ',' this_Predicate_2= rulePredicate
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQuery530); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQueryAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQueryAccess().getPredicateParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulePredicate_in_ruleQuery552);
            	    this_Predicate_2=rulePredicate();

            	    state._fsp--;


            	    		current.merge(this_Predicate_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:260:1: entryRuleClause returns [String current=null] : iv_ruleClause= ruleClause EOF ;
    public final String entryRuleClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClause = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:261:2: (iv_ruleClause= ruleClause EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:262:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause600);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause611); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:269:1: ruleClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Fact_0= ruleFact | this_Rule_1= ruleRule ) ;
    public final AntlrDatatypeRuleToken ruleClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Fact_0 = null;

        AntlrDatatypeRuleToken this_Rule_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:272:28: ( (this_Fact_0= ruleFact | this_Rule_1= ruleRule ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:273:1: (this_Fact_0= ruleFact | this_Rule_1= ruleRule )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:273:1: (this_Fact_0= ruleFact | this_Rule_1= ruleRule )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:274:5: this_Fact_0= ruleFact
                    {
                     
                            newCompositeNode(grammarAccess.getClauseAccess().getFactParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFact_in_ruleClause658);
                    this_Fact_0=ruleFact();

                    state._fsp--;


                    		current.merge(this_Fact_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:286:5: this_Rule_1= ruleRule
                    {
                     
                            newCompositeNode(grammarAccess.getClauseAccess().getRuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRule_in_ruleClause691);
                    this_Rule_1=ruleRule();

                    state._fsp--;


                    		current.merge(this_Rule_1);
                        
                     
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
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleFact"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:304:1: entryRuleFact returns [String current=null] : iv_ruleFact= ruleFact EOF ;
    public final String entryRuleFact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFact = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:305:2: (iv_ruleFact= ruleFact EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:306:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact737);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact748); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:313:1: ruleFact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Predicate_0= rulePredicate kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleFact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Predicate_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:316:28: ( (this_Predicate_0= rulePredicate kw= '.' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:317:1: (this_Predicate_0= rulePredicate kw= '.' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:317:1: (this_Predicate_0= rulePredicate kw= '.' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:318:5: this_Predicate_0= rulePredicate kw= '.'
            {
             
                    newCompositeNode(grammarAccess.getFactAccess().getPredicateParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicate_in_ruleFact795);
            this_Predicate_0=rulePredicate();

            state._fsp--;


            		current.merge(this_Predicate_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleFact813); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFactAccess().getFullStopKeyword_1()); 
                

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:342:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:343:2: (iv_ruleRule= ruleRule EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:344:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule854);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule865); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:351:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Predicate_0= rulePredicate kw= ':-' this_Query_2= ruleQuery kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Predicate_0 = null;

        AntlrDatatypeRuleToken this_Query_2 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:354:28: ( (this_Predicate_0= rulePredicate kw= ':-' this_Query_2= ruleQuery kw= '.' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:355:1: (this_Predicate_0= rulePredicate kw= ':-' this_Query_2= ruleQuery kw= '.' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:355:1: (this_Predicate_0= rulePredicate kw= ':-' this_Query_2= ruleQuery kw= '.' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:356:5: this_Predicate_0= rulePredicate kw= ':-' this_Query_2= ruleQuery kw= '.'
            {
             
                    newCompositeNode(grammarAccess.getRuleAccess().getPredicateParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePredicate_in_ruleRule912);
            this_Predicate_0=rulePredicate();

            state._fsp--;


            		current.merge(this_Predicate_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleRule930); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getRuleAccess().getQueryParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleQuery_in_ruleRule952);
            this_Query_2=ruleQuery();

            state._fsp--;


            		current.merge(this_Query_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleRule970); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRuleAccess().getFullStopKeyword_3()); 
                

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:397:1: entryRulePredicate returns [String current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final String entryRulePredicate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredicate = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:398:2: (iv_rulePredicate= rulePredicate EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:399:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate1011);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate1022); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:406:1: rulePredicate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Functor_0= ruleFunctor kw= '(' this_Term_2= ruleTerm (kw= ',' this_Term_4= ruleTerm )* kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulePredicate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Functor_0 = null;

        AntlrDatatypeRuleToken this_Term_2 = null;

        AntlrDatatypeRuleToken this_Term_4 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:409:28: ( (this_Functor_0= ruleFunctor kw= '(' this_Term_2= ruleTerm (kw= ',' this_Term_4= ruleTerm )* kw= ')' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:410:1: (this_Functor_0= ruleFunctor kw= '(' this_Term_2= ruleTerm (kw= ',' this_Term_4= ruleTerm )* kw= ')' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:410:1: (this_Functor_0= ruleFunctor kw= '(' this_Term_2= ruleTerm (kw= ',' this_Term_4= ruleTerm )* kw= ')' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:411:5: this_Functor_0= ruleFunctor kw= '(' this_Term_2= ruleTerm (kw= ',' this_Term_4= ruleTerm )* kw= ')'
            {
             
                    newCompositeNode(grammarAccess.getPredicateAccess().getFunctorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFunctor_in_rulePredicate1069);
            this_Functor_0=ruleFunctor();

            state._fsp--;


            		current.merge(this_Functor_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,17,FOLLOW_17_in_rulePredicate1087); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getPredicateAccess().getTermParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTerm_in_rulePredicate1109);
            this_Term_2=ruleTerm();

            state._fsp--;


            		current.merge(this_Term_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:438:1: (kw= ',' this_Term_4= ruleTerm )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:439:2: kw= ',' this_Term_4= ruleTerm
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_rulePredicate1128); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getPredicateAccess().getTermParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTerm_in_rulePredicate1150);
            	    this_Term_4=ruleTerm();

            	    state._fsp--;


            	    		current.merge(this_Term_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            kw=(Token)match(input,18,FOLLOW_18_in_rulePredicate1170); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
                

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:469:1: entryRuleFunctor returns [String current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final String entryRuleFunctor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctor = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:470:2: (iv_ruleFunctor= ruleFunctor EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:471:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor1211);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor1222); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:478:1: ruleFunctor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ident_0= RULE_IDENT ;
    public final AntlrDatatypeRuleToken ruleFunctor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ident_0=null;

         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:481:28: (this_ident_0= RULE_IDENT )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:482:5: this_ident_0= RULE_IDENT
            {
            this_ident_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFunctor1261); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:497:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:498:2: (iv_ruleTerm= ruleTerm EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:499:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1306);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1317); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:506:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Atom_0= ruleAtom | this_List_1= ruleList ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Atom_0 = null;

        AntlrDatatypeRuleToken this_List_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:509:28: ( (this_Atom_0= ruleAtom | this_List_1= ruleList ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:510:1: (this_Atom_0= ruleAtom | this_List_1= ruleList )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:510:1: (this_Atom_0= ruleAtom | this_List_1= ruleList )
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
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:511:5: this_Atom_0= ruleAtom
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getAtomParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtom_in_ruleTerm1364);
                    this_Atom_0=ruleAtom();

                    state._fsp--;


                    		current.merge(this_Atom_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:523:5: this_List_1= ruleList
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleList_in_ruleTerm1397);
                    this_List_1=ruleList();

                    state._fsp--;


                    		current.merge(this_List_1);
                        
                     
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:541:1: entryRuleAtom returns [String current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final String entryRuleAtom() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtom = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:542:2: (iv_ruleAtom= ruleAtom EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:543:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom1443);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom1454); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:550:1: ruleAtom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ident_0= RULE_IDENT | this_variable_1= RULE_VARIABLE | this_Number_2= ruleNumber ) ;
    public final AntlrDatatypeRuleToken ruleAtom() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ident_0=null;
        Token this_variable_1=null;
        AntlrDatatypeRuleToken this_Number_2 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:553:28: ( (this_ident_0= RULE_IDENT | this_variable_1= RULE_VARIABLE | this_Number_2= ruleNumber ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:554:1: (this_ident_0= RULE_IDENT | this_variable_1= RULE_VARIABLE | this_Number_2= ruleNumber )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:554:1: (this_ident_0= RULE_IDENT | this_variable_1= RULE_VARIABLE | this_Number_2= ruleNumber )
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
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:554:6: this_ident_0= RULE_IDENT
                    {
                    this_ident_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAtom1494); 

                    		current.merge(this_ident_0);
                        
                     
                        newLeafNode(this_ident_0, grammarAccess.getAtomAccess().getIdentTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:562:10: this_variable_1= RULE_VARIABLE
                    {
                    this_variable_1=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleAtom1520); 

                    		current.merge(this_variable_1);
                        
                     
                        newLeafNode(this_variable_1, grammarAccess.getAtomAccess().getVariableTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:571:5: this_Number_2= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getNumberParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleAtom1553);
                    this_Number_2=ruleNumber();

                    state._fsp--;


                    		current.merge(this_Number_2);
                        
                     
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:589:1: entryRuleList returns [String current=null] : iv_ruleList= ruleList EOF ;
    public final String entryRuleList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleList = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:590:2: (iv_ruleList= ruleList EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:591:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList1599);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList1610); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:598:1: ruleList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[]' | this_NotEmptyList_1= ruleNotEmptyList ) ;
    public final AntlrDatatypeRuleToken ruleList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NotEmptyList_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:601:28: ( (kw= '[]' | this_NotEmptyList_1= ruleNotEmptyList ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:602:1: (kw= '[]' | this_NotEmptyList_1= ruleNotEmptyList )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:602:1: (kw= '[]' | this_NotEmptyList_1= ruleNotEmptyList )
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
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:603:2: kw= '[]'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleList1648); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getListAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:610:5: this_NotEmptyList_1= ruleNotEmptyList
                    {
                     
                            newCompositeNode(grammarAccess.getListAccess().getNotEmptyListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNotEmptyList_in_ruleList1676);
                    this_NotEmptyList_1=ruleNotEmptyList();

                    state._fsp--;


                    		current.merge(this_NotEmptyList_1);
                        
                     
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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:628:1: entryRuleNotEmptyList returns [String current=null] : iv_ruleNotEmptyList= ruleNotEmptyList EOF ;
    public final String entryRuleNotEmptyList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotEmptyList = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:629:2: (iv_ruleNotEmptyList= ruleNotEmptyList EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:630:2: iv_ruleNotEmptyList= ruleNotEmptyList EOF
            {
             newCompositeNode(grammarAccess.getNotEmptyListRule()); 
            pushFollow(FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList1722);
            iv_ruleNotEmptyList=ruleNotEmptyList();

            state._fsp--;

             current =iv_ruleNotEmptyList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyList1733); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:637:1: ruleNotEmptyList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_Folge_1= ruleFolge kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleNotEmptyList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Folge_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:640:28: ( (kw= '[' this_Folge_1= ruleFolge kw= ']' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:641:1: (kw= '[' this_Folge_1= ruleFolge kw= ']' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:641:1: (kw= '[' this_Folge_1= ruleFolge kw= ']' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:642:2: kw= '[' this_Folge_1= ruleFolge kw= ']'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleNotEmptyList1771); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNotEmptyListAccess().getLeftSquareBracketKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getNotEmptyListAccess().getFolgeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFolge_in_ruleNotEmptyList1793);
            this_Folge_1=ruleFolge();

            state._fsp--;


            		current.merge(this_Folge_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,21,FOLLOW_21_in_ruleNotEmptyList1811); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNotEmptyListAccess().getRightSquareBracketKeyword_2()); 
                

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:672:1: entryRuleFolge returns [String current=null] : iv_ruleFolge= ruleFolge EOF ;
    public final String entryRuleFolge() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFolge = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:673:2: (iv_ruleFolge= ruleFolge EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:674:2: iv_ruleFolge= ruleFolge EOF
            {
             newCompositeNode(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_ruleFolge_in_entryRuleFolge1852);
            iv_ruleFolge=ruleFolge();

            state._fsp--;

             current =iv_ruleFolge.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFolge1863); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:681:1: ruleFolge returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )* ) ;
    public final AntlrDatatypeRuleToken ruleFolge() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Atom_0 = null;

        AntlrDatatypeRuleToken this_Atom_2 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:684:28: ( (this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )* ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:685:1: (this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )* )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:685:1: (this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )* )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:686:5: this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )*
            {
             
                    newCompositeNode(grammarAccess.getFolgeAccess().getAtomParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtom_in_ruleFolge1910);
            this_Atom_0=ruleAtom();

            state._fsp--;


            		current.merge(this_Atom_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:696:1: (kw= ',' this_Atom_2= ruleAtom )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:697:2: kw= ',' this_Atom_2= ruleAtom
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleFolge1929); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFolgeAccess().getAtomParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleAtom_in_ruleFolge1951);
            	    this_Atom_2=ruleAtom();

            	    state._fsp--;


            	    		current.merge(this_Atom_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:721:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:722:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:723:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1999);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2010); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:730:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:733:28: (this_INT_0= RULE_INT )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:734:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2049); 

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
        "\22\uffff\1\1\1\2\15\uffff";
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
            "\1\22\1\uffff\1\23",
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
            return "273:1: (this_Fact_0= ruleFact | this_Rule_1= ruleRule )";
        }
    }
 

    public static final BitSet FOLLOW_rulePrologDsl_in_entryRulePrologDsl75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrologDsl85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rulePrologDsl131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleExquery_in_rulePrologDsl152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClause_in_ruleProgram247 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleClause_in_ruleProgram275 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleExquery_in_entryRuleExquery323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExquery334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExquery372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleExquery394 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExquery412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleQuery511 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQuery530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleQuery552 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_ruleClause658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleClause691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleFact795 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFact813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleRule912 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRule930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleRule952 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRule970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_rulePredicate1069 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePredicate1087 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_ruleTerm_in_rulePredicate1109 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_rulePredicate1128 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_ruleTerm_in_rulePredicate1150 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_rulePredicate1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFunctor1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleTerm1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleTerm1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAtom1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleAtom1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleAtom1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList1599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleList1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_ruleList1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList1722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyList1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNotEmptyList1771 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleFolge_in_ruleNotEmptyList1793 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNotEmptyList1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolge_in_entryRuleFolge1852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFolge1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleFolge1910 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFolge1929 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleFolge1951 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2049 = new BitSet(new long[]{0x0000000000000002L});

}