package com.csv_data_handling.searchcsv;

import java.io.*;

public class SearchCSV {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("DataFiles/employee.csv")));
			
			String searchName = "Allu";
			
			String line = reader.readLine();
			while((line=reader.readLine())!=null) {
				String data[] = line.split(",");
				if(data[1].trim().equalsIgnoreCase(searchName)) {
					System.out.println("-----------------------");
					System.out.println("Department: "+data[2]);
					System.out.println("Salary: "+data[3]);
					System.out.println("-----------------------");
				}
				System.out.println("Not matched!");
			}
			reader.close();			
		}
		catch(IOException e) {
			System.out.println(""+e.getMessage());
		}
	}
}
