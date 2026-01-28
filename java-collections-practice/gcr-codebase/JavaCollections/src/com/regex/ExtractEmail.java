package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
	public static void main(String[] args) {
		String text = "Contact us at support@example.com and info@company.org";
		
		String regex = "[a-zA-Z0-9._+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

		Pattern pattern = Pattern.compile(regex);
				
		Matcher match = pattern.matcher(text);
		
		boolean found = false;
		while(match.find()) {
			System.out.println("Email found: "+match.group());
			found = true;
		}
		
		if(!found) {
			System.out.println("Not found email");
		}
	}
}
