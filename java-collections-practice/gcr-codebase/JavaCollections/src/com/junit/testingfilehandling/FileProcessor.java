package com.junit.testingfilehandling;
import java.io.*;
public class FileProcessor {
	public boolean writeToFile(String filename, String content) throws IOException{
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("textFiles/"+filename)));
		
		write.write(content);
		write.close();
		System.out.println("Content added Done.");
		
		return true;
	}
	
	public boolean readFromFile(String filename) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("textFiles/"+filename)));
		
		String message = read.readLine();
		System.out.println("Content reading..");
		System.out.println(message);
		read.close();
		
		return true;
	}
}
