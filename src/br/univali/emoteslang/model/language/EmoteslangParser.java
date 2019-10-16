// Generated from .\Emoteslang.g4 by ANTLR 4.7.2
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
		RULE_parametersCall = 18, RULE_functionCall = 19, RULE_commands = 20, 
		RULE_command = 21, RULE_conditionals = 22, RULE_ifdes = 23, RULE_ifdeselse = 24, 
		RULE_ifdeselseif = 25, RULE_whiledes = 26, RULE_doWhile = 27, RULE_fordes = 28, 
		RULE_switchdes = 29, RULE_casedes = 30, RULE_defaultdes = 31, RULE_breakdes = 32, 
		RULE_returndes = 33, RULE_commandList = 34, RULE_initializeFor = 35, RULE_incrementFor = 36, 
		RULE_condition = 37, RULE_array = 38, RULE_matrix = 39, RULE_attribution = 40, 
		RULE_expression = 41, RULE_finalValue = 42, RULE_typeWithVoid = 43, RULE_type = 44, 
		RULE_expressionList = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "declaration", "declarationVar", "declarationMatrix", 
			"initializeMatrix", "declarationArray", "initializeArray", "matrixLine", 
			"matrixCol", "arraySize", "arrayIndex", "functions", "parametersList", 
			"parameter", "paramArray", "paramMatrix", "inputAndOutput", "parametersCall", 
			"functionCall", "commands", "command", "conditionals", "ifdes", "ifdeselse", 
			"ifdeselseif", "whiledes", "doWhile", "fordes", "switchdes", "casedes", 
			"defaultdes", "breakdes", "returndes", "commandList", "initializeFor", 
			"incrementFor", "condition", "array", "matrix", "attribution", "expression", 
			"finalValue", "typeWithVoid", "type", "expressionList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'HeyGuys'", "'RIP'", "'imOut'", "'TriHard'", "'GivePLZ'", "'Bonfire'", 
			"'pikaHi'", "'seaPika'", "'pikaOH'", "'jerryWhat'", "'Triggered'", "'WaitWhat'", 
			"'BabyRage'", "'4Head'", "'Woah'", "'justDOIT'", "'int'", "'bin'", "'hex'", 
			"'double'", "'float'", "'char'", "'string'", "'boolean'", "'void'", null, 
			"'CoolCat'", "'FatCat'", "'++'", "'--'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'&&'", "'||'", "'NotLikeThis'", "'&'", "'|'", "'^'", 
			"'~'", "'>>'", "'<<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'.'", 
			"','", "'Clap'", "':'", "'['", "']'", "'P('", "')G'", "'Kappa'", "'KappaPride'"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(START);
			setState(93);
			match(LEFT_CBRACKETS);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL))) != 0)) {
				{
				{
				setState(94);
				statements();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				functions();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			setState(105);
			match(RIGHT_CBRACKETS);
			setState(106);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			type();
			setState(109);
			declaration();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				declaration();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(117);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				declarationVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				declarationArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitDeclarationVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationVarContext declarationVar() throws RecognitionException {
		DeclarationVarContext _localctx = new DeclarationVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(126);
				match(ATTRIBUTION);
				setState(127);
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
		public MatrixLineContext matrixLine() {
			return getRuleContext(MatrixLineContext.class,0);
		}
		public List<TerminalNode> RIGHT_SBRACKET() { return getTokens(EmoteslangParser.RIGHT_SBRACKET); }
		public TerminalNode RIGHT_SBRACKET(int i) {
			return getToken(EmoteslangParser.RIGHT_SBRACKET, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitDeclarationMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationMatrixContext declarationMatrix() throws RecognitionException {
		DeclarationMatrixContext _localctx = new DeclarationMatrixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationMatrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
			setState(131);
			match(LEFT_SBRACKET);
			setState(132);
			matrixLine();
			setState(133);
			match(RIGHT_SBRACKET);
			setState(134);
			match(LEFT_SBRACKET);
			setState(135);
			matrixCol();
			setState(136);
			match(RIGHT_SBRACKET);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(137);
				match(ATTRIBUTION);
				setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitInitializeMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeMatrixContext initializeMatrix() throws RecognitionException {
		InitializeMatrixContext _localctx = new InitializeMatrixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initializeMatrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LEFT_CBRACKETS);
			setState(142);
			initializeArray();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143);
				match(COMMA);
				setState(144);
				initializeArray();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
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
		public ArraySizeContext arraySize() {
			return getRuleContext(ArraySizeContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(EmoteslangParser.RIGHT_SBRACKET, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitDeclarationArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationArrayContext declarationArray() throws RecognitionException {
		DeclarationArrayContext _localctx = new DeclarationArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarationArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(LEFT_SBRACKET);
			setState(154);
			arraySize();
			setState(155);
			match(RIGHT_SBRACKET);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(156);
				match(ATTRIBUTION);
				setState(157);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitInitializeArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeArrayContext initializeArray() throws RecognitionException {
		InitializeArrayContext _localctx = new InitializeArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initializeArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LEFT_CBRACKETS);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (UN_ADD - 26)) | (1L << (UN_SUB - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (BIN - 26)) | (1L << (HEXA - 26)))) != 0)) {
				{
				setState(161);
				expressionList();
				}
			}

			setState(164);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitMatrixLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixLineContext matrixLine() throws RecognitionException {
		MatrixLineContext _localctx = new MatrixLineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matrixLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitMatrixCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixColContext matrixCol() throws RecognitionException {
		MatrixColContext _localctx = new MatrixColContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_matrixCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitArraySize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySizeContext arraySize() throws RecognitionException {
		ArraySizeContext _localctx = new ArraySizeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arraySize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LEFT_SBRACKET);
			setState(173);
			expression(0);
			setState(174);
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
		public TypeWithVoidContext typeWithVoid() {
			return getRuleContext(TypeWithVoidContext.class,0);
		}
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public TerminalNode LEFT_CBRACKETS() { return getToken(EmoteslangParser.LEFT_CBRACKETS, 0); }
		public TerminalNode RIGHT_CBRACKETS() { return getToken(EmoteslangParser.RIGHT_CBRACKETS, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			match(FUNCTION);
			setState(177);
			typeWithVoid();
			setState(178);
			match(ID);
			setState(179);
			match(LEFT_PARENTESIS);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL))) != 0)) {
				{
				setState(180);
				parametersList();
				}
			}

			setState(183);
			match(RIGHT_PARENTESIS);
			setState(184);
			match(LEFT_CBRACKETS);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << UN_ADD) | (1L << UN_SUB) | (1L << NOT) | (1L << BIT_NOT) | (1L << ADD) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (BIN - 65)) | (1L << (HEXA - 65)))) != 0)) {
				{
				{
				setState(185);
				commands();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(RIGHT_CBRACKETS);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitParametersList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			parameter();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(194);
				match(COMMA);
				setState(195);
				parameter();
				}
				}
				setState(200);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			type();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_AND) {
				{
				setState(202);
				match(BIT_AND);
				}
			}

			setState(205);
			match(ID);
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(206);
				paramArray();
				}
				break;
			case 2:
				{
				setState(207);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitParamArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamArrayContext paramArray() throws RecognitionException {
		ParamArrayContext _localctx = new ParamArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LEFT_SBRACKET);
			setState(211);
			expression(0);
			setState(212);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitParamMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamMatrixContext paramMatrix() throws RecognitionException {
		ParamMatrixContext _localctx = new ParamMatrixContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_paramMatrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(LEFT_SBRACKET);
			setState(215);
			expression(0);
			setState(216);
			match(RIGHT_SBRACKET);
			setState(217);
			match(LEFT_SBRACKET);
			setState(218);
			expression(0);
			setState(219);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitInputAndOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputAndOutputContext inputAndOutput() throws RecognitionException {
		InputAndOutputContext _localctx = new InputAndOutputContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inputAndOutput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==READ || _la==WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			match(LEFT_PARENTESIS);
			setState(223);
			parametersCall();
			setState(224);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitParametersCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersCallContext parametersCall() throws RecognitionException {
		ParametersCallContext _localctx = new ParametersCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parametersCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (UN_ADD - 26)) | (1L << (UN_SUB - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (BIN - 26)) | (1L << (HEXA - 26)))) != 0)) {
				{
				setState(226);
				expression(0);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227);
					match(COMMA);
					setState(228);
					expression(0);
					}
					}
					setState(233);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ID);
			setState(237);
			match(LEFT_PARENTESIS);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (UN_ADD - 26)) | (1L << (UN_SUB - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (BIN - 26)) | (1L << (HEXA - 26)))) != 0)) {
				{
				setState(238);
				expressionList();
				}
			}

			setState(241);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_commands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case SWITCH:
			case FOR:
			case WHILE:
			case DO:
				{
				setState(243);
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
			case BIN:
			case HEXA:
				{
				setState(244);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(247);
				statements();
				}
				break;
			case 2:
				{
				setState(248);
				returndes();
				}
				break;
			case 3:
				{
				setState(249);
				breakdes();
				}
				break;
			case 4:
				{
				setState(250);
				attribution();
				}
				break;
			case 5:
				{
				setState(251);
				expression(0);
				}
				break;
			case 6:
				{
				setState(252);
				functionCall();
				}
				break;
			case 7:
				{
				setState(253);
				inputAndOutput();
				}
				break;
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_COMMA) {
				{
				setState(256);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitConditionals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalsContext conditionals() throws RecognitionException {
		ConditionalsContext _localctx = new ConditionalsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditionals);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				ifdes();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				whiledes();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				doWhile();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_COMMA) {
					{
					setState(262);
					match(DOT_COMMA);
					}
				}

				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				fordes();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
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
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public IfdeselseContext ifdeselse() {
			return getRuleContext(IfdeselseContext.class,0);
		}
		public IfdeselseifContext ifdeselseif() {
			return getRuleContext(IfdeselseifContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitIfdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdesContext ifdes() throws RecognitionException {
		IfdesContext _localctx = new IfdesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(IF);
			setState(270);
			match(LEFT_PARENTESIS);
			setState(271);
			expression(0);
			setState(272);
			match(RIGHT_PARENTESIS);
			setState(273);
			commandList();
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(274);
				ifdeselse();
				}
				break;
			case 2:
				{
				setState(275);
				ifdeselseif();
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

	public static class IfdeselseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EmoteslangParser.ELSE, 0); }
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public IfdeselseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterIfdeselse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitIfdeselse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitIfdeselse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdeselseContext ifdeselse() throws RecognitionException {
		IfdeselseContext _localctx = new IfdeselseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifdeselse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ELSE);
			setState(279);
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

	public static class IfdeselseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(EmoteslangParser.ELSEIF, 0); }
		public IfdesContext ifdes() {
			return getRuleContext(IfdesContext.class,0);
		}
		public IfdeselseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterIfdeselseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitIfdeselseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitIfdeselseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdeselseifContext ifdeselseif() throws RecognitionException {
		IfdeselseifContext _localctx = new IfdeselseifContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifdeselseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ELSEIF);
			setState(282);
			ifdes();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitWhiledes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiledesContext whiledes() throws RecognitionException {
		WhiledesContext _localctx = new WhiledesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whiledes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(WHILE);
			setState(285);
			match(LEFT_PARENTESIS);
			setState(286);
			expression(0);
			setState(287);
			match(RIGHT_PARENTESIS);
			setState(288);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(DO);
			setState(291);
			commandList();
			setState(292);
			match(WHILE);
			setState(293);
			match(LEFT_PARENTESIS);
			setState(294);
			expression(0);
			setState(295);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitFordes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FordesContext fordes() throws RecognitionException {
		FordesContext _localctx = new FordesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fordes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(FOR);
			setState(298);
			match(LEFT_PARENTESIS);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (TP_INT - 17)) | (1L << (TP_BIN - 17)) | (1L << (TP_HEX - 17)) | (1L << (TP_DOUBLE - 17)) | (1L << (TP_FLOAT - 17)) | (1L << (TP_CHAR - 17)) | (1L << (TP_STRING - 17)) | (1L << (TP_BOOL - 17)) | (1L << (ID - 17)))) != 0)) {
				{
				setState(299);
				initializeFor();
				}
			}

			setState(302);
			match(DOT_COMMA);
			setState(303);
			condition();
			setState(304);
			match(DOT_COMMA);
			setState(305);
			incrementFor();
			setState(306);
			match(RIGHT_PARENTESIS);
			setState(307);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitSwitchdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchdesContext switchdes() throws RecognitionException {
		SwitchdesContext _localctx = new SwitchdesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switchdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(SWITCH);
			setState(310);
			match(LEFT_PARENTESIS);
			setState(311);
			expression(0);
			setState(312);
			match(RIGHT_PARENTESIS);
			setState(313);
			match(LEFT_CBRACKETS);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(314);
				casedes();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(320);
				defaultdes();
				}
			}

			setState(323);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitCasedes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasedesContext casedes() throws RecognitionException {
		CasedesContext _localctx = new CasedesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_casedes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(CASE);
			setState(326);
			expression(0);
			setState(327);
			match(DOUBLE_DOT);
			setState(342);
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
			case BIN:
			case HEXA:
				{
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(328);
						commands();
						}
						} 
					}
					setState(333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case LEFT_CBRACKETS:
				{
				setState(334);
				match(LEFT_CBRACKETS);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << UN_ADD) | (1L << UN_SUB) | (1L << NOT) | (1L << BIT_NOT) | (1L << ADD) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (BIN - 65)) | (1L << (HEXA - 65)))) != 0)) {
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
			default:
				throw new NoViableAltException(this);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(344);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitDefaultdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultdesContext defaultdes() throws RecognitionException {
		DefaultdesContext _localctx = new DefaultdesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_defaultdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(DEFAULT);
			setState(348);
			match(DOUBLE_DOT);
			setState(349);
			commands();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(350);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitBreakdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakdesContext breakdes() throws RecognitionException {
		BreakdesContext _localctx = new BreakdesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_breakdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitReturndes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturndesContext returndes() throws RecognitionException {
		ReturndesContext _localctx = new ReturndesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returndes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(RETURN);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(356);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitCommandList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandListContext commandList() throws RecognitionException {
		CommandListContext _localctx = new CommandListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_commandList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CBRACKETS:
				{
				setState(359);
				match(LEFT_CBRACKETS);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << UN_ADD) | (1L << UN_SUB) | (1L << NOT) | (1L << BIT_NOT) | (1L << ADD) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (BIN - 65)) | (1L << (HEXA - 65)))) != 0)) {
					{
					{
					setState(360);
					commands();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
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
			case BIN:
			case HEXA:
				{
				setState(367);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitInitializeFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeForContext initializeFor() throws RecognitionException {
		InitializeForContext _localctx = new InitializeForContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_initializeFor);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				attribution();
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
				setState(371);
				statements();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitIncrementFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementForContext incrementFor() throws RecognitionException {
		IncrementForContext _localctx = new IncrementForContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_incrementFor);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ID);
			setState(381);
			arrayIndex();
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

	public static class MatrixContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public List<ArrayIndexContext> arrayIndex() {
			return getRuleContexts(ArrayIndexContext.class);
		}
		public ArrayIndexContext arrayIndex(int i) {
			return getRuleContext(ArrayIndexContext.class,i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(ID);
			setState(384);
			arrayIndex();
			setState(385);
			arrayIndex();
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
		public TerminalNode ATTRIBUTION() { return getToken(EmoteslangParser.ATTRIBUTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(387);
				match(ID);
				}
				break;
			case 2:
				{
				setState(388);
				array();
				}
				break;
			case 3:
				{
				setState(389);
				matrix();
				}
				break;
			}
			setState(392);
			match(ATTRIBUTION);
			setState(393);
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
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode UN_ADD() { return getToken(EmoteslangParser.UN_ADD, 0); }
		public List<ArrayIndexContext> arrayIndex() {
			return getRuleContexts(ArrayIndexContext.class);
		}
		public ArrayIndexContext arrayIndex(int i) {
			return getRuleContext(ArrayIndexContext.class,i);
		}
		public TerminalNode UN_SUB() { return getToken(EmoteslangParser.UN_SUB, 0); }
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(396);
				match(ADD);
				setState(397);
				expression(27);
				}
				break;
			case 2:
				{
				setState(398);
				match(SUB);
				setState(399);
				expression(26);
				}
				break;
			case 3:
				{
				setState(400);
				match(NOT);
				setState(401);
				expression(25);
				}
				break;
			case 4:
				{
				setState(402);
				match(BIT_NOT);
				setState(403);
				expression(24);
				}
				break;
			case 5:
				{
				setState(404);
				match(ID);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(405);
					arrayIndex();
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						setState(406);
						arrayIndex();
						}
					}

					}
				}

				setState(411);
				match(UN_ADD);
				}
				break;
			case 6:
				{
				setState(412);
				match(ID);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(413);
					arrayIndex();
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						setState(414);
						arrayIndex();
						}
					}

					}
				}

				setState(419);
				match(UN_SUB);
				}
				break;
			case 7:
				{
				setState(420);
				match(UN_ADD);
				setState(421);
				match(ID);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(422);
					arrayIndex();
					setState(424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(423);
						arrayIndex();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(428);
				match(UN_SUB);
				setState(429);
				match(ID);
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(430);
					arrayIndex();
					setState(432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(431);
						arrayIndex();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(436);
				finalValue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(493);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(439);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(440);
						match(MULT);
						setState(441);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(442);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(443);
						match(DIV);
						setState(444);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(445);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(446);
						match(MOD);
						setState(447);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(448);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(449);
						match(ADD);
						setState(450);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(451);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(452);
						match(SUB);
						setState(453);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(454);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(455);
						match(EQUALS);
						setState(456);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(457);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(458);
						match(DIFFERENT);
						setState(459);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(460);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(461);
						match(BIGGERT);
						setState(462);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(463);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(464);
						match(SMALLERT);
						setState(465);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(466);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(467);
						match(SMALLERE);
						setState(468);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(469);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(470);
						match(BIGGERE);
						setState(471);
						expression(10);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(472);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(473);
						match(AND);
						setState(474);
						expression(9);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(475);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(476);
						match(OR);
						setState(477);
						expression(8);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(478);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(479);
						match(BIT_XOR);
						setState(480);
						expression(7);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(481);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(482);
						match(BIT_LS);
						setState(483);
						expression(6);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(484);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(485);
						match(BIT_RS);
						setState(486);
						expression(5);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(487);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(488);
						match(BIT_AND);
						setState(489);
						expression(4);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(490);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(491);
						match(BIT_OR);
						setState(492);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class FinalValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode INT() { return getToken(EmoteslangParser.INT, 0); }
		public TerminalNode HEXA() { return getToken(EmoteslangParser.HEXA, 0); }
		public TerminalNode BIN() { return getToken(EmoteslangParser.BIN, 0); }
		public TerminalNode DOUBLE() { return getToken(EmoteslangParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(EmoteslangParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(EmoteslangParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(EmoteslangParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(EmoteslangParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_finalValue);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT - 66)) | (1L << (BIN - 66)) | (1L << (HEXA - 66)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(503);
				match(CHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(504);
				match(STRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(505);
				array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(506);
				matrix();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(507);
				match(LEFT_PARENTESIS);
				setState(508);
				expression(0);
				setState(509);
				match(RIGHT_PARENTESIS);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitTypeWithVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeWithVoidContext typeWithVoid() throws RecognitionException {
		TypeWithVoidContext _localctx = new TypeWithVoidContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeWithVoid);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TP_VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
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
				setState(514);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(519);
			expression(0);
			}
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(520);
				match(COMMA);
				{
				setState(521);
				expression(0);
				}
				}
				}
				setState(526);
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
		case 41:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u0212\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\6\2h\n"+
		"\2\r\2\16\2i\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3s\n\3\f\3\16\3v\13\3\3\3\5"+
		"\3y\n\3\3\4\3\4\3\4\5\4~\n\4\3\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\7\7\u0094\n\7\f\7\16"+
		"\7\u0097\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n\b\3\t\3\t\5"+
		"\t\u00a5\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00b8\n\16\3\16\3\16\3\16\7\16\u00bd\n\16\f\16"+
		"\16\16\u00c0\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u00c7\n\17\f\17\16\17"+
		"\u00ca\13\17\3\20\3\20\5\20\u00ce\n\20\3\20\3\20\3\20\5\20\u00d3\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\7\24\u00e8\n\24\f\24\16\24\u00eb\13\24\5\24"+
		"\u00ed\n\24\3\25\3\25\3\25\5\25\u00f2\n\25\3\25\3\25\3\26\3\26\5\26\u00f8"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0101\n\27\3\27\5\27\u0104"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u010a\n\30\3\30\3\30\5\30\u010e\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0117\n\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\5\36\u012f\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u013e\n\37\f\37\16\37\u0141\13\37"+
		"\3\37\5\37\u0144\n\37\3\37\3\37\3 \3 \3 \3 \7 \u014c\n \f \16 \u014f\13"+
		" \3 \3 \7 \u0153\n \f \16 \u0156\13 \3 \5 \u0159\n \3 \5 \u015c\n \3!"+
		"\3!\3!\3!\5!\u0162\n!\3\"\3\"\3#\3#\5#\u0168\n#\3$\3$\7$\u016c\n$\f$\16"+
		"$\u016f\13$\3$\3$\5$\u0173\n$\3%\3%\5%\u0177\n%\3&\3&\5&\u017b\n&\3\'"+
		"\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\5*\u0189\n*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u019a\n+\5+\u019c\n+\3+\3+\3+\3+\5+\u01a2\n"+
		"+\5+\u01a4\n+\3+\3+\3+\3+\3+\5+\u01ab\n+\5+\u01ad\n+\3+\3+\3+\3+\5+\u01b3"+
		"\n+\5+\u01b5\n+\3+\5+\u01b8\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u01f0\n+\f+"+
		"\16+\u01f3\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0202\n,\3-\3"+
		"-\5-\u0206\n-\3.\3.\3/\3/\3/\7/\u020d\n/\f/\16/\u0210\13/\3/\2\3T\60\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\\2\6\3\2CD\3\2\7\b\4\2DDIJ\3\2\23\32\2\u0242\2^\3\2\2\2\4n\3"+
		"\2\2\2\6}\3\2\2\2\b\177\3\2\2\2\n\u0084\3\2\2\2\f\u008f\3\2\2\2\16\u009a"+
		"\3\2\2\2\20\u00a2\3\2\2\2\22\u00a8\3\2\2\2\24\u00aa\3\2\2\2\26\u00ac\3"+
		"\2\2\2\30\u00ae\3\2\2\2\32\u00b2\3\2\2\2\34\u00c3\3\2\2\2\36\u00cb\3\2"+
		"\2\2 \u00d4\3\2\2\2\"\u00d8\3\2\2\2$\u00df\3\2\2\2&\u00ec\3\2\2\2(\u00ee"+
		"\3\2\2\2*\u00f7\3\2\2\2,\u0100\3\2\2\2.\u010d\3\2\2\2\60\u010f\3\2\2\2"+
		"\62\u0118\3\2\2\2\64\u011b\3\2\2\2\66\u011e\3\2\2\28\u0124\3\2\2\2:\u012b"+
		"\3\2\2\2<\u0137\3\2\2\2>\u0147\3\2\2\2@\u015d\3\2\2\2B\u0163\3\2\2\2D"+
		"\u0165\3\2\2\2F\u0172\3\2\2\2H\u0176\3\2\2\2J\u017a\3\2\2\2L\u017c\3\2"+
		"\2\2N\u017e\3\2\2\2P\u0181\3\2\2\2R\u0188\3\2\2\2T\u01b7\3\2\2\2V\u0201"+
		"\3\2\2\2X\u0205\3\2\2\2Z\u0207\3\2\2\2\\\u0209\3\2\2\2^_\7\3\2\2_c\7>"+
		"\2\2`b\5\4\3\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2fh\5\32\16\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7"+
		"?\2\2lm\7\4\2\2m\3\3\2\2\2no\5Z.\2ot\5\6\4\2pq\7\67\2\2qs\5\6\4\2rp\3"+
		"\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wy\78\2\2xw\3"+
		"\2\2\2xy\3\2\2\2y\5\3\2\2\2z~\5\b\5\2{~\5\16\b\2|~\5\n\6\2}z\3\2\2\2}"+
		"{\3\2\2\2}|\3\2\2\2~\7\3\2\2\2\177\u0082\7C\2\2\u0080\u0081\7\65\2\2\u0081"+
		"\u0083\5T+\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\t\3\2\2\2\u0084"+
		"\u0085\7C\2\2\u0085\u0086\7:\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7;\2"+
		"\2\u0088\u0089\7:\2\2\u0089\u008a\5\24\13\2\u008a\u008d\7;\2\2\u008b\u008c"+
		"\7\65\2\2\u008c\u008e\5\f\7\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\13\3\2\2\2\u008f\u0090\7>\2\2\u0090\u0095\5\20\t\2\u0091\u0092"+
		"\7\67\2\2\u0092\u0094\5\20\t\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\7?\2\2\u0099\r\3\2\2\2\u009a\u009b\7C\2\2\u009b\u009c"+
		"\7:\2\2\u009c\u009d\5\26\f\2\u009d\u00a0\7;\2\2\u009e\u009f\7\65\2\2\u009f"+
		"\u00a1\5\20\t\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\17\3\2\2"+
		"\2\u00a2\u00a4\7>\2\2\u00a3\u00a5\5\\/\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\21\3\2\2\2\u00a8"+
		"\u00a9\5\26\f\2\u00a9\23\3\2\2\2\u00aa\u00ab\5\26\f\2\u00ab\25\3\2\2\2"+
		"\u00ac\u00ad\t\2\2\2\u00ad\27\3\2\2\2\u00ae\u00af\7:\2\2\u00af\u00b0\5"+
		"T+\2\u00b0\u00b1\7;\2\2\u00b1\31\3\2\2\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4"+
		"\5X-\2\u00b4\u00b5\7C\2\2\u00b5\u00b7\7<\2\2\u00b6\u00b8\5\34\17\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7="+
		"\2\2\u00ba\u00be\7>\2\2\u00bb\u00bd\5*\26\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2\33\3\2\2\2\u00c3\u00c8"+
		"\5\36\20\2\u00c4\u00c5\7\67\2\2\u00c5\u00c7\5\36\20\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\35\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\5Z.\2\u00cc\u00ce\7*\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\7C"+
		"\2\2\u00d0\u00d3\5 \21\2\u00d1\u00d3\5\"\22\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7:\2\2"+
		"\u00d5\u00d6\5T+\2\u00d6\u00d7\7;\2\2\u00d7!\3\2\2\2\u00d8\u00d9\7:\2"+
		"\2\u00d9\u00da\5T+\2\u00da\u00db\7;\2\2\u00db\u00dc\7:\2\2\u00dc\u00dd"+
		"\5T+\2\u00dd\u00de\7;\2\2\u00de#\3\2\2\2\u00df\u00e0\t\3\2\2\u00e0\u00e1"+
		"\7<\2\2\u00e1\u00e2\5&\24\2\u00e2\u00e3\7=\2\2\u00e3%\3\2\2\2\u00e4\u00e9"+
		"\5T+\2\u00e5\u00e6\7\67\2\2\u00e6\u00e8\5T+\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\'\3\2\2\2\u00ee\u00ef\7C\2\2\u00ef\u00f1\7<\2\2\u00f0\u00f2\5\\/\2\u00f1"+
		"\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7="+
		"\2\2\u00f4)\3\2\2\2\u00f5\u00f8\5.\30\2\u00f6\u00f8\5,\27\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8+\3\2\2\2\u00f9\u0101\5\4\3\2\u00fa"+
		"\u0101\5D#\2\u00fb\u0101\5B\"\2\u00fc\u0101\5R*\2\u00fd\u0101\5T+\2\u00fe"+
		"\u0101\5(\25\2\u00ff\u0101\5$\23\2\u0100\u00f9\3\2\2\2\u0100\u00fa\3\2"+
		"\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\78"+
		"\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104-\3\2\2\2\u0105\u010e"+
		"\5\60\31\2\u0106\u010e\5\66\34\2\u0107\u0109\58\35\2\u0108\u010a\78\2"+
		"\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010e\3\2\2\2\u010b\u010e"+
		"\5:\36\2\u010c\u010e\5<\37\2\u010d\u0105\3\2\2\2\u010d\u0106\3\2\2\2\u010d"+
		"\u0107\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e/\3\2\2\2"+
		"\u010f\u0110\7\t\2\2\u0110\u0111\7<\2\2\u0111\u0112\5T+\2\u0112\u0113"+
		"\7=\2\2\u0113\u0116\5F$\2\u0114\u0117\5\62\32\2\u0115\u0117\5\64\33\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\61"+
		"\3\2\2\2\u0118\u0119\7\n\2\2\u0119\u011a\5F$\2\u011a\63\3\2\2\2\u011b"+
		"\u011c\7\13\2\2\u011c\u011d\5\60\31\2\u011d\65\3\2\2\2\u011e\u011f\7\21"+
		"\2\2\u011f\u0120\7<\2\2\u0120\u0121\5T+\2\u0121\u0122\7=\2\2\u0122\u0123"+
		"\5F$\2\u0123\67\3\2\2\2\u0124\u0125\7\22\2\2\u0125\u0126\5F$\2\u0126\u0127"+
		"\7\21\2\2\u0127\u0128\7<\2\2\u0128\u0129\5T+\2\u0129\u012a\7=\2\2\u012a"+
		"9\3\2\2\2\u012b\u012c\7\20\2\2\u012c\u012e\7<\2\2\u012d\u012f\5H%\2\u012e"+
		"\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\78"+
		"\2\2\u0131\u0132\5L\'\2\u0132\u0133\78\2\2\u0133\u0134\5J&\2\u0134\u0135"+
		"\7=\2\2\u0135\u0136\5F$\2\u0136;\3\2\2\2\u0137\u0138\7\f\2\2\u0138\u0139"+
		"\7<\2\2\u0139\u013a\5T+\2\u013a\u013b\7=\2\2\u013b\u013f\7>\2\2\u013c"+
		"\u013e\5> \2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2"+
		"\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144"+
		"\5@!\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\7?\2\2\u0146=\3\2\2\2\u0147\u0148\7\r\2\2\u0148\u0149\5T+\2\u0149"+
		"\u0158\79\2\2\u014a\u014c\5*\26\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0159\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0154\7>\2\2\u0151\u0153\5*\26\2\u0152\u0151\3\2"+
		"\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\7?\2\2\u0158\u014d\3\2"+
		"\2\2\u0158\u0150\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u015c\5B\"\2\u015b"+
		"\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c?\3\2\2\2\u015d\u015e\7\17\2\2"+
		"\u015e\u015f\79\2\2\u015f\u0161\5*\26\2\u0160\u0162\5B\"\2\u0161\u0160"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162A\3\2\2\2\u0163\u0164\7\16\2\2\u0164"+
		"C\3\2\2\2\u0165\u0167\7\5\2\2\u0166\u0168\5T+\2\u0167\u0166\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168E\3\2\2\2\u0169\u016d\7>\2\2\u016a\u016c\5*\26\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173\7?\2\2\u0171"+
		"\u0173\5*\26\2\u0172\u0169\3\2\2\2\u0172\u0171\3\2\2\2\u0173G\3\2\2\2"+
		"\u0174\u0177\5R*\2\u0175\u0177\5\4\3\2\u0176\u0174\3\2\2\2\u0176\u0175"+
		"\3\2\2\2\u0177I\3\2\2\2\u0178\u017b\5T+\2\u0179\u017b\5R*\2\u017a\u0178"+
		"\3\2\2\2\u017a\u0179\3\2\2\2\u017bK\3\2\2\2\u017c\u017d\5T+\2\u017dM\3"+
		"\2\2\2\u017e\u017f\7C\2\2\u017f\u0180\5\30\r\2\u0180O\3\2\2\2\u0181\u0182"+
		"\7C\2\2\u0182\u0183\5\30\r\2\u0183\u0184\5\30\r\2\u0184Q\3\2\2\2\u0185"+
		"\u0189\7C\2\2\u0186\u0189\5N(\2\u0187\u0189\5P)\2\u0188\u0185\3\2\2\2"+
		"\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b"+
		"\7\65\2\2\u018b\u018c\5T+\2\u018cS\3\2\2\2\u018d\u018e\b+\1\2\u018e\u018f"+
		"\7\60\2\2\u018f\u01b8\5T+\35\u0190\u0191\7\61\2\2\u0191\u01b8\5T+\34\u0192"+
		"\u0193\7)\2\2\u0193\u01b8\5T+\33\u0194\u0195\7-\2\2\u0195\u01b8\5T+\32"+
		"\u0196\u019b\7C\2\2\u0197\u0199\5\30\r\2\u0198\u019a\5\30\r\2\u0199\u0198"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0197\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01b8\7\37\2\2\u019e\u01a3\7"+
		"C\2\2\u019f\u01a1\5\30\r\2\u01a0\u01a2\5\30\r\2\u01a1\u01a0\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01b8\7 \2\2\u01a6\u01a7\7\37\2\2\u01a7"+
		"\u01ac\7C\2\2\u01a8\u01aa\5\30\r\2\u01a9\u01ab\5\30\r\2\u01aa\u01a9\3"+
		"\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01b8\3\2\2\2\u01ae\u01af\7 \2\2\u01af\u01b4\7C\2"+
		"\2\u01b0\u01b2\5\30\r\2\u01b1\u01b3\5\30\r\2\u01b2\u01b1\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b8\5V,\2\u01b7\u018d\3\2\2\2\u01b7\u0190"+
		"\3\2\2\2\u01b7\u0192\3\2\2\2\u01b7\u0194\3\2\2\2\u01b7\u0196\3\2\2\2\u01b7"+
		"\u019e\3\2\2\2\u01b7\u01a6\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01b6\3\2"+
		"\2\2\u01b8\u01f1\3\2\2\2\u01b9\u01ba\f\25\2\2\u01ba\u01bb\7\62\2\2\u01bb"+
		"\u01f0\5T+\26\u01bc\u01bd\f\24\2\2\u01bd\u01be\7\63\2\2\u01be\u01f0\5"+
		"T+\25\u01bf\u01c0\f\23\2\2\u01c0\u01c1\7\64\2\2\u01c1\u01f0\5T+\24\u01c2"+
		"\u01c3\f\22\2\2\u01c3\u01c4\7\60\2\2\u01c4\u01f0\5T+\23\u01c5\u01c6\f"+
		"\21\2\2\u01c6\u01c7\7\61\2\2\u01c7\u01f0\5T+\22\u01c8\u01c9\f\20\2\2\u01c9"+
		"\u01ca\7%\2\2\u01ca\u01f0\5T+\21\u01cb\u01cc\f\17\2\2\u01cc\u01cd\7&\2"+
		"\2\u01cd\u01f0\5T+\20\u01ce\u01cf\f\16\2\2\u01cf\u01d0\7!\2\2\u01d0\u01f0"+
		"\5T+\17\u01d1\u01d2\f\r\2\2\u01d2\u01d3\7\"\2\2\u01d3\u01f0\5T+\16\u01d4"+
		"\u01d5\f\f\2\2\u01d5\u01d6\7$\2\2\u01d6\u01f0\5T+\r\u01d7\u01d8\f\13\2"+
		"\2\u01d8\u01d9\7#\2\2\u01d9\u01f0\5T+\f\u01da\u01db\f\n\2\2\u01db\u01dc"+
		"\7\'\2\2\u01dc\u01f0\5T+\13\u01dd\u01de\f\t\2\2\u01de\u01df\7(\2\2\u01df"+
		"\u01f0\5T+\n\u01e0\u01e1\f\b\2\2\u01e1\u01e2\7,\2\2\u01e2\u01f0\5T+\t"+
		"\u01e3\u01e4\f\7\2\2\u01e4\u01e5\7/\2\2\u01e5\u01f0\5T+\b\u01e6\u01e7"+
		"\f\6\2\2\u01e7\u01e8\7.\2\2\u01e8\u01f0\5T+\7\u01e9\u01ea\f\5\2\2\u01ea"+
		"\u01eb\7*\2\2\u01eb\u01f0\5T+\6\u01ec\u01ed\f\4\2\2\u01ed\u01ee\7+\2\2"+
		"\u01ee\u01f0\5T+\5\u01ef\u01b9\3\2\2\2\u01ef\u01bc\3\2\2\2\u01ef\u01bf"+
		"\3\2\2\2\u01ef\u01c2\3\2\2\2\u01ef\u01c5\3\2\2\2\u01ef\u01c8\3\2\2\2\u01ef"+
		"\u01cb\3\2\2\2\u01ef\u01ce\3\2\2\2\u01ef\u01d1\3\2\2\2\u01ef\u01d4\3\2"+
		"\2\2\u01ef\u01d7\3\2\2\2\u01ef\u01da\3\2\2\2\u01ef\u01dd\3\2\2\2\u01ef"+
		"\u01e0\3\2\2\2\u01ef\u01e3\3\2\2\2\u01ef\u01e6\3\2\2\2\u01ef\u01e9\3\2"+
		"\2\2\u01ef\u01ec\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2U\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u0202\7C\2\2\u01f5"+
		"\u0202\t\4\2\2\u01f6\u0202\7E\2\2\u01f7\u0202\7F\2\2\u01f8\u0202\7\34"+
		"\2\2\u01f9\u0202\7G\2\2\u01fa\u0202\7H\2\2\u01fb\u0202\5N(\2\u01fc\u0202"+
		"\5P)\2\u01fd\u01fe\7<\2\2\u01fe\u01ff\5T+\2\u01ff\u0200\7=\2\2\u0200\u0202"+
		"\3\2\2\2\u0201\u01f4\3\2\2\2\u0201\u01f5\3\2\2\2\u0201\u01f6\3\2\2\2\u0201"+
		"\u01f7\3\2\2\2\u0201\u01f8\3\2\2\2\u0201\u01f9\3\2\2\2\u0201\u01fa\3\2"+
		"\2\2\u0201\u01fb\3\2\2\2\u0201\u01fc\3\2\2\2\u0201\u01fd\3\2\2\2\u0202"+
		"W\3\2\2\2\u0203\u0206\7\33\2\2\u0204\u0206\5Z.\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0204\3\2\2\2\u0206Y\3\2\2\2\u0207\u0208\t\5\2\2\u0208[\3\2\2\2\u0209"+
		"\u020e\5T+\2\u020a\u020b\7\67\2\2\u020b\u020d\5T+\2\u020c\u020a\3\2\2"+
		"\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f]"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\66citx}\u0082\u008d\u0095\u00a0\u00a4\u00b7"+
		"\u00be\u00c8\u00cd\u00d2\u00e9\u00ec\u00f1\u00f7\u0100\u0103\u0109\u010d"+
		"\u0116\u012e\u013f\u0143\u014d\u0154\u0158\u015b\u0161\u0167\u016d\u0172"+
		"\u0176\u017a\u0188\u0199\u019b\u01a1\u01a3\u01aa\u01ac\u01b2\u01b4\u01b7"+
		"\u01ef\u01f1\u0201\u0205\u020e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}