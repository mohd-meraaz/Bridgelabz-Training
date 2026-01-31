package com.csv_data_handling.mergecsv;

import java.io.*;

public class MergeCSV {
	public static void main(String[] args) {
		try {
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream("DataFiles/student1.csv")));
			BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream("DataFiles/student2.csv")));

			BufferedWriter result = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("DataFiles/mergestudent.csv")));
			
			String line = reader1.readLine();
			result.write(line);
			result.newLine();
			
			while((line=reader1.readLine())!=null) {
				result.write(line);
				result.newLine();
			}
			
			line = reader2.readLine();
			while((line=reader2.readLine())!=null) {
				result.write(line);
				result.newLine();
			}
			
			reader1.close();
			reader2.close();
			result.close();
		}
		catch(IOException e) {
			System.out.println(""+e.getMessage());
		}
	}
}
