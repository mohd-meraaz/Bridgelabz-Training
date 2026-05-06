package com.junit.testingexceptionhandling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TestExceptionHandling {
	//Create a method divide(int a, int b) that throws an ArithmeticException if b is zero
	public int divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("Can't divide by zero");
		}
		return a/b;
	}
	
	
	@Test
	void testDivide() {
		try {
			assertEquals(10,divide(100, 0));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
