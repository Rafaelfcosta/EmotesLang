// Generated from .\Emoteslang.g4 by ANTLR 4.7.2
package br.univali.emoteslang.model.language;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EmoteslangParser}.
 */
public interface EmoteslangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EmoteslangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EmoteslangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(EmoteslangParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(EmoteslangParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EmoteslangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EmoteslangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#declarationVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationVar(EmoteslangParser.DeclarationVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#declarationVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationVar(EmoteslangParser.DeclarationVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#declarationMatrix}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationMatrix(EmoteslangParser.DeclarationMatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#declarationMatrix}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationMatrix(EmoteslangParser.DeclarationMatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#initializeMatrix}.
	 * @param ctx the parse tree
	 */
	void enterInitializeMatrix(EmoteslangParser.InitializeMatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#initializeMatrix}.
	 * @param ctx the parse tree
	 */
	void exitInitializeMatrix(EmoteslangParser.InitializeMatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#declarationArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationArray(EmoteslangParser.DeclarationArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#declarationArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationArray(EmoteslangParser.DeclarationArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#initializeArray}.
	 * @param ctx the parse tree
	 */
	void enterInitializeArray(EmoteslangParser.InitializeArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#initializeArray}.
	 * @param ctx the parse tree
	 */
	void exitInitializeArray(EmoteslangParser.InitializeArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#matrixLine}.
	 * @param ctx the parse tree
	 */
	void enterMatrixLine(EmoteslangParser.MatrixLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#matrixLine}.
	 * @param ctx the parse tree
	 */
	void exitMatrixLine(EmoteslangParser.MatrixLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#matrixCol}.
	 * @param ctx the parse tree
	 */
	void enterMatrixCol(EmoteslangParser.MatrixColContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#matrixCol}.
	 * @param ctx the parse tree
	 */
	void exitMatrixCol(EmoteslangParser.MatrixColContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#arraySize}.
	 * @param ctx the parse tree
	 */
	void enterArraySize(EmoteslangParser.ArraySizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#arraySize}.
	 * @param ctx the parse tree
	 */
	void exitArraySize(EmoteslangParser.ArraySizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(EmoteslangParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(EmoteslangParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(EmoteslangParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(EmoteslangParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(EmoteslangParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(EmoteslangParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(EmoteslangParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(EmoteslangParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#paramArray}.
	 * @param ctx the parse tree
	 */
	void enterParamArray(EmoteslangParser.ParamArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#paramArray}.
	 * @param ctx the parse tree
	 */
	void exitParamArray(EmoteslangParser.ParamArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#paramMatrix}.
	 * @param ctx the parse tree
	 */
	void enterParamMatrix(EmoteslangParser.ParamMatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#paramMatrix}.
	 * @param ctx the parse tree
	 */
	void exitParamMatrix(EmoteslangParser.ParamMatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#inputAndOutput}.
	 * @param ctx the parse tree
	 */
	void enterInputAndOutput(EmoteslangParser.InputAndOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#inputAndOutput}.
	 * @param ctx the parse tree
	 */
	void exitInputAndOutput(EmoteslangParser.InputAndOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(EmoteslangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(EmoteslangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#parametersCall}.
	 * @param ctx the parse tree
	 */
	void enterParametersCall(EmoteslangParser.ParametersCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#parametersCall}.
	 * @param ctx the parse tree
	 */
	void exitParametersCall(EmoteslangParser.ParametersCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(EmoteslangParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(EmoteslangParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(EmoteslangParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(EmoteslangParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void enterConditionals(EmoteslangParser.ConditionalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void exitConditionals(EmoteslangParser.ConditionalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void enterIfdes(EmoteslangParser.IfdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void exitIfdes(EmoteslangParser.IfdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselse(EmoteslangParser.IfdeselseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselse(EmoteslangParser.IfdeselseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselseif(EmoteslangParser.IfdeselseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselseif(EmoteslangParser.IfdeselseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void enterWhiledes(EmoteslangParser.WhiledesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void exitWhiledes(EmoteslangParser.WhiledesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(EmoteslangParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(EmoteslangParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#fordes}.
	 * @param ctx the parse tree
	 */
	void enterFordes(EmoteslangParser.FordesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#fordes}.
	 * @param ctx the parse tree
	 */
	void exitFordes(EmoteslangParser.FordesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void enterSwitchdes(EmoteslangParser.SwitchdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void exitSwitchdes(EmoteslangParser.SwitchdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#casedes}.
	 * @param ctx the parse tree
	 */
	void enterCasedes(EmoteslangParser.CasedesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#casedes}.
	 * @param ctx the parse tree
	 */
	void exitCasedes(EmoteslangParser.CasedesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void enterDefaultdes(EmoteslangParser.DefaultdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void exitDefaultdes(EmoteslangParser.DefaultdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#breakdes}.
	 * @param ctx the parse tree
	 */
	void enterBreakdes(EmoteslangParser.BreakdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#breakdes}.
	 * @param ctx the parse tree
	 */
	void exitBreakdes(EmoteslangParser.BreakdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#returndes}.
	 * @param ctx the parse tree
	 */
	void enterReturndes(EmoteslangParser.ReturndesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#returndes}.
	 * @param ctx the parse tree
	 */
	void exitReturndes(EmoteslangParser.ReturndesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#commandList}.
	 * @param ctx the parse tree
	 */
	void enterCommandList(EmoteslangParser.CommandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#commandList}.
	 * @param ctx the parse tree
	 */
	void exitCommandList(EmoteslangParser.CommandListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#initializeFor}.
	 * @param ctx the parse tree
	 */
	void enterInitializeFor(EmoteslangParser.InitializeForContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#initializeFor}.
	 * @param ctx the parse tree
	 */
	void exitInitializeFor(EmoteslangParser.InitializeForContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#incrementFor}.
	 * @param ctx the parse tree
	 */
	void enterIncrementFor(EmoteslangParser.IncrementForContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#incrementFor}.
	 * @param ctx the parse tree
	 */
	void exitIncrementFor(EmoteslangParser.IncrementForContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(EmoteslangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(EmoteslangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(EmoteslangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(EmoteslangParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(EmoteslangParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(EmoteslangParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(EmoteslangParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(EmoteslangParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EmoteslangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EmoteslangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(EmoteslangParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(EmoteslangParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void enterOp_rel(EmoteslangParser.Op_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void exitOp_rel(EmoteslangParser.Op_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void enterOp_neg(EmoteslangParser.Op_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void exitOp_neg(EmoteslangParser.Op_negContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void enterOp_bitwise(EmoteslangParser.Op_bitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void exitOp_bitwise(EmoteslangParser.Op_bitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#op_aritmetic}.
	 * @param ctx the parse tree
	 */
	void enterOp_aritmetic(EmoteslangParser.Op_aritmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#op_aritmetic}.
	 * @param ctx the parse tree
	 */
	void exitOp_aritmetic(EmoteslangParser.Op_aritmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#op_logic}.
	 * @param ctx the parse tree
	 */
	void enterOp_logic(EmoteslangParser.Op_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#op_logic}.
	 * @param ctx the parse tree
	 */
	void exitOp_logic(EmoteslangParser.Op_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#un_op}.
	 * @param ctx the parse tree
	 */
	void enterUn_op(EmoteslangParser.Un_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#un_op}.
	 * @param ctx the parse tree
	 */
	void exitUn_op(EmoteslangParser.Un_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(EmoteslangParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(EmoteslangParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#typeWithVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeWithVoid(EmoteslangParser.TypeWithVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#typeWithVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeWithVoid(EmoteslangParser.TypeWithVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EmoteslangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EmoteslangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmoteslangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(EmoteslangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteslangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(EmoteslangParser.ExpressionListContext ctx);
}