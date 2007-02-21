/* Generated By:JavaCC: Do not edit this line. ARQParserConstants.java */
/*

 * (c) Copyright 2004, 2005, 2006, 2007 Hewlett-Packard Development Company, LP

 * All rights reserved.

 */
package com.hp.hpl.jena.query.lang.arq ;

public interface ARQParserConstants {

  int EOF = 0;
  int WS = 8;
  int SINGLE_LINE_COMMENT = 9;
  int Q_IRIref = 10;
  int QNAME_NS = 11;
  int QNAME_LN = 12;
  int BLANK_NODE_LABEL = 13;
  int VAR1 = 14;
  int VAR2 = 15;
  int LANGTAG = 16;
  int A2Z = 17;
  int A2ZN = 18;
  int KW_A = 19;
  int BASE = 20;
  int PREFIX = 21;
  int SELECT = 22;
  int DISTINCT = 23;
  int DESCRIBE = 24;
  int CONSTRUCT = 25;
  int ASK = 26;
  int LIMIT = 27;
  int OFFSET = 28;
  int ORDER = 29;
  int BY = 30;
  int AS = 31;
  int ASC = 32;
  int DESC = 33;
  int NAMED = 34;
  int FROM = 35;
  int WHERE = 36;
  int AND = 37;
  int GRAPH = 38;
  int OPTIONAL = 39;
  int UNION = 40;
  int UNSAID = 41;
  int EXT = 42;
  int FILTER = 43;
  int BOUND = 44;
  int STR = 45;
  int DTYPE = 46;
  int LANG = 47;
  int LANGMATCHES = 48;
  int IS_URI = 49;
  int IS_IRI = 50;
  int IS_BLANK = 51;
  int IS_LITERAL = 52;
  int REGEX = 53;
  int SAME_TERM = 54;
  int TRUE = 55;
  int FALSE = 56;
  int INTEGER = 57;
  int DECIMAL = 58;
  int DOUBLE = 59;
  int INTEGER_POSITIVE = 60;
  int DECIMAL_POSITIVE = 61;
  int DOUBLE_POSITIVE = 62;
  int INTEGER_NEGATIVE = 63;
  int DECIMAL_NEGATIVE = 64;
  int DOUBLE_NEGATIVE = 65;
  int EXPONENT = 66;
  int QUOTE_3D = 67;
  int QUOTE_3S = 68;
  int ECHAR = 69;
  int STRING_LITERAL1 = 70;
  int STRING_LITERAL2 = 71;
  int STRING_LITERAL_LONG1 = 72;
  int STRING_LITERAL_LONG2 = 73;
  int DIGITS = 74;
  int LPAREN = 75;
  int RPAREN = 76;
  int NIL = 77;
  int LBRACE = 78;
  int RBRACE = 79;
  int LBRACKET = 80;
  int RBRACKET = 81;
  int ANON = 82;
  int SEMICOLON = 83;
  int COMMA = 84;
  int DOT = 85;
  int EQ = 86;
  int NE = 87;
  int GT = 88;
  int LT = 89;
  int LE = 90;
  int GE = 91;
  int BANG = 92;
  int TILDE = 93;
  int COLON = 94;
  int SC_OR = 95;
  int SC_AND = 96;
  int PLUS = 97;
  int MINUS = 98;
  int STAR = 99;
  int SLASH = 100;
  int DATATYPE = 101;
  int AT = 102;
  int NCCHAR1P = 103;
  int NCCHAR1 = 104;
  int NCCHAR = 105;
  int NCNAME_PREFIX = 106;
  int NCNAME = 107;
  int VARNAME = 108;
  int UNKNOWN = 109;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\"<<\"",
    "\">>\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<WS>",
    "<SINGLE_LINE_COMMENT>",
    "<Q_IRIref>",
    "<QNAME_NS>",
    "<QNAME_LN>",
    "<BLANK_NODE_LABEL>",
    "<VAR1>",
    "<VAR2>",
    "<LANGTAG>",
    "<A2Z>",
    "<A2ZN>",
    "\"a\"",
    "\"base\"",
    "\"prefix\"",
    "\"select\"",
    "\"distinct\"",
    "\"describe\"",
    "\"construct\"",
    "\"ask\"",
    "\"limit\"",
    "\"offset\"",
    "\"order\"",
    "\"by\"",
    "\"as\"",
    "\"asc\"",
    "\"desc\"",
    "\"named\"",
    "\"from\"",
    "\"where\"",
    "\"and\"",
    "\"graph\"",
    "\"optional\"",
    "\"union\"",
    "\"unsaid\"",
    "\"ext\"",
    "\"filter\"",
    "\"bound\"",
    "\"str\"",
    "\"datatype\"",
    "\"lang\"",
    "\"langmatches\"",
    "\"isURI\"",
    "\"isIRI\"",
    "\"isBlank\"",
    "\"isLiteral\"",
    "\"regex\"",
    "\"sameTerm\"",
    "\"true\"",
    "\"false\"",
    "<INTEGER>",
    "<DECIMAL>",
    "<DOUBLE>",
    "<INTEGER_POSITIVE>",
    "<DECIMAL_POSITIVE>",
    "<DOUBLE_POSITIVE>",
    "<INTEGER_NEGATIVE>",
    "<DECIMAL_NEGATIVE>",
    "<DOUBLE_NEGATIVE>",
    "<EXPONENT>",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "<ECHAR>",
    "<STRING_LITERAL1>",
    "<STRING_LITERAL2>",
    "<STRING_LITERAL_LONG1>",
    "<STRING_LITERAL_LONG2>",
    "<DIGITS>",
    "\"(\"",
    "\")\"",
    "<NIL>",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<ANON>",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\"!=\"",
    "\">\"",
    "\"<\"",
    "\"<=\"",
    "\">=\"",
    "\"!\"",
    "\"~\"",
    "\":\"",
    "\"||\"",
    "\"&&\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^^\"",
    "\"@\"",
    "<NCCHAR1P>",
    "<NCCHAR1>",
    "<NCCHAR>",
    "<NCNAME_PREFIX>",
    "<NCNAME>",
    "<VARNAME>",
    "<UNKNOWN>",
  };

}
