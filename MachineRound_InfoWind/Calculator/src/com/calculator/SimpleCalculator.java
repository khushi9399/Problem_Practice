package com.calculator;

public class SimpleCalculator implements Calculator{
     
	public double add(double a, double b) {
		return a+b;
	}
	
	public double add(double a, double b, double c) {
		return a+b+c;
	}
	
	public double subtract(double a, double b) {
		return a-b;
	}
	
	public double multiply(double a, double b) {
		return a*b;
	}
	
	public double divide(double a, double b) {
		if(b == 0)
			throw new ArithmeticException("Division by zero is not allowed!");
		return a/b;
	}
}
