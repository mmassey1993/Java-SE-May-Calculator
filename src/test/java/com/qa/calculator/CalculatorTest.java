package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	
	Calculator calc;
	double result;
	
	@Before
	public void setup() {
		calc = new Calculator();
	}

	@Test
	public void test() {
		result = calc.add(7, 10);
		Assert.assertEquals(17, result, 0.001);
	}
	
	@Test
	public void testSubtract() {
		result = calc.subtract(12,4);
		Assert.assertEquals(8, result, 0.001);
	}
	
	@Test
	public void testMultiply() {
		result = calc.multiply(3,6);
		Assert.assertEquals(18, result, 0.001);
	}
	
	@Test
	public void testDivide() {
		double result2 = calc.divide(70,7);
		Assert.assertEquals(10.00, result2, 0.0001);
	}

}
