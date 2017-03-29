package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation{

	@Override
	/**
	 * gets in the left and right integer numbers that are in the expression objects subtracts them and returns the value.
	 */
	public Integer perform(IExpression left, IExpression right) {

		int value = 0;
		
		value = left.getValue() - right.getValue();

		return value;

	}

}

