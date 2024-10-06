package com.nt.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.nt.calculate.Calculator;

public class CalculatorTest {
	@Test
	public void testadd() {
		Calculator cal = new Calculator();
		int actualResult = cal.add(20, 40);
		int expectedResult = 60;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void multi() {
		Calculator cal = new Calculator();
		int actualResult = cal.multipucation(4,40);
		int expectedResult = 16;
		assertNotEquals(actualResult, expectedResult);
	}
}
