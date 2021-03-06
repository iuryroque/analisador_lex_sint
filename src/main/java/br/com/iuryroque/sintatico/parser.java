
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Tue Jun 01 14:13:42 BRT 2021
//----------------------------------------------------

package br.com.iuryroque.sintatico;

import java_cup.runtime.*;
import java.util.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Tue Jun 01 14:13:42 BRT 2021
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\003\006\000\002\004" +
    "\004\000\002\004\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\013\011\000\002\012\005\000" +
    "\002\012\003\000\002\012\002\000\002\006\004\000\002" +
    "\006\003\000\002\014\007\000\002\016\004\000\002\016" +
    "\003\000\002\017\006\000\002\015\003\000\002\015\003" +
    "\000\002\010\007\000\002\011\005\000\002\011\003\000" +
    "\002\011\002\000\002\020\003\000\002\020\003\000\002" +
    "\007\005\000\002\021\003\000\002\021\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\004\005\001\002\000\004\002\066\001" +
    "\002\000\004\005\006\001\002\000\010\007\016\013\015" +
    "\021\014\001\002\000\012\006\ufffb\007\ufffb\013\ufffb\021" +
    "\ufffb\001\002\000\012\006\065\007\016\013\015\021\014" +
    "\001\002\000\012\006\ufffd\007\ufffd\013\ufffd\021\ufffd\001" +
    "\002\000\012\006\ufffe\007\ufffe\013\ufffe\021\ufffe\001\002" +
    "\000\012\006\ufffc\007\ufffc\013\ufffc\021\ufffc\001\002\000" +
    "\004\015\034\001\002\000\004\015\023\001\002\000\006" +
    "\011\021\012\020\001\002\000\004\010\022\001\002\000" +
    "\004\010\uffe6\001\002\000\004\010\uffe7\001\002\000\012" +
    "\006\uffe8\007\uffe8\013\uffe8\021\uffe8\001\002\000\012\014" +
    "\uffeb\016\024\017\025\020\uffeb\001\002\000\006\014\uffea" +
    "\020\uffea\001\002\000\006\014\uffe9\020\uffe9\001\002\000" +
    "\006\014\uffec\020\uffec\001\002\000\006\014\031\020\030" +
    "\001\002\000\006\016\024\017\025\001\002\000\004\010" +
    "\032\001\002\000\012\006\uffee\007\uffee\013\uffee\021\uffee" +
    "\001\002\000\006\014\uffed\020\uffed\001\002\000\010\014" +
    "\ufff7\020\ufff7\022\036\001\002\000\006\014\040\020\037" +
    "\001\002\000\006\014\ufff8\020\ufff8\001\002\000\004\022" +
    "\063\001\002\000\004\023\041\001\002\000\004\027\044" +
    "\001\002\000\006\024\062\027\044\001\002\000\006\024" +
    "\ufff5\027\ufff5\001\002\000\006\025\046\026\045\001\002" +
    "\000\004\023\uffef\001\002\000\004\023\ufff0\001\002\000" +
    "\004\023\050\001\002\000\004\030\051\001\002\000\004" +
    "\031\056\001\002\000\006\024\054\030\051\001\002\000" +
    "\006\024\ufff2\030\ufff2\001\002\000\006\024\ufff4\027\ufff4" +
    "\001\002\000\006\024\ufff3\030\ufff3\001\002\000\004\022" +
    "\057\001\002\000\004\010\060\001\002\000\006\024\ufff1" +
    "\030\ufff1\001\002\000\006\024\ufff6\027\ufff6\001\002\000" +
    "\012\006\ufffa\007\ufffa\013\ufffa\021\ufffa\001\002\000\006" +
    "\014\ufff9\020\ufff9\001\002\000\012\006\uffff\007\uffff\013" +
    "\uffff\021\uffff\001\002\000\004\002\000\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\004\007\005\011\007\010\010\012" +
    "\013\006\001\001\000\002\001\001\000\012\005\063\007" +
    "\010\010\012\013\006\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\021\016\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\011" +
    "\026\020\025\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\020\032\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\034\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\006\041" +
    "\014\042\001\001\000\004\014\060\001\001\000\002\001" +
    "\001\000\004\015\046\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\016\051\017\052\001" +
    "\001\000\002\001\001\000\004\017\054\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



public void report_error(String message, Object info) {
System.out.println("Warning - " + message);
}
public void report_fatal_error(String message, Object info) {
System.out.println("Error - " + message);
System.exit(-1);
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // data_types ::= STRING_TYPE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(15/*data_types*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // data_types ::= INTEGER_TYPE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(15/*data_types*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // decl_variable ::= VARIABLE data_types COLON 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*decl_variable*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // params_type ::= STRING 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*params_type*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // params_type ::= INTEGER 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*params_type*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // decl_call_params ::= 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*decl_call_params*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // decl_call_params ::= params_type 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*decl_call_params*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // decl_call_params ::= decl_call_params SEMICOLON params_type 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*decl_call_params*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // decl_call_function ::= CALL_FUNCTION LEFT_PARAMETER decl_call_params RIGHT_PARAMETER COLON 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*decl_call_function*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // decl_boolean ::= FF 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(11/*decl_boolean*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // decl_boolean ::= TT 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(11/*decl_boolean*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // decl_assignment ::= ASSIGNMENT SYMBOL_ASSIGNMENT FUNCTION_PARAMS COLON 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*decl_assignment*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // decl_assignments ::= decl_assignment 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(12/*decl_assignments*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // decl_assignments ::= decl_assignments decl_assignment 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(12/*decl_assignments*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // decl_if ::= IF decl_boolean LEFT_BRACKETS decl_assignments RIGHT_BRACKETS 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*decl_if*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // statement_function ::= decl_if 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*statement_function*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // statement_function ::= statement_function decl_if 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*statement_function*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // decl_params ::= 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*decl_params*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // decl_params ::= FUNCTION_PARAMS 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*decl_params*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // decl_params ::= decl_params SEMICOLON FUNCTION_PARAMS 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*decl_params*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // decl_function ::= FUNCTION LEFT_PARAMETER decl_params RIGHT_PARAMETER LEFT_BRACKETS statement_function RIGHT_BRACKETS 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*decl_function*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // statement ::= decl_function 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*statement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement ::= decl_call_function 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*statement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement ::= decl_variable 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*statement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statements ::= statement 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*statements*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statements ::= statements statement 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*statements*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= PROGRAM BEGIN statements END 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*program*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

