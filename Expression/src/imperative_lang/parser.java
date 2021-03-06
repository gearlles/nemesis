
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Nov 27 14:42:23 BRT 2013
//----------------------------------------------------

package imperative_lang;

import imperative_lang.syntaxtree.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Nov 27 14:42:23 BRT 2013
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\003\000\002\002" +
    "\003\000\002\002\005\000\002\002\005\000\002\002\005" +
    "\000\002\002\005\000\002\002\005\000\002\003\003\000" +
    "\002\003\006\000\002\003\005\000\002\003\004\000\002" +
    "\004\006\000\002\004\012\000\002\004\007\000\002\004" +
    "\003\000\002\005\006\000\002\007\004\000\002\007\002" +
    "\000\002\011\005\000\002\011\007\000\002\012\003\000" +
    "\002\012\003\000\002\012\006\000\002\012\006\000\002" +
    "\012\004\000\002\010\005\000\002\010\002\000\002\006" +
    "\002\000\002\006\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\105\000\004\015\005\001\002\000\004\002\107\001" +
    "\002\000\024\004\uffef\015\uffef\016\uffef\021\uffef\022\uffef" +
    "\025\013\026\012\027\011\030\uffef\001\002\000\016\004" +
    "\032\015\005\016\uffe5\021\066\022\061\030\034\001\002" +
    "\000\024\004\uffef\015\uffef\016\uffef\021\uffef\022\uffef\025" +
    "\013\026\012\027\011\030\uffef\001\002\000\010\004\026" +
    "\017\020\030\021\001\002\000\004\015\014\001\002\000" +
    "\010\004\uffeb\017\uffeb\030\uffeb\001\002\000\010\004\uffec" +
    "\017\uffec\030\uffec\001\002\000\012\016\uffe6\025\013\026" +
    "\012\027\011\001\002\000\004\016\025\001\002\000\010" +
    "\004\017\017\020\030\021\001\002\000\012\016\uffe6\025" +
    "\013\026\012\027\011\001\002\000\004\032\022\001\002" +
    "\000\010\004\uffe8\017\uffe8\030\uffe8\001\002\000\004\020" +
    "\023\001\002\000\010\004\uffea\017\uffea\030\uffea\001\002" +
    "\000\004\016\uffe7\001\002\000\010\004\uffe9\017\uffe9\030" +
    "\uffe9\001\002\000\006\013\027\014\030\001\002\000\012" +
    "\004\032\011\033\030\034\032\031\001\002\000\024\004" +
    "\uffee\015\uffee\016\uffee\021\uffee\022\uffee\025\uffee\026\uffee" +
    "\027\uffee\030\uffee\001\002\000\026\005\000\006\000\007" +
    "\000\010\000\012\000\013\000\014\000\017\000\020\000" +
    "\031\000\001\002\000\026\005\ufff9\006\ufff9\007\ufff9\010" +
    "\ufff9\012\ufff9\013\ufff9\014\ufff9\017\ufff9\020\ufff9\031\ufff9" +
    "\001\002\000\012\004\032\011\033\030\034\032\031\001" +
    "\002\000\012\004\032\011\033\030\034\032\031\001\002" +
    "\000\026\005\uffff\006\uffff\007\uffff\010\uffff\012\uffff\013" +
    "\uffff\014\uffff\017\050\020\uffff\031\051\001\002\000\014" +
    "\005\042\006\041\007\040\010\037\014\043\001\002\000" +
    "\012\004\032\011\033\030\034\032\031\001\002\000\012" +
    "\004\032\011\033\030\034\032\031\001\002\000\012\004" +
    "\032\011\033\030\034\032\031\001\002\000\012\004\032" +
    "\011\033\030\034\032\031\001\002\000\024\004\uffed\015" +
    "\uffed\016\uffed\021\uffed\022\uffed\025\uffed\026\uffed\027\uffed" +
    "\030\uffed\001\002\000\026\005\ufffe\006\041\007\040\010" +
    "\037\012\ufffe\013\ufffe\014\ufffe\017\ufffe\020\ufffe\031\ufffe" +
    "\001\002\000\026\005\ufffd\006\ufffd\007\040\010\037\012" +
    "\ufffd\013\ufffd\014\ufffd\017\ufffd\020\ufffd\031\ufffd\001\002" +
    "\000\026\005\ufffc\006\ufffc\007\ufffc\010\037\012\ufffc\013" +
    "\ufffc\014\ufffc\017\ufffc\020\ufffc\031\ufffc\001\002\000\026" +
    "\005\ufffb\006\ufffb\007\ufffb\010\ufffb\012\ufffb\013\ufffb\014" +
    "\ufffb\017\ufffb\020\ufffb\031\ufffb\001\002\000\012\004\032" +
    "\011\033\030\034\032\031\001\002\000\004\004\052\001" +
    "\002\000\026\005\ufff7\006\ufff7\007\ufff7\010\ufff7\012\ufff7" +
    "\013\ufff7\014\ufff7\017\ufff7\020\ufff7\031\ufff7\001\002\000" +
    "\014\005\042\006\041\007\040\010\037\020\054\001\002" +
    "\000\026\005\ufff8\006\ufff8\007\ufff8\010\ufff8\012\ufff8\013" +
    "\ufff8\014\ufff8\017\ufff8\020\ufff8\031\ufff8\001\002\000\026" +
    "\005\042\006\041\007\040\010\037\012\ufff6\013\ufff6\014" +
    "\ufff6\017\ufff6\020\ufff6\031\ufff6\001\002\000\014\005\042" +
    "\006\041\007\040\010\037\012\057\001\002\000\026\005" +
    "\ufffa\006\ufffa\007\ufffa\010\ufffa\012\ufffa\013\ufffa\014\ufffa" +
    "\017\ufffa\020\ufffa\031\ufffa\001\002\000\016\004\ufff0\015" +
    "\ufff0\016\ufff0\021\ufff0\022\ufff0\030\ufff0\001\002\000\004" +
    "\011\103\001\002\000\016\004\032\015\005\016\uffe5\021" +
    "\066\022\061\030\034\001\002\000\004\016\101\001\002" +
    "\000\020\004\ufff2\015\ufff2\016\ufff2\021\ufff2\022\ufff2\024" +
    "\ufff2\030\ufff2\001\002\000\010\013\076\017\050\031\051" +
    "\001\002\000\004\011\067\001\002\000\012\004\032\011" +
    "\033\030\034\032\031\001\002\000\014\005\042\006\041" +
    "\007\040\010\037\012\071\001\002\000\004\023\072\001" +
    "\002\000\014\004\032\015\005\021\066\022\061\030\034" +
    "\001\002\000\004\024\074\001\002\000\014\004\032\015" +
    "\005\021\066\022\061\030\034\001\002\000\020\004\ufff4" +
    "\015\ufff4\016\ufff4\021\ufff4\022\ufff4\024\ufff4\030\ufff4\001" +
    "\002\000\012\004\032\011\033\030\034\032\031\001\002" +
    "\000\014\005\042\006\041\007\040\010\037\014\100\001" +
    "\002\000\020\004\ufff5\015\ufff5\016\ufff5\021\ufff5\022\ufff5" +
    "\024\ufff5\030\ufff5\001\002\000\022\002\ufff1\004\ufff1\015" +
    "\ufff1\016\ufff1\021\ufff1\022\ufff1\024\ufff1\030\ufff1\001\002" +
    "\000\004\016\uffe4\001\002\000\012\004\032\011\033\030" +
    "\034\032\031\001\002\000\014\005\042\006\041\007\040" +
    "\010\037\012\105\001\002\000\014\004\032\015\005\021" +
    "\066\022\061\030\034\001\002\000\020\004\ufff3\015\ufff3" +
    "\016\ufff3\021\ufff3\022\ufff3\024\ufff3\030\ufff3\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\105\000\004\005\003\001\001\000\002\001\001\000" +
    "\010\007\005\011\006\012\007\001\001\000\012\003\064" +
    "\004\061\005\063\006\062\001\001\000\010\007\057\011" +
    "\006\012\007\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\010\014\012" +
    "\015\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\010\023\012\015\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\002\035\003" +
    "\034\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\002\055\003\034\001\001\000\006\002" +
    "\054\003\034\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\002\046\003\034\001\001\000\006\002\045\003" +
    "\034\001\001\000\006\002\044\003\034\001\001\000\006" +
    "\002\043\003\034\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\002\052\003\034\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\012\003\064\004\061\005\063" +
    "\006\101\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\002\067\003\034" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\003" +
    "\064\004\072\005\063\001\001\000\002\001\001\000\010" +
    "\003\064\004\074\005\063\001\001\000\002\001\001\000" +
    "\006\002\076\003\034\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\002" +
    "\103\003\034\001\001\000\002\001\001\000\010\003\064" +
    "\004\105\005\063\001\001\000\002\001\001\000\002\001" +
    "\001" });

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
          case 29: // comms ::= com comms 
            {
              LCom RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Com c = (Com)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		LCom p = (LCom)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new LCom(c,p); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("comms",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // comms ::= 
            {
              LCom RESULT =null;
		 RESULT = null; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("comms",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // fields ::= 
            {
              Fields RESULT =null;
		 RESULT = null; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("fields",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // fields ::= type VAR fields 
            {
              Fields RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int proxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int proxright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Fields prox = (Fields)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("fields",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // type ::= type POINTER 
            {
              Type RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // type ::= STRUCT A_CHAVE fields F_CHAVE 
            {
              Type RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // type ::= type A_COLCH NUM F_COLCH 
            {
              Type RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new TArray(t,n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // type ::= BOOL 
            {
              Type RESULT =null;
		 RESULT = new TBool(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // type ::= INT 
            {
              Type RESULT =null;
		 RESULT = new TInt(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // decl ::= type VAR EQ expr PV 
            {
              Decl RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // decl ::= type VAR PV 
            {
              Decl RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Decl(t,v,null); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // decls ::= 
            {
              LDecl RESULT =null;
		 RESULT = null; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // decls ::= decl decls 
            {
              LDecl RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Decl val = (Decl)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int nextleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nextright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		LDecl next = (LDecl)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new LDecl(val,next); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // block ::= A_CHAVE decls comms F_CHAVE 
            {
              Block RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		LDecl d = (LDecl)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LCom c = (LCom)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Block(d,c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("block",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // com ::= block 
            {
              Com RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = b; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("com",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // com ::= WHILE A_P expr F_P com 
            {
              Com RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Com c = (Com)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new CWhile(e,c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("com",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // com ::= IF A_P expr F_P THEN com ELSE com 
            {
              Com RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Com t = (Com)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Com f = (Com)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new CIf(e,t,f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("com",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // com ::= lexpr EQ expr PV 
            {
              Com RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Assign(l,r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("com",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // lexpr ::= POINTER expr 
            {
              Expr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Reference(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lexpr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // lexpr ::= lexpr PONTO VAR 
            {
              Expr RESULT =null;
		int structleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int structright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr struct = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fieldleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fieldright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String field = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Field(struct,field); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lexpr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // lexpr ::= lexpr A_COLCH expr F_COLCH 
            {
              Expr RESULT =null;
		int arrleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int arrright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Expr arr = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int idxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int idxright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expr idx = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Array(arr,idx); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lexpr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // lexpr ::= VAR 
            {
              Expr RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Variavel(s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lexpr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= A_P expr F_P 
            {
              Expr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr OP4 expr 
            {
              Expr RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr a = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr b = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(a,s,b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr OP3 expr 
            {
              Expr RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr a = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr b = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(a,s,b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr OP2 expr 
            {
              Expr RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr a = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr b = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(a,s,b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expr OP1 expr 
            {
              Expr RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr a = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr b = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(a,s,b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= lexpr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = l; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // expr ::= NUM 
            {
              Expr RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Numero(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= block EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Block start_val = (Block)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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

