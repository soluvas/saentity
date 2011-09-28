package com.soluvas.saentity.ui.contentassist.antlr.internal; 

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
import com.soluvas.saentity.services.SaentityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSaentityParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'decimal'", "'boolean'", "'date'", "'int-array'", "'map'", "'map-array'", "'('", "'package'", "')'", "'.'", "'entity'", "'['", "']'", "'attr'", "'object'"
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
    public String getGrammarFileName() { return "../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g"; }


     
     	private SaentityGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SaentityGrammarAccess grammarAccess) {
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
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:61:1: ( ruleModel EOF )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:62:1: ruleModel EOF
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
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:76:1: ( rule__Model__Group__0 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleFQN"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:88:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:89:1: ( ruleFQN EOF )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:90:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN121);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN128); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:97:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:101:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:102:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:102:1: ( ( rule__FQN__Group__0 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:103:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:104:1: ( rule__FQN__Group__0 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:104:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN154);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEntity"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:116:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:117:1: ( ruleEntity EOF )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:118:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity181);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity188); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:125:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:129:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:130:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:130:1: ( ( rule__Entity__Group__0 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:131:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:132:1: ( rule__Entity__Group__0 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:132:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity214);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleLabel"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:144:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:145:1: ( ruleLabel EOF )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:146:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel241);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel248); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:153:1: ruleLabel : ( ( rule__Label__NameAssignment ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:157:2: ( ( ( rule__Label__NameAssignment ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:158:1: ( ( rule__Label__NameAssignment ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:158:1: ( ( rule__Label__NameAssignment ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:159:1: ( rule__Label__NameAssignment )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:160:1: ( rule__Label__NameAssignment )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:160:2: rule__Label__NameAssignment
            {
            pushFollow(FOLLOW_rule__Label__NameAssignment_in_ruleLabel274);
            rule__Label__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAttribute"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:172:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:173:1: ( ruleAttribute EOF )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:174:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute301);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute308); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:181:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:185:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:186:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:186:1: ( ( rule__Attribute__Alternatives ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:187:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:188:1: ( rule__Attribute__Alternatives )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:188:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute334);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:200:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:201:1: ( ruleDataType EOF )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:202:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType361);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType368); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:209:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:213:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:214:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:214:1: ( ( rule__DataType__Alternatives ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:215:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:216:1: ( rule__DataType__Alternatives )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:216:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType394);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Attribute__Alternatives"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:228:1: rule__Attribute__Alternatives : ( ( ( rule__Attribute__NameAssignment_0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:232:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:233:1: ( ( rule__Attribute__NameAssignment_0 ) )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:233:1: ( ( rule__Attribute__NameAssignment_0 ) )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:234:1: ( rule__Attribute__NameAssignment_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:235:1: ( rule__Attribute__NameAssignment_0 )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:235:2: rule__Attribute__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Alternatives430);
                    rule__Attribute__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:239:6: ( ( rule__Attribute__Group_1__0 ) )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:239:6: ( ( rule__Attribute__Group_1__0 ) )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:240:1: ( rule__Attribute__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_1()); 
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:241:1: ( rule__Attribute__Group_1__0 )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:241:2: rule__Attribute__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_1__0_in_rule__Attribute__Alternatives448);
                    rule__Attribute__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives_1_3"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:250:1: rule__Attribute__Alternatives_1_3 : ( ( ( rule__Attribute__DataTypeAssignment_1_3_0 ) ) | ( ( rule__Attribute__Group_1_3_1__0 ) ) );
    public final void rule__Attribute__Alternatives_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:254:1: ( ( ( rule__Attribute__DataTypeAssignment_1_3_0 ) ) | ( ( rule__Attribute__Group_1_3_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:255:1: ( ( rule__Attribute__DataTypeAssignment_1_3_0 ) )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:255:1: ( ( rule__Attribute__DataTypeAssignment_1_3_0 ) )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:256:1: ( rule__Attribute__DataTypeAssignment_1_3_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getDataTypeAssignment_1_3_0()); 
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:257:1: ( rule__Attribute__DataTypeAssignment_1_3_0 )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:257:2: rule__Attribute__DataTypeAssignment_1_3_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__DataTypeAssignment_1_3_0_in_rule__Attribute__Alternatives_1_3481);
                    rule__Attribute__DataTypeAssignment_1_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getDataTypeAssignment_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:261:6: ( ( rule__Attribute__Group_1_3_1__0 ) )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:261:6: ( ( rule__Attribute__Group_1_3_1__0 ) )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:262:1: ( rule__Attribute__Group_1_3_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_1_3_1()); 
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:263:1: ( rule__Attribute__Group_1_3_1__0 )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:263:2: rule__Attribute__Group_1_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_1_3_1__0_in_rule__Attribute__Alternatives_1_3499);
                    rule__Attribute__Group_1_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_1_3_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives_1_3"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:272:1: rule__DataType__Alternatives : ( ( 'string' ) | ( 'int' ) | ( 'decimal' ) | ( 'boolean' ) | ( 'date' ) | ( 'int-array' ) | ( 'map' ) | ( 'map-array' ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:276:1: ( ( 'string' ) | ( 'int' ) | ( 'decimal' ) | ( 'boolean' ) | ( 'date' ) | ( 'int-array' ) | ( 'map' ) | ( 'map-array' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:277:1: ( 'string' )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:277:1: ( 'string' )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:278:1: 'string'
                    {
                     before(grammarAccess.getDataTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__DataType__Alternatives533); 
                     after(grammarAccess.getDataTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:285:6: ( 'int' )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:285:6: ( 'int' )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:286:1: 'int'
                    {
                     before(grammarAccess.getDataTypeAccess().getIntKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__DataType__Alternatives553); 
                     after(grammarAccess.getDataTypeAccess().getIntKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:293:6: ( 'decimal' )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:293:6: ( 'decimal' )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:294:1: 'decimal'
                    {
                     before(grammarAccess.getDataTypeAccess().getDecimalKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__DataType__Alternatives573); 
                     after(grammarAccess.getDataTypeAccess().getDecimalKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:301:6: ( 'boolean' )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:301:6: ( 'boolean' )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:302:1: 'boolean'
                    {
                     before(grammarAccess.getDataTypeAccess().getBooleanKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__DataType__Alternatives593); 
                     after(grammarAccess.getDataTypeAccess().getBooleanKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:309:6: ( 'date' )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:309:6: ( 'date' )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:310:1: 'date'
                    {
                     before(grammarAccess.getDataTypeAccess().getDateKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__DataType__Alternatives613); 
                     after(grammarAccess.getDataTypeAccess().getDateKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:317:6: ( 'int-array' )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:317:6: ( 'int-array' )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:318:1: 'int-array'
                    {
                     before(grammarAccess.getDataTypeAccess().getIntArrayKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__DataType__Alternatives633); 
                     after(grammarAccess.getDataTypeAccess().getIntArrayKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:325:6: ( 'map' )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:325:6: ( 'map' )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:326:1: 'map'
                    {
                     before(grammarAccess.getDataTypeAccess().getMapKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__DataType__Alternatives653); 
                     after(grammarAccess.getDataTypeAccess().getMapKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:333:6: ( 'map-array' )
                    {
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:333:6: ( 'map-array' )
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:334:1: 'map-array'
                    {
                     before(grammarAccess.getDataTypeAccess().getMapArrayKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__DataType__Alternatives673); 
                     after(grammarAccess.getDataTypeAccess().getMapArrayKeyword_7()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:348:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:352:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:353:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0705);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0708);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:360:1: rule__Model__Group__0__Impl : ( '(' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:364:1: ( ( '(' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:365:1: ( '(' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:365:1: ( '(' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:366:1: '('
            {
             before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__0__Impl736); 
             after(grammarAccess.getModelAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:379:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:383:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:384:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1767);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1770);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:391:1: rule__Model__Group__1__Impl : ( 'package' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:395:1: ( ( 'package' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:396:1: ( 'package' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:396:1: ( 'package' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:397:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__1__Impl798); 
             after(grammarAccess.getModelAccess().getPackageKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:410:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:414:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:415:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2829);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2832);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:422:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackageNameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:426:1: ( ( ( rule__Model__PackageNameAssignment_2 ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:427:1: ( ( rule__Model__PackageNameAssignment_2 ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:427:1: ( ( rule__Model__PackageNameAssignment_2 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:428:1: ( rule__Model__PackageNameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_2()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:429:1: ( rule__Model__PackageNameAssignment_2 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:429:2: rule__Model__PackageNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_2_in_rule__Model__Group__2__Impl859);
            rule__Model__PackageNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageNameAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:439:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:443:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:444:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3889);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3892);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:451:1: rule__Model__Group__3__Impl : ( ( rule__Model__EntitiesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:455:1: ( ( ( rule__Model__EntitiesAssignment_3 )* ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:456:1: ( ( rule__Model__EntitiesAssignment_3 )* )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:456:1: ( ( rule__Model__EntitiesAssignment_3 )* )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:457:1: ( rule__Model__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_3()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:458:1: ( rule__Model__EntitiesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:458:2: rule__Model__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__EntitiesAssignment_3_in_rule__Model__Group__3__Impl919);
            	    rule__Model__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:468:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:472:1: ( rule__Model__Group__4__Impl )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:473:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4950);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:479:1: rule__Model__Group__4__Impl : ( ')' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:483:1: ( ( ')' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:484:1: ( ')' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:484:1: ( ')' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:485:1: ')'
            {
             before(grammarAccess.getModelAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__4__Impl978); 
             after(grammarAccess.getModelAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:508:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:512:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:513:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01019);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01022);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:520:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:524:1: ( ( RULE_ID ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:525:1: ( RULE_ID )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:525:1: ( RULE_ID )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:526:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1049); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:537:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:541:1: ( rule__FQN__Group__1__Impl )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:542:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11078);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:548:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:552:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:553:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:553:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:554:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:555:1: ( rule__FQN__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:555:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1105);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:569:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:573:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:574:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01140);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01143);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:581:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:585:1: ( ( '.' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:586:1: ( '.' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:586:1: ( '.' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:587:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__FQN__Group_1__0__Impl1171); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:600:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:604:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:605:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11202);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:611:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:615:1: ( ( RULE_ID ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:616:1: ( RULE_ID )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:616:1: ( RULE_ID )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:617:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1229); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:632:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:636:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:637:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01262);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01265);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:644:1: rule__Entity__Group__0__Impl : ( '(' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:648:1: ( ( '(' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:649:1: ( '(' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:649:1: ( '(' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:650:1: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__0__Impl1293); 
             after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:663:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:667:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:668:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11324);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11327);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:675:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:679:1: ( ( 'entity' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:680:1: ( 'entity' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:680:1: ( 'entity' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:681:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group__1__Impl1355); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:694:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:698:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:699:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21386);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21389);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:706:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:710:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:711:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:711:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:712:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:713:1: ( rule__Entity__NameAssignment_2 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:713:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1416);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:723:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:727:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:728:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31446);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31449);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:735:1: rule__Entity__Group__3__Impl : ( '[' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:739:1: ( ( '[' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:740:1: ( '[' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:740:1: ( '[' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:741:1: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Entity__Group__3__Impl1477); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:754:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:758:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:759:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41508);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41511);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:766:1: rule__Entity__Group__4__Impl : ( ( ( rule__Entity__LabelsAssignment_4 ) ) ( ( rule__Entity__LabelsAssignment_4 )* ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:770:1: ( ( ( ( rule__Entity__LabelsAssignment_4 ) ) ( ( rule__Entity__LabelsAssignment_4 )* ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:771:1: ( ( ( rule__Entity__LabelsAssignment_4 ) ) ( ( rule__Entity__LabelsAssignment_4 )* ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:771:1: ( ( ( rule__Entity__LabelsAssignment_4 ) ) ( ( rule__Entity__LabelsAssignment_4 )* ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:772:1: ( ( rule__Entity__LabelsAssignment_4 ) ) ( ( rule__Entity__LabelsAssignment_4 )* )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:772:1: ( ( rule__Entity__LabelsAssignment_4 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:773:1: ( rule__Entity__LabelsAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getLabelsAssignment_4()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:774:1: ( rule__Entity__LabelsAssignment_4 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:774:2: rule__Entity__LabelsAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__LabelsAssignment_4_in_rule__Entity__Group__4__Impl1540);
            rule__Entity__LabelsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getLabelsAssignment_4()); 

            }

            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:777:1: ( ( rule__Entity__LabelsAssignment_4 )* )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:778:1: ( rule__Entity__LabelsAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getLabelsAssignment_4()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:779:1: ( rule__Entity__LabelsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:779:2: rule__Entity__LabelsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__LabelsAssignment_4_in_rule__Entity__Group__4__Impl1552);
            	    rule__Entity__LabelsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getLabelsAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:790:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:794:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:795:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51585);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51588);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:802:1: rule__Entity__Group__5__Impl : ( ']' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:806:1: ( ( ']' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:807:1: ( ']' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:807:1: ( ']' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:808:1: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__5__Impl1616); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:821:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:825:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:826:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61647);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61650);
            rule__Entity__Group__7();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:833:1: rule__Entity__Group__6__Impl : ( '[' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:837:1: ( ( '[' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:838:1: ( '[' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:838:1: ( '[' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:839:1: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__Entity__Group__6__Impl1678); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:852:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:856:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:857:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71709);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71712);
            rule__Entity__Group__8();

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
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:864:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__AttributesAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:868:1: ( ( ( rule__Entity__AttributesAssignment_7 )* ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:869:1: ( ( rule__Entity__AttributesAssignment_7 )* )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:869:1: ( ( rule__Entity__AttributesAssignment_7 )* )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:870:1: ( rule__Entity__AttributesAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_7()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:871:1: ( rule__Entity__AttributesAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:871:2: rule__Entity__AttributesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_7_in_rule__Entity__Group__7__Impl1739);
            	    rule__Entity__AttributesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_7()); 

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
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:881:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl rule__Entity__Group__9 ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:885:1: ( rule__Entity__Group__8__Impl rule__Entity__Group__9 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:886:2: rule__Entity__Group__8__Impl rule__Entity__Group__9
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81770);
            rule__Entity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__9_in_rule__Entity__Group__81773);
            rule__Entity__Group__9();

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
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:893:1: rule__Entity__Group__8__Impl : ( ']' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:897:1: ( ( ']' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:898:1: ( ']' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:898:1: ( ']' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:899:1: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_8()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__8__Impl1801); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group__9"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:912:1: rule__Entity__Group__9 : rule__Entity__Group__9__Impl ;
    public final void rule__Entity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:916:1: ( rule__Entity__Group__9__Impl )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:917:2: rule__Entity__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__9__Impl_in_rule__Entity__Group__91832);
            rule__Entity__Group__9__Impl();

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
    // $ANTLR end "rule__Entity__Group__9"


    // $ANTLR start "rule__Entity__Group__9__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:923:1: rule__Entity__Group__9__Impl : ( ')' ) ;
    public final void rule__Entity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:927:1: ( ( ')' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:928:1: ( ')' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:928:1: ( ')' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:929:1: ')'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_9()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__9__Impl1860); 
             after(grammarAccess.getEntityAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__Entity__Group__9__Impl"


    // $ANTLR start "rule__Attribute__Group_1__0"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:962:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:966:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:967:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__0__Impl_in_rule__Attribute__Group_1__01911);
            rule__Attribute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__1_in_rule__Attribute__Group_1__01914);
            rule__Attribute__Group_1__1();

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
    // $ANTLR end "rule__Attribute__Group_1__0"


    // $ANTLR start "rule__Attribute__Group_1__0__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:974:1: rule__Attribute__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:978:1: ( ( '(' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:979:1: ( '(' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:979:1: ( '(' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:980:1: '('
            {
             before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Attribute__Group_1__0__Impl1942); 
             after(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Attribute__Group_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_1__1"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:993:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:997:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:998:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__1__Impl_in_rule__Attribute__Group_1__11973);
            rule__Attribute__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__2_in_rule__Attribute__Group_1__11976);
            rule__Attribute__Group_1__2();

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
    // $ANTLR end "rule__Attribute__Group_1__1"


    // $ANTLR start "rule__Attribute__Group_1__1__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1005:1: rule__Attribute__Group_1__1__Impl : ( 'attr' ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1009:1: ( ( 'attr' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1010:1: ( 'attr' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1010:1: ( 'attr' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1011:1: 'attr'
            {
             before(grammarAccess.getAttributeAccess().getAttrKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__Attribute__Group_1__1__Impl2004); 
             after(grammarAccess.getAttributeAccess().getAttrKeyword_1_1()); 

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
    // $ANTLR end "rule__Attribute__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_1__2"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1024:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1028:1: ( rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1029:2: rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__2__Impl_in_rule__Attribute__Group_1__22035);
            rule__Attribute__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__3_in_rule__Attribute__Group_1__22038);
            rule__Attribute__Group_1__3();

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
    // $ANTLR end "rule__Attribute__Group_1__2"


    // $ANTLR start "rule__Attribute__Group_1__2__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1036:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__NameAssignment_1_2 ) ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1040:1: ( ( ( rule__Attribute__NameAssignment_1_2 ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1041:1: ( ( rule__Attribute__NameAssignment_1_2 ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1041:1: ( ( rule__Attribute__NameAssignment_1_2 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1042:1: ( rule__Attribute__NameAssignment_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1_2()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1043:1: ( rule__Attribute__NameAssignment_1_2 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1043:2: rule__Attribute__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_2_in_rule__Attribute__Group_1__2__Impl2065);
            rule__Attribute__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1_2()); 

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
    // $ANTLR end "rule__Attribute__Group_1__2__Impl"


    // $ANTLR start "rule__Attribute__Group_1__3"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1053:1: rule__Attribute__Group_1__3 : rule__Attribute__Group_1__3__Impl rule__Attribute__Group_1__4 ;
    public final void rule__Attribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1057:1: ( rule__Attribute__Group_1__3__Impl rule__Attribute__Group_1__4 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1058:2: rule__Attribute__Group_1__3__Impl rule__Attribute__Group_1__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__3__Impl_in_rule__Attribute__Group_1__32095);
            rule__Attribute__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__4_in_rule__Attribute__Group_1__32098);
            rule__Attribute__Group_1__4();

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
    // $ANTLR end "rule__Attribute__Group_1__3"


    // $ANTLR start "rule__Attribute__Group_1__3__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1065:1: rule__Attribute__Group_1__3__Impl : ( ( rule__Attribute__Alternatives_1_3 ) ) ;
    public final void rule__Attribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1069:1: ( ( ( rule__Attribute__Alternatives_1_3 ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1070:1: ( ( rule__Attribute__Alternatives_1_3 ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1070:1: ( ( rule__Attribute__Alternatives_1_3 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1071:1: ( rule__Attribute__Alternatives_1_3 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_1_3()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1072:1: ( rule__Attribute__Alternatives_1_3 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1072:2: rule__Attribute__Alternatives_1_3
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_1_3_in_rule__Attribute__Group_1__3__Impl2125);
            rule__Attribute__Alternatives_1_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives_1_3()); 

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
    // $ANTLR end "rule__Attribute__Group_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group_1__4"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1082:1: rule__Attribute__Group_1__4 : rule__Attribute__Group_1__4__Impl rule__Attribute__Group_1__5 ;
    public final void rule__Attribute__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1086:1: ( rule__Attribute__Group_1__4__Impl rule__Attribute__Group_1__5 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1087:2: rule__Attribute__Group_1__4__Impl rule__Attribute__Group_1__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__4__Impl_in_rule__Attribute__Group_1__42155);
            rule__Attribute__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__5_in_rule__Attribute__Group_1__42158);
            rule__Attribute__Group_1__5();

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
    // $ANTLR end "rule__Attribute__Group_1__4"


    // $ANTLR start "rule__Attribute__Group_1__4__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1094:1: rule__Attribute__Group_1__4__Impl : ( ( rule__Attribute__DescriptionAssignment_1_4 )? ) ;
    public final void rule__Attribute__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1098:1: ( ( ( rule__Attribute__DescriptionAssignment_1_4 )? ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1099:1: ( ( rule__Attribute__DescriptionAssignment_1_4 )? )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1099:1: ( ( rule__Attribute__DescriptionAssignment_1_4 )? )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1100:1: ( rule__Attribute__DescriptionAssignment_1_4 )?
            {
             before(grammarAccess.getAttributeAccess().getDescriptionAssignment_1_4()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1101:1: ( rule__Attribute__DescriptionAssignment_1_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1101:2: rule__Attribute__DescriptionAssignment_1_4
                    {
                    pushFollow(FOLLOW_rule__Attribute__DescriptionAssignment_1_4_in_rule__Attribute__Group_1__4__Impl2185);
                    rule__Attribute__DescriptionAssignment_1_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getDescriptionAssignment_1_4()); 

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
    // $ANTLR end "rule__Attribute__Group_1__4__Impl"


    // $ANTLR start "rule__Attribute__Group_1__5"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1111:1: rule__Attribute__Group_1__5 : rule__Attribute__Group_1__5__Impl ;
    public final void rule__Attribute__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1115:1: ( rule__Attribute__Group_1__5__Impl )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1116:2: rule__Attribute__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__5__Impl_in_rule__Attribute__Group_1__52216);
            rule__Attribute__Group_1__5__Impl();

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
    // $ANTLR end "rule__Attribute__Group_1__5"


    // $ANTLR start "rule__Attribute__Group_1__5__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1122:1: rule__Attribute__Group_1__5__Impl : ( ')' ) ;
    public final void rule__Attribute__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1126:1: ( ( ')' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1127:1: ( ')' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1127:1: ( ')' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1128:1: ')'
            {
             before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_1_5()); 
            match(input,21,FOLLOW_21_in_rule__Attribute__Group_1__5__Impl2244); 
             after(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_1_5()); 

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
    // $ANTLR end "rule__Attribute__Group_1__5__Impl"


    // $ANTLR start "rule__Attribute__Group_1_3_1__0"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1153:1: rule__Attribute__Group_1_3_1__0 : rule__Attribute__Group_1_3_1__0__Impl rule__Attribute__Group_1_3_1__1 ;
    public final void rule__Attribute__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1157:1: ( rule__Attribute__Group_1_3_1__0__Impl rule__Attribute__Group_1_3_1__1 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1158:2: rule__Attribute__Group_1_3_1__0__Impl rule__Attribute__Group_1_3_1__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1_3_1__0__Impl_in_rule__Attribute__Group_1_3_1__02287);
            rule__Attribute__Group_1_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1_3_1__1_in_rule__Attribute__Group_1_3_1__02290);
            rule__Attribute__Group_1_3_1__1();

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
    // $ANTLR end "rule__Attribute__Group_1_3_1__0"


    // $ANTLR start "rule__Attribute__Group_1_3_1__0__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1165:1: rule__Attribute__Group_1_3_1__0__Impl : ( '(' ) ;
    public final void rule__Attribute__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1169:1: ( ( '(' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1170:1: ( '(' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1170:1: ( '(' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1171:1: '('
            {
             before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_1_3_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Attribute__Group_1_3_1__0__Impl2318); 
             after(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_1_3_1_0()); 

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
    // $ANTLR end "rule__Attribute__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_1_3_1__1"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1184:1: rule__Attribute__Group_1_3_1__1 : rule__Attribute__Group_1_3_1__1__Impl rule__Attribute__Group_1_3_1__2 ;
    public final void rule__Attribute__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1188:1: ( rule__Attribute__Group_1_3_1__1__Impl rule__Attribute__Group_1_3_1__2 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1189:2: rule__Attribute__Group_1_3_1__1__Impl rule__Attribute__Group_1_3_1__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1_3_1__1__Impl_in_rule__Attribute__Group_1_3_1__12349);
            rule__Attribute__Group_1_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1_3_1__2_in_rule__Attribute__Group_1_3_1__12352);
            rule__Attribute__Group_1_3_1__2();

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
    // $ANTLR end "rule__Attribute__Group_1_3_1__1"


    // $ANTLR start "rule__Attribute__Group_1_3_1__1__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1196:1: rule__Attribute__Group_1_3_1__1__Impl : ( ( rule__Attribute__DataTypeAssignment_1_3_1_1 ) ) ;
    public final void rule__Attribute__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1200:1: ( ( ( rule__Attribute__DataTypeAssignment_1_3_1_1 ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1201:1: ( ( rule__Attribute__DataTypeAssignment_1_3_1_1 ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1201:1: ( ( rule__Attribute__DataTypeAssignment_1_3_1_1 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1202:1: ( rule__Attribute__DataTypeAssignment_1_3_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getDataTypeAssignment_1_3_1_1()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1203:1: ( rule__Attribute__DataTypeAssignment_1_3_1_1 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1203:2: rule__Attribute__DataTypeAssignment_1_3_1_1
            {
            pushFollow(FOLLOW_rule__Attribute__DataTypeAssignment_1_3_1_1_in_rule__Attribute__Group_1_3_1__1__Impl2379);
            rule__Attribute__DataTypeAssignment_1_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDataTypeAssignment_1_3_1_1()); 

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
    // $ANTLR end "rule__Attribute__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_1_3_1__2"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1213:1: rule__Attribute__Group_1_3_1__2 : rule__Attribute__Group_1_3_1__2__Impl rule__Attribute__Group_1_3_1__3 ;
    public final void rule__Attribute__Group_1_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1217:1: ( rule__Attribute__Group_1_3_1__2__Impl rule__Attribute__Group_1_3_1__3 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1218:2: rule__Attribute__Group_1_3_1__2__Impl rule__Attribute__Group_1_3_1__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1_3_1__2__Impl_in_rule__Attribute__Group_1_3_1__22409);
            rule__Attribute__Group_1_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1_3_1__3_in_rule__Attribute__Group_1_3_1__22412);
            rule__Attribute__Group_1_3_1__3();

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
    // $ANTLR end "rule__Attribute__Group_1_3_1__2"


    // $ANTLR start "rule__Attribute__Group_1_3_1__2__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1225:1: rule__Attribute__Group_1_3_1__2__Impl : ( ( rule__Attribute__DataClassAssignment_1_3_1_2 ) ) ;
    public final void rule__Attribute__Group_1_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1229:1: ( ( ( rule__Attribute__DataClassAssignment_1_3_1_2 ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1230:1: ( ( rule__Attribute__DataClassAssignment_1_3_1_2 ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1230:1: ( ( rule__Attribute__DataClassAssignment_1_3_1_2 ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1231:1: ( rule__Attribute__DataClassAssignment_1_3_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getDataClassAssignment_1_3_1_2()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1232:1: ( rule__Attribute__DataClassAssignment_1_3_1_2 )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1232:2: rule__Attribute__DataClassAssignment_1_3_1_2
            {
            pushFollow(FOLLOW_rule__Attribute__DataClassAssignment_1_3_1_2_in_rule__Attribute__Group_1_3_1__2__Impl2439);
            rule__Attribute__DataClassAssignment_1_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDataClassAssignment_1_3_1_2()); 

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
    // $ANTLR end "rule__Attribute__Group_1_3_1__2__Impl"


    // $ANTLR start "rule__Attribute__Group_1_3_1__3"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1242:1: rule__Attribute__Group_1_3_1__3 : rule__Attribute__Group_1_3_1__3__Impl ;
    public final void rule__Attribute__Group_1_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1246:1: ( rule__Attribute__Group_1_3_1__3__Impl )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1247:2: rule__Attribute__Group_1_3_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1_3_1__3__Impl_in_rule__Attribute__Group_1_3_1__32469);
            rule__Attribute__Group_1_3_1__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group_1_3_1__3"


    // $ANTLR start "rule__Attribute__Group_1_3_1__3__Impl"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1253:1: rule__Attribute__Group_1_3_1__3__Impl : ( ')' ) ;
    public final void rule__Attribute__Group_1_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1257:1: ( ( ')' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1258:1: ( ')' )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1258:1: ( ')' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1259:1: ')'
            {
             before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_1_3_1_3()); 
            match(input,21,FOLLOW_21_in_rule__Attribute__Group_1_3_1__3__Impl2497); 
             after(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_1_3_1_3()); 

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
    // $ANTLR end "rule__Attribute__Group_1_3_1__3__Impl"


    // $ANTLR start "rule__Model__PackageNameAssignment_2"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1281:1: rule__Model__PackageNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Model__PackageNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1285:1: ( ( ruleFQN ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1286:1: ( ruleFQN )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1286:1: ( ruleFQN )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1287:1: ruleFQN
            {
             before(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_22541);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__PackageNameAssignment_2"


    // $ANTLR start "rule__Model__EntitiesAssignment_3"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1296:1: rule__Model__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1300:1: ( ( ruleEntity ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1301:1: ( ruleEntity )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1301:1: ( ruleEntity )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1302:1: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Model__EntitiesAssignment_32572);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__EntitiesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1311:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1315:1: ( ( RULE_ID ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1316:1: ( RULE_ID )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1316:1: ( RULE_ID )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1317:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_22603); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__LabelsAssignment_4"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1326:1: rule__Entity__LabelsAssignment_4 : ( ruleLabel ) ;
    public final void rule__Entity__LabelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1330:1: ( ( ruleLabel ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1331:1: ( ruleLabel )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1331:1: ( ruleLabel )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1332:1: ruleLabel
            {
             before(grammarAccess.getEntityAccess().getLabelsLabelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Entity__LabelsAssignment_42634);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getLabelsLabelParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__LabelsAssignment_4"


    // $ANTLR start "rule__Entity__AttributesAssignment_7"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1341:1: rule__Entity__AttributesAssignment_7 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1345:1: ( ( ruleAttribute ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1346:1: ( ruleAttribute )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1346:1: ( ruleAttribute )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1347:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_72665);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_7"


    // $ANTLR start "rule__Label__NameAssignment"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1356:1: rule__Label__NameAssignment : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1360:1: ( ( RULE_ID ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1361:1: ( RULE_ID )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1361:1: ( RULE_ID )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1362:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment2696); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Label__NameAssignment"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1371:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1375:1: ( ( RULE_ID ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1376:1: ( RULE_ID )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1376:1: ( RULE_ID )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1377:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02727); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1_2"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1386:1: rule__Attribute__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1390:1: ( ( RULE_ID ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1391:1: ( RULE_ID )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1391:1: ( RULE_ID )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1392:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_1_22758); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1_2"


    // $ANTLR start "rule__Attribute__DataTypeAssignment_1_3_0"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1401:1: rule__Attribute__DataTypeAssignment_1_3_0 : ( ruleDataType ) ;
    public final void rule__Attribute__DataTypeAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1405:1: ( ( ruleDataType ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1406:1: ( ruleDataType )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1406:1: ( ruleDataType )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1407:1: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getDataTypeDataTypeParserRuleCall_1_3_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__Attribute__DataTypeAssignment_1_3_02789);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDataTypeDataTypeParserRuleCall_1_3_0_0()); 

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
    // $ANTLR end "rule__Attribute__DataTypeAssignment_1_3_0"


    // $ANTLR start "rule__Attribute__DataTypeAssignment_1_3_1_1"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1416:1: rule__Attribute__DataTypeAssignment_1_3_1_1 : ( ( 'object' ) ) ;
    public final void rule__Attribute__DataTypeAssignment_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1420:1: ( ( ( 'object' ) ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1421:1: ( ( 'object' ) )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1421:1: ( ( 'object' ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1422:1: ( 'object' )
            {
             before(grammarAccess.getAttributeAccess().getDataTypeObjectKeyword_1_3_1_1_0()); 
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1423:1: ( 'object' )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1424:1: 'object'
            {
             before(grammarAccess.getAttributeAccess().getDataTypeObjectKeyword_1_3_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Attribute__DataTypeAssignment_1_3_1_12825); 
             after(grammarAccess.getAttributeAccess().getDataTypeObjectKeyword_1_3_1_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getDataTypeObjectKeyword_1_3_1_1_0()); 

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
    // $ANTLR end "rule__Attribute__DataTypeAssignment_1_3_1_1"


    // $ANTLR start "rule__Attribute__DataClassAssignment_1_3_1_2"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1439:1: rule__Attribute__DataClassAssignment_1_3_1_2 : ( ruleFQN ) ;
    public final void rule__Attribute__DataClassAssignment_1_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1443:1: ( ( ruleFQN ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1444:1: ( ruleFQN )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1444:1: ( ruleFQN )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1445:1: ruleFQN
            {
             before(grammarAccess.getAttributeAccess().getDataClassFQNParserRuleCall_1_3_1_2_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Attribute__DataClassAssignment_1_3_1_22864);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDataClassFQNParserRuleCall_1_3_1_2_0()); 

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
    // $ANTLR end "rule__Attribute__DataClassAssignment_1_3_1_2"


    // $ANTLR start "rule__Attribute__DescriptionAssignment_1_4"
    // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1454:1: rule__Attribute__DescriptionAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__Attribute__DescriptionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1458:1: ( ( RULE_STRING ) )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1459:1: ( RULE_STRING )
            {
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1459:1: ( RULE_STRING )
            // ../com.soluvas.saentity.ui/src-gen/com/soluvas/saentity/ui/contentassist/antlr/internal/InternalSaentity.g:1460:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_1_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__DescriptionAssignment_1_42895); 
             after(grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__Attribute__DescriptionAssignment_1_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NameAssignment_in_ruleLabel274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__0_in_rule__Attribute__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DataTypeAssignment_1_3_0_in_rule__Attribute__Alternatives_1_3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1_3_1__0_in_rule__Attribute__Alternatives_1_3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataType__Alternatives533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataType__Alternatives553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataType__Alternatives573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataType__Alternatives593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataType__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DataType__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DataType__Alternatives653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataType__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0705 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__0__Impl736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__1__Impl798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2829 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_2_in_rule__Model__Group__2__Impl859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3889 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_3_in_rule__Model__Group__3__Impl919 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__4__Impl978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01019 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1105 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FQN__Group_1__0__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01262 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__0__Impl1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__1__Impl1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21386 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group__3__Impl1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41508 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__LabelsAssignment_4_in_rule__Entity__Group__4__Impl1540 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__LabelsAssignment_4_in_rule__Entity__Group__4__Impl1552 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51585 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__5__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61647 = new BitSet(new long[]{0x0000000002080010L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group__6__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71709 = new BitSet(new long[]{0x0000000002080010L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_7_in_rule__Entity__Group__7__Impl1739 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81770 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__9_in_rule__Entity__Group__81773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__8__Impl1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__9__Impl_in_rule__Entity__Group__91832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__9__Impl1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__0__Impl_in_rule__Attribute__Group_1__01911 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__1_in_rule__Attribute__Group_1__01914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Attribute__Group_1__0__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__1__Impl_in_rule__Attribute__Group_1__11973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__2_in_rule__Attribute__Group_1__11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Attribute__Group_1__1__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__2__Impl_in_rule__Attribute__Group_1__22035 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__3_in_rule__Attribute__Group_1__22038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_2_in_rule__Attribute__Group_1__2__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__3__Impl_in_rule__Attribute__Group_1__32095 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__4_in_rule__Attribute__Group_1__32098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_1_3_in_rule__Attribute__Group_1__3__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__4__Impl_in_rule__Attribute__Group_1__42155 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__5_in_rule__Attribute__Group_1__42158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DescriptionAssignment_1_4_in_rule__Attribute__Group_1__4__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__5__Impl_in_rule__Attribute__Group_1__52216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Attribute__Group_1__5__Impl2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1_3_1__0__Impl_in_rule__Attribute__Group_1_3_1__02287 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1_3_1__1_in_rule__Attribute__Group_1_3_1__02290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Attribute__Group_1_3_1__0__Impl2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1_3_1__1__Impl_in_rule__Attribute__Group_1_3_1__12349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1_3_1__2_in_rule__Attribute__Group_1_3_1__12352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DataTypeAssignment_1_3_1_1_in_rule__Attribute__Group_1_3_1__1__Impl2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1_3_1__2__Impl_in_rule__Attribute__Group_1_3_1__22409 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1_3_1__3_in_rule__Attribute__Group_1_3_1__22412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DataClassAssignment_1_3_1_2_in_rule__Attribute__Group_1_3_1__2__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1_3_1__3__Impl_in_rule__Attribute__Group_1_3_1__32469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Attribute__Group_1_3_1__3__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_22541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Model__EntitiesAssignment_32572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_22603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Entity__LabelsAssignment_42634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_72665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_1_22758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Attribute__DataTypeAssignment_1_3_02789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Attribute__DataTypeAssignment_1_3_1_12825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Attribute__DataClassAssignment_1_3_1_22864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__DescriptionAssignment_1_42895 = new BitSet(new long[]{0x0000000000000002L});

}