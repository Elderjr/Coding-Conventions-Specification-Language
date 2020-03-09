package org.ccsl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ccsl.xtext.services.CcslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCcslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CompositeRule'", "'{'", "'negated'", "'operator'", "'rules'", "','", "'}'", "'AtomicRule'", "'context'", "'subject'", "'Boolean'", "'Element'", "'as'", "'Context'", "'contextElements'", "'filters'", "'CodeElement'", "'exact'", "'properties'", "'Property'", "'name'", "'value'", "'CompositeFilter'", "'PropertyFilter'", "'targets'", "'('", "')'", "'TemplateFilter'", "'targetTemplate'", "'DefinesMethodFilter'", "'methods'", "'SameNameFilter'", "'ignoreCase'", "'elements'", "'RegexLiteralValueFilter'", "'regex'", "'EqualsNamedElementWithLiterals'", "'names'", "'RegexMatch'", "'TypedStatementFilter'", "'type'", "'SwitchCaseStatementCount'", "'min'", "'max'", "'cases'", "'ImplicityOperandFilter'", "'implicityOperand'", "'operatorExpression'", "'ImplicityContainerFilter'", "'implicityContainer'", "'implicityField'", "'IsKindOfFilter'", "'SuperMethodClosureFilter'", "'superMethod'", "'IsTypeOfFilter'", "'ChildComplexTypeFilter'", "'superComplexType'", "'childComplexType'", "'Method'", "'returnType'", "'statements'", "'params'", "'Statement'", "'Variable'", "'initialValue'", "'DataType'", "'Constructor'", "'NamedElementAccess'", "'from'", "'VariableAccess'", "'elementAccessed'", "'DataTypeAccess'", "'MethodInvocation'", "'args'", "'ControlFlow'", "'condition'", "'Block'", "'SuperMethodInvocation'", "'VarDeclaration'", "'variable'", "'InstanceCreation'", "'Access'", "'ArrayCreation'", "'VarAssignment'", "'assignment'", "'SynchronizedBlock'", "'bodyStatements'", "'key'", "'ObjectType'", "'ParameterizedType'", "'typeParameters'", "'GenericType'", "'superTypes'", "'fields'", "'ArrayType'", "'dimensions'", "'ComplexType'", "'Int'", "'VariableVector'", "'PrimitiveType'", "'StringPrimitiveType'", "'BooleanPrimitiveType'", "'ShortPrimitiveType'", "'IntPrimitiveType'", "'NamedElement'", "'Package'", "'groupedClasses'", "'SwitchCaseBlock'", "'default'", "'OperatorExpression'", "'operands'", "'StringConcatenation'", "'InfixExpression'", "'Assignment'", "'target'", "'BooleanExpression'", "'booleanOperator'", "'ArithmeticExpression'", "'arithmeticOperator'", "'AND'", "'OR'", "'IF_THEN'", "'NOT'", "'EQUAL_TO'", "'NOT_EQUAL_TO'", "'GREATER_THAN'", "'LESS_THAN'", "'GREATER_THAN_OR_EQUAL_TO'", "'LESS_THAN_OR_EQUAL_TO'", "'UNDEFINED'", "'ADDITION'", "'SUBTRACTION'", "'MULTIPLICATION'", "'DIVISION'", "'MODULUS'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalCcslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCcslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCcslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCcsl.g"; }



     	private CcslGrammarAccess grammarAccess;

        public InternalCcslParser(TokenStream input, CcslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Rule";
       	}

       	@Override
       	protected CcslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRule"
    // InternalCcsl.g:65:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalCcsl.g:65:45: (iv_ruleRule= ruleRule EOF )
            // InternalCcsl.g:66:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCcsl.g:72:1: ruleRule returns [EObject current=null] : (this_CompositeRule_0= ruleCompositeRule | this_AtomicRule_1= ruleAtomicRule ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeRule_0 = null;

        EObject this_AtomicRule_1 = null;



        	enterRule();

        try {
            // InternalCcsl.g:78:2: ( (this_CompositeRule_0= ruleCompositeRule | this_AtomicRule_1= ruleAtomicRule ) )
            // InternalCcsl.g:79:2: (this_CompositeRule_0= ruleCompositeRule | this_AtomicRule_1= ruleAtomicRule )
            {
            // InternalCcsl.g:79:2: (this_CompositeRule_0= ruleCompositeRule | this_AtomicRule_1= ruleAtomicRule )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCcsl.g:80:3: this_CompositeRule_0= ruleCompositeRule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getCompositeRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeRule_0=ruleCompositeRule();

                    state._fsp--;


                    			current = this_CompositeRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCcsl.g:89:3: this_AtomicRule_1= ruleAtomicRule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getAtomicRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicRule_1=ruleAtomicRule();

                    state._fsp--;


                    			current = this_AtomicRule_1;
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleElement"
    // InternalCcsl.g:101:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalCcsl.g:101:48: (iv_ruleElement= ruleElement EOF )
            // InternalCcsl.g:102:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalCcsl.g:108:1: ruleElement returns [EObject current=null] : (this_Element_Impl_0= ruleElement_Impl | this_CodeElement_1= ruleCodeElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Element_Impl_0 = null;

        EObject this_CodeElement_1 = null;



        	enterRule();

        try {
            // InternalCcsl.g:114:2: ( (this_Element_Impl_0= ruleElement_Impl | this_CodeElement_1= ruleCodeElement ) )
            // InternalCcsl.g:115:2: (this_Element_Impl_0= ruleElement_Impl | this_CodeElement_1= ruleCodeElement )
            {
            // InternalCcsl.g:115:2: (this_Element_Impl_0= ruleElement_Impl | this_CodeElement_1= ruleCodeElement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCcsl.g:116:3: this_Element_Impl_0= ruleElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Element_Impl_0=ruleElement_Impl();

                    state._fsp--;


                    			current = this_Element_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCcsl.g:125:3: this_CodeElement_1= ruleCodeElement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCodeElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeElement_1=ruleCodeElement();

                    state._fsp--;


                    			current = this_CodeElement_1;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFilter"
    // InternalCcsl.g:137:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalCcsl.g:137:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalCcsl.g:138:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalCcsl.g:144:1: ruleFilter returns [EObject current=null] : (this_CompositeFilter_0= ruleCompositeFilter | this_PropertyFilter_1= rulePropertyFilter | this_TemplateFilter_Impl_2= ruleTemplateFilter_Impl | this_DefinesMethodFilter_3= ruleDefinesMethodFilter | this_SameNameFilter_4= ruleSameNameFilter | this_RegexLiteralValueFilter_5= ruleRegexLiteralValueFilter | this_EqualsNamedElementWithLiterals_6= ruleEqualsNamedElementWithLiterals | this_RegexMatch_7= ruleRegexMatch | this_TypedStatementFilter_8= ruleTypedStatementFilter | this_SwitchCaseStatementCount_9= ruleSwitchCaseStatementCount | this_ImplicityOperandFilter_10= ruleImplicityOperandFilter | this_ImplicityContainerFilter_11= ruleImplicityContainerFilter | this_IsKindOfFilter_12= ruleIsKindOfFilter | this_SuperMethodClosureFilter_13= ruleSuperMethodClosureFilter | this_IsTypeOfFilter_14= ruleIsTypeOfFilter | this_ChildComplexTypeFilter_15= ruleChildComplexTypeFilter ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeFilter_0 = null;

        EObject this_PropertyFilter_1 = null;

        EObject this_TemplateFilter_Impl_2 = null;

        EObject this_DefinesMethodFilter_3 = null;

        EObject this_SameNameFilter_4 = null;

        EObject this_RegexLiteralValueFilter_5 = null;

        EObject this_EqualsNamedElementWithLiterals_6 = null;

        EObject this_RegexMatch_7 = null;

        EObject this_TypedStatementFilter_8 = null;

        EObject this_SwitchCaseStatementCount_9 = null;

        EObject this_ImplicityOperandFilter_10 = null;

        EObject this_ImplicityContainerFilter_11 = null;

        EObject this_IsKindOfFilter_12 = null;

        EObject this_SuperMethodClosureFilter_13 = null;

        EObject this_IsTypeOfFilter_14 = null;

        EObject this_ChildComplexTypeFilter_15 = null;



        	enterRule();

        try {
            // InternalCcsl.g:150:2: ( (this_CompositeFilter_0= ruleCompositeFilter | this_PropertyFilter_1= rulePropertyFilter | this_TemplateFilter_Impl_2= ruleTemplateFilter_Impl | this_DefinesMethodFilter_3= ruleDefinesMethodFilter | this_SameNameFilter_4= ruleSameNameFilter | this_RegexLiteralValueFilter_5= ruleRegexLiteralValueFilter | this_EqualsNamedElementWithLiterals_6= ruleEqualsNamedElementWithLiterals | this_RegexMatch_7= ruleRegexMatch | this_TypedStatementFilter_8= ruleTypedStatementFilter | this_SwitchCaseStatementCount_9= ruleSwitchCaseStatementCount | this_ImplicityOperandFilter_10= ruleImplicityOperandFilter | this_ImplicityContainerFilter_11= ruleImplicityContainerFilter | this_IsKindOfFilter_12= ruleIsKindOfFilter | this_SuperMethodClosureFilter_13= ruleSuperMethodClosureFilter | this_IsTypeOfFilter_14= ruleIsTypeOfFilter | this_ChildComplexTypeFilter_15= ruleChildComplexTypeFilter ) )
            // InternalCcsl.g:151:2: (this_CompositeFilter_0= ruleCompositeFilter | this_PropertyFilter_1= rulePropertyFilter | this_TemplateFilter_Impl_2= ruleTemplateFilter_Impl | this_DefinesMethodFilter_3= ruleDefinesMethodFilter | this_SameNameFilter_4= ruleSameNameFilter | this_RegexLiteralValueFilter_5= ruleRegexLiteralValueFilter | this_EqualsNamedElementWithLiterals_6= ruleEqualsNamedElementWithLiterals | this_RegexMatch_7= ruleRegexMatch | this_TypedStatementFilter_8= ruleTypedStatementFilter | this_SwitchCaseStatementCount_9= ruleSwitchCaseStatementCount | this_ImplicityOperandFilter_10= ruleImplicityOperandFilter | this_ImplicityContainerFilter_11= ruleImplicityContainerFilter | this_IsKindOfFilter_12= ruleIsKindOfFilter | this_SuperMethodClosureFilter_13= ruleSuperMethodClosureFilter | this_IsTypeOfFilter_14= ruleIsTypeOfFilter | this_ChildComplexTypeFilter_15= ruleChildComplexTypeFilter )
            {
            // InternalCcsl.g:151:2: (this_CompositeFilter_0= ruleCompositeFilter | this_PropertyFilter_1= rulePropertyFilter | this_TemplateFilter_Impl_2= ruleTemplateFilter_Impl | this_DefinesMethodFilter_3= ruleDefinesMethodFilter | this_SameNameFilter_4= ruleSameNameFilter | this_RegexLiteralValueFilter_5= ruleRegexLiteralValueFilter | this_EqualsNamedElementWithLiterals_6= ruleEqualsNamedElementWithLiterals | this_RegexMatch_7= ruleRegexMatch | this_TypedStatementFilter_8= ruleTypedStatementFilter | this_SwitchCaseStatementCount_9= ruleSwitchCaseStatementCount | this_ImplicityOperandFilter_10= ruleImplicityOperandFilter | this_ImplicityContainerFilter_11= ruleImplicityContainerFilter | this_IsKindOfFilter_12= ruleIsKindOfFilter | this_SuperMethodClosureFilter_13= ruleSuperMethodClosureFilter | this_IsTypeOfFilter_14= ruleIsTypeOfFilter | this_ChildComplexTypeFilter_15= ruleChildComplexTypeFilter )
            int alt3=16;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            case 42:
                {
                alt3=5;
                }
                break;
            case 45:
                {
                alt3=6;
                }
                break;
            case 47:
                {
                alt3=7;
                }
                break;
            case 49:
                {
                alt3=8;
                }
                break;
            case 50:
                {
                alt3=9;
                }
                break;
            case 52:
                {
                alt3=10;
                }
                break;
            case 56:
                {
                alt3=11;
                }
                break;
            case 59:
                {
                alt3=12;
                }
                break;
            case 62:
                {
                alt3=13;
                }
                break;
            case 63:
                {
                alt3=14;
                }
                break;
            case 65:
                {
                alt3=15;
                }
                break;
            case 66:
                {
                alt3=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCcsl.g:152:3: this_CompositeFilter_0= ruleCompositeFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getCompositeFilterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeFilter_0=ruleCompositeFilter();

                    state._fsp--;


                    			current = this_CompositeFilter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCcsl.g:161:3: this_PropertyFilter_1= rulePropertyFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getPropertyFilterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyFilter_1=rulePropertyFilter();

                    state._fsp--;


                    			current = this_PropertyFilter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCcsl.g:170:3: this_TemplateFilter_Impl_2= ruleTemplateFilter_Impl
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getTemplateFilter_ImplParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemplateFilter_Impl_2=ruleTemplateFilter_Impl();

                    state._fsp--;


                    			current = this_TemplateFilter_Impl_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCcsl.g:179:3: this_DefinesMethodFilter_3= ruleDefinesMethodFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getDefinesMethodFilterParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinesMethodFilter_3=ruleDefinesMethodFilter();

                    state._fsp--;


                    			current = this_DefinesMethodFilter_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCcsl.g:188:3: this_SameNameFilter_4= ruleSameNameFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getSameNameFilterParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SameNameFilter_4=ruleSameNameFilter();

                    state._fsp--;


                    			current = this_SameNameFilter_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCcsl.g:197:3: this_RegexLiteralValueFilter_5= ruleRegexLiteralValueFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getRegexLiteralValueFilterParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegexLiteralValueFilter_5=ruleRegexLiteralValueFilter();

                    state._fsp--;


                    			current = this_RegexLiteralValueFilter_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCcsl.g:206:3: this_EqualsNamedElementWithLiterals_6= ruleEqualsNamedElementWithLiterals
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getEqualsNamedElementWithLiteralsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EqualsNamedElementWithLiterals_6=ruleEqualsNamedElementWithLiterals();

                    state._fsp--;


                    			current = this_EqualsNamedElementWithLiterals_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCcsl.g:215:3: this_RegexMatch_7= ruleRegexMatch
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getRegexMatchParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegexMatch_7=ruleRegexMatch();

                    state._fsp--;


                    			current = this_RegexMatch_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalCcsl.g:224:3: this_TypedStatementFilter_8= ruleTypedStatementFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getTypedStatementFilterParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypedStatementFilter_8=ruleTypedStatementFilter();

                    state._fsp--;


                    			current = this_TypedStatementFilter_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCcsl.g:233:3: this_SwitchCaseStatementCount_9= ruleSwitchCaseStatementCount
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getSwitchCaseStatementCountParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SwitchCaseStatementCount_9=ruleSwitchCaseStatementCount();

                    state._fsp--;


                    			current = this_SwitchCaseStatementCount_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalCcsl.g:242:3: this_ImplicityOperandFilter_10= ruleImplicityOperandFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getImplicityOperandFilterParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplicityOperandFilter_10=ruleImplicityOperandFilter();

                    state._fsp--;


                    			current = this_ImplicityOperandFilter_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalCcsl.g:251:3: this_ImplicityContainerFilter_11= ruleImplicityContainerFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getImplicityContainerFilterParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplicityContainerFilter_11=ruleImplicityContainerFilter();

                    state._fsp--;


                    			current = this_ImplicityContainerFilter_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalCcsl.g:260:3: this_IsKindOfFilter_12= ruleIsKindOfFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getIsKindOfFilterParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsKindOfFilter_12=ruleIsKindOfFilter();

                    state._fsp--;


                    			current = this_IsKindOfFilter_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalCcsl.g:269:3: this_SuperMethodClosureFilter_13= ruleSuperMethodClosureFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getSuperMethodClosureFilterParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_SuperMethodClosureFilter_13=ruleSuperMethodClosureFilter();

                    state._fsp--;


                    			current = this_SuperMethodClosureFilter_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalCcsl.g:278:3: this_IsTypeOfFilter_14= ruleIsTypeOfFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getIsTypeOfFilterParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsTypeOfFilter_14=ruleIsTypeOfFilter();

                    state._fsp--;


                    			current = this_IsTypeOfFilter_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalCcsl.g:287:3: this_ChildComplexTypeFilter_15= ruleChildComplexTypeFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getChildComplexTypeFilterParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChildComplexTypeFilter_15=ruleChildComplexTypeFilter();

                    state._fsp--;


                    			current = this_ChildComplexTypeFilter_15;
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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleEString"
    // InternalCcsl.g:299:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCcsl.g:299:47: (iv_ruleEString= ruleEString EOF )
            // InternalCcsl.g:300:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCcsl.g:306:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalCcsl.g:312:2: (this_ID_0= RULE_ID )
            // InternalCcsl.g:313:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getEStringAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMethod"
    // InternalCcsl.g:323:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCcsl.g:323:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalCcsl.g:324:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalCcsl.g:330:1: ruleMethod returns [EObject current=null] : (this_Method_Impl_0= ruleMethod_Impl | this_Constructor_1= ruleConstructor ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_Method_Impl_0 = null;

        EObject this_Constructor_1 = null;



        	enterRule();

        try {
            // InternalCcsl.g:336:2: ( (this_Method_Impl_0= ruleMethod_Impl | this_Constructor_1= ruleConstructor ) )
            // InternalCcsl.g:337:2: (this_Method_Impl_0= ruleMethod_Impl | this_Constructor_1= ruleConstructor )
            {
            // InternalCcsl.g:337:2: (this_Method_Impl_0= ruleMethod_Impl | this_Constructor_1= ruleConstructor )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==69) ) {
                alt4=1;
            }
            else if ( (LA4_0==77) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCcsl.g:338:3: this_Method_Impl_0= ruleMethod_Impl
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getMethod_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Method_Impl_0=ruleMethod_Impl();

                    state._fsp--;


                    			current = this_Method_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCcsl.g:347:3: this_Constructor_1= ruleConstructor
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getConstructorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constructor_1=ruleConstructor();

                    state._fsp--;


                    			current = this_Constructor_1;
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleStatement"
    // InternalCcsl.g:359:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalCcsl.g:359:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalCcsl.g:360:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCcsl.g:366:1: ruleStatement returns [EObject current=null] : (this_Statement_Impl_0= ruleStatement_Impl | this_NamedElementAccess_1= ruleNamedElementAccess | this_VariableAccess_2= ruleVariableAccess | this_DataTypeAccess_3= ruleDataTypeAccess | this_MethodInvocation_Impl_4= ruleMethodInvocation_Impl | this_ControlFlow_5= ruleControlFlow | this_Block_6= ruleBlock | this_SuperMethodInvocation_7= ruleSuperMethodInvocation | this_VarDeclaration_8= ruleVarDeclaration | this_InstanceCreation_9= ruleInstanceCreation | this_Access_Impl_10= ruleAccess_Impl | this_ArrayCreation_11= ruleArrayCreation | this_VarAssignment_12= ruleVarAssignment | this_SynchronizedBlock_13= ruleSynchronizedBlock ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_Impl_0 = null;

        EObject this_NamedElementAccess_1 = null;

        EObject this_VariableAccess_2 = null;

        EObject this_DataTypeAccess_3 = null;

        EObject this_MethodInvocation_Impl_4 = null;

        EObject this_ControlFlow_5 = null;

        EObject this_Block_6 = null;

        EObject this_SuperMethodInvocation_7 = null;

        EObject this_VarDeclaration_8 = null;

        EObject this_InstanceCreation_9 = null;

        EObject this_Access_Impl_10 = null;

        EObject this_ArrayCreation_11 = null;

        EObject this_VarAssignment_12 = null;

        EObject this_SynchronizedBlock_13 = null;



        	enterRule();

        try {
            // InternalCcsl.g:372:2: ( (this_Statement_Impl_0= ruleStatement_Impl | this_NamedElementAccess_1= ruleNamedElementAccess | this_VariableAccess_2= ruleVariableAccess | this_DataTypeAccess_3= ruleDataTypeAccess | this_MethodInvocation_Impl_4= ruleMethodInvocation_Impl | this_ControlFlow_5= ruleControlFlow | this_Block_6= ruleBlock | this_SuperMethodInvocation_7= ruleSuperMethodInvocation | this_VarDeclaration_8= ruleVarDeclaration | this_InstanceCreation_9= ruleInstanceCreation | this_Access_Impl_10= ruleAccess_Impl | this_ArrayCreation_11= ruleArrayCreation | this_VarAssignment_12= ruleVarAssignment | this_SynchronizedBlock_13= ruleSynchronizedBlock ) )
            // InternalCcsl.g:373:2: (this_Statement_Impl_0= ruleStatement_Impl | this_NamedElementAccess_1= ruleNamedElementAccess | this_VariableAccess_2= ruleVariableAccess | this_DataTypeAccess_3= ruleDataTypeAccess | this_MethodInvocation_Impl_4= ruleMethodInvocation_Impl | this_ControlFlow_5= ruleControlFlow | this_Block_6= ruleBlock | this_SuperMethodInvocation_7= ruleSuperMethodInvocation | this_VarDeclaration_8= ruleVarDeclaration | this_InstanceCreation_9= ruleInstanceCreation | this_Access_Impl_10= ruleAccess_Impl | this_ArrayCreation_11= ruleArrayCreation | this_VarAssignment_12= ruleVarAssignment | this_SynchronizedBlock_13= ruleSynchronizedBlock )
            {
            // InternalCcsl.g:373:2: (this_Statement_Impl_0= ruleStatement_Impl | this_NamedElementAccess_1= ruleNamedElementAccess | this_VariableAccess_2= ruleVariableAccess | this_DataTypeAccess_3= ruleDataTypeAccess | this_MethodInvocation_Impl_4= ruleMethodInvocation_Impl | this_ControlFlow_5= ruleControlFlow | this_Block_6= ruleBlock | this_SuperMethodInvocation_7= ruleSuperMethodInvocation | this_VarDeclaration_8= ruleVarDeclaration | this_InstanceCreation_9= ruleInstanceCreation | this_Access_Impl_10= ruleAccess_Impl | this_ArrayCreation_11= ruleArrayCreation | this_VarAssignment_12= ruleVarAssignment | this_SynchronizedBlock_13= ruleSynchronizedBlock )
            int alt5=14;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt5=1;
                }
                break;
            case 78:
                {
                alt5=2;
                }
                break;
            case 80:
                {
                alt5=3;
                }
                break;
            case 82:
                {
                alt5=4;
                }
                break;
            case 83:
                {
                alt5=5;
                }
                break;
            case 85:
                {
                alt5=6;
                }
                break;
            case 87:
                {
                alt5=7;
                }
                break;
            case 88:
                {
                alt5=8;
                }
                break;
            case 89:
                {
                alt5=9;
                }
                break;
            case 91:
                {
                alt5=10;
                }
                break;
            case 92:
                {
                alt5=11;
                }
                break;
            case 93:
                {
                alt5=12;
                }
                break;
            case 94:
                {
                alt5=13;
                }
                break;
            case 96:
                {
                alt5=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCcsl.g:374:3: this_Statement_Impl_0= ruleStatement_Impl
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getStatement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Statement_Impl_0=ruleStatement_Impl();

                    state._fsp--;


                    			current = this_Statement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCcsl.g:383:3: this_NamedElementAccess_1= ruleNamedElementAccess
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNamedElementAccessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedElementAccess_1=ruleNamedElementAccess();

                    state._fsp--;


                    			current = this_NamedElementAccess_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCcsl.g:392:3: this_VariableAccess_2= ruleVariableAccess
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableAccessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableAccess_2=ruleVariableAccess();

                    state._fsp--;


                    			current = this_VariableAccess_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCcsl.g:401:3: this_DataTypeAccess_3= ruleDataTypeAccess
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDataTypeAccessParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataTypeAccess_3=ruleDataTypeAccess();

                    state._fsp--;


                    			current = this_DataTypeAccess_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCcsl.g:410:3: this_MethodInvocation_Impl_4= ruleMethodInvocation_Impl
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMethodInvocation_ImplParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodInvocation_Impl_4=ruleMethodInvocation_Impl();

                    state._fsp--;


                    			current = this_MethodInvocation_Impl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCcsl.g:419:3: this_ControlFlow_5= ruleControlFlow
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getControlFlowParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlFlow_5=ruleControlFlow();

                    state._fsp--;


                    			current = this_ControlFlow_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCcsl.g:428:3: this_Block_6= ruleBlock
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Block_6=ruleBlock();

                    state._fsp--;


                    			current = this_Block_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCcsl.g:437:3: this_SuperMethodInvocation_7= ruleSuperMethodInvocation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSuperMethodInvocationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SuperMethodInvocation_7=ruleSuperMethodInvocation();

                    state._fsp--;


                    			current = this_SuperMethodInvocation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalCcsl.g:446:3: this_VarDeclaration_8= ruleVarDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarDeclaration_8=ruleVarDeclaration();

                    state._fsp--;


                    			current = this_VarDeclaration_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCcsl.g:455:3: this_InstanceCreation_9= ruleInstanceCreation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getInstanceCreationParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceCreation_9=ruleInstanceCreation();

                    state._fsp--;


                    			current = this_InstanceCreation_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalCcsl.g:464:3: this_Access_Impl_10= ruleAccess_Impl
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAccess_ImplParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Access_Impl_10=ruleAccess_Impl();

                    state._fsp--;


                    			current = this_Access_Impl_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalCcsl.g:473:3: this_ArrayCreation_11= ruleArrayCreation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getArrayCreationParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayCreation_11=ruleArrayCreation();

                    state._fsp--;


                    			current = this_ArrayCreation_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalCcsl.g:482:3: this_VarAssignment_12= ruleVarAssignment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVarAssignmentParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarAssignment_12=ruleVarAssignment();

                    state._fsp--;


                    			current = this_VarAssignment_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalCcsl.g:491:3: this_SynchronizedBlock_13= ruleSynchronizedBlock
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSynchronizedBlockParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_SynchronizedBlock_13=ruleSynchronizedBlock();

                    state._fsp--;


                    			current = this_SynchronizedBlock_13;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariable"
    // InternalCcsl.g:503:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalCcsl.g:503:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalCcsl.g:504:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalCcsl.g:510:1: ruleVariable returns [EObject current=null] : (this_Variable_Impl_0= ruleVariable_Impl | this_VariableVector_1= ruleVariableVector ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_Impl_0 = null;

        EObject this_VariableVector_1 = null;



        	enterRule();

        try {
            // InternalCcsl.g:516:2: ( (this_Variable_Impl_0= ruleVariable_Impl | this_VariableVector_1= ruleVariableVector ) )
            // InternalCcsl.g:517:2: (this_Variable_Impl_0= ruleVariable_Impl | this_VariableVector_1= ruleVariableVector )
            {
            // InternalCcsl.g:517:2: (this_Variable_Impl_0= ruleVariable_Impl | this_VariableVector_1= ruleVariableVector )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==74) ) {
                alt6=1;
            }
            else if ( (LA6_0==109) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCcsl.g:518:3: this_Variable_Impl_0= ruleVariable_Impl
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getVariable_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_Impl_0=ruleVariable_Impl();

                    state._fsp--;


                    			current = this_Variable_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCcsl.g:527:3: this_VariableVector_1= ruleVariableVector
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getVariableVectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableVector_1=ruleVariableVector();

                    state._fsp--;


                    			current = this_VariableVector_1;
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCompositeRule"
    // InternalCcsl.g:539:1: entryRuleCompositeRule returns [EObject current=null] : iv_ruleCompositeRule= ruleCompositeRule EOF ;
    public final EObject entryRuleCompositeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeRule = null;


        try {
            // InternalCcsl.g:539:54: (iv_ruleCompositeRule= ruleCompositeRule EOF )
            // InternalCcsl.g:540:2: iv_ruleCompositeRule= ruleCompositeRule EOF
            {
             newCompositeNode(grammarAccess.getCompositeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeRule=ruleCompositeRule();

            state._fsp--;

             current =iv_ruleCompositeRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeRule"


    // $ANTLR start "ruleCompositeRule"
    // InternalCcsl.g:546:1: ruleCompositeRule returns [EObject current=null] : (otherlv_0= 'CompositeRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'rules' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) ) (otherlv_9= ',' ( (lv_rules_10_0= ruleRule ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleCompositeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rules_8_0 = null;

        EObject lv_rules_10_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:552:2: ( (otherlv_0= 'CompositeRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'rules' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) ) (otherlv_9= ',' ( (lv_rules_10_0= ruleRule ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalCcsl.g:553:2: (otherlv_0= 'CompositeRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'rules' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) ) (otherlv_9= ',' ( (lv_rules_10_0= ruleRule ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalCcsl.g:553:2: (otherlv_0= 'CompositeRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'rules' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) ) (otherlv_9= ',' ( (lv_rules_10_0= ruleRule ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalCcsl.g:554:3: otherlv_0= 'CompositeRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'rules' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) ) (otherlv_9= ',' ( (lv_rules_10_0= ruleRule ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeRuleAccess().getCompositeRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:562:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCcsl.g:563:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositeRuleAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:567:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:568:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:568:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:569:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getCompositeRuleAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeRuleRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:587:3: (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCcsl.g:588:4: otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeRuleAccess().getOperatorKeyword_3_0());
                    			
                    // InternalCcsl.g:592:4: ( (lv_operator_5_0= ruleLogicOperator ) )
                    // InternalCcsl.g:593:5: (lv_operator_5_0= ruleLogicOperator )
                    {
                    // InternalCcsl.g:593:5: (lv_operator_5_0= ruleLogicOperator )
                    // InternalCcsl.g:594:6: lv_operator_5_0= ruleLogicOperator
                    {

                    						newCompositeNode(grammarAccess.getCompositeRuleAccess().getOperatorLogicOperatorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_operator_5_0=ruleLogicOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeRuleRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_5_0,
                    							"org.ccsl.xtext.Ccsl.LogicOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCompositeRuleAccess().getRulesKeyword_4());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositeRuleAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalCcsl.g:620:3: ( (lv_rules_8_0= ruleRule ) )
            // InternalCcsl.g:621:4: (lv_rules_8_0= ruleRule )
            {
            // InternalCcsl.g:621:4: (lv_rules_8_0= ruleRule )
            // InternalCcsl.g:622:5: lv_rules_8_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getCompositeRuleAccess().getRulesRuleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_rules_8_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeRuleRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_8_0,
            						"org.ccsl.xtext.Ccsl.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:639:3: (otherlv_9= ',' ( (lv_rules_10_0= ruleRule ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCcsl.g:640:4: otherlv_9= ',' ( (lv_rules_10_0= ruleRule ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCompositeRuleAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCcsl.g:644:4: ( (lv_rules_10_0= ruleRule ) )
            	    // InternalCcsl.g:645:5: (lv_rules_10_0= ruleRule )
            	    {
            	    // InternalCcsl.g:645:5: (lv_rules_10_0= ruleRule )
            	    // InternalCcsl.g:646:6: lv_rules_10_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeRuleAccess().getRulesRuleParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_rules_10_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_10_0,
            	    							"org.ccsl.xtext.Ccsl.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositeRuleAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCompositeRuleAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCompositeRule"


    // $ANTLR start "entryRuleAtomicRule"
    // InternalCcsl.g:676:1: entryRuleAtomicRule returns [EObject current=null] : iv_ruleAtomicRule= ruleAtomicRule EOF ;
    public final EObject entryRuleAtomicRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRule = null;


        try {
            // InternalCcsl.g:676:51: (iv_ruleAtomicRule= ruleAtomicRule EOF )
            // InternalCcsl.g:677:2: iv_ruleAtomicRule= ruleAtomicRule EOF
            {
             newCompositeNode(grammarAccess.getAtomicRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicRule=ruleAtomicRule();

            state._fsp--;

             current =iv_ruleAtomicRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomicRule"


    // $ANTLR start "ruleAtomicRule"
    // InternalCcsl.g:683:1: ruleAtomicRule returns [EObject current=null] : (otherlv_0= 'AtomicRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'context' ( (lv_context_5_0= ruleContext ) ) otherlv_6= 'subject' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
    public final EObject ruleAtomicRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_context_5_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:689:2: ( (otherlv_0= 'AtomicRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'context' ( (lv_context_5_0= ruleContext ) ) otherlv_6= 'subject' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalCcsl.g:690:2: (otherlv_0= 'AtomicRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'context' ( (lv_context_5_0= ruleContext ) ) otherlv_6= 'subject' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalCcsl.g:690:2: (otherlv_0= 'AtomicRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'context' ( (lv_context_5_0= ruleContext ) ) otherlv_6= 'subject' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalCcsl.g:691:3: otherlv_0= 'AtomicRule' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'context' ( (lv_context_5_0= ruleContext ) ) otherlv_6= 'subject' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicRuleAccess().getAtomicRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:699:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCcsl.g:700:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicRuleAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:704:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:705:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:705:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:706:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getAtomicRuleAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRuleRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getAtomicRuleAccess().getContextKeyword_3());
            		
            // InternalCcsl.g:728:3: ( (lv_context_5_0= ruleContext ) )
            // InternalCcsl.g:729:4: (lv_context_5_0= ruleContext )
            {
            // InternalCcsl.g:729:4: (lv_context_5_0= ruleContext )
            // InternalCcsl.g:730:5: lv_context_5_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getAtomicRuleAccess().getContextContextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_context_5_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicRuleRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_5_0,
            						"org.ccsl.xtext.Ccsl.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getAtomicRuleAccess().getSubjectKeyword_5());
            		
            // InternalCcsl.g:751:3: ( (otherlv_7= RULE_ID ) )
            // InternalCcsl.g:752:4: (otherlv_7= RULE_ID )
            {
            // InternalCcsl.g:752:4: (otherlv_7= RULE_ID )
            // InternalCcsl.g:753:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicRuleRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_7, grammarAccess.getAtomicRuleAccess().getSubjectElementCrossReference_6_0());
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAtomicRuleAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAtomicRule"


    // $ANTLR start "entryRuleBoolean"
    // InternalCcsl.g:772:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalCcsl.g:772:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalCcsl.g:773:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalCcsl.g:779:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCcsl.g:785:2: (kw= 'Boolean' )
            // InternalCcsl.g:786:2: kw= 'Boolean'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBooleanAccess().getBooleanKeyword());
            	

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleElement_Impl"
    // InternalCcsl.g:794:1: entryRuleElement_Impl returns [EObject current=null] : iv_ruleElement_Impl= ruleElement_Impl EOF ;
    public final EObject entryRuleElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement_Impl = null;


        try {
            // InternalCcsl.g:794:53: (iv_ruleElement_Impl= ruleElement_Impl EOF )
            // InternalCcsl.g:795:2: iv_ruleElement_Impl= ruleElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement_Impl=ruleElement_Impl();

            state._fsp--;

             current =iv_ruleElement_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement_Impl"


    // $ANTLR start "ruleElement_Impl"
    // InternalCcsl.g:801:1: ruleElement_Impl returns [EObject current=null] : ( () otherlv_1= 'Element' otherlv_2= 'as' ( (lv_uniqueName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uniqueName_3_0=null;


        	enterRule();

        try {
            // InternalCcsl.g:807:2: ( ( () otherlv_1= 'Element' otherlv_2= 'as' ( (lv_uniqueName_3_0= RULE_ID ) ) ) )
            // InternalCcsl.g:808:2: ( () otherlv_1= 'Element' otherlv_2= 'as' ( (lv_uniqueName_3_0= RULE_ID ) ) )
            {
            // InternalCcsl.g:808:2: ( () otherlv_1= 'Element' otherlv_2= 'as' ( (lv_uniqueName_3_0= RULE_ID ) ) )
            // InternalCcsl.g:809:3: () otherlv_1= 'Element' otherlv_2= 'as' ( (lv_uniqueName_3_0= RULE_ID ) )
            {
            // InternalCcsl.g:809:3: ()
            // InternalCcsl.g:810:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElement_ImplAccess().getElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getElement_ImplAccess().getElementKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getElement_ImplAccess().getAsKeyword_2());
            		
            // InternalCcsl.g:824:3: ( (lv_uniqueName_3_0= RULE_ID ) )
            // InternalCcsl.g:825:4: (lv_uniqueName_3_0= RULE_ID )
            {
            // InternalCcsl.g:825:4: (lv_uniqueName_3_0= RULE_ID )
            // InternalCcsl.g:826:5: lv_uniqueName_3_0= RULE_ID
            {
            lv_uniqueName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_uniqueName_3_0, grammarAccess.getElement_ImplAccess().getUniqueNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElement_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uniqueName",
            						lv_uniqueName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleElement_Impl"


    // $ANTLR start "entryRuleContext"
    // InternalCcsl.g:846:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalCcsl.g:846:48: (iv_ruleContext= ruleContext EOF )
            // InternalCcsl.g:847:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalCcsl.g:853:1: ruleContext returns [EObject current=null] : ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'contextElements' otherlv_4= '{' ( (lv_contextElements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_contextElements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'filters' otherlv_10= '{' ( (lv_filters_11_0= ruleFilter ) ) (otherlv_12= ',' ( (lv_filters_13_0= ruleFilter ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_contextElements_5_0 = null;

        EObject lv_contextElements_7_0 = null;

        EObject lv_filters_11_0 = null;

        EObject lv_filters_13_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:859:2: ( ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'contextElements' otherlv_4= '{' ( (lv_contextElements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_contextElements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'filters' otherlv_10= '{' ( (lv_filters_11_0= ruleFilter ) ) (otherlv_12= ',' ( (lv_filters_13_0= ruleFilter ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalCcsl.g:860:2: ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'contextElements' otherlv_4= '{' ( (lv_contextElements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_contextElements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'filters' otherlv_10= '{' ( (lv_filters_11_0= ruleFilter ) ) (otherlv_12= ',' ( (lv_filters_13_0= ruleFilter ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalCcsl.g:860:2: ( () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'contextElements' otherlv_4= '{' ( (lv_contextElements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_contextElements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'filters' otherlv_10= '{' ( (lv_filters_11_0= ruleFilter ) ) (otherlv_12= ',' ( (lv_filters_13_0= ruleFilter ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalCcsl.g:861:3: () otherlv_1= 'Context' otherlv_2= '{' (otherlv_3= 'contextElements' otherlv_4= '{' ( (lv_contextElements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_contextElements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'filters' otherlv_10= '{' ( (lv_filters_11_0= ruleFilter ) ) (otherlv_12= ',' ( (lv_filters_13_0= ruleFilter ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalCcsl.g:861:3: ()
            // InternalCcsl.g:862:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContextAccess().getContextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getContextKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCcsl.g:876:3: (otherlv_3= 'contextElements' otherlv_4= '{' ( (lv_contextElements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_contextElements_7_0= ruleElement ) ) )* otherlv_8= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCcsl.g:877:4: otherlv_3= 'contextElements' otherlv_4= '{' ( (lv_contextElements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_contextElements_7_0= ruleElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getContextAccess().getContextElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCcsl.g:885:4: ( (lv_contextElements_5_0= ruleElement ) )
                    // InternalCcsl.g:886:5: (lv_contextElements_5_0= ruleElement )
                    {
                    // InternalCcsl.g:886:5: (lv_contextElements_5_0= ruleElement )
                    // InternalCcsl.g:887:6: lv_contextElements_5_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getContextElementsElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_contextElements_5_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextRule());
                    						}
                    						add(
                    							current,
                    							"contextElements",
                    							lv_contextElements_5_0,
                    							"org.ccsl.xtext.Ccsl.Element");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:904:4: (otherlv_6= ',' ( (lv_contextElements_7_0= ruleElement ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCcsl.g:905:5: otherlv_6= ',' ( (lv_contextElements_7_0= ruleElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getContextAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCcsl.g:909:5: ( (lv_contextElements_7_0= ruleElement ) )
                    	    // InternalCcsl.g:910:6: (lv_contextElements_7_0= ruleElement )
                    	    {
                    	    // InternalCcsl.g:910:6: (lv_contextElements_7_0= ruleElement )
                    	    // InternalCcsl.g:911:7: lv_contextElements_7_0= ruleElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getContextAccess().getContextElementsElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_contextElements_7_0=ruleElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contextElements",
                    	    								lv_contextElements_7_0,
                    	    								"org.ccsl.xtext.Ccsl.Element");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:934:3: (otherlv_9= 'filters' otherlv_10= '{' ( (lv_filters_11_0= ruleFilter ) ) (otherlv_12= ',' ( (lv_filters_13_0= ruleFilter ) ) )* otherlv_14= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCcsl.g:935:4: otherlv_9= 'filters' otherlv_10= '{' ( (lv_filters_11_0= ruleFilter ) ) (otherlv_12= ',' ( (lv_filters_13_0= ruleFilter ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getContextAccess().getFiltersKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCcsl.g:943:4: ( (lv_filters_11_0= ruleFilter ) )
                    // InternalCcsl.g:944:5: (lv_filters_11_0= ruleFilter )
                    {
                    // InternalCcsl.g:944:5: (lv_filters_11_0= ruleFilter )
                    // InternalCcsl.g:945:6: lv_filters_11_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getFiltersFilterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_filters_11_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextRule());
                    						}
                    						add(
                    							current,
                    							"filters",
                    							lv_filters_11_0,
                    							"org.ccsl.xtext.Ccsl.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:962:4: (otherlv_12= ',' ( (lv_filters_13_0= ruleFilter ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCcsl.g:963:5: otherlv_12= ',' ( (lv_filters_13_0= ruleFilter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_21); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getContextAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCcsl.g:967:5: ( (lv_filters_13_0= ruleFilter ) )
                    	    // InternalCcsl.g:968:6: (lv_filters_13_0= ruleFilter )
                    	    {
                    	    // InternalCcsl.g:968:6: (lv_filters_13_0= ruleFilter )
                    	    // InternalCcsl.g:969:7: lv_filters_13_0= ruleFilter
                    	    {

                    	    							newCompositeNode(grammarAccess.getContextAccess().getFiltersFilterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_filters_13_0=ruleFilter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"filters",
                    	    								lv_filters_13_0,
                    	    								"org.ccsl.xtext.Ccsl.Filter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleString0"
    // InternalCcsl.g:1000:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalCcsl.g:1000:47: (iv_ruleString0= ruleString0 EOF )
            // InternalCcsl.g:1001:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalCcsl.g:1007:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalCcsl.g:1013:2: (this_ID_0= RULE_ID )
            // InternalCcsl.g:1014:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getString0Access().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleCodeElement"
    // InternalCcsl.g:1024:1: entryRuleCodeElement returns [EObject current=null] : iv_ruleCodeElement= ruleCodeElement EOF ;
    public final EObject entryRuleCodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeElement = null;


        try {
            // InternalCcsl.g:1024:52: (iv_ruleCodeElement= ruleCodeElement EOF )
            // InternalCcsl.g:1025:2: iv_ruleCodeElement= ruleCodeElement EOF
            {
             newCompositeNode(grammarAccess.getCodeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeElement=ruleCodeElement();

            state._fsp--;

             current =iv_ruleCodeElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCodeElement"


    // $ANTLR start "ruleCodeElement"
    // InternalCcsl.g:1031:1: ruleCodeElement returns [EObject current=null] : ( () otherlv_1= 'CodeElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleCodeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:1037:2: ( ( () otherlv_1= 'CodeElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalCcsl.g:1038:2: ( () otherlv_1= 'CodeElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalCcsl.g:1038:2: ( () otherlv_1= 'CodeElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalCcsl.g:1039:3: () otherlv_1= 'CodeElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalCcsl.g:1039:3: ()
            // InternalCcsl.g:1040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodeElementAccess().getCodeElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCodeElementAccess().getCodeElementKeyword_1());
            		
            // InternalCcsl.g:1050:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:1051:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:1051:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:1052:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getCodeElementAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodeElementRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getCodeElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:1073:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCcsl.g:1074:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getCodeElementAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:1078:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:1079:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:1079:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:1080:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getCodeElementAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCodeElementRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:1098:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCcsl.g:1099:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCodeElementAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getCodeElementAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:1107:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:1108:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:1108:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:1109:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getCodeElementAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCodeElementRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:1126:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCcsl.g:1127:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCodeElementAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:1131:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:1132:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:1132:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:1133:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getCodeElementAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCodeElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getCodeElementAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCodeElementAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCodeElement"


    // $ANTLR start "entryRuleProperty"
    // InternalCcsl.g:1164:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalCcsl.g:1164:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalCcsl.g:1165:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalCcsl.g:1171:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= 'Property' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:1177:2: ( ( () otherlv_1= 'Property' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}' ) )
            // InternalCcsl.g:1178:2: ( () otherlv_1= 'Property' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}' )
            {
            // InternalCcsl.g:1178:2: ( () otherlv_1= 'Property' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}' )
            // InternalCcsl.g:1179:3: () otherlv_1= 'Property' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )? otherlv_7= '}'
            {
            // InternalCcsl.g:1179:3: ()
            // InternalCcsl.g:1180:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCcsl.g:1194:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCcsl.g:1195:4: otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getNameKeyword_3_0());
                    			
                    // InternalCcsl.g:1199:4: ( (lv_name_4_0= ruleString0 ) )
                    // InternalCcsl.g:1200:5: (lv_name_4_0= ruleString0 )
                    {
                    // InternalCcsl.g:1200:5: (lv_name_4_0= ruleString0 )
                    // InternalCcsl.g:1201:6: lv_name_4_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getNameString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_name_4_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:1219:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCcsl.g:1220:4: otherlv_5= 'value' ( (lv_value_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getValueKeyword_4_0());
                    			
                    // InternalCcsl.g:1224:4: ( (lv_value_6_0= ruleString0 ) )
                    // InternalCcsl.g:1225:5: (lv_value_6_0= ruleString0 )
                    {
                    // InternalCcsl.g:1225:5: (lv_value_6_0= ruleString0 )
                    // InternalCcsl.g:1226:6: lv_value_6_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getValueString0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_6_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleCompositeFilter"
    // InternalCcsl.g:1252:1: entryRuleCompositeFilter returns [EObject current=null] : iv_ruleCompositeFilter= ruleCompositeFilter EOF ;
    public final EObject entryRuleCompositeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeFilter = null;


        try {
            // InternalCcsl.g:1252:56: (iv_ruleCompositeFilter= ruleCompositeFilter EOF )
            // InternalCcsl.g:1253:2: iv_ruleCompositeFilter= ruleCompositeFilter EOF
            {
             newCompositeNode(grammarAccess.getCompositeFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeFilter=ruleCompositeFilter();

            state._fsp--;

             current =iv_ruleCompositeFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeFilter"


    // $ANTLR start "ruleCompositeFilter"
    // InternalCcsl.g:1259:1: ruleCompositeFilter returns [EObject current=null] : (otherlv_0= 'CompositeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'filters' otherlv_7= '{' ( (lv_filters_8_0= ruleFilter ) ) (otherlv_9= ',' ( (lv_filters_10_0= ruleFilter ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleCompositeFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_filters_8_0 = null;

        EObject lv_filters_10_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:1265:2: ( (otherlv_0= 'CompositeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'filters' otherlv_7= '{' ( (lv_filters_8_0= ruleFilter ) ) (otherlv_9= ',' ( (lv_filters_10_0= ruleFilter ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalCcsl.g:1266:2: (otherlv_0= 'CompositeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'filters' otherlv_7= '{' ( (lv_filters_8_0= ruleFilter ) ) (otherlv_9= ',' ( (lv_filters_10_0= ruleFilter ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalCcsl.g:1266:2: (otherlv_0= 'CompositeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'filters' otherlv_7= '{' ( (lv_filters_8_0= ruleFilter ) ) (otherlv_9= ',' ( (lv_filters_10_0= ruleFilter ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalCcsl.g:1267:3: otherlv_0= 'CompositeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )? otherlv_6= 'filters' otherlv_7= '{' ( (lv_filters_8_0= ruleFilter ) ) (otherlv_9= ',' ( (lv_filters_10_0= ruleFilter ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeFilterAccess().getCompositeFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:1275:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCcsl.g:1276:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositeFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:1280:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:1281:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:1281:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:1282:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getCompositeFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:1300:3: (otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCcsl.g:1301:4: otherlv_4= 'operator' ( (lv_operator_5_0= ruleLogicOperator ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeFilterAccess().getOperatorKeyword_3_0());
                    			
                    // InternalCcsl.g:1305:4: ( (lv_operator_5_0= ruleLogicOperator ) )
                    // InternalCcsl.g:1306:5: (lv_operator_5_0= ruleLogicOperator )
                    {
                    // InternalCcsl.g:1306:5: (lv_operator_5_0= ruleLogicOperator )
                    // InternalCcsl.g:1307:6: lv_operator_5_0= ruleLogicOperator
                    {

                    						newCompositeNode(grammarAccess.getCompositeFilterAccess().getOperatorLogicOperatorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_operator_5_0=ruleLogicOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeFilterRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_5_0,
                    							"org.ccsl.xtext.Ccsl.LogicOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCompositeFilterAccess().getFiltersKeyword_4());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositeFilterAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalCcsl.g:1333:3: ( (lv_filters_8_0= ruleFilter ) )
            // InternalCcsl.g:1334:4: (lv_filters_8_0= ruleFilter )
            {
            // InternalCcsl.g:1334:4: (lv_filters_8_0= ruleFilter )
            // InternalCcsl.g:1335:5: lv_filters_8_0= ruleFilter
            {

            					newCompositeNode(grammarAccess.getCompositeFilterAccess().getFiltersFilterParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_filters_8_0=ruleFilter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeFilterRule());
            					}
            					add(
            						current,
            						"filters",
            						lv_filters_8_0,
            						"org.ccsl.xtext.Ccsl.Filter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:1352:3: (otherlv_9= ',' ( (lv_filters_10_0= ruleFilter ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCcsl.g:1353:4: otherlv_9= ',' ( (lv_filters_10_0= ruleFilter ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_21); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCompositeFilterAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCcsl.g:1357:4: ( (lv_filters_10_0= ruleFilter ) )
            	    // InternalCcsl.g:1358:5: (lv_filters_10_0= ruleFilter )
            	    {
            	    // InternalCcsl.g:1358:5: (lv_filters_10_0= ruleFilter )
            	    // InternalCcsl.g:1359:6: lv_filters_10_0= ruleFilter
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeFilterAccess().getFiltersFilterParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_filters_10_0=ruleFilter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeFilterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"filters",
            	    							lv_filters_10_0,
            	    							"org.ccsl.xtext.Ccsl.Filter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositeFilterAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCompositeFilterAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCompositeFilter"


    // $ANTLR start "entryRulePropertyFilter"
    // InternalCcsl.g:1389:1: entryRulePropertyFilter returns [EObject current=null] : iv_rulePropertyFilter= rulePropertyFilter EOF ;
    public final EObject entryRulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFilter = null;


        try {
            // InternalCcsl.g:1389:55: (iv_rulePropertyFilter= rulePropertyFilter EOF )
            // InternalCcsl.g:1390:2: iv_rulePropertyFilter= rulePropertyFilter EOF
            {
             newCompositeNode(grammarAccess.getPropertyFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyFilter=rulePropertyFilter();

            state._fsp--;

             current =iv_rulePropertyFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyFilter"


    // $ANTLR start "rulePropertyFilter"
    // InternalCcsl.g:1396:1: rulePropertyFilter returns [EObject current=null] : (otherlv_0= 'PropertyFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject rulePropertyFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_properties_14_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:1402:2: ( (otherlv_0= 'PropertyFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalCcsl.g:1403:2: (otherlv_0= 'PropertyFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalCcsl.g:1403:2: (otherlv_0= 'PropertyFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalCcsl.g:1404:3: otherlv_0= 'PropertyFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyFilterAccess().getPropertyFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:1412:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCcsl.g:1413:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getPropertyFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:1417:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:1418:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:1418:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:1419:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getPropertyFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyFilterAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyFilterAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:1445:3: ( ( ruleEString ) )
            // InternalCcsl.g:1446:4: ( ruleEString )
            {
            // InternalCcsl.g:1446:4: ( ruleEString )
            // InternalCcsl.g:1447:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyFilterAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:1461:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCcsl.g:1462:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPropertyFilterAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:1466:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:1467:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:1467:5: ( ruleEString )
            	    // InternalCcsl.g:1468:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPropertyFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPropertyFilterAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getPropertyFilterAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getPropertyFilterAccess().getPropertiesKeyword_8());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getPropertyFilterAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalCcsl.g:1495:3: ( (lv_properties_12_0= ruleProperty ) )
            // InternalCcsl.g:1496:4: (lv_properties_12_0= ruleProperty )
            {
            // InternalCcsl.g:1496:4: (lv_properties_12_0= ruleProperty )
            // InternalCcsl.g:1497:5: lv_properties_12_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getPropertyFilterAccess().getPropertiesPropertyParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_properties_12_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyFilterRule());
            					}
            					add(
            						current,
            						"properties",
            						lv_properties_12_0,
            						"org.ccsl.xtext.Ccsl.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:1514:3: (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCcsl.g:1515:4: otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FOLLOW_24); 

            	    				newLeafNode(otherlv_13, grammarAccess.getPropertyFilterAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalCcsl.g:1519:4: ( (lv_properties_14_0= ruleProperty ) )
            	    // InternalCcsl.g:1520:5: (lv_properties_14_0= ruleProperty )
            	    {
            	    // InternalCcsl.g:1520:5: (lv_properties_14_0= ruleProperty )
            	    // InternalCcsl.g:1521:6: lv_properties_14_0= ruleProperty
            	    {

            	    						newCompositeNode(grammarAccess.getPropertyFilterAccess().getPropertiesPropertyParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_properties_14_0=ruleProperty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPropertyFilterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"properties",
            	    							lv_properties_14_0,
            	    							"org.ccsl.xtext.Ccsl.Property");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_15=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getPropertyFilterAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getPropertyFilterAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "rulePropertyFilter"


    // $ANTLR start "entryRuleTemplateFilter_Impl"
    // InternalCcsl.g:1551:1: entryRuleTemplateFilter_Impl returns [EObject current=null] : iv_ruleTemplateFilter_Impl= ruleTemplateFilter_Impl EOF ;
    public final EObject entryRuleTemplateFilter_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateFilter_Impl = null;


        try {
            // InternalCcsl.g:1551:60: (iv_ruleTemplateFilter_Impl= ruleTemplateFilter_Impl EOF )
            // InternalCcsl.g:1552:2: iv_ruleTemplateFilter_Impl= ruleTemplateFilter_Impl EOF
            {
             newCompositeNode(grammarAccess.getTemplateFilter_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateFilter_Impl=ruleTemplateFilter_Impl();

            state._fsp--;

             current =iv_ruleTemplateFilter_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTemplateFilter_Impl"


    // $ANTLR start "ruleTemplateFilter_Impl"
    // InternalCcsl.g:1558:1: ruleTemplateFilter_Impl returns [EObject current=null] : (otherlv_0= 'TemplateFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' ) ;
    public final EObject ruleTemplateFilter_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_context_13_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:1564:2: ( (otherlv_0= 'TemplateFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' ) )
            // InternalCcsl.g:1565:2: (otherlv_0= 'TemplateFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' )
            {
            // InternalCcsl.g:1565:2: (otherlv_0= 'TemplateFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' )
            // InternalCcsl.g:1566:3: otherlv_0= 'TemplateFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateFilter_ImplAccess().getTemplateFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getTemplateFilter_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:1574:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCcsl.g:1575:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getTemplateFilter_ImplAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:1579:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:1580:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:1580:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:1581:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getTemplateFilter_ImplAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemplateFilter_ImplRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getTemplateFilter_ImplAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getTemplateFilter_ImplAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:1607:3: ( ( ruleEString ) )
            // InternalCcsl.g:1608:4: ( ruleEString )
            {
            // InternalCcsl.g:1608:4: ( ruleEString )
            // InternalCcsl.g:1609:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateFilter_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTemplateFilter_ImplAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:1623:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCcsl.g:1624:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getTemplateFilter_ImplAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:1628:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:1629:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:1629:5: ( ruleEString )
            	    // InternalCcsl.g:1630:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTemplateFilter_ImplRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTemplateFilter_ImplAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_9, grammarAccess.getTemplateFilter_ImplAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getTemplateFilter_ImplAccess().getTargetTemplateKeyword_8());
            		
            // InternalCcsl.g:1653:3: ( ( ruleEString ) )
            // InternalCcsl.g:1654:4: ( ruleEString )
            {
            // InternalCcsl.g:1654:4: ( ruleEString )
            // InternalCcsl.g:1655:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateFilter_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTemplateFilter_ImplAccess().getTargetTemplateElementCrossReference_9_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getTemplateFilter_ImplAccess().getContextKeyword_10());
            		
            // InternalCcsl.g:1673:3: ( (lv_context_13_0= ruleContext ) )
            // InternalCcsl.g:1674:4: (lv_context_13_0= ruleContext )
            {
            // InternalCcsl.g:1674:4: (lv_context_13_0= ruleContext )
            // InternalCcsl.g:1675:5: lv_context_13_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getTemplateFilter_ImplAccess().getContextContextParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_context_13_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemplateFilter_ImplRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_13_0,
            						"org.ccsl.xtext.Ccsl.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTemplateFilter_ImplAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleTemplateFilter_Impl"


    // $ANTLR start "entryRuleDefinesMethodFilter"
    // InternalCcsl.g:1700:1: entryRuleDefinesMethodFilter returns [EObject current=null] : iv_ruleDefinesMethodFilter= ruleDefinesMethodFilter EOF ;
    public final EObject entryRuleDefinesMethodFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinesMethodFilter = null;


        try {
            // InternalCcsl.g:1700:60: (iv_ruleDefinesMethodFilter= ruleDefinesMethodFilter EOF )
            // InternalCcsl.g:1701:2: iv_ruleDefinesMethodFilter= ruleDefinesMethodFilter EOF
            {
             newCompositeNode(grammarAccess.getDefinesMethodFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinesMethodFilter=ruleDefinesMethodFilter();

            state._fsp--;

             current =iv_ruleDefinesMethodFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefinesMethodFilter"


    // $ANTLR start "ruleDefinesMethodFilter"
    // InternalCcsl.g:1707:1: ruleDefinesMethodFilter returns [EObject current=null] : (otherlv_0= 'DefinesMethodFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleDefinesMethodFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_methods_12_0 = null;

        EObject lv_methods_14_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:1713:2: ( (otherlv_0= 'DefinesMethodFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalCcsl.g:1714:2: (otherlv_0= 'DefinesMethodFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalCcsl.g:1714:2: (otherlv_0= 'DefinesMethodFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalCcsl.g:1715:3: otherlv_0= 'DefinesMethodFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'methods' otherlv_11= '{' ( (lv_methods_12_0= ruleMethod ) ) (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinesMethodFilterAccess().getDefinesMethodFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinesMethodFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:1723:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCcsl.g:1724:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefinesMethodFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:1728:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:1729:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:1729:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:1730:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getDefinesMethodFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinesMethodFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getDefinesMethodFilterAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getDefinesMethodFilterAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:1756:3: ( ( ruleEString ) )
            // InternalCcsl.g:1757:4: ( ruleEString )
            {
            // InternalCcsl.g:1757:4: ( ruleEString )
            // InternalCcsl.g:1758:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinesMethodFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDefinesMethodFilterAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:1772:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCcsl.g:1773:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDefinesMethodFilterAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:1777:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:1778:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:1778:5: ( ruleEString )
            	    // InternalCcsl.g:1779:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDefinesMethodFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDefinesMethodFilterAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_36); 

            			newLeafNode(otherlv_9, grammarAccess.getDefinesMethodFilterAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getDefinesMethodFilterAccess().getMethodsKeyword_8());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_11, grammarAccess.getDefinesMethodFilterAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalCcsl.g:1806:3: ( (lv_methods_12_0= ruleMethod ) )
            // InternalCcsl.g:1807:4: (lv_methods_12_0= ruleMethod )
            {
            // InternalCcsl.g:1807:4: (lv_methods_12_0= ruleMethod )
            // InternalCcsl.g:1808:5: lv_methods_12_0= ruleMethod
            {

            					newCompositeNode(grammarAccess.getDefinesMethodFilterAccess().getMethodsMethodParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_methods_12_0=ruleMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinesMethodFilterRule());
            					}
            					add(
            						current,
            						"methods",
            						lv_methods_12_0,
            						"org.ccsl.xtext.Ccsl.Method");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:1825:3: (otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCcsl.g:1826:4: otherlv_13= ',' ( (lv_methods_14_0= ruleMethod ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FOLLOW_37); 

            	    				newLeafNode(otherlv_13, grammarAccess.getDefinesMethodFilterAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalCcsl.g:1830:4: ( (lv_methods_14_0= ruleMethod ) )
            	    // InternalCcsl.g:1831:5: (lv_methods_14_0= ruleMethod )
            	    {
            	    // InternalCcsl.g:1831:5: (lv_methods_14_0= ruleMethod )
            	    // InternalCcsl.g:1832:6: lv_methods_14_0= ruleMethod
            	    {

            	    						newCompositeNode(grammarAccess.getDefinesMethodFilterAccess().getMethodsMethodParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_methods_14_0=ruleMethod();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefinesMethodFilterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"methods",
            	    							lv_methods_14_0,
            	    							"org.ccsl.xtext.Ccsl.Method");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_15=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getDefinesMethodFilterAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDefinesMethodFilterAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleDefinesMethodFilter"


    // $ANTLR start "entryRuleSameNameFilter"
    // InternalCcsl.g:1862:1: entryRuleSameNameFilter returns [EObject current=null] : iv_ruleSameNameFilter= ruleSameNameFilter EOF ;
    public final EObject entryRuleSameNameFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSameNameFilter = null;


        try {
            // InternalCcsl.g:1862:55: (iv_ruleSameNameFilter= ruleSameNameFilter EOF )
            // InternalCcsl.g:1863:2: iv_ruleSameNameFilter= ruleSameNameFilter EOF
            {
             newCompositeNode(grammarAccess.getSameNameFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSameNameFilter=ruleSameNameFilter();

            state._fsp--;

             current =iv_ruleSameNameFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSameNameFilter"


    // $ANTLR start "ruleSameNameFilter"
    // InternalCcsl.g:1869:1: ruleSameNameFilter returns [EObject current=null] : (otherlv_0= 'SameNameFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'ignoreCase' ( (lv_ignoreCase_5_0= ruleBoolean ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'elements' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleSameNameFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        AntlrDatatypeRuleToken lv_ignoreCase_5_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:1875:2: ( (otherlv_0= 'SameNameFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'ignoreCase' ( (lv_ignoreCase_5_0= ruleBoolean ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'elements' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalCcsl.g:1876:2: (otherlv_0= 'SameNameFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'ignoreCase' ( (lv_ignoreCase_5_0= ruleBoolean ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'elements' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalCcsl.g:1876:2: (otherlv_0= 'SameNameFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'ignoreCase' ( (lv_ignoreCase_5_0= ruleBoolean ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'elements' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalCcsl.g:1877:3: otherlv_0= 'SameNameFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'ignoreCase' ( (lv_ignoreCase_5_0= ruleBoolean ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'elements' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSameNameFilterAccess().getSameNameFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getSameNameFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:1885:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCcsl.g:1886:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSameNameFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:1890:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:1891:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:1891:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:1892:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getSameNameFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSameNameFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:1910:3: (otherlv_4= 'ignoreCase' ( (lv_ignoreCase_5_0= ruleBoolean ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCcsl.g:1911:4: otherlv_4= 'ignoreCase' ( (lv_ignoreCase_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSameNameFilterAccess().getIgnoreCaseKeyword_3_0());
                    			
                    // InternalCcsl.g:1915:4: ( (lv_ignoreCase_5_0= ruleBoolean ) )
                    // InternalCcsl.g:1916:5: (lv_ignoreCase_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:1916:5: (lv_ignoreCase_5_0= ruleBoolean )
                    // InternalCcsl.g:1917:6: lv_ignoreCase_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getSameNameFilterAccess().getIgnoreCaseBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_ignoreCase_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSameNameFilterRule());
                    						}
                    						set(
                    							current,
                    							"ignoreCase",
                    							lv_ignoreCase_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getSameNameFilterAccess().getTargetsKeyword_4());
            		
            otherlv_7=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getSameNameFilterAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCcsl.g:1943:3: ( ( ruleEString ) )
            // InternalCcsl.g:1944:4: ( ruleEString )
            {
            // InternalCcsl.g:1944:4: ( ruleEString )
            // InternalCcsl.g:1945:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSameNameFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSameNameFilterAccess().getTargetsElementCrossReference_6_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:1959:3: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==16) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCcsl.g:1960:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSameNameFilterAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCcsl.g:1964:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:1965:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:1965:5: ( ruleEString )
            	    // InternalCcsl.g:1966:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSameNameFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSameNameFilterAccess().getTargetsElementCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_11=(Token)match(input,37,FOLLOW_40); 

            			newLeafNode(otherlv_11, grammarAccess.getSameNameFilterAccess().getRightParenthesisKeyword_8());
            		
            // InternalCcsl.g:1985:3: (otherlv_12= 'elements' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCcsl.g:1986:4: otherlv_12= 'elements' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_12, grammarAccess.getSameNameFilterAccess().getElementsKeyword_9_0());
                    			
                    otherlv_13=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getSameNameFilterAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalCcsl.g:1994:4: ( ( ruleEString ) )
                    // InternalCcsl.g:1995:5: ( ruleEString )
                    {
                    // InternalCcsl.g:1995:5: ( ruleEString )
                    // InternalCcsl.g:1996:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSameNameFilterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSameNameFilterAccess().getElementsNamedElementCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:2010:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalCcsl.g:2011:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSameNameFilterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCcsl.g:2015:5: ( ( ruleEString ) )
                    	    // InternalCcsl.g:2016:6: ( ruleEString )
                    	    {
                    	    // InternalCcsl.g:2016:6: ( ruleEString )
                    	    // InternalCcsl.g:2017:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSameNameFilterRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSameNameFilterAccess().getElementsNamedElementCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,37,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getSameNameFilterAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getSameNameFilterAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleSameNameFilter"


    // $ANTLR start "entryRuleRegexLiteralValueFilter"
    // InternalCcsl.g:2045:1: entryRuleRegexLiteralValueFilter returns [EObject current=null] : iv_ruleRegexLiteralValueFilter= ruleRegexLiteralValueFilter EOF ;
    public final EObject entryRuleRegexLiteralValueFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexLiteralValueFilter = null;


        try {
            // InternalCcsl.g:2045:64: (iv_ruleRegexLiteralValueFilter= ruleRegexLiteralValueFilter EOF )
            // InternalCcsl.g:2046:2: iv_ruleRegexLiteralValueFilter= ruleRegexLiteralValueFilter EOF
            {
             newCompositeNode(grammarAccess.getRegexLiteralValueFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexLiteralValueFilter=ruleRegexLiteralValueFilter();

            state._fsp--;

             current =iv_ruleRegexLiteralValueFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRegexLiteralValueFilter"


    // $ANTLR start "ruleRegexLiteralValueFilter"
    // InternalCcsl.g:2052:1: ruleRegexLiteralValueFilter returns [EObject current=null] : (otherlv_0= 'RegexLiteralValueFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}' ) ;
    public final EObject ruleRegexLiteralValueFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        AntlrDatatypeRuleToken lv_regex_5_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:2058:2: ( (otherlv_0= 'RegexLiteralValueFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}' ) )
            // InternalCcsl.g:2059:2: (otherlv_0= 'RegexLiteralValueFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}' )
            {
            // InternalCcsl.g:2059:2: (otherlv_0= 'RegexLiteralValueFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}' )
            // InternalCcsl.g:2060:3: otherlv_0= 'RegexLiteralValueFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRegexLiteralValueFilterAccess().getRegexLiteralValueFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getRegexLiteralValueFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:2068:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCcsl.g:2069:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRegexLiteralValueFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:2073:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:2074:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:2074:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:2075:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getRegexLiteralValueFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegexLiteralValueFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:2093:3: (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCcsl.g:2094:4: otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegexLiteralValueFilterAccess().getRegexKeyword_3_0());
                    			
                    // InternalCcsl.g:2098:4: ( (lv_regex_5_0= ruleString0 ) )
                    // InternalCcsl.g:2099:5: (lv_regex_5_0= ruleString0 )
                    {
                    // InternalCcsl.g:2099:5: (lv_regex_5_0= ruleString0 )
                    // InternalCcsl.g:2100:6: lv_regex_5_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getRegexLiteralValueFilterAccess().getRegexString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_regex_5_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegexLiteralValueFilterRule());
                    						}
                    						set(
                    							current,
                    							"regex",
                    							lv_regex_5_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getRegexLiteralValueFilterAccess().getTargetsKeyword_4());
            		
            otherlv_7=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getRegexLiteralValueFilterAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCcsl.g:2126:3: ( ( ruleEString ) )
            // InternalCcsl.g:2127:4: ( ruleEString )
            {
            // InternalCcsl.g:2127:4: ( ruleEString )
            // InternalCcsl.g:2128:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegexLiteralValueFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegexLiteralValueFilterAccess().getTargetsElementCrossReference_6_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:2142:3: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==16) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCcsl.g:2143:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_9, grammarAccess.getRegexLiteralValueFilterAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCcsl.g:2147:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:2148:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:2148:5: ( ruleEString )
            	    // InternalCcsl.g:2149:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRegexLiteralValueFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getRegexLiteralValueFilterAccess().getTargetsElementCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_11=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getRegexLiteralValueFilterAccess().getRightParenthesisKeyword_8());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRegexLiteralValueFilterAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleRegexLiteralValueFilter"


    // $ANTLR start "entryRuleEqualsNamedElementWithLiterals"
    // InternalCcsl.g:2176:1: entryRuleEqualsNamedElementWithLiterals returns [EObject current=null] : iv_ruleEqualsNamedElementWithLiterals= ruleEqualsNamedElementWithLiterals EOF ;
    public final EObject entryRuleEqualsNamedElementWithLiterals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsNamedElementWithLiterals = null;


        try {
            // InternalCcsl.g:2176:71: (iv_ruleEqualsNamedElementWithLiterals= ruleEqualsNamedElementWithLiterals EOF )
            // InternalCcsl.g:2177:2: iv_ruleEqualsNamedElementWithLiterals= ruleEqualsNamedElementWithLiterals EOF
            {
             newCompositeNode(grammarAccess.getEqualsNamedElementWithLiteralsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualsNamedElementWithLiterals=ruleEqualsNamedElementWithLiterals();

            state._fsp--;

             current =iv_ruleEqualsNamedElementWithLiterals; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEqualsNamedElementWithLiterals"


    // $ANTLR start "ruleEqualsNamedElementWithLiterals"
    // InternalCcsl.g:2183:1: ruleEqualsNamedElementWithLiterals returns [EObject current=null] : (otherlv_0= 'EqualsNamedElementWithLiterals' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'names' ( (lv_names_5_0= ruleString0 ) ) )? (otherlv_6= 'ignoreCase' ( (lv_ignoreCase_7_0= ruleBoolean ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}' ) ;
    public final EObject ruleEqualsNamedElementWithLiterals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        AntlrDatatypeRuleToken lv_names_5_0 = null;

        AntlrDatatypeRuleToken lv_ignoreCase_7_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:2189:2: ( (otherlv_0= 'EqualsNamedElementWithLiterals' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'names' ( (lv_names_5_0= ruleString0 ) ) )? (otherlv_6= 'ignoreCase' ( (lv_ignoreCase_7_0= ruleBoolean ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}' ) )
            // InternalCcsl.g:2190:2: (otherlv_0= 'EqualsNamedElementWithLiterals' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'names' ( (lv_names_5_0= ruleString0 ) ) )? (otherlv_6= 'ignoreCase' ( (lv_ignoreCase_7_0= ruleBoolean ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}' )
            {
            // InternalCcsl.g:2190:2: (otherlv_0= 'EqualsNamedElementWithLiterals' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'names' ( (lv_names_5_0= ruleString0 ) ) )? (otherlv_6= 'ignoreCase' ( (lv_ignoreCase_7_0= ruleBoolean ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}' )
            // InternalCcsl.g:2191:3: otherlv_0= 'EqualsNamedElementWithLiterals' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'names' ( (lv_names_5_0= ruleString0 ) ) )? (otherlv_6= 'ignoreCase' ( (lv_ignoreCase_7_0= ruleBoolean ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getEqualsNamedElementWithLiteralsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:2199:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCcsl.g:2200:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:2204:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:2205:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:2205:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:2206:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getEqualsNamedElementWithLiteralsAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualsNamedElementWithLiteralsRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:2224:3: (otherlv_4= 'names' ( (lv_names_5_0= ruleString0 ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCcsl.g:2225:4: otherlv_4= 'names' ( (lv_names_5_0= ruleString0 ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getNamesKeyword_3_0());
                    			
                    // InternalCcsl.g:2229:4: ( (lv_names_5_0= ruleString0 ) )
                    // InternalCcsl.g:2230:5: (lv_names_5_0= ruleString0 )
                    {
                    // InternalCcsl.g:2230:5: (lv_names_5_0= ruleString0 )
                    // InternalCcsl.g:2231:6: lv_names_5_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getEqualsNamedElementWithLiteralsAccess().getNamesString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_names_5_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualsNamedElementWithLiteralsRule());
                    						}
                    						set(
                    							current,
                    							"names",
                    							lv_names_5_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:2249:3: (otherlv_6= 'ignoreCase' ( (lv_ignoreCase_7_0= ruleBoolean ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCcsl.g:2250:4: otherlv_6= 'ignoreCase' ( (lv_ignoreCase_7_0= ruleBoolean ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getIgnoreCaseKeyword_4_0());
                    			
                    // InternalCcsl.g:2254:4: ( (lv_ignoreCase_7_0= ruleBoolean ) )
                    // InternalCcsl.g:2255:5: (lv_ignoreCase_7_0= ruleBoolean )
                    {
                    // InternalCcsl.g:2255:5: (lv_ignoreCase_7_0= ruleBoolean )
                    // InternalCcsl.g:2256:6: lv_ignoreCase_7_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getEqualsNamedElementWithLiteralsAccess().getIgnoreCaseBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_ignoreCase_7_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualsNamedElementWithLiteralsRule());
                    						}
                    						set(
                    							current,
                    							"ignoreCase",
                    							lv_ignoreCase_7_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getTargetsKeyword_5());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getLeftParenthesisKeyword_6());
            		
            // InternalCcsl.g:2282:3: ( ( ruleEString ) )
            // InternalCcsl.g:2283:4: ( ruleEString )
            {
            // InternalCcsl.g:2283:4: ( ruleEString )
            // InternalCcsl.g:2284:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEqualsNamedElementWithLiteralsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEqualsNamedElementWithLiteralsAccess().getTargetsElementCrossReference_7_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:2298:3: (otherlv_11= ',' ( ( ruleEString ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==16) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCcsl.g:2299:4: otherlv_11= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_11, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCcsl.g:2303:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:2304:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:2304:5: ( ruleEString )
            	    // InternalCcsl.g:2305:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEqualsNamedElementWithLiteralsRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getEqualsNamedElementWithLiteralsAccess().getTargetsElementCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_13=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getRightParenthesisKeyword_9());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEqualsNamedElementWithLiteralsAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleEqualsNamedElementWithLiterals"


    // $ANTLR start "entryRuleRegexMatch"
    // InternalCcsl.g:2332:1: entryRuleRegexMatch returns [EObject current=null] : iv_ruleRegexMatch= ruleRegexMatch EOF ;
    public final EObject entryRuleRegexMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexMatch = null;


        try {
            // InternalCcsl.g:2332:51: (iv_ruleRegexMatch= ruleRegexMatch EOF )
            // InternalCcsl.g:2333:2: iv_ruleRegexMatch= ruleRegexMatch EOF
            {
             newCompositeNode(grammarAccess.getRegexMatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexMatch=ruleRegexMatch();

            state._fsp--;

             current =iv_ruleRegexMatch; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRegexMatch"


    // $ANTLR start "ruleRegexMatch"
    // InternalCcsl.g:2339:1: ruleRegexMatch returns [EObject current=null] : (otherlv_0= 'RegexMatch' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}' ) ;
    public final EObject ruleRegexMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        AntlrDatatypeRuleToken lv_regex_5_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:2345:2: ( (otherlv_0= 'RegexMatch' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}' ) )
            // InternalCcsl.g:2346:2: (otherlv_0= 'RegexMatch' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}' )
            {
            // InternalCcsl.g:2346:2: (otherlv_0= 'RegexMatch' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}' )
            // InternalCcsl.g:2347:3: otherlv_0= 'RegexMatch' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )? otherlv_6= 'targets' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRegexMatchAccess().getRegexMatchKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getRegexMatchAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:2355:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCcsl.g:2356:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRegexMatchAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:2360:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:2361:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:2361:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:2362:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getRegexMatchAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegexMatchRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:2380:3: (otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCcsl.g:2381:4: otherlv_4= 'regex' ( (lv_regex_5_0= ruleString0 ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegexMatchAccess().getRegexKeyword_3_0());
                    			
                    // InternalCcsl.g:2385:4: ( (lv_regex_5_0= ruleString0 ) )
                    // InternalCcsl.g:2386:5: (lv_regex_5_0= ruleString0 )
                    {
                    // InternalCcsl.g:2386:5: (lv_regex_5_0= ruleString0 )
                    // InternalCcsl.g:2387:6: lv_regex_5_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getRegexMatchAccess().getRegexString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_regex_5_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegexMatchRule());
                    						}
                    						set(
                    							current,
                    							"regex",
                    							lv_regex_5_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getRegexMatchAccess().getTargetsKeyword_4());
            		
            otherlv_7=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getRegexMatchAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCcsl.g:2413:3: ( ( ruleEString ) )
            // InternalCcsl.g:2414:4: ( ruleEString )
            {
            // InternalCcsl.g:2414:4: ( ruleEString )
            // InternalCcsl.g:2415:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegexMatchRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegexMatchAccess().getTargetsElementCrossReference_6_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:2429:3: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==16) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalCcsl.g:2430:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_9, grammarAccess.getRegexMatchAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCcsl.g:2434:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:2435:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:2435:5: ( ruleEString )
            	    // InternalCcsl.g:2436:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRegexMatchRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getRegexMatchAccess().getTargetsElementCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_11=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getRegexMatchAccess().getRightParenthesisKeyword_8());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRegexMatchAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleRegexMatch"


    // $ANTLR start "entryRuleTypedStatementFilter"
    // InternalCcsl.g:2463:1: entryRuleTypedStatementFilter returns [EObject current=null] : iv_ruleTypedStatementFilter= ruleTypedStatementFilter EOF ;
    public final EObject entryRuleTypedStatementFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedStatementFilter = null;


        try {
            // InternalCcsl.g:2463:61: (iv_ruleTypedStatementFilter= ruleTypedStatementFilter EOF )
            // InternalCcsl.g:2464:2: iv_ruleTypedStatementFilter= ruleTypedStatementFilter EOF
            {
             newCompositeNode(grammarAccess.getTypedStatementFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedStatementFilter=ruleTypedStatementFilter();

            state._fsp--;

             current =iv_ruleTypedStatementFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypedStatementFilter"


    // $ANTLR start "ruleTypedStatementFilter"
    // InternalCcsl.g:2470:1: ruleTypedStatementFilter returns [EObject current=null] : (otherlv_0= 'TypedStatementFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}' ) ;
    public final EObject ruleTypedStatementFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:2476:2: ( (otherlv_0= 'TypedStatementFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}' ) )
            // InternalCcsl.g:2477:2: (otherlv_0= 'TypedStatementFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}' )
            {
            // InternalCcsl.g:2477:2: (otherlv_0= 'TypedStatementFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}' )
            // InternalCcsl.g:2478:3: otherlv_0= 'TypedStatementFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypedStatementFilterAccess().getTypedStatementFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getTypedStatementFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:2486:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==13) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCcsl.g:2487:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypedStatementFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:2491:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:2492:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:2492:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:2493:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getTypedStatementFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypedStatementFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getTypedStatementFilterAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getTypedStatementFilterAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:2519:3: ( ( ruleEString ) )
            // InternalCcsl.g:2520:4: ( ruleEString )
            {
            // InternalCcsl.g:2520:4: ( ruleEString )
            // InternalCcsl.g:2521:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedStatementFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypedStatementFilterAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:2535:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==16) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalCcsl.g:2536:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getTypedStatementFilterAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:2540:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:2541:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:2541:5: ( ruleEString )
            	    // InternalCcsl.g:2542:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypedStatementFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTypedStatementFilterAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_45); 

            			newLeafNode(otherlv_9, grammarAccess.getTypedStatementFilterAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,51,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getTypedStatementFilterAccess().getTypeKeyword_8());
            		
            // InternalCcsl.g:2565:3: ( ( ruleEString ) )
            // InternalCcsl.g:2566:4: ( ruleEString )
            {
            // InternalCcsl.g:2566:4: ( ruleEString )
            // InternalCcsl.g:2567:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedStatementFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypedStatementFilterAccess().getTypeDataTypeCrossReference_9_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTypedStatementFilterAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleTypedStatementFilter"


    // $ANTLR start "entryRuleSwitchCaseStatementCount"
    // InternalCcsl.g:2589:1: entryRuleSwitchCaseStatementCount returns [EObject current=null] : iv_ruleSwitchCaseStatementCount= ruleSwitchCaseStatementCount EOF ;
    public final EObject entryRuleSwitchCaseStatementCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCaseStatementCount = null;


        try {
            // InternalCcsl.g:2589:65: (iv_ruleSwitchCaseStatementCount= ruleSwitchCaseStatementCount EOF )
            // InternalCcsl.g:2590:2: iv_ruleSwitchCaseStatementCount= ruleSwitchCaseStatementCount EOF
            {
             newCompositeNode(grammarAccess.getSwitchCaseStatementCountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCaseStatementCount=ruleSwitchCaseStatementCount();

            state._fsp--;

             current =iv_ruleSwitchCaseStatementCount; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSwitchCaseStatementCount"


    // $ANTLR start "ruleSwitchCaseStatementCount"
    // InternalCcsl.g:2596:1: ruleSwitchCaseStatementCount returns [EObject current=null] : (otherlv_0= 'SwitchCaseStatementCount' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'min' ( (lv_min_5_0= ruleInt0 ) ) )? (otherlv_6= 'max' ( (lv_max_7_0= ruleInt0 ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'cases' otherlv_15= '{' ( (lv_cases_16_0= ruleSwitchCaseBlock ) ) (otherlv_17= ',' ( (lv_cases_18_0= ruleSwitchCaseBlock ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleSwitchCaseStatementCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        AntlrDatatypeRuleToken lv_min_5_0 = null;

        AntlrDatatypeRuleToken lv_max_7_0 = null;

        EObject lv_cases_16_0 = null;

        EObject lv_cases_18_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:2602:2: ( (otherlv_0= 'SwitchCaseStatementCount' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'min' ( (lv_min_5_0= ruleInt0 ) ) )? (otherlv_6= 'max' ( (lv_max_7_0= ruleInt0 ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'cases' otherlv_15= '{' ( (lv_cases_16_0= ruleSwitchCaseBlock ) ) (otherlv_17= ',' ( (lv_cases_18_0= ruleSwitchCaseBlock ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalCcsl.g:2603:2: (otherlv_0= 'SwitchCaseStatementCount' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'min' ( (lv_min_5_0= ruleInt0 ) ) )? (otherlv_6= 'max' ( (lv_max_7_0= ruleInt0 ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'cases' otherlv_15= '{' ( (lv_cases_16_0= ruleSwitchCaseBlock ) ) (otherlv_17= ',' ( (lv_cases_18_0= ruleSwitchCaseBlock ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalCcsl.g:2603:2: (otherlv_0= 'SwitchCaseStatementCount' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'min' ( (lv_min_5_0= ruleInt0 ) ) )? (otherlv_6= 'max' ( (lv_max_7_0= ruleInt0 ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'cases' otherlv_15= '{' ( (lv_cases_16_0= ruleSwitchCaseBlock ) ) (otherlv_17= ',' ( (lv_cases_18_0= ruleSwitchCaseBlock ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalCcsl.g:2604:3: otherlv_0= 'SwitchCaseStatementCount' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? (otherlv_4= 'min' ( (lv_min_5_0= ruleInt0 ) ) )? (otherlv_6= 'max' ( (lv_max_7_0= ruleInt0 ) ) )? otherlv_8= 'targets' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' (otherlv_14= 'cases' otherlv_15= '{' ( (lv_cases_16_0= ruleSwitchCaseBlock ) ) (otherlv_17= ',' ( (lv_cases_18_0= ruleSwitchCaseBlock ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSwitchCaseStatementCountAccess().getSwitchCaseStatementCountKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getSwitchCaseStatementCountAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:2612:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==13) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCcsl.g:2613:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSwitchCaseStatementCountAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:2617:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:2618:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:2618:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:2619:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getSwitchCaseStatementCountAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchCaseStatementCountRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:2637:3: (otherlv_4= 'min' ( (lv_min_5_0= ruleInt0 ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==53) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCcsl.g:2638:4: otherlv_4= 'min' ( (lv_min_5_0= ruleInt0 ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getSwitchCaseStatementCountAccess().getMinKeyword_3_0());
                    			
                    // InternalCcsl.g:2642:4: ( (lv_min_5_0= ruleInt0 ) )
                    // InternalCcsl.g:2643:5: (lv_min_5_0= ruleInt0 )
                    {
                    // InternalCcsl.g:2643:5: (lv_min_5_0= ruleInt0 )
                    // InternalCcsl.g:2644:6: lv_min_5_0= ruleInt0
                    {

                    						newCompositeNode(grammarAccess.getSwitchCaseStatementCountAccess().getMinInt0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_min_5_0=ruleInt0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchCaseStatementCountRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_5_0,
                    							"org.ccsl.xtext.Ccsl.Int0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:2662:3: (otherlv_6= 'max' ( (lv_max_7_0= ruleInt0 ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCcsl.g:2663:4: otherlv_6= 'max' ( (lv_max_7_0= ruleInt0 ) )
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_48); 

                    				newLeafNode(otherlv_6, grammarAccess.getSwitchCaseStatementCountAccess().getMaxKeyword_4_0());
                    			
                    // InternalCcsl.g:2667:4: ( (lv_max_7_0= ruleInt0 ) )
                    // InternalCcsl.g:2668:5: (lv_max_7_0= ruleInt0 )
                    {
                    // InternalCcsl.g:2668:5: (lv_max_7_0= ruleInt0 )
                    // InternalCcsl.g:2669:6: lv_max_7_0= ruleInt0
                    {

                    						newCompositeNode(grammarAccess.getSwitchCaseStatementCountAccess().getMaxInt0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_max_7_0=ruleInt0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchCaseStatementCountRule());
                    						}
                    						set(
                    							current,
                    							"max",
                    							lv_max_7_0,
                    							"org.ccsl.xtext.Ccsl.Int0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getSwitchCaseStatementCountAccess().getTargetsKeyword_5());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getSwitchCaseStatementCountAccess().getLeftParenthesisKeyword_6());
            		
            // InternalCcsl.g:2695:3: ( ( ruleEString ) )
            // InternalCcsl.g:2696:4: ( ruleEString )
            {
            // InternalCcsl.g:2696:4: ( ruleEString )
            // InternalCcsl.g:2697:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSwitchCaseStatementCountRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSwitchCaseStatementCountAccess().getTargetsElementCrossReference_7_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:2711:3: (otherlv_11= ',' ( ( ruleEString ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==16) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalCcsl.g:2712:4: otherlv_11= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_11, grammarAccess.getSwitchCaseStatementCountAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCcsl.g:2716:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:2717:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:2717:5: ( ruleEString )
            	    // InternalCcsl.g:2718:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSwitchCaseStatementCountRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSwitchCaseStatementCountAccess().getTargetsElementCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_13=(Token)match(input,37,FOLLOW_50); 

            			newLeafNode(otherlv_13, grammarAccess.getSwitchCaseStatementCountAccess().getRightParenthesisKeyword_9());
            		
            // InternalCcsl.g:2737:3: (otherlv_14= 'cases' otherlv_15= '{' ( (lv_cases_16_0= ruleSwitchCaseBlock ) ) (otherlv_17= ',' ( (lv_cases_18_0= ruleSwitchCaseBlock ) ) )* otherlv_19= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCcsl.g:2738:4: otherlv_14= 'cases' otherlv_15= '{' ( (lv_cases_16_0= ruleSwitchCaseBlock ) ) (otherlv_17= ',' ( (lv_cases_18_0= ruleSwitchCaseBlock ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getSwitchCaseStatementCountAccess().getCasesKeyword_10_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_15, grammarAccess.getSwitchCaseStatementCountAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalCcsl.g:2746:4: ( (lv_cases_16_0= ruleSwitchCaseBlock ) )
                    // InternalCcsl.g:2747:5: (lv_cases_16_0= ruleSwitchCaseBlock )
                    {
                    // InternalCcsl.g:2747:5: (lv_cases_16_0= ruleSwitchCaseBlock )
                    // InternalCcsl.g:2748:6: lv_cases_16_0= ruleSwitchCaseBlock
                    {

                    						newCompositeNode(grammarAccess.getSwitchCaseStatementCountAccess().getCasesSwitchCaseBlockParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_cases_16_0=ruleSwitchCaseBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchCaseStatementCountRule());
                    						}
                    						add(
                    							current,
                    							"cases",
                    							lv_cases_16_0,
                    							"org.ccsl.xtext.Ccsl.SwitchCaseBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:2765:4: (otherlv_17= ',' ( (lv_cases_18_0= ruleSwitchCaseBlock ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==16) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalCcsl.g:2766:5: otherlv_17= ',' ( (lv_cases_18_0= ruleSwitchCaseBlock ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_51); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSwitchCaseStatementCountAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalCcsl.g:2770:5: ( (lv_cases_18_0= ruleSwitchCaseBlock ) )
                    	    // InternalCcsl.g:2771:6: (lv_cases_18_0= ruleSwitchCaseBlock )
                    	    {
                    	    // InternalCcsl.g:2771:6: (lv_cases_18_0= ruleSwitchCaseBlock )
                    	    // InternalCcsl.g:2772:7: lv_cases_18_0= ruleSwitchCaseBlock
                    	    {

                    	    							newCompositeNode(grammarAccess.getSwitchCaseStatementCountAccess().getCasesSwitchCaseBlockParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_cases_18_0=ruleSwitchCaseBlock();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSwitchCaseStatementCountRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cases",
                    	    								lv_cases_18_0,
                    	    								"org.ccsl.xtext.Ccsl.SwitchCaseBlock");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_19, grammarAccess.getSwitchCaseStatementCountAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getSwitchCaseStatementCountAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleSwitchCaseStatementCount"


    // $ANTLR start "entryRuleImplicityOperandFilter"
    // InternalCcsl.g:2803:1: entryRuleImplicityOperandFilter returns [EObject current=null] : iv_ruleImplicityOperandFilter= ruleImplicityOperandFilter EOF ;
    public final EObject entryRuleImplicityOperandFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicityOperandFilter = null;


        try {
            // InternalCcsl.g:2803:63: (iv_ruleImplicityOperandFilter= ruleImplicityOperandFilter EOF )
            // InternalCcsl.g:2804:2: iv_ruleImplicityOperandFilter= ruleImplicityOperandFilter EOF
            {
             newCompositeNode(grammarAccess.getImplicityOperandFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicityOperandFilter=ruleImplicityOperandFilter();

            state._fsp--;

             current =iv_ruleImplicityOperandFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImplicityOperandFilter"


    // $ANTLR start "ruleImplicityOperandFilter"
    // InternalCcsl.g:2810:1: ruleImplicityOperandFilter returns [EObject current=null] : (otherlv_0= 'ImplicityOperandFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'implicityOperand' ( ( ruleEString ) ) otherlv_14= 'operatorExpression' ( ( ruleEString ) ) otherlv_16= 'context' ( (lv_context_17_0= ruleContext ) ) otherlv_18= '}' ) ;
    public final EObject ruleImplicityOperandFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_context_17_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:2816:2: ( (otherlv_0= 'ImplicityOperandFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'implicityOperand' ( ( ruleEString ) ) otherlv_14= 'operatorExpression' ( ( ruleEString ) ) otherlv_16= 'context' ( (lv_context_17_0= ruleContext ) ) otherlv_18= '}' ) )
            // InternalCcsl.g:2817:2: (otherlv_0= 'ImplicityOperandFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'implicityOperand' ( ( ruleEString ) ) otherlv_14= 'operatorExpression' ( ( ruleEString ) ) otherlv_16= 'context' ( (lv_context_17_0= ruleContext ) ) otherlv_18= '}' )
            {
            // InternalCcsl.g:2817:2: (otherlv_0= 'ImplicityOperandFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'implicityOperand' ( ( ruleEString ) ) otherlv_14= 'operatorExpression' ( ( ruleEString ) ) otherlv_16= 'context' ( (lv_context_17_0= ruleContext ) ) otherlv_18= '}' )
            // InternalCcsl.g:2818:3: otherlv_0= 'ImplicityOperandFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'targetTemplate' ( ( ruleEString ) ) otherlv_12= 'implicityOperand' ( ( ruleEString ) ) otherlv_14= 'operatorExpression' ( ( ruleEString ) ) otherlv_16= 'context' ( (lv_context_17_0= ruleContext ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImplicityOperandFilterAccess().getImplicityOperandFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicityOperandFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:2826:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==13) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCcsl.g:2827:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplicityOperandFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:2831:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:2832:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:2832:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:2833:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getImplicityOperandFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplicityOperandFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getImplicityOperandFilterAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getImplicityOperandFilterAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:2859:3: ( ( ruleEString ) )
            // InternalCcsl.g:2860:4: ( ruleEString )
            {
            // InternalCcsl.g:2860:4: ( ruleEString )
            // InternalCcsl.g:2861:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplicityOperandFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplicityOperandFilterAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:2875:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==16) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalCcsl.g:2876:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getImplicityOperandFilterAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:2880:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:2881:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:2881:5: ( ruleEString )
            	    // InternalCcsl.g:2882:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getImplicityOperandFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getImplicityOperandFilterAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_9, grammarAccess.getImplicityOperandFilterAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getImplicityOperandFilterAccess().getTargetTemplateKeyword_8());
            		
            // InternalCcsl.g:2905:3: ( ( ruleEString ) )
            // InternalCcsl.g:2906:4: ( ruleEString )
            {
            // InternalCcsl.g:2906:4: ( ruleEString )
            // InternalCcsl.g:2907:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplicityOperandFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplicityOperandFilterAccess().getTargetTemplateElementCrossReference_9_0());
            				
            pushFollow(FOLLOW_52);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,57,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getImplicityOperandFilterAccess().getImplicityOperandKeyword_10());
            		
            // InternalCcsl.g:2925:3: ( ( ruleEString ) )
            // InternalCcsl.g:2926:4: ( ruleEString )
            {
            // InternalCcsl.g:2926:4: ( ruleEString )
            // InternalCcsl.g:2927:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplicityOperandFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplicityOperandFilterAccess().getImplicityOperandElementCrossReference_11_0());
            				
            pushFollow(FOLLOW_53);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,58,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getImplicityOperandFilterAccess().getOperatorExpressionKeyword_12());
            		
            // InternalCcsl.g:2945:3: ( ( ruleEString ) )
            // InternalCcsl.g:2946:4: ( ruleEString )
            {
            // InternalCcsl.g:2946:4: ( ruleEString )
            // InternalCcsl.g:2947:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplicityOperandFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplicityOperandFilterAccess().getOperatorExpressionOperatorExpressionCrossReference_13_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_16, grammarAccess.getImplicityOperandFilterAccess().getContextKeyword_14());
            		
            // InternalCcsl.g:2965:3: ( (lv_context_17_0= ruleContext ) )
            // InternalCcsl.g:2966:4: (lv_context_17_0= ruleContext )
            {
            // InternalCcsl.g:2966:4: (lv_context_17_0= ruleContext )
            // InternalCcsl.g:2967:5: lv_context_17_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getImplicityOperandFilterAccess().getContextContextParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_11);
            lv_context_17_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplicityOperandFilterRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_17_0,
            						"org.ccsl.xtext.Ccsl.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getImplicityOperandFilterAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleImplicityOperandFilter"


    // $ANTLR start "entryRuleImplicityContainerFilter"
    // InternalCcsl.g:2992:1: entryRuleImplicityContainerFilter returns [EObject current=null] : iv_ruleImplicityContainerFilter= ruleImplicityContainerFilter EOF ;
    public final EObject entryRuleImplicityContainerFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicityContainerFilter = null;


        try {
            // InternalCcsl.g:2992:65: (iv_ruleImplicityContainerFilter= ruleImplicityContainerFilter EOF )
            // InternalCcsl.g:2993:2: iv_ruleImplicityContainerFilter= ruleImplicityContainerFilter EOF
            {
             newCompositeNode(grammarAccess.getImplicityContainerFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicityContainerFilter=ruleImplicityContainerFilter();

            state._fsp--;

             current =iv_ruleImplicityContainerFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImplicityContainerFilter"


    // $ANTLR start "ruleImplicityContainerFilter"
    // InternalCcsl.g:2999:1: ruleImplicityContainerFilter returns [EObject current=null] : (otherlv_0= 'ImplicityContainerFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'implicityContainer' ( ( ruleEString ) ) otherlv_12= 'implicityField' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}' ) ;
    public final EObject ruleImplicityContainerFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_context_15_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:3005:2: ( (otherlv_0= 'ImplicityContainerFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'implicityContainer' ( ( ruleEString ) ) otherlv_12= 'implicityField' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}' ) )
            // InternalCcsl.g:3006:2: (otherlv_0= 'ImplicityContainerFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'implicityContainer' ( ( ruleEString ) ) otherlv_12= 'implicityField' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}' )
            {
            // InternalCcsl.g:3006:2: (otherlv_0= 'ImplicityContainerFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'implicityContainer' ( ( ruleEString ) ) otherlv_12= 'implicityField' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}' )
            // InternalCcsl.g:3007:3: otherlv_0= 'ImplicityContainerFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'implicityContainer' ( ( ruleEString ) ) otherlv_12= 'implicityField' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImplicityContainerFilterAccess().getImplicityContainerFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicityContainerFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:3015:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==13) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCcsl.g:3016:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplicityContainerFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:3020:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:3021:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:3021:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:3022:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getImplicityContainerFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplicityContainerFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getImplicityContainerFilterAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getImplicityContainerFilterAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:3048:3: ( ( ruleEString ) )
            // InternalCcsl.g:3049:4: ( ruleEString )
            {
            // InternalCcsl.g:3049:4: ( ruleEString )
            // InternalCcsl.g:3050:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplicityContainerFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplicityContainerFilterAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:3064:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==16) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalCcsl.g:3065:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getImplicityContainerFilterAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:3069:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:3070:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:3070:5: ( ruleEString )
            	    // InternalCcsl.g:3071:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getImplicityContainerFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getImplicityContainerFilterAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_54); 

            			newLeafNode(otherlv_9, grammarAccess.getImplicityContainerFilterAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getImplicityContainerFilterAccess().getImplicityContainerKeyword_8());
            		
            // InternalCcsl.g:3094:3: ( ( ruleEString ) )
            // InternalCcsl.g:3095:4: ( ruleEString )
            {
            // InternalCcsl.g:3095:4: ( ruleEString )
            // InternalCcsl.g:3096:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplicityContainerFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplicityContainerFilterAccess().getImplicityContainerElementCrossReference_9_0());
            				
            pushFollow(FOLLOW_55);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,61,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getImplicityContainerFilterAccess().getImplicityFieldKeyword_10());
            		
            // InternalCcsl.g:3114:3: ( ( ruleEString ) )
            // InternalCcsl.g:3115:4: ( ruleEString )
            {
            // InternalCcsl.g:3115:4: ( ruleEString )
            // InternalCcsl.g:3116:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplicityContainerFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplicityContainerFilterAccess().getImplicityFieldElementCrossReference_11_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getImplicityContainerFilterAccess().getContextKeyword_12());
            		
            // InternalCcsl.g:3134:3: ( (lv_context_15_0= ruleContext ) )
            // InternalCcsl.g:3135:4: (lv_context_15_0= ruleContext )
            {
            // InternalCcsl.g:3135:4: (lv_context_15_0= ruleContext )
            // InternalCcsl.g:3136:5: lv_context_15_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getImplicityContainerFilterAccess().getContextContextParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_11);
            lv_context_15_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplicityContainerFilterRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_15_0,
            						"org.ccsl.xtext.Ccsl.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getImplicityContainerFilterAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleImplicityContainerFilter"


    // $ANTLR start "entryRuleIsKindOfFilter"
    // InternalCcsl.g:3161:1: entryRuleIsKindOfFilter returns [EObject current=null] : iv_ruleIsKindOfFilter= ruleIsKindOfFilter EOF ;
    public final EObject entryRuleIsKindOfFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsKindOfFilter = null;


        try {
            // InternalCcsl.g:3161:55: (iv_ruleIsKindOfFilter= ruleIsKindOfFilter EOF )
            // InternalCcsl.g:3162:2: iv_ruleIsKindOfFilter= ruleIsKindOfFilter EOF
            {
             newCompositeNode(grammarAccess.getIsKindOfFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsKindOfFilter=ruleIsKindOfFilter();

            state._fsp--;

             current =iv_ruleIsKindOfFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsKindOfFilter"


    // $ANTLR start "ruleIsKindOfFilter"
    // InternalCcsl.g:3168:1: ruleIsKindOfFilter returns [EObject current=null] : (otherlv_0= 'IsKindOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' ) ;
    public final EObject ruleIsKindOfFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_context_13_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:3174:2: ( (otherlv_0= 'IsKindOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' ) )
            // InternalCcsl.g:3175:2: (otherlv_0= 'IsKindOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' )
            {
            // InternalCcsl.g:3175:2: (otherlv_0= 'IsKindOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' )
            // InternalCcsl.g:3176:3: otherlv_0= 'IsKindOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIsKindOfFilterAccess().getIsKindOfFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getIsKindOfFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:3184:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==13) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCcsl.g:3185:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsKindOfFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:3189:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:3190:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:3190:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:3191:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getIsKindOfFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIsKindOfFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getIsKindOfFilterAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getIsKindOfFilterAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:3217:3: ( ( ruleEString ) )
            // InternalCcsl.g:3218:4: ( ruleEString )
            {
            // InternalCcsl.g:3218:4: ( ruleEString )
            // InternalCcsl.g:3219:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsKindOfFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIsKindOfFilterAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:3233:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==16) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCcsl.g:3234:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getIsKindOfFilterAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:3238:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:3239:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:3239:5: ( ruleEString )
            	    // InternalCcsl.g:3240:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIsKindOfFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getIsKindOfFilterAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_45); 

            			newLeafNode(otherlv_9, grammarAccess.getIsKindOfFilterAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,51,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getIsKindOfFilterAccess().getTypeKeyword_8());
            		
            // InternalCcsl.g:3263:3: ( ( ruleEString ) )
            // InternalCcsl.g:3264:4: ( ruleEString )
            {
            // InternalCcsl.g:3264:4: ( ruleEString )
            // InternalCcsl.g:3265:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsKindOfFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIsKindOfFilterAccess().getTypeDataTypeCrossReference_9_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getIsKindOfFilterAccess().getContextKeyword_10());
            		
            // InternalCcsl.g:3283:3: ( (lv_context_13_0= ruleContext ) )
            // InternalCcsl.g:3284:4: (lv_context_13_0= ruleContext )
            {
            // InternalCcsl.g:3284:4: (lv_context_13_0= ruleContext )
            // InternalCcsl.g:3285:5: lv_context_13_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getIsKindOfFilterAccess().getContextContextParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_context_13_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsKindOfFilterRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_13_0,
            						"org.ccsl.xtext.Ccsl.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getIsKindOfFilterAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleIsKindOfFilter"


    // $ANTLR start "entryRuleSuperMethodClosureFilter"
    // InternalCcsl.g:3310:1: entryRuleSuperMethodClosureFilter returns [EObject current=null] : iv_ruleSuperMethodClosureFilter= ruleSuperMethodClosureFilter EOF ;
    public final EObject entryRuleSuperMethodClosureFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperMethodClosureFilter = null;


        try {
            // InternalCcsl.g:3310:65: (iv_ruleSuperMethodClosureFilter= ruleSuperMethodClosureFilter EOF )
            // InternalCcsl.g:3311:2: iv_ruleSuperMethodClosureFilter= ruleSuperMethodClosureFilter EOF
            {
             newCompositeNode(grammarAccess.getSuperMethodClosureFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperMethodClosureFilter=ruleSuperMethodClosureFilter();

            state._fsp--;

             current =iv_ruleSuperMethodClosureFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSuperMethodClosureFilter"


    // $ANTLR start "ruleSuperMethodClosureFilter"
    // InternalCcsl.g:3317:1: ruleSuperMethodClosureFilter returns [EObject current=null] : (otherlv_0= 'SuperMethodClosureFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superMethod' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' ) ;
    public final EObject ruleSuperMethodClosureFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_context_13_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:3323:2: ( (otherlv_0= 'SuperMethodClosureFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superMethod' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' ) )
            // InternalCcsl.g:3324:2: (otherlv_0= 'SuperMethodClosureFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superMethod' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' )
            {
            // InternalCcsl.g:3324:2: (otherlv_0= 'SuperMethodClosureFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superMethod' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' )
            // InternalCcsl.g:3325:3: otherlv_0= 'SuperMethodClosureFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superMethod' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperMethodClosureFilterAccess().getSuperMethodClosureFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSuperMethodClosureFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:3333:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCcsl.g:3334:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSuperMethodClosureFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:3338:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:3339:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:3339:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:3340:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getSuperMethodClosureFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuperMethodClosureFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getSuperMethodClosureFilterAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getSuperMethodClosureFilterAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:3366:3: ( ( ruleEString ) )
            // InternalCcsl.g:3367:4: ( ruleEString )
            {
            // InternalCcsl.g:3367:4: ( ruleEString )
            // InternalCcsl.g:3368:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperMethodClosureFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSuperMethodClosureFilterAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:3382:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==16) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalCcsl.g:3383:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSuperMethodClosureFilterAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:3387:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:3388:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:3388:5: ( ruleEString )
            	    // InternalCcsl.g:3389:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSuperMethodClosureFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSuperMethodClosureFilterAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_56); 

            			newLeafNode(otherlv_9, grammarAccess.getSuperMethodClosureFilterAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,64,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getSuperMethodClosureFilterAccess().getSuperMethodKeyword_8());
            		
            // InternalCcsl.g:3412:3: ( ( ruleEString ) )
            // InternalCcsl.g:3413:4: ( ruleEString )
            {
            // InternalCcsl.g:3413:4: ( ruleEString )
            // InternalCcsl.g:3414:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperMethodClosureFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSuperMethodClosureFilterAccess().getSuperMethodMethodCrossReference_9_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getSuperMethodClosureFilterAccess().getContextKeyword_10());
            		
            // InternalCcsl.g:3432:3: ( (lv_context_13_0= ruleContext ) )
            // InternalCcsl.g:3433:4: (lv_context_13_0= ruleContext )
            {
            // InternalCcsl.g:3433:4: (lv_context_13_0= ruleContext )
            // InternalCcsl.g:3434:5: lv_context_13_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getSuperMethodClosureFilterAccess().getContextContextParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_context_13_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperMethodClosureFilterRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_13_0,
            						"org.ccsl.xtext.Ccsl.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSuperMethodClosureFilterAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleSuperMethodClosureFilter"


    // $ANTLR start "entryRuleIsTypeOfFilter"
    // InternalCcsl.g:3459:1: entryRuleIsTypeOfFilter returns [EObject current=null] : iv_ruleIsTypeOfFilter= ruleIsTypeOfFilter EOF ;
    public final EObject entryRuleIsTypeOfFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsTypeOfFilter = null;


        try {
            // InternalCcsl.g:3459:55: (iv_ruleIsTypeOfFilter= ruleIsTypeOfFilter EOF )
            // InternalCcsl.g:3460:2: iv_ruleIsTypeOfFilter= ruleIsTypeOfFilter EOF
            {
             newCompositeNode(grammarAccess.getIsTypeOfFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsTypeOfFilter=ruleIsTypeOfFilter();

            state._fsp--;

             current =iv_ruleIsTypeOfFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsTypeOfFilter"


    // $ANTLR start "ruleIsTypeOfFilter"
    // InternalCcsl.g:3466:1: ruleIsTypeOfFilter returns [EObject current=null] : (otherlv_0= 'IsTypeOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' ) ;
    public final EObject ruleIsTypeOfFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_context_13_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:3472:2: ( (otherlv_0= 'IsTypeOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' ) )
            // InternalCcsl.g:3473:2: (otherlv_0= 'IsTypeOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' )
            {
            // InternalCcsl.g:3473:2: (otherlv_0= 'IsTypeOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' )
            // InternalCcsl.g:3474:3: otherlv_0= 'IsTypeOfFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= 'context' ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIsTypeOfFilterAccess().getIsTypeOfFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getIsTypeOfFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:3482:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==13) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCcsl.g:3483:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsTypeOfFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:3487:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:3488:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:3488:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:3489:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getIsTypeOfFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIsTypeOfFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getIsTypeOfFilterAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getIsTypeOfFilterAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:3515:3: ( ( ruleEString ) )
            // InternalCcsl.g:3516:4: ( ruleEString )
            {
            // InternalCcsl.g:3516:4: ( ruleEString )
            // InternalCcsl.g:3517:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsTypeOfFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIsTypeOfFilterAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:3531:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==16) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalCcsl.g:3532:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getIsTypeOfFilterAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:3536:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:3537:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:3537:5: ( ruleEString )
            	    // InternalCcsl.g:3538:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIsTypeOfFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getIsTypeOfFilterAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_45); 

            			newLeafNode(otherlv_9, grammarAccess.getIsTypeOfFilterAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,51,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getIsTypeOfFilterAccess().getTypeKeyword_8());
            		
            // InternalCcsl.g:3561:3: ( ( ruleEString ) )
            // InternalCcsl.g:3562:4: ( ruleEString )
            {
            // InternalCcsl.g:3562:4: ( ruleEString )
            // InternalCcsl.g:3563:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsTypeOfFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIsTypeOfFilterAccess().getTypeDataTypeCrossReference_9_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getIsTypeOfFilterAccess().getContextKeyword_10());
            		
            // InternalCcsl.g:3581:3: ( (lv_context_13_0= ruleContext ) )
            // InternalCcsl.g:3582:4: (lv_context_13_0= ruleContext )
            {
            // InternalCcsl.g:3582:4: (lv_context_13_0= ruleContext )
            // InternalCcsl.g:3583:5: lv_context_13_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getIsTypeOfFilterAccess().getContextContextParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_context_13_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsTypeOfFilterRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_13_0,
            						"org.ccsl.xtext.Ccsl.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getIsTypeOfFilterAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleIsTypeOfFilter"


    // $ANTLR start "entryRuleChildComplexTypeFilter"
    // InternalCcsl.g:3608:1: entryRuleChildComplexTypeFilter returns [EObject current=null] : iv_ruleChildComplexTypeFilter= ruleChildComplexTypeFilter EOF ;
    public final EObject entryRuleChildComplexTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildComplexTypeFilter = null;


        try {
            // InternalCcsl.g:3608:63: (iv_ruleChildComplexTypeFilter= ruleChildComplexTypeFilter EOF )
            // InternalCcsl.g:3609:2: iv_ruleChildComplexTypeFilter= ruleChildComplexTypeFilter EOF
            {
             newCompositeNode(grammarAccess.getChildComplexTypeFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChildComplexTypeFilter=ruleChildComplexTypeFilter();

            state._fsp--;

             current =iv_ruleChildComplexTypeFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChildComplexTypeFilter"


    // $ANTLR start "ruleChildComplexTypeFilter"
    // InternalCcsl.g:3615:1: ruleChildComplexTypeFilter returns [EObject current=null] : (otherlv_0= 'ChildComplexTypeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superComplexType' ( ( ruleEString ) ) otherlv_12= 'childComplexType' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}' ) ;
    public final EObject ruleChildComplexTypeFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_negated_3_0 = null;

        EObject lv_context_15_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:3621:2: ( (otherlv_0= 'ChildComplexTypeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superComplexType' ( ( ruleEString ) ) otherlv_12= 'childComplexType' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}' ) )
            // InternalCcsl.g:3622:2: (otherlv_0= 'ChildComplexTypeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superComplexType' ( ( ruleEString ) ) otherlv_12= 'childComplexType' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}' )
            {
            // InternalCcsl.g:3622:2: (otherlv_0= 'ChildComplexTypeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superComplexType' ( ( ruleEString ) ) otherlv_12= 'childComplexType' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}' )
            // InternalCcsl.g:3623:3: otherlv_0= 'ChildComplexTypeFilter' otherlv_1= '{' (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )? otherlv_4= 'targets' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'superComplexType' ( ( ruleEString ) ) otherlv_12= 'childComplexType' ( ( ruleEString ) ) otherlv_14= 'context' ( (lv_context_15_0= ruleContext ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChildComplexTypeFilterAccess().getChildComplexTypeFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getChildComplexTypeFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCcsl.g:3631:3: (otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==13) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCcsl.g:3632:4: otherlv_2= 'negated' ( (lv_negated_3_0= ruleBoolean ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getChildComplexTypeFilterAccess().getNegatedKeyword_2_0());
                    			
                    // InternalCcsl.g:3636:4: ( (lv_negated_3_0= ruleBoolean ) )
                    // InternalCcsl.g:3637:5: (lv_negated_3_0= ruleBoolean )
                    {
                    // InternalCcsl.g:3637:5: (lv_negated_3_0= ruleBoolean )
                    // InternalCcsl.g:3638:6: lv_negated_3_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getChildComplexTypeFilterAccess().getNegatedBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_negated_3_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChildComplexTypeFilterRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getChildComplexTypeFilterAccess().getTargetsKeyword_3());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getChildComplexTypeFilterAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCcsl.g:3664:3: ( ( ruleEString ) )
            // InternalCcsl.g:3665:4: ( ruleEString )
            {
            // InternalCcsl.g:3665:4: ( ruleEString )
            // InternalCcsl.g:3666:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChildComplexTypeFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChildComplexTypeFilterAccess().getTargetsElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCcsl.g:3680:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==16) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalCcsl.g:3681:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChildComplexTypeFilterAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCcsl.g:3685:4: ( ( ruleEString ) )
            	    // InternalCcsl.g:3686:5: ( ruleEString )
            	    {
            	    // InternalCcsl.g:3686:5: ( ruleEString )
            	    // InternalCcsl.g:3687:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getChildComplexTypeFilterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getChildComplexTypeFilterAccess().getTargetsElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_57); 

            			newLeafNode(otherlv_9, grammarAccess.getChildComplexTypeFilterAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,67,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getChildComplexTypeFilterAccess().getSuperComplexTypeKeyword_8());
            		
            // InternalCcsl.g:3710:3: ( ( ruleEString ) )
            // InternalCcsl.g:3711:4: ( ruleEString )
            {
            // InternalCcsl.g:3711:4: ( ruleEString )
            // InternalCcsl.g:3712:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChildComplexTypeFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChildComplexTypeFilterAccess().getSuperComplexTypeComplexTypeCrossReference_9_0());
            				
            pushFollow(FOLLOW_58);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,68,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getChildComplexTypeFilterAccess().getChildComplexTypeKeyword_10());
            		
            // InternalCcsl.g:3730:3: ( ( ruleEString ) )
            // InternalCcsl.g:3731:4: ( ruleEString )
            {
            // InternalCcsl.g:3731:4: ( ruleEString )
            // InternalCcsl.g:3732:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChildComplexTypeFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChildComplexTypeFilterAccess().getChildComplexTypeComplexTypeCrossReference_11_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getChildComplexTypeFilterAccess().getContextKeyword_12());
            		
            // InternalCcsl.g:3750:3: ( (lv_context_15_0= ruleContext ) )
            // InternalCcsl.g:3751:4: (lv_context_15_0= ruleContext )
            {
            // InternalCcsl.g:3751:4: (lv_context_15_0= ruleContext )
            // InternalCcsl.g:3752:5: lv_context_15_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getChildComplexTypeFilterAccess().getContextContextParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_11);
            lv_context_15_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChildComplexTypeFilterRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_15_0,
            						"org.ccsl.xtext.Ccsl.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getChildComplexTypeFilterAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleChildComplexTypeFilter"


    // $ANTLR start "entryRuleMethod_Impl"
    // InternalCcsl.g:3777:1: entryRuleMethod_Impl returns [EObject current=null] : iv_ruleMethod_Impl= ruleMethod_Impl EOF ;
    public final EObject entryRuleMethod_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_Impl = null;


        try {
            // InternalCcsl.g:3777:52: (iv_ruleMethod_Impl= ruleMethod_Impl EOF )
            // InternalCcsl.g:3778:2: iv_ruleMethod_Impl= ruleMethod_Impl EOF
            {
             newCompositeNode(grammarAccess.getMethod_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod_Impl=ruleMethod_Impl();

            state._fsp--;

             current =iv_ruleMethod_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod_Impl"


    // $ANTLR start "ruleMethod_Impl"
    // InternalCcsl.g:3784:1: ruleMethod_Impl returns [EObject current=null] : ( () otherlv_1= 'Method' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleMethod_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_properties_14_0 = null;

        EObject lv_statements_18_0 = null;

        EObject lv_statements_20_0 = null;

        EObject lv_params_24_0 = null;

        EObject lv_params_26_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:3790:2: ( ( () otherlv_1= 'Method' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalCcsl.g:3791:2: ( () otherlv_1= 'Method' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalCcsl.g:3791:2: ( () otherlv_1= 'Method' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalCcsl.g:3792:3: () otherlv_1= 'Method' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalCcsl.g:3792:3: ()
            // InternalCcsl.g:3793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethod_ImplAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMethod_ImplAccess().getMethodKeyword_1());
            		
            // InternalCcsl.g:3803:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:3804:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:3804:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:3805:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getMethod_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethod_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getMethod_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:3826:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==28) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalCcsl.g:3827:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethod_ImplAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:3831:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:3832:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:3832:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:3833:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getMethod_ImplAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethod_ImplRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:3851:3: (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==31) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalCcsl.g:3852:4: otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getMethod_ImplAccess().getNameKeyword_5_0());
                    			
                    // InternalCcsl.g:3856:4: ( (lv_name_7_0= ruleString0 ) )
                    // InternalCcsl.g:3857:5: (lv_name_7_0= ruleString0 )
                    {
                    // InternalCcsl.g:3857:5: (lv_name_7_0= ruleString0 )
                    // InternalCcsl.g:3858:6: lv_name_7_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getMethod_ImplAccess().getNameString0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_name_7_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethod_ImplRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:3876:3: (otherlv_8= 'returnType' ( ( ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==70) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCcsl.g:3877:4: otherlv_8= 'returnType' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,70,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getMethod_ImplAccess().getReturnTypeKeyword_6_0());
                    			
                    // InternalCcsl.g:3881:4: ( ( ruleEString ) )
                    // InternalCcsl.g:3882:5: ( ruleEString )
                    {
                    // InternalCcsl.g:3882:5: ( ruleEString )
                    // InternalCcsl.g:3883:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethod_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethod_ImplAccess().getReturnTypeDataTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:3898:3: (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==29) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCcsl.g:3899:4: otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethod_ImplAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getMethod_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCcsl.g:3907:4: ( (lv_properties_12_0= ruleProperty ) )
                    // InternalCcsl.g:3908:5: (lv_properties_12_0= ruleProperty )
                    {
                    // InternalCcsl.g:3908:5: (lv_properties_12_0= ruleProperty )
                    // InternalCcsl.g:3909:6: lv_properties_12_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getMethod_ImplAccess().getPropertiesPropertyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_12_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethod_ImplRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_12_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:3926:4: (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==16) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalCcsl.g:3927:5: otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getMethod_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCcsl.g:3931:5: ( (lv_properties_14_0= ruleProperty ) )
                    	    // InternalCcsl.g:3932:6: (lv_properties_14_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:3932:6: (lv_properties_14_0= ruleProperty )
                    	    // InternalCcsl.g:3933:7: lv_properties_14_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethod_ImplAccess().getPropertiesPropertyParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_14_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethod_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_14_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_63); 

                    				newLeafNode(otherlv_15, grammarAccess.getMethod_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:3956:3: (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==71) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalCcsl.g:3957:4: otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getMethod_ImplAccess().getStatementsKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_17, grammarAccess.getMethod_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCcsl.g:3965:4: ( (lv_statements_18_0= ruleStatement ) )
                    // InternalCcsl.g:3966:5: (lv_statements_18_0= ruleStatement )
                    {
                    // InternalCcsl.g:3966:5: (lv_statements_18_0= ruleStatement )
                    // InternalCcsl.g:3967:6: lv_statements_18_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getMethod_ImplAccess().getStatementsStatementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_statements_18_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethod_ImplRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_18_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:3984:4: (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==16) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalCcsl.g:3985:5: otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getMethod_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCcsl.g:3989:5: ( (lv_statements_20_0= ruleStatement ) )
                    	    // InternalCcsl.g:3990:6: (lv_statements_20_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:3990:6: (lv_statements_20_0= ruleStatement )
                    	    // InternalCcsl.g:3991:7: lv_statements_20_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethod_ImplAccess().getStatementsStatementParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_statements_20_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethod_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_20_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_65); 

                    				newLeafNode(otherlv_21, grammarAccess.getMethod_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:4014:3: (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==72) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalCcsl.g:4015:4: otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getMethod_ImplAccess().getParamsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_66); 

                    				newLeafNode(otherlv_23, grammarAccess.getMethod_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCcsl.g:4023:4: ( (lv_params_24_0= ruleVariable ) )
                    // InternalCcsl.g:4024:5: (lv_params_24_0= ruleVariable )
                    {
                    // InternalCcsl.g:4024:5: (lv_params_24_0= ruleVariable )
                    // InternalCcsl.g:4025:6: lv_params_24_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getMethod_ImplAccess().getParamsVariableParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_params_24_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethod_ImplRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_24_0,
                    							"org.ccsl.xtext.Ccsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:4042:4: (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==16) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalCcsl.g:4043:5: otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) )
                    	    {
                    	    otherlv_25=(Token)match(input,16,FOLLOW_66); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getMethod_ImplAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCcsl.g:4047:5: ( (lv_params_26_0= ruleVariable ) )
                    	    // InternalCcsl.g:4048:6: (lv_params_26_0= ruleVariable )
                    	    {
                    	    // InternalCcsl.g:4048:6: (lv_params_26_0= ruleVariable )
                    	    // InternalCcsl.g:4049:7: lv_params_26_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethod_ImplAccess().getParamsVariableParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_params_26_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethod_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_26_0,
                    	    								"org.ccsl.xtext.Ccsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_27, grammarAccess.getMethod_ImplAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getMethod_ImplAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleMethod_Impl"


    // $ANTLR start "entryRuleStatement_Impl"
    // InternalCcsl.g:4080:1: entryRuleStatement_Impl returns [EObject current=null] : iv_ruleStatement_Impl= ruleStatement_Impl EOF ;
    public final EObject entryRuleStatement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_Impl = null;


        try {
            // InternalCcsl.g:4080:55: (iv_ruleStatement_Impl= ruleStatement_Impl EOF )
            // InternalCcsl.g:4081:2: iv_ruleStatement_Impl= ruleStatement_Impl EOF
            {
             newCompositeNode(grammarAccess.getStatement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement_Impl=ruleStatement_Impl();

            state._fsp--;

             current =iv_ruleStatement_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement_Impl"


    // $ANTLR start "ruleStatement_Impl"
    // InternalCcsl.g:4087:1: ruleStatement_Impl returns [EObject current=null] : ( () otherlv_1= 'Statement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleStatement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:4093:2: ( ( () otherlv_1= 'Statement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalCcsl.g:4094:2: ( () otherlv_1= 'Statement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalCcsl.g:4094:2: ( () otherlv_1= 'Statement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalCcsl.g:4095:3: () otherlv_1= 'Statement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalCcsl.g:4095:3: ()
            // InternalCcsl.g:4096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatement_ImplAccess().getStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getStatement_ImplAccess().getStatementKeyword_1());
            		
            // InternalCcsl.g:4106:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:4107:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:4107:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:4108:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getStatement_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatement_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getStatement_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:4129:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==28) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalCcsl.g:4130:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatement_ImplAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:4134:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:4135:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:4135:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:4136:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getStatement_ImplAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatement_ImplRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:4154:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==29) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalCcsl.g:4155:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatement_ImplAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getStatement_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:4163:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:4164:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:4164:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:4165:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getStatement_ImplAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatement_ImplRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:4182:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==16) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalCcsl.g:4183:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getStatement_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:4187:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:4188:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:4188:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:4189:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getStatement_ImplAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStatement_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getStatement_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getStatement_ImplAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleStatement_Impl"


    // $ANTLR start "entryRuleVariable_Impl"
    // InternalCcsl.g:4220:1: entryRuleVariable_Impl returns [EObject current=null] : iv_ruleVariable_Impl= ruleVariable_Impl EOF ;
    public final EObject entryRuleVariable_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_Impl = null;


        try {
            // InternalCcsl.g:4220:54: (iv_ruleVariable_Impl= ruleVariable_Impl EOF )
            // InternalCcsl.g:4221:2: iv_ruleVariable_Impl= ruleVariable_Impl EOF
            {
             newCompositeNode(grammarAccess.getVariable_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable_Impl=ruleVariable_Impl();

            state._fsp--;

             current =iv_ruleVariable_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable_Impl"


    // $ANTLR start "ruleVariable_Impl"
    // InternalCcsl.g:4227:1: ruleVariable_Impl returns [EObject current=null] : ( () otherlv_1= 'Variable' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'initialValue' ( (lv_initialValue_17_0= ruleStatement ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleVariable_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_properties_14_0 = null;

        EObject lv_initialValue_17_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:4233:2: ( ( () otherlv_1= 'Variable' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'initialValue' ( (lv_initialValue_17_0= ruleStatement ) ) )? otherlv_18= '}' ) )
            // InternalCcsl.g:4234:2: ( () otherlv_1= 'Variable' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'initialValue' ( (lv_initialValue_17_0= ruleStatement ) ) )? otherlv_18= '}' )
            {
            // InternalCcsl.g:4234:2: ( () otherlv_1= 'Variable' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'initialValue' ( (lv_initialValue_17_0= ruleStatement ) ) )? otherlv_18= '}' )
            // InternalCcsl.g:4235:3: () otherlv_1= 'Variable' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'initialValue' ( (lv_initialValue_17_0= ruleStatement ) ) )? otherlv_18= '}'
            {
            // InternalCcsl.g:4235:3: ()
            // InternalCcsl.g:4236:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariable_ImplAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_ImplAccess().getVariableKeyword_1());
            		
            // InternalCcsl.g:4246:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:4247:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:4247:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:4248:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getVariable_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_3, grammarAccess.getVariable_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:4269:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==28) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalCcsl.g:4270:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariable_ImplAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:4274:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:4275:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:4275:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:4276:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getVariable_ImplAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariable_ImplRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:4294:3: (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==31) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalCcsl.g:4295:4: otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariable_ImplAccess().getNameKeyword_5_0());
                    			
                    // InternalCcsl.g:4299:4: ( (lv_name_7_0= ruleString0 ) )
                    // InternalCcsl.g:4300:5: (lv_name_7_0= ruleString0 )
                    {
                    // InternalCcsl.g:4300:5: (lv_name_7_0= ruleString0 )
                    // InternalCcsl.g:4301:6: lv_name_7_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getVariable_ImplAccess().getNameString0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_name_7_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariable_ImplRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:4319:3: (otherlv_8= 'type' ( ( ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==51) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalCcsl.g:4320:4: otherlv_8= 'type' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getVariable_ImplAccess().getTypeKeyword_6_0());
                    			
                    // InternalCcsl.g:4324:4: ( ( ruleEString ) )
                    // InternalCcsl.g:4325:5: ( ruleEString )
                    {
                    // InternalCcsl.g:4325:5: ( ruleEString )
                    // InternalCcsl.g:4326:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariable_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariable_ImplAccess().getTypeDataTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:4341:3: (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==29) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalCcsl.g:4342:4: otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getVariable_ImplAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getVariable_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCcsl.g:4350:4: ( (lv_properties_12_0= ruleProperty ) )
                    // InternalCcsl.g:4351:5: (lv_properties_12_0= ruleProperty )
                    {
                    // InternalCcsl.g:4351:5: (lv_properties_12_0= ruleProperty )
                    // InternalCcsl.g:4352:6: lv_properties_12_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getVariable_ImplAccess().getPropertiesPropertyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_12_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariable_ImplRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_12_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:4369:4: (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==16) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalCcsl.g:4370:5: otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getVariable_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCcsl.g:4374:5: ( (lv_properties_14_0= ruleProperty ) )
                    	    // InternalCcsl.g:4375:6: (lv_properties_14_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:4375:6: (lv_properties_14_0= ruleProperty )
                    	    // InternalCcsl.g:4376:7: lv_properties_14_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariable_ImplAccess().getPropertiesPropertyParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_14_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariable_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_14_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_71); 

                    				newLeafNode(otherlv_15, grammarAccess.getVariable_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:4399:3: (otherlv_16= 'initialValue' ( (lv_initialValue_17_0= ruleStatement ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==75) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalCcsl.g:4400:4: otherlv_16= 'initialValue' ( (lv_initialValue_17_0= ruleStatement ) )
                    {
                    otherlv_16=(Token)match(input,75,FOLLOW_64); 

                    				newLeafNode(otherlv_16, grammarAccess.getVariable_ImplAccess().getInitialValueKeyword_8_0());
                    			
                    // InternalCcsl.g:4404:4: ( (lv_initialValue_17_0= ruleStatement ) )
                    // InternalCcsl.g:4405:5: (lv_initialValue_17_0= ruleStatement )
                    {
                    // InternalCcsl.g:4405:5: (lv_initialValue_17_0= ruleStatement )
                    // InternalCcsl.g:4406:6: lv_initialValue_17_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getVariable_ImplAccess().getInitialValueStatementParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_initialValue_17_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariable_ImplRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_17_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getVariable_ImplAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleVariable_Impl"


    // $ANTLR start "entryRuleDataType_Impl"
    // InternalCcsl.g:4432:1: entryRuleDataType_Impl returns [EObject current=null] : iv_ruleDataType_Impl= ruleDataType_Impl EOF ;
    public final EObject entryRuleDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType_Impl = null;


        try {
            // InternalCcsl.g:4432:54: (iv_ruleDataType_Impl= ruleDataType_Impl EOF )
            // InternalCcsl.g:4433:2: iv_ruleDataType_Impl= ruleDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getDataType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType_Impl=ruleDataType_Impl();

            state._fsp--;

             current =iv_ruleDataType_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataType_Impl"


    // $ANTLR start "ruleDataType_Impl"
    // InternalCcsl.g:4439:1: ruleDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'DataType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) ;
    public final EObject ruleDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:4445:2: ( ( () otherlv_1= 'DataType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) )
            // InternalCcsl.g:4446:2: ( () otherlv_1= 'DataType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            {
            // InternalCcsl.g:4446:2: ( () otherlv_1= 'DataType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            // InternalCcsl.g:4447:3: () otherlv_1= 'DataType' ( (lv_uniqueName_2_0= ruleString0 ) )
            {
            // InternalCcsl.g:4447:3: ()
            // InternalCcsl.g:4448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataType_ImplAccess().getDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDataType_ImplAccess().getDataTypeKeyword_1());
            		
            // InternalCcsl.g:4458:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:4459:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:4459:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:4460:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getDataType_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataType_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
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
    // $ANTLR end "ruleDataType_Impl"


    // $ANTLR start "entryRuleConstructor"
    // InternalCcsl.g:4481:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalCcsl.g:4481:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalCcsl.g:4482:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalCcsl.g:4488:1: ruleConstructor returns [EObject current=null] : ( () otherlv_1= 'Constructor' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_properties_14_0 = null;

        EObject lv_statements_18_0 = null;

        EObject lv_statements_20_0 = null;

        EObject lv_params_24_0 = null;

        EObject lv_params_26_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:4494:2: ( ( () otherlv_1= 'Constructor' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalCcsl.g:4495:2: ( () otherlv_1= 'Constructor' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalCcsl.g:4495:2: ( () otherlv_1= 'Constructor' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalCcsl.g:4496:3: () otherlv_1= 'Constructor' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'returnType' ( ( ruleEString ) ) )? (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )? (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalCcsl.g:4496:3: ()
            // InternalCcsl.g:4497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getConstructorKeyword_1());
            		
            // InternalCcsl.g:4507:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:4508:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:4508:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:4509:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getConstructorAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructorRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:4530:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==28) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalCcsl.g:4531:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:4535:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:4536:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:4536:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:4537:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:4555:3: (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==31) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalCcsl.g:4556:4: otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getNameKeyword_5_0());
                    			
                    // InternalCcsl.g:4560:4: ( (lv_name_7_0= ruleString0 ) )
                    // InternalCcsl.g:4561:5: (lv_name_7_0= ruleString0 )
                    {
                    // InternalCcsl.g:4561:5: (lv_name_7_0= ruleString0 )
                    // InternalCcsl.g:4562:6: lv_name_7_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getNameString0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_name_7_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:4580:3: (otherlv_8= 'returnType' ( ( ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==70) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalCcsl.g:4581:4: otherlv_8= 'returnType' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,70,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstructorAccess().getReturnTypeKeyword_6_0());
                    			
                    // InternalCcsl.g:4585:4: ( ( ruleEString ) )
                    // InternalCcsl.g:4586:5: ( ruleEString )
                    {
                    // InternalCcsl.g:4586:5: ( ruleEString )
                    // InternalCcsl.g:4587:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstructorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConstructorAccess().getReturnTypeDataTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:4602:3: (otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==29) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalCcsl.g:4603:4: otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstructorAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCcsl.g:4611:4: ( (lv_properties_12_0= ruleProperty ) )
                    // InternalCcsl.g:4612:5: (lv_properties_12_0= ruleProperty )
                    {
                    // InternalCcsl.g:4612:5: (lv_properties_12_0= ruleProperty )
                    // InternalCcsl.g:4613:6: lv_properties_12_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getPropertiesPropertyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_12_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_12_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:4630:4: (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==16) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalCcsl.g:4631:5: otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getConstructorAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCcsl.g:4635:5: ( (lv_properties_14_0= ruleProperty ) )
                    	    // InternalCcsl.g:4636:6: (lv_properties_14_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:4636:6: (lv_properties_14_0= ruleProperty )
                    	    // InternalCcsl.g:4637:7: lv_properties_14_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstructorAccess().getPropertiesPropertyParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_14_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_14_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_63); 

                    				newLeafNode(otherlv_15, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:4660:3: (otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==71) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalCcsl.g:4661:4: otherlv_16= 'statements' otherlv_17= '{' ( (lv_statements_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getConstructorAccess().getStatementsKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_17, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCcsl.g:4669:4: ( (lv_statements_18_0= ruleStatement ) )
                    // InternalCcsl.g:4670:5: (lv_statements_18_0= ruleStatement )
                    {
                    // InternalCcsl.g:4670:5: (lv_statements_18_0= ruleStatement )
                    // InternalCcsl.g:4671:6: lv_statements_18_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getStatementsStatementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_statements_18_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_18_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:4688:4: (otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==16) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalCcsl.g:4689:5: otherlv_19= ',' ( (lv_statements_20_0= ruleStatement ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getConstructorAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCcsl.g:4693:5: ( (lv_statements_20_0= ruleStatement ) )
                    	    // InternalCcsl.g:4694:6: (lv_statements_20_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:4694:6: (lv_statements_20_0= ruleStatement )
                    	    // InternalCcsl.g:4695:7: lv_statements_20_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstructorAccess().getStatementsStatementParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_statements_20_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_20_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_65); 

                    				newLeafNode(otherlv_21, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:4718:3: (otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==72) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalCcsl.g:4719:4: otherlv_22= 'params' otherlv_23= '{' ( (lv_params_24_0= ruleVariable ) ) (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getConstructorAccess().getParamsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_66); 

                    				newLeafNode(otherlv_23, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCcsl.g:4727:4: ( (lv_params_24_0= ruleVariable ) )
                    // InternalCcsl.g:4728:5: (lv_params_24_0= ruleVariable )
                    {
                    // InternalCcsl.g:4728:5: (lv_params_24_0= ruleVariable )
                    // InternalCcsl.g:4729:6: lv_params_24_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getParamsVariableParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_params_24_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_24_0,
                    							"org.ccsl.xtext.Ccsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:4746:4: (otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==16) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalCcsl.g:4747:5: otherlv_25= ',' ( (lv_params_26_0= ruleVariable ) )
                    	    {
                    	    otherlv_25=(Token)match(input,16,FOLLOW_66); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getConstructorAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCcsl.g:4751:5: ( (lv_params_26_0= ruleVariable ) )
                    	    // InternalCcsl.g:4752:6: (lv_params_26_0= ruleVariable )
                    	    {
                    	    // InternalCcsl.g:4752:6: (lv_params_26_0= ruleVariable )
                    	    // InternalCcsl.g:4753:7: lv_params_26_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstructorAccess().getParamsVariableParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_params_26_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_26_0,
                    	    								"org.ccsl.xtext.Ccsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_27, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleNamedElementAccess"
    // InternalCcsl.g:4784:1: entryRuleNamedElementAccess returns [EObject current=null] : iv_ruleNamedElementAccess= ruleNamedElementAccess EOF ;
    public final EObject entryRuleNamedElementAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElementAccess = null;


        try {
            // InternalCcsl.g:4784:59: (iv_ruleNamedElementAccess= ruleNamedElementAccess EOF )
            // InternalCcsl.g:4785:2: iv_ruleNamedElementAccess= ruleNamedElementAccess EOF
            {
             newCompositeNode(grammarAccess.getNamedElementAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedElementAccess=ruleNamedElementAccess();

            state._fsp--;

             current =iv_ruleNamedElementAccess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamedElementAccess"


    // $ANTLR start "ruleNamedElementAccess"
    // InternalCcsl.g:4791:1: ruleNamedElementAccess returns [EObject current=null] : ( () otherlv_1= 'NamedElementAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleNamedElementAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:4797:2: ( ( () otherlv_1= 'NamedElementAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalCcsl.g:4798:2: ( () otherlv_1= 'NamedElementAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalCcsl.g:4798:2: ( () otherlv_1= 'NamedElementAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalCcsl.g:4799:3: () otherlv_1= 'NamedElementAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalCcsl.g:4799:3: ()
            // InternalCcsl.g:4800:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedElementAccessAccess().getNamedElementAccessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedElementAccessAccess().getNamedElementAccessKeyword_1());
            		
            // InternalCcsl.g:4810:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:4811:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:4811:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:4812:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getNamedElementAccessAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedElementAccessRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getNamedElementAccessAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:4833:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==28) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalCcsl.g:4834:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getNamedElementAccessAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:4838:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:4839:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:4839:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:4840:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getNamedElementAccessAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedElementAccessRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:4858:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==79) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalCcsl.g:4859:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,79,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getNamedElementAccessAccess().getFromKeyword_5_0());
                    			
                    // InternalCcsl.g:4863:4: ( ( ruleEString ) )
                    // InternalCcsl.g:4864:5: ( ruleEString )
                    {
                    // InternalCcsl.g:4864:5: ( ruleEString )
                    // InternalCcsl.g:4865:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedElementAccessRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNamedElementAccessAccess().getFromStatementCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:4880:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==29) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalCcsl.g:4881:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getNamedElementAccessAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getNamedElementAccessAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:4889:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:4890:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:4890:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:4891:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getNamedElementAccessAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedElementAccessRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:4908:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==16) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalCcsl.g:4909:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getNamedElementAccessAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:4913:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:4914:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:4914:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:4915:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getNamedElementAccessAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNamedElementAccessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getNamedElementAccessAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getNamedElementAccessAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleNamedElementAccess"


    // $ANTLR start "entryRuleVariableAccess"
    // InternalCcsl.g:4946:1: entryRuleVariableAccess returns [EObject current=null] : iv_ruleVariableAccess= ruleVariableAccess EOF ;
    public final EObject entryRuleVariableAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAccess = null;


        try {
            // InternalCcsl.g:4946:55: (iv_ruleVariableAccess= ruleVariableAccess EOF )
            // InternalCcsl.g:4947:2: iv_ruleVariableAccess= ruleVariableAccess EOF
            {
             newCompositeNode(grammarAccess.getVariableAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAccess=ruleVariableAccess();

            state._fsp--;

             current =iv_ruleVariableAccess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableAccess"


    // $ANTLR start "ruleVariableAccess"
    // InternalCcsl.g:4953:1: ruleVariableAccess returns [EObject current=null] : ( () otherlv_1= 'VariableAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleVariableAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_from_15_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:4959:2: ( ( () otherlv_1= 'VariableAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' ) )
            // InternalCcsl.g:4960:2: ( () otherlv_1= 'VariableAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' )
            {
            // InternalCcsl.g:4960:2: ( () otherlv_1= 'VariableAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' )
            // InternalCcsl.g:4961:3: () otherlv_1= 'VariableAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}'
            {
            // InternalCcsl.g:4961:3: ()
            // InternalCcsl.g:4962:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccessAccess().getVariableAccessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccessAccess().getVariableAccessKeyword_1());
            		
            // InternalCcsl.g:4972:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:4973:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:4973:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:4974:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getVariableAccessAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableAccessRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccessAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:4995:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==28) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalCcsl.g:4996:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccessAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:5000:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:5001:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:5001:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:5002:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getVariableAccessAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableAccessRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:5020:3: (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==81) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalCcsl.g:5021:4: otherlv_6= 'elementAccessed' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,81,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariableAccessAccess().getElementAccessedKeyword_5_0());
                    			
                    // InternalCcsl.g:5025:4: ( ( ruleEString ) )
                    // InternalCcsl.g:5026:5: ( ruleEString )
                    {
                    // InternalCcsl.g:5026:5: ( ruleEString )
                    // InternalCcsl.g:5027:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableAccessRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableAccessAccess().getElementAccessedElementCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:5042:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==29) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalCcsl.g:5043:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getVariableAccessAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getVariableAccessAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:5051:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:5052:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:5052:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:5053:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getVariableAccessAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableAccessRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:5070:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==16) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalCcsl.g:5071:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getVariableAccessAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:5075:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:5076:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:5076:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:5077:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableAccessAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableAccessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_76); 

                    				newLeafNode(otherlv_13, grammarAccess.getVariableAccessAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:5100:3: (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==79) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalCcsl.g:5101:4: otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) )
                    {
                    otherlv_14=(Token)match(input,79,FOLLOW_64); 

                    				newLeafNode(otherlv_14, grammarAccess.getVariableAccessAccess().getFromKeyword_7_0());
                    			
                    // InternalCcsl.g:5105:4: ( (lv_from_15_0= ruleStatement ) )
                    // InternalCcsl.g:5106:5: (lv_from_15_0= ruleStatement )
                    {
                    // InternalCcsl.g:5106:5: (lv_from_15_0= ruleStatement )
                    // InternalCcsl.g:5107:6: lv_from_15_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getVariableAccessAccess().getFromStatementParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_from_15_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableAccessRule());
                    						}
                    						set(
                    							current,
                    							"from",
                    							lv_from_15_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getVariableAccessAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleVariableAccess"


    // $ANTLR start "entryRuleDataTypeAccess"
    // InternalCcsl.g:5133:1: entryRuleDataTypeAccess returns [EObject current=null] : iv_ruleDataTypeAccess= ruleDataTypeAccess EOF ;
    public final EObject entryRuleDataTypeAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeAccess = null;


        try {
            // InternalCcsl.g:5133:55: (iv_ruleDataTypeAccess= ruleDataTypeAccess EOF )
            // InternalCcsl.g:5134:2: iv_ruleDataTypeAccess= ruleDataTypeAccess EOF
            {
             newCompositeNode(grammarAccess.getDataTypeAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeAccess=ruleDataTypeAccess();

            state._fsp--;

             current =iv_ruleDataTypeAccess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataTypeAccess"


    // $ANTLR start "ruleDataTypeAccess"
    // InternalCcsl.g:5140:1: ruleDataTypeAccess returns [EObject current=null] : ( () otherlv_1= 'DataTypeAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleDataTypeAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_from_15_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:5146:2: ( ( () otherlv_1= 'DataTypeAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' ) )
            // InternalCcsl.g:5147:2: ( () otherlv_1= 'DataTypeAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' )
            {
            // InternalCcsl.g:5147:2: ( () otherlv_1= 'DataTypeAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' )
            // InternalCcsl.g:5148:3: () otherlv_1= 'DataTypeAccess' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}'
            {
            // InternalCcsl.g:5148:3: ()
            // InternalCcsl.g:5149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccessAccess().getDataTypeAccessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccessAccess().getDataTypeAccessKeyword_1());
            		
            // InternalCcsl.g:5159:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:5160:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:5160:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:5161:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getDataTypeAccessAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeAccessRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_3, grammarAccess.getDataTypeAccessAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:5182:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==28) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalCcsl.g:5183:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataTypeAccessAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:5187:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:5188:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:5188:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:5189:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccessAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeAccessRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:5207:3: (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==81) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalCcsl.g:5208:4: otherlv_6= 'elementAccessed' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,81,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataTypeAccessAccess().getElementAccessedKeyword_5_0());
                    			
                    // InternalCcsl.g:5212:4: ( ( ruleEString ) )
                    // InternalCcsl.g:5213:5: ( ruleEString )
                    {
                    // InternalCcsl.g:5213:5: ( ruleEString )
                    // InternalCcsl.g:5214:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeAccessRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataTypeAccessAccess().getElementAccessedElementCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:5229:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==29) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalCcsl.g:5230:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataTypeAccessAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getDataTypeAccessAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:5238:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:5239:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:5239:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:5240:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccessAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeAccessRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:5257:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==16) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalCcsl.g:5258:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getDataTypeAccessAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:5262:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:5263:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:5263:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:5264:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataTypeAccessAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataTypeAccessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_76); 

                    				newLeafNode(otherlv_13, grammarAccess.getDataTypeAccessAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:5287:3: (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==79) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalCcsl.g:5288:4: otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) )
                    {
                    otherlv_14=(Token)match(input,79,FOLLOW_64); 

                    				newLeafNode(otherlv_14, grammarAccess.getDataTypeAccessAccess().getFromKeyword_7_0());
                    			
                    // InternalCcsl.g:5292:4: ( (lv_from_15_0= ruleStatement ) )
                    // InternalCcsl.g:5293:5: (lv_from_15_0= ruleStatement )
                    {
                    // InternalCcsl.g:5293:5: (lv_from_15_0= ruleStatement )
                    // InternalCcsl.g:5294:6: lv_from_15_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccessAccess().getFromStatementParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_from_15_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeAccessRule());
                    						}
                    						set(
                    							current,
                    							"from",
                    							lv_from_15_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDataTypeAccessAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDataTypeAccess"


    // $ANTLR start "entryRuleMethodInvocation_Impl"
    // InternalCcsl.g:5320:1: entryRuleMethodInvocation_Impl returns [EObject current=null] : iv_ruleMethodInvocation_Impl= ruleMethodInvocation_Impl EOF ;
    public final EObject entryRuleMethodInvocation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodInvocation_Impl = null;


        try {
            // InternalCcsl.g:5320:62: (iv_ruleMethodInvocation_Impl= ruleMethodInvocation_Impl EOF )
            // InternalCcsl.g:5321:2: iv_ruleMethodInvocation_Impl= ruleMethodInvocation_Impl EOF
            {
             newCompositeNode(grammarAccess.getMethodInvocation_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodInvocation_Impl=ruleMethodInvocation_Impl();

            state._fsp--;

             current =iv_ruleMethodInvocation_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodInvocation_Impl"


    // $ANTLR start "ruleMethodInvocation_Impl"
    // InternalCcsl.g:5327:1: ruleMethodInvocation_Impl returns [EObject current=null] : ( () otherlv_1= 'MethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleMethodInvocation_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_from_15_0 = null;

        EObject lv_args_18_0 = null;

        EObject lv_args_20_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:5333:2: ( ( () otherlv_1= 'MethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalCcsl.g:5334:2: ( () otherlv_1= 'MethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalCcsl.g:5334:2: ( () otherlv_1= 'MethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalCcsl.g:5335:3: () otherlv_1= 'MethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalCcsl.g:5335:3: ()
            // InternalCcsl.g:5336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodInvocation_ImplAccess().getMethodInvocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodInvocation_ImplAccess().getMethodInvocationKeyword_1());
            		
            // InternalCcsl.g:5346:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:5347:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:5347:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:5348:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getMethodInvocation_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodInvocation_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodInvocation_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:5369:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==28) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalCcsl.g:5370:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodInvocation_ImplAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:5374:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:5375:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:5375:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:5376:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getMethodInvocation_ImplAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodInvocation_ImplRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:5394:3: (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==81) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalCcsl.g:5395:4: otherlv_6= 'elementAccessed' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,81,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getMethodInvocation_ImplAccess().getElementAccessedKeyword_5_0());
                    			
                    // InternalCcsl.g:5399:4: ( ( ruleEString ) )
                    // InternalCcsl.g:5400:5: ( ruleEString )
                    {
                    // InternalCcsl.g:5400:5: ( ruleEString )
                    // InternalCcsl.g:5401:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodInvocation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodInvocation_ImplAccess().getElementAccessedElementCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:5416:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==29) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalCcsl.g:5417:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMethodInvocation_ImplAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getMethodInvocation_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:5425:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:5426:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:5426:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:5427:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getMethodInvocation_ImplAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodInvocation_ImplRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:5444:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==16) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalCcsl.g:5445:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMethodInvocation_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:5449:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:5450:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:5450:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:5451:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodInvocation_ImplAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodInvocation_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_80); 

                    				newLeafNode(otherlv_13, grammarAccess.getMethodInvocation_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:5474:3: (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==79) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalCcsl.g:5475:4: otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) )
                    {
                    otherlv_14=(Token)match(input,79,FOLLOW_64); 

                    				newLeafNode(otherlv_14, grammarAccess.getMethodInvocation_ImplAccess().getFromKeyword_7_0());
                    			
                    // InternalCcsl.g:5479:4: ( (lv_from_15_0= ruleStatement ) )
                    // InternalCcsl.g:5480:5: (lv_from_15_0= ruleStatement )
                    {
                    // InternalCcsl.g:5480:5: (lv_from_15_0= ruleStatement )
                    // InternalCcsl.g:5481:6: lv_from_15_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getMethodInvocation_ImplAccess().getFromStatementParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_from_15_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodInvocation_ImplRule());
                    						}
                    						set(
                    							current,
                    							"from",
                    							lv_from_15_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:5499:3: (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==84) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalCcsl.g:5500:4: otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,84,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getMethodInvocation_ImplAccess().getArgsKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_17, grammarAccess.getMethodInvocation_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCcsl.g:5508:4: ( (lv_args_18_0= ruleStatement ) )
                    // InternalCcsl.g:5509:5: (lv_args_18_0= ruleStatement )
                    {
                    // InternalCcsl.g:5509:5: (lv_args_18_0= ruleStatement )
                    // InternalCcsl.g:5510:6: lv_args_18_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getMethodInvocation_ImplAccess().getArgsStatementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_args_18_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodInvocation_ImplRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_18_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:5527:4: (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==16) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalCcsl.g:5528:5: otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getMethodInvocation_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCcsl.g:5532:5: ( (lv_args_20_0= ruleStatement ) )
                    	    // InternalCcsl.g:5533:6: (lv_args_20_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:5533:6: (lv_args_20_0= ruleStatement )
                    	    // InternalCcsl.g:5534:7: lv_args_20_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodInvocation_ImplAccess().getArgsStatementParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_args_20_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodInvocation_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_20_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_21, grammarAccess.getMethodInvocation_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getMethodInvocation_ImplAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleMethodInvocation_Impl"


    // $ANTLR start "entryRuleControlFlow"
    // InternalCcsl.g:5565:1: entryRuleControlFlow returns [EObject current=null] : iv_ruleControlFlow= ruleControlFlow EOF ;
    public final EObject entryRuleControlFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFlow = null;


        try {
            // InternalCcsl.g:5565:52: (iv_ruleControlFlow= ruleControlFlow EOF )
            // InternalCcsl.g:5566:2: iv_ruleControlFlow= ruleControlFlow EOF
            {
             newCompositeNode(grammarAccess.getControlFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlFlow=ruleControlFlow();

            state._fsp--;

             current =iv_ruleControlFlow; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleControlFlow"


    // $ANTLR start "ruleControlFlow"
    // InternalCcsl.g:5572:1: ruleControlFlow returns [EObject current=null] : ( () otherlv_1= 'ControlFlow' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'condition' ( (lv_condition_13_0= ruleStatement ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleControlFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_condition_13_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:5578:2: ( ( () otherlv_1= 'ControlFlow' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'condition' ( (lv_condition_13_0= ruleStatement ) ) )? otherlv_14= '}' ) )
            // InternalCcsl.g:5579:2: ( () otherlv_1= 'ControlFlow' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'condition' ( (lv_condition_13_0= ruleStatement ) ) )? otherlv_14= '}' )
            {
            // InternalCcsl.g:5579:2: ( () otherlv_1= 'ControlFlow' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'condition' ( (lv_condition_13_0= ruleStatement ) ) )? otherlv_14= '}' )
            // InternalCcsl.g:5580:3: () otherlv_1= 'ControlFlow' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'condition' ( (lv_condition_13_0= ruleStatement ) ) )? otherlv_14= '}'
            {
            // InternalCcsl.g:5580:3: ()
            // InternalCcsl.g:5581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getControlFlowAccess().getControlFlowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getControlFlowAccess().getControlFlowKeyword_1());
            		
            // InternalCcsl.g:5591:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:5592:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:5592:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:5593:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getControlFlowAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControlFlowRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_82); 

            			newLeafNode(otherlv_3, grammarAccess.getControlFlowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:5614:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==28) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalCcsl.g:5615:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getControlFlowAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:5619:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:5620:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:5620:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:5621:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getControlFlowAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControlFlowRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:5639:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==29) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalCcsl.g:5640:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getControlFlowAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getControlFlowAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:5648:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:5649:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:5649:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:5650:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getControlFlowAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControlFlowRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:5667:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==16) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalCcsl.g:5668:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getControlFlowAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:5672:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:5673:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:5673:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:5674:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getControlFlowAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getControlFlowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_84); 

                    				newLeafNode(otherlv_11, grammarAccess.getControlFlowAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:5697:3: (otherlv_12= 'condition' ( (lv_condition_13_0= ruleStatement ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==86) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalCcsl.g:5698:4: otherlv_12= 'condition' ( (lv_condition_13_0= ruleStatement ) )
                    {
                    otherlv_12=(Token)match(input,86,FOLLOW_64); 

                    				newLeafNode(otherlv_12, grammarAccess.getControlFlowAccess().getConditionKeyword_6_0());
                    			
                    // InternalCcsl.g:5702:4: ( (lv_condition_13_0= ruleStatement ) )
                    // InternalCcsl.g:5703:5: (lv_condition_13_0= ruleStatement )
                    {
                    // InternalCcsl.g:5703:5: (lv_condition_13_0= ruleStatement )
                    // InternalCcsl.g:5704:6: lv_condition_13_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getControlFlowAccess().getConditionStatementParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_condition_13_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControlFlowRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_13_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getControlFlowAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleControlFlow"


    // $ANTLR start "entryRuleBlock"
    // InternalCcsl.g:5730:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalCcsl.g:5730:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalCcsl.g:5731:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalCcsl.g:5737:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= 'Block' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'statements' otherlv_13= '{' ( (lv_statements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_statements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_statements_14_0 = null;

        EObject lv_statements_16_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:5743:2: ( ( () otherlv_1= 'Block' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'statements' otherlv_13= '{' ( (lv_statements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_statements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalCcsl.g:5744:2: ( () otherlv_1= 'Block' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'statements' otherlv_13= '{' ( (lv_statements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_statements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalCcsl.g:5744:2: ( () otherlv_1= 'Block' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'statements' otherlv_13= '{' ( (lv_statements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_statements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalCcsl.g:5745:3: () otherlv_1= 'Block' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'statements' otherlv_13= '{' ( (lv_statements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_statements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalCcsl.g:5745:3: ()
            // InternalCcsl.g:5746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getBlockKeyword_1());
            		
            // InternalCcsl.g:5756:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:5757:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:5757:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:5758:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:5779:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==28) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalCcsl.g:5780:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:5784:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:5785:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:5785:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:5786:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getBlockAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:5804:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==29) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalCcsl.g:5805:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:5813:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:5814:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:5814:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:5815:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getBlockAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:5832:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==16) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalCcsl.g:5833:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getBlockAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:5837:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:5838:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:5838:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:5839:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlockAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_87); 

                    				newLeafNode(otherlv_11, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:5862:3: (otherlv_12= 'statements' otherlv_13= '{' ( (lv_statements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_statements_16_0= ruleStatement ) ) )* otherlv_17= '}' )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==71) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalCcsl.g:5863:4: otherlv_12= 'statements' otherlv_13= '{' ( (lv_statements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_statements_16_0= ruleStatement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getBlockAccess().getStatementsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_13, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:5871:4: ( (lv_statements_14_0= ruleStatement ) )
                    // InternalCcsl.g:5872:5: (lv_statements_14_0= ruleStatement )
                    {
                    // InternalCcsl.g:5872:5: (lv_statements_14_0= ruleStatement )
                    // InternalCcsl.g:5873:6: lv_statements_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_statements_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_14_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:5890:4: (otherlv_15= ',' ( (lv_statements_16_0= ruleStatement ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==16) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalCcsl.g:5891:5: otherlv_15= ',' ( (lv_statements_16_0= ruleStatement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getBlockAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:5895:5: ( (lv_statements_16_0= ruleStatement ) )
                    	    // InternalCcsl.g:5896:6: (lv_statements_16_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:5896:6: (lv_statements_16_0= ruleStatement )
                    	    // InternalCcsl.g:5897:7: lv_statements_16_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_statements_16_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_16_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleSuperMethodInvocation"
    // InternalCcsl.g:5928:1: entryRuleSuperMethodInvocation returns [EObject current=null] : iv_ruleSuperMethodInvocation= ruleSuperMethodInvocation EOF ;
    public final EObject entryRuleSuperMethodInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperMethodInvocation = null;


        try {
            // InternalCcsl.g:5928:62: (iv_ruleSuperMethodInvocation= ruleSuperMethodInvocation EOF )
            // InternalCcsl.g:5929:2: iv_ruleSuperMethodInvocation= ruleSuperMethodInvocation EOF
            {
             newCompositeNode(grammarAccess.getSuperMethodInvocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperMethodInvocation=ruleSuperMethodInvocation();

            state._fsp--;

             current =iv_ruleSuperMethodInvocation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSuperMethodInvocation"


    // $ANTLR start "ruleSuperMethodInvocation"
    // InternalCcsl.g:5935:1: ruleSuperMethodInvocation returns [EObject current=null] : ( () otherlv_1= 'SuperMethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleSuperMethodInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_from_15_0 = null;

        EObject lv_args_18_0 = null;

        EObject lv_args_20_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:5941:2: ( ( () otherlv_1= 'SuperMethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalCcsl.g:5942:2: ( () otherlv_1= 'SuperMethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalCcsl.g:5942:2: ( () otherlv_1= 'SuperMethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalCcsl.g:5943:3: () otherlv_1= 'SuperMethodInvocation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalCcsl.g:5943:3: ()
            // InternalCcsl.g:5944:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSuperMethodInvocationAccess().getSuperMethodInvocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,88,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSuperMethodInvocationAccess().getSuperMethodInvocationKeyword_1());
            		
            // InternalCcsl.g:5954:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:5955:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:5955:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:5956:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getSuperMethodInvocationAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperMethodInvocationRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getSuperMethodInvocationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:5977:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==28) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalCcsl.g:5978:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSuperMethodInvocationAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:5982:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:5983:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:5983:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:5984:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getSuperMethodInvocationAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuperMethodInvocationRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6002:3: (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==81) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalCcsl.g:6003:4: otherlv_6= 'elementAccessed' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,81,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getSuperMethodInvocationAccess().getElementAccessedKeyword_5_0());
                    			
                    // InternalCcsl.g:6007:4: ( ( ruleEString ) )
                    // InternalCcsl.g:6008:5: ( ruleEString )
                    {
                    // InternalCcsl.g:6008:5: ( ruleEString )
                    // InternalCcsl.g:6009:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSuperMethodInvocationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSuperMethodInvocationAccess().getElementAccessedElementCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6024:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==29) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalCcsl.g:6025:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSuperMethodInvocationAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getSuperMethodInvocationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:6033:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:6034:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:6034:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:6035:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getSuperMethodInvocationAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuperMethodInvocationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:6052:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==16) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalCcsl.g:6053:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSuperMethodInvocationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:6057:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:6058:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:6058:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:6059:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getSuperMethodInvocationAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSuperMethodInvocationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_80); 

                    				newLeafNode(otherlv_13, grammarAccess.getSuperMethodInvocationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:6082:3: (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==79) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalCcsl.g:6083:4: otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) )
                    {
                    otherlv_14=(Token)match(input,79,FOLLOW_64); 

                    				newLeafNode(otherlv_14, grammarAccess.getSuperMethodInvocationAccess().getFromKeyword_7_0());
                    			
                    // InternalCcsl.g:6087:4: ( (lv_from_15_0= ruleStatement ) )
                    // InternalCcsl.g:6088:5: (lv_from_15_0= ruleStatement )
                    {
                    // InternalCcsl.g:6088:5: (lv_from_15_0= ruleStatement )
                    // InternalCcsl.g:6089:6: lv_from_15_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getSuperMethodInvocationAccess().getFromStatementParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_from_15_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuperMethodInvocationRule());
                    						}
                    						set(
                    							current,
                    							"from",
                    							lv_from_15_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6107:3: (otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==84) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalCcsl.g:6108:4: otherlv_16= 'args' otherlv_17= '{' ( (lv_args_18_0= ruleStatement ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,84,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getSuperMethodInvocationAccess().getArgsKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_17, grammarAccess.getSuperMethodInvocationAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCcsl.g:6116:4: ( (lv_args_18_0= ruleStatement ) )
                    // InternalCcsl.g:6117:5: (lv_args_18_0= ruleStatement )
                    {
                    // InternalCcsl.g:6117:5: (lv_args_18_0= ruleStatement )
                    // InternalCcsl.g:6118:6: lv_args_18_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getSuperMethodInvocationAccess().getArgsStatementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_args_18_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuperMethodInvocationRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_18_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:6135:4: (otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==16) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalCcsl.g:6136:5: otherlv_19= ',' ( (lv_args_20_0= ruleStatement ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSuperMethodInvocationAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCcsl.g:6140:5: ( (lv_args_20_0= ruleStatement ) )
                    	    // InternalCcsl.g:6141:6: (lv_args_20_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:6141:6: (lv_args_20_0= ruleStatement )
                    	    // InternalCcsl.g:6142:7: lv_args_20_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getSuperMethodInvocationAccess().getArgsStatementParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_args_20_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSuperMethodInvocationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_20_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_21, grammarAccess.getSuperMethodInvocationAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getSuperMethodInvocationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSuperMethodInvocation"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalCcsl.g:6173:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalCcsl.g:6173:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalCcsl.g:6174:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalCcsl.g:6180:1: ruleVarDeclaration returns [EObject current=null] : ( () otherlv_1= 'VarDeclaration' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'variable' ( (lv_variable_13_0= ruleVariable ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_variable_13_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:6186:2: ( ( () otherlv_1= 'VarDeclaration' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'variable' ( (lv_variable_13_0= ruleVariable ) ) )? otherlv_14= '}' ) )
            // InternalCcsl.g:6187:2: ( () otherlv_1= 'VarDeclaration' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'variable' ( (lv_variable_13_0= ruleVariable ) ) )? otherlv_14= '}' )
            {
            // InternalCcsl.g:6187:2: ( () otherlv_1= 'VarDeclaration' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'variable' ( (lv_variable_13_0= ruleVariable ) ) )? otherlv_14= '}' )
            // InternalCcsl.g:6188:3: () otherlv_1= 'VarDeclaration' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'variable' ( (lv_variable_13_0= ruleVariable ) ) )? otherlv_14= '}'
            {
            // InternalCcsl.g:6188:3: ()
            // InternalCcsl.g:6189:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarDeclarationAccess().getVarDeclarationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getVarDeclarationKeyword_1());
            		
            // InternalCcsl.g:6199:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:6200:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:6200:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:6201:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_88); 

            			newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:6222:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==28) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalCcsl.g:6223:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getVarDeclarationAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:6227:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:6228:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:6228:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:6229:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_89);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6247:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==29) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalCcsl.g:6248:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getVarDeclarationAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getVarDeclarationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:6256:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:6257:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:6257:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:6258:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:6275:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==16) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalCcsl.g:6276:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getVarDeclarationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:6280:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:6281:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:6281:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:6282:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getVarDeclarationAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_90); 

                    				newLeafNode(otherlv_11, grammarAccess.getVarDeclarationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:6305:3: (otherlv_12= 'variable' ( (lv_variable_13_0= ruleVariable ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==90) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalCcsl.g:6306:4: otherlv_12= 'variable' ( (lv_variable_13_0= ruleVariable ) )
                    {
                    otherlv_12=(Token)match(input,90,FOLLOW_66); 

                    				newLeafNode(otherlv_12, grammarAccess.getVarDeclarationAccess().getVariableKeyword_6_0());
                    			
                    // InternalCcsl.g:6310:4: ( (lv_variable_13_0= ruleVariable ) )
                    // InternalCcsl.g:6311:5: (lv_variable_13_0= ruleVariable )
                    {
                    // InternalCcsl.g:6311:5: (lv_variable_13_0= ruleVariable )
                    // InternalCcsl.g:6312:6: lv_variable_13_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVariableVariableParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_variable_13_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_13_0,
                    							"org.ccsl.xtext.Ccsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getVarDeclarationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleInstanceCreation"
    // InternalCcsl.g:6338:1: entryRuleInstanceCreation returns [EObject current=null] : iv_ruleInstanceCreation= ruleInstanceCreation EOF ;
    public final EObject entryRuleInstanceCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreation = null;


        try {
            // InternalCcsl.g:6338:57: (iv_ruleInstanceCreation= ruleInstanceCreation EOF )
            // InternalCcsl.g:6339:2: iv_ruleInstanceCreation= ruleInstanceCreation EOF
            {
             newCompositeNode(grammarAccess.getInstanceCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceCreation=ruleInstanceCreation();

            state._fsp--;

             current =iv_ruleInstanceCreation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstanceCreation"


    // $ANTLR start "ruleInstanceCreation"
    // InternalCcsl.g:6345:1: ruleInstanceCreation returns [EObject current=null] : ( () otherlv_1= 'InstanceCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleInstanceCreation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:6351:2: ( ( () otherlv_1= 'InstanceCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalCcsl.g:6352:2: ( () otherlv_1= 'InstanceCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalCcsl.g:6352:2: ( () otherlv_1= 'InstanceCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalCcsl.g:6353:3: () otherlv_1= 'InstanceCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalCcsl.g:6353:3: ()
            // InternalCcsl.g:6354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstanceCreationAccess().getInstanceCreationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,91,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationAccess().getInstanceCreationKeyword_1());
            		
            // InternalCcsl.g:6364:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:6365:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:6365:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:6366:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getInstanceCreationAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstanceCreationRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_91); 

            			newLeafNode(otherlv_3, grammarAccess.getInstanceCreationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:6387:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==28) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalCcsl.g:6388:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getInstanceCreationAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:6392:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:6393:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:6393:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:6394:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_92);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceCreationRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6412:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==51) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalCcsl.g:6413:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getInstanceCreationAccess().getTypeKeyword_5_0());
                    			
                    // InternalCcsl.g:6417:4: ( ( ruleEString ) )
                    // InternalCcsl.g:6418:5: ( ruleEString )
                    {
                    // InternalCcsl.g:6418:5: ( ruleEString )
                    // InternalCcsl.g:6419:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInstanceCreationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInstanceCreationAccess().getTypeObjectTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6434:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==29) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalCcsl.g:6435:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getInstanceCreationAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getInstanceCreationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:6443:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:6444:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:6444:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:6445:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceCreationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:6462:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==16) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // InternalCcsl.g:6463:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getInstanceCreationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:6467:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:6468:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:6468:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:6469:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInstanceCreationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getInstanceCreationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getInstanceCreationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleInstanceCreation"


    // $ANTLR start "entryRuleAccess_Impl"
    // InternalCcsl.g:6500:1: entryRuleAccess_Impl returns [EObject current=null] : iv_ruleAccess_Impl= ruleAccess_Impl EOF ;
    public final EObject entryRuleAccess_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccess_Impl = null;


        try {
            // InternalCcsl.g:6500:52: (iv_ruleAccess_Impl= ruleAccess_Impl EOF )
            // InternalCcsl.g:6501:2: iv_ruleAccess_Impl= ruleAccess_Impl EOF
            {
             newCompositeNode(grammarAccess.getAccess_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccess_Impl=ruleAccess_Impl();

            state._fsp--;

             current =iv_ruleAccess_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAccess_Impl"


    // $ANTLR start "ruleAccess_Impl"
    // InternalCcsl.g:6507:1: ruleAccess_Impl returns [EObject current=null] : ( () otherlv_1= 'Access' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleAccess_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_from_15_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:6513:2: ( ( () otherlv_1= 'Access' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' ) )
            // InternalCcsl.g:6514:2: ( () otherlv_1= 'Access' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' )
            {
            // InternalCcsl.g:6514:2: ( () otherlv_1= 'Access' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}' )
            // InternalCcsl.g:6515:3: () otherlv_1= 'Access' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )? otherlv_16= '}'
            {
            // InternalCcsl.g:6515:3: ()
            // InternalCcsl.g:6516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccess_ImplAccess().getAccessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,92,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAccess_ImplAccess().getAccessKeyword_1());
            		
            // InternalCcsl.g:6526:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:6527:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:6527:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:6528:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getAccess_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccess_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_3, grammarAccess.getAccess_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:6549:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==28) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalCcsl.g:6550:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAccess_ImplAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:6554:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:6555:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:6555:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:6556:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getAccess_ImplAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccess_ImplRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6574:3: (otherlv_6= 'elementAccessed' ( ( ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==81) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalCcsl.g:6575:4: otherlv_6= 'elementAccessed' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,81,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getAccess_ImplAccess().getElementAccessedKeyword_5_0());
                    			
                    // InternalCcsl.g:6579:4: ( ( ruleEString ) )
                    // InternalCcsl.g:6580:5: ( ruleEString )
                    {
                    // InternalCcsl.g:6580:5: ( ruleEString )
                    // InternalCcsl.g:6581:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAccess_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAccess_ImplAccess().getElementAccessedElementCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6596:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==29) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalCcsl.g:6597:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getAccess_ImplAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getAccess_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:6605:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:6606:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:6606:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:6607:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getAccess_ImplAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccess_ImplRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:6624:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==16) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // InternalCcsl.g:6625:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getAccess_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:6629:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:6630:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:6630:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:6631:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccess_ImplAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccess_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_76); 

                    				newLeafNode(otherlv_13, grammarAccess.getAccess_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:6654:3: (otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==79) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalCcsl.g:6655:4: otherlv_14= 'from' ( (lv_from_15_0= ruleStatement ) )
                    {
                    otherlv_14=(Token)match(input,79,FOLLOW_64); 

                    				newLeafNode(otherlv_14, grammarAccess.getAccess_ImplAccess().getFromKeyword_7_0());
                    			
                    // InternalCcsl.g:6659:4: ( (lv_from_15_0= ruleStatement ) )
                    // InternalCcsl.g:6660:5: (lv_from_15_0= ruleStatement )
                    {
                    // InternalCcsl.g:6660:5: (lv_from_15_0= ruleStatement )
                    // InternalCcsl.g:6661:6: lv_from_15_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getAccess_ImplAccess().getFromStatementParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_from_15_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccess_ImplRule());
                    						}
                    						set(
                    							current,
                    							"from",
                    							lv_from_15_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAccess_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAccess_Impl"


    // $ANTLR start "entryRuleArrayCreation"
    // InternalCcsl.g:6687:1: entryRuleArrayCreation returns [EObject current=null] : iv_ruleArrayCreation= ruleArrayCreation EOF ;
    public final EObject entryRuleArrayCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayCreation = null;


        try {
            // InternalCcsl.g:6687:54: (iv_ruleArrayCreation= ruleArrayCreation EOF )
            // InternalCcsl.g:6688:2: iv_ruleArrayCreation= ruleArrayCreation EOF
            {
             newCompositeNode(grammarAccess.getArrayCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayCreation=ruleArrayCreation();

            state._fsp--;

             current =iv_ruleArrayCreation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArrayCreation"


    // $ANTLR start "ruleArrayCreation"
    // InternalCcsl.g:6694:1: ruleArrayCreation returns [EObject current=null] : ( () otherlv_1= 'ArrayCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleArrayCreation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:6700:2: ( ( () otherlv_1= 'ArrayCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalCcsl.g:6701:2: ( () otherlv_1= 'ArrayCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalCcsl.g:6701:2: ( () otherlv_1= 'ArrayCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalCcsl.g:6702:3: () otherlv_1= 'ArrayCreation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalCcsl.g:6702:3: ()
            // InternalCcsl.g:6703:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayCreationAccess().getArrayCreationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayCreationAccess().getArrayCreationKeyword_1());
            		
            // InternalCcsl.g:6713:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:6714:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:6714:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:6715:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getArrayCreationAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayCreationRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_91); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayCreationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:6736:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==28) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalCcsl.g:6737:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayCreationAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:6741:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:6742:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:6742:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:6743:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getArrayCreationAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_92);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayCreationRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6761:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==51) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalCcsl.g:6762:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getArrayCreationAccess().getTypeKeyword_5_0());
                    			
                    // InternalCcsl.g:6766:4: ( ( ruleEString ) )
                    // InternalCcsl.g:6767:5: ( ruleEString )
                    {
                    // InternalCcsl.g:6767:5: ( ruleEString )
                    // InternalCcsl.g:6768:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrayCreationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getArrayCreationAccess().getTypeObjectTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6783:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==29) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalCcsl.g:6784:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getArrayCreationAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getArrayCreationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:6792:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:6793:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:6793:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:6794:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getArrayCreationAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayCreationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:6811:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==16) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // InternalCcsl.g:6812:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getArrayCreationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:6816:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:6817:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:6817:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:6818:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayCreationAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayCreationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop145;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getArrayCreationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getArrayCreationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleArrayCreation"


    // $ANTLR start "entryRuleVarAssignment"
    // InternalCcsl.g:6849:1: entryRuleVarAssignment returns [EObject current=null] : iv_ruleVarAssignment= ruleVarAssignment EOF ;
    public final EObject entryRuleVarAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssignment = null;


        try {
            // InternalCcsl.g:6849:54: (iv_ruleVarAssignment= ruleVarAssignment EOF )
            // InternalCcsl.g:6850:2: iv_ruleVarAssignment= ruleVarAssignment EOF
            {
             newCompositeNode(grammarAccess.getVarAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarAssignment=ruleVarAssignment();

            state._fsp--;

             current =iv_ruleVarAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarAssignment"


    // $ANTLR start "ruleVarAssignment"
    // InternalCcsl.g:6856:1: ruleVarAssignment returns [EObject current=null] : ( () otherlv_1= 'VarAssignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'variable' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'assignment' ( (lv_assignment_15_0= ruleStatement ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleVarAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_assignment_15_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:6862:2: ( ( () otherlv_1= 'VarAssignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'variable' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'assignment' ( (lv_assignment_15_0= ruleStatement ) ) )? otherlv_16= '}' ) )
            // InternalCcsl.g:6863:2: ( () otherlv_1= 'VarAssignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'variable' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'assignment' ( (lv_assignment_15_0= ruleStatement ) ) )? otherlv_16= '}' )
            {
            // InternalCcsl.g:6863:2: ( () otherlv_1= 'VarAssignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'variable' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'assignment' ( (lv_assignment_15_0= ruleStatement ) ) )? otherlv_16= '}' )
            // InternalCcsl.g:6864:3: () otherlv_1= 'VarAssignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'variable' ( ( ruleEString ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'assignment' ( (lv_assignment_15_0= ruleStatement ) ) )? otherlv_16= '}'
            {
            // InternalCcsl.g:6864:3: ()
            // InternalCcsl.g:6865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarAssignmentAccess().getVarAssignmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,94,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVarAssignmentAccess().getVarAssignmentKeyword_1());
            		
            // InternalCcsl.g:6875:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:6876:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:6876:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:6877:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getVarAssignmentAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_3, grammarAccess.getVarAssignmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:6898:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==28) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalCcsl.g:6899:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getVarAssignmentAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:6903:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:6904:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:6904:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:6905:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getVarAssignmentAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6923:3: (otherlv_6= 'variable' ( ( ruleEString ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==90) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalCcsl.g:6924:4: otherlv_6= 'variable' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,90,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getVarAssignmentAccess().getVariableKeyword_5_0());
                    			
                    // InternalCcsl.g:6928:4: ( ( ruleEString ) )
                    // InternalCcsl.g:6929:5: ( ruleEString )
                    {
                    // InternalCcsl.g:6929:5: ( ruleEString )
                    // InternalCcsl.g:6930:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarAssignmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVarAssignmentAccess().getVariableVariableCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:6945:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==29) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalCcsl.g:6946:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getVarAssignmentAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getVarAssignmentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:6954:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:6955:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:6955:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:6956:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getVarAssignmentAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:6973:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==16) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalCcsl.g:6974:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getVarAssignmentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:6978:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:6979:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:6979:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:6980:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getVarAssignmentAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_96); 

                    				newLeafNode(otherlv_13, grammarAccess.getVarAssignmentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:7003:3: (otherlv_14= 'assignment' ( (lv_assignment_15_0= ruleStatement ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==95) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalCcsl.g:7004:4: otherlv_14= 'assignment' ( (lv_assignment_15_0= ruleStatement ) )
                    {
                    otherlv_14=(Token)match(input,95,FOLLOW_64); 

                    				newLeafNode(otherlv_14, grammarAccess.getVarAssignmentAccess().getAssignmentKeyword_7_0());
                    			
                    // InternalCcsl.g:7008:4: ( (lv_assignment_15_0= ruleStatement ) )
                    // InternalCcsl.g:7009:5: (lv_assignment_15_0= ruleStatement )
                    {
                    // InternalCcsl.g:7009:5: (lv_assignment_15_0= ruleStatement )
                    // InternalCcsl.g:7010:6: lv_assignment_15_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getVarAssignmentAccess().getAssignmentStatementParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_assignment_15_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"assignment",
                    							lv_assignment_15_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getVarAssignmentAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleVarAssignment"


    // $ANTLR start "entryRuleSynchronizedBlock"
    // InternalCcsl.g:7036:1: entryRuleSynchronizedBlock returns [EObject current=null] : iv_ruleSynchronizedBlock= ruleSynchronizedBlock EOF ;
    public final EObject entryRuleSynchronizedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronizedBlock = null;


        try {
            // InternalCcsl.g:7036:58: (iv_ruleSynchronizedBlock= ruleSynchronizedBlock EOF )
            // InternalCcsl.g:7037:2: iv_ruleSynchronizedBlock= ruleSynchronizedBlock EOF
            {
             newCompositeNode(grammarAccess.getSynchronizedBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSynchronizedBlock=ruleSynchronizedBlock();

            state._fsp--;

             current =iv_ruleSynchronizedBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSynchronizedBlock"


    // $ANTLR start "ruleSynchronizedBlock"
    // InternalCcsl.g:7043:1: ruleSynchronizedBlock returns [EObject current=null] : ( () otherlv_1= 'SynchronizedBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'bodyStatements' otherlv_13= '{' ( (lv_bodyStatements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_bodyStatements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'key' ( (lv_key_19_0= ruleStatement ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleSynchronizedBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_bodyStatements_14_0 = null;

        EObject lv_bodyStatements_16_0 = null;

        EObject lv_key_19_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:7049:2: ( ( () otherlv_1= 'SynchronizedBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'bodyStatements' otherlv_13= '{' ( (lv_bodyStatements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_bodyStatements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'key' ( (lv_key_19_0= ruleStatement ) ) )? otherlv_20= '}' ) )
            // InternalCcsl.g:7050:2: ( () otherlv_1= 'SynchronizedBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'bodyStatements' otherlv_13= '{' ( (lv_bodyStatements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_bodyStatements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'key' ( (lv_key_19_0= ruleStatement ) ) )? otherlv_20= '}' )
            {
            // InternalCcsl.g:7050:2: ( () otherlv_1= 'SynchronizedBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'bodyStatements' otherlv_13= '{' ( (lv_bodyStatements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_bodyStatements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'key' ( (lv_key_19_0= ruleStatement ) ) )? otherlv_20= '}' )
            // InternalCcsl.g:7051:3: () otherlv_1= 'SynchronizedBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'bodyStatements' otherlv_13= '{' ( (lv_bodyStatements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_bodyStatements_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'key' ( (lv_key_19_0= ruleStatement ) ) )? otherlv_20= '}'
            {
            // InternalCcsl.g:7051:3: ()
            // InternalCcsl.g:7052:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSynchronizedBlockAccess().getSynchronizedBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,96,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSynchronizedBlockAccess().getSynchronizedBlockKeyword_1());
            		
            // InternalCcsl.g:7062:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:7063:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:7063:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:7064:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getSynchronizedBlockAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSynchronizedBlockRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_97); 

            			newLeafNode(otherlv_3, grammarAccess.getSynchronizedBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:7085:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==28) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalCcsl.g:7086:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSynchronizedBlockAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:7090:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:7091:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:7091:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:7092:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getSynchronizedBlockAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_98);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSynchronizedBlockRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:7110:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==29) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalCcsl.g:7111:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSynchronizedBlockAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getSynchronizedBlockAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:7119:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:7120:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:7120:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:7121:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getSynchronizedBlockAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSynchronizedBlockRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:7138:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==16) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // InternalCcsl.g:7139:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSynchronizedBlockAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:7143:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:7144:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:7144:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:7145:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getSynchronizedBlockAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSynchronizedBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop153;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_99); 

                    				newLeafNode(otherlv_11, grammarAccess.getSynchronizedBlockAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:7168:3: (otherlv_12= 'bodyStatements' otherlv_13= '{' ( (lv_bodyStatements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_bodyStatements_16_0= ruleStatement ) ) )* otherlv_17= '}' )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==97) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalCcsl.g:7169:4: otherlv_12= 'bodyStatements' otherlv_13= '{' ( (lv_bodyStatements_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_bodyStatements_16_0= ruleStatement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,97,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getSynchronizedBlockAccess().getBodyStatementsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_13, grammarAccess.getSynchronizedBlockAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:7177:4: ( (lv_bodyStatements_14_0= ruleStatement ) )
                    // InternalCcsl.g:7178:5: (lv_bodyStatements_14_0= ruleStatement )
                    {
                    // InternalCcsl.g:7178:5: (lv_bodyStatements_14_0= ruleStatement )
                    // InternalCcsl.g:7179:6: lv_bodyStatements_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getSynchronizedBlockAccess().getBodyStatementsStatementParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_bodyStatements_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSynchronizedBlockRule());
                    						}
                    						add(
                    							current,
                    							"bodyStatements",
                    							lv_bodyStatements_14_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:7196:4: (otherlv_15= ',' ( (lv_bodyStatements_16_0= ruleStatement ) ) )*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==16) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // InternalCcsl.g:7197:5: otherlv_15= ',' ( (lv_bodyStatements_16_0= ruleStatement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSynchronizedBlockAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:7201:5: ( (lv_bodyStatements_16_0= ruleStatement ) )
                    	    // InternalCcsl.g:7202:6: (lv_bodyStatements_16_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:7202:6: (lv_bodyStatements_16_0= ruleStatement )
                    	    // InternalCcsl.g:7203:7: lv_bodyStatements_16_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getSynchronizedBlockAccess().getBodyStatementsStatementParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_bodyStatements_16_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSynchronizedBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"bodyStatements",
                    	    								lv_bodyStatements_16_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_100); 

                    				newLeafNode(otherlv_17, grammarAccess.getSynchronizedBlockAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:7226:3: (otherlv_18= 'key' ( (lv_key_19_0= ruleStatement ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==98) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalCcsl.g:7227:4: otherlv_18= 'key' ( (lv_key_19_0= ruleStatement ) )
                    {
                    otherlv_18=(Token)match(input,98,FOLLOW_64); 

                    				newLeafNode(otherlv_18, grammarAccess.getSynchronizedBlockAccess().getKeyKeyword_7_0());
                    			
                    // InternalCcsl.g:7231:4: ( (lv_key_19_0= ruleStatement ) )
                    // InternalCcsl.g:7232:5: (lv_key_19_0= ruleStatement )
                    {
                    // InternalCcsl.g:7232:5: (lv_key_19_0= ruleStatement )
                    // InternalCcsl.g:7233:6: lv_key_19_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getSynchronizedBlockAccess().getKeyStatementParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_key_19_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSynchronizedBlockRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_19_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getSynchronizedBlockAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSynchronizedBlock"


    // $ANTLR start "entryRuleObjectType_Impl"
    // InternalCcsl.g:7259:1: entryRuleObjectType_Impl returns [EObject current=null] : iv_ruleObjectType_Impl= ruleObjectType_Impl EOF ;
    public final EObject entryRuleObjectType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectType_Impl = null;


        try {
            // InternalCcsl.g:7259:56: (iv_ruleObjectType_Impl= ruleObjectType_Impl EOF )
            // InternalCcsl.g:7260:2: iv_ruleObjectType_Impl= ruleObjectType_Impl EOF
            {
             newCompositeNode(grammarAccess.getObjectType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectType_Impl=ruleObjectType_Impl();

            state._fsp--;

             current =iv_ruleObjectType_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjectType_Impl"


    // $ANTLR start "ruleObjectType_Impl"
    // InternalCcsl.g:7266:1: ruleObjectType_Impl returns [EObject current=null] : ( () otherlv_1= 'ObjectType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) ;
    public final EObject ruleObjectType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:7272:2: ( ( () otherlv_1= 'ObjectType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) )
            // InternalCcsl.g:7273:2: ( () otherlv_1= 'ObjectType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            {
            // InternalCcsl.g:7273:2: ( () otherlv_1= 'ObjectType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            // InternalCcsl.g:7274:3: () otherlv_1= 'ObjectType' ( (lv_uniqueName_2_0= ruleString0 ) )
            {
            // InternalCcsl.g:7274:3: ()
            // InternalCcsl.g:7275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectType_ImplAccess().getObjectTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectType_ImplAccess().getObjectTypeKeyword_1());
            		
            // InternalCcsl.g:7285:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:7286:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:7286:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:7287:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getObjectType_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectType_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
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
    // $ANTLR end "ruleObjectType_Impl"


    // $ANTLR start "entryRuleParameterizedType"
    // InternalCcsl.g:7308:1: entryRuleParameterizedType returns [EObject current=null] : iv_ruleParameterizedType= ruleParameterizedType EOF ;
    public final EObject entryRuleParameterizedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterizedType = null;


        try {
            // InternalCcsl.g:7308:58: (iv_ruleParameterizedType= ruleParameterizedType EOF )
            // InternalCcsl.g:7309:2: iv_ruleParameterizedType= ruleParameterizedType EOF
            {
             newCompositeNode(grammarAccess.getParameterizedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterizedType=ruleParameterizedType();

            state._fsp--;

             current =iv_ruleParameterizedType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterizedType"


    // $ANTLR start "ruleParameterizedType"
    // InternalCcsl.g:7315:1: ruleParameterizedType returns [EObject current=null] : ( () otherlv_1= 'ParameterizedType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'typeParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'type' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleParameterizedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:7321:2: ( ( () otherlv_1= 'ParameterizedType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'typeParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'type' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalCcsl.g:7322:2: ( () otherlv_1= 'ParameterizedType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'typeParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'type' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalCcsl.g:7322:2: ( () otherlv_1= 'ParameterizedType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'typeParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'type' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalCcsl.g:7323:3: () otherlv_1= 'ParameterizedType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'typeParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'type' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalCcsl.g:7323:3: ()
            // InternalCcsl.g:7324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterizedTypeAccess().getParameterizedTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterizedTypeAccess().getParameterizedTypeKeyword_1());
            		
            // InternalCcsl.g:7334:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:7335:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:7335:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:7336:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getParameterizedTypeAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterizedTypeRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_101); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterizedTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:7357:3: (otherlv_4= 'typeParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==101) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalCcsl.g:7358:4: otherlv_4= 'typeParameters' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,101,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterizedTypeAccess().getTypeParametersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterizedTypeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalCcsl.g:7366:4: ( ( ruleEString ) )
                    // InternalCcsl.g:7367:5: ( ruleEString )
                    {
                    // InternalCcsl.g:7367:5: ( ruleEString )
                    // InternalCcsl.g:7368:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterizedTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParameterizedTypeAccess().getTypeParametersObjectTypeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:7382:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==16) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // InternalCcsl.g:7383:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getParameterizedTypeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCcsl.g:7387:5: ( ( ruleEString ) )
                    	    // InternalCcsl.g:7388:6: ( ruleEString )
                    	    {
                    	    // InternalCcsl.g:7388:6: ( ruleEString )
                    	    // InternalCcsl.g:7389:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParameterizedTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParameterizedTypeAccess().getTypeParametersObjectTypeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop158;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,37,FOLLOW_102); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterizedTypeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:7409:3: (otherlv_10= 'type' ( ( ruleEString ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==51) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalCcsl.g:7410:4: otherlv_10= 'type' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getParameterizedTypeAccess().getTypeKeyword_5_0());
                    			
                    // InternalCcsl.g:7414:4: ( ( ruleEString ) )
                    // InternalCcsl.g:7415:5: ( ruleEString )
                    {
                    // InternalCcsl.g:7415:5: ( ruleEString )
                    // InternalCcsl.g:7416:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterizedTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParameterizedTypeAccess().getTypeComplexTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getParameterizedTypeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleParameterizedType"


    // $ANTLR start "entryRuleGenericType"
    // InternalCcsl.g:7439:1: entryRuleGenericType returns [EObject current=null] : iv_ruleGenericType= ruleGenericType EOF ;
    public final EObject entryRuleGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericType = null;


        try {
            // InternalCcsl.g:7439:52: (iv_ruleGenericType= ruleGenericType EOF )
            // InternalCcsl.g:7440:2: iv_ruleGenericType= ruleGenericType EOF
            {
             newCompositeNode(grammarAccess.getGenericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericType=ruleGenericType();

            state._fsp--;

             current =iv_ruleGenericType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenericType"


    // $ANTLR start "ruleGenericType"
    // InternalCcsl.g:7446:1: ruleGenericType returns [EObject current=null] : ( () otherlv_1= 'GenericType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}' ) ;
    public final EObject ruleGenericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_properties_16_0 = null;

        EObject lv_properties_18_0 = null;

        EObject lv_statements_22_0 = null;

        EObject lv_statements_24_0 = null;

        EObject lv_fields_28_0 = null;

        EObject lv_fields_30_0 = null;

        EObject lv_methods_34_0 = null;

        EObject lv_methods_36_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:7452:2: ( ( () otherlv_1= 'GenericType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}' ) )
            // InternalCcsl.g:7453:2: ( () otherlv_1= 'GenericType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}' )
            {
            // InternalCcsl.g:7453:2: ( () otherlv_1= 'GenericType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}' )
            // InternalCcsl.g:7454:3: () otherlv_1= 'GenericType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}'
            {
            // InternalCcsl.g:7454:3: ()
            // InternalCcsl.g:7455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenericTypeAccess().getGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getGenericTypeAccess().getGenericTypeKeyword_1());
            		
            // InternalCcsl.g:7465:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:7466:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:7466:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:7467:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getGenericTypeAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenericTypeRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_103); 

            			newLeafNode(otherlv_3, grammarAccess.getGenericTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:7488:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==28) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalCcsl.g:7489:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getGenericTypeAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:7493:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:7494:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:7494:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:7495:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getGenericTypeAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:7513:3: (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==31) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalCcsl.g:7514:4: otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getGenericTypeAccess().getNameKeyword_5_0());
                    			
                    // InternalCcsl.g:7518:4: ( (lv_name_7_0= ruleString0 ) )
                    // InternalCcsl.g:7519:5: (lv_name_7_0= ruleString0 )
                    {
                    // InternalCcsl.g:7519:5: (lv_name_7_0= ruleString0 )
                    // InternalCcsl.g:7520:6: lv_name_7_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getGenericTypeAccess().getNameString0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_105);
                    lv_name_7_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:7538:3: (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==103) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalCcsl.g:7539:4: otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,103,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getGenericTypeAccess().getSuperTypesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getGenericTypeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalCcsl.g:7547:4: ( ( ruleEString ) )
                    // InternalCcsl.g:7548:5: ( ruleEString )
                    {
                    // InternalCcsl.g:7548:5: ( ruleEString )
                    // InternalCcsl.g:7549:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGenericTypeAccess().getSuperTypesComplexTypeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:7563:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( (LA163_0==16) ) {
                            alt163=1;
                        }


                        switch (alt163) {
                    	case 1 :
                    	    // InternalCcsl.g:7564:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_16); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:7568:5: ( ( ruleEString ) )
                    	    // InternalCcsl.g:7569:6: ( ruleEString )
                    	    {
                    	    // InternalCcsl.g:7569:6: ( ruleEString )
                    	    // InternalCcsl.g:7570:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGenericTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getGenericTypeAccess().getSuperTypesComplexTypeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop163;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,37,FOLLOW_106); 

                    				newLeafNode(otherlv_13, grammarAccess.getGenericTypeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:7590:3: (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==29) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalCcsl.g:7591:4: otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getGenericTypeAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getGenericTypeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCcsl.g:7599:4: ( (lv_properties_16_0= ruleProperty ) )
                    // InternalCcsl.g:7600:5: (lv_properties_16_0= ruleProperty )
                    {
                    // InternalCcsl.g:7600:5: (lv_properties_16_0= ruleProperty )
                    // InternalCcsl.g:7601:6: lv_properties_16_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getGenericTypeAccess().getPropertiesPropertyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_16_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_16_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:7618:4: (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )*
                    loop165:
                    do {
                        int alt165=2;
                        int LA165_0 = input.LA(1);

                        if ( (LA165_0==16) ) {
                            alt165=1;
                        }


                        switch (alt165) {
                    	case 1 :
                    	    // InternalCcsl.g:7619:5: otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getGenericTypeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCcsl.g:7623:5: ( (lv_properties_18_0= ruleProperty ) )
                    	    // InternalCcsl.g:7624:6: (lv_properties_18_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:7624:6: (lv_properties_18_0= ruleProperty )
                    	    // InternalCcsl.g:7625:7: lv_properties_18_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getGenericTypeAccess().getPropertiesPropertyParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_18_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_18_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop165;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_107); 

                    				newLeafNode(otherlv_19, grammarAccess.getGenericTypeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:7648:3: (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==71) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalCcsl.g:7649:4: otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getGenericTypeAccess().getStatementsKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_21, grammarAccess.getGenericTypeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCcsl.g:7657:4: ( (lv_statements_22_0= ruleStatement ) )
                    // InternalCcsl.g:7658:5: (lv_statements_22_0= ruleStatement )
                    {
                    // InternalCcsl.g:7658:5: (lv_statements_22_0= ruleStatement )
                    // InternalCcsl.g:7659:6: lv_statements_22_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getGenericTypeAccess().getStatementsStatementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_statements_22_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_22_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:7676:4: (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )*
                    loop167:
                    do {
                        int alt167=2;
                        int LA167_0 = input.LA(1);

                        if ( (LA167_0==16) ) {
                            alt167=1;
                        }


                        switch (alt167) {
                    	case 1 :
                    	    // InternalCcsl.g:7677:5: otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getGenericTypeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCcsl.g:7681:5: ( (lv_statements_24_0= ruleStatement ) )
                    	    // InternalCcsl.g:7682:6: (lv_statements_24_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:7682:6: (lv_statements_24_0= ruleStatement )
                    	    // InternalCcsl.g:7683:7: lv_statements_24_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getGenericTypeAccess().getStatementsStatementParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_statements_24_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_24_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop167;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,17,FOLLOW_108); 

                    				newLeafNode(otherlv_25, grammarAccess.getGenericTypeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:7706:3: (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==104) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalCcsl.g:7707:4: otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,104,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getGenericTypeAccess().getFieldsKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_66); 

                    				newLeafNode(otherlv_27, grammarAccess.getGenericTypeAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCcsl.g:7715:4: ( (lv_fields_28_0= ruleVariable ) )
                    // InternalCcsl.g:7716:5: (lv_fields_28_0= ruleVariable )
                    {
                    // InternalCcsl.g:7716:5: (lv_fields_28_0= ruleVariable )
                    // InternalCcsl.g:7717:6: lv_fields_28_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getGenericTypeAccess().getFieldsVariableParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_fields_28_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_28_0,
                    							"org.ccsl.xtext.Ccsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:7734:4: (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )*
                    loop169:
                    do {
                        int alt169=2;
                        int LA169_0 = input.LA(1);

                        if ( (LA169_0==16) ) {
                            alt169=1;
                        }


                        switch (alt169) {
                    	case 1 :
                    	    // InternalCcsl.g:7735:5: otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) )
                    	    {
                    	    otherlv_29=(Token)match(input,16,FOLLOW_66); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getGenericTypeAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCcsl.g:7739:5: ( (lv_fields_30_0= ruleVariable ) )
                    	    // InternalCcsl.g:7740:6: (lv_fields_30_0= ruleVariable )
                    	    {
                    	    // InternalCcsl.g:7740:6: (lv_fields_30_0= ruleVariable )
                    	    // InternalCcsl.g:7741:7: lv_fields_30_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getGenericTypeAccess().getFieldsVariableParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_fields_30_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_30_0,
                    	    								"org.ccsl.xtext.Ccsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop169;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,17,FOLLOW_109); 

                    				newLeafNode(otherlv_31, grammarAccess.getGenericTypeAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:7764:3: (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==41) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalCcsl.g:7765:4: otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_32, grammarAccess.getGenericTypeAccess().getMethodsKeyword_10_0());
                    			
                    otherlv_33=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_33, grammarAccess.getGenericTypeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalCcsl.g:7773:4: ( (lv_methods_34_0= ruleMethod ) )
                    // InternalCcsl.g:7774:5: (lv_methods_34_0= ruleMethod )
                    {
                    // InternalCcsl.g:7774:5: (lv_methods_34_0= ruleMethod )
                    // InternalCcsl.g:7775:6: lv_methods_34_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getGenericTypeAccess().getMethodsMethodParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_methods_34_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    						}
                    						add(
                    							current,
                    							"methods",
                    							lv_methods_34_0,
                    							"org.ccsl.xtext.Ccsl.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:7792:4: (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )*
                    loop171:
                    do {
                        int alt171=2;
                        int LA171_0 = input.LA(1);

                        if ( (LA171_0==16) ) {
                            alt171=1;
                        }


                        switch (alt171) {
                    	case 1 :
                    	    // InternalCcsl.g:7793:5: otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) )
                    	    {
                    	    otherlv_35=(Token)match(input,16,FOLLOW_37); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getGenericTypeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalCcsl.g:7797:5: ( (lv_methods_36_0= ruleMethod ) )
                    	    // InternalCcsl.g:7798:6: (lv_methods_36_0= ruleMethod )
                    	    {
                    	    // InternalCcsl.g:7798:6: (lv_methods_36_0= ruleMethod )
                    	    // InternalCcsl.g:7799:7: lv_methods_36_0= ruleMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getGenericTypeAccess().getMethodsMethodParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_methods_36_0=ruleMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"methods",
                    	    								lv_methods_36_0,
                    	    								"org.ccsl.xtext.Ccsl.Method");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop171;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_37, grammarAccess.getGenericTypeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_38=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getGenericTypeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleGenericType"


    // $ANTLR start "entryRuleArrayType"
    // InternalCcsl.g:7830:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalCcsl.g:7830:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalCcsl.g:7831:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalCcsl.g:7837:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= 'ArrayType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'dimensions' ( (lv_dimensions_5_0= ruleInt0 ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_dimensions_5_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:7843:2: ( ( () otherlv_1= 'ArrayType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'dimensions' ( (lv_dimensions_5_0= ruleInt0 ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalCcsl.g:7844:2: ( () otherlv_1= 'ArrayType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'dimensions' ( (lv_dimensions_5_0= ruleInt0 ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalCcsl.g:7844:2: ( () otherlv_1= 'ArrayType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'dimensions' ( (lv_dimensions_5_0= ruleInt0 ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalCcsl.g:7845:3: () otherlv_1= 'ArrayType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'dimensions' ( (lv_dimensions_5_0= ruleInt0 ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalCcsl.g:7845:3: ()
            // InternalCcsl.g:7846:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_1());
            		
            // InternalCcsl.g:7856:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:7857:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:7857:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:7858:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getArrayTypeAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayTypeRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_110); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:7879:3: (otherlv_4= 'dimensions' ( (lv_dimensions_5_0= ruleInt0 ) ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==106) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalCcsl.g:7880:4: otherlv_4= 'dimensions' ( (lv_dimensions_5_0= ruleInt0 ) )
                    {
                    otherlv_4=(Token)match(input,106,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getDimensionsKeyword_4_0());
                    			
                    // InternalCcsl.g:7884:4: ( (lv_dimensions_5_0= ruleInt0 ) )
                    // InternalCcsl.g:7885:5: (lv_dimensions_5_0= ruleInt0 )
                    {
                    // InternalCcsl.g:7885:5: (lv_dimensions_5_0= ruleInt0 )
                    // InternalCcsl.g:7886:6: lv_dimensions_5_0= ruleInt0
                    {

                    						newCompositeNode(grammarAccess.getArrayTypeAccess().getDimensionsInt0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    lv_dimensions_5_0=ruleInt0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"dimensions",
                    							lv_dimensions_5_0,
                    							"org.ccsl.xtext.Ccsl.Int0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:7904:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==51) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalCcsl.g:7905:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getArrayTypeAccess().getTypeKeyword_5_0());
                    			
                    // InternalCcsl.g:7909:4: ( ( ruleEString ) )
                    // InternalCcsl.g:7910:5: ( ruleEString )
                    {
                    // InternalCcsl.g:7910:5: ( ruleEString )
                    // InternalCcsl.g:7911:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrayTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getArrayTypeAccess().getTypeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleComplexType"
    // InternalCcsl.g:7934:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalCcsl.g:7934:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalCcsl.g:7935:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalCcsl.g:7941:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'ComplexType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_properties_16_0 = null;

        EObject lv_properties_18_0 = null;

        EObject lv_statements_22_0 = null;

        EObject lv_statements_24_0 = null;

        EObject lv_fields_28_0 = null;

        EObject lv_fields_30_0 = null;

        EObject lv_methods_34_0 = null;

        EObject lv_methods_36_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:7947:2: ( ( () otherlv_1= 'ComplexType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}' ) )
            // InternalCcsl.g:7948:2: ( () otherlv_1= 'ComplexType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}' )
            {
            // InternalCcsl.g:7948:2: ( () otherlv_1= 'ComplexType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}' )
            // InternalCcsl.g:7949:3: () otherlv_1= 'ComplexType' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )? (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )? (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )? otherlv_38= '}'
            {
            // InternalCcsl.g:7949:3: ()
            // InternalCcsl.g:7950:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1());
            		
            // InternalCcsl.g:7960:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:7961:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:7961:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:7962:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getComplexTypeAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_103); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:7983:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==28) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // InternalCcsl.g:7984:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComplexTypeAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:7988:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:7989:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:7989:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:7990:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:8008:3: (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==31) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // InternalCcsl.g:8009:4: otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getComplexTypeAccess().getNameKeyword_5_0());
                    			
                    // InternalCcsl.g:8013:4: ( (lv_name_7_0= ruleString0 ) )
                    // InternalCcsl.g:8014:5: (lv_name_7_0= ruleString0 )
                    {
                    // InternalCcsl.g:8014:5: (lv_name_7_0= ruleString0 )
                    // InternalCcsl.g:8015:6: lv_name_7_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getNameString0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_105);
                    lv_name_7_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:8033:3: (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==103) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // InternalCcsl.g:8034:4: otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,103,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getComplexTypeAccess().getSuperTypesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getComplexTypeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalCcsl.g:8042:4: ( ( ruleEString ) )
                    // InternalCcsl.g:8043:5: ( ruleEString )
                    {
                    // InternalCcsl.g:8043:5: ( ruleEString )
                    // InternalCcsl.g:8044:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComplexTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getSuperTypesComplexTypeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:8058:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop177:
                    do {
                        int alt177=2;
                        int LA177_0 = input.LA(1);

                        if ( (LA177_0==16) ) {
                            alt177=1;
                        }


                        switch (alt177) {
                    	case 1 :
                    	    // InternalCcsl.g:8059:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_16); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getComplexTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:8063:5: ( ( ruleEString ) )
                    	    // InternalCcsl.g:8064:6: ( ruleEString )
                    	    {
                    	    // InternalCcsl.g:8064:6: ( ruleEString )
                    	    // InternalCcsl.g:8065:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComplexTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComplexTypeAccess().getSuperTypesComplexTypeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop177;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,37,FOLLOW_106); 

                    				newLeafNode(otherlv_13, grammarAccess.getComplexTypeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:8085:3: (otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==29) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // InternalCcsl.g:8086:4: otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getComplexTypeAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCcsl.g:8094:4: ( (lv_properties_16_0= ruleProperty ) )
                    // InternalCcsl.g:8095:5: (lv_properties_16_0= ruleProperty )
                    {
                    // InternalCcsl.g:8095:5: (lv_properties_16_0= ruleProperty )
                    // InternalCcsl.g:8096:6: lv_properties_16_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getPropertiesPropertyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_16_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_16_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:8113:4: (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )*
                    loop179:
                    do {
                        int alt179=2;
                        int LA179_0 = input.LA(1);

                        if ( (LA179_0==16) ) {
                            alt179=1;
                        }


                        switch (alt179) {
                    	case 1 :
                    	    // InternalCcsl.g:8114:5: otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getComplexTypeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCcsl.g:8118:5: ( (lv_properties_18_0= ruleProperty ) )
                    	    // InternalCcsl.g:8119:6: (lv_properties_18_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:8119:6: (lv_properties_18_0= ruleProperty )
                    	    // InternalCcsl.g:8120:7: lv_properties_18_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexTypeAccess().getPropertiesPropertyParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_18_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_18_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop179;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_107); 

                    				newLeafNode(otherlv_19, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:8143:3: (otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}' )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==71) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalCcsl.g:8144:4: otherlv_20= 'statements' otherlv_21= '{' ( (lv_statements_22_0= ruleStatement ) ) (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getComplexTypeAccess().getStatementsKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_21, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCcsl.g:8152:4: ( (lv_statements_22_0= ruleStatement ) )
                    // InternalCcsl.g:8153:5: (lv_statements_22_0= ruleStatement )
                    {
                    // InternalCcsl.g:8153:5: (lv_statements_22_0= ruleStatement )
                    // InternalCcsl.g:8154:6: lv_statements_22_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getStatementsStatementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_statements_22_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_22_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:8171:4: (otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) ) )*
                    loop181:
                    do {
                        int alt181=2;
                        int LA181_0 = input.LA(1);

                        if ( (LA181_0==16) ) {
                            alt181=1;
                        }


                        switch (alt181) {
                    	case 1 :
                    	    // InternalCcsl.g:8172:5: otherlv_23= ',' ( (lv_statements_24_0= ruleStatement ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getComplexTypeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCcsl.g:8176:5: ( (lv_statements_24_0= ruleStatement ) )
                    	    // InternalCcsl.g:8177:6: (lv_statements_24_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:8177:6: (lv_statements_24_0= ruleStatement )
                    	    // InternalCcsl.g:8178:7: lv_statements_24_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexTypeAccess().getStatementsStatementParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_statements_24_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_24_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop181;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,17,FOLLOW_108); 

                    				newLeafNode(otherlv_25, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:8201:3: (otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}' )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==104) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // InternalCcsl.g:8202:4: otherlv_26= 'fields' otherlv_27= '{' ( (lv_fields_28_0= ruleVariable ) ) (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,104,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getComplexTypeAccess().getFieldsKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_66); 

                    				newLeafNode(otherlv_27, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCcsl.g:8210:4: ( (lv_fields_28_0= ruleVariable ) )
                    // InternalCcsl.g:8211:5: (lv_fields_28_0= ruleVariable )
                    {
                    // InternalCcsl.g:8211:5: (lv_fields_28_0= ruleVariable )
                    // InternalCcsl.g:8212:6: lv_fields_28_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getFieldsVariableParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_fields_28_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_28_0,
                    							"org.ccsl.xtext.Ccsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:8229:4: (otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) ) )*
                    loop183:
                    do {
                        int alt183=2;
                        int LA183_0 = input.LA(1);

                        if ( (LA183_0==16) ) {
                            alt183=1;
                        }


                        switch (alt183) {
                    	case 1 :
                    	    // InternalCcsl.g:8230:5: otherlv_29= ',' ( (lv_fields_30_0= ruleVariable ) )
                    	    {
                    	    otherlv_29=(Token)match(input,16,FOLLOW_66); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getComplexTypeAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCcsl.g:8234:5: ( (lv_fields_30_0= ruleVariable ) )
                    	    // InternalCcsl.g:8235:6: (lv_fields_30_0= ruleVariable )
                    	    {
                    	    // InternalCcsl.g:8235:6: (lv_fields_30_0= ruleVariable )
                    	    // InternalCcsl.g:8236:7: lv_fields_30_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexTypeAccess().getFieldsVariableParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_fields_30_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_30_0,
                    	    								"org.ccsl.xtext.Ccsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop183;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,17,FOLLOW_109); 

                    				newLeafNode(otherlv_31, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:8259:3: (otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}' )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==41) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // InternalCcsl.g:8260:4: otherlv_32= 'methods' otherlv_33= '{' ( (lv_methods_34_0= ruleMethod ) ) (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_32, grammarAccess.getComplexTypeAccess().getMethodsKeyword_10_0());
                    			
                    otherlv_33=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_33, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalCcsl.g:8268:4: ( (lv_methods_34_0= ruleMethod ) )
                    // InternalCcsl.g:8269:5: (lv_methods_34_0= ruleMethod )
                    {
                    // InternalCcsl.g:8269:5: (lv_methods_34_0= ruleMethod )
                    // InternalCcsl.g:8270:6: lv_methods_34_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getComplexTypeAccess().getMethodsMethodParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_methods_34_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    						}
                    						add(
                    							current,
                    							"methods",
                    							lv_methods_34_0,
                    							"org.ccsl.xtext.Ccsl.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:8287:4: (otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) ) )*
                    loop185:
                    do {
                        int alt185=2;
                        int LA185_0 = input.LA(1);

                        if ( (LA185_0==16) ) {
                            alt185=1;
                        }


                        switch (alt185) {
                    	case 1 :
                    	    // InternalCcsl.g:8288:5: otherlv_35= ',' ( (lv_methods_36_0= ruleMethod ) )
                    	    {
                    	    otherlv_35=(Token)match(input,16,FOLLOW_37); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getComplexTypeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalCcsl.g:8292:5: ( (lv_methods_36_0= ruleMethod ) )
                    	    // InternalCcsl.g:8293:6: (lv_methods_36_0= ruleMethod )
                    	    {
                    	    // InternalCcsl.g:8293:6: (lv_methods_36_0= ruleMethod )
                    	    // InternalCcsl.g:8294:7: lv_methods_36_0= ruleMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexTypeAccess().getMethodsMethodParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_methods_36_0=ruleMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"methods",
                    	    								lv_methods_36_0,
                    	    								"org.ccsl.xtext.Ccsl.Method");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop185;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_37, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_38=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleInt0"
    // InternalCcsl.g:8325:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // InternalCcsl.g:8325:44: (iv_ruleInt0= ruleInt0 EOF )
            // InternalCcsl.g:8326:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalCcsl.g:8332:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCcsl.g:8338:2: (kw= 'Int' )
            // InternalCcsl.g:8339:2: kw= 'Int'
            {
            kw=(Token)match(input,108,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInt0Access().getIntKeyword());
            	

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
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleVariableVector"
    // InternalCcsl.g:8347:1: entryRuleVariableVector returns [EObject current=null] : iv_ruleVariableVector= ruleVariableVector EOF ;
    public final EObject entryRuleVariableVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableVector = null;


        try {
            // InternalCcsl.g:8347:55: (iv_ruleVariableVector= ruleVariableVector EOF )
            // InternalCcsl.g:8348:2: iv_ruleVariableVector= ruleVariableVector EOF
            {
             newCompositeNode(grammarAccess.getVariableVectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableVector=ruleVariableVector();

            state._fsp--;

             current =iv_ruleVariableVector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableVector"


    // $ANTLR start "ruleVariableVector"
    // InternalCcsl.g:8354:1: ruleVariableVector returns [EObject current=null] : ( () otherlv_1= 'VariableVector' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'dimensions' ( (lv_dimensions_9_0= ruleInt0 ) ) )? (otherlv_10= 'type' ( ( ruleEString ) ) )? (otherlv_12= 'properties' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'initialValue' ( (lv_initialValue_19_0= ruleStatement ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleVariableVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_dimensions_9_0 = null;

        EObject lv_properties_14_0 = null;

        EObject lv_properties_16_0 = null;

        EObject lv_initialValue_19_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:8360:2: ( ( () otherlv_1= 'VariableVector' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'dimensions' ( (lv_dimensions_9_0= ruleInt0 ) ) )? (otherlv_10= 'type' ( ( ruleEString ) ) )? (otherlv_12= 'properties' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'initialValue' ( (lv_initialValue_19_0= ruleStatement ) ) )? otherlv_20= '}' ) )
            // InternalCcsl.g:8361:2: ( () otherlv_1= 'VariableVector' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'dimensions' ( (lv_dimensions_9_0= ruleInt0 ) ) )? (otherlv_10= 'type' ( ( ruleEString ) ) )? (otherlv_12= 'properties' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'initialValue' ( (lv_initialValue_19_0= ruleStatement ) ) )? otherlv_20= '}' )
            {
            // InternalCcsl.g:8361:2: ( () otherlv_1= 'VariableVector' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'dimensions' ( (lv_dimensions_9_0= ruleInt0 ) ) )? (otherlv_10= 'type' ( ( ruleEString ) ) )? (otherlv_12= 'properties' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'initialValue' ( (lv_initialValue_19_0= ruleStatement ) ) )? otherlv_20= '}' )
            // InternalCcsl.g:8362:3: () otherlv_1= 'VariableVector' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'dimensions' ( (lv_dimensions_9_0= ruleInt0 ) ) )? (otherlv_10= 'type' ( ( ruleEString ) ) )? (otherlv_12= 'properties' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'initialValue' ( (lv_initialValue_19_0= ruleStatement ) ) )? otherlv_20= '}'
            {
            // InternalCcsl.g:8362:3: ()
            // InternalCcsl.g:8363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableVectorAccess().getVariableVectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableVectorAccess().getVariableVectorKeyword_1());
            		
            // InternalCcsl.g:8373:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:8374:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:8374:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:8375:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getVariableVectorAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableVectorRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_111); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableVectorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:8396:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==28) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // InternalCcsl.g:8397:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableVectorAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:8401:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:8402:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:8402:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:8403:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getVariableVectorAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_112);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableVectorRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:8421:3: (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==31) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // InternalCcsl.g:8422:4: otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariableVectorAccess().getNameKeyword_5_0());
                    			
                    // InternalCcsl.g:8426:4: ( (lv_name_7_0= ruleString0 ) )
                    // InternalCcsl.g:8427:5: (lv_name_7_0= ruleString0 )
                    {
                    // InternalCcsl.g:8427:5: (lv_name_7_0= ruleString0 )
                    // InternalCcsl.g:8428:6: lv_name_7_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getVariableVectorAccess().getNameString0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_name_7_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableVectorRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:8446:3: (otherlv_8= 'dimensions' ( (lv_dimensions_9_0= ruleInt0 ) ) )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==106) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // InternalCcsl.g:8447:4: otherlv_8= 'dimensions' ( (lv_dimensions_9_0= ruleInt0 ) )
                    {
                    otherlv_8=(Token)match(input,106,FOLLOW_48); 

                    				newLeafNode(otherlv_8, grammarAccess.getVariableVectorAccess().getDimensionsKeyword_6_0());
                    			
                    // InternalCcsl.g:8451:4: ( (lv_dimensions_9_0= ruleInt0 ) )
                    // InternalCcsl.g:8452:5: (lv_dimensions_9_0= ruleInt0 )
                    {
                    // InternalCcsl.g:8452:5: (lv_dimensions_9_0= ruleInt0 )
                    // InternalCcsl.g:8453:6: lv_dimensions_9_0= ruleInt0
                    {

                    						newCompositeNode(grammarAccess.getVariableVectorAccess().getDimensionsInt0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_dimensions_9_0=ruleInt0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableVectorRule());
                    						}
                    						set(
                    							current,
                    							"dimensions",
                    							lv_dimensions_9_0,
                    							"org.ccsl.xtext.Ccsl.Int0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:8471:3: (otherlv_10= 'type' ( ( ruleEString ) ) )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==51) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // InternalCcsl.g:8472:4: otherlv_10= 'type' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getVariableVectorAccess().getTypeKeyword_7_0());
                    			
                    // InternalCcsl.g:8476:4: ( ( ruleEString ) )
                    // InternalCcsl.g:8477:5: ( ruleEString )
                    {
                    // InternalCcsl.g:8477:5: ( ruleEString )
                    // InternalCcsl.g:8478:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableVectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableVectorAccess().getTypeDataTypeCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:8493:3: (otherlv_12= 'properties' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( (LA192_0==29) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // InternalCcsl.g:8494:4: otherlv_12= 'properties' otherlv_13= '{' ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getVariableVectorAccess().getPropertiesKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getVariableVectorAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCcsl.g:8502:4: ( (lv_properties_14_0= ruleProperty ) )
                    // InternalCcsl.g:8503:5: (lv_properties_14_0= ruleProperty )
                    {
                    // InternalCcsl.g:8503:5: (lv_properties_14_0= ruleProperty )
                    // InternalCcsl.g:8504:6: lv_properties_14_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getVariableVectorAccess().getPropertiesPropertyParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_14_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableVectorRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_14_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:8521:4: (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )*
                    loop191:
                    do {
                        int alt191=2;
                        int LA191_0 = input.LA(1);

                        if ( (LA191_0==16) ) {
                            alt191=1;
                        }


                        switch (alt191) {
                    	case 1 :
                    	    // InternalCcsl.g:8522:5: otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getVariableVectorAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCcsl.g:8526:5: ( (lv_properties_16_0= ruleProperty ) )
                    	    // InternalCcsl.g:8527:6: (lv_properties_16_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:8527:6: (lv_properties_16_0= ruleProperty )
                    	    // InternalCcsl.g:8528:7: lv_properties_16_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableVectorAccess().getPropertiesPropertyParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_16_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableVectorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_16_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop191;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_71); 

                    				newLeafNode(otherlv_17, grammarAccess.getVariableVectorAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:8551:3: (otherlv_18= 'initialValue' ( (lv_initialValue_19_0= ruleStatement ) ) )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==75) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalCcsl.g:8552:4: otherlv_18= 'initialValue' ( (lv_initialValue_19_0= ruleStatement ) )
                    {
                    otherlv_18=(Token)match(input,75,FOLLOW_64); 

                    				newLeafNode(otherlv_18, grammarAccess.getVariableVectorAccess().getInitialValueKeyword_9_0());
                    			
                    // InternalCcsl.g:8556:4: ( (lv_initialValue_19_0= ruleStatement ) )
                    // InternalCcsl.g:8557:5: (lv_initialValue_19_0= ruleStatement )
                    {
                    // InternalCcsl.g:8557:5: (lv_initialValue_19_0= ruleStatement )
                    // InternalCcsl.g:8558:6: lv_initialValue_19_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getVariableVectorAccess().getInitialValueStatementParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_initialValue_19_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableVectorRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_19_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getVariableVectorAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleVariableVector"


    // $ANTLR start "entryRulePrimitiveType_Impl"
    // InternalCcsl.g:8584:1: entryRulePrimitiveType_Impl returns [EObject current=null] : iv_rulePrimitiveType_Impl= rulePrimitiveType_Impl EOF ;
    public final EObject entryRulePrimitiveType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType_Impl = null;


        try {
            // InternalCcsl.g:8584:59: (iv_rulePrimitiveType_Impl= rulePrimitiveType_Impl EOF )
            // InternalCcsl.g:8585:2: iv_rulePrimitiveType_Impl= rulePrimitiveType_Impl EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType_Impl=rulePrimitiveType_Impl();

            state._fsp--;

             current =iv_rulePrimitiveType_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimitiveType_Impl"


    // $ANTLR start "rulePrimitiveType_Impl"
    // InternalCcsl.g:8591:1: rulePrimitiveType_Impl returns [EObject current=null] : ( () otherlv_1= 'PrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) ;
    public final EObject rulePrimitiveType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:8597:2: ( ( () otherlv_1= 'PrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) )
            // InternalCcsl.g:8598:2: ( () otherlv_1= 'PrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            {
            // InternalCcsl.g:8598:2: ( () otherlv_1= 'PrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            // InternalCcsl.g:8599:3: () otherlv_1= 'PrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) )
            {
            // InternalCcsl.g:8599:3: ()
            // InternalCcsl.g:8600:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveType_ImplAccess().getPrimitiveTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,110,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveType_ImplAccess().getPrimitiveTypeKeyword_1());
            		
            // InternalCcsl.g:8610:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:8611:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:8611:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:8612:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getPrimitiveType_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveType_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
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
    // $ANTLR end "rulePrimitiveType_Impl"


    // $ANTLR start "entryRuleStringPrimitiveType"
    // InternalCcsl.g:8633:1: entryRuleStringPrimitiveType returns [EObject current=null] : iv_ruleStringPrimitiveType= ruleStringPrimitiveType EOF ;
    public final EObject entryRuleStringPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPrimitiveType = null;


        try {
            // InternalCcsl.g:8633:60: (iv_ruleStringPrimitiveType= ruleStringPrimitiveType EOF )
            // InternalCcsl.g:8634:2: iv_ruleStringPrimitiveType= ruleStringPrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getStringPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringPrimitiveType=ruleStringPrimitiveType();

            state._fsp--;

             current =iv_ruleStringPrimitiveType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringPrimitiveType"


    // $ANTLR start "ruleStringPrimitiveType"
    // InternalCcsl.g:8640:1: ruleStringPrimitiveType returns [EObject current=null] : ( () otherlv_1= 'StringPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) ;
    public final EObject ruleStringPrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:8646:2: ( ( () otherlv_1= 'StringPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) )
            // InternalCcsl.g:8647:2: ( () otherlv_1= 'StringPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            {
            // InternalCcsl.g:8647:2: ( () otherlv_1= 'StringPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            // InternalCcsl.g:8648:3: () otherlv_1= 'StringPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) )
            {
            // InternalCcsl.g:8648:3: ()
            // InternalCcsl.g:8649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringPrimitiveTypeAccess().getStringPrimitiveTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,111,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getStringPrimitiveTypeAccess().getStringPrimitiveTypeKeyword_1());
            		
            // InternalCcsl.g:8659:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:8660:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:8660:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:8661:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getStringPrimitiveTypeAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringPrimitiveTypeRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
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
    // $ANTLR end "ruleStringPrimitiveType"


    // $ANTLR start "entryRuleBooleanPrimitiveType"
    // InternalCcsl.g:8682:1: entryRuleBooleanPrimitiveType returns [EObject current=null] : iv_ruleBooleanPrimitiveType= ruleBooleanPrimitiveType EOF ;
    public final EObject entryRuleBooleanPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanPrimitiveType = null;


        try {
            // InternalCcsl.g:8682:61: (iv_ruleBooleanPrimitiveType= ruleBooleanPrimitiveType EOF )
            // InternalCcsl.g:8683:2: iv_ruleBooleanPrimitiveType= ruleBooleanPrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getBooleanPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanPrimitiveType=ruleBooleanPrimitiveType();

            state._fsp--;

             current =iv_ruleBooleanPrimitiveType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanPrimitiveType"


    // $ANTLR start "ruleBooleanPrimitiveType"
    // InternalCcsl.g:8689:1: ruleBooleanPrimitiveType returns [EObject current=null] : ( () otherlv_1= 'BooleanPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) ;
    public final EObject ruleBooleanPrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:8695:2: ( ( () otherlv_1= 'BooleanPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) )
            // InternalCcsl.g:8696:2: ( () otherlv_1= 'BooleanPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            {
            // InternalCcsl.g:8696:2: ( () otherlv_1= 'BooleanPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            // InternalCcsl.g:8697:3: () otherlv_1= 'BooleanPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) )
            {
            // InternalCcsl.g:8697:3: ()
            // InternalCcsl.g:8698:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanPrimitiveTypeAccess().getBooleanPrimitiveTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanPrimitiveTypeAccess().getBooleanPrimitiveTypeKeyword_1());
            		
            // InternalCcsl.g:8708:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:8709:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:8709:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:8710:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getBooleanPrimitiveTypeAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanPrimitiveTypeRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
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
    // $ANTLR end "ruleBooleanPrimitiveType"


    // $ANTLR start "entryRuleShortPrimitiveType"
    // InternalCcsl.g:8731:1: entryRuleShortPrimitiveType returns [EObject current=null] : iv_ruleShortPrimitiveType= ruleShortPrimitiveType EOF ;
    public final EObject entryRuleShortPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortPrimitiveType = null;


        try {
            // InternalCcsl.g:8731:59: (iv_ruleShortPrimitiveType= ruleShortPrimitiveType EOF )
            // InternalCcsl.g:8732:2: iv_ruleShortPrimitiveType= ruleShortPrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getShortPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShortPrimitiveType=ruleShortPrimitiveType();

            state._fsp--;

             current =iv_ruleShortPrimitiveType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShortPrimitiveType"


    // $ANTLR start "ruleShortPrimitiveType"
    // InternalCcsl.g:8738:1: ruleShortPrimitiveType returns [EObject current=null] : ( () otherlv_1= 'ShortPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) ;
    public final EObject ruleShortPrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:8744:2: ( ( () otherlv_1= 'ShortPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) )
            // InternalCcsl.g:8745:2: ( () otherlv_1= 'ShortPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            {
            // InternalCcsl.g:8745:2: ( () otherlv_1= 'ShortPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            // InternalCcsl.g:8746:3: () otherlv_1= 'ShortPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) )
            {
            // InternalCcsl.g:8746:3: ()
            // InternalCcsl.g:8747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShortPrimitiveTypeAccess().getShortPrimitiveTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getShortPrimitiveTypeAccess().getShortPrimitiveTypeKeyword_1());
            		
            // InternalCcsl.g:8757:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:8758:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:8758:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:8759:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getShortPrimitiveTypeAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShortPrimitiveTypeRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
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
    // $ANTLR end "ruleShortPrimitiveType"


    // $ANTLR start "entryRuleIntPrimitiveType"
    // InternalCcsl.g:8780:1: entryRuleIntPrimitiveType returns [EObject current=null] : iv_ruleIntPrimitiveType= ruleIntPrimitiveType EOF ;
    public final EObject entryRuleIntPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntPrimitiveType = null;


        try {
            // InternalCcsl.g:8780:57: (iv_ruleIntPrimitiveType= ruleIntPrimitiveType EOF )
            // InternalCcsl.g:8781:2: iv_ruleIntPrimitiveType= ruleIntPrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getIntPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntPrimitiveType=ruleIntPrimitiveType();

            state._fsp--;

             current =iv_ruleIntPrimitiveType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntPrimitiveType"


    // $ANTLR start "ruleIntPrimitiveType"
    // InternalCcsl.g:8787:1: ruleIntPrimitiveType returns [EObject current=null] : ( () otherlv_1= 'IntPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) ;
    public final EObject ruleIntPrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:8793:2: ( ( () otherlv_1= 'IntPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) ) )
            // InternalCcsl.g:8794:2: ( () otherlv_1= 'IntPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            {
            // InternalCcsl.g:8794:2: ( () otherlv_1= 'IntPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) ) )
            // InternalCcsl.g:8795:3: () otherlv_1= 'IntPrimitiveType' ( (lv_uniqueName_2_0= ruleString0 ) )
            {
            // InternalCcsl.g:8795:3: ()
            // InternalCcsl.g:8796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntPrimitiveTypeAccess().getIntPrimitiveTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,114,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIntPrimitiveTypeAccess().getIntPrimitiveTypeKeyword_1());
            		
            // InternalCcsl.g:8806:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:8807:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:8807:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:8808:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getIntPrimitiveTypeAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntPrimitiveTypeRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
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
    // $ANTLR end "ruleIntPrimitiveType"


    // $ANTLR start "entryRuleNamedElement_Impl"
    // InternalCcsl.g:8829:1: entryRuleNamedElement_Impl returns [EObject current=null] : iv_ruleNamedElement_Impl= ruleNamedElement_Impl EOF ;
    public final EObject entryRuleNamedElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement_Impl = null;


        try {
            // InternalCcsl.g:8829:58: (iv_ruleNamedElement_Impl= ruleNamedElement_Impl EOF )
            // InternalCcsl.g:8830:2: iv_ruleNamedElement_Impl= ruleNamedElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getNamedElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedElement_Impl=ruleNamedElement_Impl();

            state._fsp--;

             current =iv_ruleNamedElement_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamedElement_Impl"


    // $ANTLR start "ruleNamedElement_Impl"
    // InternalCcsl.g:8836:1: ruleNamedElement_Impl returns [EObject current=null] : ( () otherlv_1= 'NamedElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleNamedElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:8842:2: ( ( () otherlv_1= 'NamedElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalCcsl.g:8843:2: ( () otherlv_1= 'NamedElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalCcsl.g:8843:2: ( () otherlv_1= 'NamedElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalCcsl.g:8844:3: () otherlv_1= 'NamedElement' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalCcsl.g:8844:3: ()
            // InternalCcsl.g:8845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedElement_ImplAccess().getNamedElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,115,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedElement_ImplAccess().getNamedElementKeyword_1());
            		
            // InternalCcsl.g:8855:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:8856:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:8856:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:8857:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getNamedElement_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedElement_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_114); 

            			newLeafNode(otherlv_3, grammarAccess.getNamedElement_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:8878:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==28) ) {
                alt194=1;
            }
            switch (alt194) {
                case 1 :
                    // InternalCcsl.g:8879:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getNamedElement_ImplAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:8883:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:8884:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:8884:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:8885:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getNamedElement_ImplAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedElement_ImplRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:8903:3: (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( (LA195_0==31) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // InternalCcsl.g:8904:4: otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getNamedElement_ImplAccess().getNameKeyword_5_0());
                    			
                    // InternalCcsl.g:8908:4: ( (lv_name_7_0= ruleString0 ) )
                    // InternalCcsl.g:8909:5: (lv_name_7_0= ruleString0 )
                    {
                    // InternalCcsl.g:8909:5: (lv_name_7_0= ruleString0 )
                    // InternalCcsl.g:8910:6: lv_name_7_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getNamedElement_ImplAccess().getNameString0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_name_7_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedElement_ImplRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:8928:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt197=2;
            int LA197_0 = input.LA(1);

            if ( (LA197_0==29) ) {
                alt197=1;
            }
            switch (alt197) {
                case 1 :
                    // InternalCcsl.g:8929:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getNamedElement_ImplAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getNamedElement_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:8937:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:8938:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:8938:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:8939:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getNamedElement_ImplAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedElement_ImplRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:8956:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop196:
                    do {
                        int alt196=2;
                        int LA196_0 = input.LA(1);

                        if ( (LA196_0==16) ) {
                            alt196=1;
                        }


                        switch (alt196) {
                    	case 1 :
                    	    // InternalCcsl.g:8957:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getNamedElement_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:8961:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:8962:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:8962:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:8963:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getNamedElement_ImplAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNamedElement_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop196;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getNamedElement_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getNamedElement_ImplAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleNamedElement_Impl"


    // $ANTLR start "entryRulePackage"
    // InternalCcsl.g:8994:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalCcsl.g:8994:48: (iv_rulePackage= rulePackage EOF )
            // InternalCcsl.g:8995:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalCcsl.g:9001:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'groupedClasses' otherlv_15= '{' ( (lv_groupedClasses_16_0= ruleComplexType ) ) (otherlv_17= ',' ( (lv_groupedClasses_18_0= ruleComplexType ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_groupedClasses_16_0 = null;

        EObject lv_groupedClasses_18_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:9007:2: ( ( () otherlv_1= 'Package' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'groupedClasses' otherlv_15= '{' ( (lv_groupedClasses_16_0= ruleComplexType ) ) (otherlv_17= ',' ( (lv_groupedClasses_18_0= ruleComplexType ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalCcsl.g:9008:2: ( () otherlv_1= 'Package' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'groupedClasses' otherlv_15= '{' ( (lv_groupedClasses_16_0= ruleComplexType ) ) (otherlv_17= ',' ( (lv_groupedClasses_18_0= ruleComplexType ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalCcsl.g:9008:2: ( () otherlv_1= 'Package' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'groupedClasses' otherlv_15= '{' ( (lv_groupedClasses_16_0= ruleComplexType ) ) (otherlv_17= ',' ( (lv_groupedClasses_18_0= ruleComplexType ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalCcsl.g:9009:3: () otherlv_1= 'Package' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'groupedClasses' otherlv_15= '{' ( (lv_groupedClasses_16_0= ruleComplexType ) ) (otherlv_17= ',' ( (lv_groupedClasses_18_0= ruleComplexType ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalCcsl.g:9009:3: ()
            // InternalCcsl.g:9010:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,116,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalCcsl.g:9020:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:9021:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:9021:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:9022:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_116); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:9043:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==28) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // InternalCcsl.g:9044:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:9048:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:9049:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:9049:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:9050:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_117);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:9068:3: (otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) ) )?
            int alt199=2;
            int LA199_0 = input.LA(1);

            if ( (LA199_0==31) ) {
                alt199=1;
            }
            switch (alt199) {
                case 1 :
                    // InternalCcsl.g:9069:4: otherlv_6= 'name' ( (lv_name_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getNameKeyword_5_0());
                    			
                    // InternalCcsl.g:9073:4: ( (lv_name_7_0= ruleString0 ) )
                    // InternalCcsl.g:9074:5: (lv_name_7_0= ruleString0 )
                    {
                    // InternalCcsl.g:9074:5: (lv_name_7_0= ruleString0 )
                    // InternalCcsl.g:9075:6: lv_name_7_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getNameString0ParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_118);
                    lv_name_7_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.ccsl.xtext.Ccsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:9093:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==29) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // InternalCcsl.g:9094:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:9102:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:9103:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:9103:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:9104:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9121:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop200:
                    do {
                        int alt200=2;
                        int LA200_0 = input.LA(1);

                        if ( (LA200_0==16) ) {
                            alt200=1;
                        }


                        switch (alt200) {
                    	case 1 :
                    	    // InternalCcsl.g:9122:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPackageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:9126:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:9127:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:9127:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:9128:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop200;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_119); 

                    				newLeafNode(otherlv_13, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:9151:3: (otherlv_14= 'groupedClasses' otherlv_15= '{' ( (lv_groupedClasses_16_0= ruleComplexType ) ) (otherlv_17= ',' ( (lv_groupedClasses_18_0= ruleComplexType ) ) )* otherlv_19= '}' )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==117) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // InternalCcsl.g:9152:4: otherlv_14= 'groupedClasses' otherlv_15= '{' ( (lv_groupedClasses_16_0= ruleComplexType ) ) (otherlv_17= ',' ( (lv_groupedClasses_18_0= ruleComplexType ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,117,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getPackageAccess().getGroupedClassesKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_15, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCcsl.g:9160:4: ( (lv_groupedClasses_16_0= ruleComplexType ) )
                    // InternalCcsl.g:9161:5: (lv_groupedClasses_16_0= ruleComplexType )
                    {
                    // InternalCcsl.g:9161:5: (lv_groupedClasses_16_0= ruleComplexType )
                    // InternalCcsl.g:9162:6: lv_groupedClasses_16_0= ruleComplexType
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getGroupedClassesComplexTypeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_groupedClasses_16_0=ruleComplexType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						add(
                    							current,
                    							"groupedClasses",
                    							lv_groupedClasses_16_0,
                    							"org.ccsl.xtext.Ccsl.ComplexType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9179:4: (otherlv_17= ',' ( (lv_groupedClasses_18_0= ruleComplexType ) ) )*
                    loop202:
                    do {
                        int alt202=2;
                        int LA202_0 = input.LA(1);

                        if ( (LA202_0==16) ) {
                            alt202=1;
                        }


                        switch (alt202) {
                    	case 1 :
                    	    // InternalCcsl.g:9180:5: otherlv_17= ',' ( (lv_groupedClasses_18_0= ruleComplexType ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_120); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPackageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCcsl.g:9184:5: ( (lv_groupedClasses_18_0= ruleComplexType ) )
                    	    // InternalCcsl.g:9185:6: (lv_groupedClasses_18_0= ruleComplexType )
                    	    {
                    	    // InternalCcsl.g:9185:6: (lv_groupedClasses_18_0= ruleComplexType )
                    	    // InternalCcsl.g:9186:7: lv_groupedClasses_18_0= ruleComplexType
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getGroupedClassesComplexTypeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_groupedClasses_18_0=ruleComplexType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groupedClasses",
                    	    								lv_groupedClasses_18_0,
                    	    								"org.ccsl.xtext.Ccsl.ComplexType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop202;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_19, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleSwitchCaseBlock"
    // InternalCcsl.g:9217:1: entryRuleSwitchCaseBlock returns [EObject current=null] : iv_ruleSwitchCaseBlock= ruleSwitchCaseBlock EOF ;
    public final EObject entryRuleSwitchCaseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCaseBlock = null;


        try {
            // InternalCcsl.g:9217:56: (iv_ruleSwitchCaseBlock= ruleSwitchCaseBlock EOF )
            // InternalCcsl.g:9218:2: iv_ruleSwitchCaseBlock= ruleSwitchCaseBlock EOF
            {
             newCompositeNode(grammarAccess.getSwitchCaseBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCaseBlock=ruleSwitchCaseBlock();

            state._fsp--;

             current =iv_ruleSwitchCaseBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSwitchCaseBlock"


    // $ANTLR start "ruleSwitchCaseBlock"
    // InternalCcsl.g:9224:1: ruleSwitchCaseBlock returns [EObject current=null] : ( () otherlv_1= 'SwitchCaseBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'default' ( (lv_default_7_0= ruleBoolean ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'statements' otherlv_15= '{' ( (lv_statements_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_statements_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleSwitchCaseBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_default_7_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_statements_16_0 = null;

        EObject lv_statements_18_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:9230:2: ( ( () otherlv_1= 'SwitchCaseBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'default' ( (lv_default_7_0= ruleBoolean ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'statements' otherlv_15= '{' ( (lv_statements_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_statements_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalCcsl.g:9231:2: ( () otherlv_1= 'SwitchCaseBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'default' ( (lv_default_7_0= ruleBoolean ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'statements' otherlv_15= '{' ( (lv_statements_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_statements_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalCcsl.g:9231:2: ( () otherlv_1= 'SwitchCaseBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'default' ( (lv_default_7_0= ruleBoolean ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'statements' otherlv_15= '{' ( (lv_statements_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_statements_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalCcsl.g:9232:3: () otherlv_1= 'SwitchCaseBlock' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'default' ( (lv_default_7_0= ruleBoolean ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'statements' otherlv_15= '{' ( (lv_statements_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_statements_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalCcsl.g:9232:3: ()
            // InternalCcsl.g:9233:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSwitchCaseBlockAccess().getSwitchCaseBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,118,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSwitchCaseBlockAccess().getSwitchCaseBlockKeyword_1());
            		
            // InternalCcsl.g:9243:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:9244:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:9244:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:9245:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getSwitchCaseBlockAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchCaseBlockRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_121); 

            			newLeafNode(otherlv_3, grammarAccess.getSwitchCaseBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:9266:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt204=2;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==28) ) {
                alt204=1;
            }
            switch (alt204) {
                case 1 :
                    // InternalCcsl.g:9267:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSwitchCaseBlockAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:9271:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:9272:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:9272:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:9273:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getSwitchCaseBlockAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_122);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchCaseBlockRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:9291:3: (otherlv_6= 'default' ( (lv_default_7_0= ruleBoolean ) ) )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==119) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // InternalCcsl.g:9292:4: otherlv_6= 'default' ( (lv_default_7_0= ruleBoolean ) )
                    {
                    otherlv_6=(Token)match(input,119,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getSwitchCaseBlockAccess().getDefaultKeyword_5_0());
                    			
                    // InternalCcsl.g:9296:4: ( (lv_default_7_0= ruleBoolean ) )
                    // InternalCcsl.g:9297:5: (lv_default_7_0= ruleBoolean )
                    {
                    // InternalCcsl.g:9297:5: (lv_default_7_0= ruleBoolean )
                    // InternalCcsl.g:9298:6: lv_default_7_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getSwitchCaseBlockAccess().getDefaultBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_default_7_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchCaseBlockRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_7_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:9316:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==29) ) {
                alt207=1;
            }
            switch (alt207) {
                case 1 :
                    // InternalCcsl.g:9317:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSwitchCaseBlockAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getSwitchCaseBlockAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:9325:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:9326:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:9326:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:9327:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getSwitchCaseBlockAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchCaseBlockRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9344:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop206:
                    do {
                        int alt206=2;
                        int LA206_0 = input.LA(1);

                        if ( (LA206_0==16) ) {
                            alt206=1;
                        }


                        switch (alt206) {
                    	case 1 :
                    	    // InternalCcsl.g:9345:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSwitchCaseBlockAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:9349:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:9350:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:9350:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:9351:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getSwitchCaseBlockAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSwitchCaseBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop206;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_87); 

                    				newLeafNode(otherlv_13, grammarAccess.getSwitchCaseBlockAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:9374:3: (otherlv_14= 'statements' otherlv_15= '{' ( (lv_statements_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_statements_18_0= ruleStatement ) ) )* otherlv_19= '}' )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==71) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // InternalCcsl.g:9375:4: otherlv_14= 'statements' otherlv_15= '{' ( (lv_statements_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_statements_18_0= ruleStatement ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getSwitchCaseBlockAccess().getStatementsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_15, grammarAccess.getSwitchCaseBlockAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCcsl.g:9383:4: ( (lv_statements_16_0= ruleStatement ) )
                    // InternalCcsl.g:9384:5: (lv_statements_16_0= ruleStatement )
                    {
                    // InternalCcsl.g:9384:5: (lv_statements_16_0= ruleStatement )
                    // InternalCcsl.g:9385:6: lv_statements_16_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getSwitchCaseBlockAccess().getStatementsStatementParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_statements_16_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSwitchCaseBlockRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_16_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9402:4: (otherlv_17= ',' ( (lv_statements_18_0= ruleStatement ) ) )*
                    loop208:
                    do {
                        int alt208=2;
                        int LA208_0 = input.LA(1);

                        if ( (LA208_0==16) ) {
                            alt208=1;
                        }


                        switch (alt208) {
                    	case 1 :
                    	    // InternalCcsl.g:9403:5: otherlv_17= ',' ( (lv_statements_18_0= ruleStatement ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSwitchCaseBlockAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCcsl.g:9407:5: ( (lv_statements_18_0= ruleStatement ) )
                    	    // InternalCcsl.g:9408:6: (lv_statements_18_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:9408:6: (lv_statements_18_0= ruleStatement )
                    	    // InternalCcsl.g:9409:7: lv_statements_18_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getSwitchCaseBlockAccess().getStatementsStatementParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_statements_18_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSwitchCaseBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_18_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop208;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_19, grammarAccess.getSwitchCaseBlockAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getSwitchCaseBlockAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSwitchCaseBlock"


    // $ANTLR start "entryRuleOperatorExpression_Impl"
    // InternalCcsl.g:9440:1: entryRuleOperatorExpression_Impl returns [EObject current=null] : iv_ruleOperatorExpression_Impl= ruleOperatorExpression_Impl EOF ;
    public final EObject entryRuleOperatorExpression_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorExpression_Impl = null;


        try {
            // InternalCcsl.g:9440:64: (iv_ruleOperatorExpression_Impl= ruleOperatorExpression_Impl EOF )
            // InternalCcsl.g:9441:2: iv_ruleOperatorExpression_Impl= ruleOperatorExpression_Impl EOF
            {
             newCompositeNode(grammarAccess.getOperatorExpression_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperatorExpression_Impl=ruleOperatorExpression_Impl();

            state._fsp--;

             current =iv_ruleOperatorExpression_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperatorExpression_Impl"


    // $ANTLR start "ruleOperatorExpression_Impl"
    // InternalCcsl.g:9447:1: ruleOperatorExpression_Impl returns [EObject current=null] : ( () otherlv_1= 'OperatorExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleOperatorExpression_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_operands_14_0 = null;

        EObject lv_operands_16_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:9453:2: ( ( () otherlv_1= 'OperatorExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalCcsl.g:9454:2: ( () otherlv_1= 'OperatorExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalCcsl.g:9454:2: ( () otherlv_1= 'OperatorExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalCcsl.g:9455:3: () otherlv_1= 'OperatorExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalCcsl.g:9455:3: ()
            // InternalCcsl.g:9456:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperatorExpression_ImplAccess().getOperatorExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,120,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getOperatorExpression_ImplAccess().getOperatorExpressionKeyword_1());
            		
            // InternalCcsl.g:9466:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:9467:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:9467:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:9468:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getOperatorExpression_ImplAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperatorExpression_ImplRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_123); 

            			newLeafNode(otherlv_3, grammarAccess.getOperatorExpression_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:9489:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==28) ) {
                alt210=1;
            }
            switch (alt210) {
                case 1 :
                    // InternalCcsl.g:9490:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperatorExpression_ImplAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:9494:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:9495:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:9495:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:9496:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getOperatorExpression_ImplAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorExpression_ImplRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:9514:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt212=2;
            int LA212_0 = input.LA(1);

            if ( (LA212_0==29) ) {
                alt212=1;
            }
            switch (alt212) {
                case 1 :
                    // InternalCcsl.g:9515:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperatorExpression_ImplAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getOperatorExpression_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:9523:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:9524:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:9524:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:9525:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getOperatorExpression_ImplAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorExpression_ImplRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9542:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop211:
                    do {
                        int alt211=2;
                        int LA211_0 = input.LA(1);

                        if ( (LA211_0==16) ) {
                            alt211=1;
                        }


                        switch (alt211) {
                    	case 1 :
                    	    // InternalCcsl.g:9543:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOperatorExpression_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:9547:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:9548:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:9548:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:9549:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperatorExpression_ImplAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperatorExpression_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop211;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_125); 

                    				newLeafNode(otherlv_11, grammarAccess.getOperatorExpression_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:9572:3: (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )?
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==121) ) {
                alt214=1;
            }
            switch (alt214) {
                case 1 :
                    // InternalCcsl.g:9573:4: otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getOperatorExpression_ImplAccess().getOperandsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_13, grammarAccess.getOperatorExpression_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:9581:4: ( (lv_operands_14_0= ruleStatement ) )
                    // InternalCcsl.g:9582:5: (lv_operands_14_0= ruleStatement )
                    {
                    // InternalCcsl.g:9582:5: (lv_operands_14_0= ruleStatement )
                    // InternalCcsl.g:9583:6: lv_operands_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getOperatorExpression_ImplAccess().getOperandsStatementParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operands_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorExpression_ImplRule());
                    						}
                    						add(
                    							current,
                    							"operands",
                    							lv_operands_14_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9600:4: (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )*
                    loop213:
                    do {
                        int alt213=2;
                        int LA213_0 = input.LA(1);

                        if ( (LA213_0==16) ) {
                            alt213=1;
                        }


                        switch (alt213) {
                    	case 1 :
                    	    // InternalCcsl.g:9601:5: otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getOperatorExpression_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:9605:5: ( (lv_operands_16_0= ruleStatement ) )
                    	    // InternalCcsl.g:9606:6: (lv_operands_16_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:9606:6: (lv_operands_16_0= ruleStatement )
                    	    // InternalCcsl.g:9607:7: lv_operands_16_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperatorExpression_ImplAccess().getOperandsStatementParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_operands_16_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperatorExpression_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operands",
                    	    								lv_operands_16_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop213;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getOperatorExpression_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getOperatorExpression_ImplAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleOperatorExpression_Impl"


    // $ANTLR start "entryRuleStringConcatenation"
    // InternalCcsl.g:9638:1: entryRuleStringConcatenation returns [EObject current=null] : iv_ruleStringConcatenation= ruleStringConcatenation EOF ;
    public final EObject entryRuleStringConcatenation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConcatenation = null;


        try {
            // InternalCcsl.g:9638:60: (iv_ruleStringConcatenation= ruleStringConcatenation EOF )
            // InternalCcsl.g:9639:2: iv_ruleStringConcatenation= ruleStringConcatenation EOF
            {
             newCompositeNode(grammarAccess.getStringConcatenationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringConcatenation=ruleStringConcatenation();

            state._fsp--;

             current =iv_ruleStringConcatenation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringConcatenation"


    // $ANTLR start "ruleStringConcatenation"
    // InternalCcsl.g:9645:1: ruleStringConcatenation returns [EObject current=null] : ( () otherlv_1= 'StringConcatenation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleStringConcatenation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_operands_14_0 = null;

        EObject lv_operands_16_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:9651:2: ( ( () otherlv_1= 'StringConcatenation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalCcsl.g:9652:2: ( () otherlv_1= 'StringConcatenation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalCcsl.g:9652:2: ( () otherlv_1= 'StringConcatenation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalCcsl.g:9653:3: () otherlv_1= 'StringConcatenation' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalCcsl.g:9653:3: ()
            // InternalCcsl.g:9654:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringConcatenationAccess().getStringConcatenationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,122,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getStringConcatenationAccess().getStringConcatenationKeyword_1());
            		
            // InternalCcsl.g:9664:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:9665:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:9665:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:9666:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getStringConcatenationAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringConcatenationRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_123); 

            			newLeafNode(otherlv_3, grammarAccess.getStringConcatenationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:9687:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==28) ) {
                alt215=1;
            }
            switch (alt215) {
                case 1 :
                    // InternalCcsl.g:9688:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringConcatenationAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:9692:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:9693:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:9693:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:9694:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getStringConcatenationAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringConcatenationRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:9712:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==29) ) {
                alt217=1;
            }
            switch (alt217) {
                case 1 :
                    // InternalCcsl.g:9713:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getStringConcatenationAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getStringConcatenationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:9721:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:9722:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:9722:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:9723:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getStringConcatenationAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringConcatenationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9740:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop216:
                    do {
                        int alt216=2;
                        int LA216_0 = input.LA(1);

                        if ( (LA216_0==16) ) {
                            alt216=1;
                        }


                        switch (alt216) {
                    	case 1 :
                    	    // InternalCcsl.g:9741:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getStringConcatenationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:9745:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:9746:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:9746:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:9747:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getStringConcatenationAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStringConcatenationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop216;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_125); 

                    				newLeafNode(otherlv_11, grammarAccess.getStringConcatenationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:9770:3: (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )?
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==121) ) {
                alt219=1;
            }
            switch (alt219) {
                case 1 :
                    // InternalCcsl.g:9771:4: otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getStringConcatenationAccess().getOperandsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_13, grammarAccess.getStringConcatenationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:9779:4: ( (lv_operands_14_0= ruleStatement ) )
                    // InternalCcsl.g:9780:5: (lv_operands_14_0= ruleStatement )
                    {
                    // InternalCcsl.g:9780:5: (lv_operands_14_0= ruleStatement )
                    // InternalCcsl.g:9781:6: lv_operands_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStringConcatenationAccess().getOperandsStatementParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operands_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringConcatenationRule());
                    						}
                    						add(
                    							current,
                    							"operands",
                    							lv_operands_14_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9798:4: (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )*
                    loop218:
                    do {
                        int alt218=2;
                        int LA218_0 = input.LA(1);

                        if ( (LA218_0==16) ) {
                            alt218=1;
                        }


                        switch (alt218) {
                    	case 1 :
                    	    // InternalCcsl.g:9799:5: otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getStringConcatenationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:9803:5: ( (lv_operands_16_0= ruleStatement ) )
                    	    // InternalCcsl.g:9804:6: (lv_operands_16_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:9804:6: (lv_operands_16_0= ruleStatement )
                    	    // InternalCcsl.g:9805:7: lv_operands_16_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getStringConcatenationAccess().getOperandsStatementParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_operands_16_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStringConcatenationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operands",
                    	    								lv_operands_16_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop218;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getStringConcatenationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getStringConcatenationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleStringConcatenation"


    // $ANTLR start "entryRuleInfixExpression"
    // InternalCcsl.g:9836:1: entryRuleInfixExpression returns [EObject current=null] : iv_ruleInfixExpression= ruleInfixExpression EOF ;
    public final EObject entryRuleInfixExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixExpression = null;


        try {
            // InternalCcsl.g:9836:56: (iv_ruleInfixExpression= ruleInfixExpression EOF )
            // InternalCcsl.g:9837:2: iv_ruleInfixExpression= ruleInfixExpression EOF
            {
             newCompositeNode(grammarAccess.getInfixExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfixExpression=ruleInfixExpression();

            state._fsp--;

             current =iv_ruleInfixExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInfixExpression"


    // $ANTLR start "ruleInfixExpression"
    // InternalCcsl.g:9843:1: ruleInfixExpression returns [EObject current=null] : ( () otherlv_1= 'InfixExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleInfixExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_operands_14_0 = null;

        EObject lv_operands_16_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:9849:2: ( ( () otherlv_1= 'InfixExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalCcsl.g:9850:2: ( () otherlv_1= 'InfixExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalCcsl.g:9850:2: ( () otherlv_1= 'InfixExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalCcsl.g:9851:3: () otherlv_1= 'InfixExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalCcsl.g:9851:3: ()
            // InternalCcsl.g:9852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfixExpressionAccess().getInfixExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,123,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getInfixExpressionAccess().getInfixExpressionKeyword_1());
            		
            // InternalCcsl.g:9862:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:9863:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:9863:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:9864:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getInfixExpressionAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfixExpressionRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_123); 

            			newLeafNode(otherlv_3, grammarAccess.getInfixExpressionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:9885:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==28) ) {
                alt220=1;
            }
            switch (alt220) {
                case 1 :
                    // InternalCcsl.g:9886:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getInfixExpressionAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:9890:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:9891:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:9891:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:9892:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getInfixExpressionAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInfixExpressionRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:9910:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==29) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // InternalCcsl.g:9911:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getInfixExpressionAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getInfixExpressionAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:9919:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:9920:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:9920:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:9921:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getInfixExpressionAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInfixExpressionRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9938:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop221:
                    do {
                        int alt221=2;
                        int LA221_0 = input.LA(1);

                        if ( (LA221_0==16) ) {
                            alt221=1;
                        }


                        switch (alt221) {
                    	case 1 :
                    	    // InternalCcsl.g:9939:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getInfixExpressionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:9943:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:9944:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:9944:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:9945:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixExpressionAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop221;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_125); 

                    				newLeafNode(otherlv_11, grammarAccess.getInfixExpressionAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:9968:3: (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )?
            int alt224=2;
            int LA224_0 = input.LA(1);

            if ( (LA224_0==121) ) {
                alt224=1;
            }
            switch (alt224) {
                case 1 :
                    // InternalCcsl.g:9969:4: otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getInfixExpressionAccess().getOperandsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_13, grammarAccess.getInfixExpressionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:9977:4: ( (lv_operands_14_0= ruleStatement ) )
                    // InternalCcsl.g:9978:5: (lv_operands_14_0= ruleStatement )
                    {
                    // InternalCcsl.g:9978:5: (lv_operands_14_0= ruleStatement )
                    // InternalCcsl.g:9979:6: lv_operands_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getInfixExpressionAccess().getOperandsStatementParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operands_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInfixExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operands",
                    							lv_operands_14_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:9996:4: (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )*
                    loop223:
                    do {
                        int alt223=2;
                        int LA223_0 = input.LA(1);

                        if ( (LA223_0==16) ) {
                            alt223=1;
                        }


                        switch (alt223) {
                    	case 1 :
                    	    // InternalCcsl.g:9997:5: otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getInfixExpressionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:10001:5: ( (lv_operands_16_0= ruleStatement ) )
                    	    // InternalCcsl.g:10002:6: (lv_operands_16_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:10002:6: (lv_operands_16_0= ruleStatement )
                    	    // InternalCcsl.g:10003:7: lv_operands_16_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfixExpressionAccess().getOperandsStatementParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_operands_16_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfixExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operands",
                    	    								lv_operands_16_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop223;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getInfixExpressionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getInfixExpressionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleInfixExpression"


    // $ANTLR start "entryRuleAssignment"
    // InternalCcsl.g:10034:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalCcsl.g:10034:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalCcsl.g:10035:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalCcsl.g:10041:1: ruleAssignment returns [EObject current=null] : ( () otherlv_1= 'Assignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'target' ( (lv_target_19_0= ruleStatement ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_operands_14_0 = null;

        EObject lv_operands_16_0 = null;

        EObject lv_target_19_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:10047:2: ( ( () otherlv_1= 'Assignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'target' ( (lv_target_19_0= ruleStatement ) ) )? otherlv_20= '}' ) )
            // InternalCcsl.g:10048:2: ( () otherlv_1= 'Assignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'target' ( (lv_target_19_0= ruleStatement ) ) )? otherlv_20= '}' )
            {
            // InternalCcsl.g:10048:2: ( () otherlv_1= 'Assignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'target' ( (lv_target_19_0= ruleStatement ) ) )? otherlv_20= '}' )
            // InternalCcsl.g:10049:3: () otherlv_1= 'Assignment' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )? (otherlv_18= 'target' ( (lv_target_19_0= ruleStatement ) ) )? otherlv_20= '}'
            {
            // InternalCcsl.g:10049:3: ()
            // InternalCcsl.g:10050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssignmentAccess().getAssignmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,124,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getAssignmentKeyword_1());
            		
            // InternalCcsl.g:10060:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:10061:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:10061:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:10062:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_126); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:10083:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt225=2;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==28) ) {
                alt225=1;
            }
            switch (alt225) {
                case 1 :
                    // InternalCcsl.g:10084:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:10088:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:10089:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:10089:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:10090:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_127);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:10108:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt227=2;
            int LA227_0 = input.LA(1);

            if ( (LA227_0==29) ) {
                alt227=1;
            }
            switch (alt227) {
                case 1 :
                    // InternalCcsl.g:10109:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAssignmentAccess().getPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssignmentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCcsl.g:10117:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalCcsl.g:10118:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalCcsl.g:10118:5: (lv_properties_8_0= ruleProperty )
                    // InternalCcsl.g:10119:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getPropertiesPropertyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:10136:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop226:
                    do {
                        int alt226=2;
                        int LA226_0 = input.LA(1);

                        if ( (LA226_0==16) ) {
                            alt226=1;
                        }


                        switch (alt226) {
                    	case 1 :
                    	    // InternalCcsl.g:10137:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAssignmentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCcsl.g:10141:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalCcsl.g:10142:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:10142:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalCcsl.g:10143:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssignmentAccess().getPropertiesPropertyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop226;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_128); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssignmentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:10166:3: (otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}' )?
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==121) ) {
                alt229=1;
            }
            switch (alt229) {
                case 1 :
                    // InternalCcsl.g:10167:4: otherlv_12= 'operands' otherlv_13= '{' ( (lv_operands_14_0= ruleStatement ) ) (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssignmentAccess().getOperandsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_13, grammarAccess.getAssignmentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:10175:4: ( (lv_operands_14_0= ruleStatement ) )
                    // InternalCcsl.g:10176:5: (lv_operands_14_0= ruleStatement )
                    {
                    // InternalCcsl.g:10176:5: (lv_operands_14_0= ruleStatement )
                    // InternalCcsl.g:10177:6: lv_operands_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getOperandsStatementParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operands_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"operands",
                    							lv_operands_14_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:10194:4: (otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) ) )*
                    loop228:
                    do {
                        int alt228=2;
                        int LA228_0 = input.LA(1);

                        if ( (LA228_0==16) ) {
                            alt228=1;
                        }


                        switch (alt228) {
                    	case 1 :
                    	    // InternalCcsl.g:10195:5: otherlv_15= ',' ( (lv_operands_16_0= ruleStatement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAssignmentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:10199:5: ( (lv_operands_16_0= ruleStatement ) )
                    	    // InternalCcsl.g:10200:6: (lv_operands_16_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:10200:6: (lv_operands_16_0= ruleStatement )
                    	    // InternalCcsl.g:10201:7: lv_operands_16_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssignmentAccess().getOperandsStatementParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_operands_16_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operands",
                    	    								lv_operands_16_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop228;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_129); 

                    				newLeafNode(otherlv_17, grammarAccess.getAssignmentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:10224:3: (otherlv_18= 'target' ( (lv_target_19_0= ruleStatement ) ) )?
            int alt230=2;
            int LA230_0 = input.LA(1);

            if ( (LA230_0==125) ) {
                alt230=1;
            }
            switch (alt230) {
                case 1 :
                    // InternalCcsl.g:10225:4: otherlv_18= 'target' ( (lv_target_19_0= ruleStatement ) )
                    {
                    otherlv_18=(Token)match(input,125,FOLLOW_64); 

                    				newLeafNode(otherlv_18, grammarAccess.getAssignmentAccess().getTargetKeyword_7_0());
                    			
                    // InternalCcsl.g:10229:4: ( (lv_target_19_0= ruleStatement ) )
                    // InternalCcsl.g:10230:5: (lv_target_19_0= ruleStatement )
                    {
                    // InternalCcsl.g:10230:5: (lv_target_19_0= ruleStatement )
                    // InternalCcsl.g:10231:6: lv_target_19_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getTargetStatementParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_target_19_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"target",
                    							lv_target_19_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getAssignmentAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalCcsl.g:10257:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalCcsl.g:10257:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalCcsl.g:10258:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalCcsl.g:10264:1: ruleBooleanExpression returns [EObject current=null] : ( () otherlv_1= 'BooleanExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'booleanOperator' ( (lv_booleanOperator_7_0= ruleBooleanOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        Enumerator lv_booleanOperator_7_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_operands_16_0 = null;

        EObject lv_operands_18_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:10270:2: ( ( () otherlv_1= 'BooleanExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'booleanOperator' ( (lv_booleanOperator_7_0= ruleBooleanOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalCcsl.g:10271:2: ( () otherlv_1= 'BooleanExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'booleanOperator' ( (lv_booleanOperator_7_0= ruleBooleanOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalCcsl.g:10271:2: ( () otherlv_1= 'BooleanExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'booleanOperator' ( (lv_booleanOperator_7_0= ruleBooleanOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalCcsl.g:10272:3: () otherlv_1= 'BooleanExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'booleanOperator' ( (lv_booleanOperator_7_0= ruleBooleanOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalCcsl.g:10272:3: ()
            // InternalCcsl.g:10273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanExpressionAccess().getBooleanExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,126,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanExpressionAccess().getBooleanExpressionKeyword_1());
            		
            // InternalCcsl.g:10283:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:10284:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:10284:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:10285:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_130); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanExpressionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:10306:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt231=2;
            int LA231_0 = input.LA(1);

            if ( (LA231_0==28) ) {
                alt231=1;
            }
            switch (alt231) {
                case 1 :
                    // InternalCcsl.g:10307:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getBooleanExpressionAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:10311:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:10312:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:10312:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:10313:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_131);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:10331:3: (otherlv_6= 'booleanOperator' ( (lv_booleanOperator_7_0= ruleBooleanOperator ) ) )?
            int alt232=2;
            int LA232_0 = input.LA(1);

            if ( (LA232_0==127) ) {
                alt232=1;
            }
            switch (alt232) {
                case 1 :
                    // InternalCcsl.g:10332:4: otherlv_6= 'booleanOperator' ( (lv_booleanOperator_7_0= ruleBooleanOperator ) )
                    {
                    otherlv_6=(Token)match(input,127,FOLLOW_132); 

                    				newLeafNode(otherlv_6, grammarAccess.getBooleanExpressionAccess().getBooleanOperatorKeyword_5_0());
                    			
                    // InternalCcsl.g:10336:4: ( (lv_booleanOperator_7_0= ruleBooleanOperator ) )
                    // InternalCcsl.g:10337:5: (lv_booleanOperator_7_0= ruleBooleanOperator )
                    {
                    // InternalCcsl.g:10337:5: (lv_booleanOperator_7_0= ruleBooleanOperator )
                    // InternalCcsl.g:10338:6: lv_booleanOperator_7_0= ruleBooleanOperator
                    {

                    						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanOperatorBooleanOperatorEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_booleanOperator_7_0=ruleBooleanOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                    						}
                    						set(
                    							current,
                    							"booleanOperator",
                    							lv_booleanOperator_7_0,
                    							"org.ccsl.xtext.Ccsl.BooleanOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:10356:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt234=2;
            int LA234_0 = input.LA(1);

            if ( (LA234_0==29) ) {
                alt234=1;
            }
            switch (alt234) {
                case 1 :
                    // InternalCcsl.g:10357:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getBooleanExpressionAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getBooleanExpressionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:10365:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:10366:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:10366:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:10367:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:10384:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop233:
                    do {
                        int alt233=2;
                        int LA233_0 = input.LA(1);

                        if ( (LA233_0==16) ) {
                            alt233=1;
                        }


                        switch (alt233) {
                    	case 1 :
                    	    // InternalCcsl.g:10385:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBooleanExpressionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:10389:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:10390:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:10390:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:10391:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getBooleanExpressionAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop233;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_125); 

                    				newLeafNode(otherlv_13, grammarAccess.getBooleanExpressionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:10414:3: (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )?
            int alt236=2;
            int LA236_0 = input.LA(1);

            if ( (LA236_0==121) ) {
                alt236=1;
            }
            switch (alt236) {
                case 1 :
                    // InternalCcsl.g:10415:4: otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,121,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getBooleanExpressionAccess().getOperandsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_15, grammarAccess.getBooleanExpressionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCcsl.g:10423:4: ( (lv_operands_16_0= ruleStatement ) )
                    // InternalCcsl.g:10424:5: (lv_operands_16_0= ruleStatement )
                    {
                    // InternalCcsl.g:10424:5: (lv_operands_16_0= ruleStatement )
                    // InternalCcsl.g:10425:6: lv_operands_16_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getOperandsStatementParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operands_16_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operands",
                    							lv_operands_16_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:10442:4: (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )*
                    loop235:
                    do {
                        int alt235=2;
                        int LA235_0 = input.LA(1);

                        if ( (LA235_0==16) ) {
                            alt235=1;
                        }


                        switch (alt235) {
                    	case 1 :
                    	    // InternalCcsl.g:10443:5: otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getBooleanExpressionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCcsl.g:10447:5: ( (lv_operands_18_0= ruleStatement ) )
                    	    // InternalCcsl.g:10448:6: (lv_operands_18_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:10448:6: (lv_operands_18_0= ruleStatement )
                    	    // InternalCcsl.g:10449:7: lv_operands_18_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBooleanExpressionAccess().getOperandsStatementParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_operands_18_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operands",
                    	    								lv_operands_18_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop235;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_19, grammarAccess.getBooleanExpressionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getBooleanExpressionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalCcsl.g:10480:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalCcsl.g:10480:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalCcsl.g:10481:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalCcsl.g:10487:1: ruleArithmeticExpression returns [EObject current=null] : ( () otherlv_1= 'ArithmeticExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'arithmeticOperator' ( (lv_arithmeticOperator_7_0= ruleArithmeticOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_uniqueName_2_0 = null;

        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        Enumerator lv_arithmeticOperator_7_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_operands_16_0 = null;

        EObject lv_operands_18_0 = null;



        	enterRule();

        try {
            // InternalCcsl.g:10493:2: ( ( () otherlv_1= 'ArithmeticExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'arithmeticOperator' ( (lv_arithmeticOperator_7_0= ruleArithmeticOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalCcsl.g:10494:2: ( () otherlv_1= 'ArithmeticExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'arithmeticOperator' ( (lv_arithmeticOperator_7_0= ruleArithmeticOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalCcsl.g:10494:2: ( () otherlv_1= 'ArithmeticExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'arithmeticOperator' ( (lv_arithmeticOperator_7_0= ruleArithmeticOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalCcsl.g:10495:3: () otherlv_1= 'ArithmeticExpression' ( (lv_uniqueName_2_0= ruleString0 ) ) otherlv_3= '{' (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )? (otherlv_6= 'arithmeticOperator' ( (lv_arithmeticOperator_7_0= ruleArithmeticOperator ) ) )? (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )? (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalCcsl.g:10495:3: ()
            // InternalCcsl.g:10496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,128,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionKeyword_1());
            		
            // InternalCcsl.g:10506:3: ( (lv_uniqueName_2_0= ruleString0 ) )
            // InternalCcsl.g:10507:4: (lv_uniqueName_2_0= ruleString0 )
            {
            // InternalCcsl.g:10507:4: (lv_uniqueName_2_0= ruleString0 )
            // InternalCcsl.g:10508:5: lv_uniqueName_2_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getUniqueNameString0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_uniqueName_2_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            					}
            					set(
            						current,
            						"uniqueName",
            						lv_uniqueName_2_0,
            						"org.ccsl.xtext.Ccsl.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_133); 

            			newLeafNode(otherlv_3, grammarAccess.getArithmeticExpressionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCcsl.g:10529:3: (otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) ) )?
            int alt237=2;
            int LA237_0 = input.LA(1);

            if ( (LA237_0==28) ) {
                alt237=1;
            }
            switch (alt237) {
                case 1 :
                    // InternalCcsl.g:10530:4: otherlv_4= 'exact' ( (lv_exact_5_0= ruleBoolean ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getArithmeticExpressionAccess().getExactKeyword_4_0());
                    			
                    // InternalCcsl.g:10534:4: ( (lv_exact_5_0= ruleBoolean ) )
                    // InternalCcsl.g:10535:5: (lv_exact_5_0= ruleBoolean )
                    {
                    // InternalCcsl.g:10535:5: (lv_exact_5_0= ruleBoolean )
                    // InternalCcsl.g:10536:6: lv_exact_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getExactBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_134);
                    lv_exact_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
                    						}
                    						set(
                    							current,
                    							"exact",
                    							lv_exact_5_0,
                    							"org.ccsl.xtext.Ccsl.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:10554:3: (otherlv_6= 'arithmeticOperator' ( (lv_arithmeticOperator_7_0= ruleArithmeticOperator ) ) )?
            int alt238=2;
            int LA238_0 = input.LA(1);

            if ( (LA238_0==129) ) {
                alt238=1;
            }
            switch (alt238) {
                case 1 :
                    // InternalCcsl.g:10555:4: otherlv_6= 'arithmeticOperator' ( (lv_arithmeticOperator_7_0= ruleArithmeticOperator ) )
                    {
                    otherlv_6=(Token)match(input,129,FOLLOW_135); 

                    				newLeafNode(otherlv_6, grammarAccess.getArithmeticExpressionAccess().getArithmeticOperatorKeyword_5_0());
                    			
                    // InternalCcsl.g:10559:4: ( (lv_arithmeticOperator_7_0= ruleArithmeticOperator ) )
                    // InternalCcsl.g:10560:5: (lv_arithmeticOperator_7_0= ruleArithmeticOperator )
                    {
                    // InternalCcsl.g:10560:5: (lv_arithmeticOperator_7_0= ruleArithmeticOperator )
                    // InternalCcsl.g:10561:6: lv_arithmeticOperator_7_0= ruleArithmeticOperator
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getArithmeticOperatorArithmeticOperatorEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_arithmeticOperator_7_0=ruleArithmeticOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
                    						}
                    						set(
                    							current,
                    							"arithmeticOperator",
                    							lv_arithmeticOperator_7_0,
                    							"org.ccsl.xtext.Ccsl.ArithmeticOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCcsl.g:10579:3: (otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}' )?
            int alt240=2;
            int LA240_0 = input.LA(1);

            if ( (LA240_0==29) ) {
                alt240=1;
            }
            switch (alt240) {
                case 1 :
                    // InternalCcsl.g:10580:4: otherlv_8= 'properties' otherlv_9= '{' ( (lv_properties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getArithmeticExpressionAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getArithmeticExpressionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCcsl.g:10588:4: ( (lv_properties_10_0= ruleProperty ) )
                    // InternalCcsl.g:10589:5: (lv_properties_10_0= ruleProperty )
                    {
                    // InternalCcsl.g:10589:5: (lv_properties_10_0= ruleProperty )
                    // InternalCcsl.g:10590:6: lv_properties_10_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_properties_10_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.ccsl.xtext.Ccsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:10607:4: (otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) ) )*
                    loop239:
                    do {
                        int alt239=2;
                        int LA239_0 = input.LA(1);

                        if ( (LA239_0==16) ) {
                            alt239=1;
                        }


                        switch (alt239) {
                    	case 1 :
                    	    // InternalCcsl.g:10608:5: otherlv_11= ',' ( (lv_properties_12_0= ruleProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getArithmeticExpressionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCcsl.g:10612:5: ( (lv_properties_12_0= ruleProperty ) )
                    	    // InternalCcsl.g:10613:6: (lv_properties_12_0= ruleProperty )
                    	    {
                    	    // InternalCcsl.g:10613:6: (lv_properties_12_0= ruleProperty )
                    	    // InternalCcsl.g:10614:7: lv_properties_12_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_12_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_12_0,
                    	    								"org.ccsl.xtext.Ccsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop239;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_125); 

                    				newLeafNode(otherlv_13, grammarAccess.getArithmeticExpressionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCcsl.g:10637:3: (otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}' )?
            int alt242=2;
            int LA242_0 = input.LA(1);

            if ( (LA242_0==121) ) {
                alt242=1;
            }
            switch (alt242) {
                case 1 :
                    // InternalCcsl.g:10638:4: otherlv_14= 'operands' otherlv_15= '{' ( (lv_operands_16_0= ruleStatement ) ) (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,121,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getArithmeticExpressionAccess().getOperandsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_15, grammarAccess.getArithmeticExpressionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCcsl.g:10646:4: ( (lv_operands_16_0= ruleStatement ) )
                    // InternalCcsl.g:10647:5: (lv_operands_16_0= ruleStatement )
                    {
                    // InternalCcsl.g:10647:5: (lv_operands_16_0= ruleStatement )
                    // InternalCcsl.g:10648:6: lv_operands_16_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getOperandsStatementParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operands_16_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operands",
                    							lv_operands_16_0,
                    							"org.ccsl.xtext.Ccsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCcsl.g:10665:4: (otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) ) )*
                    loop241:
                    do {
                        int alt241=2;
                        int LA241_0 = input.LA(1);

                        if ( (LA241_0==16) ) {
                            alt241=1;
                        }


                        switch (alt241) {
                    	case 1 :
                    	    // InternalCcsl.g:10666:5: otherlv_17= ',' ( (lv_operands_18_0= ruleStatement ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_64); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getArithmeticExpressionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCcsl.g:10670:5: ( (lv_operands_18_0= ruleStatement ) )
                    	    // InternalCcsl.g:10671:6: (lv_operands_18_0= ruleStatement )
                    	    {
                    	    // InternalCcsl.g:10671:6: (lv_operands_18_0= ruleStatement )
                    	    // InternalCcsl.g:10672:7: lv_operands_18_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getOperandsStatementParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_operands_18_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operands",
                    	    								lv_operands_18_0,
                    	    								"org.ccsl.xtext.Ccsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop241;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_19, grammarAccess.getArithmeticExpressionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getArithmeticExpressionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "ruleLogicOperator"
    // InternalCcsl.g:10703:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'IF_THEN' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCcsl.g:10709:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'IF_THEN' ) ) )
            // InternalCcsl.g:10710:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'IF_THEN' ) )
            {
            // InternalCcsl.g:10710:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'IF_THEN' ) )
            int alt243=3;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt243=1;
                }
                break;
            case 131:
                {
                alt243=2;
                }
                break;
            case 132:
                {
                alt243=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 243, 0, input);

                throw nvae;
            }

            switch (alt243) {
                case 1 :
                    // InternalCcsl.g:10711:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalCcsl.g:10711:3: (enumLiteral_0= 'AND' )
                    // InternalCcsl.g:10712:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsl.g:10719:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalCcsl.g:10719:3: (enumLiteral_1= 'OR' )
                    // InternalCcsl.g:10720:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCcsl.g:10727:3: (enumLiteral_2= 'IF_THEN' )
                    {
                    // InternalCcsl.g:10727:3: (enumLiteral_2= 'IF_THEN' )
                    // InternalCcsl.g:10728:4: enumLiteral_2= 'IF_THEN'
                    {
                    enumLiteral_2=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getLogicOperatorAccess().getIF_THENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicOperatorAccess().getIF_THENEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleBooleanOperator"
    // InternalCcsl.g:10738:1: ruleBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUAL_TO' ) | (enumLiteral_4= 'NOT_EQUAL_TO' ) | (enumLiteral_5= 'GREATER_THAN' ) | (enumLiteral_6= 'LESS_THAN' ) | (enumLiteral_7= 'GREATER_THAN_OR_EQUAL_TO' ) | (enumLiteral_8= 'LESS_THAN_OR_EQUAL_TO' ) | (enumLiteral_9= 'UNDEFINED' ) ) ;
    public final Enumerator ruleBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalCcsl.g:10744:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUAL_TO' ) | (enumLiteral_4= 'NOT_EQUAL_TO' ) | (enumLiteral_5= 'GREATER_THAN' ) | (enumLiteral_6= 'LESS_THAN' ) | (enumLiteral_7= 'GREATER_THAN_OR_EQUAL_TO' ) | (enumLiteral_8= 'LESS_THAN_OR_EQUAL_TO' ) | (enumLiteral_9= 'UNDEFINED' ) ) )
            // InternalCcsl.g:10745:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUAL_TO' ) | (enumLiteral_4= 'NOT_EQUAL_TO' ) | (enumLiteral_5= 'GREATER_THAN' ) | (enumLiteral_6= 'LESS_THAN' ) | (enumLiteral_7= 'GREATER_THAN_OR_EQUAL_TO' ) | (enumLiteral_8= 'LESS_THAN_OR_EQUAL_TO' ) | (enumLiteral_9= 'UNDEFINED' ) )
            {
            // InternalCcsl.g:10745:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUAL_TO' ) | (enumLiteral_4= 'NOT_EQUAL_TO' ) | (enumLiteral_5= 'GREATER_THAN' ) | (enumLiteral_6= 'LESS_THAN' ) | (enumLiteral_7= 'GREATER_THAN_OR_EQUAL_TO' ) | (enumLiteral_8= 'LESS_THAN_OR_EQUAL_TO' ) | (enumLiteral_9= 'UNDEFINED' ) )
            int alt244=10;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt244=1;
                }
                break;
            case 131:
                {
                alt244=2;
                }
                break;
            case 133:
                {
                alt244=3;
                }
                break;
            case 134:
                {
                alt244=4;
                }
                break;
            case 135:
                {
                alt244=5;
                }
                break;
            case 136:
                {
                alt244=6;
                }
                break;
            case 137:
                {
                alt244=7;
                }
                break;
            case 138:
                {
                alt244=8;
                }
                break;
            case 139:
                {
                alt244=9;
                }
                break;
            case 140:
                {
                alt244=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 244, 0, input);

                throw nvae;
            }

            switch (alt244) {
                case 1 :
                    // InternalCcsl.g:10746:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalCcsl.g:10746:3: (enumLiteral_0= 'AND' )
                    // InternalCcsl.g:10747:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsl.g:10754:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalCcsl.g:10754:3: (enumLiteral_1= 'OR' )
                    // InternalCcsl.g:10755:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCcsl.g:10762:3: (enumLiteral_2= 'NOT' )
                    {
                    // InternalCcsl.g:10762:3: (enumLiteral_2= 'NOT' )
                    // InternalCcsl.g:10763:4: enumLiteral_2= 'NOT'
                    {
                    enumLiteral_2=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBooleanOperatorAccess().getNOTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCcsl.g:10770:3: (enumLiteral_3= 'EQUAL_TO' )
                    {
                    // InternalCcsl.g:10770:3: (enumLiteral_3= 'EQUAL_TO' )
                    // InternalCcsl.g:10771:4: enumLiteral_3= 'EQUAL_TO'
                    {
                    enumLiteral_3=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getEQUAL_TOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBooleanOperatorAccess().getEQUAL_TOEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCcsl.g:10778:3: (enumLiteral_4= 'NOT_EQUAL_TO' )
                    {
                    // InternalCcsl.g:10778:3: (enumLiteral_4= 'NOT_EQUAL_TO' )
                    // InternalCcsl.g:10779:4: enumLiteral_4= 'NOT_EQUAL_TO'
                    {
                    enumLiteral_4=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getNOT_EQUAL_TOEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBooleanOperatorAccess().getNOT_EQUAL_TOEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCcsl.g:10786:3: (enumLiteral_5= 'GREATER_THAN' )
                    {
                    // InternalCcsl.g:10786:3: (enumLiteral_5= 'GREATER_THAN' )
                    // InternalCcsl.g:10787:4: enumLiteral_5= 'GREATER_THAN'
                    {
                    enumLiteral_5=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getGREATER_THANEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBooleanOperatorAccess().getGREATER_THANEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCcsl.g:10794:3: (enumLiteral_6= 'LESS_THAN' )
                    {
                    // InternalCcsl.g:10794:3: (enumLiteral_6= 'LESS_THAN' )
                    // InternalCcsl.g:10795:4: enumLiteral_6= 'LESS_THAN'
                    {
                    enumLiteral_6=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getLESS_THANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBooleanOperatorAccess().getLESS_THANEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCcsl.g:10802:3: (enumLiteral_7= 'GREATER_THAN_OR_EQUAL_TO' )
                    {
                    // InternalCcsl.g:10802:3: (enumLiteral_7= 'GREATER_THAN_OR_EQUAL_TO' )
                    // InternalCcsl.g:10803:4: enumLiteral_7= 'GREATER_THAN_OR_EQUAL_TO'
                    {
                    enumLiteral_7=(Token)match(input,138,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getGREATER_THAN_OR_EQUAL_TOEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBooleanOperatorAccess().getGREATER_THAN_OR_EQUAL_TOEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalCcsl.g:10810:3: (enumLiteral_8= 'LESS_THAN_OR_EQUAL_TO' )
                    {
                    // InternalCcsl.g:10810:3: (enumLiteral_8= 'LESS_THAN_OR_EQUAL_TO' )
                    // InternalCcsl.g:10811:4: enumLiteral_8= 'LESS_THAN_OR_EQUAL_TO'
                    {
                    enumLiteral_8=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getLESS_THAN_OR_EQUAL_TOEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBooleanOperatorAccess().getLESS_THAN_OR_EQUAL_TOEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalCcsl.g:10818:3: (enumLiteral_9= 'UNDEFINED' )
                    {
                    // InternalCcsl.g:10818:3: (enumLiteral_9= 'UNDEFINED' )
                    // InternalCcsl.g:10819:4: enumLiteral_9= 'UNDEFINED'
                    {
                    enumLiteral_9=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getUNDEFINEDEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBooleanOperatorAccess().getUNDEFINEDEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "ruleArithmeticOperator"
    // InternalCcsl.g:10829:1: ruleArithmeticOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'ADDITION' ) | (enumLiteral_1= 'SUBTRACTION' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'DIVISION' ) | (enumLiteral_4= 'MODULUS' ) | (enumLiteral_5= 'UNDEFINED' ) ) ;
    public final Enumerator ruleArithmeticOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalCcsl.g:10835:2: ( ( (enumLiteral_0= 'ADDITION' ) | (enumLiteral_1= 'SUBTRACTION' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'DIVISION' ) | (enumLiteral_4= 'MODULUS' ) | (enumLiteral_5= 'UNDEFINED' ) ) )
            // InternalCcsl.g:10836:2: ( (enumLiteral_0= 'ADDITION' ) | (enumLiteral_1= 'SUBTRACTION' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'DIVISION' ) | (enumLiteral_4= 'MODULUS' ) | (enumLiteral_5= 'UNDEFINED' ) )
            {
            // InternalCcsl.g:10836:2: ( (enumLiteral_0= 'ADDITION' ) | (enumLiteral_1= 'SUBTRACTION' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'DIVISION' ) | (enumLiteral_4= 'MODULUS' ) | (enumLiteral_5= 'UNDEFINED' ) )
            int alt245=6;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt245=1;
                }
                break;
            case 142:
                {
                alt245=2;
                }
                break;
            case 143:
                {
                alt245=3;
                }
                break;
            case 144:
                {
                alt245=4;
                }
                break;
            case 145:
                {
                alt245=5;
                }
                break;
            case 140:
                {
                alt245=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 245, 0, input);

                throw nvae;
            }

            switch (alt245) {
                case 1 :
                    // InternalCcsl.g:10837:3: (enumLiteral_0= 'ADDITION' )
                    {
                    // InternalCcsl.g:10837:3: (enumLiteral_0= 'ADDITION' )
                    // InternalCcsl.g:10838:4: enumLiteral_0= 'ADDITION'
                    {
                    enumLiteral_0=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getADDITIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArithmeticOperatorAccess().getADDITIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCcsl.g:10845:3: (enumLiteral_1= 'SUBTRACTION' )
                    {
                    // InternalCcsl.g:10845:3: (enumLiteral_1= 'SUBTRACTION' )
                    // InternalCcsl.g:10846:4: enumLiteral_1= 'SUBTRACTION'
                    {
                    enumLiteral_1=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArithmeticOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCcsl.g:10853:3: (enumLiteral_2= 'MULTIPLICATION' )
                    {
                    // InternalCcsl.g:10853:3: (enumLiteral_2= 'MULTIPLICATION' )
                    // InternalCcsl.g:10854:4: enumLiteral_2= 'MULTIPLICATION'
                    {
                    enumLiteral_2=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArithmeticOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCcsl.g:10861:3: (enumLiteral_3= 'DIVISION' )
                    {
                    // InternalCcsl.g:10861:3: (enumLiteral_3= 'DIVISION' )
                    // InternalCcsl.g:10862:4: enumLiteral_3= 'DIVISION'
                    {
                    enumLiteral_3=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getDIVISIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getArithmeticOperatorAccess().getDIVISIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCcsl.g:10869:3: (enumLiteral_4= 'MODULUS' )
                    {
                    // InternalCcsl.g:10869:3: (enumLiteral_4= 'MODULUS' )
                    // InternalCcsl.g:10870:4: enumLiteral_4= 'MODULUS'
                    {
                    enumLiteral_4=(Token)match(input,145,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getMODULUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getArithmeticOperatorAccess().getMODULUSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCcsl.g:10877:3: (enumLiteral_5= 'UNDEFINED' )
                    {
                    // InternalCcsl.g:10877:3: (enumLiteral_5= 'UNDEFINED' )
                    // InternalCcsl.g:10878:4: enumLiteral_5= 'UNDEFINED'
                    {
                    enumLiteral_5=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getUNDEFINEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getArithmeticOperatorAccess().getUNDEFINEDEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleArithmeticOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xC916A54600000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000180020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004006000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080800002000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400800002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001080800002000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001080800000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0060000800002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0060000800000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000800000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00000000B0020000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00000000A0020000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000020020000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000020020000L,0x0000000000000180L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000180L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x000000017BAD4200L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000100L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000400L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00080000B0020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x00080000A0020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0008000020020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000020020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000030020000L,0x0000000000008000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000020020000L,0x0000000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000030020000L,0x0000000000028000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000020020000L,0x0000000000028000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000020000L,0x0000000000008000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000030020000L,0x0000000000128000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000020020000L,0x0000000000128000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000020020000L,0x0000000000108000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000020000L,0x0000000000108000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000020000L,0x0000000000100000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000030020000L,0x0000000000400000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000020020000L,0x0000000000400000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000020000L,0x0000000000400000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000030020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000020020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000030020000L,0x0000000004000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000020020000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000020000L,0x0000000004000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0008000030020000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0008000020020000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000030020000L,0x0000000084000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000020020000L,0x0000000084000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000020020000L,0x0000000080000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000020000L,0x0000000080000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000030020000L,0x0000000600000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000020020000L,0x0000000600000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000020000L,0x0000000600000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0008000000020000L,0x0000002000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x00000200B0020000L,0x0000018000000080L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x00000200A0020000L,0x0000018000000080L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000020020020000L,0x0000018000000080L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000020020020000L,0x0000010000000080L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000020000020000L,0x0000010000000080L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000020000020000L,0x0000010000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0008000000020000L,0x0000040000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x00080000B0020000L,0x0000040000000800L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x00080000A0020000L,0x0000040000000800L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0008000020020000L,0x0000040000000800L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x00000000B0020000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x00000000A0020000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x00000000B0020000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x00000000A0020000L,0x0020000000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000020020000L,0x0020000000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000020000L,0x0020000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000030020000L,0x0080000000000080L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000020020000L,0x0080000000000080L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000030020000L,0x0200000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000020020000L,0x0200000000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000020000L,0x0200000000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000030020000L,0x2200000000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000020020000L,0x2200000000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000020000L,0x2200000000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000020000L,0x2000000000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000030020000L,0x8200000000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000020020000L,0x8200000000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001FECL});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000030020000L,0x0200000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000020020000L,0x0200000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000003F000L});

}