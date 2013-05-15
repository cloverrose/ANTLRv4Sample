import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.*;
import java.util.*;

public class ProgListener extends SampleBaseListener {
    private SampleParser parser;
    public ProgListener(SampleParser parser){
        this.parser = parser;
    }

    @Override
    public void enterProg(SampleParser.ProgContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        List<SampleParser.StatContext> stats = ctx.stat();
        for(SampleParser.StatContext stat : stats){
            System.out.println("stat: " +  stat.getText());
        }
    }
}
