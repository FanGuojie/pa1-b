/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: E:\pa1\pa1-b\src\decaf\frontend\Parser.spec
 * Options: unstrict mode
 * Generated at: Tue Oct 30 19:28:33 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;
import javafx.util.Pair;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 14
    public static final int BOOL = 258; //# line 14
    public static final int INT = 259; //# line 14
    public static final int STRING = 260; //# line 14
    public static final int CLASS = 261; //# line 14
    public static final int NULL = 262; //# line 15
    public static final int EXTENDS = 263; //# line 15
    public static final int THIS = 264; //# line 15
    public static final int WHILE = 265; //# line 15
    public static final int FOR = 266; //# line 15
    public static final int IF = 267; //# line 16
    public static final int ELSE = 268; //# line 16
    public static final int RETURN = 269; //# line 16
    public static final int BREAK = 270; //# line 16
    public static final int NEW = 271; //# line 16
    public static final int PRINT = 272; //# line 17
    public static final int READ_INTEGER = 273; //# line 17
    public static final int READ_LINE = 274; //# line 17
    public static final int LITERAL = 275; //# line 18
    public static final int IDENTIFIER = 276; //# line 19
    public static final int AND = 277; //# line 19
    public static final int OR = 278; //# line 19
    public static final int STATIC = 279; //# line 19
    public static final int INSTANCEOF = 280; //# line 19
    public static final int LESS_EQUAL = 281; //# line 20
    public static final int GREATER_EQUAL = 282; //# line 20
    public static final int EQUAL = 283; //# line 20
    public static final int NOT_EQUAL = 284; //# line 20
    public static final int COMPLEX = 285; //# line 24
    public static final int IMG = 286; //# line 24
    public static final int PRINT_COMP = 287; //# line 24
    public static final int SUPER = 288; //# line 25
    public static final int DCOPY = 289; //# line 25
    public static final int SCOPY = 290; //# line 25
    public static final int DO = 291; //# line 25
    public static final int OD = 292; //# line 25
    public static final int DO_DIVIDER = 293; //# line 25
    public static final int CASE = 294; //# line 25
    public static final int DEFAULT = 295; //# line 25
    
    public static final int VariableDef = 296;
    public static final int ExprT5 = 297;
    public static final int Oper3 = 298;
    public static final int Oper6 = 299;
    public static final int CaseList = 300;
    public static final int VariableList = 301;
    public static final int Formals = 302;
    public static final int Oper7 = 303;
    public static final int Expr8 = 304;
    public static final int AfterSimpleTypeExpr = 305;
    public static final int Expr2 = 306;
    public static final int Oper2 = 307;
    public static final int Expr6 = 308;
    public static final int DefaultItem = 309;
    public static final int BreakStmt = 310;
    public static final int ExprT2 = 311;
    public static final int PrintCompStmt = 312;
    public static final int StmtList = 313;
    public static final int Constant = 314;
    public static final int SubVariableList = 315;
    public static final int PrintStmt = 316;
    public static final int ForStmt = 317;
    public static final int DoBranch = 318;
    public static final int Expr9 = 319;
    public static final int Expr1 = 320;
    public static final int Oper1 = 321;
    public static final int ElseClause = 322;
    public static final int FieldList = 323;
    public static final int SubExprList = 324;
    public static final int AfterParenExpr = 325;
    public static final int ClassDef = 326;
    public static final int ReturnStmt = 327;
    public static final int ExprList = 328;
    public static final int StmtBlock = 329;
    public static final int FunctionField = 330;
    public static final int AfterIdentExpr = 331;
    public static final int Program = 332;
    public static final int Expr = 333;
    public static final int CaseExpr = 334;
    public static final int Type = 335;
    public static final int Expr5 = 336;
    public static final int AfterNewExpr = 337;
    public static final int Assignment = 338;
    public static final int ExtendsClause = 339;
    public static final int DOStmt = 340;
    public static final int Oper5 = 341;
    public static final int ArrayType = 342;
    public static final int Expr3 = 343;
    public static final int Actuals = 344;
    public static final int Variable = 345;
    public static final int ExprT3 = 346;
    public static final int Stmt = 347;
    public static final int SimpleStmt = 348;
    public static final int SimpleType = 349;
    public static final int WhileStmt = 350;
    public static final int ExprT1 = 351;
    public static final int Expr4 = 352;
    public static final int ExprT4 = 353;
    public static final int ReturnExpr = 354;
    public static final int IfStmt = 355;
    public static final int ExprT6 = 356;
    public static final int DoBranchList = 357;
    public static final int ExprT8 = 358;
    public static final int CaseItem = 359;
    public static final int Expr7 = 360;
    public static final int ClassList = 361;
    public static final int Oper4 = 362;
    public static final int DoBranchList1 = 363;
    public static final int Field = 364;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 296;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "COMPLEX", "IMG",
        "PRINT_COMP", "SUPER", "DCOPY", "SCOPY", "DO",
        "OD", "DO_DIVIDER", "CASE", "DEFAULT", "VariableDef",
        "ExprT5", "Oper3", "Oper6", "CaseList", "VariableList",
        "Formals", "Oper7", "Expr8", "AfterSimpleTypeExpr", "Expr2",
        "Oper2", "Expr6", "DefaultItem", "BreakStmt", "ExprT2",
        "PrintCompStmt", "StmtList", "Constant", "SubVariableList", "PrintStmt",
        "ForStmt", "DoBranch", "Expr9", "Expr1", "Oper1",
        "ElseClause", "FieldList", "SubExprList", "AfterParenExpr", "ClassDef",
        "ReturnStmt", "ExprList", "StmtBlock", "FunctionField", "AfterIdentExpr",
        "Program", "Expr", "CaseExpr", "Type", "Expr5",
        "AfterNewExpr", "Assignment", "ExtendsClause", "DOStmt", "Oper5",
        "ArrayType", "Expr3", "Actuals", "Variable", "ExprT3",
        "Stmt", "SimpleStmt", "SimpleType", "WhileStmt", "ExprT1",
        "Expr4", "ExprT4", "ReturnExpr", "IfStmt", "ExprT6",
        "DoBranchList", "ExprT8", "CaseItem", "Expr7", "ClassList",
        "Oper4", "DoBranchList1", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {COMPLEX, VOID, CLASS, INT, STRING, IMG, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {LITERAL, NULL, DEFAULT},
        {COMPLEX, VOID, CLASS, INT, STRING, IMG, BOOL},
        {COMPLEX, VOID, CLASS, INT, STRING, IMG, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!'), Integer.valueOf('@'), Integer.valueOf('$'), Integer.valueOf('#')},
        {READ_LINE, NULL, SCOPY, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf(']'), CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {AND},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {DEFAULT},
        {BREAK},
        {AND, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {PRINT_COMP},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, PRINT_COMP, SCOPY, Integer.valueOf('@'), DO, IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, IMG, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {FOR},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {LITERAL, NULL, READ_INTEGER, READ_LINE, THIS, SUPER, DCOPY, SCOPY, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {OR},
        {ELSE, PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, PRINT_COMP, SCOPY, Integer.valueOf('}'), DO_DIVIDER, Integer.valueOf('@'), DO, IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), OD, DCOPY, IMG, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {COMPLEX, VOID, CLASS, INT, STRING, STATIC, IMG, BOOL, Integer.valueOf('}')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, CLASS},
        {CLASS},
        {RETURN},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, CASE},
        {CASE},
        {COMPLEX, VOID, CLASS, INT, STRING, IMG, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {IDENTIFIER, COMPLEX, VOID, CLASS, INT, STRING, IMG, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {DO},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, Integer.valueOf(')')},
        {COMPLEX, VOID, CLASS, INT, STRING, IMG, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {COMPLEX, VOID, CLASS, INT, STRING, IMG, BOOL, CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, PRINT_COMP, DO, BREAK, Integer.valueOf('{')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, BOOL, STRING, COMPLEX, IMG, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER, Integer.valueOf(';')},
        {IF},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {LITERAL, NULL},
        {Integer.valueOf('!'), Integer.valueOf('-'), Integer.valueOf('@'), Integer.valueOf('$'), Integer.valueOf('#'), READ_LINE, NULL, SCOPY, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), DCOPY, SUPER, READ_INTEGER},
        {CLASS, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {DO_DIVIDER, OD},
        {STATIC, COMPLEX, VOID, CLASS, INT, STRING, IMG, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 296);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, PRINT_COMP, SCOPY, Integer.valueOf('}'), DO_DIVIDER, Integer.valueOf('@'), DO, IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), OD, DCOPY, IMG, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {DEFAULT},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {READ_LINE, NULL, SCOPY, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), DCOPY, SUPER, READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('}')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, PRINT_COMP, SCOPY, Integer.valueOf('}'), DO_DIVIDER, Integer.valueOf('@'), DO, IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), OD, DCOPY, IMG, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {DO_DIVIDER, OD},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, PRINT_COMP, SCOPY, Integer.valueOf('}'), DO_DIVIDER, Integer.valueOf('@'), DO, IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), OD, DCOPY, IMG, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, PRINT_COMP, SCOPY, Integer.valueOf('}'), DO_DIVIDER, Integer.valueOf('@'), DO, IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), OD, DCOPY, IMG, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {COMPLEX, VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, IMG, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, PRINT_COMP, SCOPY, Integer.valueOf('}'), DO_DIVIDER, Integer.valueOf('@'), DO, IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), OD, DCOPY, IMG, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, PRINT_COMP, SCOPY, Integer.valueOf('}'), DO_DIVIDER, Integer.valueOf('@'), DO, IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), OD, DCOPY, IMG, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, PRINT_COMP, SCOPY, Integer.valueOf('}'), DO_DIVIDER, Integer.valueOf('@'), DO, IDENTIFIER, NEW, Integer.valueOf('$'), IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('#'), OD, DCOPY, IMG, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {OD},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {LITERAL, NULL, DEFAULT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, SCOPY, Integer.valueOf('@'), IDENTIFIER, NEW, Integer.valueOf('$'), THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('#'), DCOPY, SUPER, READ_INTEGER},
        {OD},
        {COMPLEX, VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, IMG, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 296);
    }
    
    public Table() {
        for (int i = 0; i < 69; i++) {
            begin.add(new HashSet(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Pair<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 51
            case VariableDef: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case IMG:
                    case BOOL:
                        return new Pair<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 555
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new Pair<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 326
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new Pair<>(3, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new Pair<>(4, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 372
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new Pair<>(5, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new Pair<>(6, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new Pair<>(7, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 855
            case CaseList: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(8, Arrays.asList(CaseItem, CaseList));
                    case DEFAULT:
                        return new Pair<>(9, Arrays.asList());
                    default: return null;
                }
            }
            //# line 175
            case VariableList: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case IMG:
                    case BOOL:
                        return new Pair<>(10, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 165
            case Formals: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case IMG:
                    case BOOL:
                        return new Pair<>(11, Arrays.asList(VariableList));
                    case ')':
                        return new Pair<>(12, Arrays.asList());
                    default: return null;
                }
            }
            //# line 389
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new Pair<>(13, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new Pair<>(14, Arrays.asList(Integer.valueOf('!')));
                    case '@':
                        return new Pair<>(15, Arrays.asList(Integer.valueOf('@')));
                    case '$':
                        return new Pair<>(16, Arrays.asList(Integer.valueOf('$')));
                    case '#':
                        return new Pair<>(17, Arrays.asList(Integer.valueOf('#')));
                    default: return null;
                }
            }
            //# line 611
            case Expr8: {
                switch (lookahead) {
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(18, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 731
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new Pair<>(19, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(20, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 456
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(21, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 319
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(22, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 572
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(23, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 873
            case DefaultItem: {
                switch (lookahead) {
                    case DEFAULT:
                        return new Pair<>(24, Arrays.asList(DEFAULT, Integer.valueOf(':'), Expr, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 808
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new Pair<>(25, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 468
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(26, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case ';':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 845
            case PrintCompStmt: {
                switch (lookahead) {
                    case PRINT_COMP:
                        return new Pair<>(28, Arrays.asList(PRINT_COMP, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 202
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case CASE:
                    case COMPLEX:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case PRINT_COMP:
                    case SCOPY:
                    case '@':
                    case DO:
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case IF:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '#':
                    case DCOPY:
                    case IMG:
                    case BOOL:
                    case SUPER:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new Pair<>(29, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 755
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new Pair<>(31, Arrays.asList(LITERAL));
                    case NULL:
                        return new Pair<>(32, Arrays.asList(NULL));
                    default: return null;
                }
            }
            //# line 185
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(33, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 840
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new Pair<>(35, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 802
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new Pair<>(36, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 286
            case DoBranch: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(37, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 663
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(38, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new Pair<>(39, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new Pair<>(40, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new Pair<>(41, Arrays.asList(THIS));
                    case SUPER:
                        return new Pair<>(42, Arrays.asList(SUPER));
                    case DCOPY:
                        return new Pair<>(43, Arrays.asList(DCOPY, Integer.valueOf('('), Expr, Integer.valueOf(')')));
                    case SCOPY:
                        return new Pair<>(44, Arrays.asList(SCOPY, Integer.valueOf('('), Expr, Integer.valueOf(')')));
                    case NEW:
                        return new Pair<>(45, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new Pair<>(46, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new Pair<>(47, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new Pair<>(48, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    default: return null;
                }
            }
            //# line 427
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(49, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 312
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(50, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 820
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new Pair<>(51, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case CASE:
                    case COMPLEX:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case PRINT_COMP:
                    case SCOPY:
                    case '}':
                    case DO_DIVIDER:
                    case '@':
                    case DO:
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case IF:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '#':
                    case OD:
                    case DCOPY:
                    case IMG:
                    case BOOL:
                    case SUPER:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 125
            case FieldList: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case IMG:
                    case BOOL:
                        return new Pair<>(53, Arrays.asList(Field, FieldList));
                    case '}':
                        return new Pair<>(54, Arrays.asList());
                    default: return null;
                }
            }
            //# line 783
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(55, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new Pair<>(56, Arrays.asList());
                    default: return null;
                }
            }
            //# line 743
            case AfterParenExpr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(57, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new Pair<>(58, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 112
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(59, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 827
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new Pair<>(60, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 775
            case ExprList: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(61, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 196
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new Pair<>(62, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 157
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(63, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new Pair<>(129, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 656
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(65, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 29
            case Program: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(67, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 417
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(68, Arrays.asList(Expr1));
                    case CASE:
                        return new Pair<>(69, Arrays.asList(CaseExpr));
                    default: return null;
                }
            }
            //# line 850
            case CaseExpr: {
                switch (lookahead) {
                    case CASE:
                        return new Pair<>(70, Arrays.asList(CASE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Integer.valueOf('{'), CaseList, DefaultItem, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 93
            case Type: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case IMG:
                    case BOOL:
                        return new Pair<>(71, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 543
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(72, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 717
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new Pair<>(73, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case IMG:
                    case BOOL:
                        return new Pair<>(74, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 303
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new Pair<>(75, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 118
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new Pair<>(77, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 260
            case DOStmt: {
                switch (lookahead) {
                    case DO:
                        return new Pair<>(79, Arrays.asList(DO, DoBranchList, OD));
                    default: return null;
                }
            }
            //# line 360
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new Pair<>(80, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new Pair<>(81, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 102
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(82, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new Pair<>(83, Arrays.asList());
                    default: return null;
                }
            }
            //# line 485
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(84, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 765
            case Actuals: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(85, Arrays.asList(ExprList));
                    case ')':
                        return new Pair<>(86, Arrays.asList());
                    default: return null;
                }
            }
            //# line 57
            case Variable: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case IMG:
                    case BOOL:
                        return new Pair<>(87, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 497
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new Pair<>(88, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 210
            case Stmt: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case IMG:
                    case BOOL:
                        return new Pair<>(90, Arrays.asList(VariableDef));
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(91, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new Pair<>(92, Arrays.asList(IfStmt));
                    case WHILE:
                        return new Pair<>(93, Arrays.asList(WhileStmt));
                    case FOR:
                        return new Pair<>(94, Arrays.asList(ForStmt));
                    case RETURN:
                        return new Pair<>(95, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new Pair<>(96, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case PRINT_COMP:
                        return new Pair<>(97, Arrays.asList(PrintCompStmt, Integer.valueOf(';')));
                    case DO:
                        return new Pair<>(98, Arrays.asList(DOStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new Pair<>(99, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new Pair<>(100, Arrays.asList(StmtBlock));
                    default: return null;
                }
            }
            //# line 292
            case SimpleStmt: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(101, Arrays.asList(Expr, Assignment));
                    case ';':
                    case ')':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 63
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new Pair<>(103, Arrays.asList(INT));
                    case VOID:
                        return new Pair<>(104, Arrays.asList(VOID));
                    case BOOL:
                        return new Pair<>(105, Arrays.asList(BOOL));
                    case STRING:
                        return new Pair<>(106, Arrays.asList(STRING));
                    case COMPLEX:
                        return new Pair<>(107, Arrays.asList(COMPLEX));
                    case IMG:
                        return new Pair<>(108, Arrays.asList(IMG));
                    case CLASS:
                        return new Pair<>(109, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 796
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new Pair<>(110, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 439
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(111, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case ';':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 514
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(113, Arrays.asList(Expr5, ExprT4));
                    default: return null;
                }
            }
            //# line 526
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new Pair<>(114, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 833
            case ReturnExpr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(116, Arrays.asList(Expr));
                    case ';':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 814
            case IfStmt: {
                switch (lookahead) {
                    case IF:
                        return new Pair<>(118, Arrays.asList(IF, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 584
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new Pair<>(119, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 267
            case DoBranchList: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case '@':
                    case IDENTIFIER:
                    case NEW:
                    case '$':
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '#':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(121, Arrays.asList(DoBranch, DoBranchList1));
                    default: return null;
                }
            }
            //# line 631
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(122, Arrays.asList(Integer.valueOf('['), Expr, Integer.valueOf(']'), ExprT8));
                    case '.':
                        return new Pair<>(123, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 867
            case CaseItem: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(125, Arrays.asList(Constant, Integer.valueOf(':'), Expr, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 601
            case Expr7: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case '@':
                    case '$':
                    case '#':
                        return new Pair<>(126, Arrays.asList(Oper7, Expr8));
                    case READ_LINE:
                    case NULL:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case DCOPY:
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(127, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 40
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(128, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new Pair<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 338
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new Pair<>(130, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new Pair<>(131, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new Pair<>(132, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new Pair<>(133, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 274
            case DoBranchList1: {
                switch (lookahead) {
                    case DO_DIVIDER:
                        return new Pair<>(134, Arrays.asList(DO_DIVIDER, DoBranch, DoBranchList1));
                    case OD:
                        return new Pair<>(135, Arrays.asList());
                    default: return null;
                }
            }
            //# line 141
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new Pair<>(136, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case IMG:
                    case BOOL:
                        return new Pair<>(137, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 52
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 556
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 2: {
                /* no action */
                return;
            }
            case 3: {
                //# line 327
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 4: {
                //# line 332
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 5: {
                //# line 373
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 6: {
                //# line 378
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 383
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 856
                params[0].elist = params[2].elist;
                params[0].elist.add(0, params[1].expr);
                return;
            }
            case 9: {
                //# line 861
                params[0] = new SemValue();
                params[0].elist = new ArrayList<Tree.Expr> ();
                return;
            }
            case 10: {
                //# line 176
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 11: {
                //# line 166
                params[0].vlist = params[1].vlist;
                return;
            }
            case 12: {
                //# line 170
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 13: {
                //# line 390
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 14: {
                //# line 395
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 15: {
                //# line 400
                params[0].counter = Tree.RE;
                params[0].loc = params[1].loc;
                return;
            }
            case 16: {
                //# line 405
                params[0].counter = Tree.IM;
                params[0].loc = params[1].loc;
                return;
            }
            case 17: {
                //# line 410
                params[0].counter = Tree.COMPCAST;
                params[0].loc = params[1].loc;
                return;
            }
            case 18: {
                //# line 612
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 19: {
                //# line 732
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 20: {
                //# line 737
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 21: {
                //# line 457
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 22: {
                //# line 320
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 23: {
                //# line 573
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 24: {
                //# line 874
                params[0].expr = new Tree.CaseItem(params[3].expr, params[1].loc);
                return;
            }
            case 25: {
                //# line 809
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 26: {
                //# line 469
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 27: {
                /* no action */
                return;
            }
            case 28: {
                //# line 846
                params[0].stmt = new Tree.PrintComp(params[3].elist, params[1].loc);
                return;
            }
            case 29: {
                //# line 203
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 30: {
                /* no action */
                return;
            }
            case 31: {
                //# line 756
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 32: {
                //# line 760
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 33: {
                //# line 186
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 34: {
                /* no action */
                return;
            }
            case 35: {
                //# line 841
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 36: {
                //# line 803
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 37: {
                //# line 287
                params[0].expr = new Tree.DoBranch(params[1].expr, params[3].stmt, params[1].loc);
                return;
            }
            case 38: {
                //# line 664
                params[0].expr = params[1].expr;
                return;
            }
            case 39: {
                //# line 668
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 40: {
                //# line 672
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 41: {
                //# line 676
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 42: {
                //# line 680
                params[0].expr = new Tree.SuperExpr(params[1].loc);
                return;
            }
            case 43: {
                //# line 684
                params[0].expr = new Tree.Unary(Tree.DC, params[3].expr, params[1].loc);
                return;
            }
            case 44: {
                //# line 688
                params[0].expr = new Tree.Unary(Tree.SC, params[3].expr, params[1].loc);
                return;
            }
            case 45: {
                //# line 692
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 46: {
                //# line 700
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 47: {
                //# line 704
                params[0].expr = params[2].expr;
                return;
            }
            case 48: {
                //# line 708
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 49: {
                //# line 428
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 50: {
                //# line 313
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 51: {
                //# line 821
                params[0].stmt = params[2].stmt;
                return;
            }
            case 52: {
                /* no action */
                return;
            }
            case 53: {
                //# line 126
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 54: {
                //# line 136
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 55: {
                //# line 784
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 56: {
                //# line 790
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 57: {
                //# line 744
                params[0].expr = params[1].expr;
                return;
            }
            case 58: {
                //# line 748
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 59: {
                //# line 113
                params[0].cdef = new Tree.ClassDef(params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 60: {
                //# line 828
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 61: {
                //# line 776
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 62: {
                //# line 197
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 63: {
                //# line 158
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 64: {
                /* no action */
                return;
            }
            case 65: {
                //# line 657
                params[0].elist = params[2].elist;
                return;
            }
            case 66: {
                /* no action */
                return;
            }
            case 67: {
                //# line 30
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 68: {
                //# line 418
                params[0].expr = params[1].expr;
                return;
            }
            case 69: {
                //# line 422
                params[0].expr = params[1].expr;
                return;
            }
            case 70: {
                //# line 851
                params[0].expr = new Tree.CaseExpr(params[3].expr, params[6].elist, params[7].expr, params[3].loc);
                return;
            }
            case 71: {
                //# line 94
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 72: {
                //# line 544
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 73: {
                //# line 718
                params[0].ident = params[1].ident;
                return;
            }
            case 74: {
                //# line 722
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 75: {
                //# line 304
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 76: {
                /* no action */
                return;
            }
            case 77: {
                //# line 119
                params[0].ident = params[2].ident;
                return;
            }
            case 78: {
                /* no action */
                return;
            }
            case 79: {
                //# line 261
                params[0].stmt = new Tree.DoStmt(params[2].elist, params[2].loc);
                return;
            }
            case 80: {
                //# line 361
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 81: {
                //# line 366
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 82: {
                //# line 103
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 83: {
                //# line 107
                params[0].counter = 0;
                return;
            }
            case 84: {
                //# line 486
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 85: {
                //# line 766
                params[0].elist = params[1].elist;
                return;
            }
            case 86: {
                //# line 770
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 87: {
                //# line 58
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 88: {
                //# line 498
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 89: {
                /* no action */
                return;
            }
            case 90: {
                //# line 211
                params[0].stmt = params[1].vdef;
                return;
            }
            case 91: {
                //# line 215
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 92: {
                //# line 223
                params[0].stmt = params[1].stmt;
                return;
            }
            case 93: {
                //# line 227
                params[0].stmt = params[1].stmt;
                return;
            }
            case 94: {
                //# line 231
                params[0].stmt = params[1].stmt;
                return;
            }
            case 95: {
                //# line 235
                params[0].stmt = params[1].stmt;
                return;
            }
            case 96: {
                //# line 239
                params[0].stmt = params[1].stmt;
                return;
            }
            case 97: {
                //# line 243
                params[0].stmt = params[1].stmt;
                return;
            }
            case 98: {
                //# line 247
                params[0].stmt = params[1].stmt;
                return;
            }
            case 99: {
                //# line 251
                params[0].stmt = params[1].stmt;
                return;
            }
            case 100: {
                //# line 255
                params[0].stmt = params[1].stmt;
                return;
            }
            case 101: {
                //# line 293
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 102: {
                /* no action */
                return;
            }
            case 103: {
                //# line 64
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 104: {
                //# line 68
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 105: {
                //# line 72
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 106: {
                //# line 76
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 107: {
                //# line 80
                params[0].type = new Tree.TypeIdent(Tree.COMPLEX, params[1].loc);
                return;
            }
            case 108: {
                //# line 84
                params[0].type = new Tree.TypeIdent(Tree.IMG, params[1].loc);
                return;
            }
            case 109: {
                //# line 88
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 110: {
                //# line 797
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 111: {
                //# line 440
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 112: {
                /* no action */
                return;
            }
            case 113: {
                //# line 515
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 114: {
                //# line 527
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 115: {
                /* no action */
                return;
            }
            case 116: {
                //# line 834
                params[0].expr = params[1].expr;
                return;
            }
            case 117: {
                /* no action */
                return;
            }
            case 118: {
                //# line 815
                params[0].stmt = new Tree.If(params[3].expr, params[5].stmt, params[6].stmt, params[1].loc);
                return;
            }
            case 119: {
                //# line 585
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 120: {
                /* no action */
                return;
            }
            case 121: {
                //# line 268
                params[0].elist = params[2].elist;
                params[0].elist.add(0, params[1].expr);
                return;
            }
            case 122: {
                //# line 632
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 123: {
                //# line 642
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 124: {
                /* no action */
                return;
            }
            case 125: {
                //# line 868
                params[0].expr = new Tree.CaseItem(params[1].expr, params[3].expr, params[1].loc);
                return;
            }
            case 126: {
                //# line 602
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 127: {
                //# line 606
                params[0].expr = params[1].expr;
                return;
            }
            case 128: {
                //# line 41
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 129: {
                /* no action */
                return;
            }
            case 130: {
                //# line 339
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 131: {
                //# line 344
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 132: {
                //# line 349
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 133: {
                //# line 354
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 134: {
                //# line 275
                params[0].elist = params[3].elist;
                params[0].elist.add(0, params[2].expr);
                return;
            }
            case 135: {
                //# line 280
                params[0] = new SemValue();
                params[0].elist = new ArrayList<Tree.Expr> ();
                return;
            }
            case 136: {
                //# line 142
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 137: {
                //# line 147
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
