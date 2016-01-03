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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_VARIABLE", "RULE_IDENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=8;
    public static final int RULE_VARIABLE=6;
    public static final int RULE_IDENT=7;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g"; }



     	private PrologGrammarAccess grammarAccess;
     	
        public InternalPrologParser(TokenStream input, PrologGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PrologGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:79:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:82:3: lv_greetings_0_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_0_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:107:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:108:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:115:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:118:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:119:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGreeting213); 

                	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:124:1: (lv_name_1_0= RULE_ID )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGreeting247); 

                	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
                

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleNumber"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:157:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:158:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:159:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber288);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber299); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:166:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:169:28: (this_INT_0= RULE_INT )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:170:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber338); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGreeting213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting230 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGreeting247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber338 = new BitSet(new long[]{0x0000000000000002L});

}