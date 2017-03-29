package edu.wmich.cs1120.la5;

public class Literal implements IExpression{
	private int val;
	
	/**
	 * getter for value
	 */
	public Integer getValue(){
		return val;
	}
	/**
	 * setter for value
	 * @param val value integer
	 */
	public void setValue(int val){
		this.val = val;
	}
	/**
	 * also sets value by calling the setter
	 * @param val value integer
	 */
	public Literal(int val){
		setValue(val);
	}
}
