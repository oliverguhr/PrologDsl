package de.htwdd.sf.beleg.s74838.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPrologLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_VARIABLE=6;
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

    public InternalPrologLexer() {;} 
    public InternalPrologLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPrologLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:11:7: ( '[]' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:11:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:12:7: ( 'Hello' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:12:9: 'Hello'
            {
            match("Hello"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:13:7: ( '!' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:13:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:14:7: ( ',' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:15:7: ( '[' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:16:7: ( ']' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:663:15: ( 'A' .. 'Z' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:663:17: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:665:12: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:665:14: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:665:23: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:667:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:667:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:667:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:667:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:667:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:669:10: ( ( '0' .. '9' )+ )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:669:12: ( '0' .. '9' )+
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:669:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:669:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:671:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:673:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:673:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:673:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:673:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:675:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:675:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:675:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:675:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:675:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:675:41: ( '\\r' )? '\\n'
                    {
                    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:675:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:675:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:677:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:677:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:677:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:679:16: ( . )
            // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:679:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_VARIABLE | RULE_IDENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=15;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:46: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 8 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:60: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 9 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:71: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:79: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:88: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:100: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:116: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:132: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../de.htwdd.sf.beleg.s74838.ui/src-gen/de/htwdd/sf/beleg/s74838/ui/contentassist/antlr/internal/InternalProlog.g:1:140: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\21\1\23\3\uffff\1\23\1\30\1\17\2\uffff\3\17\4\uffff\1"+
        "\24\6\uffff\1\30\5\uffff\2\24\1\42\1\uffff";
    static final String DFA13_eofS =
        "\43\uffff";
    static final String DFA13_minS =
        "\1\0\1\135\1\60\3\uffff\2\60\1\101\2\uffff\2\0\1\52\4\uffff\1\154"+
        "\6\uffff\1\60\5\uffff\1\154\1\157\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\135\1\172\3\uffff\3\172\2\uffff\2\uffff\1\57\4\uffff"+
        "\1\154\6\uffff\1\172\5\uffff\1\154\1\157\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\6\3\uffff\1\11\1\12\3\uffff\1\16\1\17\1\1\1\5"+
        "\1\uffff\1\7\1\11\1\3\1\4\1\6\1\10\1\uffff\1\12\1\13\1\14\1\15\1"+
        "\16\3\uffff\1\2";
    static final String DFA13_specialS =
        "\1\1\12\uffff\1\0\1\2\26\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\3\1\13\4\17\1\14\4\17\1\4"+
            "\2\17\1\15\12\12\7\17\7\6\1\2\22\6\1\1\1\17\1\5\1\10\1\11\1"+
            "\17\32\7\uff85\17",
            "\1\20",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\4\24\1\22\25\24",
            "",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\0\33",
            "\0\33",
            "\1\34\4\uffff\1\35",
            "",
            "",
            "",
            "",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_VARIABLE | RULE_IDENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_11 = input.LA(1);

                        s = -1;
                        if ( ((LA13_11>='\u0000' && LA13_11<='\uFFFF')) ) {s = 27;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='[') ) {s = 1;}

                        else if ( (LA13_0=='H') ) {s = 2;}

                        else if ( (LA13_0=='!') ) {s = 3;}

                        else if ( (LA13_0==',') ) {s = 4;}

                        else if ( (LA13_0==']') ) {s = 5;}

                        else if ( ((LA13_0>='A' && LA13_0<='G')||(LA13_0>='I' && LA13_0<='Z')) ) {s = 6;}

                        else if ( ((LA13_0>='a' && LA13_0<='z')) ) {s = 7;}

                        else if ( (LA13_0=='^') ) {s = 8;}

                        else if ( (LA13_0=='_') ) {s = 9;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 10;}

                        else if ( (LA13_0=='\"') ) {s = 11;}

                        else if ( (LA13_0=='\'') ) {s = 12;}

                        else if ( (LA13_0=='/') ) {s = 13;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 14;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_12 = input.LA(1);

                        s = -1;
                        if ( ((LA13_12>='\u0000' && LA13_12<='\uFFFF')) ) {s = 27;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}