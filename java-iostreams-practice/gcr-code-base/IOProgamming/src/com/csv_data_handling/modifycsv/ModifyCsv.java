package com.csv_data_handling.modifycsv;

import java.io.*;

public class ModifyCsv {
	public static void main(String[] args) {
		try {
			File inputFile = new File("DataFiles/employee.csv");
			File tempFile = new File("DataFiles/temp.csv");
			
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
			
			
			String line = reader.readLine();
			writer.write(line);
			writer.newLine();
			
			while((line=reader.readLine())!=null) {
				String data[] = line.split(",");
				if(data[2].trim().equalsIgnoreCase("IT")) {
					int salary = Integer.parseInt(data[3].trim());
					int newSalary =(int) ((int) salary+(salary*0.10));
					data[3] = String.valueOf(newSalary);
				}
				line = String.join(",", data);
				writer.write(line);
				writer.newLine();
			}
			
			reader.close();
			writer.close();
			
			inputFile.delete();
			tempFile.renameTo(inputFile);
			
			System.out.println("Salary updated Success.");
		}
		catch(IOException e) {
			System.out.println(""+e.getMessage());
		}
	}
}
