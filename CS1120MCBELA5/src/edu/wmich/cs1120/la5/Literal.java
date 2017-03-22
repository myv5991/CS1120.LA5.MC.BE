package edu.wmich.cs1120.la5;

public class Literal implements IExpression{
	private int val;
	
	public Integer getValue(){
		return val;
	}
	
	public void setValue(int val){
		this.val = val;
	}
	public Literal(int val){
		setValue(val);
	}
}
