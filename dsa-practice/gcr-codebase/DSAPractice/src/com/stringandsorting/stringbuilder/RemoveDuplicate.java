package com.stringandsorting.stringbuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveDuplicate {
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String s = read.readLine();
		StringBuilder str = new StringBuilder();
		
		for(char ch: s.toCharArray()) {
			if(!str.toString().contains(""+ch)){
				str.append(ch);
			}
		}
		System.out.println("String After Removing Duplicates "+str.toString());
	}

}
