package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	public IExpression getExpression(char op, int val1, int val2){
		IExpression expression = new BinaryExpression(op, val1, val2);
		return expression;
	}
}
