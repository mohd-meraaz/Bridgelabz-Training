package com.regex;

import java.util.ArrayList;

public class CensorBadWords {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("damn");
		list.add("stupid");
		
		
		String text = "This is a damn bad example with some stupid words.";
		
		System.out.println("Old text: "+text);
		
		for(String l : list) {
			text = text.replaceAll("\\b"+l+"\\b", "*****");
		}
		
		System.out.println("New Text: "+text);
	}
}
