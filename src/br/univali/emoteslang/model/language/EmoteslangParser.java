// Generated from Emoteslang.g4 by ANTLR 4.7.2
package br.univali.emoteslang.model.language;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EmoteslangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, FINISH=2, RETURN=3, FUNCTION=4, READ=5, WRITE=6, IF=7, ELSE=8, 
		ELSEIF=9, SWITCH=10, CASE=11, BREAK=12, DEFAULT=13, FOR=14, WHILE=15, 
		DO=16, TP_INT=17, TP_BIN=18, TP_HEX=19, TP_DOUBLE=20, TP_FLOAT=21, TP_CHAR=22, 
		TP_STRING=23, TP_BOOL=24, TP_VOID=25, BOOLEAN=26, TRUE=27, FALSE=28, UN_ADD=29, 
		UN_SUB=30, BIGGERT=31, SMALLERT=32, BIGGERE=33, SMALLERE=34, EQUALS=35, 
		DIFFERENT=36, AND=37, OR=38, NOT=39, BIT_AND=40, BIT_OR=41, BIT_XOR=42, 
		BIT_NOT=43, BIT_RS=44, BIT_LS=45, ADD=46, SUB=47, MULT=48, DIV=49, MOD=50, 
		ATTRIBUTION=51, DOT=52, COMMA=53, DOT_COMMA=54, DOUBLE_DOT=55, LEFT_SBRACKET=56, 
		RIGHT_SBRACKET=57, LEFT_PARENTESIS=58, RIGHT_PARENTESIS=59, LEFT_CBRACKETS=60, 
		RIGHT_CBRACKETS=61, INLINE_COMMENT=62, MULTILINE_COMMENT=63, WHITESPACE=64, 
		ID=65, INT=66, DOUBLE=67, FLOAT=68, CHAR=69, STRING=70, BIN=71, HEXA=72;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_declaration = 2, RULE_declarationVar = 3, 
		RULE_declarationMatrix = 4, RULE_initializeMatrix = 5, RULE_declarationArray = 6, 
		RULE_initializeArray = 7, RULE_matrixLine = 8, RULE_matrixCol = 9, RULE_arraySize = 10, 
		RULE_arrayIndex = 11, RULE_functions = 12, RULE_parametersList = 13, RULE_parameter = 14, 
		RULE_paramArray = 15, RULE_paramMatrix = 16, RULE_inputAndOutput = 17, 
		RULE_parametersCall = 18, RULE_commands = 19, RULE_command = 20, RULE_conditionals = 21, 
		RULE_ifdes = 22, RULE_whiledes = 23, RULE_doWhile = 24, RULE_fordes = 25, 
		RULE_switchdes = 26, RULE_casedes = 27, RULE_defaultdes = 28, RULE_breakdes = 29, 
		RULE_returndes = 30, RULE_commandList = 31, RULE_initializeFor = 32, RULE_incrementFor = 33, 
		RULE_condition = 34, RULE_attribution = 35, RULE_expression = 36, RULE_typeWithVoid = 37, 
		RULE_type = 38, RULE_expressionList = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "declaration", "declarationVar", "declarationMatrix", 
			"initializeMatrix", "declarationArray", "initializeArray", "matrixLine", 
			"matrixCol", "arraySize", "arrayIndex", "functions", "parametersList", 
			"parameter", "paramArray", "paramMatrix", "inputAndOutput", "parametersCall", 
			"commands", "command", "conditionals", "ifdes", "whiledes", "doWhile", 
			"fordes", "switchdes", "casedes", "defaultdes", "breakdes", "returndes", 
			"commandList", "initializeFor", "incrementFor", "condition", "attribution", 
			"expression", "typeWithVoid", "type", "expressionList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'go'", "'stop'", "'return'", "'function'", "'read'", "'write'", 
			"'if'", "'else'", "'elseif'", "'switch'", "'case'", "'break'", "'default'", 
			"'for'", "'while'", "'do'", "'int'", "'bin'", "'hex'", "'double'", "'float'", 
			"'char'", "'string'", "'boolean'", "'void'", null, "'true'", "'false'", 
			"'++'", "'--'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", 
			"'||'", "'!'", "'&'", "'|'", "'^'", "'~'", "'>>'", "'<<'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'='", "'.'", "','", "';'", "':'", "'['", "']'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "FINISH", "RETURN", "FUNCTION", "READ", "WRITE", "IF", 
			"ELSE", "ELSEIF", "SWITCH", "CASE", "BREAK", "DEFAULT", "FOR", "WHILE", 
			"DO", "TP_INT", "TP_BIN", "TP_HEX", "TP_DOUBLE", "TP_FLOAT", "TP_CHAR", 
			"TP_STRING", "TP_BOOL", "TP_VOID", "BOOLEAN", "TRUE", "FALSE", "UN_ADD", 
			"UN_SUB", "BIGGERT", "SMALLERT", "BIGGERE", "SMALLERE", "EQUALS", "DIFFERENT", 
			"AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_RS", 
			"BIT_LS", "ADD", "SUB", "MULT", "DIV", "MOD", "ATTRIBUTION", "DOT", "COMMA", 
			"DOT_COMMA", "DOUBLE_DOT", "LEFT_SBRACKET", "RIGHT_SBRACKET", "LEFT_PARENTESIS", 
			"RIGHT_PARENTESIS", "LEFT_CBRACKETS", "RIGHT_CBRACKETS", "INLINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE", "ID", "INT", "DOUBLE", "FLOAT", "CHAR", 
			"STRING", "BIN", "HEXA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Emoteslang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EmoteslangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(EmoteslangParser.START, 0); }
		public TerminalNode LEFT_CBRACKETS() { return getToken(EmoteslangParser.LEFT_CBRACKETS, 0); }
		public TerminalNode RIGHT_CBRACKETS() { return getToken(EmoteslangParser.RIGHT_CBRACKETS, 0); }
		public TerminalNode FINISH() { return getToken(EmoteslangParser.FINISH, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(START);
			setState(81);
			match(LEFT_CBRACKETS);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL))) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TP_INT:
				case TP_BIN:
				case TP_HEX:
				case TP_DOUBLE:
				case TP_FLOAT:
				case TP_CHAR:
				case TP_STRING:
				case TP_BOOL:
					{
					setState(82);
					statements();
					}
					break;
				case FUNCTION:
					{
					setState(83);
					functions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(RIGHT_CBRACKETS);
			setState(90);
			match(FINISH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EmoteslangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EmoteslangParser.COMMA, i);
		}
		public TerminalNode DOT_COMMA() { return getToken(EmoteslangParser.DOT_COMMA, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			type();
			setState(93);
			declaration();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				declaration();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(101);
				match(DOT_COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationVarContext declarationVar() {
			return getRuleContext(DeclarationVarContext.class,0);
		}
		public DeclarationArrayContext declarationArray() {
			return getRuleContext(DeclarationArrayContext.class,0);
		}
		public DeclarationMatrixContext declarationMatrix() {
			return getRuleContext(DeclarationMatrixContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				declarationVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				declarationArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				declarationMatrix();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode ATTRIBUTION() { return getToken(EmoteslangParser.ATTRIBUTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterDeclarationVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitDeclarationVar(this);
		}
	}

	public final DeclarationVarContext declarationVar() throws RecognitionException {
		DeclarationVarContext _localctx = new DeclarationVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(110);
				match(ATTRIBUTION);
				setState(111);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationMatrixContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public List<TerminalNode> LEFT_SBRACKET() { return getTokens(EmoteslangParser.LEFT_SBRACKET); }
		public TerminalNode LEFT_SBRACKET(int i) {
			return getToken(EmoteslangParser.LEFT_SBRACKET, i);
		}
		public List<TerminalNode> RIGHT_SBRACKET() { return getTokens(EmoteslangParser.RIGHT_SBRACKET); }
		public TerminalNode RIGHT_SBRACKET(int i) {
			return getToken(EmoteslangParser.RIGHT_SBRACKET, i);
		}
		public MatrixLineContext matrixLine() {
			return getRuleContext(MatrixLineContext.class,0);
		}
		public MatrixColContext matrixCol() {
			return getRuleContext(MatrixColContext.class,0);
		}
		public TerminalNode ATTRIBUTION() { return getToken(EmoteslangParser.ATTRIBUTION, 0); }
		public InitializeMatrixContext initializeMatrix() {
			return getRuleContext(InitializeMatrixContext.class,0);
		}
		public DeclarationMatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationMatrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterDeclarationMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitDeclarationMatrix(this);
		}
	}

	public final DeclarationMatrixContext declarationMatrix() throws RecognitionException {
		DeclarationMatrixContext _localctx = new DeclarationMatrixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationMatrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(LEFT_SBRACKET);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==INT) {
				{
				setState(116);
				matrixLine();
				}
			}

			setState(119);
			match(RIGHT_SBRACKET);
			setState(120);
			match(LEFT_SBRACKET);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==INT) {
				{
				setState(121);
				matrixCol();
				}
			}

			setState(124);
			match(RIGHT_SBRACKET);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(125);
				match(ATTRIBUTION);
				setState(126);
				initializeMatrix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializeMatrixContext extends ParserRuleContext {
		public TerminalNode LEFT_CBRACKETS() { return getToken(EmoteslangParser.LEFT_CBRACKETS, 0); }
		public List<InitializeArrayContext> initializeArray() {
			return getRuleContexts(InitializeArrayContext.class);
		}
		public InitializeArrayContext initializeArray(int i) {
			return getRuleContext(InitializeArrayContext.class,i);
		}
		public TerminalNode RIGHT_CBRACKETS() { return getToken(EmoteslangParser.RIGHT_CBRACKETS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EmoteslangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EmoteslangParser.COMMA, i);
		}
		public InitializeMatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeMatrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterInitializeMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitInitializeMatrix(this);
		}
	}

	public final InitializeMatrixContext initializeMatrix() throws RecognitionException {
		InitializeMatrixContext _localctx = new InitializeMatrixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initializeMatrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(LEFT_CBRACKETS);
			setState(130);
			initializeArray();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				initializeArray();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(RIGHT_CBRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode LEFT_SBRACKET() { return getToken(EmoteslangParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(EmoteslangParser.RIGHT_SBRACKET, 0); }
		public ArraySizeContext arraySize() {
			return getRuleContext(ArraySizeContext.class,0);
		}
		public TerminalNode ATTRIBUTION() { return getToken(EmoteslangParser.ATTRIBUTION, 0); }
		public InitializeArrayContext initializeArray() {
			return getRuleContext(InitializeArrayContext.class,0);
		}
		public DeclarationArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterDeclarationArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitDeclarationArray(this);
		}
	}

	public final DeclarationArrayContext declarationArray() throws RecognitionException {
		DeclarationArrayContext _localctx = new DeclarationArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarationArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(LEFT_SBRACKET);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==INT) {
				{
				setState(142);
				arraySize();
				}
			}

			setState(145);
			match(RIGHT_SBRACKET);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(146);
				match(ATTRIBUTION);
				setState(147);
				initializeArray();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializeArrayContext extends ParserRuleContext {
		public TerminalNode LEFT_CBRACKETS() { return getToken(EmoteslangParser.LEFT_CBRACKETS, 0); }
		public TerminalNode RIGHT_CBRACKETS() { return getToken(EmoteslangParser.RIGHT_CBRACKETS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InitializeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterInitializeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitInitializeArray(this);
		}
	}

	public final InitializeArrayContext initializeArray() throws RecognitionException {
		InitializeArrayContext _localctx = new InitializeArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initializeArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(LEFT_CBRACKETS);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (UN_ADD - 26)) | (1L << (UN_SUB - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (HEXA - 26)))) != 0)) {
				{
				setState(151);
				expressionList();
				}
			}

			setState(154);
			match(RIGHT_CBRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixLineContext extends ParserRuleContext {
		public ArraySizeContext arraySize() {
			return getRuleContext(ArraySizeContext.class,0);
		}
		public MatrixLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterMatrixLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitMatrixLine(this);
		}
	}

	public final MatrixLineContext matrixLine() throws RecognitionException {
		MatrixLineContext _localctx = new MatrixLineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matrixLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			arraySize();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixColContext extends ParserRuleContext {
		public ArraySizeContext arraySize() {
			return getRuleContext(ArraySizeContext.class,0);
		}
		public MatrixColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixCol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterMatrixCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitMatrixCol(this);
		}
	}

	public final MatrixColContext matrixCol() throws RecognitionException {
		MatrixColContext _localctx = new MatrixColContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_matrixCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			arraySize();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraySizeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EmoteslangParser.INT, 0); }
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public ArraySizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterArraySize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitArraySize(this);
		}
	}

	public final ArraySizeContext arraySize() throws RecognitionException {
		ArraySizeContext _localctx = new ArraySizeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arraySize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayIndexContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(EmoteslangParser.LEFT_SBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(EmoteslangParser.RIGHT_SBRACKET, 0); }
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitArrayIndex(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LEFT_SBRACKET);
			setState(163);
			expression(0);
			setState(164);
			match(RIGHT_SBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(EmoteslangParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public TerminalNode LEFT_CBRACKETS() { return getToken(EmoteslangParser.LEFT_CBRACKETS, 0); }
		public TerminalNode RIGHT_CBRACKETS() { return getToken(EmoteslangParser.RIGHT_CBRACKETS, 0); }
		public TypeWithVoidContext typeWithVoid() {
			return getRuleContext(TypeWithVoidContext.class,0);
		}
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(FUNCTION);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << TP_VOID))) != 0)) {
				{
				setState(167);
				typeWithVoid();
				}
			}

			setState(170);
			match(ID);
			setState(171);
			match(LEFT_PARENTESIS);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL))) != 0)) {
				{
				setState(172);
				parametersList();
				}
			}

			setState(175);
			match(RIGHT_PARENTESIS);
			setState(176);
			match(LEFT_CBRACKETS);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << UN_ADD) | (1L << UN_SUB) | (1L << NOT) | (1L << BIT_NOT) | (1L << ADD) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (HEXA - 65)))) != 0)) {
				{
				{
				setState(177);
				commands();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(RIGHT_CBRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EmoteslangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EmoteslangParser.COMMA, i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitParametersList(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			parameter();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186);
				match(COMMA);
				setState(187);
				parameter();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode BIT_AND() { return getToken(EmoteslangParser.BIT_AND, 0); }
		public ParamArrayContext paramArray() {
			return getRuleContext(ParamArrayContext.class,0);
		}
		public ParamMatrixContext paramMatrix() {
			return getRuleContext(ParamMatrixContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			type();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_AND) {
				{
				setState(194);
				match(BIT_AND);
				}
			}

			setState(197);
			match(ID);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(198);
				paramArray();
				}
				break;
			case 2:
				{
				setState(199);
				paramMatrix();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamArrayContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(EmoteslangParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(EmoteslangParser.RIGHT_SBRACKET, 0); }
		public ParamArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterParamArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitParamArray(this);
		}
	}

	public final ParamArrayContext paramArray() throws RecognitionException {
		ParamArrayContext _localctx = new ParamArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LEFT_SBRACKET);
			setState(203);
			match(RIGHT_SBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamMatrixContext extends ParserRuleContext {
		public List<TerminalNode> LEFT_SBRACKET() { return getTokens(EmoteslangParser.LEFT_SBRACKET); }
		public TerminalNode LEFT_SBRACKET(int i) {
			return getToken(EmoteslangParser.LEFT_SBRACKET, i);
		}
		public List<TerminalNode> RIGHT_SBRACKET() { return getTokens(EmoteslangParser.RIGHT_SBRACKET); }
		public TerminalNode RIGHT_SBRACKET(int i) {
			return getToken(EmoteslangParser.RIGHT_SBRACKET, i);
		}
		public ParamMatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramMatrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterParamMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitParamMatrix(this);
		}
	}

	public final ParamMatrixContext paramMatrix() throws RecognitionException {
		ParamMatrixContext _localctx = new ParamMatrixContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_paramMatrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(LEFT_SBRACKET);
			setState(206);
			match(RIGHT_SBRACKET);
			setState(207);
			match(LEFT_SBRACKET);
			setState(208);
			match(RIGHT_SBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputAndOutputContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public ParametersCallContext parametersCall() {
			return getRuleContext(ParametersCallContext.class,0);
		}
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public TerminalNode READ() { return getToken(EmoteslangParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(EmoteslangParser.WRITE, 0); }
		public InputAndOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputAndOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterInputAndOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitInputAndOutput(this);
		}
	}

	public final InputAndOutputContext inputAndOutput() throws RecognitionException {
		InputAndOutputContext _localctx = new InputAndOutputContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inputAndOutput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==READ || _la==WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
			match(LEFT_PARENTESIS);
			setState(212);
			parametersCall();
			setState(213);
			match(RIGHT_PARENTESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersCallContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EmoteslangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EmoteslangParser.COMMA, i);
		}
		public ParametersCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterParametersCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitParametersCall(this);
		}
	}

	public final ParametersCallContext parametersCall() throws RecognitionException {
		ParametersCallContext _localctx = new ParametersCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parametersCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (UN_ADD - 26)) | (1L << (UN_SUB - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (HEXA - 26)))) != 0)) {
				{
				setState(215);
				expression(0);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(216);
					match(COMMA);
					setState(217);
					expression(0);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandsContext extends ParserRuleContext {
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_commands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case SWITCH:
			case FOR:
			case WHILE:
			case DO:
				{
				setState(225);
				conditionals();
				}
				break;
			case RETURN:
			case READ:
			case WRITE:
			case BREAK:
			case TP_INT:
			case TP_BIN:
			case TP_HEX:
			case TP_DOUBLE:
			case TP_FLOAT:
			case TP_CHAR:
			case TP_STRING:
			case TP_BOOL:
			case BOOLEAN:
			case UN_ADD:
			case UN_SUB:
			case NOT:
			case BIT_NOT:
			case ADD:
			case SUB:
			case LEFT_PARENTESIS:
			case ID:
			case INT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case STRING:
			case HEXA:
				{
				setState(226);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ReturndesContext returndes() {
			return getRuleContext(ReturndesContext.class,0);
		}
		public BreakdesContext breakdes() {
			return getRuleContext(BreakdesContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputAndOutputContext inputAndOutput() {
			return getRuleContext(InputAndOutputContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(EmoteslangParser.DOT_COMMA, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(229);
				statements();
				}
				break;
			case 2:
				{
				setState(230);
				returndes();
				}
				break;
			case 3:
				{
				setState(231);
				breakdes();
				}
				break;
			case 4:
				{
				setState(232);
				attribution();
				}
				break;
			case 5:
				{
				setState(233);
				expression(0);
				}
				break;
			case 6:
				{
				setState(234);
				inputAndOutput();
				}
				break;
			}
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_COMMA) {
				{
				setState(237);
				match(DOT_COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalsContext extends ParserRuleContext {
		public IfdesContext ifdes() {
			return getRuleContext(IfdesContext.class,0);
		}
		public WhiledesContext whiledes() {
			return getRuleContext(WhiledesContext.class,0);
		}
		public DoWhileContext doWhile() {
			return getRuleContext(DoWhileContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(EmoteslangParser.DOT_COMMA, 0); }
		public FordesContext fordes() {
			return getRuleContext(FordesContext.class,0);
		}
		public SwitchdesContext switchdes() {
			return getRuleContext(SwitchdesContext.class,0);
		}
		public ConditionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterConditionals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitConditionals(this);
		}
	}

	public final ConditionalsContext conditionals() throws RecognitionException {
		ConditionalsContext _localctx = new ConditionalsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionals);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				ifdes();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				whiledes();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				doWhile();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_COMMA) {
					{
					setState(243);
					match(DOT_COMMA);
					}
				}

				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				fordes();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				switchdes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfdesContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EmoteslangParser.IF, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public List<CommandListContext> commandList() {
			return getRuleContexts(CommandListContext.class);
		}
		public CommandListContext commandList(int i) {
			return getRuleContext(CommandListContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(EmoteslangParser.ELSE, 0); }
		public IfdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterIfdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitIfdes(this);
		}
	}

	public final IfdesContext ifdes() throws RecognitionException {
		IfdesContext _localctx = new IfdesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(IF);
			setState(251);
			match(LEFT_PARENTESIS);
			setState(252);
			expression(0);
			setState(253);
			match(RIGHT_PARENTESIS);
			setState(254);
			commandList();
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(255);
				match(ELSE);
				setState(256);
				commandList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhiledesContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(EmoteslangParser.WHILE, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public WhiledesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiledes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterWhiledes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitWhiledes(this);
		}
	}

	public final WhiledesContext whiledes() throws RecognitionException {
		WhiledesContext _localctx = new WhiledesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whiledes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(WHILE);
			setState(260);
			match(LEFT_PARENTESIS);
			setState(261);
			expression(0);
			setState(262);
			match(RIGHT_PARENTESIS);
			setState(263);
			commandList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(EmoteslangParser.DO, 0); }
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(EmoteslangParser.WHILE, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitDoWhile(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(DO);
			setState(266);
			commandList();
			setState(267);
			match(WHILE);
			setState(268);
			match(LEFT_PARENTESIS);
			setState(269);
			expression(0);
			setState(270);
			match(RIGHT_PARENTESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FordesContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(EmoteslangParser.FOR, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public List<TerminalNode> DOT_COMMA() { return getTokens(EmoteslangParser.DOT_COMMA); }
		public TerminalNode DOT_COMMA(int i) {
			return getToken(EmoteslangParser.DOT_COMMA, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IncrementForContext incrementFor() {
			return getRuleContext(IncrementForContext.class,0);
		}
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public InitializeForContext initializeFor() {
			return getRuleContext(InitializeForContext.class,0);
		}
		public FordesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fordes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterFordes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitFordes(this);
		}
	}

	public final FordesContext fordes() throws RecognitionException {
		FordesContext _localctx = new FordesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fordes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(FOR);
			setState(273);
			match(LEFT_PARENTESIS);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (TP_INT - 17)) | (1L << (TP_BIN - 17)) | (1L << (TP_HEX - 17)) | (1L << (TP_DOUBLE - 17)) | (1L << (TP_FLOAT - 17)) | (1L << (TP_CHAR - 17)) | (1L << (TP_STRING - 17)) | (1L << (TP_BOOL - 17)) | (1L << (BOOLEAN - 17)) | (1L << (UN_ADD - 17)) | (1L << (UN_SUB - 17)) | (1L << (NOT - 17)) | (1L << (BIT_NOT - 17)) | (1L << (ADD - 17)) | (1L << (SUB - 17)) | (1L << (LEFT_PARENTESIS - 17)) | (1L << (ID - 17)) | (1L << (INT - 17)) | (1L << (DOUBLE - 17)) | (1L << (FLOAT - 17)) | (1L << (CHAR - 17)) | (1L << (STRING - 17)) | (1L << (HEXA - 17)))) != 0)) {
				{
				setState(274);
				initializeFor();
				}
			}

			setState(277);
			match(DOT_COMMA);
			setState(278);
			condition();
			setState(279);
			match(DOT_COMMA);
			setState(280);
			incrementFor();
			setState(281);
			match(RIGHT_PARENTESIS);
			setState(282);
			commandList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchdesContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(EmoteslangParser.SWITCH, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public TerminalNode LEFT_CBRACKETS() { return getToken(EmoteslangParser.LEFT_CBRACKETS, 0); }
		public TerminalNode RIGHT_CBRACKETS() { return getToken(EmoteslangParser.RIGHT_CBRACKETS, 0); }
		public List<CasedesContext> casedes() {
			return getRuleContexts(CasedesContext.class);
		}
		public CasedesContext casedes(int i) {
			return getRuleContext(CasedesContext.class,i);
		}
		public DefaultdesContext defaultdes() {
			return getRuleContext(DefaultdesContext.class,0);
		}
		public SwitchdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterSwitchdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitSwitchdes(this);
		}
	}

	public final SwitchdesContext switchdes() throws RecognitionException {
		SwitchdesContext _localctx = new SwitchdesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switchdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(SWITCH);
			setState(285);
			match(LEFT_PARENTESIS);
			setState(286);
			expression(0);
			setState(287);
			match(RIGHT_PARENTESIS);
			setState(288);
			match(LEFT_CBRACKETS);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(289);
				casedes();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(295);
				defaultdes();
				}
			}

			setState(298);
			match(RIGHT_CBRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasedesContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(EmoteslangParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLE_DOT() { return getToken(EmoteslangParser.DOUBLE_DOT, 0); }
		public TerminalNode LEFT_CBRACKETS() { return getToken(EmoteslangParser.LEFT_CBRACKETS, 0); }
		public TerminalNode RIGHT_CBRACKETS() { return getToken(EmoteslangParser.RIGHT_CBRACKETS, 0); }
		public BreakdesContext breakdes() {
			return getRuleContext(BreakdesContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public CasedesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casedes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterCasedes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitCasedes(this);
		}
	}

	public final CasedesContext casedes() throws RecognitionException {
		CasedesContext _localctx = new CasedesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_casedes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(CASE);
			setState(301);
			expression(0);
			setState(302);
			match(DOUBLE_DOT);
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case READ:
			case WRITE:
			case IF:
			case SWITCH:
			case CASE:
			case BREAK:
			case DEFAULT:
			case FOR:
			case WHILE:
			case DO:
			case TP_INT:
			case TP_BIN:
			case TP_HEX:
			case TP_DOUBLE:
			case TP_FLOAT:
			case TP_CHAR:
			case TP_STRING:
			case TP_BOOL:
			case BOOLEAN:
			case UN_ADD:
			case UN_SUB:
			case NOT:
			case BIT_NOT:
			case ADD:
			case SUB:
			case LEFT_PARENTESIS:
			case RIGHT_CBRACKETS:
			case ID:
			case INT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case STRING:
			case HEXA:
				{
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						commands();
						}
						} 
					}
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case LEFT_CBRACKETS:
				{
				setState(309);
				match(LEFT_CBRACKETS);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << UN_ADD) | (1L << UN_SUB) | (1L << NOT) | (1L << BIT_NOT) | (1L << ADD) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (HEXA - 65)))) != 0)) {
					{
					{
					setState(310);
					commands();
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(316);
				match(RIGHT_CBRACKETS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(319);
				breakdes();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultdesContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(EmoteslangParser.DEFAULT, 0); }
		public TerminalNode DOUBLE_DOT() { return getToken(EmoteslangParser.DOUBLE_DOT, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public BreakdesContext breakdes() {
			return getRuleContext(BreakdesContext.class,0);
		}
		public DefaultdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterDefaultdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitDefaultdes(this);
		}
	}

	public final DefaultdesContext defaultdes() throws RecognitionException {
		DefaultdesContext _localctx = new DefaultdesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_defaultdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(DEFAULT);
			setState(323);
			match(DOUBLE_DOT);
			setState(324);
			commands();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(325);
				breakdes();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakdesContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(EmoteslangParser.BREAK, 0); }
		public BreakdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterBreakdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitBreakdes(this);
		}
	}

	public final BreakdesContext breakdes() throws RecognitionException {
		BreakdesContext _localctx = new BreakdesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_breakdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturndesContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(EmoteslangParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturndesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returndes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterReturndes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitReturndes(this);
		}
	}

	public final ReturndesContext returndes() throws RecognitionException {
		ReturndesContext _localctx = new ReturndesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_returndes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(RETURN);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(331);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandListContext extends ParserRuleContext {
		public TerminalNode LEFT_CBRACKETS() { return getToken(EmoteslangParser.LEFT_CBRACKETS, 0); }
		public TerminalNode RIGHT_CBRACKETS() { return getToken(EmoteslangParser.RIGHT_CBRACKETS, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public CommandListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterCommandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitCommandList(this);
		}
	}

	public final CommandListContext commandList() throws RecognitionException {
		CommandListContext _localctx = new CommandListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_commandList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CBRACKETS:
				{
				setState(334);
				match(LEFT_CBRACKETS);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << UN_ADD) | (1L << UN_SUB) | (1L << NOT) | (1L << BIT_NOT) | (1L << ADD) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (HEXA - 65)))) != 0)) {
					{
					{
					setState(335);
					commands();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				match(RIGHT_CBRACKETS);
				}
				break;
			case RETURN:
			case READ:
			case WRITE:
			case IF:
			case SWITCH:
			case BREAK:
			case FOR:
			case WHILE:
			case DO:
			case TP_INT:
			case TP_BIN:
			case TP_HEX:
			case TP_DOUBLE:
			case TP_FLOAT:
			case TP_CHAR:
			case TP_STRING:
			case TP_BOOL:
			case BOOLEAN:
			case UN_ADD:
			case UN_SUB:
			case NOT:
			case BIT_NOT:
			case ADD:
			case SUB:
			case LEFT_PARENTESIS:
			case ID:
			case INT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case STRING:
			case HEXA:
				{
				setState(342);
				commands();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializeForContext extends ParserRuleContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public InitializeForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterInitializeFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitInitializeFor(this);
		}
	}

	public final InitializeForContext initializeFor() throws RecognitionException {
		InitializeForContext _localctx = new InitializeForContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_initializeFor);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				attribution();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementForContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public IncrementForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterIncrementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitIncrementFor(this);
		}
	}

	public final IncrementForContext incrementFor() throws RecognitionException {
		IncrementForContext _localctx = new IncrementForContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_incrementFor);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				attribution();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ATTRIBUTION() { return getToken(EmoteslangParser.ATTRIBUTION, 0); }
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitAttribution(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			expression(0);
			setState(357);
			match(ATTRIBUTION);
			setState(358);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<ArrayIndexContext> arrayIndex() {
			return getRuleContexts(ArrayIndexContext.class);
		}
		public ArrayIndexContext arrayIndex(int i) {
			return getRuleContext(ArrayIndexContext.class,i);
		}
		public TerminalNode ADD() { return getToken(EmoteslangParser.ADD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(EmoteslangParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(EmoteslangParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(EmoteslangParser.BIT_NOT, 0); }
		public TerminalNode UN_ADD() { return getToken(EmoteslangParser.UN_ADD, 0); }
		public TerminalNode UN_SUB() { return getToken(EmoteslangParser.UN_SUB, 0); }
		public TerminalNode INT() { return getToken(EmoteslangParser.INT, 0); }
		public TerminalNode HEXA() { return getToken(EmoteslangParser.HEXA, 0); }
		public TerminalNode DOUBLE() { return getToken(EmoteslangParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(EmoteslangParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(EmoteslangParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(EmoteslangParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(EmoteslangParser.STRING, 0); }
		public TerminalNode MULT() { return getToken(EmoteslangParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(EmoteslangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(EmoteslangParser.MOD, 0); }
		public TerminalNode EQUALS() { return getToken(EmoteslangParser.EQUALS, 0); }
		public TerminalNode DIFFERENT() { return getToken(EmoteslangParser.DIFFERENT, 0); }
		public TerminalNode BIGGERT() { return getToken(EmoteslangParser.BIGGERT, 0); }
		public TerminalNode SMALLERT() { return getToken(EmoteslangParser.SMALLERT, 0); }
		public TerminalNode SMALLERE() { return getToken(EmoteslangParser.SMALLERE, 0); }
		public TerminalNode BIGGERE() { return getToken(EmoteslangParser.BIGGERE, 0); }
		public TerminalNode AND() { return getToken(EmoteslangParser.AND, 0); }
		public TerminalNode OR() { return getToken(EmoteslangParser.OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(EmoteslangParser.BIT_XOR, 0); }
		public TerminalNode BIT_LS() { return getToken(EmoteslangParser.BIT_LS, 0); }
		public TerminalNode BIT_RS() { return getToken(EmoteslangParser.BIT_RS, 0); }
		public TerminalNode BIT_AND() { return getToken(EmoteslangParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(EmoteslangParser.BIT_OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(361);
				match(ID);
				setState(362);
				match(LEFT_PARENTESIS);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (UN_ADD - 26)) | (1L << (UN_SUB - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (HEXA - 26)))) != 0)) {
					{
					setState(363);
					expressionList();
					}
				}

				setState(366);
				match(RIGHT_PARENTESIS);
				}
				break;
			case 2:
				{
				setState(367);
				match(ID);
				setState(368);
				arrayIndex();
				}
				break;
			case 3:
				{
				setState(369);
				match(ID);
				setState(370);
				arrayIndex();
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(371);
					arrayIndex();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(374);
				match(ADD);
				setState(375);
				expression(34);
				}
				break;
			case 5:
				{
				setState(376);
				match(SUB);
				setState(377);
				expression(33);
				}
				break;
			case 6:
				{
				setState(378);
				match(NOT);
				setState(379);
				expression(32);
				}
				break;
			case 7:
				{
				setState(380);
				match(BIT_NOT);
				setState(381);
				expression(31);
				}
				break;
			case 8:
				{
				setState(382);
				match(ID);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(383);
					arrayIndex();
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						setState(384);
						arrayIndex();
						}
					}

					}
				}

				setState(389);
				match(UN_ADD);
				}
				break;
			case 9:
				{
				setState(390);
				match(ID);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(391);
					arrayIndex();
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						setState(392);
						arrayIndex();
						}
					}

					}
				}

				setState(397);
				match(UN_SUB);
				}
				break;
			case 10:
				{
				setState(398);
				match(UN_ADD);
				setState(399);
				match(ID);
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(400);
					arrayIndex();
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(401);
						arrayIndex();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(406);
				match(UN_SUB);
				setState(407);
				match(ID);
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(408);
					arrayIndex();
					setState(410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(409);
						arrayIndex();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(414);
				match(ID);
				}
				break;
			case 13:
				{
				setState(415);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==HEXA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 14:
				{
				setState(416);
				match(DOUBLE);
				}
				break;
			case 15:
				{
				setState(417);
				match(FLOAT);
				}
				break;
			case 16:
				{
				setState(418);
				match(BOOLEAN);
				}
				break;
			case 17:
				{
				setState(419);
				match(CHAR);
				}
				break;
			case 18:
				{
				setState(420);
				match(STRING);
				}
				break;
			case 19:
				{
				setState(421);
				match(LEFT_PARENTESIS);
				setState(422);
				expression(0);
				setState(423);
				match(RIGHT_PARENTESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(481);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(427);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(428);
						match(MULT);
						setState(429);
						expression(27);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(430);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(431);
						match(DIV);
						setState(432);
						expression(26);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(433);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(434);
						match(MOD);
						setState(435);
						expression(25);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(436);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(437);
						match(ADD);
						setState(438);
						expression(24);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(439);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(440);
						match(SUB);
						setState(441);
						expression(23);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(442);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(443);
						match(EQUALS);
						setState(444);
						expression(22);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(445);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(446);
						match(DIFFERENT);
						setState(447);
						expression(21);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(448);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(449);
						match(BIGGERT);
						setState(450);
						expression(20);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(451);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(452);
						match(SMALLERT);
						setState(453);
						expression(19);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(454);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(455);
						match(SMALLERE);
						setState(456);
						expression(18);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(457);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(458);
						match(BIGGERE);
						setState(459);
						expression(17);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(460);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(461);
						match(AND);
						setState(462);
						expression(16);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(463);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(464);
						match(OR);
						setState(465);
						expression(15);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(466);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(467);
						match(BIT_XOR);
						setState(468);
						expression(14);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(469);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(470);
						match(BIT_LS);
						setState(471);
						expression(13);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(472);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(473);
						match(BIT_RS);
						setState(474);
						expression(12);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(475);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(476);
						match(BIT_AND);
						setState(477);
						expression(11);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(478);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(479);
						match(BIT_OR);
						setState(480);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeWithVoidContext extends ParserRuleContext {
		public TerminalNode TP_VOID() { return getToken(EmoteslangParser.TP_VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeWithVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeWithVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterTypeWithVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitTypeWithVoid(this);
		}
	}

	public final TypeWithVoidContext typeWithVoid() throws RecognitionException {
		TypeWithVoidContext _localctx = new TypeWithVoidContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeWithVoid);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TP_VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(TP_VOID);
				}
				break;
			case TP_INT:
			case TP_BIN:
			case TP_HEX:
			case TP_DOUBLE:
			case TP_FLOAT:
			case TP_CHAR:
			case TP_STRING:
			case TP_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TP_INT() { return getToken(EmoteslangParser.TP_INT, 0); }
		public TerminalNode TP_BIN() { return getToken(EmoteslangParser.TP_BIN, 0); }
		public TerminalNode TP_HEX() { return getToken(EmoteslangParser.TP_HEX, 0); }
		public TerminalNode TP_DOUBLE() { return getToken(EmoteslangParser.TP_DOUBLE, 0); }
		public TerminalNode TP_FLOAT() { return getToken(EmoteslangParser.TP_FLOAT, 0); }
		public TerminalNode TP_CHAR() { return getToken(EmoteslangParser.TP_CHAR, 0); }
		public TerminalNode TP_STRING() { return getToken(EmoteslangParser.TP_STRING, 0); }
		public TerminalNode TP_BOOL() { return getToken(EmoteslangParser.TP_BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EmoteslangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EmoteslangParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(492);
			expression(0);
			}
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(493);
				match(COMMA);
				{
				setState(494);
				expression(0);
				}
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 26);
		case 1:
			return precpred(_ctx, 25);
		case 2:
			return precpred(_ctx, 24);
		case 3:
			return precpred(_ctx, 23);
		case 4:
			return precpred(_ctx, 22);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 13);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 10);
		case 17:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u01f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3c\n\3\f\3\16"+
		"\3f\13\3\3\3\5\3i\n\3\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\5\5s\n\5\3\6\3"+
		"\6\3\6\5\6x\n\6\3\6\3\6\3\6\5\6}\n\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7"+
		"\3\7\3\7\7\7\u0088\n\7\f\7\16\7\u008b\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u0092"+
		"\n\b\3\b\3\b\3\b\5\b\u0097\n\b\3\t\3\t\5\t\u009b\n\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00ab\n\16\3\16\3\16\3"+
		"\16\5\16\u00b0\n\16\3\16\3\16\3\16\7\16\u00b5\n\16\f\16\16\16\u00b8\13"+
		"\16\3\16\3\16\3\17\3\17\3\17\7\17\u00bf\n\17\f\17\16\17\u00c2\13\17\3"+
		"\20\3\20\5\20\u00c6\n\20\3\20\3\20\3\20\5\20\u00cb\n\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24"+
		"\u00dd\n\24\f\24\16\24\u00e0\13\24\5\24\u00e2\n\24\3\25\3\25\5\25\u00e6"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ee\n\26\3\26\5\26\u00f1\n"+
		"\26\3\27\3\27\3\27\3\27\5\27\u00f7\n\27\3\27\3\27\5\27\u00fb\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0104\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u0116\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u0125\n\34\f\34\16\34\u0128\13\34\3\34\5\34\u012b\n\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\7\35\u0133\n\35\f\35\16\35\u0136\13\35\3\35\3\35\7\35"+
		"\u013a\n\35\f\35\16\35\u013d\13\35\3\35\5\35\u0140\n\35\3\35\5\35\u0143"+
		"\n\35\3\36\3\36\3\36\3\36\5\36\u0149\n\36\3\37\3\37\3 \3 \5 \u014f\n "+
		"\3!\3!\7!\u0153\n!\f!\16!\u0156\13!\3!\3!\5!\u015a\n!\3\"\3\"\3\"\5\""+
		"\u015f\n\"\3#\3#\5#\u0163\n#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\5&\u016f\n"+
		"&\3&\3&\3&\3&\3&\3&\5&\u0177\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0184"+
		"\n&\5&\u0186\n&\3&\3&\3&\3&\5&\u018c\n&\5&\u018e\n&\3&\3&\3&\3&\3&\5&"+
		"\u0195\n&\5&\u0197\n&\3&\3&\3&\3&\5&\u019d\n&\5&\u019f\n&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u01ac\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u01e4\n&"+
		"\f&\16&\u01e7\13&\3\'\3\'\5\'\u01eb\n\'\3(\3(\3)\3)\3)\7)\u01f2\n)\f)"+
		"\16)\u01f5\13)\3)\2\3J*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNP\2\6\3\2CD\3\2\7\b\4\2DDJJ\3\2\23\32\2\u0230"+
		"\2R\3\2\2\2\4^\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2\nt\3\2\2\2\f\u0083\3\2\2"+
		"\2\16\u008e\3\2\2\2\20\u0098\3\2\2\2\22\u009e\3\2\2\2\24\u00a0\3\2\2\2"+
		"\26\u00a2\3\2\2\2\30\u00a4\3\2\2\2\32\u00a8\3\2\2\2\34\u00bb\3\2\2\2\36"+
		"\u00c3\3\2\2\2 \u00cc\3\2\2\2\"\u00cf\3\2\2\2$\u00d4\3\2\2\2&\u00e1\3"+
		"\2\2\2(\u00e5\3\2\2\2*\u00ed\3\2\2\2,\u00fa\3\2\2\2.\u00fc\3\2\2\2\60"+
		"\u0105\3\2\2\2\62\u010b\3\2\2\2\64\u0112\3\2\2\2\66\u011e\3\2\2\28\u012e"+
		"\3\2\2\2:\u0144\3\2\2\2<\u014a\3\2\2\2>\u014c\3\2\2\2@\u0159\3\2\2\2B"+
		"\u015e\3\2\2\2D\u0162\3\2\2\2F\u0164\3\2\2\2H\u0166\3\2\2\2J\u01ab\3\2"+
		"\2\2L\u01ea\3\2\2\2N\u01ec\3\2\2\2P\u01ee\3\2\2\2RS\7\3\2\2SX\7>\2\2T"+
		"W\5\4\3\2UW\5\32\16\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2Y[\3\2\2\2ZX\3\2\2\2[\\\7?\2\2\\]\7\4\2\2]\3\3\2\2\2^_\5N(\2_d\5\6\4"+
		"\2`a\7\67\2\2ac\5\6\4\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2gi\78\2\2hg\3\2\2\2hi\3\2\2\2i\5\3\2\2\2jn\5\b\5\2kn\5\16"+
		"\b\2ln\5\n\6\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\7\3\2\2\2or\7C\2\2pq\7\65"+
		"\2\2qs\5J&\2rp\3\2\2\2rs\3\2\2\2s\t\3\2\2\2tu\7C\2\2uw\7:\2\2vx\5\22\n"+
		"\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7;\2\2z|\7:\2\2{}\5\24\13\2|{\3\2\2"+
		"\2|}\3\2\2\2}~\3\2\2\2~\u0081\7;\2\2\177\u0080\7\65\2\2\u0080\u0082\5"+
		"\f\7\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\13\3\2\2\2\u0083\u0084"+
		"\7>\2\2\u0084\u0089\5\20\t\2\u0085\u0086\7\67\2\2\u0086\u0088\5\20\t\2"+
		"\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7?\2\2\u008d"+
		"\r\3\2\2\2\u008e\u008f\7C\2\2\u008f\u0091\7:\2\2\u0090\u0092\5\26\f\2"+
		"\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096"+
		"\7;\2\2\u0094\u0095\7\65\2\2\u0095\u0097\5\20\t\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\17\3\2\2\2\u0098\u009a\7>\2\2\u0099\u009b\5"+
		"P)\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7?\2\2\u009d\21\3\2\2\2\u009e\u009f\5\26\f\2\u009f\23\3\2\2\2\u00a0"+
		"\u00a1\5\26\f\2\u00a1\25\3\2\2\2\u00a2\u00a3\t\2\2\2\u00a3\27\3\2\2\2"+
		"\u00a4\u00a5\7:\2\2\u00a5\u00a6\5J&\2\u00a6\u00a7\7;\2\2\u00a7\31\3\2"+
		"\2\2\u00a8\u00aa\7\6\2\2\u00a9\u00ab\5L\'\2\u00aa\u00a9\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7C\2\2\u00ad\u00af\7<\2"+
		"\2\u00ae\u00b0\5\34\17\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\u00b6\7>\2\2\u00b3\u00b5\5(\25"+
		"\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba"+
		"\33\3\2\2\2\u00bb\u00c0\5\36\20\2\u00bc\u00bd\7\67\2\2\u00bd\u00bf\5\36"+
		"\20\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\35\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5N(\2"+
		"\u00c4\u00c6\7*\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00ca\7C\2\2\u00c8\u00cb\5 \21\2\u00c9\u00cb\5\"\22\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\37\3\2\2"+
		"\2\u00cc\u00cd\7:\2\2\u00cd\u00ce\7;\2\2\u00ce!\3\2\2\2\u00cf\u00d0\7"+
		":\2\2\u00d0\u00d1\7;\2\2\u00d1\u00d2\7:\2\2\u00d2\u00d3\7;\2\2\u00d3#"+
		"\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5\u00d6\7<\2\2\u00d6\u00d7\5&\24\2\u00d7"+
		"\u00d8\7=\2\2\u00d8%\3\2\2\2\u00d9\u00de\5J&\2\u00da\u00db\7\67\2\2\u00db"+
		"\u00dd\5J&\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2"+
		"\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00d9"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\'\3\2\2\2\u00e3\u00e6\5,\27\2\u00e4"+
		"\u00e6\5*\26\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6)\3\2\2\2"+
		"\u00e7\u00ee\5\4\3\2\u00e8\u00ee\5> \2\u00e9\u00ee\5<\37\2\u00ea\u00ee"+
		"\5H%\2\u00eb\u00ee\5J&\2\u00ec\u00ee\5$\23\2\u00ed\u00e7\3\2\2\2\u00ed"+
		"\u00e8\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1\78\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1+\3\2\2\2\u00f2\u00fb\5.\30\2"+
		"\u00f3\u00fb\5\60\31\2\u00f4\u00f6\5\62\32\2\u00f5\u00f7\78\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00fb\5\64"+
		"\33\2\u00f9\u00fb\5\66\34\2\u00fa\u00f2\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa"+
		"\u00f4\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb-\3\2\2\2"+
		"\u00fc\u00fd\7\t\2\2\u00fd\u00fe\7<\2\2\u00fe\u00ff\5J&\2\u00ff\u0100"+
		"\7=\2\2\u0100\u0103\5@!\2\u0101\u0102\7\n\2\2\u0102\u0104\5@!\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104/\3\2\2\2\u0105\u0106\7\21\2\2"+
		"\u0106\u0107\7<\2\2\u0107\u0108\5J&\2\u0108\u0109\7=\2\2\u0109\u010a\5"+
		"@!\2\u010a\61\3\2\2\2\u010b\u010c\7\22\2\2\u010c\u010d\5@!\2\u010d\u010e"+
		"\7\21\2\2\u010e\u010f\7<\2\2\u010f\u0110\5J&\2\u0110\u0111\7=\2\2\u0111"+
		"\63\3\2\2\2\u0112\u0113\7\20\2\2\u0113\u0115\7<\2\2\u0114\u0116\5B\"\2"+
		"\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\78\2\2\u0118\u0119\5F$\2\u0119\u011a\78\2\2\u011a\u011b\5D#\2\u011b\u011c"+
		"\7=\2\2\u011c\u011d\5@!\2\u011d\65\3\2\2\2\u011e\u011f\7\f\2\2\u011f\u0120"+
		"\7<\2\2\u0120\u0121\5J&\2\u0121\u0122\7=\2\2\u0122\u0126\7>\2\2\u0123"+
		"\u0125\58\35\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012b\5:\36\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012d\7?\2\2\u012d\67\3\2\2\2\u012e\u012f\7\r\2\2\u012f\u0130"+
		"\5J&\2\u0130\u013f\79\2\2\u0131\u0133\5(\25\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0140\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u013b\7>\2\2\u0138\u013a\5(\25\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140\7?\2\2\u013f"+
		"\u0134\3\2\2\2\u013f\u0137\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143\5<"+
		"\37\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u01439\3\2\2\2\u0144\u0145"+
		"\7\17\2\2\u0145\u0146\79\2\2\u0146\u0148\5(\25\2\u0147\u0149\5<\37\2\u0148"+
		"\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149;\3\2\2\2\u014a\u014b\7\16\2\2"+
		"\u014b=\3\2\2\2\u014c\u014e\7\5\2\2\u014d\u014f\5J&\2\u014e\u014d\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f?\3\2\2\2\u0150\u0154\7>\2\2\u0151\u0153"+
		"\5(\25\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015a\7?"+
		"\2\2\u0158\u015a\5(\25\2\u0159\u0150\3\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"A\3\2\2\2\u015b\u015f\5H%\2\u015c\u015f\5\4\3\2\u015d\u015f\7C\2\2\u015e"+
		"\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015fC\3\2\2\2"+
		"\u0160\u0163\5J&\2\u0161\u0163\5H%\2\u0162\u0160\3\2\2\2\u0162\u0161\3"+
		"\2\2\2\u0163E\3\2\2\2\u0164\u0165\5J&\2\u0165G\3\2\2\2\u0166\u0167\5J"+
		"&\2\u0167\u0168\7\65\2\2\u0168\u0169\5J&\2\u0169I\3\2\2\2\u016a\u016b"+
		"\b&\1\2\u016b\u016c\7C\2\2\u016c\u016e\7<\2\2\u016d\u016f\5P)\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u01ac\7="+
		"\2\2\u0171\u0172\7C\2\2\u0172\u01ac\5\30\r\2\u0173\u0174\7C\2\2\u0174"+
		"\u0176\5\30\r\2\u0175\u0177\5\30\r\2\u0176\u0175\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177\u01ac\3\2\2\2\u0178\u0179\7\60\2\2\u0179\u01ac\5J&$\u017a"+
		"\u017b\7\61\2\2\u017b\u01ac\5J&#\u017c\u017d\7)\2\2\u017d\u01ac\5J&\""+
		"\u017e\u017f\7-\2\2\u017f\u01ac\5J&!\u0180\u0185\7C\2\2\u0181\u0183\5"+
		"\30\r\2\u0182\u0184\5\30\r\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0181\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u01ac\7\37\2\2\u0188\u018d\7C\2\2\u0189\u018b\5\30\r\2\u018a"+
		"\u018c\5\30\r\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3"+
		"\2\2\2\u018d\u0189\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u01ac\7 \2\2\u0190\u0191\7\37\2\2\u0191\u0196\7C\2\2\u0192\u0194\5\30"+
		"\r\2\u0193\u0195\5\30\r\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01ac\3\2"+
		"\2\2\u0198\u0199\7 \2\2\u0199\u019e\7C\2\2\u019a\u019c\5\30\r\2\u019b"+
		"\u019d\5\30\r\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3"+
		"\2\2\2\u019e\u019a\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01ac\3\2\2\2\u01a0"+
		"\u01ac\7C\2\2\u01a1\u01ac\t\4\2\2\u01a2\u01ac\7E\2\2\u01a3\u01ac\7F\2"+
		"\2\u01a4\u01ac\7\34\2\2\u01a5\u01ac\7G\2\2\u01a6\u01ac\7H\2\2\u01a7\u01a8"+
		"\7<\2\2\u01a8\u01a9\5J&\2\u01a9\u01aa\7=\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u016a\3\2\2\2\u01ab\u0171\3\2\2\2\u01ab\u0173\3\2\2\2\u01ab\u0178\3\2"+
		"\2\2\u01ab\u017a\3\2\2\2\u01ab\u017c\3\2\2\2\u01ab\u017e\3\2\2\2\u01ab"+
		"\u0180\3\2\2\2\u01ab\u0188\3\2\2\2\u01ab\u0190\3\2\2\2\u01ab\u0198\3\2"+
		"\2\2\u01ab\u01a0\3\2\2\2\u01ab\u01a1\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ab"+
		"\u01a3\3\2\2\2\u01ab\u01a4\3\2\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01a6\3\2"+
		"\2\2\u01ab\u01a7\3\2\2\2\u01ac\u01e5\3\2\2\2\u01ad\u01ae\f\34\2\2\u01ae"+
		"\u01af\7\62\2\2\u01af\u01e4\5J&\35\u01b0\u01b1\f\33\2\2\u01b1\u01b2\7"+
		"\63\2\2\u01b2\u01e4\5J&\34\u01b3\u01b4\f\32\2\2\u01b4\u01b5\7\64\2\2\u01b5"+
		"\u01e4\5J&\33\u01b6\u01b7\f\31\2\2\u01b7\u01b8\7\60\2\2\u01b8\u01e4\5"+
		"J&\32\u01b9\u01ba\f\30\2\2\u01ba\u01bb\7\61\2\2\u01bb\u01e4\5J&\31\u01bc"+
		"\u01bd\f\27\2\2\u01bd\u01be\7%\2\2\u01be\u01e4\5J&\30\u01bf\u01c0\f\26"+
		"\2\2\u01c0\u01c1\7&\2\2\u01c1\u01e4\5J&\27\u01c2\u01c3\f\25\2\2\u01c3"+
		"\u01c4\7!\2\2\u01c4\u01e4\5J&\26\u01c5\u01c6\f\24\2\2\u01c6\u01c7\7\""+
		"\2\2\u01c7\u01e4\5J&\25\u01c8\u01c9\f\23\2\2\u01c9\u01ca\7$\2\2\u01ca"+
		"\u01e4\5J&\24\u01cb\u01cc\f\22\2\2\u01cc\u01cd\7#\2\2\u01cd\u01e4\5J&"+
		"\23\u01ce\u01cf\f\21\2\2\u01cf\u01d0\7\'\2\2\u01d0\u01e4\5J&\22\u01d1"+
		"\u01d2\f\20\2\2\u01d2\u01d3\7(\2\2\u01d3\u01e4\5J&\21\u01d4\u01d5\f\17"+
		"\2\2\u01d5\u01d6\7,\2\2\u01d6\u01e4\5J&\20\u01d7\u01d8\f\16\2\2\u01d8"+
		"\u01d9\7/\2\2\u01d9\u01e4\5J&\17\u01da\u01db\f\r\2\2\u01db\u01dc\7.\2"+
		"\2\u01dc\u01e4\5J&\16\u01dd\u01de\f\f\2\2\u01de\u01df\7*\2\2\u01df\u01e4"+
		"\5J&\r\u01e0\u01e1\f\13\2\2\u01e1\u01e2\7+\2\2\u01e2\u01e4\5J&\f\u01e3"+
		"\u01ad\3\2\2\2\u01e3\u01b0\3\2\2\2\u01e3\u01b3\3\2\2\2\u01e3\u01b6\3\2"+
		"\2\2\u01e3\u01b9\3\2\2\2\u01e3\u01bc\3\2\2\2\u01e3\u01bf\3\2\2\2\u01e3"+
		"\u01c2\3\2\2\2\u01e3\u01c5\3\2\2\2\u01e3\u01c8\3\2\2\2\u01e3\u01cb\3\2"+
		"\2\2\u01e3\u01ce\3\2\2\2\u01e3\u01d1\3\2\2\2\u01e3\u01d4\3\2\2\2\u01e3"+
		"\u01d7\3\2\2\2\u01e3\u01da\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3\u01e0\3\2"+
		"\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"K\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\7\33\2\2\u01e9\u01eb\5N(\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01ebM\3\2\2\2\u01ec\u01ed\t\5\2\2"+
		"\u01edO\3\2\2\2\u01ee\u01f3\5J&\2\u01ef\u01f0\7\67\2\2\u01f0\u01f2\5J"+
		"&\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4Q\3\2\2\2\u01f5\u01f3\3\2\2\29VXdhmrw|\u0081\u0089"+
		"\u0091\u0096\u009a\u00aa\u00af\u00b6\u00c0\u00c5\u00ca\u00de\u00e1\u00e5"+
		"\u00ed\u00f0\u00f6\u00fa\u0103\u0115\u0126\u012a\u0134\u013b\u013f\u0142"+
		"\u0148\u014e\u0154\u0159\u015e\u0162\u016e\u0176\u0183\u0185\u018b\u018d"+
		"\u0194\u0196\u019c\u019e\u01ab\u01e3\u01e5\u01ea\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}