package com.qa.calculator;

public class Calculator {

	public int add(int num1, int num2) {
		Add adder = new Add();
		return adder.add(num1, num2);
	}

	public int subtract(int num1, int num2) {
		Subtract subtracter = new Subtract();
		return subtracter.subtract(num1, num2);
	}

	public int multiply(int num1, int num2) {
		Multiply multiplier = new Multiply();
		return multiplier.multiply(num1, num2);
	}

	public double divide(int num1, int num2) {
		Divide divider = new Divide();
		return (double)divider.divide(num1, num2);
	}

}
