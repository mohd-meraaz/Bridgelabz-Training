package com.junit.testingparameterizedtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	public boolean isEven(int n) {
		return n%2==0;
	}
	
	@ParameterizedTest
	@ValueSource(ints = {12,32,4,24,2,112,332})
	
	void check(int n) {
		assertTrue(isEven(n));
	}
}
