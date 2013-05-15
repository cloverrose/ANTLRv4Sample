import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("** ANTLRv4Sample **");

        CharStream input = new ANTLRFileStream("inputfile.txt");
        SampleLexer lex = new SampleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        SampleParser parser = new SampleParser(tokens);
        ParserRuleContext tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();

        System.out.println("** StatListener **");
        StatListener statListener = new StatListener(parser);
        walker.walk(statListener, tree);

        System.out.println("** ProgListener **");
        ProgListener progListener = new ProgListener(parser);
        walker.walk(progListener, tree);
    }

}
