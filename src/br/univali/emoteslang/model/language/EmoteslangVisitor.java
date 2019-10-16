// Generated from .\Emoteslang.g4 by ANTLR 4.7.2
package br.univali.emoteslang.model.language;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EmoteslangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EmoteslangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EmoteslangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(EmoteslangParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(EmoteslangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#declarationVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationVar(EmoteslangParser.DeclarationVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#declarationMatrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationMatrix(EmoteslangParser.DeclarationMatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#initializeMatrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeMatrix(EmoteslangParser.InitializeMatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#declarationArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationArray(EmoteslangParser.DeclarationArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#initializeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeArray(EmoteslangParser.InitializeArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#matrixLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixLine(EmoteslangParser.MatrixLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#matrixCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixCol(EmoteslangParser.MatrixColContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#arraySize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySize(EmoteslangParser.ArraySizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(EmoteslangParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(EmoteslangParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(EmoteslangParser.ParametersListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(EmoteslangParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#paramArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArray(EmoteslangParser.ParamArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#paramMatrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamMatrix(EmoteslangParser.ParamMatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#inputAndOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputAndOutput(EmoteslangParser.InputAndOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#parametersCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersCall(EmoteslangParser.ParametersCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(EmoteslangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(EmoteslangParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(EmoteslangParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#conditionals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionals(EmoteslangParser.ConditionalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#ifdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdes(EmoteslangParser.IfdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#ifdeselse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdeselse(EmoteslangParser.IfdeselseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#ifdeselseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdeselseif(EmoteslangParser.IfdeselseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#whiledes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledes(EmoteslangParser.WhiledesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#doWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(EmoteslangParser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#fordes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFordes(EmoteslangParser.FordesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#switchdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchdes(EmoteslangParser.SwitchdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#casedes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasedes(EmoteslangParser.CasedesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#defaultdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultdes(EmoteslangParser.DefaultdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#breakdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakdes(EmoteslangParser.BreakdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#returndes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturndes(EmoteslangParser.ReturndesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#commandList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandList(EmoteslangParser.CommandListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#initializeFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeFor(EmoteslangParser.InitializeForContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#incrementFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementFor(EmoteslangParser.IncrementForContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(EmoteslangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(EmoteslangParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(EmoteslangParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution(EmoteslangParser.AttributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EmoteslangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(EmoteslangParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#typeWithVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeWithVoid(EmoteslangParser.TypeWithVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(EmoteslangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmoteslangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(EmoteslangParser.ExpressionListContext ctx);
}