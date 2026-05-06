package com.csv_data_handling.sortcsv;

import java.io.*;

public class SortCSV {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("DataFiles/student.csv")));
			String line = reader.readLine();
			while((line=reader.readLine())!=null) {
				String data[] = line.split(",");
				System.out.println("-----------------------");
				System.out.println("Id: "+data[0]);
				System.out.println("Name: "+data[1]);
				System.out.println("Age: "+data[2]);
				System.out.println("Score: "+data[3]);
				System.out.println("-----------------------");
				reader.close();
			}
			
		}
		catch(IOException e) {
			System.out.println(""+e.getMessage());
		}	
	}
}
