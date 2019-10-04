// Generated from .\Emoteslang.g4 by ANTLR 4.7.2
package br.univali.emoteslang.model.language;
import br.univali.emoteslang.model.visitor.EmoteslangVisitor;
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
		RULE_ifdes = 22, RULE_ifdeselseif = 23, RULE_whiledes = 24, RULE_doWhile = 25, 
		RULE_fordes = 26, RULE_switchdes = 27, RULE_casedes = 28, RULE_defaultdes = 29, 
		RULE_breakdes = 30, RULE_returndes = 31, RULE_commandList = 32, RULE_initializeFor = 33, 
		RULE_incrementFor = 34, RULE_condition = 35, RULE_attribution = 36, RULE_expression = 37, 
		RULE_typeWithVoid = 38, RULE_type = 39, RULE_expressionList = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "declaration", "declarationVar", "declarationMatrix", 
			"initializeMatrix", "declarationArray", "initializeArray", "matrixLine", 
			"matrixCol", "arraySize", "arrayIndex", "functions", "parametersList", 
			"parameter", "paramArray", "paramMatrix", "inputAndOutput", "parametersCall", 
			"commands", "command", "conditionals", "ifdes", "ifdeselseif", "whiledes", 
			"doWhile", "fordes", "switchdes", "casedes", "defaultdes", "breakdes", 
			"returndes", "commandList", "initializeFor", "incrementFor", "condition", 
			"attribution", "expression", "typeWithVoid", "type", "expressionList"
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
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public TerminalNode RIGHT_CBRACKETS() { return getToken(EmoteslangParser.RIGHT_CBRACKETS, 0); }
		public TerminalNode FINISH() { return getToken(EmoteslangParser.FINISH, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
			setState(82);
			match(START);
			setState(83);
			match(LEFT_CBRACKETS);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL))) != 0)) {
				{
				{
				setState(84);
				statements();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			functions();
			setState(91);
			match(RIGHT_CBRACKETS);
			setState(92);
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
			setState(94);
			type();
			setState(95);
			declaration();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				declaration();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(103);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				declarationVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				declarationArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
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
			setState(111);
			match(ID);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(112);
				match(ATTRIBUTION);
				setState(113);
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
			setState(116);
			match(ID);
			setState(117);
			match(LEFT_SBRACKET);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==INT) {
				{
				setState(118);
				matrixLine();
				}
			}

			setState(121);
			match(RIGHT_SBRACKET);
			setState(122);
			match(LEFT_SBRACKET);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==INT) {
				{
				setState(123);
				matrixCol();
				}
			}

			setState(126);
			match(RIGHT_SBRACKET);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(127);
				match(ATTRIBUTION);
				setState(128);
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
			setState(131);
			match(LEFT_CBRACKETS);
			setState(132);
			initializeArray();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(133);
				match(COMMA);
				setState(134);
				initializeArray();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
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
			setState(142);
			match(ID);
			setState(143);
			match(LEFT_SBRACKET);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==INT) {
				{
				setState(144);
				arraySize();
				}
			}

			setState(147);
			match(RIGHT_SBRACKET);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(148);
				match(ATTRIBUTION);
				setState(149);
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
			setState(152);
			match(LEFT_CBRACKETS);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (UN_ADD - 26)) | (1L << (UN_SUB - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (BIN - 26)) | (1L << (HEXA - 26)))) != 0)) {
				{
				setState(153);
				expressionList();
				}
			}

			setState(156);
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
			setState(160);
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
			setState(162);
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
			setState(164);
			match(LEFT_SBRACKET);
			setState(165);
			expression(0);
			setState(166);
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
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(168);
			match(FUNCTION);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << TP_VOID))) != 0)) {
				{
				setState(169);
				typeWithVoid();
				}
			}

			setState(172);
			match(ID);
			setState(173);
			match(LEFT_PARENTESIS);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL))) != 0)) {
				{
				setState(174);
				parametersList();
				}
			}

			setState(177);
			match(RIGHT_PARENTESIS);
			setState(178);
			match(LEFT_CBRACKETS);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << UN_ADD) | (1L << UN_SUB) | (1L << NOT) | (1L << BIT_NOT) | (1L << ADD) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (BIN - 65)) | (1L << (HEXA - 65)))) != 0)) {
				{
				{
				setState(179);
				commands();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(RIGHT_CBRACKETS);
			}
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					functions();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
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
			setState(213);
			match(LEFT_SBRACKET);
			setState(214);
			match(RIGHT_SBRACKET);
			setState(215);
			match(LEFT_SBRACKET);
			setState(216);
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
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==READ || _la==WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			match(LEFT_PARENTESIS);
			setState(220);
			parametersCall();
			setState(221);
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
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (UN_ADD - 26)) | (1L << (UN_SUB - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (BIN - 26)) | (1L << (HEXA - 26)))) != 0)) {
				{
				setState(223);
				expression(0);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(224);
					match(COMMA);
					setState(225);
					expression(0);
					}
					}
					setState(230);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_commands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case SWITCH:
			case FOR:
			case WHILE:
			case DO:
				{
				setState(233);
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
				setState(234);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(237);
				statements();
				}
				break;
			case 2:
				{
				setState(238);
				returndes();
				}
				break;
			case 3:
				{
				setState(239);
				breakdes();
				}
				break;
			case 4:
				{
				setState(240);
				attribution();
				}
				break;
			case 5:
				{
				setState(241);
				expression(0);
				}
				break;
			case 6:
				{
				setState(242);
				inputAndOutput();
				}
				break;
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_COMMA) {
				{
				setState(245);
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
		enterRule(_localctx, 42, RULE_conditionals);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				ifdes();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				whiledes();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				doWhile();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_COMMA) {
					{
					setState(251);
					match(DOT_COMMA);
					}
				}

				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				fordes();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
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
		enterRule(_localctx, 44, RULE_ifdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IF);
			setState(259);
			match(LEFT_PARENTESIS);
			setState(260);
			expression(0);
			setState(261);
			match(RIGHT_PARENTESIS);
			setState(262);
			commandList();
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(263);
				match(ELSE);
				setState(264);
				commandList();
				}
				break;
			case 2:
				{
				setState(265);
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
		enterRule(_localctx, 46, RULE_ifdeselseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ELSEIF);
			setState(269);
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
		enterRule(_localctx, 48, RULE_whiledes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(WHILE);
			setState(272);
			match(LEFT_PARENTESIS);
			setState(273);
			expression(0);
			setState(274);
			match(RIGHT_PARENTESIS);
			setState(275);
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
		enterRule(_localctx, 50, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(DO);
			setState(278);
			commandList();
			setState(279);
			match(WHILE);
			setState(280);
			match(LEFT_PARENTESIS);
			setState(281);
			expression(0);
			setState(282);
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
		enterRule(_localctx, 52, RULE_fordes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(FOR);
			setState(285);
			match(LEFT_PARENTESIS);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (TP_INT - 17)) | (1L << (TP_BIN - 17)) | (1L << (TP_HEX - 17)) | (1L << (TP_DOUBLE - 17)) | (1L << (TP_FLOAT - 17)) | (1L << (TP_CHAR - 17)) | (1L << (TP_STRING - 17)) | (1L << (TP_BOOL - 17)) | (1L << (BOOLEAN - 17)) | (1L << (UN_ADD - 17)) | (1L << (UN_SUB - 17)) | (1L << (NOT - 17)) | (1L << (BIT_NOT - 17)) | (1L << (ADD - 17)) | (1L << (SUB - 17)) | (1L << (LEFT_PARENTESIS - 17)) | (1L << (ID - 17)) | (1L << (INT - 17)) | (1L << (DOUBLE - 17)) | (1L << (FLOAT - 17)) | (1L << (CHAR - 17)) | (1L << (STRING - 17)) | (1L << (BIN - 17)) | (1L << (HEXA - 17)))) != 0)) {
				{
				setState(286);
				initializeFor();
				}
			}

			setState(289);
			match(DOT_COMMA);
			setState(290);
			condition();
			setState(291);
			match(DOT_COMMA);
			setState(292);
			incrementFor();
			setState(293);
			match(RIGHT_PARENTESIS);
			setState(294);
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
		enterRule(_localctx, 54, RULE_switchdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(SWITCH);
			setState(297);
			match(LEFT_PARENTESIS);
			setState(298);
			expression(0);
			setState(299);
			match(RIGHT_PARENTESIS);
			setState(300);
			match(LEFT_CBRACKETS);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(301);
				casedes();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(307);
				defaultdes();
				}
			}

			setState(310);
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
		enterRule(_localctx, 56, RULE_casedes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(CASE);
			setState(313);
			expression(0);
			setState(314);
			match(DOUBLE_DOT);
			setState(329);
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
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315);
						commands();
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case LEFT_CBRACKETS:
				{
				setState(321);
				match(LEFT_CBRACKETS);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << UN_ADD) | (1L << UN_SUB) | (1L << NOT) | (1L << BIT_NOT) | (1L << ADD) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (BIN - 65)) | (1L << (HEXA - 65)))) != 0)) {
					{
					{
					setState(322);
					commands();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(RIGHT_CBRACKETS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(331);
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
		enterRule(_localctx, 58, RULE_defaultdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(DEFAULT);
			setState(335);
			match(DOUBLE_DOT);
			setState(336);
			commands();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(337);
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
		enterRule(_localctx, 60, RULE_breakdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		enterRule(_localctx, 62, RULE_returndes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(RETURN);
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(343);
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
		enterRule(_localctx, 64, RULE_commandList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CBRACKETS:
				{
				setState(346);
				match(LEFT_CBRACKETS);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << UN_ADD) | (1L << UN_SUB) | (1L << NOT) | (1L << BIT_NOT) | (1L << ADD) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (BIN - 65)) | (1L << (HEXA - 65)))) != 0)) {
					{
					{
					setState(347);
					commands();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(353);
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
				setState(354);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitInitializeFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeForContext initializeFor() throws RecognitionException {
		InitializeForContext _localctx = new InitializeForContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_initializeFor);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				attribution();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitIncrementFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementForContext incrementFor() throws RecognitionException {
		IncrementForContext _localctx = new IncrementForContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_incrementFor);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
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
		enterRule(_localctx, 70, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			expression(0);
			setState(369);
			match(ATTRIBUTION);
			setState(370);
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
		public TerminalNode BIN() { return getToken(EmoteslangParser.BIN, 0); }
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(373);
				match(ID);
				setState(374);
				match(LEFT_PARENTESIS);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (UN_ADD - 26)) | (1L << (UN_SUB - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (BIN - 26)) | (1L << (HEXA - 26)))) != 0)) {
					{
					setState(375);
					expressionList();
					}
				}

				setState(378);
				match(RIGHT_PARENTESIS);
				}
				break;
			case 2:
				{
				setState(379);
				match(ID);
				setState(380);
				arrayIndex();
				}
				break;
			case 3:
				{
				setState(381);
				match(ID);
				setState(382);
				arrayIndex();
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(383);
					arrayIndex();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(386);
				match(ADD);
				setState(387);
				expression(34);
				}
				break;
			case 5:
				{
				setState(388);
				match(SUB);
				setState(389);
				expression(33);
				}
				break;
			case 6:
				{
				setState(390);
				match(NOT);
				setState(391);
				expression(32);
				}
				break;
			case 7:
				{
				setState(392);
				match(BIT_NOT);
				setState(393);
				expression(31);
				}
				break;
			case 8:
				{
				setState(394);
				match(ID);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(395);
					arrayIndex();
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						setState(396);
						arrayIndex();
						}
					}

					}
				}

				setState(401);
				match(UN_ADD);
				}
				break;
			case 9:
				{
				setState(402);
				match(ID);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(403);
					arrayIndex();
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						setState(404);
						arrayIndex();
						}
					}

					}
				}

				setState(409);
				match(UN_SUB);
				}
				break;
			case 10:
				{
				setState(410);
				match(UN_ADD);
				setState(411);
				match(ID);
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(412);
					arrayIndex();
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(413);
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
				setState(418);
				match(UN_SUB);
				setState(419);
				match(ID);
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(420);
					arrayIndex();
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(421);
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
				setState(426);
				match(ID);
				}
				break;
			case 13:
				{
				setState(427);
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
			case 14:
				{
				setState(428);
				match(DOUBLE);
				}
				break;
			case 15:
				{
				setState(429);
				match(FLOAT);
				}
				break;
			case 16:
				{
				setState(430);
				match(BOOLEAN);
				}
				break;
			case 17:
				{
				setState(431);
				match(CHAR);
				}
				break;
			case 18:
				{
				setState(432);
				match(STRING);
				}
				break;
			case 19:
				{
				setState(433);
				match(LEFT_PARENTESIS);
				setState(434);
				expression(0);
				setState(435);
				match(RIGHT_PARENTESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(493);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(439);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(440);
						match(MULT);
						setState(441);
						expression(27);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(442);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(443);
						match(DIV);
						setState(444);
						expression(26);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(445);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(446);
						match(MOD);
						setState(447);
						expression(25);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(448);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(449);
						match(ADD);
						setState(450);
						expression(24);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(451);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(452);
						match(SUB);
						setState(453);
						expression(23);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(454);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(455);
						match(EQUALS);
						setState(456);
						expression(22);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(457);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(458);
						match(DIFFERENT);
						setState(459);
						expression(21);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(460);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(461);
						match(BIGGERT);
						setState(462);
						expression(20);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(463);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(464);
						match(SMALLERT);
						setState(465);
						expression(19);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(466);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(467);
						match(SMALLERE);
						setState(468);
						expression(18);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(469);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(470);
						match(BIGGERE);
						setState(471);
						expression(17);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(472);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(473);
						match(AND);
						setState(474);
						expression(16);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(475);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(476);
						match(OR);
						setState(477);
						expression(15);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(478);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(479);
						match(BIT_XOR);
						setState(480);
						expression(14);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(481);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(482);
						match(BIT_LS);
						setState(483);
						expression(13);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(484);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(485);
						match(BIT_RS);
						setState(486);
						expression(12);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(487);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(488);
						match(BIT_AND);
						setState(489);
						expression(11);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(490);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(491);
						match(BIT_OR);
						setState(492);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(497);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitTypeWithVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeWithVoidContext typeWithVoid() throws RecognitionException {
		TypeWithVoidContext _localctx = new TypeWithVoidContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeWithVoid);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TP_VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
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
				setState(499);
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
		enterRule(_localctx, 78, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		enterRule(_localctx, 80, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(504);
			expression(0);
			}
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(505);
				match(COMMA);
				{
				setState(506);
				expression(0);
				}
				}
				}
				setState(511);
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
		case 37:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u0203\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3e\n\3"+
		"\f\3\16\3h\13\3\3\3\5\3k\n\3\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\5\5u\n\5"+
		"\3\6\3\6\3\6\5\6z\n\6\3\6\3\6\3\6\5\6\177\n\6\3\6\3\6\3\6\5\6\u0084\n"+
		"\6\3\7\3\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\7\3\7\3\b\3\b\3"+
		"\b\5\b\u0094\n\b\3\b\3\b\3\b\5\b\u0099\n\b\3\t\3\t\5\t\u009d\n\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00ad\n\16"+
		"\3\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16\3\16\7\16\u00b7\n\16\f\16\16"+
		"\16\u00ba\13\16\3\16\3\16\3\16\7\16\u00bf\n\16\f\16\16\16\u00c2\13\16"+
		"\3\17\3\17\3\17\7\17\u00c7\n\17\f\17\16\17\u00ca\13\17\3\20\3\20\5\20"+
		"\u00ce\n\20\3\20\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00e5\n\24"+
		"\f\24\16\24\u00e8\13\24\5\24\u00ea\n\24\3\25\3\25\5\25\u00ee\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00f6\n\26\3\26\5\26\u00f9\n\26\3\27\3"+
		"\27\3\27\3\27\5\27\u00ff\n\27\3\27\3\27\5\27\u0103\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u010d\n\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34"+
		"\u0122\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u0131\n\35\f\35\16\35\u0134\13\35\3\35\5\35\u0137\n\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\7\36\u013f\n\36\f\36\16\36\u0142\13\36\3\36"+
		"\3\36\7\36\u0146\n\36\f\36\16\36\u0149\13\36\3\36\5\36\u014c\n\36\3\36"+
		"\5\36\u014f\n\36\3\37\3\37\3\37\3\37\5\37\u0155\n\37\3 \3 \3!\3!\5!\u015b"+
		"\n!\3\"\3\"\7\"\u015f\n\"\f\"\16\"\u0162\13\"\3\"\3\"\5\"\u0166\n\"\3"+
		"#\3#\3#\5#\u016b\n#\3$\3$\5$\u016f\n$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\5\'\u017b\n\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0183\n\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0190\n\'\5\'\u0192\n\'\3\'\3\'\3\'\3"+
		"\'\5\'\u0198\n\'\5\'\u019a\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u01a1\n\'\5\'\u01a3"+
		"\n\'\3\'\3\'\3\'\3\'\5\'\u01a9\n\'\5\'\u01ab\n\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u01b8\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01f0\n\'\f\'\16\'\u01f3"+
		"\13\'\3(\3(\5(\u01f7\n(\3)\3)\3*\3*\3*\7*\u01fe\n*\f*\16*\u0201\13*\3"+
		"*\2\3L+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPR\2\6\3\2CD\3\2\7\b\4\2DDIJ\3\2\23\32\2\u023c\2T\3\2\2\2\4"+
		"`\3\2\2\2\6o\3\2\2\2\bq\3\2\2\2\nv\3\2\2\2\f\u0085\3\2\2\2\16\u0090\3"+
		"\2\2\2\20\u009a\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2"+
		"\2\2\30\u00a6\3\2\2\2\32\u00aa\3\2\2\2\34\u00c3\3\2\2\2\36\u00cb\3\2\2"+
		"\2 \u00d4\3\2\2\2\"\u00d7\3\2\2\2$\u00dc\3\2\2\2&\u00e9\3\2\2\2(\u00ed"+
		"\3\2\2\2*\u00f5\3\2\2\2,\u0102\3\2\2\2.\u0104\3\2\2\2\60\u010e\3\2\2\2"+
		"\62\u0111\3\2\2\2\64\u0117\3\2\2\2\66\u011e\3\2\2\28\u012a\3\2\2\2:\u013a"+
		"\3\2\2\2<\u0150\3\2\2\2>\u0156\3\2\2\2@\u0158\3\2\2\2B\u0165\3\2\2\2D"+
		"\u016a\3\2\2\2F\u016e\3\2\2\2H\u0170\3\2\2\2J\u0172\3\2\2\2L\u01b7\3\2"+
		"\2\2N\u01f6\3\2\2\2P\u01f8\3\2\2\2R\u01fa\3\2\2\2TU\7\3\2\2UY\7>\2\2V"+
		"X\5\4\3\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2"+
		"\\]\5\32\16\2]^\7?\2\2^_\7\4\2\2_\3\3\2\2\2`a\5P)\2af\5\6\4\2bc\7\67\2"+
		"\2ce\5\6\4\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2"+
		"\2ik\78\2\2ji\3\2\2\2jk\3\2\2\2k\5\3\2\2\2lp\5\b\5\2mp\5\16\b\2np\5\n"+
		"\6\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\7\3\2\2\2qt\7C\2\2rs\7\65\2\2su\5"+
		"L\'\2tr\3\2\2\2tu\3\2\2\2u\t\3\2\2\2vw\7C\2\2wy\7:\2\2xz\5\22\n\2yx\3"+
		"\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7;\2\2|~\7:\2\2}\177\5\24\13\2~}\3\2\2\2"+
		"~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\7;\2\2\u0081\u0082\7\65\2"+
		"\2\u0082\u0084\5\f\7\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\13"+
		"\3\2\2\2\u0085\u0086\7>\2\2\u0086\u008b\5\20\t\2\u0087\u0088\7\67\2\2"+
		"\u0088\u008a\5\20\t\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7?\2\2\u008f\r\3\2\2\2\u0090\u0091\7C\2\2\u0091\u0093\7:\2\2\u0092"+
		"\u0094\5\26\f\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0098\7;\2\2\u0096\u0097\7\65\2\2\u0097\u0099\5\20\t\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\17\3\2\2\2\u009a\u009c\7>\2\2"+
		"\u009b\u009d\5R*\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\7?\2\2\u009f\21\3\2\2\2\u00a0\u00a1\5\26\f\2\u00a1"+
		"\23\3\2\2\2\u00a2\u00a3\5\26\f\2\u00a3\25\3\2\2\2\u00a4\u00a5\t\2\2\2"+
		"\u00a5\27\3\2\2\2\u00a6\u00a7\7:\2\2\u00a7\u00a8\5L\'\2\u00a8\u00a9\7"+
		";\2\2\u00a9\31\3\2\2\2\u00aa\u00ac\7\6\2\2\u00ab\u00ad\5N(\2\u00ac\u00ab"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7C\2\2\u00af"+
		"\u00b1\7<\2\2\u00b0\u00b2\5\34\17\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7=\2\2\u00b4\u00b8\7>\2\2\u00b5"+
		"\u00b7\5(\25\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7?\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\5\32\16\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\33\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c8\5\36\20\2\u00c4\u00c5\7\67"+
		"\2\2\u00c5\u00c7\5\36\20\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\35\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb\u00cd\5P)\2\u00cc\u00ce\7*\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\7C\2\2\u00d0\u00d3\5 \21\2\u00d1"+
		"\u00d3\5\"\22\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7:\2\2\u00d5\u00d6\7;\2\2\u00d6!\3"+
		"\2\2\2\u00d7\u00d8\7:\2\2\u00d8\u00d9\7;\2\2\u00d9\u00da\7:\2\2\u00da"+
		"\u00db\7;\2\2\u00db#\3\2\2\2\u00dc\u00dd\t\3\2\2\u00dd\u00de\7<\2\2\u00de"+
		"\u00df\5&\24\2\u00df\u00e0\7=\2\2\u00e0%\3\2\2\2\u00e1\u00e6\5L\'\2\u00e2"+
		"\u00e3\7\67\2\2\u00e3\u00e5\5L\'\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\'\3\2\2\2"+
		"\u00eb\u00ee\5,\27\2\u00ec\u00ee\5*\26\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee)\3\2\2\2\u00ef\u00f6\5\4\3\2\u00f0\u00f6\5@!\2\u00f1\u00f6"+
		"\5> \2\u00f2\u00f6\5J&\2\u00f3\u00f6\5L\'\2\u00f4\u00f6\5$\23\2\u00f5"+
		"\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f9\78\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9+\3\2\2\2\u00fa"+
		"\u0103\5.\30\2\u00fb\u0103\5\62\32\2\u00fc\u00fe\5\64\33\2\u00fd\u00ff"+
		"\78\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0103\3\2\2\2\u0100"+
		"\u0103\5\66\34\2\u0101\u0103\58\35\2\u0102\u00fa\3\2\2\2\u0102\u00fb\3"+
		"\2\2\2\u0102\u00fc\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103"+
		"-\3\2\2\2\u0104\u0105\7\t\2\2\u0105\u0106\7<\2\2\u0106\u0107\5L\'\2\u0107"+
		"\u0108\7=\2\2\u0108\u010c\5B\"\2\u0109\u010a\7\n\2\2\u010a\u010d\5B\""+
		"\2\u010b\u010d\5\60\31\2\u010c\u0109\3\2\2\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d/\3\2\2\2\u010e\u010f\7\13\2\2\u010f\u0110\5.\30\2"+
		"\u0110\61\3\2\2\2\u0111\u0112\7\21\2\2\u0112\u0113\7<\2\2\u0113\u0114"+
		"\5L\'\2\u0114\u0115\7=\2\2\u0115\u0116\5B\"\2\u0116\63\3\2\2\2\u0117\u0118"+
		"\7\22\2\2\u0118\u0119\5B\"\2\u0119\u011a\7\21\2\2\u011a\u011b\7<\2\2\u011b"+
		"\u011c\5L\'\2\u011c\u011d\7=\2\2\u011d\65\3\2\2\2\u011e\u011f\7\20\2\2"+
		"\u011f\u0121\7<\2\2\u0120\u0122\5D#\2\u0121\u0120\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\78\2\2\u0124\u0125\5H%\2\u0125"+
		"\u0126\78\2\2\u0126\u0127\5F$\2\u0127\u0128\7=\2\2\u0128\u0129\5B\"\2"+
		"\u0129\67\3\2\2\2\u012a\u012b\7\f\2\2\u012b\u012c\7<\2\2\u012c\u012d\5"+
		"L\'\2\u012d\u012e\7=\2\2\u012e\u0132\7>\2\2\u012f\u0131\5:\36\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\5<\37\2\u0136"+
		"\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7?"+
		"\2\2\u01399\3\2\2\2\u013a\u013b\7\r\2\2\u013b\u013c\5L\'\2\u013c\u014b"+
		"\79\2\2\u013d\u013f\5(\25\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u014c\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0143\u0147\7>\2\2\u0144\u0146\5(\25\2\u0145\u0144\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u014c\7?\2\2\u014b\u0140\3\2\2\2\u014b"+
		"\u0143\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014f\5> \2\u014e\u014d\3\2\2"+
		"\2\u014e\u014f\3\2\2\2\u014f;\3\2\2\2\u0150\u0151\7\17\2\2\u0151\u0152"+
		"\79\2\2\u0152\u0154\5(\25\2\u0153\u0155\5> \2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155=\3\2\2\2\u0156\u0157\7\16\2\2\u0157?\3\2\2\2\u0158"+
		"\u015a\7\5\2\2\u0159\u015b\5L\'\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015bA\3\2\2\2\u015c\u0160\7>\2\2\u015d\u015f\5(\25\2\u015e\u015d"+
		"\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0166\7?\2\2\u0164\u0166\5(\25"+
		"\2\u0165\u015c\3\2\2\2\u0165\u0164\3\2\2\2\u0166C\3\2\2\2\u0167\u016b"+
		"\5J&\2\u0168\u016b\5\4\3\2\u0169\u016b\7C\2\2\u016a\u0167\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016bE\3\2\2\2\u016c\u016f\5L\'\2\u016d"+
		"\u016f\5J&\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016fG\3\2\2\2\u0170"+
		"\u0171\5L\'\2\u0171I\3\2\2\2\u0172\u0173\5L\'\2\u0173\u0174\7\65\2\2\u0174"+
		"\u0175\5L\'\2\u0175K\3\2\2\2\u0176\u0177\b\'\1\2\u0177\u0178\7C\2\2\u0178"+
		"\u017a\7<\2\2\u0179\u017b\5R*\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2"+
		"\2\u017b\u017c\3\2\2\2\u017c\u01b8\7=\2\2\u017d\u017e\7C\2\2\u017e\u01b8"+
		"\5\30\r\2\u017f\u0180\7C\2\2\u0180\u0182\5\30\r\2\u0181\u0183\5\30\r\2"+
		"\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u01b8\3\2\2\2\u0184\u0185"+
		"\7\60\2\2\u0185\u01b8\5L\'$\u0186\u0187\7\61\2\2\u0187\u01b8\5L\'#\u0188"+
		"\u0189\7)\2\2\u0189\u01b8\5L\'\"\u018a\u018b\7-\2\2\u018b\u01b8\5L\'!"+
		"\u018c\u0191\7C\2\2\u018d\u018f\5\30\r\2\u018e\u0190\5\30\r\2\u018f\u018e"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018d\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u01b8\7\37\2\2\u0194\u0199\7"+
		"C\2\2\u0195\u0197\5\30\r\2\u0196\u0198\5\30\r\2\u0197\u0196\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0195\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u01b8\7 \2\2\u019c\u019d\7\37\2\2\u019d"+
		"\u01a2\7C\2\2\u019e\u01a0\5\30\r\2\u019f\u01a1\5\30\r\2\u01a0\u019f\3"+
		"\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019e\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01b8\3\2\2\2\u01a4\u01a5\7 \2\2\u01a5\u01aa\7C\2"+
		"\2\u01a6\u01a8\5\30\r\2\u01a7\u01a9\5\30\r\2\u01a8\u01a7\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01b8\3\2\2\2\u01ac\u01b8\7C\2\2\u01ad\u01b8\t\4\2\2\u01ae"+
		"\u01b8\7E\2\2\u01af\u01b8\7F\2\2\u01b0\u01b8\7\34\2\2\u01b1\u01b8\7G\2"+
		"\2\u01b2\u01b8\7H\2\2\u01b3\u01b4\7<\2\2\u01b4\u01b5\5L\'\2\u01b5\u01b6"+
		"\7=\2\2\u01b6\u01b8\3\2\2\2\u01b7\u0176\3\2\2\2\u01b7\u017d\3\2\2\2\u01b7"+
		"\u017f\3\2\2\2\u01b7\u0184\3\2\2\2\u01b7\u0186\3\2\2\2\u01b7\u0188\3\2"+
		"\2\2\u01b7\u018a\3\2\2\2\u01b7\u018c\3\2\2\2\u01b7\u0194\3\2\2\2\u01b7"+
		"\u019c\3\2\2\2\u01b7\u01a4\3\2\2\2\u01b7\u01ac\3\2\2\2\u01b7\u01ad\3\2"+
		"\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b7"+
		"\u01b1\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8\u01f1\3\2"+
		"\2\2\u01b9\u01ba\f\34\2\2\u01ba\u01bb\7\62\2\2\u01bb\u01f0\5L\'\35\u01bc"+
		"\u01bd\f\33\2\2\u01bd\u01be\7\63\2\2\u01be\u01f0\5L\'\34\u01bf\u01c0\f"+
		"\32\2\2\u01c0\u01c1\7\64\2\2\u01c1\u01f0\5L\'\33\u01c2\u01c3\f\31\2\2"+
		"\u01c3\u01c4\7\60\2\2\u01c4\u01f0\5L\'\32\u01c5\u01c6\f\30\2\2\u01c6\u01c7"+
		"\7\61\2\2\u01c7\u01f0\5L\'\31\u01c8\u01c9\f\27\2\2\u01c9\u01ca\7%\2\2"+
		"\u01ca\u01f0\5L\'\30\u01cb\u01cc\f\26\2\2\u01cc\u01cd\7&\2\2\u01cd\u01f0"+
		"\5L\'\27\u01ce\u01cf\f\25\2\2\u01cf\u01d0\7!\2\2\u01d0\u01f0\5L\'\26\u01d1"+
		"\u01d2\f\24\2\2\u01d2\u01d3\7\"\2\2\u01d3\u01f0\5L\'\25\u01d4\u01d5\f"+
		"\23\2\2\u01d5\u01d6\7$\2\2\u01d6\u01f0\5L\'\24\u01d7\u01d8\f\22\2\2\u01d8"+
		"\u01d9\7#\2\2\u01d9\u01f0\5L\'\23\u01da\u01db\f\21\2\2\u01db\u01dc\7\'"+
		"\2\2\u01dc\u01f0\5L\'\22\u01dd\u01de\f\20\2\2\u01de\u01df\7(\2\2\u01df"+
		"\u01f0\5L\'\21\u01e0\u01e1\f\17\2\2\u01e1\u01e2\7,\2\2\u01e2\u01f0\5L"+
		"\'\20\u01e3\u01e4\f\16\2\2\u01e4\u01e5\7/\2\2\u01e5\u01f0\5L\'\17\u01e6"+
		"\u01e7\f\r\2\2\u01e7\u01e8\7.\2\2\u01e8\u01f0\5L\'\16\u01e9\u01ea\f\f"+
		"\2\2\u01ea\u01eb\7*\2\2\u01eb\u01f0\5L\'\r\u01ec\u01ed\f\13\2\2\u01ed"+
		"\u01ee\7+\2\2\u01ee\u01f0\5L\'\f\u01ef\u01b9\3\2\2\2\u01ef\u01bc\3\2\2"+
		"\2\u01ef\u01bf\3\2\2\2\u01ef\u01c2\3\2\2\2\u01ef\u01c5\3\2\2\2\u01ef\u01c8"+
		"\3\2\2\2\u01ef\u01cb\3\2\2\2\u01ef\u01ce\3\2\2\2\u01ef\u01d1\3\2\2\2\u01ef"+
		"\u01d4\3\2\2\2\u01ef\u01d7\3\2\2\2\u01ef\u01da\3\2\2\2\u01ef\u01dd\3\2"+
		"\2\2\u01ef\u01e0\3\2\2\2\u01ef\u01e3\3\2\2\2\u01ef\u01e6\3\2\2\2\u01ef"+
		"\u01e9\3\2\2\2\u01ef\u01ec\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2M\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7"+
		"\7\33\2\2\u01f5\u01f7\5P)\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"O\3\2\2\2\u01f8\u01f9\t\5\2\2\u01f9Q\3\2\2\2\u01fa\u01ff\5L\'\2\u01fb"+
		"\u01fc\7\67\2\2\u01fc\u01fe\5L\'\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\3\2"+
		"\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200S\3\2\2\2\u0201\u01ff"+
		"\3\2\2\29Yfjoty~\u0083\u008b\u0093\u0098\u009c\u00ac\u00b1\u00b8\u00c0"+
		"\u00c8\u00cd\u00d2\u00e6\u00e9\u00ed\u00f5\u00f8\u00fe\u0102\u010c\u0121"+
		"\u0132\u0136\u0140\u0147\u014b\u014e\u0154\u015a\u0160\u0165\u016a\u016e"+
		"\u017a\u0182\u018f\u0191\u0197\u0199\u01a0\u01a2\u01a8\u01aa\u01b7\u01ef"+
		"\u01f1\u01f6\u01ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}