/* The following code was generated by JFlex 1.4.3 on 11/12/13 00:00 */

package br.poli.ecomp.nemesis.avaliador;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/12/13 00:00 from the specification file
 * <tt>main/jflex/avaliador/ALexico.jflex</tt>
 */
public class ALexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\62\1\0\2\62\22\0\1\51\1\53\1\46\1\0\1\1"+
    "\3\0\1\56\1\57\1\61\1\36\1\37\1\0\1\43\1\63\1\42"+
    "\1\47\10\42\1\55\1\52\3\0\1\54\1\44\1\34\1\45\1\31"+
    "\2\45\1\35\12\45\1\32\1\45\1\30\7\45\1\50\1\64\1\60"+
    "\3\0\1\10\1\17\1\23\1\11\1\5\1\2\1\15\1\7\1\13"+
    "\1\26\1\45\1\20\1\24\1\14\1\3\1\25\1\45\1\6\1\12"+
    "\1\4\1\22\1\16\1\33\1\27\1\21\1\45\1\40\1\0\1\41"+
    "\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\2\0\1\6"+
    "\21\0\1\7\30\0\1\5\1\7\42\0\1\10\1\11"+
    "\6\0\1\12\3\0\1\13\12\0\1\14\6\0\1\15"+
    "\3\0\1\16\6\0\1\17\1\0\1\20\1\0\1\21"+
    "\1\22\1\23\5\0\1\24\3\0\1\25\6\0\1\26"+
    "\6\0\1\27\3\0\1\30\10\0\1\31\1\32\3\0"+
    "\1\33\3\0\1\34\12\0\1\35\23\0\1\36\2\0"+
    "\1\37\10\0\1\40\2\0\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[228];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\152\0\152\0\152\0\237\0\324"+
    "\0\u0109\0\152\0\u013e\0\u0173\0\u01a8\0\u01dd\0\u0212\0\u0247"+
    "\0\u027c\0\u02b1\0\u02e6\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef"+
    "\0\u0424\0\u0459\0\u048e\0\u04c3\0\u04f8\0\u052d\0\u0562\0\u0597"+
    "\0\u05cc\0\u0601\0\u0636\0\u066b\0\u06a0\0\u06d5\0\u070a\0\u073f"+
    "\0\u0774\0\u07a9\0\u07de\0\u0813\0\u0848\0\u087d\0\u08b2\0\u08e7"+
    "\0\u091c\0\u0951\0\u0986\0\u09bb\0\u048e\0\u09f0\0\u0a25\0\u0a5a"+
    "\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e\0\u0b63\0\u0b98\0\u0bcd\0\u0c02"+
    "\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6\0\u0d0b\0\u0d40\0\u0d75\0\u0daa"+
    "\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8\0\u0f1d\0\u0f52"+
    "\0\u0f87\0\u0fbc\0\u0ff1\0\u1026\0\u105b\0\u1090\0\u10c5\0\u10fa"+
    "\0\152\0\152\0\u112f\0\u1164\0\u1199\0\u11ce\0\u1203\0\u1238"+
    "\0\152\0\u126d\0\u12a2\0\u12d7\0\152\0\u130c\0\u1341\0\u1376"+
    "\0\u13ab\0\u13e0\0\u1415\0\u144a\0\u147f\0\u14b4\0\u14e9\0\152"+
    "\0\u151e\0\u1553\0\u1588\0\u15bd\0\u15f2\0\u1627\0\152\0\u165c"+
    "\0\u1691\0\u16c6\0\152\0\u16fb\0\u1730\0\u1765\0\u179a\0\u17cf"+
    "\0\u1804\0\152\0\u1839\0\152\0\u186e\0\152\0\152\0\152"+
    "\0\u18a3\0\u18d8\0\u190d\0\u1942\0\u1977\0\152\0\u19ac\0\u19e1"+
    "\0\u1a16\0\152\0\u1a4b\0\u1a80\0\u1ab5\0\u1aea\0\u1b1f\0\u1b54"+
    "\0\152\0\u1b89\0\u1bbe\0\u1bf3\0\u1c28\0\u1c5d\0\u1c92\0\152"+
    "\0\u1cc7\0\u1cfc\0\u1d31\0\152\0\u1d66\0\u1d9b\0\u1dd0\0\u1e05"+
    "\0\u1e3a\0\u1e6f\0\u1ea4\0\u1ed9\0\152\0\152\0\u1f0e\0\u1f43"+
    "\0\u1f78\0\152\0\u1fad\0\u1fe2\0\u2017\0\152\0\u204c\0\u2081"+
    "\0\u20b6\0\u20eb\0\u2120\0\u2155\0\u218a\0\u21bf\0\u21f4\0\u2229"+
    "\0\152\0\u225e\0\u2293\0\u22c8\0\u22fd\0\u2332\0\u2367\0\u239c"+
    "\0\u23d1\0\u2406\0\u243b\0\u2470\0\u24a5\0\u24da\0\u250f\0\u2544"+
    "\0\u2579\0\u25ae\0\u25e3\0\u2618\0\152\0\u264d\0\u2682\0\152"+
    "\0\u26b7\0\u26ec\0\u2721\0\u2756\0\u278b\0\u27c0\0\u27f5\0\u282a"+
    "\0\152\0\u285f\0\u2894\0\152";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[228];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\34\0\1\3\1\4\1\5\1\6\1\7"+
    "\1\0\1\10\1\0\1\11\1\7\1\0\1\12\10\0"+
    "\1\12\1\13\3\0\1\14\1\15\1\16\2\0\1\17"+
    "\1\20\1\21\1\22\2\0\1\23\1\24\1\25\2\0"+
    "\1\26\1\27\1\30\1\31\5\0\1\32\160\0\1\7"+
    "\1\33\3\0\1\7\17\0\34\34\7\0\1\34\57\0"+
    "\1\35\110\0\1\36\3\0\1\37\2\0\1\40\103\0"+
    "\1\41\45\0\1\42\4\0\1\43\56\0\1\44\73\0"+
    "\1\45\60\0\1\46\57\0\1\47\1\50\1\51\14\0"+
    "\1\52\50\0\1\53\66\0\1\54\57\0\1\55\75\0"+
    "\1\56\53\0\1\57\4\0\1\60\64\0\1\61\11\0"+
    "\1\62\50\0\1\63\63\0\1\64\121\0\1\65\4\0"+
    "\1\65\17\0\34\34\4\0\1\66\2\0\1\34\1\0"+
    "\1\66\64\0\1\67\76\0\1\70\6\0\1\71\66\0"+
    "\1\72\63\0\1\73\102\0\1\74\46\0\1\75\70\0"+
    "\1\76\66\0\1\77\56\0\1\100\100\0\1\101\54\0"+
    "\1\102\60\0\1\103\77\0\1\104\50\0\1\105\67\0"+
    "\1\106\67\0\1\107\66\0\1\110\73\0\1\111\66\0"+
    "\1\112\44\0\1\113\22\0\1\114\55\0\1\115\47\0"+
    "\1\116\74\0\1\117\113\0\1\66\4\0\1\66\56\0"+
    "\1\120\66\0\1\121\25\0\1\122\65\0\1\123\72\0"+
    "\1\124\56\0\1\125\77\0\1\126\55\0\1\127\106\0"+
    "\1\130\36\0\1\131\2\0\1\132\72\0\1\133\52\0"+
    "\1\134\64\0\1\135\106\0\1\136\60\0\1\137\55\0"+
    "\1\140\72\0\1\141\61\0\1\142\54\0\1\143\103\0"+
    "\1\144\46\0\1\145\70\0\1\146\55\0\1\147\62\0"+
    "\1\150\77\0\1\151\117\0\1\152\75\0\1\153\10\0"+
    "\1\154\113\0\1\155\33\0\1\156\116\0\1\157\34\0"+
    "\1\160\64\0\1\161\64\0\1\162\64\0\1\163\64\0"+
    "\1\164\72\0\1\165\56\0\1\166\104\0\1\167\47\0"+
    "\1\170\61\0\1\171\71\0\1\172\65\0\1\173\75\0"+
    "\1\174\53\0\1\175\56\0\1\176\66\0\1\177\110\0"+
    "\1\200\115\0\1\201\6\0\1\202\72\0\1\203\64\0"+
    "\1\204\60\0\1\205\62\0\1\206\64\0\1\207\64\0"+
    "\1\210\102\0\1\211\54\0\1\212\73\0\1\213\60\0"+
    "\1\214\53\0\1\215\63\0\1\216\101\0\1\217\67\0"+
    "\1\220\51\0\1\221\56\0\1\222\131\0\1\223\74\0"+
    "\1\224\15\0\1\225\72\0\1\226\51\0\1\227\74\0"+
    "\1\230\53\0\1\231\100\0\1\232\56\0\1\233\76\0"+
    "\1\234\60\0\1\235\56\0\1\236\115\0\1\237\104\0"+
    "\1\240\34\0\1\241\43\0\1\242\66\0\1\243\62\0"+
    "\1\244\57\0\1\245\72\0\1\246\101\0\1\247\41\0"+
    "\1\250\62\0\1\251\120\0\1\252\32\0\1\253\64\0"+
    "\1\254\63\0\1\255\72\0\1\256\56\0\1\257\103\0"+
    "\1\260\72\0\1\261\41\0\1\262\130\0\1\263\20\0"+
    "\1\264\110\0\1\265\53\0\1\266\46\0\1\267\70\0"+
    "\1\270\130\0\1\271\43\0\1\272\54\0\1\273\50\0"+
    "\1\274\61\0\1\275\135\0\1\276\32\0\1\277\47\0"+
    "\1\300\64\0\1\301\72\0\1\302\126\0\1\303\14\0"+
    "\1\304\71\0\1\305\75\0\1\306\117\0\1\307\20\0"+
    "\1\310\56\0\1\311\65\0\1\312\136\0\1\313\11\0"+
    "\1\314\73\0\1\315\103\0\1\316\102\0\1\317\27\0"+
    "\1\320\54\0\1\321\103\0\1\322\122\0\1\323\7\0"+
    "\1\324\75\0\1\325\55\0\1\326\117\0\1\327\40\0"+
    "\1\330\62\0\1\331\113\0\1\332\27\0\1\333\140\0"+
    "\1\334\17\0\1\335\132\0\1\336\6\0\1\337\127\0"+
    "\1\340\32\0\1\341\110\0\1\342\73\0\1\343\56\0"+
    "\1\344\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10441];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\4\11\1\1\2\0\1\11\21\0\1\1\30\0"+
    "\2\1\42\0\2\11\6\0\1\11\3\0\1\11\12\0"+
    "\1\11\6\0\1\11\3\0\1\11\6\0\1\11\1\0"+
    "\1\11\1\0\3\11\5\0\1\11\3\0\1\11\6\0"+
    "\1\11\6\0\1\11\3\0\1\11\10\0\2\11\3\0"+
    "\1\11\3\0\1\11\12\0\1\11\23\0\1\11\2\0"+
    "\1\11\10\0\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[228];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ALexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ALexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 142) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { return new Symbol(sym.SOLVER);
          }
        case 34: break;
        case 13: 
          { return new Symbol(sym.GROUP);
          }
        case 35: break;
        case 31: 
          { return new Symbol(sym.FREEANSWERQUESTION);
          }
        case 36: break;
        case 21: 
          { return new Symbol(sym.WEIGHT);
          }
        case 37: break;
        case 22: 
          { return new Symbol(sym.SUBJECT);
          }
        case 38: break;
        case 20: 
          { return new Symbol(sym.COURSE);
          }
        case 39: break;
        case 18: 
          { return new Symbol(sym.ANSWER);
          }
        case 40: break;
        case 3: 
          { return new Symbol(sym.OPENBRACKET);
          }
        case 41: break;
        case 28: 
          { return new Symbol(sym.UNIVERSITY);
          }
        case 42: break;
        case 26: 
          { return new Symbol(sym.VARIABLES);
          }
        case 43: break;
        case 4: 
          { return new Symbol(sym.CLOSEBRACKET);
          }
        case 44: break;
        case 5: 
          { return new Symbol(sym.NUMBER, new Float(yytext()));
          }
        case 45: break;
        case 27: 
          { return new Symbol(sym.PROFESSOR);
          }
        case 46: break;
        case 12: 
          { return new Symbol(sym.TITLE);
          }
        case 47: break;
        case 29: 
          { return new Symbol(sym.MAXIMUMSCORE);
          }
        case 48: break;
        case 14: 
          { return new Symbol(sym.CAMPI);
          }
        case 49: break;
        case 32: 
          { return new Symbol(sym.MULTIPLECHOICEQUESTION);
          }
        case 50: break;
        case 9: 
          { return new Symbol(sym.DATA);
          }
        case 51: break;
        case 11: 
          { return new Symbol(sym.MATH);
          }
        case 52: break;
        case 30: 
          { return new Symbol(sym.TRUEFALSEQUESTION);
          }
        case 53: break;
        case 24: 
          { return new Symbol(sym.SETTINGS);
          }
        case 54: break;
        case 1: 
          { return new Symbol(sym.SUM);
          }
        case 55: break;
        case 17: 
          { return new Symbol(sym.HEADER);
          }
        case 56: break;
        case 33: 
          { return new Symbol(sym.STRING);
          }
        case 57: break;
        case 7: 
          { return new Symbol(sym.VARIABLE);
          }
        case 58: break;
        case 15: 
          { return new Symbol(sym.FOOTER);
          }
        case 59: break;
        case 8: 
          { return new Symbol(sym.DATE);
          }
        case 60: break;
        case 6: 
          { /* ignora espa�os e saltos de linha */
          }
        case 61: break;
        case 16: 
          { return new Symbol(sym.OPTION);
          }
        case 62: break;
        case 10: 
          { return new Symbol(sym.BODY);
          }
        case 63: break;
        case 23: 
          { /* ignora coment�rios */
          }
        case 64: break;
        case 25: 
          { return new Symbol(sym.STATEMENT);
          }
        case 65: break;
        case 2: 
          { return new Symbol(sym.SEP);
          }
        case 66: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {     return new Symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}