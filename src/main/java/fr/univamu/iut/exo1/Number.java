package fr.univamu.iut.exo1;

public class Number extends Expression {
	public static final int DEFAULT_NUMBER_VALUE = 1;
	
	private int value;
	
	public Number() {
		this(DEFAULT_NUMBER_VALUE);
	}
	
	public Number(int value) {
		this.value = value;
	}
	
	@Override
	public double evaluate() {
		return value;
	}
	
	/* GETTER / SETTER */
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
