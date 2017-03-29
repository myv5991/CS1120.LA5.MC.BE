package edu.wmich.cs1120.la5;


public class Addition implements IOperation{
/**
 * gets in the left and right integer numbers that are in the expression objects adds them togeather and returns the value.
 */
	@Override
	public Integer perform(IExpression left, IExpression right) {

		int value = 0;
		
		value = left.getValue() + right.getValue();

		return value;

	}

}
