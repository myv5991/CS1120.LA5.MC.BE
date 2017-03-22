<<<<<<< HEAD
=======
package edu.wmich.cs1120.la5;

public class Addition implements IOperation{

	@Override
	public Integer perform(IExpression left, IExpression right) {

		int value = 0;
		
		value = left.getValue() + right.getValue();

		return value;
	}

}
>>>>>>> branch 'master' of https://github.com/myv5991/CS1120.LA5.MC.BE
