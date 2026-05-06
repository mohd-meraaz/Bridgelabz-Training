package com.csv_data_handling.convertcsvtoobject;

import java.io.*;
import java.util.*;

public class CsvToObject {
static List<Student> list = new ArrayList<>();
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("DataFiles/student.csv")));
			String line = reader.readLine();
			while((line=reader.readLine())!=null) {
				String data[] = line.split(",");
				int id = Integer.parseInt(data[0].trim());
				String name = data[1];
				int age = Integer.parseInt(data[2].trim());
				double score = Double.parseDouble(data[3].trim());
				
				Student s = new Student(id,name,age,score);
				list.add(s);				
			}
			reader.close();
		}
		catch(IOException e) {
			System.out.println(""+e.getMessage());
		}
		
		show();
	}
	
	//print data
	public static void show() {
		for(Student s : list) {
			System.out.println(s.toString());
		}
	}
}
