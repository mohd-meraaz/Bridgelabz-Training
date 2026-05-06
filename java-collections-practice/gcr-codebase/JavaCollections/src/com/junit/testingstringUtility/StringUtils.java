package com.junit.testingstringUtility;

public class StringUtils {
	
//	reverse(String str): Returns the reverse of a given string.
	public String reverse (String str) {
		StringBuilder reversedString = new StringBuilder(str);
		reversedString.reverse();
		return reversedString.toString();
	}
	
	
//	isPalindrome(String str): Returns true if the string is a palindrome.
	public Boolean isPalindrome(String str) {
		if(str.equals(reverse(str))) return true;
		return false;
	}
	
//	toUpperCase(String str): Converts a string to uppercase.
	public String toUpperCase(String str) {
		
		return str.toUpperCase();
	}

}
