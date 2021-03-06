/* This file was generated by SableCC (http://www.sablecc.org/). */

package wig.analysis;

import java.util.*;
import wig.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAService(AService node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAHtml(AHtml node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATagStartHtmlbody(ATagStartHtmlbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATagEndHtmlbody(ATagEndHtmlbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAHoleHtmlbody(AHoleHtmlbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhateverHtmlbody(AWhateverHtmlbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMetaHtmlbody(AMetaHtmlbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInputHtmlbody(AInputHtmlbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASelectHtmlbody(ASelectHtmlbody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANameInputattr(ANameInputattr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATypeInputattr(ATypeInputattr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAttributeInputattr(AAttributeInputattr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATexttypeInputtype(ATexttypeInputtype node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARadiotypeInputtype(ARadiotypeInputtype node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStrtypeInputtype(AStrtypeInputtype node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAttrAttribute(AAttrAttribute node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignAttribute(AAssignAttribute node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAttr(AIdAttr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStrAttr(AStrAttr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIconstAttr(AIconstAttr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegintIntconst(ANegintIntconst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPosintIntconst(APosintIntconst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASchema(ASchema node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAField(AField node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariable(AVariable node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentifiers(AIdentifiers node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolType(ABoolType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringType(AStringType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVoidType(AVoidType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleType(ASimpleType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATupleType(ATupleType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunction(AFunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArguments(AArguments node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArgument(AArgument node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASession(ASession node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyStm(AEmptyStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAShowStm(AShowStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExitStm(AExitStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnStm(AReturnStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnexpStm(AReturnexpStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfStm(AIfStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfelseStm(AIfelseStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileStm(AWhileStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompStm(ACompStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpStm(AExpStm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdDocument(AIdDocument node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlugDocument(APlugDocument node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReceive(AReceive node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompoundstm(ACompoundstm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlugs(APlugs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlug(APlug node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInputs(AInputs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInput(AInput node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignExp(AAssignExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrExp(AOrExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndExp(AAndExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqExp(AEqExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANeqExp(ANeqExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALtExp(ALtExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGtExp(AGtExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALteqExp(ALteqExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGteqExp(AGteqExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusExp(APlusExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusExp(AMinusExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModExp(AModExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAJoinExp(AJoinExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAKeepExp(AKeepExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARemoveExp(ARemoveExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAKeepManyExp(AKeepManyExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARemoveManyExp(ARemoveManyExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotExp(ANotExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegExp(ANegExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefaultExp(ADefaultExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALvalueExp(ALvalueExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACallExp(ACallExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntExp(AIntExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATrueExp(ATrueExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFalseExp(AFalseExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringExp(AStringExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATupleExp(ATupleExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenExp(AParenExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExps(AExps node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleLvalue(ASimpleLvalue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAQualifiedLvalue(AQualifiedLvalue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFieldvalues(AFieldvalues node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFieldvalue(AFieldvalue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTService(TService node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHtml(THtml node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHtmlTagStart(THtmlTagStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSchema(TSchema node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSession(TSession node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTShow(TShow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTExit(TExit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlug(TPlug node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReceive(TReceive node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBool(TBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVoid(TVoid node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTuple(TTuple node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeta(TMeta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHtmlTagEnd(THtmlTagEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInput(TInput node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPosIntconst(TPosIntconst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNegIntconst(TNegIntconst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSelect(TSelect node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTType(TType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTName(TName node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTText(TText node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRadio(TRadio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBrace(TLBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBrace(TRBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLt(TLt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGt(TGt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLtSlash(TLtSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLtBracket(TLtBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGtBracket(TGtBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBracket(TLBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBracket(TRBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTKeep(TKeep node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRemove(TRemove node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTJoin(TJoin node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNeq(TNeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLteq(TLteq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGteq(TGteq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEol(TEol node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringconst(TStringconst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhatever(TWhatever node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
