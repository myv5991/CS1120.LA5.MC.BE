package edu.wmich.cs1120.la5;

public class Literal implements IExpression{
	int val;
	public Integer getValue(){
		return this.val;
	}
	
	public Literal(int val){
		this.val = val;
	}
}
