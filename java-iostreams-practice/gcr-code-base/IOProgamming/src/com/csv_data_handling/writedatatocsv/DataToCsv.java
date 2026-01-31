package com.csv_data_handling.writedatatocsv;

import java.io.*;
public class DataToCsv {
	public static void main(String[] args) {
		try {
			BufferedWriter w= new BufferedWriter(new OutputStreamWriter(new FileOutputStream("DataFiles/deprartment.csv")));
			w.write("ID, Name, Department, Salary");
			w.newLine();
			
			w.write("101, Titu, IT, 20000");
			w.newLine();
			
			w.write("102, Lucky, HR, 400000");
			w.newLine();
			
			w.write("103, Arvind, Hardware, 56444");
			w.newLine();
			System.out.println("Data Added.");
			w.close();
		}
		catch(IOException e) {
			System.out.println(""+e.getMessage());
		}
	}
}
