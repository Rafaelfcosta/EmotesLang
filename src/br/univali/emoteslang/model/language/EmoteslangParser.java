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
		RULE_functionCall = 18, RULE_parametersCall = 19, RULE_commands = 20, 
		RULE_command = 21, RULE_conditionals = 22, RULE_ifdes = 23, RULE_ifdeselse = 24, 
		RULE_ifdeselseif = 25, RULE_whiledes = 26, RULE_doWhile = 27, RULE_fordes = 28, 
		RULE_switchdes = 29, RULE_casedes = 30, RULE_defaultdes = 31, RULE_breakdes = 32, 
		RULE_returndes = 33, RULE_commandList = 34, RULE_initializeFor = 35, RULE_incrementFor = 36, 
		RULE_condition = 37, RULE_array = 38, RULE_matrix = 39, RULE_attribution = 40, 
		RULE_expression = 41, RULE_operations = 42, RULE_op_rel = 43, RULE_op_neg = 44, 
		RULE_op_bitwise = 45, RULE_op_aritmetic = 46, RULE_op_logic = 47, RULE_un_op = 48, 
		RULE_finalValue = 49, RULE_typeWithVoid = 50, RULE_type = 51, RULE_expressionList = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "declaration", "declarationVar", "declarationMatrix", 
			"initializeMatrix", "declarationArray", "initializeArray", "matrixLine", 
			"matrixCol", "arraySize", "arrayIndex", "functions", "parametersList", 
			"parameter", "paramArray", "paramMatrix", "inputAndOutput", "functionCall", 
			"parametersCall", "commands", "command", "conditionals", "ifdes", "ifdeselse", 
			"ifdeselseif", "whiledes", "doWhile", "fordes", "switchdes", "casedes", 
			"defaultdes", "breakdes", "returndes", "commandList", "initializeFor", 
			"incrementFor", "condition", "array", "matrix", "attribution", "expression", 
			"operations", "op_rel", "op_neg", "op_bitwise", "op_aritmetic", "op_logic", 
			"un_op", "finalValue", "typeWithVoid", "type", "expressionList"
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
			setState(106);
			match(START);
			setState(107);
			match(LEFT_CBRACKETS);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL))) != 0)) {
				{
				{
				setState(108);
				statements();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				functions();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			setState(119);
			match(RIGHT_CBRACKETS);
			setState(120);
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
			setState(122);
			type();
			setState(123);
			declaration();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				declaration();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(131);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				declarationVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				declarationArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
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
			setState(139);
			match(ID);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(140);
				match(ATTRIBUTION);
				setState(141);
				expression();
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
			setState(144);
			match(ID);
			setState(145);
			match(LEFT_SBRACKET);
			setState(146);
			matrixLine();
			setState(147);
			match(RIGHT_SBRACKET);
			setState(148);
			match(LEFT_SBRACKET);
			setState(149);
			matrixCol();
			setState(150);
			match(RIGHT_SBRACKET);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(151);
				match(ATTRIBUTION);
				setState(152);
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
			setState(155);
			match(LEFT_CBRACKETS);
			setState(156);
			initializeArray();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157);
				match(COMMA);
				setState(158);
				initializeArray();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(166);
			match(ID);
			setState(167);
			match(LEFT_SBRACKET);
			setState(168);
			arraySize();
			setState(169);
			match(RIGHT_SBRACKET);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTION) {
				{
				setState(170);
				match(ATTRIBUTION);
				setState(171);
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
			setState(174);
			match(LEFT_CBRACKETS);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (BIN - 26)) | (1L << (HEXA - 26)))) != 0)) {
				{
				setState(175);
				expressionList();
				}
			}

			setState(178);
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
			setState(180);
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
			setState(182);
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
			setState(184);
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
			setState(186);
			match(LEFT_SBRACKET);
			setState(187);
			expression();
			setState(188);
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
			setState(190);
			match(FUNCTION);
			setState(191);
			typeWithVoid();
			setState(192);
			match(ID);
			setState(193);
			match(LEFT_PARENTESIS);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL))) != 0)) {
				{
				setState(194);
				parametersList();
				}
			}

			setState(197);
			match(RIGHT_PARENTESIS);
			setState(198);
			match(LEFT_CBRACKETS);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << NOT) | (1L << BIT_NOT) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (BIN - 65)) | (1L << (HEXA - 65)))) != 0)) {
				{
				{
				setState(199);
				commands();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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
			setState(207);
			parameter();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(208);
				match(COMMA);
				setState(209);
				parameter();
				}
				}
				setState(214);
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
			setState(215);
			type();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BIT_AND) {
				{
				setState(216);
				match(BIT_AND);
				}
			}

			setState(219);
			match(ID);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(220);
				paramArray();
				}
				break;
			case 2:
				{
				setState(221);
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
			setState(224);
			match(LEFT_SBRACKET);
			setState(225);
			expression();
			setState(226);
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
			setState(228);
			match(LEFT_SBRACKET);
			setState(229);
			expression();
			setState(230);
			match(RIGHT_SBRACKET);
			setState(231);
			match(LEFT_SBRACKET);
			setState(232);
			expression();
			setState(233);
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
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==READ || _la==WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(236);
			match(LEFT_PARENTESIS);
			setState(237);
			parametersCall();
			setState(238);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public TerminalNode LEFT_PARENTESIS() { return getToken(EmoteslangParser.LEFT_PARENTESIS, 0); }
		public ParametersCallContext parametersCall() {
			return getRuleContext(ParametersCallContext.class,0);
		}
		public TerminalNode RIGHT_PARENTESIS() { return getToken(EmoteslangParser.RIGHT_PARENTESIS, 0); }
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
		enterRule(_localctx, 36, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ID);
			setState(241);
			match(LEFT_PARENTESIS);
			setState(242);
			parametersCall();
			setState(243);
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
		enterRule(_localctx, 38, RULE_parametersCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BOOLEAN - 26)) | (1L << (NOT - 26)) | (1L << (BIT_NOT - 26)) | (1L << (SUB - 26)) | (1L << (LEFT_PARENTESIS - 26)) | (1L << (ID - 26)) | (1L << (INT - 26)) | (1L << (DOUBLE - 26)) | (1L << (FLOAT - 26)) | (1L << (CHAR - 26)) | (1L << (STRING - 26)) | (1L << (BIN - 26)) | (1L << (HEXA - 26)))) != 0)) {
				{
				setState(245);
				expression();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(246);
					match(COMMA);
					setState(247);
					expression();
					}
					}
					setState(252);
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
		enterRule(_localctx, 40, RULE_commands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case SWITCH:
			case FOR:
			case WHILE:
			case DO:
				{
				setState(255);
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
			case NOT:
			case BIT_NOT:
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
				setState(256);
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
		enterRule(_localctx, 42, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(259);
				statements();
				}
				break;
			case 2:
				{
				setState(260);
				returndes();
				}
				break;
			case 3:
				{
				setState(261);
				breakdes();
				}
				break;
			case 4:
				{
				setState(262);
				attribution();
				}
				break;
			case 5:
				{
				setState(263);
				expression();
				}
				break;
			case 6:
				{
				setState(264);
				inputAndOutput();
				}
				break;
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_COMMA) {
				{
				setState(267);
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
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				ifdes();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				whiledes();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				doWhile();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_COMMA) {
					{
					setState(273);
					match(DOT_COMMA);
					}
				}

				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				fordes();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
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
			setState(280);
			match(IF);
			setState(281);
			match(LEFT_PARENTESIS);
			setState(282);
			expression();
			setState(283);
			match(RIGHT_PARENTESIS);
			setState(284);
			commandList();
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(285);
				ifdeselse();
				}
				break;
			case 2:
				{
				setState(286);
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
			setState(289);
			match(ELSE);
			setState(290);
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
			setState(292);
			match(ELSEIF);
			setState(293);
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
			setState(295);
			match(WHILE);
			setState(296);
			match(LEFT_PARENTESIS);
			setState(297);
			expression();
			setState(298);
			match(RIGHT_PARENTESIS);
			setState(299);
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
			setState(301);
			match(DO);
			setState(302);
			commandList();
			setState(303);
			match(WHILE);
			setState(304);
			match(LEFT_PARENTESIS);
			setState(305);
			expression();
			setState(306);
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
			setState(308);
			match(FOR);
			setState(309);
			match(LEFT_PARENTESIS);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (TP_INT - 17)) | (1L << (TP_BIN - 17)) | (1L << (TP_HEX - 17)) | (1L << (TP_DOUBLE - 17)) | (1L << (TP_FLOAT - 17)) | (1L << (TP_CHAR - 17)) | (1L << (TP_STRING - 17)) | (1L << (TP_BOOL - 17)) | (1L << (ID - 17)))) != 0)) {
				{
				setState(310);
				initializeFor();
				}
			}

			setState(313);
			match(DOT_COMMA);
			setState(314);
			condition();
			setState(315);
			match(DOT_COMMA);
			setState(316);
			incrementFor();
			setState(317);
			match(RIGHT_PARENTESIS);
			setState(318);
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
			setState(320);
			match(SWITCH);
			setState(321);
			match(LEFT_PARENTESIS);
			setState(322);
			expression();
			setState(323);
			match(RIGHT_PARENTESIS);
			setState(324);
			match(LEFT_CBRACKETS);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(325);
				casedes();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(331);
				defaultdes();
				}
			}

			setState(334);
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
			setState(336);
			match(CASE);
			setState(337);
			expression();
			setState(338);
			match(DOUBLE_DOT);
			setState(353);
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
			case NOT:
			case BIT_NOT:
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
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(339);
						commands();
						}
						} 
					}
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case LEFT_CBRACKETS:
				{
				setState(345);
				match(LEFT_CBRACKETS);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << NOT) | (1L << BIT_NOT) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (BIN - 65)) | (1L << (HEXA - 65)))) != 0)) {
					{
					{
					setState(346);
					commands();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
				match(RIGHT_CBRACKETS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(355);
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
			setState(358);
			match(DEFAULT);
			setState(359);
			match(DOUBLE_DOT);
			setState(360);
			commands();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(361);
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
			setState(364);
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
			setState(366);
			match(RETURN);
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(367);
				expression();
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
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CBRACKETS:
				{
				setState(370);
				match(LEFT_CBRACKETS);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TP_INT) | (1L << TP_BIN) | (1L << TP_HEX) | (1L << TP_DOUBLE) | (1L << TP_FLOAT) | (1L << TP_CHAR) | (1L << TP_STRING) | (1L << TP_BOOL) | (1L << BOOLEAN) | (1L << NOT) | (1L << BIT_NOT) | (1L << SUB) | (1L << LEFT_PARENTESIS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ID - 65)) | (1L << (INT - 65)) | (1L << (DOUBLE - 65)) | (1L << (FLOAT - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (BIN - 65)) | (1L << (HEXA - 65)))) != 0)) {
					{
					{
					setState(371);
					commands();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(377);
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
			case NOT:
			case BIT_NOT:
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
				setState(378);
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
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
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
				setState(382);
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
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
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
			setState(389);
			expression();
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
			setState(391);
			match(ID);
			setState(392);
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
			setState(394);
			match(ID);
			setState(395);
			arrayIndex();
			setState(396);
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
		public TerminalNode ID() { return getToken(EmoteslangParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public Un_opContext un_op() {
			return getRuleContext(Un_opContext.class,0);
		}
		public TerminalNode ATTRIBUTION() { return getToken(EmoteslangParser.ATTRIBUTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(398);
				match(ID);
				}
				break;
			case 2:
				{
				setState(399);
				array();
				}
				break;
			case 3:
				{
				setState(400);
				matrix();
				}
				break;
			}
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UN_ADD:
			case UN_SUB:
				{
				setState(403);
				un_op();
				}
				break;
			case ATTRIBUTION:
				{
				{
				setState(404);
				match(ATTRIBUTION);
				setState(405);
				expression();
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<FinalValueContext> finalValue() {
			return getRuleContexts(FinalValueContext.class);
		}
		public FinalValueContext finalValue(int i) {
			return getRuleContext(FinalValueContext.class,i);
		}
		public Op_negContext op_neg() {
			return getRuleContext(Op_negContext.class,0);
		}
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << BIT_NOT) | (1L << SUB))) != 0)) {
				{
				setState(408);
				op_neg();
				}
			}

			{
			setState(411);
			finalValue();
			}
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(412);
					operations();
					}
					{
					setState(413);
					finalValue();
					}
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class OperationsContext extends ParserRuleContext {
		public Op_relContext op_rel() {
			return getRuleContext(Op_relContext.class,0);
		}
		public Op_negContext op_neg() {
			return getRuleContext(Op_negContext.class,0);
		}
		public Op_bitwiseContext op_bitwise() {
			return getRuleContext(Op_bitwiseContext.class,0);
		}
		public Op_aritmeticContext op_aritmetic() {
			return getRuleContext(Op_aritmeticContext.class,0);
		}
		public Op_logicContext op_logic() {
			return getRuleContext(Op_logicContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operations);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				op_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				op_neg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				op_bitwise();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				op_aritmetic();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				op_logic();
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

	public static class Op_relContext extends ParserRuleContext {
		public TerminalNode BIGGERT() { return getToken(EmoteslangParser.BIGGERT, 0); }
		public TerminalNode BIGGERE() { return getToken(EmoteslangParser.BIGGERE, 0); }
		public TerminalNode SMALLERT() { return getToken(EmoteslangParser.SMALLERT, 0); }
		public TerminalNode SMALLERE() { return getToken(EmoteslangParser.SMALLERE, 0); }
		public TerminalNode EQUALS() { return getToken(EmoteslangParser.EQUALS, 0); }
		public TerminalNode DIFFERENT() { return getToken(EmoteslangParser.DIFFERENT, 0); }
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterOp_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitOp_rel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitOp_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGERT) | (1L << SMALLERT) | (1L << BIGGERE) | (1L << SMALLERE) | (1L << EQUALS) | (1L << DIFFERENT))) != 0)) ) {
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

	public static class Op_negContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(EmoteslangParser.SUB, 0); }
		public TerminalNode BIT_NOT() { return getToken(EmoteslangParser.BIT_NOT, 0); }
		public TerminalNode NOT() { return getToken(EmoteslangParser.NOT, 0); }
		public Op_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterOp_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitOp_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitOp_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_negContext op_neg() throws RecognitionException {
		Op_negContext _localctx = new Op_negContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_op_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << BIT_NOT) | (1L << SUB))) != 0)) ) {
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

	public static class Op_bitwiseContext extends ParserRuleContext {
		public TerminalNode BIT_LS() { return getToken(EmoteslangParser.BIT_LS, 0); }
		public TerminalNode BIT_RS() { return getToken(EmoteslangParser.BIT_RS, 0); }
		public TerminalNode BIT_AND() { return getToken(EmoteslangParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(EmoteslangParser.BIT_OR, 0); }
		public TerminalNode BIT_NOT() { return getToken(EmoteslangParser.BIT_NOT, 0); }
		public TerminalNode BIT_XOR() { return getToken(EmoteslangParser.BIT_XOR, 0); }
		public Op_bitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterOp_bitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitOp_bitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitOp_bitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_bitwiseContext op_bitwise() throws RecognitionException {
		Op_bitwiseContext _localctx = new Op_bitwiseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_op_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_XOR) | (1L << BIT_NOT) | (1L << BIT_RS) | (1L << BIT_LS))) != 0)) ) {
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

	public static class Op_aritmeticContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(EmoteslangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(EmoteslangParser.SUB, 0); }
		public TerminalNode MULT() { return getToken(EmoteslangParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(EmoteslangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(EmoteslangParser.MOD, 0); }
		public Op_aritmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_aritmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterOp_aritmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitOp_aritmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitOp_aritmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_aritmeticContext op_aritmetic() throws RecognitionException {
		Op_aritmeticContext _localctx = new Op_aritmeticContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_op_aritmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class Op_logicContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(EmoteslangParser.AND, 0); }
		public TerminalNode OR() { return getToken(EmoteslangParser.OR, 0); }
		public TerminalNode NOT() { return getToken(EmoteslangParser.NOT, 0); }
		public Op_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterOp_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitOp_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitOp_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logicContext op_logic() throws RecognitionException {
		Op_logicContext _localctx = new Op_logicContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_op_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
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

	public static class Un_opContext extends ParserRuleContext {
		public TerminalNode UN_ADD() { return getToken(EmoteslangParser.UN_ADD, 0); }
		public TerminalNode UN_SUB() { return getToken(EmoteslangParser.UN_SUB, 0); }
		public Un_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_un_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).enterUn_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmoteslangListener ) ((EmoteslangListener)listener).exitUn_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmoteslangVisitor ) return ((EmoteslangVisitor<? extends T>)visitor).visitUn_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Un_opContext un_op() throws RecognitionException {
		Un_opContext _localctx = new Un_opContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_un_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !(_la==UN_ADD || _la==UN_SUB) ) {
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
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
		enterRule(_localctx, 98, RULE_finalValue);
		int _la;
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
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
				setState(441);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				match(CHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(445);
				match(STRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(446);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(447);
				array();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(448);
				matrix();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(449);
				match(LEFT_PARENTESIS);
				setState(450);
				expression();
				setState(451);
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
		enterRule(_localctx, 100, RULE_typeWithVoid);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TP_VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
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
				setState(456);
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
		enterRule(_localctx, 102, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		enterRule(_localctx, 104, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(461);
			expression();
			}
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(462);
				match(COMMA);
				{
				setState(463);
				expression();
				}
				}
				}
				setState(468);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u01d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\6\2v\n"+
		"\2\r\2\16\2w\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0081\n\3\f\3\16\3\u0084"+
		"\13\3\3\3\5\3\u0087\n\3\3\4\3\4\3\4\5\4\u008c\n\4\3\5\3\5\3\5\5\5\u0091"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009c\n\6\3\7\3\7\3\7\3\7"+
		"\7\7\u00a2\n\7\f\7\16\7\u00a5\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00af\n\b\3\t\3\t\5\t\u00b3\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\16\3\16\3\16\7"+
		"\16\u00cb\n\16\f\16\16\16\u00ce\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u00d5"+
		"\n\17\f\17\16\17\u00d8\13\17\3\20\3\20\5\20\u00dc\n\20\3\20\3\20\3\20"+
		"\5\20\u00e1\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25"+
		"\u00fb\n\25\f\25\16\25\u00fe\13\25\5\25\u0100\n\25\3\26\3\26\5\26\u0104"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010c\n\27\3\27\5\27\u010f\n"+
		"\27\3\30\3\30\3\30\3\30\5\30\u0115\n\30\3\30\3\30\5\30\u0119\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0122\n\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\5\36\u013a\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u0149\n\37\f\37\16\37\u014c\13\37\3\37"+
		"\5\37\u014f\n\37\3\37\3\37\3 \3 \3 \3 \7 \u0157\n \f \16 \u015a\13 \3"+
		" \3 \7 \u015e\n \f \16 \u0161\13 \3 \5 \u0164\n \3 \5 \u0167\n \3!\3!"+
		"\3!\3!\5!\u016d\n!\3\"\3\"\3#\3#\5#\u0173\n#\3$\3$\7$\u0177\n$\f$\16$"+
		"\u017a\13$\3$\3$\5$\u017e\n$\3%\3%\5%\u0182\n%\3&\3&\5&\u0186\n&\3\'\3"+
		"\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\5*\u0194\n*\3*\3*\3*\5*\u0199\n*\3+\5"+
		"+\u019c\n+\3+\3+\3+\3+\7+\u01a2\n+\f+\16+\u01a5\13+\3,\3,\3,\3,\3,\5,"+
		"\u01ac\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01c8"+
		"\n\63\3\64\3\64\5\64\u01cc\n\64\3\65\3\65\3\66\3\66\3\66\7\66\u01d3\n"+
		"\66\f\66\16\66\u01d6\13\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\f\3\2CD\3\2\7"+
		"\b\3\2!&\5\2))--\61\61\3\2*/\3\2\60\64\3\2\')\3\2\37 \4\2DDIJ\3\2\23\32"+
		"\2\u01e5\2l\3\2\2\2\4|\3\2\2\2\6\u008b\3\2\2\2\b\u008d\3\2\2\2\n\u0092"+
		"\3\2\2\2\f\u009d\3\2\2\2\16\u00a8\3\2\2\2\20\u00b0\3\2\2\2\22\u00b6\3"+
		"\2\2\2\24\u00b8\3\2\2\2\26\u00ba\3\2\2\2\30\u00bc\3\2\2\2\32\u00c0\3\2"+
		"\2\2\34\u00d1\3\2\2\2\36\u00d9\3\2\2\2 \u00e2\3\2\2\2\"\u00e6\3\2\2\2"+
		"$\u00ed\3\2\2\2&\u00f2\3\2\2\2(\u00ff\3\2\2\2*\u0103\3\2\2\2,\u010b\3"+
		"\2\2\2.\u0118\3\2\2\2\60\u011a\3\2\2\2\62\u0123\3\2\2\2\64\u0126\3\2\2"+
		"\2\66\u0129\3\2\2\28\u012f\3\2\2\2:\u0136\3\2\2\2<\u0142\3\2\2\2>\u0152"+
		"\3\2\2\2@\u0168\3\2\2\2B\u016e\3\2\2\2D\u0170\3\2\2\2F\u017d\3\2\2\2H"+
		"\u0181\3\2\2\2J\u0185\3\2\2\2L\u0187\3\2\2\2N\u0189\3\2\2\2P\u018c\3\2"+
		"\2\2R\u0193\3\2\2\2T\u019b\3\2\2\2V\u01ab\3\2\2\2X\u01ad\3\2\2\2Z\u01af"+
		"\3\2\2\2\\\u01b1\3\2\2\2^\u01b3\3\2\2\2`\u01b5\3\2\2\2b\u01b7\3\2\2\2"+
		"d\u01c7\3\2\2\2f\u01cb\3\2\2\2h\u01cd\3\2\2\2j\u01cf\3\2\2\2lm\7\3\2\2"+
		"mq\7>\2\2np\5\4\3\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2"+
		"sq\3\2\2\2tv\5\32\16\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2"+
		"\2yz\7?\2\2z{\7\4\2\2{\3\3\2\2\2|}\5h\65\2}\u0082\5\6\4\2~\177\7\67\2"+
		"\2\177\u0081\5\6\4\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0087\78\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\5\3\2\2\2"+
		"\u0088\u008c\5\b\5\2\u0089\u008c\5\16\b\2\u008a\u008c\5\n\6\2\u008b\u0088"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\7\3\2\2\2\u008d"+
		"\u0090\7C\2\2\u008e\u008f\7\65\2\2\u008f\u0091\5T+\2\u0090\u008e\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\t\3\2\2\2\u0092\u0093\7C\2\2\u0093\u0094"+
		"\7:\2\2\u0094\u0095\5\22\n\2\u0095\u0096\7;\2\2\u0096\u0097\7:\2\2\u0097"+
		"\u0098\5\24\13\2\u0098\u009b\7;\2\2\u0099\u009a\7\65\2\2\u009a\u009c\5"+
		"\f\7\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\13\3\2\2\2\u009d"+
		"\u009e\7>\2\2\u009e\u00a3\5\20\t\2\u009f\u00a0\7\67\2\2\u00a0\u00a2\5"+
		"\20\t\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7?"+
		"\2\2\u00a7\r\3\2\2\2\u00a8\u00a9\7C\2\2\u00a9\u00aa\7:\2\2\u00aa\u00ab"+
		"\5\26\f\2\u00ab\u00ae\7;\2\2\u00ac\u00ad\7\65\2\2\u00ad\u00af\5\20\t\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\17\3\2\2\2\u00b0\u00b2"+
		"\7>\2\2\u00b1\u00b3\5j\66\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5\21\3\2\2\2\u00b6\u00b7\5\26\f"+
		"\2\u00b7\23\3\2\2\2\u00b8\u00b9\5\26\f\2\u00b9\25\3\2\2\2\u00ba\u00bb"+
		"\t\2\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\7:\2\2\u00bd\u00be\5T+\2\u00be\u00bf"+
		"\7;\2\2\u00bf\31\3\2\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\5f\64\2\u00c2"+
		"\u00c3\7C\2\2\u00c3\u00c5\7<\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c4\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7=\2\2\u00c8"+
		"\u00cc\7>\2\2\u00c9\u00cb\5*\26\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0\33\3\2\2\2\u00d1\u00d6\5\36\20"+
		"\2\u00d2\u00d3\7\67\2\2\u00d3\u00d5\5\36\20\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\35\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\5h\65\2\u00da\u00dc\7*\2\2\u00db\u00da"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\7C\2\2\u00de"+
		"\u00e1\5 \21\2\u00df\u00e1\5\"\22\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\37\3\2\2\2\u00e2\u00e3\7:\2\2\u00e3\u00e4"+
		"\5T+\2\u00e4\u00e5\7;\2\2\u00e5!\3\2\2\2\u00e6\u00e7\7:\2\2\u00e7\u00e8"+
		"\5T+\2\u00e8\u00e9\7;\2\2\u00e9\u00ea\7:\2\2\u00ea\u00eb\5T+\2\u00eb\u00ec"+
		"\7;\2\2\u00ec#\3\2\2\2\u00ed\u00ee\t\3\2\2\u00ee\u00ef\7<\2\2\u00ef\u00f0"+
		"\5(\25\2\u00f0\u00f1\7=\2\2\u00f1%\3\2\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4"+
		"\7<\2\2\u00f4\u00f5\5(\25\2\u00f5\u00f6\7=\2\2\u00f6\'\3\2\2\2\u00f7\u00fc"+
		"\5T+\2\u00f8\u00f9\7\67\2\2\u00f9\u00fb\5T+\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		")\3\2\2\2\u0101\u0104\5.\30\2\u0102\u0104\5,\27\2\u0103\u0101\3\2\2\2"+
		"\u0103\u0102\3\2\2\2\u0104+\3\2\2\2\u0105\u010c\5\4\3\2\u0106\u010c\5"+
		"D#\2\u0107\u010c\5B\"\2\u0108\u010c\5R*\2\u0109\u010c\5T+\2\u010a\u010c"+
		"\5$\23\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b"+
		"\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010e\3\2"+
		"\2\2\u010d\u010f\78\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"-\3\2\2\2\u0110\u0119\5\60\31\2\u0111\u0119\5\66\34\2\u0112\u0114\58\35"+
		"\2\u0113\u0115\78\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0119"+
		"\3\2\2\2\u0116\u0119\5:\36\2\u0117\u0119\5<\37\2\u0118\u0110\3\2\2\2\u0118"+
		"\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2"+
		"\2\2\u0119/\3\2\2\2\u011a\u011b\7\t\2\2\u011b\u011c\7<\2\2\u011c\u011d"+
		"\5T+\2\u011d\u011e\7=\2\2\u011e\u0121\5F$\2\u011f\u0122\5\62\32\2\u0120"+
		"\u0122\5\64\33\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3"+
		"\2\2\2\u0122\61\3\2\2\2\u0123\u0124\7\n\2\2\u0124\u0125\5F$\2\u0125\63"+
		"\3\2\2\2\u0126\u0127\7\13\2\2\u0127\u0128\5\60\31\2\u0128\65\3\2\2\2\u0129"+
		"\u012a\7\21\2\2\u012a\u012b\7<\2\2\u012b\u012c\5T+\2\u012c\u012d\7=\2"+
		"\2\u012d\u012e\5F$\2\u012e\67\3\2\2\2\u012f\u0130\7\22\2\2\u0130\u0131"+
		"\5F$\2\u0131\u0132\7\21\2\2\u0132\u0133\7<\2\2\u0133\u0134\5T+\2\u0134"+
		"\u0135\7=\2\2\u01359\3\2\2\2\u0136\u0137\7\20\2\2\u0137\u0139\7<\2\2\u0138"+
		"\u013a\5H%\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2"+
		"\2\u013b\u013c\78\2\2\u013c\u013d\5L\'\2\u013d\u013e\78\2\2\u013e\u013f"+
		"\5J&\2\u013f\u0140\7=\2\2\u0140\u0141\5F$\2\u0141;\3\2\2\2\u0142\u0143"+
		"\7\f\2\2\u0143\u0144\7<\2\2\u0144\u0145\5T+\2\u0145\u0146\7=\2\2\u0146"+
		"\u014a\7>\2\2\u0147\u0149\5> \2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2"+
		"\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014d\u014f\5@!\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\7?\2\2\u0151=\3\2\2\2\u0152\u0153\7\r\2\2\u0153"+
		"\u0154\5T+\2\u0154\u0163\79\2\2\u0155\u0157\5*\26\2\u0156\u0155\3\2\2"+
		"\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0164"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015f\7>\2\2\u015c\u015e\5*\26\2\u015d"+
		"\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\7?\2\2\u0163"+
		"\u0158\3\2\2\2\u0163\u015b\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0167\5B"+
		"\"\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167?\3\2\2\2\u0168\u0169"+
		"\7\17\2\2\u0169\u016a\79\2\2\u016a\u016c\5*\26\2\u016b\u016d\5B\"\2\u016c"+
		"\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016dA\3\2\2\2\u016e\u016f\7\16\2\2"+
		"\u016fC\3\2\2\2\u0170\u0172\7\5\2\2\u0171\u0173\5T+\2\u0172\u0171\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173E\3\2\2\2\u0174\u0178\7>\2\2\u0175\u0177"+
		"\5*\26\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017e\7?"+
		"\2\2\u017c\u017e\5*\26\2\u017d\u0174\3\2\2\2\u017d\u017c\3\2\2\2\u017e"+
		"G\3\2\2\2\u017f\u0182\5R*\2\u0180\u0182\5\4\3\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0180\3\2\2\2\u0182I\3\2\2\2\u0183\u0186\5T+\2\u0184\u0186\5R*\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186K\3\2\2\2\u0187\u0188\5T+\2\u0188"+
		"M\3\2\2\2\u0189\u018a\7C\2\2\u018a\u018b\5\30\r\2\u018bO\3\2\2\2\u018c"+
		"\u018d\7C\2\2\u018d\u018e\5\30\r\2\u018e\u018f\5\30\r\2\u018fQ\3\2\2\2"+
		"\u0190\u0194\7C\2\2\u0191\u0194\5N(\2\u0192\u0194\5P)\2\u0193\u0190\3"+
		"\2\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0198\3\2\2\2\u0195"+
		"\u0199\5b\62\2\u0196\u0197\7\65\2\2\u0197\u0199\5T+\2\u0198\u0195\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0199S\3\2\2\2\u019a\u019c\5Z.\2\u019b\u019a"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a3\5d\63\2\u019e"+
		"\u019f\5V,\2\u019f\u01a0\5d\63\2\u01a0\u01a2\3\2\2\2\u01a1\u019e\3\2\2"+
		"\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4U"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01ac\5X-\2\u01a7\u01ac\5Z.\2\u01a8"+
		"\u01ac\5\\/\2\u01a9\u01ac\5^\60\2\u01aa\u01ac\5`\61\2\u01ab\u01a6\3\2"+
		"\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01acW\3\2\2\2\u01ad\u01ae\t\4\2\2\u01aeY\3\2\2\2\u01af"+
		"\u01b0\t\5\2\2\u01b0[\3\2\2\2\u01b1\u01b2\t\6\2\2\u01b2]\3\2\2\2\u01b3"+
		"\u01b4\t\7\2\2\u01b4_\3\2\2\2\u01b5\u01b6\t\b\2\2\u01b6a\3\2\2\2\u01b7"+
		"\u01b8\t\t\2\2\u01b8c\3\2\2\2\u01b9\u01c8\7C\2\2\u01ba\u01c8\t\n\2\2\u01bb"+
		"\u01c8\7E\2\2\u01bc\u01c8\7F\2\2\u01bd\u01c8\7\34\2\2\u01be\u01c8\7G\2"+
		"\2\u01bf\u01c8\7H\2\2\u01c0\u01c8\5&\24\2\u01c1\u01c8\5N(\2\u01c2\u01c8"+
		"\5P)\2\u01c3\u01c4\7<\2\2\u01c4\u01c5\5T+\2\u01c5\u01c6\7=\2\2\u01c6\u01c8"+
		"\3\2\2\2\u01c7\u01b9\3\2\2\2\u01c7\u01ba\3\2\2\2\u01c7\u01bb\3\2\2\2\u01c7"+
		"\u01bc\3\2\2\2\u01c7\u01bd\3\2\2\2\u01c7\u01be\3\2\2\2\u01c7\u01bf\3\2"+
		"\2\2\u01c7\u01c0\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c7"+
		"\u01c3\3\2\2\2\u01c8e\3\2\2\2\u01c9\u01cc\7\33\2\2\u01ca\u01cc\5h\65\2"+
		"\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01ccg\3\2\2\2\u01cd\u01ce\t"+
		"\13\2\2\u01cei\3\2\2\2\u01cf\u01d4\5T+\2\u01d0\u01d1\7\67\2\2\u01d1\u01d3"+
		"\5T+\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5k\3\2\2\2\u01d6\u01d4\3\2\2\2.qw\u0082\u0086\u008b"+
		"\u0090\u009b\u00a3\u00ae\u00b2\u00c5\u00cc\u00d6\u00db\u00e0\u00fc\u00ff"+
		"\u0103\u010b\u010e\u0114\u0118\u0121\u0139\u014a\u014e\u0158\u015f\u0163"+
		"\u0166\u016c\u0172\u0178\u017d\u0181\u0185\u0193\u0198\u019b\u01a3\u01ab"+
		"\u01c7\u01cb\u01d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}