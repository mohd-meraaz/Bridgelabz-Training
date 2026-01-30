package com.junit.testingstringUtility;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringTest {
	
	@Test
	void testReverse() {
		StringUtils su = new StringUtils();
		String str = "SIHT";
		assertEquals("THIS",su.reverse(str));
	}
	
	@Test
	void testPalindrome() {
		StringUtils su = new StringUtils();
		String str = "SIHT";
		assertEquals(false ,su.isPalindrome(str));
	}
	
	@Test
	void testUpper() {
		StringUtils su = new StringUtils();
		String str = "hello";
		assertEquals("HELLO" ,su.toUpperCase(str));
	}
	

}
