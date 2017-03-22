package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression{
	private int val1;
	private int val2;
	private char op;
	
	public Integer getValue(){
		if(getOp() == '+')
			return getVal1() + getVal2();
		
		else if (getOp() == '-')
			return getVal1() - getVal2();
		
		else
			return 0;
		
	}

	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}
	
	public char getOp(){
		return this.op;
	}
	
	public void setOp(char op){
		this.op = op;
	}
	public BinaryExpression(char op, int val1, int val2){
		setOp(op);
		setVal1(val1);
		setVal2(val2);
	}
}
