package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
	public static void main(String[] args) {
		String regex = "https?://(www\\.)?([a-zA-Z0-9.-]+)";
		
		Pattern pattern = Pattern.compile(regex);
		
		String text = "Visit https://www.google.com and http://example.org for more info like https://www.hotmail.com";
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
