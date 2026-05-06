package com.stringandsorting.stringbuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConcatenateString {
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String 1 : ");
		String s1 = read.readLine();
		System.out.print("Enter String 2 : ");
		String s2 = read.readLine();
		
		StringBuffer str = new StringBuffer(s1);
		str.append(s2);
		
		System.out.println(str.toString());
		
	}

}
