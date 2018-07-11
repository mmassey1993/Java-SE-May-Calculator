package com.qa.calculator;

public class Calculator {

	public double add(int num1, int num2) {
		Add adder = new Add();
		return adder.editNumbers(num1, num2);
	}

	public double subtract(int num1, int num2) {
		Subtract subtracter = new Subtract();
		return subtracter.editNumbers(num1, num2);
	}

	public double multiply(int num1, int num2) {
		Multiply multiplier = new Multiply();
		return multiplier.editNumbers(num1, num2);
	}

	public double divide(int num1, int num2) {
		Divide divider = new Divide();
		return divider.editNumbers(num1, num2);
	}

}
