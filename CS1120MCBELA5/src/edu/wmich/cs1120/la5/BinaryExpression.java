package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression{
	private IExpression left;
	private IExpression right;
	private char op;
	
	public Integer getValue(){
		return 1;
	}
	
	public char getOp(){
		return this.op;
	}
	
	public void setOp(char op){
		this.op = op;
	}
	public BinaryExpression(char op, int val1, int val2){
		setOp(op);
	}
}
