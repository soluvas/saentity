package com.soluvas.saentity.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.soluvas.saentity.services.SaentityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSaentityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'package'", "')'", "'.'", "'entity'", "'['", "']'", "'attr'", "'object'", "'string'", "'int'", "'decimal'", "'boolean'", "'date'", "'int-array'", "'map'", "'map-array'"
    };
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSaentityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSaentityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSaentityParser.tokenNames; }
    public String getGrammarFileName() { return "../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g"; }



     	private SaentityGrammarAccess grammarAccess;
     	
        public InternalSaentityParser(TokenStream input, SaentityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SaentityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'package' ( (lv_packageName_2_0= ruleFQN ) ) ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_packageName_2_0 = null;

        EObject lv_entities_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:79:28: ( (otherlv_0= '(' otherlv_1= 'package' ( (lv_packageName_2_0= ruleFQN ) ) ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')' ) )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:80:1: (otherlv_0= '(' otherlv_1= 'package' ( (lv_packageName_2_0= ruleFQN ) ) ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')' )
            {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:80:1: (otherlv_0= '(' otherlv_1= 'package' ( (lv_packageName_2_0= ruleFQN ) ) ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')' )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:80:3: otherlv_0= '(' otherlv_1= 'package' ( (lv_packageName_2_0= ruleFQN ) ) ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getPackageKeyword_1());
                
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:88:1: ( (lv_packageName_2_0= ruleFQN ) )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:89:1: (lv_packageName_2_0= ruleFQN )
            {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:89:1: (lv_packageName_2_0= ruleFQN )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:90:3: lv_packageName_2_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleModel155);
            lv_packageName_2_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"packageName",
                    		lv_packageName_2_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:106:2: ( (lv_entities_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:107:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:107:1: (lv_entities_3_0= ruleEntity )
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:108:3: lv_entities_3_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModel176);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_3_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel189); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFQN"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:136:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:137:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:138:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN226);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN237); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:145:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:148:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:149:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:149:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:149:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN277); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:156:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:157:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleFQN296); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN311); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEntity"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:177:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:178:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:179:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity358);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity368); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:186:1: ruleEntity returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_labels_4_0= ruleLabel ) )+ otherlv_5= ']' otherlv_6= '[' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ']' otherlv_9= ')' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_labels_4_0 = null;

        EObject lv_attributes_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:189:28: ( (otherlv_0= '(' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_labels_4_0= ruleLabel ) )+ otherlv_5= ']' otherlv_6= '[' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ']' otherlv_9= ')' ) )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:190:1: (otherlv_0= '(' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_labels_4_0= ruleLabel ) )+ otherlv_5= ']' otherlv_6= '[' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ']' otherlv_9= ')' )
            {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:190:1: (otherlv_0= '(' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_labels_4_0= ruleLabel ) )+ otherlv_5= ']' otherlv_6= '[' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ']' otherlv_9= ')' )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:190:3: otherlv_0= '(' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_labels_4_0= ruleLabel ) )+ otherlv_5= ']' otherlv_6= '[' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEntity405); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEntity417); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:198:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:199:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:199:1: (lv_name_2_0= RULE_ID )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:200:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity434); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleEntity451); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3());
                
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:220:1: ( (lv_labels_4_0= ruleLabel ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:221:1: (lv_labels_4_0= ruleLabel )
            	    {
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:221:1: (lv_labels_4_0= ruleLabel )
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:222:3: lv_labels_4_0= ruleLabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getLabelsLabelParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLabel_in_ruleEntity472);
            	    lv_labels_4_0=ruleLabel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"labels",
            	            		lv_labels_4_0, 
            	            		"Label");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleEntity485); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleEntity497); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_6());
                
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:246:1: ( (lv_attributes_7_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:247:1: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:247:1: (lv_attributes_7_0= ruleAttribute )
            	    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:248:3: lv_attributes_7_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity518);
            	    lv_attributes_7_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_7_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEntity531); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_8());
                
            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleEntity543); 

                	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightParenthesisKeyword_9());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleLabel"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:280:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:281:2: (iv_ruleLabel= ruleLabel EOF )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:282:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel579);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel589); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:289:1: ruleLabel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:292:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:293:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:293:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:294:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:294:1: (lv_name_0_0= RULE_ID )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:295:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel630); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAttribute"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:319:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:320:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:321:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute670);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute680); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:328:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' otherlv_2= 'attr' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_dataType_4_0= ruleDataType ) ) | (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ')' ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token lv_dataType_6_0=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_dataType_4_0 = null;

        AntlrDatatypeRuleToken lv_dataClass_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:331:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' otherlv_2= 'attr' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_dataType_4_0= ruleDataType ) ) | (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ')' ) ) )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:332:1: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' otherlv_2= 'attr' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_dataType_4_0= ruleDataType ) ) | (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ')' ) )
            {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:332:1: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' otherlv_2= 'attr' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_dataType_4_0= ruleDataType ) ) | (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==11) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:332:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:332:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:333:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:333:1: (lv_name_0_0= RULE_ID )
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:334:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute722); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:351:6: (otherlv_1= '(' otherlv_2= 'attr' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_dataType_4_0= ruleDataType ) ) | (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ')' )
                    {
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:351:6: (otherlv_1= '(' otherlv_2= 'attr' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_dataType_4_0= ruleDataType ) ) | (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ')' )
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:351:8: otherlv_1= '(' otherlv_2= 'attr' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_dataType_4_0= ruleDataType ) ) | (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ')'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleAttribute746); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAttribute758); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAttrKeyword_1_1());
                        
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:359:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:360:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:360:1: (lv_name_3_0= RULE_ID )
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:361:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute775); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:377:2: ( ( (lv_dataType_4_0= ruleDataType ) ) | (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=20 && LA5_0<=27)) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==11) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:377:3: ( (lv_dataType_4_0= ruleDataType ) )
                            {
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:377:3: ( (lv_dataType_4_0= ruleDataType ) )
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:378:1: (lv_dataType_4_0= ruleDataType )
                            {
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:378:1: (lv_dataType_4_0= ruleDataType )
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:379:3: lv_dataType_4_0= ruleDataType
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeDataTypeParserRuleCall_1_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleAttribute802);
                            lv_dataType_4_0=ruleDataType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"dataType",
                                    		lv_dataType_4_0, 
                                    		"DataType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:396:6: (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' )
                            {
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:396:6: (otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')' )
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:396:8: otherlv_5= '(' ( (lv_dataType_6_0= 'object' ) ) ( (lv_dataClass_7_0= ruleFQN ) ) otherlv_8= ')'
                            {
                            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleAttribute821); 

                                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_1_3_1_0());
                                
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:400:1: ( (lv_dataType_6_0= 'object' ) )
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:401:1: (lv_dataType_6_0= 'object' )
                            {
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:401:1: (lv_dataType_6_0= 'object' )
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:402:3: lv_dataType_6_0= 'object'
                            {
                            lv_dataType_6_0=(Token)match(input,19,FOLLOW_19_in_ruleAttribute839); 

                                    newLeafNode(lv_dataType_6_0, grammarAccess.getAttributeAccess().getDataTypeObjectKeyword_1_3_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeRule());
                            	        }
                                   		setWithLastConsumed(current, "dataType", lv_dataType_6_0, "object");
                            	    

                            }


                            }

                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:415:2: ( (lv_dataClass_7_0= ruleFQN ) )
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:416:1: (lv_dataClass_7_0= ruleFQN )
                            {
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:416:1: (lv_dataClass_7_0= ruleFQN )
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:417:3: lv_dataClass_7_0= ruleFQN
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeAccess().getDataClassFQNParserRuleCall_1_3_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFQN_in_ruleAttribute873);
                            lv_dataClass_7_0=ruleFQN();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"dataClass",
                                    		lv_dataClass_7_0, 
                                    		"FQN");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleAttribute885); 

                                	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_1_3_1_3());
                                

                            }


                            }
                            break;

                    }

                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:437:3: ( (lv_description_9_0= RULE_STRING ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_STRING) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:438:1: (lv_description_9_0= RULE_STRING )
                            {
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:438:1: (lv_description_9_0= RULE_STRING )
                            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:439:3: lv_description_9_0= RULE_STRING
                            {
                            lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute904); 

                            			newLeafNode(lv_description_9_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_1_4_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_9_0, 
                                    		"STRING");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleAttribute922); 

                        	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_1_5());
                        

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:467:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:468:2: (iv_ruleDataType= ruleDataType EOF )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:469:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType960);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType971); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:476:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'int' | kw= 'decimal' | kw= 'boolean' | kw= 'date' | kw= 'int-array' | kw= 'map' | kw= 'map-array' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:479:28: ( (kw= 'string' | kw= 'int' | kw= 'decimal' | kw= 'boolean' | kw= 'date' | kw= 'int-array' | kw= 'map' | kw= 'map-array' ) )
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:480:1: (kw= 'string' | kw= 'int' | kw= 'decimal' | kw= 'boolean' | kw= 'date' | kw= 'int-array' | kw= 'map' | kw= 'map-array' )
            {
            // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:480:1: (kw= 'string' | kw= 'int' | kw= 'decimal' | kw= 'boolean' | kw= 'date' | kw= 'int-array' | kw= 'map' | kw= 'map-array' )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            case 26:
                {
                alt8=7;
                }
                break;
            case 27:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:481:2: kw= 'string'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleDataType1009); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:488:2: kw= 'int'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleDataType1028); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:495:2: kw= 'decimal'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleDataType1047); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDecimalKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:502:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleDataType1066); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:509:2: kw= 'date'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleDataType1085); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDateKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:516:2: kw= 'int-array'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleDataType1104); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntArrayKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:523:2: kw= 'map'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleDataType1123); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getMapKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.soluvas.saentity/src-gen/com/soluvas/saentity/parser/antlr/internal/InternalSaentity.g:530:2: kw= 'map-array'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleDataType1142); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getMapArrayKeyword_7()); 
                        

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModel155 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel176 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_ruleModel189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN277 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleFQN296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN311 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity405 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity434 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEntity451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleEntity472 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleEntity485 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEntity497 = new BitSet(new long[]{0x0000000000020810L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity518 = new BitSet(new long[]{0x0000000000020810L});
    public static final BitSet FOLLOW_17_in_ruleEntity531 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAttribute746 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttribute758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute775 = new BitSet(new long[]{0x000000000FF00800L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAttribute802 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_11_in_ruleAttribute821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAttribute873 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute885 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute904 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDataType1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDataType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDataType1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDataType1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDataType1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDataType1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataType1142 = new BitSet(new long[]{0x0000000000000002L});

}