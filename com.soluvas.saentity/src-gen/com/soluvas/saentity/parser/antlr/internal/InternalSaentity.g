/*
* generated by Xtext
*/
grammar InternalSaentity;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.soluvas.saentity.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getLeftParenthesisKeyword_0());
    }
	otherlv_1='package' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getPackageKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_2_0()); 
	    }
		lv_packageName_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"packageName",
        		lv_packageName_2_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
	    }
		lv_entities_3_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"entities",
        		lv_entities_3_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightParenthesisKeyword_4());
    }
)
;





// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFQNRule()); } 
	 iv_ruleFQN=ruleFQN 
	 { $current=$iv_ruleFQN.current.getText(); }  
	 EOF 
;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_0());
    }
	otherlv_1='entity' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='[' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getLabelsLabelParserRuleCall_4_0()); 
	    }
		lv_labels_4_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"labels",
        		lv_labels_4_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5());
    }
	otherlv_6='[' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_7_0()); 
	    }
		lv_attributes_7_0=ruleAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_7_0, 
        		"Attribute");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8=']' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_8());
    }
	otherlv_9=')' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightParenthesisKeyword_9());
    }
)
;





// Entry rule entryRuleLabel
entryRuleLabel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	 iv_ruleLabel=ruleLabel 
	 { $current=$iv_ruleLabel.current; } 
	 EOF 
;

// Rule Label
ruleLabel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLabelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	 iv_ruleAttribute=ruleAttribute 
	 { $current=$iv_ruleAttribute.current; } 
	 EOF 
;

// Rule Attribute
ruleAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
    |(	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_1_0());
    }
	otherlv_2='attr' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAttrKeyword_1_1());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeDataTypeParserRuleCall_1_3_0_0()); 
	    }
		lv_dataType_4_0=ruleDataType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"dataType",
        		lv_dataType_4_0, 
        		"DataType");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(	otherlv_5='(' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_1_3_1_0());
    }
(
(
		lv_dataType_6_0=	'object' 
    {
        newLeafNode(lv_dataType_6_0, grammarAccess.getAttributeAccess().getDataTypeObjectKeyword_1_3_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed($current, "dataType", lv_dataType_6_0, "object");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getDataClassFQNParserRuleCall_1_3_1_2_0()); 
	    }
		lv_dataClass_7_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"dataClass",
        		lv_dataClass_7_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=')' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_1_3_1_3());
    }
))(
(
		lv_description_9_0=RULE_STRING
		{
			newLeafNode(lv_description_9_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_1_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_9_0, 
        		"STRING");
	    }

)
)?	otherlv_10=')' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_1_5());
    }
))
;





// Entry rule entryRuleDataType
entryRuleDataType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); } 
	 iv_ruleDataType=ruleDataType 
	 { $current=$iv_ruleDataType.current.getText(); }  
	 EOF 
;

// Rule DataType
ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='string' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0()); 
    }

    |
	kw='int' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntKeyword_1()); 
    }

    |
	kw='decimal' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getDecimalKeyword_2()); 
    }

    |
	kw='boolean' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_3()); 
    }

    |
	kw='date' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getDateKeyword_4()); 
    }

    |
	kw='int-array' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntArrayKeyword_5()); 
    }

    |
	kw='map' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getMapKeyword_6()); 
    }

    |
	kw='map-array' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getMapArrayKeyword_7()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


