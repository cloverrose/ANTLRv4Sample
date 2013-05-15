import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.*;
import java.util.*;


public class StatListener extends SampleBaseListener {
    private SampleParser parser;
    public StatListener(SampleParser parser){
        this.parser = parser;
    }

    @Override
    public void enterExprAssign(SampleParser.ExprAssignContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String name = ctx.ID().getText();
        String expr = ctx.expr().getText();
        System.out.println("exprAssign   : " + name + " = " + expr + ";");
    }

    @Override
    public void enterFormulaAssign(SampleParser.FormulaAssignContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String name = ctx.ID().getText();
        String formula = ctx.formula().getText();
        System.out.println("formulaAssign: " + name + " = " + formula + ";");
    }

    @Override
    public void enterTupleAssign(SampleParser.TupleAssignContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String name = ctx.ID().getText();
        List<SampleParser.ElementContext> elements = ctx.element();
        String buff = "";
        boolean first = true;
        for(SampleParser.ElementContext element : elements){
            if(first){
                first = false;
            }else{
                buff += ", ";
            }
            buff += element.getText();
        }
        System.out.println("tupleAssign  : " + name + " = (" + buff + ");");
    }
}
