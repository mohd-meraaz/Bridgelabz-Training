package com.stringandsorting.stringbuilder;
import java.io.BufferedReader;
import java.io.FileReader;

public class CountOccurrence {
	public static void main(String[] args) throws Exception{
    	BufferedReader read = new BufferedReader(new FileReader("src/com/stringandsorting/stringbuilder/TestFile.txt"));
    	int [] arr = new int[266];
    	
        String line;
        
        while((line= read.readLine())!=null) {
        	for(char ch: line.toCharArray()) {
        		arr[ch] +=1;
        	}
        }
        
    	for(int i =0;i<arr.length;i++) {
    		if(arr[i]!=0) {
    			char ch = (char)i;
    		System.out.println("The character "+ch+" : "+arr[i] + " times.");
    		}
    	}
    }
}
