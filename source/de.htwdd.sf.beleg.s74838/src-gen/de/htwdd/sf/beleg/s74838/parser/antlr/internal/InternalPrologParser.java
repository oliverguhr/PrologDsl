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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_IDENT", "RULE_VARIABLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "','", "'['", "']'", "'[]'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_INT=7;
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


    // $ANTLR start "entryRuleAtom"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:157:1: entryRuleAtom returns [String current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final String entryRuleAtom() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtom = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:158:2: (iv_ruleAtom= ruleAtom EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:159:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom288);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom299); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:166:1: ruleAtom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ident_0= RULE_IDENT | this_variable_1= RULE_VARIABLE | this_Number_2= ruleNumber ) ;
    public final AntlrDatatypeRuleToken ruleAtom() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ident_0=null;
        Token this_variable_1=null;
        AntlrDatatypeRuleToken this_Number_2 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:169:28: ( (this_ident_0= RULE_IDENT | this_variable_1= RULE_VARIABLE | this_Number_2= ruleNumber ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:170:1: (this_ident_0= RULE_IDENT | this_variable_1= RULE_VARIABLE | this_Number_2= ruleNumber )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:170:1: (this_ident_0= RULE_IDENT | this_variable_1= RULE_VARIABLE | this_Number_2= ruleNumber )
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
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:170:6: this_ident_0= RULE_IDENT
                    {
                    this_ident_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAtom339); 

                    		current.merge(this_ident_0);
                        
                     
                        newLeafNode(this_ident_0, grammarAccess.getAtomAccess().getIdentTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:178:10: this_variable_1= RULE_VARIABLE
                    {
                    this_variable_1=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleAtom365); 

                    		current.merge(this_variable_1);
                        
                     
                        newLeafNode(this_variable_1, grammarAccess.getAtomAccess().getVariableTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:187:5: this_Number_2= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getNumberParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleAtom398);
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


    // $ANTLR start "entryRuleNumber"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:205:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:206:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:207:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber444);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber455); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:214:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:217:28: (this_INT_0= RULE_INT )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:218:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber494); 

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


    // $ANTLR start "entryRuleFolge"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:233:1: entryRuleFolge returns [String current=null] : iv_ruleFolge= ruleFolge EOF ;
    public final String entryRuleFolge() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFolge = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:234:2: (iv_ruleFolge= ruleFolge EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:235:2: iv_ruleFolge= ruleFolge EOF
            {
             newCompositeNode(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_ruleFolge_in_entryRuleFolge539);
            iv_ruleFolge=ruleFolge();

            state._fsp--;

             current =iv_ruleFolge.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFolge550); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:242:1: ruleFolge returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )* ) ;
    public final AntlrDatatypeRuleToken ruleFolge() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Atom_0 = null;

        AntlrDatatypeRuleToken this_Atom_2 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:245:28: ( (this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )* ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:246:1: (this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )* )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:246:1: (this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )* )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:247:5: this_Atom_0= ruleAtom (kw= ',' this_Atom_2= ruleAtom )*
            {
             
                    newCompositeNode(grammarAccess.getFolgeAccess().getAtomParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtom_in_ruleFolge597);
            this_Atom_0=ruleAtom();

            state._fsp--;


            		current.merge(this_Atom_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:257:1: (kw= ',' this_Atom_2= ruleAtom )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:258:2: kw= ',' this_Atom_2= ruleAtom
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleFolge616); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFolgeAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFolgeAccess().getAtomParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleAtom_in_ruleFolge638);
            	    this_Atom_2=ruleAtom();

            	    state._fsp--;


            	    		current.merge(this_Atom_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleNotEmptyList"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:282:1: entryRuleNotEmptyList returns [String current=null] : iv_ruleNotEmptyList= ruleNotEmptyList EOF ;
    public final String entryRuleNotEmptyList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotEmptyList = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:283:2: (iv_ruleNotEmptyList= ruleNotEmptyList EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:284:2: iv_ruleNotEmptyList= ruleNotEmptyList EOF
            {
             newCompositeNode(grammarAccess.getNotEmptyListRule()); 
            pushFollow(FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList686);
            iv_ruleNotEmptyList=ruleNotEmptyList();

            state._fsp--;

             current =iv_ruleNotEmptyList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyList697); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:291:1: ruleNotEmptyList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_Folge_1= ruleFolge kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleNotEmptyList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Folge_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:294:28: ( (kw= '[' this_Folge_1= ruleFolge kw= ']' ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:295:1: (kw= '[' this_Folge_1= ruleFolge kw= ']' )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:295:1: (kw= '[' this_Folge_1= ruleFolge kw= ']' )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:296:2: kw= '[' this_Folge_1= ruleFolge kw= ']'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleNotEmptyList735); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNotEmptyListAccess().getLeftSquareBracketKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getNotEmptyListAccess().getFolgeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFolge_in_ruleNotEmptyList757);
            this_Folge_1=ruleFolge();

            state._fsp--;


            		current.merge(this_Folge_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,17,FOLLOW_17_in_ruleNotEmptyList775); 

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


    // $ANTLR start "entryRuleList"
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:326:1: entryRuleList returns [String current=null] : iv_ruleList= ruleList EOF ;
    public final String entryRuleList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleList = null;


        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:327:2: (iv_ruleList= ruleList EOF )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:328:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList816);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList827); 

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
    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:335:1: ruleList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[]' | this_NotEmptyList_1= ruleNotEmptyList ) ;
    public final AntlrDatatypeRuleToken ruleList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NotEmptyList_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:338:28: ( (kw= '[]' | this_NotEmptyList_1= ruleNotEmptyList ) )
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:339:1: (kw= '[]' | this_NotEmptyList_1= ruleNotEmptyList )
            {
            // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:339:1: (kw= '[]' | this_NotEmptyList_1= ruleNotEmptyList )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:340:2: kw= '[]'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleList865); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getListAccess().getLeftSquareBracketRightSquareBracketKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838/src-gen/de/htwdd/sf/beleg/s74838/parser/antlr/internal/InternalProlog.g:347:5: this_NotEmptyList_1= ruleNotEmptyList
                    {
                     
                            newCompositeNode(grammarAccess.getListAccess().getNotEmptyListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNotEmptyList_in_ruleList893);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGreeting213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting230 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGreeting247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAtom339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleAtom365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleAtom398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolge_in_entryRuleFolge539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFolge550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleFolge597 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFolge616 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleFolge638 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_entryRuleNotEmptyList686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyList697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNotEmptyList735 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleFolge_in_ruleNotEmptyList757 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNotEmptyList775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleList865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyList_in_ruleList893 = new BitSet(new long[]{0x0000000000000002L});

}