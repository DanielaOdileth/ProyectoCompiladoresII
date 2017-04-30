/* The following code was generated by JFlex 1.6.1 */

package proyecto_compiladores;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/proyecto_compiladores/Lexico.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

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
    "\11\0\2\0\2\0\1\0\22\0\1\0\6\0\1\4\1\15\1\16"+
    "\1\7\1\10\1\14\1\11\1\36\1\12\12\2\1\35\1\13\1\33"+
    "\1\32\1\34\2\0\1\45\1\51\1\66\1\63\1\55\1\71\1\44"+
    "\1\73\1\56\2\1\1\61\1\46\1\27\1\30\1\37\1\1\1\43"+
    "\1\62\1\31\1\67\1\74\1\76\1\1\1\50\1\1\1\17\1\0"+
    "\1\20\1\0\1\3\1\0\1\21\1\54\1\64\1\23\1\52\1\70"+
    "\1\40\1\72\1\53\2\1\1\57\1\41\1\22\1\24\1\42\1\1"+
    "\1\25\1\60\1\26\1\65\1\75\1\77\1\1\1\47\1\1\1\5"+
    "\1\0\1\6\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\7\2"+
    "\1\16\1\17\1\20\1\21\1\22\15\2\1\0\1\23"+
    "\1\0\1\24\3\2\1\25\1\26\5\2\1\27\1\30"+
    "\1\31\1\32\7\2\1\33\6\2\1\34\1\2\1\35"+
    "\11\2\1\36\2\2\1\37\3\2\1\40\1\41\7\2"+
    "\1\42\2\2\1\43\4\2\1\44\1\45\4\2\1\46"+
    "\4\2\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[121];
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
    "\0\0\0\100\0\200\0\300\0\u0100\0\u0140\0\100\0\100"+
    "\0\100\0\100\0\100\0\100\0\100\0\100\0\100\0\100"+
    "\0\u0180\0\u01c0\0\u0200\0\u0240\0\u0280\0\u02c0\0\u0300\0\100"+
    "\0\u0340\0\u0380\0\u03c0\0\100\0\u0400\0\u0440\0\u0480\0\u04c0"+
    "\0\u0500\0\u0540\0\u0580\0\u05c0\0\u0600\0\u0640\0\u0680\0\u06c0"+
    "\0\u0700\0\u0740\0\100\0\u0140\0\100\0\u0780\0\u07c0\0\u0800"+
    "\0\200\0\200\0\u0840\0\u0880\0\u08c0\0\u0900\0\u0940\0\100"+
    "\0\100\0\100\0\100\0\u0980\0\u09c0\0\u0a00\0\u0a40\0\u0a80"+
    "\0\u0ac0\0\u0b00\0\200\0\u0b40\0\u0b80\0\u0bc0\0\u0c00\0\u0c40"+
    "\0\u0c80\0\200\0\u0cc0\0\200\0\u0d00\0\u0d40\0\u0d80\0\u0dc0"+
    "\0\u0e00\0\u0e40\0\u0e80\0\u0ec0\0\u0f00\0\200\0\u0f40\0\u0f80"+
    "\0\200\0\u0fc0\0\u1000\0\u1040\0\200\0\200\0\u1080\0\u10c0"+
    "\0\u1100\0\u1140\0\u1180\0\u11c0\0\u1200\0\200\0\u1240\0\u1280"+
    "\0\200\0\u12c0\0\u1300\0\u1340\0\u1380\0\200\0\200\0\u13c0"+
    "\0\u1400\0\u1440\0\u1480\0\200\0\u14c0\0\u1500\0\u1540\0\u1580"+
    "\0\200";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[121];
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
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\2\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\3\1\23\1\3\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\2\3\1\36\2\3\1\37\3\3\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\15\3\1\46\1\47\1\50\1\51"+
    "\101\0\3\3\15\0\11\3\5\0\41\3\2\0\1\4"+
    "\75\0\4\52\1\53\73\52\6\54\1\55\71\54\1\0"+
    "\3\3\15\0\1\3\1\56\2\3\1\57\4\3\5\0"+
    "\41\3\1\0\3\3\15\0\3\3\1\60\5\3\5\0"+
    "\41\3\1\0\3\3\15\0\4\3\1\61\4\3\5\0"+
    "\31\3\1\62\7\3\1\0\3\3\15\0\11\3\5\0"+
    "\10\3\1\63\22\3\1\64\5\3\1\0\3\3\15\0"+
    "\3\3\1\60\3\3\1\65\1\3\5\0\41\3\1\0"+
    "\3\3\15\0\11\3\5\0\31\3\2\62\6\3\1\0"+
    "\3\3\15\0\11\3\5\0\10\3\1\63\1\66\21\3"+
    "\1\64\1\67\4\3\32\0\1\70\1\0\1\71\75\0"+
    "\1\72\77\0\1\73\46\0\3\3\15\0\4\3\1\74"+
    "\4\3\5\0\4\3\1\75\34\3\1\0\3\3\15\0"+
    "\4\3\1\74\4\3\5\0\41\3\1\0\3\3\15\0"+
    "\4\3\1\57\4\3\5\0\4\3\1\76\34\3\1\0"+
    "\3\3\15\0\11\3\5\0\13\3\1\77\2\3\1\100"+
    "\22\3\1\0\3\3\15\0\1\3\1\101\7\3\5\0"+
    "\20\3\1\102\20\3\1\0\3\3\15\0\11\3\5\0"+
    "\31\3\1\103\7\3\1\0\3\3\15\0\11\3\5\0"+
    "\13\3\1\77\25\3\1\0\3\3\15\0\1\3\1\101"+
    "\4\3\1\104\2\3\5\0\20\3\1\102\1\3\1\105"+
    "\16\3\1\0\3\3\15\0\11\3\5\0\31\3\2\103"+
    "\6\3\1\0\3\3\15\0\1\106\10\3\5\0\6\3"+
    "\1\107\32\3\1\0\3\3\15\0\1\106\10\3\5\0"+
    "\41\3\1\0\3\3\15\0\11\3\5\0\33\3\1\110"+
    "\1\111\4\3\1\0\3\3\15\0\11\3\5\0\33\3"+
    "\1\110\5\3\4\0\1\53\74\0\3\3\15\0\2\3"+
    "\1\112\6\3\5\0\41\3\1\0\3\3\15\0\4\3"+
    "\1\113\4\3\5\0\41\3\1\0\3\3\15\0\5\3"+
    "\1\114\3\3\5\0\41\3\1\0\3\3\15\0\11\3"+
    "\5\0\3\3\1\115\35\3\1\0\3\3\15\0\11\3"+
    "\5\0\13\3\1\116\25\3\1\0\3\3\15\0\10\3"+
    "\1\114\5\0\41\3\1\0\3\3\15\0\11\3\5\0"+
    "\1\117\40\3\1\0\3\3\15\0\11\3\5\0\16\3"+
    "\1\120\22\3\1\0\3\3\15\0\3\3\1\121\5\3"+
    "\5\0\41\3\1\0\3\3\15\0\7\3\1\122\1\3"+
    "\5\0\41\3\1\0\3\3\15\0\11\3\5\0\4\3"+
    "\1\123\34\3\1\0\3\3\15\0\11\3\5\0\1\3"+
    "\1\124\37\3\1\0\3\3\15\0\11\3\5\0\5\3"+
    "\1\125\33\3\1\0\3\3\15\0\2\3\1\126\6\3"+
    "\5\0\41\3\1\0\3\3\15\0\11\3\5\0\21\3"+
    "\1\127\17\3\1\0\3\3\15\0\11\3\5\0\24\3"+
    "\1\126\14\3\1\0\3\3\15\0\11\3\5\0\23\3"+
    "\1\130\15\3\1\0\3\3\15\0\4\3\1\131\4\3"+
    "\5\0\41\3\1\0\3\3\15\0\11\3\5\0\4\3"+
    "\1\131\34\3\1\0\3\3\15\0\11\3\5\0\14\3"+
    "\1\132\24\3\1\0\3\3\15\0\11\3\5\0\17\3"+
    "\1\133\21\3\1\0\3\3\15\0\1\134\10\3\5\0"+
    "\41\3\1\0\3\3\15\0\11\3\5\0\13\3\1\135"+
    "\25\3\1\0\3\3\15\0\1\3\1\136\7\3\5\0"+
    "\41\3\1\0\3\3\15\0\11\3\5\0\16\3\1\135"+
    "\22\3\1\0\3\3\15\0\6\3\1\136\2\3\5\0"+
    "\41\3\1\0\3\3\15\0\11\3\5\0\1\3\1\137"+
    "\23\3\1\140\13\3\1\0\3\3\15\0\11\3\5\0"+
    "\5\3\1\141\21\3\1\142\11\3\1\0\3\3\15\0"+
    "\11\3\5\0\6\3\1\143\32\3\1\0\3\3\15\0"+
    "\11\3\5\0\14\3\1\144\24\3\1\0\3\3\15\0"+
    "\11\3\5\0\17\3\1\145\21\3\1\0\3\3\15\0"+
    "\11\3\5\0\13\3\1\146\25\3\1\0\3\3\15\0"+
    "\11\3\5\0\16\3\1\146\22\3\1\0\3\3\15\0"+
    "\11\3\5\0\20\3\1\147\20\3\1\0\3\3\15\0"+
    "\11\3\5\0\22\3\1\150\16\3\1\0\3\3\15\0"+
    "\11\3\5\0\10\3\1\151\30\3\1\0\3\3\15\0"+
    "\4\3\1\152\4\3\5\0\41\3\1\0\3\3\15\0"+
    "\11\3\5\0\13\3\1\153\25\3\1\0\3\3\15\0"+
    "\11\3\5\0\4\3\1\154\34\3\1\0\3\3\15\0"+
    "\11\3\5\0\16\3\1\155\22\3\1\0\3\3\15\0"+
    "\11\3\5\0\11\3\1\151\27\3\1\0\3\3\15\0"+
    "\1\3\1\156\7\3\5\0\41\3\1\0\3\3\15\0"+
    "\6\3\1\156\2\3\5\0\41\3\1\0\3\3\15\0"+
    "\11\3\5\0\13\3\1\157\25\3\1\0\3\3\15\0"+
    "\11\3\5\0\16\3\1\157\22\3\1\0\3\3\15\0"+
    "\1\160\10\3\5\0\41\3\1\0\3\3\15\0\2\3"+
    "\1\161\6\3\5\0\41\3\1\0\3\3\15\0\11\3"+
    "\5\0\6\3\1\162\32\3\1\0\3\3\15\0\11\3"+
    "\5\0\24\3\1\163\14\3\1\0\3\3\15\0\11\3"+
    "\5\0\2\3\1\164\36\3\1\0\3\3\15\0\11\3"+
    "\5\0\26\3\1\165\12\3\1\0\3\3\15\0\11\3"+
    "\5\0\7\3\1\164\31\3\1\0\3\3\15\0\11\3"+
    "\5\0\30\3\1\166\10\3\1\0\3\3\15\0\4\3"+
    "\1\167\4\3\5\0\41\3\1\0\3\3\15\0\11\3"+
    "\5\0\4\3\1\170\34\3\1\0\3\3\15\0\11\3"+
    "\5\0\13\3\1\171\25\3\1\0\3\3\15\0\11\3"+
    "\5\0\16\3\1\171\22\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5568];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\12\11\7\1\1\11\3\1\1\11"+
    "\15\1\1\0\1\11\1\0\1\11\12\1\4\11\76\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[121];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  private Symbol createToken(int type, Object value){
    System.out.println("Token: "+value+" linea: "+yyline+ " columna: "+yycolumn);
    return new Symbol(type, yycolumn, yyline, value);
  }

  private Symbol createToken(int type){
    return new Symbol(type, yycolumn,  yyline);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 198) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print(yytext());
            }
          case 40: break;
          case 2: 
            { return createToken(sym.IDENT, yytext());
            }
          case 41: break;
          case 3: 
            { return createToken(sym.INT, new Integer(yytext()));
            }
          case 42: break;
          case 4: 
            { return createToken(sym.TIMES, "*");
            }
          case 43: break;
          case 5: 
            { return createToken(sym.PLUS, "+");
            }
          case 44: break;
          case 6: 
            { return createToken(sym.MINUS, "-");
            }
          case 45: break;
          case 7: 
            { return createToken(sym.DIVIDE, "/");
            }
          case 46: break;
          case 8: 
            { return createToken(sym.SEMI, ";");
            }
          case 47: break;
          case 9: 
            { return createToken(sym.COMMA, ",");
            }
          case 48: break;
          case 10: 
            { return createToken(sym.LEFT_PAREN, yytext());
            }
          case 49: break;
          case 11: 
            { return createToken(sym.RT_PAREN, yytext());
            }
          case 50: break;
          case 12: 
            { return createToken(sym.LEFT_BRKT, yytext());
            }
          case 51: break;
          case 13: 
            { return createToken(sym.RT_BRKT, yytext());
            }
          case 52: break;
          case 14: 
            { return createToken(sym.EQ, "=");
            }
          case 53: break;
          case 15: 
            { return createToken(sym.LESS, "<");
            }
          case 54: break;
          case 16: 
            { return createToken(sym.GTR, ">");
            }
          case 55: break;
          case 17: 
            { return createToken(sym.COLON, ":");
            }
          case 56: break;
          case 18: 
            { return createToken(sym.DOT, ".");
            }
          case 57: break;
          case 19: 
            { return createToken(sym.CHAR, new Character(yytext().charAt(1)));
            }
          case 58: break;
          case 20: 
            { return createToken(sym.COMMENT, yytext());
            }
          case 59: break;
          case 21: 
            { return createToken(sym.OR, "or");
            }
          case 60: break;
          case 22: 
            { return createToken(sym.OF, "of");
            }
          case 61: break;
          case 23: 
            { return createToken(sym.LESS_EQ, "<=");
            }
          case 62: break;
          case 24: 
            { return createToken(sym.NOT_EQ, "<>");
            }
          case 63: break;
          case 25: 
            { return createToken(sym.GTR_EQ, ">=");
            }
          case 64: break;
          case 26: 
            { return createToken(sym.ASSMNT, yytext());
            }
          case 65: break;
          case 27: 
            { return createToken(sym.IF, "if");
            }
          case 66: break;
          case 28: 
            { return createToken(sym.AND, "and");
            }
          case 67: break;
          case 29: 
            { return createToken(sym.NOT, "not");
            }
          case 68: break;
          case 30: 
            { return createToken(sym.END, "end" );
            }
          case 69: break;
          case 31: 
            { return createToken(sym.VAR, "var");
            }
          case 70: break;
          case 32: 
            { return createToken(sym.TYPE, "type");
            }
          case 71: break;
          case 33: 
            { return createToken(sym.THEN, "then");
            }
          case 72: break;
          case 34: 
            { return createToken(sym.ELSE, "else" );
            }
          case 73: break;
          case 35: 
            { return createToken(sym.ARRAY, "array" );
            }
          case 74: break;
          case 36: 
            { return createToken(sym.BEGIN, "begin" );
            }
          case 75: break;
          case 37: 
            { return createToken(sym.TYPE, "WHILE");
            }
          case 76: break;
          case 38: 
            { return createToken(sym.PROGRAM, "program");
            }
          case 77: break;
          case 39: 
            { return createToken(sym.PROCEDURE, "procedure");
            }
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
