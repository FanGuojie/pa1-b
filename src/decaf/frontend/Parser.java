package decaf.frontend;

import decaf.Driver;
import decaf.error.MsgError;
import decaf.tree.Tree;
import javafx.util.Pair;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parser extends Table {
    /**
     * Lexer.
     */
    private Lexer lexer;

    /**
     * Set lexer.
     *
     * @param lexer the lexer.
     */
    public void setLexer(Lexer lexer) {
        this.lexer = lexer;
    }

    /**
     * Lookahead token (can be eof/eos).
     */
    public int lookahead = eof;

    /**
     * Undefined token (when lexer fails).
     */
    private static final int undefined_token = -2;

    /**
     * Lexer will write this when a token is parsed.
     */
    public SemValue val = new SemValue();

    /**
     * Helper function.
     * Create a `MsgError` with `msg` and append it to driver.
     *
     * @param msg the message string.
     */
    private void issueError(String msg) {
        Driver.getDriver().issueError(new MsgError(lexer.getLocation(), msg));
    }

    /**
     * Error handler.
     */
    private void error() {
        issueError("syntax error");
    }

    /**
     * Lexer caller.
     *
     * @return the token parsed by the lexer. If `undefined_token` is returned, then lexer failed.
     */
    private int lex() {
        int token = undefined_token;
        try {
            token = lexer.yylex();
        } catch (Exception e) {
            issueError("lexer error: " + e.getMessage());
        }
        return token;
    }

    /**
     * Parse function for each non-terminal with error recovery.
     * TODO: add error recovery!
     *
     * @param symbol the non-terminal to be passed.
     * @return the parsed value of `symbol` if parsing succeeded, otherwise `null`.
     */
    private SemValue parse(int symbol, Set<Integer> follow) {
        // printSymbol(symbol);
        // printSymbolSet(beginSet(symbol), 1);
        // printSymbolSet(followSet(symbol), 2);
        // printSymbolSet(follow, 3);
        // printLookahead(lookahead);

        Set<Integer> end = new HashSet<Integer> ();
        end.addAll(follow);
        end.addAll(followSet(symbol));
        // printSymbolSet(end, 4);

        // lookahead不在beginSet里面,出错,跳过
        if (beginSet(symbol).contains(lookahead) == false) {
            error();
            while (beginSet(symbol).contains(lookahead) == false && end.contains(lookahead) == false) {
                lookahead = lex();
            }
            if (beginSet(symbol).contains(lookahead)) {
                // 继续分析
            } else {
                return null;
            }
        }

        Pair<Integer, List<Integer>> result = query(symbol, lookahead); // get production by lookahead symbol
        int actionId = result.getKey(); // get user-defined action
        List<Integer> right = result.getValue(); // right-hand side of production
        // printSymbolList(actionId, right);
        int length = right.size();
        SemValue[] params = new SemValue[length + 1];

        for (int i = 0; i < length; i++) { // parse right-hand side symbols one by one
            int term = right.get(i);
            params[i + 1] = isNonTerminal(term)
                    ? parse(term, end) // for non terminals: recursively parse it
                    : matchToken(term) // for terminals: match token
                    ;
        }

        params[0] = new SemValue(); // initialize return value
        try {
            act(actionId, params); // do user-defined action
        } catch (Exception e) {

        }
        return params[0];
    }

    /**
     * Match if the lookahead token is the same as the expected token.
     *
     * @param expected the expected token.
     * @return same as `parse`.
     */
    private SemValue matchToken(int expected) {
        SemValue self = val;
        if (lookahead != expected) {
            error();
            return null;
        }

        lookahead = lex();
        return self;
    }

    /**
     * Explicit interface of the parser. Call it in `Driver` class!
     *
     * @return the program AST if successfully parsed, otherwise `null`.
     */
    public Tree.TopLevel parseFile() {
        lookahead = lex();
        SemValue r = parse(start, new HashSet<>());
        return r == null ? null : r.prog;
    }

    /**
     * Helper function. (For debugging)
     * Pretty print a symbol set.
     *
     * @param set symbol set.
     */
    private void printSymbolSet(Set<Integer> set, int type) {
        StringBuilder buf = new StringBuilder();
        switch(type) {
            case 1:
                buf.append("beginSet: ");
                break;
            case 2:
                buf.append("followSet: ");
                break;
            case 3:
                buf.append("follow previous: ");
                break;
            case 4:
                buf.append("end: ");
                break;
            default:
                break;

        }
        buf.append("{ ");
        for (Integer i : set) {
            buf.append(name(i));
            buf.append(" ");
        }
        buf.append("}");
        buf.append("\n");
        System.out.print(buf.toString());
    }

    /**
     * Helper function. (For debugging)
     * Pretty print a symbol list.
     *
     * @param list symbol list.
     */
    private void printSymbolList(int id, List<Integer> list) {
        StringBuilder buf = new StringBuilder();
        buf.append(id);
        buf.append(" [ ");
        for (Integer i : list) {
            buf.append(name(i));
            buf.append(" ");
        }
        buf.append("]");
        buf.append("\n\n");
        System.out.print(buf.toString());
    }

    /**
     * Helper function. (For debugging)
     * Pretty print a symbol.
     *
     * @param symbol.
     */
    private void printSymbol(int symbol) {
        StringBuilder buf = new StringBuilder();
        buf.append(" *");
        buf.append(name(symbol));
        buf.append("* ");
        buf.append("\n");
        System.out.print(buf.toString());
    }

    /**
     * Helper function. (For debugging)
     * Pretty print a symbol.
     *
     * @param symbol.
     */
    private void printLookahead(int symbol) {
        StringBuilder buf = new StringBuilder();
        buf.append(" ~");
        buf.append(name(symbol));
        buf.append("~ ");
        buf.append("\n");
        System.out.print(buf.toString());
    }

    /**
     * Diagnose function. (For debugging)
     * Implement this by yourself on demand.
     */
    public void diagnose(int symbol) {
    }

}
