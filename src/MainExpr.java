import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainExpr {
    public static void main(String[] args) throws Exception {
        String input = "1+2*3";


        CharStream cs = CharStreams.fromString(input);


        ExprLexer lexer = new ExprLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);


        ParseTree tree = parser.expr();


        System.out.println(tree.toStringTree(parser));
    }
}

