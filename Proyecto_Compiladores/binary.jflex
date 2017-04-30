package proyecto_compiladores;
import java_cup.runtime.*;
%%
%class Lexer
%cup
%int
%unicode

%{
  private Symbol createToken(int type, Object value){
    return new Symbol(type, yycolumn, yyline, value);
  }

  private Symbol createToken(int type){
    return new Symbol(type, yycolumn, yyline);
  }
%}

%eofval{
  System.out.println("fin del archvio");
  return null;
%eofval}

dot = "."
one = "1"
zero = "0"

%%
<YYINITIAL>{
    {zero} { return createToken(sym.ZERO); }
    {dot} { return createToken(sym.DOT); }
    {one} { return createToken(sym.ONE); }
}
