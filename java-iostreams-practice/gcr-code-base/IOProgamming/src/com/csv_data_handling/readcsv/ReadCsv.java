package com.csv_data_handling.readcsv;

import java.io.*;

public class ReadCsv {
	public static void main(String[] args) {
		try {
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream("DataFiles/student.csv")));
			String line = bufferReader.readLine();
			while((line=bufferReader.readLine())!=null) {
				String data[] = line.split(",");
				System.out.println("-----------------------");
				System.out.println("ID : "+data[0]);
				System.out.println("NAME : "+data[1]);
				System.out.println("AGE : "+data[2]);
				System.out.println("SCORE : "+data[3]);
				System.out.println("-----------------------");
				bufferReader.close();
			}
			
		}
		catch(IOException e) {
			System.out.println(""+e.getMessage());
		}
	}
}
