package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	public IExpression getExpression(char op, int val1, int val2){
		
		IOperation opVar = null;
		
		if(op == '+'){
			opVar = new Addition();
		}
		else if(op == '-'){
			opVar = new Subtraction();
		}
		
		IExpression left = new Literal(val1);
		IExpression right = new Literal(val2);
		
		IExpression expression = new BinaryExpression(opVar, left, right);
		return expression;
	}
}
