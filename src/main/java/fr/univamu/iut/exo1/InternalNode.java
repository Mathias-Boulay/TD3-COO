package fr.univamu.iut.exo1;

public class InternalNode extends Expression {
	public static final char OPERATOR_ADD = '+';
	public static final char OPERATOR_MINUS = '-';
	public static final char OPERATOR_MULTIPLY = '*';
	public static final char OPERATOR_DIVIDE = '/';
	
	private char operator;

	private Expression firstExp;
	private Expression secondExp;
	

	public InternalNode() {
		// TODO fill default values ?
	}
	
	public InternalNode(char operator, Expression firstExpression, Expression secondExpression) {
		this.operator = operator;
		firstExp = firstExpression;
		secondExp = secondExpression;
	}
	
	@Override
	public double evaluate() {
		double a = firstExp.evaluate();
		double b = secondExp.evaluate();
		
		if(operator == OPERATOR_ADD) return a + b;
		if(operator == OPERATOR_MINUS) return a - b;
		if(operator == OPERATOR_MULTIPLY) return a * b;
		if(operator == OPERATOR_DIVIDE) return a / b;
		
		// TODO Throw an Exception ?
		return 0;
	}
	
	/* GETTER / SETTER */
	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public Expression getFirstExp() {
		return firstExp;
	}

	public void setFirstExp(Expression firstExp) {
		this.firstExp = firstExp;
	}

	public Expression getSecondExp() {
		return secondExp;
	}

	public void setSecondExp(Expression secondExp) {
		this.secondExp = secondExp;
	}
}
