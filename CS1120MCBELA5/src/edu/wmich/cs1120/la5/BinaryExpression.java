package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression{
	private IExpression left;
	private IExpression right;
	private IOperation op;
	
	/**
	 * runs the two objects through the perform method and gets the value
	 */
	public Integer getValue(){
		return getOp().perform(left, right);
	}
	/**
	 * a get operator for op
	 * @return returns operation object
	 */
	public IOperation getOp(){
		return op;
	}
	/**
	 * a setter for op object
	 * @param op
	 */
	public void setOp(IOperation op){
		this.op = op;
	}
	/**
	 * a getter for the left expression object
	 * @return left expression object.
	 */
	public IExpression getLeft(){
		return left;
	}
	/**
	 * setter for left expression object.
	 * @param left expression object.
	 */
	public void setLeft(IExpression left){
		this.left = left;
	}
	/**
	 * setter for right expression object
	 * @param right expression object.
	 */
	public void setRight(IExpression right){
		this.right = right;
	}
	/**
	 * getter for right expression object
	 * @return right expression object.
	 */
	public IExpression getRight(){
		return right;
	}
	
	/**
	 * sets up the input conditions for the class
	 * @param op
	 * @param left
	 * @param right
	 */
	public BinaryExpression(IOperation op, IExpression left, IExpression right){
		setLeft(left);
		setRight(right);
		setOp(op);
	}
	
	
}
