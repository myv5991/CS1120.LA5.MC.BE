package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	/**
	 * in the expression factory it gets inputs from the dat file and determines if it will be a 
	 * addition object or a subtraction object as well as sets up the left and right
	 * expression objexts
	 * @param op operation char
	 * @param val1 left int
	 * @param val2 right int
	 * @return returns expression containing the objects.
	 */
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
