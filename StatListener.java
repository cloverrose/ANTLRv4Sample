import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.*;


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
}
