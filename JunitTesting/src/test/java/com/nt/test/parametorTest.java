package com.nt.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.nt.calculate.Palandrom;

public class parametorTest {

	@ParameterizedTest
	@ValueSource(strings = {"racecar","liril","madam","5"})
	public void isPaladram(String str) {
		//creating torget class object
		Palandrom ob = new Palandrom();
		//colling torget class methos
		boolean actual = ob.isPalandrom(str);
		//verifieng result
      assertTrue(actual);
	}
}
