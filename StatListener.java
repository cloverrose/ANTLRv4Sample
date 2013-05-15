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
    public void enterStat(SampleParser.StatContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String name = ctx.name().getText();
        String expr = ctx.expr().getText();
        System.out.println("prog: " + name + " = " + expr + ";");
    }
}
