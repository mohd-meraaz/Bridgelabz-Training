package com.stringandsorting.stringbuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CompareStringBufferAndStringBuilder {
	public static void main(String[] args) throws Exception{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string : ");
		String s = read.readLine();
		StringBuilder str = new StringBuilder();
		
		long t1 = System.nanoTime();
		for(char ch : s.toCharArray()) {
			str.append(ch);
		}
		long t2 = System.nanoTime();
		long stringbuilder = t2-t1;
		
		StringBuffer strbuffer = new StringBuffer();
		t1 = System.nanoTime();
		for(char ch : s.toCharArray()) {
			strbuffer.append(ch);
		}
		 t2 = System.nanoTime();
		 long stringbuffer = t2-t1;
		  
		 if(stringbuffer>stringbuilder) {
			 System.out.println("String buffer takes more time");
		 }else {
			 System.out.println("String Builder take more time");
		 }
	}

}
