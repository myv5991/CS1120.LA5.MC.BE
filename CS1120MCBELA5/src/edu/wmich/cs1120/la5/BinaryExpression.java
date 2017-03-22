package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression{
	private IExpression left;
	private IExpression right;
	private IOperation op;
	
	public Integer getValue(){
		return getOp().perform(left, right);
	}
	
	public IOperation getOp(){
		return op;
	}
	
	public void setOp(IOperation op){
		this.op = op;
	}
	
	public IExpression getLeft(){
		return left;
	}
	
	public void setLeft(IExpression left){
		this.left = left;
	}
	
	public void setRight(IExpression right){
		this.right = right;
	}
	
	public IExpression getRight(){
		return right;
	}
	
	public BinaryExpression(IOperation op, IExpression left, IExpression right){
		setLeft(left);
		setRight(right);
		setOp(op);
	}
	
	
}
