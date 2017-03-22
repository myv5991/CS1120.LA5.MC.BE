package edu.wmich.cs1120.la5;

public class Addition implements IOperation{

	@Override
	public Integer perform(IExpression left, IExpression right) {

		int value = 0;
		
		value = left.getValue() + right.getValue();

		return value;

	}

}
